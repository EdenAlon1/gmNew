package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;
    final /* synthetic */ ppr c;
    final /* synthetic */ pvn d;
    final /* synthetic */ pyj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(ConstraintTrackingWorker constraintTrackingWorker, ppr pprVar, pvn pvnVar, pyj pyjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = constraintTrackingWorker;
        this.c = pprVar;
        this.d = pvnVar;
        this.e = pyjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qbj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        ppr pprVar = this.c;
        pvn pvnVar = this.d;
        pyj pyjVar = this.e;
        this.a = 1;
        Object k = constraintTrackingWorker.k(pprVar, pvnVar, pyjVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qbj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
