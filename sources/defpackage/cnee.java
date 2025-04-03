package defpackage;

import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnee {
    public static final cmrl a(fbvt fbvtVar, cmrq cmrqVar, ffbr ffbrVar) {
        cmrl b;
        cmrv b2;
        cmrd a;
        fbvtVar.getClass();
        cmrqVar.getClass();
        int b3 = fbvr.b(fbvtVar.e);
        if (b3 != 0 && b3 == 3) {
            entd entdVar = cned.a;
            try {
                a = (cmrd) eyfy.parseFrom(cmrd.a, (byte[]) cned.b.e());
                a.getClass();
            } catch (eygu unused) {
                cned.a.a(Level.WARNING).q("Could not parse the iOS reaction type mapping from the Phenotype flag.");
                a = cmra.a();
            }
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(a.b);
            String str = fbvtVar.b;
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str2 = (String) unmodifiableMap.get(lowerCase);
            if (str2 == null) {
                if (!((cstx) ffbrVar.b()).e(fbvtVar.b)) {
                    return null;
                }
                str2 = fbvtVar.b;
                str2.getClass();
            }
            b = cmrqVar.b(str2);
            b2 = cmrv.b(b.e);
            if (b2 == null) {
                b2 = cmrv.UNRECOGNIZED;
            }
        } else {
            b = cmrqVar.b(fbvtVar.b);
            b2 = cmrv.b(b.e);
            if (b2 == null) {
                b2 = cmrv.UNRECOGNIZED;
            }
        }
        if (b2 == cmrv.REACTION_TYPE_UNSPECIFIED) {
            return null;
        }
        return b;
    }

    public static final cmrm b(fbvt fbvtVar) {
        fbvtVar.getClass();
        int i = fbvtVar.d;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? cmrm.UNRECOGNIZED : cmrm.REMOVE_REACTION : cmrm.ADD_REACTION : cmrm.REACTION_ACTION_UNSPECIFIED;
    }
}
