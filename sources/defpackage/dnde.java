package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnde implements PointerInputEventHandler {
    final /* synthetic */ dndq a;

    public dnde(dndq dndqVar) {
        this.a = dndqVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object a;
        final dndq dndqVar = this.a;
        a = douy.a(ildVar, new ffji() { // from class: dndd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) dndq.this.a().invoke();
                bool.booleanValue();
                return bool;
            }
        }, false, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
