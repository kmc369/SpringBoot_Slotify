const GET_MOVIES = 'get/movies'



//actions
export const get_movies=(data)=>{

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
            dispatch(get_movies(data))
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
        case GET_MOVIES :{
           
            const newState = {...state , allMovies:{...state.allMovies}}

            newState.allMovies = action.payload

            return newState

        }

        default:
            return state
    }






}

export default Reducer