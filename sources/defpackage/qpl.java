package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qpl extends qpm {
    public qpl(String str, qoq qoqVar, qop qopVar) {
        super(str, qoqVar, qopVar);
    }

    @Override // defpackage.qol
    protected final qor b(qoh qohVar) {
        String str;
        try {
            byte[] bArr = qohVar.b;
            Map map = qohVar.c;
            String str2 = "utf-8";
            if (map != null && (str = (String) map.get(fhpi.a)) != null) {
                String[] split = str.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            return new qor(new JSONObject(new String(bArr, str2)), qpg.b(qohVar));
        } catch (UnsupportedEncodingException e) {
            return new qor(new qoj(e));
        } catch (JSONException e2) {
            return new qor(new qoj(e2));
        }
    }
}
