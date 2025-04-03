package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzsl {
    public static emxc a(dzqs dzqsVar) {
        Object obj;
        emxc emxcVar;
        if (dzqsVar.h().a() != 3 || !((dznp) dzqsVar.h().b()).a.equals("photos")) {
            return emux.a;
        }
        HashMap g = dyhu.g(((dznp) dzqsVar.h().b()).b);
        try {
            emxc emxcVar2 = emux.a;
            int intValue = ((Integer) g.get("WIDTH")).intValue();
            int intValue2 = ((Integer) g.get("HEIGHT")).intValue();
            int intValue3 = ((Integer) g.get("SIZE")).intValue();
            int intValue4 = ((Integer) g.get("DOWNLOAD_STATUS")).intValue();
            if (g.containsKey("THUMBNAIL")) {
                emxcVar2 = emxc.j((byte[]) g.get("THUMBNAIL"));
            }
            emxc emxcVar3 = emxcVar2;
            if (g.containsKey("MEDIA_ID")) {
                HashMap hashMap = (HashMap) g.get("MEDIA_ID");
                try {
                    dzsm dzsmVar = new dzsm();
                    dzsmVar.b((String) hashMap.get("RESOURCE_ID"));
                    dzsmVar.c(((Integer) hashMap.get("RESOURCE_REGION")).intValue());
                    emxcVar = emxc.j(dzsmVar.a());
                } catch (RuntimeException e) {
                    dyhr.d("PhotoConverters", "failed to convert HashMap to LighterMediaId", e);
                    emxcVar = emux.a;
                }
                obj = emxcVar.c();
            } else {
                obj = null;
            }
            return emxc.j(new dzso((dzsq) obj, g.containsKey("LOCAL_URI") ? (String) g.get("LOCAL_URI") : null, emxcVar3, intValue, intValue2, intValue3, intValue4));
        } catch (RuntimeException e2) {
            dyhr.d("PhotoConverters", "failed to convert HashMap to PhotoData", e2);
            return emux.a;
        }
    }
}
