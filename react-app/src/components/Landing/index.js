import './landingPage.css'
import React, { useEffect,useState } from 'react';
import { useDispatch,useSelector } from "react-redux";
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';
import * as songActions from '../../store/landing'
import SideBar from '../SideBar'
export default function Landing(){
const dispatch = useDispatch()
let [movies,setMovies] = useState([])
const history = useHistory()
useEffect(() => {
    let movieList;
    async function fetchMovies() {
      try {
      

       movieList = await dispatch(songActions.getAlbumsThunk());
       setMovies(movieList)
       
      } catch (error) {
        console.error('Error fetching movies:', error);
      }
    }
  
    fetchMovies();


  }, [dispatch]);


  if (!movies){
    return null
  }



    return(
        <>
        <div className='landing-container'>
            <div className='sidebar-container'>
            <SideBar/>

            </div>
          
            <div className='movielist-container'>
              
              {movies.map((item,index)=>(
                <div className='movie-item'>
                    <img onClick={()=>history.push(`/albums/songs/${item.id}`)} src = {item.image} width={200} height={200} style={{ borderRadius: '3px' }}/>
                    <p className='album-name' key={index}>{item.name}</p>
                </div>

              ))}

            </div>
          </div>
        </>
    )
}


