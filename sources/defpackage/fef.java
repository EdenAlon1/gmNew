package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fef implements PointerInputEventHandler {
    final /* synthetic */ fcp a;
    final /* synthetic */ evy b;

    public fef(fcp fcpVar, evy evyVar) {
        this.a = fcpVar;
        this.b = evyVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new fee(this.a, new fcl(ildVar.b()), this.b, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
