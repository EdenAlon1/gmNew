package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exa implements PointerInputEventHandler {
    final /* synthetic */ ffsk a;
    final /* synthetic */ hho b;
    final /* synthetic */ hkx c;
    final /* synthetic */ dwn d;

    public exa(ffsk ffskVar, hho hhoVar, dwn dwnVar, hkx hkxVar) {
        this.a = ffskVar;
        this.b = hhoVar;
        this.d = dwnVar;
        this.c = hkxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object c = dtr.c(ildVar, new ewy(this.a, this.b, this.d, null), new ewz(this.c), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
