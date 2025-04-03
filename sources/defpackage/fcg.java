package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcg extends ffkk implements ffji {
    final /* synthetic */ long a;
    final /* synthetic */ ffix b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcg(long j, ffix ffixVar, boolean z) {
        super(1);
        this.a = j;
        this.b = ffixVar;
        this.c = z;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        hxn hxnVar = (hxn) obj;
        return hxnVar.p(new fcf(this.b, this.c, fci.a(hxnVar, Float.intBitsToFloat((int) (hxnVar.a() >> 32)) / 2.0f), new ibl(this.a, 5)));
    }
}
