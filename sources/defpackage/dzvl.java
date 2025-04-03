package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzvl {
    public static dzvk g() {
        return new dzuo().f(new byte[0]);
    }

    public static emxc h(JSONObject jSONObject) {
        try {
            dzvk g = g();
            emxc c = dzsq.c(jSONObject.getJSONObject("MEDIA_ID"));
            if (!c.g()) {
                return emux.a;
            }
            ((dzuo) g).a = (dzsq) c.c();
            if (jSONObject.has("LOCAL_URI")) {
                ((dzuo) g).b = jSONObject.getString("LOCAL_URI");
            }
            if (jSONObject.has("THUMBNAIL")) {
                g.f(dyhu.k(jSONObject.getString("THUMBNAIL")));
            }
            g.e(jSONObject.getInt("WIDTH"));
            g.c(jSONObject.getInt("HEIGHT"));
            g.d(jSONObject.getString("IMAGE_DESCRIPTION"));
            return emxc.j(g.b());
        } catch (JSONException e) {
            dyhr.d("ImageElement", "Failed to convert ImageElement from JSONObject.", e);
            return emux.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract dzsq c();

    public abstract eyee d();

    public abstract String e();

    public abstract String f();

    public final emxc i() {
        try {
            JSONObject jSONObject = new JSONObject();
            emxc d = c().d();
            if (!d.g()) {
                dyhr.c("ImageElement", "failed to convert ImageElement to JSONObject.");
                return emux.a;
            }
            jSONObject.put("MEDIA_ID", d.c());
            if (f() != null) {
                jSONObject.put("LOCAL_URI", f());
            }
            if (d().d() > 0) {
                jSONObject.put("THUMBNAIL", dyhu.f(d().I()));
            }
            jSONObject.put("WIDTH", b());
            jSONObject.put("HEIGHT", a());
            jSONObject.put("IMAGE_DESCRIPTION", e());
            return emxc.j(jSONObject);
        } catch (JSONException e) {
            dyhr.d("ImageElement", "Failed to convert ImageElement to JSONObject.", e);
            return emux.a;
        }
    }
}
