import './SideBar.css'
import React, { useEffect,useState } from 'react';

export default function SideBar(){




    return (
    <>
    <div className='SideBar-Container'>
            <div className='Home-Container'>
                <div><i class="fa-solid fa-music" style={{ color: "white" }}><span style={{color: "rgb(33, 197, 33)",paddingLeft: 10}} className="sidebar-words">Slotify</span></i></div>
                <div><i class="fa-solid fa-house" style={{color: "#ffffff"}}><span className="sidebar-words" style={{paddingLeft: 10}}>Home</span></i></div>

            </div>

            <div className='Playlist-container'>
                <h1>Library</h1>


            </div>
     </div>
    
    </>
    )
}