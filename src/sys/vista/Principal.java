/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.vista;

import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.swing.SwingUtilities;

import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuEntryPrimary;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
//import org.pushingpixels.substance.api.SubstanceLookAndFeel;
/**
 *
 * @author Michael
 */
public class Principal extends JRibbonFrame {
    public Principal(){
		
		//JRibbonBand band1 = new JRibbonBand("JAVA", getResizableIconFromResource(getClass().getResource("/imagenes/computer.png")));
		
		//band1.setExpandButtonKeyTip("MJZ");
		
		//band1.setResizePolicies((List) Arrays.asList(new IconRibbonBandResizePolicy(band1.getControlPanel())));
		 
		//RibbonTask task1 = new RibbonTask("Opciones", band1);
		
		//getRibbon().addTask(task1);
		
		RibbonApplicationMenu menu=new RibbonApplicationMenu();
		RibbonApplicationMenuEntryPrimary a=new RibbonApplicationMenuEntryPrimary(getResizableIconFromResource(getClass().getResource("/imagenes/computer.png")), "Nuevo", null, CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
		menu.addMenuEntry(a);
		
		getRibbon().setApplicationIcon(getResizableIconFromResource(getClass().getResource("/imagenes/computer.png")));
		getRibbon().setApplicationMenu(menu);
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,800,600);
        setLocationRelativeTo(null);
        setVisible(true);
		
	}
	 
	private ResizableIcon getResizableIconFromResource(URL resource) {
		  return ImageWrapperResizableIcon.getIcon(resource, new Dimension(18, 18));
	}

	public static void main(String[] args) {
	 
	    SwingUtilities.invokeLater(new Runnable() {
	 
	      @Override
	      public void run() {
	    	  Principal frame = new Principal();
	    	  //SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.OfficeBlue2007Skin");
	    	  frame.setExtendedState(MAXIMIZED_BOTH);
                  SwingUtilities.updateComponentTreeUI(frame);
	      }
	    });
	  }
}
