package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpn implements Parcelable, Serializable {
    private static final long serialVersionUID = 0;

    public static emxc c(JSONObject jSONObject) {
        try {
            dzip dzipVar = new dzip();
            dzipVar.c(jSONObject.getString("ID"));
            dzipVar.b(jSONObject.getString("APP_NAME"));
            return emxc.j(dzipVar.a());
        } catch (JSONException unused) {
            dyhr.c("ConversationId", "failed to convert JSONObject to GroupId");
            return emux.a;
        }
    }

    public abstract String a();

    public abstract String b();

    public final emxc d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ID", b());
            jSONObject.put("APP_NAME", a());
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c("ConversationId", "failed to convert GroupId to JSONObject");
            return emux.a;
        }
    }
}
