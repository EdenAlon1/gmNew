package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjb implements PointerInputEventHandler {
    final /* synthetic */ zjv a;

    public zjb(zjv zjvVar) {
        this.a = zjvVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final zjv zjvVar = this.a;
        Object i = dtr.i(ildVar, null, null, null, new ffji() { // from class: zja
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                zjv.this.d.invoke();
                return ffcu.a;
            }
        }, ffguVar, 7);
        return i == ffhh.a ? i : ffcu.a;
    }
}
