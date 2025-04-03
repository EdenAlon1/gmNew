package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewd extends ffkk implements ffji {
    final /* synthetic */ ioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewd(ioc iocVar) {
        super(1);
        this.a = iocVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        float[] fArr = ((icm) obj).a;
        if (this.a.t()) {
            ioc iocVar = this.a;
            iod.f(iocVar).r(iocVar, fArr);
        }
        return ffcu.a;
    }
}
