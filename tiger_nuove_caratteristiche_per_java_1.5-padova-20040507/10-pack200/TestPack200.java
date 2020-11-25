import java.io.*;
import java.util.*;
import java.util.jar.*;

import javax.pack.Pack200;

public class TestPack200 {

  public static void main( String[] args) throws IOException {
    Pack200 p200 = new Pack200();
    Map p = p200.getProperties();
    p.put(Pack200.PACK_EFFORT, "7");
    p.put(Pack200.PACK_SEGMENT_LIMIT, "-1");
    p.put(Pack200.PACK_KEEP_FILE_ORDER, Pack200.FALSE);
    p.put(Pack200.PACK_MODIFICATION_TIME, Pack200.LATEST);
    p.put(Pack200.PACK_DEFLATE_HINT, Pack200.FALSE);
    p.put(Pack200.PACK_STRIP_DEBUG, Pack200.FALSE);
    p.put(Pack200.PACK_UNKNOWN_ATTRIBUTE, Pack200.ERROR);

    if( args.length<2 ){
       System.out.println("Pack200 syntax");
       System.out.println("Pack200 input_jar output_pack200");
       System.out.println("Pack200 -d input_pack200 output_jar");
       return;
    }

    if( !args[0].equalsIgnoreCase("-d") ){
       // pack
       JarFile jarFile = new JarFile( args[0] );
       FileOutputStream fos = new FileOutputStream( args[1] );
       p200.pack(jarFile, fos);
    } else {
       // unpack
       File f = new File( args[1] );
       FileOutputStream fostream = new FileOutputStream( args[2] );
       JarOutputStream jostream = new JarOutputStream(fostream);
       p200.unpack(f, jostream);
       jostream.close();
    }
  }
}
