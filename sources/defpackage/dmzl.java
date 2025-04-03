package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmzl implements PointerInputEventHandler {
    final /* synthetic */ dmzt a;

    public dmzl(dmzt dmztVar) {
        this.a = dmztVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final dmzt dmztVar = this.a;
        Object a = douy.a(ildVar, new ffji() { // from class: dmzk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dmzt.this.e().invoke();
                return true;
            }
        }, true, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
