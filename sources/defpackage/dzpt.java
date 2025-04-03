package defpackage;

import android.os.Parcelable;
import com.android.vcard.VCardConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpt implements Parcelable, Serializable {
    public abstract dzpg a();

    public abstract dzps b();

    public final dzpg c() {
        return b().c();
    }

    public final dzpn d() {
        return b().a();
    }

    public final dzpq e() {
        return b().b();
    }

    public final emxc f() {
        try {
            JSONObject jSONObject = new JSONObject();
            emxc g = a().g();
            if (!g.g()) {
                return emux.a;
            }
            jSONObject.put("OWNER", g.c());
            jSONObject.put(VCardConstants.PARAM_TYPE, e().c);
            int ordinal = e().ordinal();
            if (ordinal == 0) {
                emxc g2 = c().g();
                if (!g2.g()) {
                    return emux.a;
                }
                jSONObject.put("OTHER_PARTICIPANT", g2.c());
            } else if (ordinal == 1) {
                emxc d = d().d();
                if (!d.g()) {
                    return emux.a;
                }
                jSONObject.put("GROUP", d.c());
            }
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c("ConversationId", "failed to convert ConversationId to JSONObject");
            return emux.a;
        }
    }
}
