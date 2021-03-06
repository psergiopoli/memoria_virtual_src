package mobile.memoriavirtual.usp.mvmobile.Utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by daniele on 17/06/2015.
 */
public class AppConstant {

    // Number of columns of Grid View
    public static final int NUM_OF_COLUMNS = 3;

    // Gridview image padding
    public static final int GRID_PADDING = 8; // in dp

    // SD card image directory
    public static final String PHOTO_ALBUM = "androidhive";

    // supported file formats
    public static final List<String> FILE_EXTN = Arrays.asList("jpg", "jpeg", "png");



    //Tag default para chamada de serviço
    public static final String TAG_DEFAULT = "tag_memoriavirtual";

    //Tag para chamada de serviço enviarBemPatrimonial
    public static final String TAG_ENVIAR_BEM_PATRIMONIAL = "tag_enviarBemPatrimonial";
    public static final String TAG_LISTAR_INSTITUICAO = "tag_listarInstituicao";


}
