
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andreeagavris
 */
public class Locations {

    private BufferedImage North, South, East, West;
    private String Image;
    private String location;
    
    public Locations(BufferedImage North, BufferedImage South, BufferedImage East, BufferedImage West, String Image) {
        this.North = North;
        this.South = South;
        this.East = East;
        this.West = West;
        this.Image = Image;
    }
    

    public Locations(String location) {
        this.location = location;        
    }
    public void  SetNorth( BufferedImage North ){
        this.North = North;    
    }

    /**
     *
     * @param South
     */
    public void SetSouth( BufferedImage South ){
        this.South = South;    
    }
    public void SetWest( BufferedImage West ){
        this.West = West;    
    }
    public void SetEast( BufferedImage Eats ){
        this.East = East;    
    }
    

    }
       


