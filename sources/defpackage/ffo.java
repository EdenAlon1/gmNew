package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffo implements PointerInputEventHandler {
    final /* synthetic */ fft a;
    final /* synthetic */ ffix b;

    public ffo(fft fftVar, ffix ffixVar) {
        this.a = fftVar;
        this.b = ffixVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new ffn(this.a, this.b, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
