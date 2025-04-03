package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ker extends ffkk implements ffix {
    final /* synthetic */ ffla a;
    final /* synthetic */ kes b;
    final /* synthetic */ kac c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ker(ffla fflaVar, kes kesVar, kac kacVar, long j, long j2) {
        super(0);
        this.a = fflaVar;
        this.b = kesVar;
        this.c = kacVar;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        kes kesVar = this.b;
        this.a.a = kesVar.d.a(this.c, this.d, kesVar.e, this.e);
        return ffcu.a;
    }
}
