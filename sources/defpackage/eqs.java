package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqs extends ffkk implements ffji {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqs(long j) {
        super(1);
        this.a = j;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        hxn hxnVar = (hxn) obj;
        float intBitsToFloat = Float.intBitsToFloat((int) (hxnVar.a() >> 32)) / 2.0f;
        return hxnVar.p(new eqr(intBitsToFloat, fci.a(hxnVar, intBitsToFloat), new ibl(this.a, 5)));
    }
}
