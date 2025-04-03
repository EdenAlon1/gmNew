package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzqb {
    private static final String a = "dzqb";

    public static dzqa f() {
        dznf dznfVar = new dznf();
        dznfVar.f(0);
        dznfVar.c(0);
        dznfVar.e("");
        return dznfVar;
    }

    public static dzqb g() {
        dzqa f = f();
        f.d(new byte[0]);
        f.c(0);
        f.f(0);
        f.e("");
        return f.a();
    }

    public static emxc h(JSONObject jSONObject) {
        dzqa f = f();
        try {
            f.c(jSONObject.getInt("ICON_HEIGHT"));
            f.f(jSONObject.getInt("ICON_WIDTH"));
            f.d(dyhu.k(jSONObject.getString("ICON")));
            f.e(jSONObject.getString("TALK_BACK_DESCRIPTION"));
            if (jSONObject.has("ICON_COLOR")) {
                f.b(jSONObject.getInt("ICON_COLOR"));
            }
            return emxc.j(f.a());
        } catch (NullPointerException | JSONException unused) {
            return emux.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract emxc c();

    public abstract String d();

    public abstract byte[] e();

    public final emxc i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ICON", dyhu.f(e()));
            jSONObject.put("ICON_WIDTH", b());
            jSONObject.put("ICON_HEIGHT", a());
            jSONObject.put("TALK_BACK_DESCRIPTION", d());
            if (c().g()) {
                jSONObject.put("ICON_COLOR", c().c());
            }
            return emxc.j(jSONObject);
        } catch (JSONException unused) {
            dyhr.c(a, "failed to convert LighterIcon to JSONObject");
            return emux.a;
        }
    }
}
