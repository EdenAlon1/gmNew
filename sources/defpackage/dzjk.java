package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjk {
    public static emxc c(dzjk dzjkVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (dzjkVar.b().g()) {
                emxc d = dzpw.d((dzpw) dzjkVar.b().c());
                if (!d.g()) {
                    return emux.a;
                }
                jSONObject.put("STACKED_REACTION_WEB_VIEW", d.c());
            }
            if (dzjkVar.a().g()) {
                emxc m = ((dzqo) dzjkVar.a().c()).m();
                if (!m.g()) {
                    return emux.a;
                }
                jSONObject.put("REACTION_OVERLAY_HEADER", m.c());
            }
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c("Action", "failed to convert OverlayActionPayload to JSONObject.");
            return emux.a;
        }
    }

    public abstract emxc a();

    public abstract emxc b();
}
