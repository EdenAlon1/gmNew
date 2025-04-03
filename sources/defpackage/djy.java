package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djy implements PointerInputEventHandler {
    final /* synthetic */ ffji a;

    public djy(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new djz(this.a, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (b != ffhhVar) {
            b = ffcu.a;
        }
        return b == ffhhVar ? b : ffcu.a;
    }
}
