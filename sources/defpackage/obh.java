package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class obh extends ffkk implements ffji {
    final /* synthetic */ obl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obh(obl oblVar) {
        super(1);
        this.a = oblVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final nxm nxmVar = (nxm) obj;
        nxmVar.getClass();
        final obl oblVar = this.a;
        return new lkp() { // from class: obg
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                nxm nxmVar2 = nxmVar;
                obl oblVar2 = obl.this;
                if (lkiVar == lki.ON_RESUME && ((List) oblVar2.f().f.c()).contains(nxmVar2)) {
                    if (obl.l()) {
                        Log.v("FragmentNavigator", a.k(lkrVar, nxmVar2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching RESUMED"));
                    }
                    oblVar2.f().d(nxmVar2);
                }
                if (lkiVar == lki.ON_DESTROY) {
                    if (obl.l()) {
                        Log.v("FragmentNavigator", a.k(lkrVar, nxmVar2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching DESTROYED"));
                    }
                    oblVar2.f().d(nxmVar2);
                }
            }
        };
    }
}
