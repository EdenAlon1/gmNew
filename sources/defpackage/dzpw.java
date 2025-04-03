package defpackage;

import com.android.vcard.VCardConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpw {
    public static emxc c(JSONObject jSONObject) {
        dznb dznbVar = new dznb();
        try {
            dznbVar.b(jSONObject.getString(VCardConstants.PROPERTY_URL));
            emxc l = dzqo.l(jSONObject.getJSONObject("WEB_VIEW_HEADER"));
            if (!l.g()) {
                return emux.a;
            }
            dznbVar.a = (dzqo) l.c();
            return emxc.j(dznbVar.a());
        } catch (JSONException e) {
            dyhr.d("CustomizedWebView", " Fail to convert customized web view from json object.", e);
            return emux.a;
        }
    }

    public static emxc d(dzpw dzpwVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            emxc m = dzpwVar.a().m();
            if (!m.g()) {
                return emux.a;
            }
            jSONObject.put(VCardConstants.PROPERTY_URL, dzpwVar.b());
            jSONObject.put("WEB_VIEW_HEADER", m.c());
            return emxc.j(jSONObject);
        } catch (JSONException e) {
            dyhr.d("CustomizedWebView", " Fail to convert customized web view to json object.", e);
            return emux.a;
        }
    }

    public abstract dzqo a();

    public abstract String b();
}
