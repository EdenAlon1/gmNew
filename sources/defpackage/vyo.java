package defpackage;

import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyo extends fflr {
    final /* synthetic */ vyp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyo(Object obj, vyp vypVar) {
        super(obj);
        this.a = vypVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        vym vymVar = (vym) obj2;
        vym vymVar2 = (vym) obj;
        vyp vypVar = this.a;
        vypVar.e();
        if (vypVar.b.isShown()) {
            if ((vymVar2 instanceof vyk) && (vymVar instanceof vyk)) {
                vypVar.d.setText(vypVar.d((vyk) vymVar));
                vypVar.f();
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(vypVar.b(), vypVar.a());
                animatorSet.start();
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
