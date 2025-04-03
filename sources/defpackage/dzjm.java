package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjm {
    public static emxc a(JSONObject jSONObject) {
        if (!jSONObject.has("TEXT") || !jSONObject.has("MESSAGE_CALLBACK_PAYLOAD")) {
            dyhr.c("Action", "failed to convert JSONObject to ReplyActionPayload, missing necessary properties");
            return emux.a;
        }
        dzmf dzmfVar = new dzmf();
        try {
            dzmfVar.c((String) jSONObject.get("TEXT"));
            dzmfVar.b((String) jSONObject.get("MESSAGE_CALLBACK_PAYLOAD"));
            return emxc.j(dzmfVar.a());
        } catch (JSONException unused) {
            dyhr.c("Action", "failed to convert JSONObject to ReplyActionPayload");
            return emux.a;
        }
    }

    public final emxc b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TEXT", d());
            jSONObject.put("MESSAGE_CALLBACK_PAYLOAD", c());
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c("Action", "failed to convert ReplyActionPayload to JSONObject");
            return emux.a;
        }
    }

    public abstract String c();

    public abstract String d();
}
