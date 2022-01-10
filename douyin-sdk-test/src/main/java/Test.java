
import com.doudian.open.api.product_del.ProductDelRequest;
import com.doudian.open.api.product_del.ProductDelResponse;
import com.doudian.open.api.product_del.param.ProductDelParam;
import com.doudian.open.core.AccessToken;
import com.doudian.open.core.DoudianOpConfig;


public class Test {
    public static void main(String[] args) {

        ProductDelRequest request = new ProductDelRequest();
        DoudianOpConfig config = new DoudianOpConfig();
        config.setAppKey("7046952290573387295");
        config.setAppSecret("19792def-ccb3-4442-bc7c-9b67bb03e909");
        request.setConfig(config);
        ProductDelParam param = request.getParam();
        param.setProductId(356545645645454L);
        param.setOutProductId(4156451L);
        //refreshTokenStr 瞎填写的，只要accessTokenStr 就行了
        AccessToken accessTokenObj = AccessToken.wrap("0b0434ca-17d9-4063-9ec0-0d99f9d3bb80", "0b0434ca-17d9-4063-9ec0-0d99f9d3bb80");
        ProductDelResponse response = request.execute(accessTokenObj);
        System.out.println("asdads");

    }
}

