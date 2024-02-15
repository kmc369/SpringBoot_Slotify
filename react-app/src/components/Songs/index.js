import './songs.css'
import React, { useEffect,useState } from 'react';
import { useDispatch,useSelector } from "react-redux";
import * as songActions from '../../store/landing'



export default function Songs(){

    const dispatch = useDispatch()
    let [songs,setSongs]=useState([])

    useEffect(()=>{
        let songlist;
        async function fetchSongs(){
            try{

                songlist = await dispatch(songActions.getSongsOfAlbum(1))
            }catch{

            }
        }

        fetchSongs()
    })

    return (
        <><h1>hello from Songs</h1></>
    )
}