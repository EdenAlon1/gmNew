package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyuk {
    public static emxc a(HashMap hashMap) {
        dzqa f = dzqb.f();
        try {
            f.d((byte[]) hashMap.get("ICON"));
            f.f(((Integer) hashMap.get("ICON_WIDTH")).intValue());
            f.c(((Integer) hashMap.get("ICON_HEIGHT")).intValue());
            f.e((String) hashMap.get("TALK_BACK_DESCRIPTION"));
            if (hashMap.containsKey("ICON_COLOR")) {
                f.b(((Integer) hashMap.get("ICON_COLOR")).intValue());
            }
            return emxc.j(f.a());
        } catch (NullPointerException e) {
            dyhr.d("LitIconConv", "failed to convert Map to LighterIcon", e);
            return emux.a;
        }
    }

    public static HashMap b(dzqb dzqbVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("ICON", dzqbVar.e());
        hashMap.put("ICON_WIDTH", Integer.valueOf(dzqbVar.b()));
        hashMap.put("ICON_HEIGHT", Integer.valueOf(dzqbVar.a()));
        hashMap.put("TALK_BACK_DESCRIPTION", dzqbVar.d());
        if (dzqbVar.c().g()) {
            hashMap.put("ICON_COLOR", dzqbVar.c().c());
        }
        return hashMap;
    }
}
