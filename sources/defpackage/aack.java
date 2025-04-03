package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aack {
    public static final boolean a(alxr alxrVar) {
        alxo a;
        Set d = fffi.d(alxo.SENT, alxo.DELIVERED, alxo.SEEN);
        alya d2 = alxrVar.d();
        alyn alynVar = d2 instanceof alyn ? (alyn) d2 : null;
        if (alynVar == null || (a = alynVar.a()) == null) {
            return true;
        }
        return d.contains(a);
    }

    public static final boolean b(appj appjVar) {
        return (appjVar instanceof appq) && ((appq) appjVar).n() != 1;
    }

    public static final boolean c(appj appjVar) {
        return (!(appjVar instanceof appq) || ffkj.e(((appq) appjVar).e(), Uri.EMPTY) || le.j(appjVar.b())) ? false : true;
    }
}
