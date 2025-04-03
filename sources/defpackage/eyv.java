package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyv implements PointerInputEventHandler {
    final /* synthetic */ eyw a;

    public eyv(eyw eywVar) {
        this.a = eywVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new eyu(this.a, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
