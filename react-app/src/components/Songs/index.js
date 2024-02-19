import './songs.css'
import React, { useEffect,useState } from 'react';
import { useDispatch,useSelector } from "react-redux";
import * as songActions from '../../store/landing'
import SideBar from '../SideBar';


export default function Songs(){

    const dispatch = useDispatch()
    let [songs,setSongs]=useState([])

    useEffect(()=>{
        let songlist;
        async function fetchSongs(){
            try{

                songlist = await dispatch(songActions.getSongsOfAlbum(1))
                setSongs(songlist)
            }catch{

            }
        }

        fetchSongs()
    },[setSongs,dispatch])

    return (
        <>

        <div className='songs-container'>
            <div>
                <SideBar/>
            </div>

            <div>
                {songs.map((song,index)=>(
                    <div className='song-container'>
                        <p key={index}>{song.name}</p>


                    </div>
                
                   
                ))}

            </div>


        </div>
        
        
        </>
       
    )
}