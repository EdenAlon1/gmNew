package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbe(ConstraintTrackingWorker constraintTrackingWorker, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qbe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ConstraintTrackingWorker constraintTrackingWorker = this.b;
        this.a = 1;
        Object l = constraintTrackingWorker.l(this);
        return l == ffhhVar ? ffhhVar : l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qbe(this.b, ffguVar);
    }
}
