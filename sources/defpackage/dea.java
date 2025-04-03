package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dea implements PointerInputEventHandler {
    final /* synthetic */ deb a;

    public dea(deb debVar) {
        this.a = debVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new ddz(this.a, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
