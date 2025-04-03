package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dofl implements PointerInputEventHandler {
    final /* synthetic */ ffix a;

    public dofl(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffix ffixVar = this.a;
        Object i = dtr.i(ildVar, null, null, null, new ffji() { // from class: dofk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffix.this.invoke();
                return ffcu.a;
            }
        }, ffguVar, 7);
        return i == ffhh.a ? i : ffcu.a;
    }
}
