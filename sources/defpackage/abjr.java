package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjr implements PointerInputEventHandler {
    final /* synthetic */ ffji a;

    public abjr(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new abjq(this.a, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
