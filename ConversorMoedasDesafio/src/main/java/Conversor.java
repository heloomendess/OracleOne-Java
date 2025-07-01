
import org.json.JSONObject;

public class Conversor {
    public static double extrairResultado(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getDouble("result");
    }
}
