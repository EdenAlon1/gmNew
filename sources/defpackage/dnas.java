package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnas implements PointerInputEventHandler {
    final /* synthetic */ ffix a;

    public dnas(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffix ffixVar = this.a;
        Object a = douy.a(ildVar, new ffji() { // from class: dnar
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffix.this.invoke();
                return true;
            }
        }, true, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
