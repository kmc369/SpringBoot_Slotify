const GET_ALBUMS = 'get/albums'
const GET_SONGS = 'get/songs'


//actions
export const getAlbums=(data)=>{

    return {
        type:GET_ALBUMS,
        payload:data

    }
}

export const getSongs=(data)=>{

    return {
        type:GET_SONGS,
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


export const getSongsOfAlbum = (album_id) => async(dispatch,getState) => {
  
     try{
         const res = await fetch(`/albums/songs/${album_id}`,{
             method:"GET"
         })
 
         if(res.ok){
             const data = await res.json()
             dispatch(getSongs(data))
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

const initial_state = {allAlbums:{}, singleAlbum:{}}

const Reducer = (state = initial_state,action) =>{
    switch(action.type){
        case GET_ALBUMS :{
           
            const newState = {...state , allAlbumss:{...state.allAlbums}}

            newState.allAlbums = action.payload

            return newState

        }
        case GET_SONGS :{
           
            const newState = {...state , singleAlbum:{...state.singleAlbum}}

            newState.singleAlbum = action.payload

            return newState

        }

        default:
            return state
    }






}

export default Reducer