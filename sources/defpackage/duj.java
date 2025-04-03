package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duj implements PointerInputEventHandler {
    final /* synthetic */ duq a;
    final /* synthetic */ dlz b;

    public duj(duq duqVar, dlz dlzVar) {
        this.a = duqVar;
        this.b = dlzVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object p = ildVar.p(new duh(ffguVar.u(), this.b, this.a.d, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (p != ffhhVar) {
            p = ffcu.a;
        }
        return p == ffhhVar ? p : ffcu.a;
    }
}
