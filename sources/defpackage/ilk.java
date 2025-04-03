package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ilk implements PointerInputEventHandler {
    final /* synthetic */ ffji a;

    public ilk(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object p = ildVar.p(new ilj(this.a, null), ffguVar);
        return p == ffhh.a ? p : ffcu.a;
    }
}
