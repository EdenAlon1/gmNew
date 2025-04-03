package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dov implements PointerInputEventHandler {
    final /* synthetic */ dpb a;

    public dov(dpb dpbVar) {
        this.a = dpbVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        imj imjVar = new imj();
        dpb dpbVar = this.a;
        Object a = ffsl.a(new dop(dpbVar, ildVar, new dot(dpbVar, imjVar), new dos(imjVar, ildVar, dpbVar), new dor(dpbVar), new dou(dpbVar), new doq(imjVar, dpbVar), null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
