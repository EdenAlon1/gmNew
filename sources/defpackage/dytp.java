package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dytp implements emwl {
    @Override // defpackage.emwl
    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            dzqn k = dzqo.k();
            k.k(((Integer) hashMap.get("time_to_live_sec")).intValue());
            k.j(((Integer) hashMap.get("OVERLAY_STYLE")).intValue());
            if (hashMap.containsKey("dismiss_action")) {
                emxc b = dyhu.b(hashMap.get("dismiss_action"));
                dzjn dzjnVar = null;
                if (b.g()) {
                    Object c = b.c();
                    if (dzjf.a(((Integer) ((HashMap) c).get("ACTION_TYPE")).intValue()).equals(dzjf.NO_OP_ACTION)) {
                        dzjg f = dzjn.f();
                        dytw.c(f, (HashMap) c);
                        f.t();
                        dzjnVar = f.a();
                    } else {
                        dyhr.c("ActionConv", "failed to convert Map to OverlayAction overlay action can only contain no op action");
                    }
                } else {
                    dyhr.c("ActionConv", "failed to deserialize Map");
                }
                if (dzjnVar == null) {
                    return emux.a;
                }
                k.b(dzjnVar);
            }
            if (hashMap.containsKey("display_icon")) {
                k.d((eyee) hashMap.get("display_icon"));
            }
            if (hashMap.containsKey("display_text")) {
                k.e((String) hashMap.get("display_text"));
            }
            if (hashMap.containsKey("overlay_expire_time")) {
                k.f(((Integer) hashMap.get("overlay_expire_time")).intValue());
            }
            if (hashMap.containsKey("overlay_lighter_icon")) {
                emxc a = dyuk.a((HashMap) hashMap.get("overlay_lighter_icon"));
                if (!a.g()) {
                    return emux.a;
                }
                k.i((dzqb) a.c());
            }
            if (hashMap.containsKey("hide_snippet_in_conversation_list")) {
                k.h(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (hashMap.containsKey("hide_dismiss_button")) {
                k.g(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (hashMap.containsKey("dismissible_by_tapping_outside")) {
                k.c(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            return emxc.j(k.a());
        } catch (IllegalStateException | NullPointerException e) {
            dyhr.d("ActionConv", "failed to convert Map to OverlayAction", e);
            return emux.a;
        }
    }
}
