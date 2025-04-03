package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqs extends ffkk implements ffji {
    final /* synthetic */ cqv a;
    final /* synthetic */ iqk b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqs(cqv cqvVar, iqk iqkVar, long j) {
        super(1);
        this.a = cqvVar;
        this.b = iqkVar;
        this.c = j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        huo huoVar = this.a.c.b;
        iqk iqkVar = this.b;
        ((iqj) obj).f(this.b, huoVar.a((iqkVar.a << 32) | (iqkVar.b & 4294967295L), this.c, kah.a), 0.0f);
        return ffcu.a;
    }
}
