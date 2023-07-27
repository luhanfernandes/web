import React from 'react';

export const AppFooter = (props) => {

    return (
        <div className="layout-footer">
            <img src={props.layoutColorMode === 'light' ? 'assets/layout/images/adidas_logo.jpg' : 'assets/layout/images/adidas_logo.jpg'} alt="Logo" height="20" className="mr-2" />
            
            <span className="font-medium ml-2">Impossível não é nada</span>
        </div>
    );
}
