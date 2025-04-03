package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffc extends ffkk implements ffjq {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffc(fft fftVar) {
        super(6);
        this.a = fftVar;
    }

    @Override // defpackage.ffjq
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ioc iocVar = (ioc) obj2;
        long j = ((iak) obj3).a;
        long j2 = ((iak) obj4).a;
        long a = this.a.a(iocVar, j);
        long a2 = this.a.a(iocVar, j2);
        this.a.s(booleanValue);
        iak iakVar = new iak(a);
        return Boolean.valueOf(this.a.F(iakVar, a2, ((Boolean) obj5).booleanValue(), (fdh) obj6));
    }
}
