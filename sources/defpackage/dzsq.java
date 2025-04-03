package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzsq {
    public static emxc c(JSONObject jSONObject) {
        try {
            dzsm dzsmVar = new dzsm();
            dzsmVar.b(jSONObject.getString("RESOURCE_ID"));
            dzsmVar.c(jSONObject.getInt("RESOURCE_REGION"));
            return emxc.j(dzsmVar.a());
        } catch (Exception e) {
            dyhr.d("LighterMediaId", "failed to convert JSON to LighterMediaId", e);
            return emux.a;
        }
    }

    public abstract int a();

    public abstract String b();

    public final emxc d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("RESOURCE_ID", b());
            jSONObject.put("RESOURCE_REGION", a());
            return emxc.j(jSONObject);
        } catch (JSONException e) {
            dyhr.d("LighterMediaId", "failed to convert LighterMediaId to JSONObject", e);
            return emux.a;
        }
    }
}
