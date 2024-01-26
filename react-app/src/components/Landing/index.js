import './landingPage.css'
import React, { useEffect,useState } from 'react';
import { useDispatch,useSelector } from "react-redux";
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';
import * as movieActions from '../../store/landing'

export default function Landing(){
const dispatch = useDispatch()
let [movies,setMovies] = useState([])

useEffect(() => {
    let movieList;
    async function fetchMovies() {
      try {
       
       movieList = await dispatch(movieActions.getMoviesThunk());
       setMovies(movieList)
       
      } catch (error) {
        console.error('Error fetching movies:', error);
      }
    }
  
    fetchMovies();


  }, [dispatch]);


  if (movies.length===0){
    return null
  }



    return(
        <>

        
           <div className='movielist-container'>
            
            {movies.map((item,index)=>(
              <div className='movie-item'>
                  <img  src = {item.image} width={200} height={200}/>
                  <p key={index}>{item.name}</p>
               </div>

            ))}

           </div>
        </>
    )
}


