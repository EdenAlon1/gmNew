package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zny implements PointerInputEventHandler {
    final /* synthetic */ zmz a;

    public zny(zmz zmzVar) {
        this.a = zmzVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final zmz zmzVar = this.a;
        Object i = dtr.i(ildVar, null, null, null, new ffji() { // from class: znx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                zmz.this.t.invoke();
                return ffcu.a;
            }
        }, ffguVar, 7);
        return i == ffhh.a ? i : ffcu.a;
    }
}
