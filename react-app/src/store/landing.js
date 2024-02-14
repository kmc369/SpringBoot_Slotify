const GET_ALBUMS = 'get/albums'
const GET_SONGS = 'get/songs'


//actions
export const getAlbums=(data)=>{

    return {
        type:GET_MOVIES,
        payload:data

    }
}

export const getSongs=(data)=>{

    return {
        type:GET_MOVIES,
        payload:data

    }
}





//thunks 
export const getAlbumsThunk= () => async(dispatch,getState) => {
   console.log("we in thunk")
    try{
        const res = await fetch('/albums/',{
            method:"GET"
        })

        if(res.ok){
            const data = await res.json()
            dispatch(getAlbums(data))
            return data
        }
        else{
        
            const error = await res.json()
            return error 
        }


    }catch(error){
      

    }

}


export const getSongsOfAlbum= (album_id) => async(dispatch,getState) => {
  
     try{
         const res = await fetch(`/albums/songs/${album_id}`,{
             method:"GET"
         })
 
         if(res.ok){
             const data = await res.json()
             dispatch(ggetSongs(data))
             return data
         }
         else{
         
             const error = await res.json()
             return error 
         }
 
 
     }catch(error){
       
 
     }
 
 }
 



//reducer

const initial_state = {allMovies:{}, singleMovie:{}}

const Reducer = (state = initial_state,action) =>{
    switch(action.type){
        case GET_ALBUMS :{
           
            const newState = {...state , allMovies:{...state.allMovies}}

            newState.allMovies = action.payload

            return newState

        }
        case GET_SONGS :{
           
            const newState = {...state , allMovies:{...state.allMovies}}

            newState.allMovies = action.payload

            return newState

        }

        default:
            return state
    }






}

export default Reducer