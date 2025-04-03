package defpackage;

import com.android.vcard.VCardConstants;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgl {
    public static emxc a(dzqs dzqsVar) {
        if (!c(dzqsVar)) {
            return emux.a;
        }
        HashMap g = dyhu.g(((dznp) dzqsVar.h().b()).b);
        int i = dzhb.i;
        dzgy dzgyVar = new dzgy();
        dzgyVar.h((String) g.get("MESSAGE_TEXT"));
        dzgyVar.i((String) g.get(VCardConstants.PROPERTY_TITLE));
        dzgyVar.c((String) g.get("DESCRIPTION"));
        dzgyVar.g((String) g.get("IMAGE_URL"));
        dzgyVar.d((String) g.get("DOMAIN"));
        dzgyVar.b((String) g.get("CANONICAL_URL"));
        if (g.containsKey("IMAGE")) {
            dzgyVar.f(dyhu.a((byte[]) g.get("IMAGE")));
        }
        if (g.containsKey("EXPIRATION_TIME_MS")) {
            dzgyVar.e(((Long) g.get("EXPIRATION_TIME_MS")).longValue());
        }
        return emxc.j(dzgyVar.a());
    }

    public static String b(dzqs dzqsVar) {
        return dzqsVar.h().a() == 2 ? dzqsVar.h().d() : c(dzqsVar) ? ((dzgz) a(dzqsVar).c()).a : "";
    }

    public static boolean c(dzqs dzqsVar) {
        return dzqsVar.h().a() == 3 && ((dznp) dzqsVar.h().b()).a.equals("link_preview");
    }
}
