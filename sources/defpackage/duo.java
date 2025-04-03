package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duo implements PointerInputEventHandler {
    final /* synthetic */ duq a;

    public duo(duq duqVar) {
        this.a = duqVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object a;
        duq duqVar = this.a;
        return (duqVar.b && (a = ffsl.a(new dun(ildVar, duqVar, null), ffguVar)) == ffhh.a) ? a : ffcu.a;
    }
}
