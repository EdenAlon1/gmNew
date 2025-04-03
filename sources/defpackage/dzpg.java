package defpackage;

import android.os.Parcelable;
import com.android.vcard.VCardConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpg implements Parcelable, Serializable {
    private dzpg a;

    public static emxc f(JSONObject jSONObject) {
        try {
            dzil dzilVar = new dzil();
            dzilVar.c(jSONObject.getString("ID"));
            dzilVar.d(jSONObject.getString("TACHYON_APP_NAME"));
            dzilVar.e(dzpf.a(jSONObject.getInt(VCardConstants.PARAM_TYPE)));
            if (jSONObject.has("HANDLER_ID")) {
                dzilVar.b(jSONObject.getString("HANDLER_ID"));
            }
            return emxc.j(dzilVar.a());
        } catch (JSONException unused) {
            dyhr.c("ContactId", "failed to convert JSONObject to ContactId");
            return emux.a;
        }
    }

    private static dzpg h(dzpg dzpgVar) {
        if (dzpgVar.b() != dzpf.EMAIL) {
            return dzpgVar;
        }
        dzpc a = dzpgVar.a();
        a.c(dyhm.a(dzpgVar.d()));
        return a.a();
    }

    public abstract dzpc a();

    public abstract dzpf b();

    public abstract emxc c();

    public abstract String d();

    public abstract String e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzpg)) {
            return false;
        }
        dzpg dzpgVar = (dzpg) obj;
        if (this.a == null) {
            this.a = h(this);
        }
        if (dzpgVar.a == null) {
            dzpgVar.a = h(dzpgVar);
        }
        return this.a.d().equals(dzpgVar.a.d()) && this.a.e().equals(dzpgVar.a.e()) && this.a.b().equals(dzpgVar.a.b()) && this.a.c().equals(dzpgVar.a.c());
    }

    public final emxc g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ID", d());
            jSONObject.put("TACHYON_APP_NAME", e());
            jSONObject.put(VCardConstants.PARAM_TYPE, b().f);
            emxc c = c();
            if (c.g()) {
                jSONObject.put("HANDLER_ID", c.c());
            }
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c("ContactId", "failed to convert ContactId to JSONObject");
            return emux.a;
        }
    }

    public final int hashCode() {
        if (this.a == null) {
            this.a = h(this);
        }
        return ((((((this.a.d().hashCode() + 527) * 31) + this.a.e().hashCode()) * 31) + this.a.b().hashCode()) * 31) + this.a.c().hashCode();
    }
}
