package org.academiadecodigo.whiledlings.gameproject.scenarios;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Scenario {

    private Picture picture;
    public final static int CELL_SIZE = 10;

    public Scenario(ScenarioType scenarioType){
        picture = new Picture(10, 10, path(scenarioType));
        picture.draw();

    }

    public int getX(){
        return picture.getX();
    }

    public int getY(){
        return picture.getY();
    }

    public int getCellSize(){
        return CELL_SIZE;
    }

    private String path(ScenarioType scenario){

        String path = null;

        switch (scenario){
            case BEDROOM:
                path = "./images/scenario/bedroom.png";
                break;
            case LIVING_ROOM:
                path = "./images/scenario/livingroom.png";
                break;
            case GARDEN:
                path = "./images/scenario/garden.png";
                break;
            case CAR_CRASH:
                path = "./images/scenario/carcrash.png";
                break;
            case BONJOIA_STREET:
                path = "./images/scenario/bonjoiastreet.png";
                break;
            case BONJOIA_ENTRANCE:
                path = "./images/scenario/bonjoiaentrance.png";
                break;
            case BONJOIA_FARM:
                path = "./images/scenario/quinta.jpg";
                break;
            case ACADEMY_ENTRANCE:
                path = "./images/scenario/entrada.jpg";
                break;
            case FIRST_FLOOR:
                path = "./images/scenario/first floor.jpg";
                break;
            case MAC_ROOM:
                path = "./images/scenario/macroom.jpg";
                break;
            case SECOND_FLOOR:
                path = "./images/scenario/secondloofr.jpg";
                break;

        }

        return path;
    }



}
