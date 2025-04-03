package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etx implements PointerInputEventHandler {
    final /* synthetic */ evy a;
    final /* synthetic */ fhi b;

    public etx(evy evyVar, fhi fhiVar) {
        this.a = evyVar;
        this.b = fhiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object a = ffsl.a(new etw(ildVar, this.a, this.b, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
