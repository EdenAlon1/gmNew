package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpvc implements PointerInputEventHandler {
    final /* synthetic */ dpvl a;
    final /* synthetic */ lkr b;
    final /* synthetic */ hho c;
    final /* synthetic */ ffix d;

    public dpvc(dpvl dpvlVar, lkr lkrVar, hho hhoVar, ffix ffixVar) {
        this.a = dpvlVar;
        this.b = lkrVar;
        this.c = hhoVar;
        this.d = ffixVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final dpvl dpvlVar = this.a;
        final lkr lkrVar = this.b;
        final hho hhoVar = this.c;
        ffji ffjiVar = new ffji() { // from class: dpuz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dpvl dpvlVar2 = dpvl.this;
                if (dpvlVar2 != null) {
                    hho hhoVar2 = hhoVar;
                    if (!dpvi.d(hhoVar2)) {
                        dpvlVar2.a.invoke(lkrVar);
                        dpvi.c(hhoVar2, true);
                    }
                }
                return ffcu.a;
            }
        };
        dpvb dpvbVar = new dpvb(dpvlVar, hhoVar, null);
        final ffix ffixVar = this.d;
        Object i = dtr.i(ildVar, null, ffjiVar, dpvbVar, new ffji() { // from class: dpva
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffix.this.invoke();
                return ffcu.a;
            }
        }, ffguVar, 1);
        return i == ffhh.a ? i : ffcu.a;
    }
}
