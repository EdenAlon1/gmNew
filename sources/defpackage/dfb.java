package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfb {
    public static final boolean a(KeyEvent keyEvent) {
        long b = iiz.b(keyEvent);
        return iiw.a(b, iiw.h) || iiw.a(b, iiw.m) || iiw.a(b, iiw.t) || iiw.a(b, iiw.l);
    }

    public static final hvi b(hvi hviVar, dwn dwnVar, dgz dgzVar, boolean z, String str, jjj jjjVar, ffix ffixVar) {
        return hviVar.a(dgzVar instanceof dhf ? new ClickableElement(dwnVar, (dhf) dgzVar, z, str, jjjVar, ffixVar) : dgzVar == null ? new ClickableElement(dwnVar, null, z, str, jjjVar, ffixVar) : dwnVar != null ? dhc.a(hvi.e, dwnVar, dgzVar).a(new ClickableElement(dwnVar, null, z, str, jjjVar, ffixVar)) : huz.g(hvi.e, new dex(dgzVar, z, str, jjjVar, ffixVar)));
    }

    public static /* synthetic */ hvi c(hvi hviVar, dwn dwnVar, dgz dgzVar, boolean z, String str, jjj jjjVar, ffix ffixVar, int i) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            jjjVar = null;
        }
        return b(hviVar, dwnVar, dgzVar, z2, str, jjjVar, ffixVar);
    }

    public static /* synthetic */ hvi d(hvi hviVar, boolean z, String str, ffix ffixVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return huz.g(hviVar, new dew(1 == ((z ? 1 : 0) | (i & 1)), str, ffixVar));
    }

    public static final hvi e(hvi hviVar, dwn dwnVar, dgz dgzVar, boolean z, jjj jjjVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        return hviVar.a(dgzVar instanceof dhf ? new CombinedClickableElement(dwnVar, (dhf) dgzVar, z, jjjVar, ffixVar3, ffixVar, ffixVar2) : dgzVar == null ? new CombinedClickableElement(dwnVar, null, z, jjjVar, ffixVar3, ffixVar, ffixVar2) : dwnVar != null ? dhc.a(hvi.e, dwnVar, dgzVar).a(new CombinedClickableElement(dwnVar, null, z, jjjVar, ffixVar3, ffixVar, ffixVar2)) : huz.g(hvi.e, new dez(dgzVar, z, jjjVar, ffixVar3, ffixVar, ffixVar2)));
    }

    public static /* synthetic */ hvi f(hvi hviVar, dwn dwnVar, dgz dgzVar, boolean z, jjj jjjVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3, int i) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 16) != 0) {
            jjjVar = null;
        }
        if ((i & 64) != 0) {
            ffixVar = null;
        }
        if ((i & 128) != 0) {
            ffixVar2 = null;
        }
        return e(hviVar, dwnVar, dgzVar, z2, jjjVar, ffixVar, ffixVar2, ffixVar3);
    }

    public static /* synthetic */ hvi g(hvi hviVar, boolean z, ffix ffixVar, ffix ffixVar2, int i) {
        if ((i & 16) != 0) {
            ffixVar = null;
        }
        return huz.g(hviVar, new dey(1 == ((z ? 1 : 0) | (i & 1)), ffixVar, ffixVar2));
    }
}
