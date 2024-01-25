import './landingPage.css'
import React, { useEffect,useState } from 'react';
import { useDispatch,useSelector } from "react-redux";
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';
import * as movieActions from '../../store/landing'

export default function Landing(){
const dispatch = useDispatch()
let [movies,setMovies] = useState([])

useEffect(() => {
    async function fetchMovies() {
      try {
        // Assuming getMoviesThunk returns a promise
        await dispatch(movieActions.getMoviesThunk());
      } catch (error) {
        console.error('Error fetching movies:', error);
      }
    }

    fetchMovies();
  }, [dispatch]);


    return(
        <>
            <h1>list of movies are</h1>
        </>
    )
}

