package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demi implements ffjm {
    final /* synthetic */ deml a;

    public demi(deml demlVar) {
        this.a = demlVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.w(1729797275);
            hik hikVar = lof.a;
            hfdVar.w(-584162872);
            lmy lmyVar = (lmy) hfdVar.e(lof.a);
            if (lmyVar == null) {
                hfdVar.w(-163523515);
                hfdVar.w(1382572291);
                lmyVar = lna.a((View) hfdVar.e(AndroidCompositionLocals_androidKt.g));
                hfdVar.p();
            } else {
                hfdVar.w(-163524631);
            }
            hfdVar.p();
            hfdVar.p();
            if (lmyVar == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            boolean z = lmyVar instanceof lkd;
            lnx T = z ? ((lkd) lmyVar).T() : lnv.a;
            int i = fflc.a;
            ffkb ffkbVar = new ffkb(depk.class);
            hfdVar.w(1673618944);
            lml b = (z ? lmq.a(lmyVar.S(), ((lkd) lmyVar).R(), T) : lmq.b(lmyVar, null, 6)).b(ffkbVar);
            hfdVar.p();
            hfdVar.p();
            Intent intent = this.a.a.getIntent();
            intent.getClass();
            cvjl a = dejo.a(intent);
            a.getClass();
            deok.c(((deny) ((depk) b).a.b()).a(a), hfdVar, 0);
        }
        return ffcu.a;
    }
}
