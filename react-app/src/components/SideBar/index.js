import './SideBar.css'
import React, { useEffect,useState } from 'react';

export default function SideBar(){




    return (
    <>
    <div className='SideBar-Container'>
            <div className='Home-Container'>
                <div className='music-container'><i class="fa-solid fa-music" style={{ color: "white" }}><span style={{color: "rgb(33, 197, 33)",paddingLeft: 10}} className="sidebar-words">Slotify</span></i></div>
                <div className='house-container'><i class="fa-solid fa-house" style={{color: "#ffffff"}}><span className="sidebar-words" style={{paddingLeft: 10}}>Home</span></i></div>

            </div>

            <div className='Playlist-container'>
            <div className='library-container'><i class="fa-solid fa-book" style={{color: "#ffffff"}}><span  className="sidebar-words" style={{paddingLeft: 10}}>Library</span></i></div>
            <div className='album-playlist'>
                <button className='playlist-button'>playlist</button>
            </div>

            </div>
     </div>
    
    </>
    )
}