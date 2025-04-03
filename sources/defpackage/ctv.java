package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctv extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctv(iqk iqkVar, long j, long j2, ffji ffjiVar) {
        super(1);
        this.a = iqkVar;
        this.b = j;
        this.c = j2;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffji ffjiVar = this.d;
        long j = this.b;
        int b = kaa.b(j);
        long j2 = this.c;
        int b2 = kaa.b(j2);
        ((iqj) obj).g(this.a, kaa.a(j) + kaa.a(j2), b + b2, 0.0f, ffjiVar);
        return ffcu.a;
    }
}
