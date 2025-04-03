package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlo {
    public static final drlx a(String str) {
        Object obj;
        drlp drlpVar;
        String str2;
        str.getClass();
        List U = ffpc.U(str, new char[]{'/'});
        if (U.size() != 2) {
            U = null;
        }
        if (U != null) {
            try {
                int i = drlw.b;
                Iterator it = drlt.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (ffkj.e(((drlw) obj).b(), ffdx.K(U))) {
                        break;
                    }
                }
                drlw drlwVar = (drlw) obj;
                if (drlwVar == null) {
                    drlwVar = new drlq((String) ffdx.K(U));
                }
                List U2 = ffpc.U((CharSequence) ffdx.P(U), new char[]{';'});
                String str3 = (String) ffdx.K(U2);
                if (U2.size() != 2) {
                    U2 = null;
                }
                if (U2 == null || (str2 = (String) ffdx.P(U2)) == null) {
                    drlpVar = null;
                } else {
                    List U3 = ffpc.U(str2, new char[]{'='});
                    String str4 = (String) ffdx.K(U3);
                    if (U3.size() != 2) {
                        U3 = null;
                    }
                    drlpVar = new drlp(str4, U3 != null ? (String) ffdx.P(U3) : null);
                }
                return new drlx(drlwVar, str3, drlpVar);
            } catch (IllegalArgumentException e) {
                ((enrr) ((enrr) drlx.a.i()).g(e).h("com/google/android/libraries/compose/media/MediaType$Companion", "fromString", 93, "MediaType.kt")).t("Could not build MediaType from '%s'", str);
            }
        }
        return null;
    }
}
