package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esf implements PointerInputEventHandler {
    final /* synthetic */ hho a;
    final /* synthetic */ ffji b;

    public esf(hho hhoVar, ffji ffjiVar) {
        this.a = hhoVar;
        this.b = ffjiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object i = dtr.i(ildVar, null, null, null, new ese(this.a, this.b), ffguVar, 7);
        return i == ffhh.a ? i : ffcu.a;
    }
}
