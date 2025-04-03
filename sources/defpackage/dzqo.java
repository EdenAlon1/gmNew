package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzqo {
    public static dzqn k() {
        dznq dznqVar = new dznq();
        dznqVar.g(false);
        dznqVar.c(false);
        dznqVar.h(false);
        return dznqVar;
    }

    public static emxc l(JSONObject jSONObject) {
        dzqn k = k();
        try {
            k.j(jSONObject.getInt("OVERLAY_STYLE"));
            k.k(jSONObject.getInt("time_to_live_sec"));
            if (jSONObject.has("dismiss_action")) {
                emxc i = dzjn.i(jSONObject.getJSONObject("dismiss_action"));
                if (!i.g()) {
                    dyhr.c("Message", "Failed to get dismiss action from JSONObject in Overlay.");
                    return emux.a;
                }
                k.b((dzjn) i.c());
            }
            if (jSONObject.has("overlay_lighter_icon")) {
                emxc h = dzqb.h(jSONObject.getJSONObject("overlay_lighter_icon"));
                if (!h.g()) {
                    dyhr.c("Message", "Failed to get lighter icon from JSONObject in Overlay.");
                    return emux.a;
                }
                k.i((dzqb) h.c());
            }
            if (jSONObject.has("display_text")) {
                k.e(jSONObject.getString("display_text"));
            }
            if (jSONObject.has("OVERLAY_EXPIRETIME_STAMP")) {
                k.f(jSONObject.getInt("OVERLAY_EXPIRETIME_STAMP"));
            }
            if (jSONObject.has("display_icon")) {
                k.d(dyhu.c(jSONObject.optString("display_icon")));
            }
            if (jSONObject.has("hide_snippet_in_conversation_list")) {
                k.h(jSONObject.optBoolean("hide_snippet_in_conversation_list"));
            }
            if (jSONObject.has("hide_dismiss_button")) {
                k.g(jSONObject.optBoolean("hide_dismiss_button"));
            }
            if (jSONObject.has("dismissible_by_tapping_outside")) {
                k.c(jSONObject.optBoolean("dismissible_by_tapping_outside"));
            }
            return emxc.j(k.a());
        } catch (JSONException e) {
            dyhr.d("Message", "Failed to decode Overlay", e);
            return emux.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract emxc c();

    @Deprecated
    public abstract emxc d();

    public abstract emxc e();

    public abstract emxc f();

    public abstract emxc g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public final emxc m() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (c().g()) {
                emxc k = ((dzjn) c().c()).k();
                if (!k.g()) {
                    dyhr.c("Message", "Failed to convert dismiss action to JSONObject in Overlay.");
                    return emux.a;
                }
                jSONObject.put("dismiss_action", k.c());
            }
            if (g().g()) {
                emxc i = ((dzqb) g().c()).i();
                if (!i.g()) {
                    dyhr.c("Message", "Failed to convert lighter icon to JSONObject in Overlay.");
                    return emux.a;
                }
                jSONObject.put("overlay_lighter_icon", i.c());
            }
            if (e().g()) {
                jSONObject.put("display_text", e().c());
            }
            jSONObject.put("time_to_live_sec", b());
            if (f().g()) {
                jSONObject.put("OVERLAY_EXPIRETIME_STAMP", f().c());
            }
            jSONObject.put("OVERLAY_STYLE", a());
            if (d().g()) {
                jSONObject.putOpt("display_icon", dyhu.e((eyee) d().c()));
            }
            jSONObject.putOpt("hide_snippet_in_conversation_list", Boolean.valueOf(j()));
            jSONObject.putOpt("hide_dismiss_button", Boolean.valueOf(i()));
            jSONObject.putOpt("dismissible_by_tapping_outside", Boolean.valueOf(h()));
            return emxc.j(jSONObject);
        } catch (JSONException e) {
            dyhr.d("Message", "Failed to encode Overlay", e);
            return emux.a;
        }
    }
}
