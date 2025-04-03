package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewi extends ffhv implements ffjm {
    final /* synthetic */ cewk a;
    final /* synthetic */ poj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cewi(ffgu ffguVar, cewk cewkVar, poj pojVar) {
        super(2, ffguVar);
        this.a = cewkVar;
        this.b = pojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cewi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        poj pojVar = this.b;
        boolean z = false;
        if (pojVar.d) {
            ((enrr) cewk.a.h().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateUnsupportedConstraints", 84, "WorkQueueConstraintEvaluator.kt")).q("Device Idle constraint does not support eager evaluation");
        } else if (pojVar.f) {
            ((enrr) cewk.a.h().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateUnsupportedConstraints", 88, "WorkQueueConstraintEvaluator.kt")).q("Storage Not Low constraint does not support eager evaluation");
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cewi cewiVar = new cewi(ffguVar, this.a, this.b);
        cewiVar.c = obj;
        return cewiVar;
    }
}
