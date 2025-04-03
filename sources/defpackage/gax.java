package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gax extends ffkk implements ffji {
    final /* synthetic */ ffsk a;
    final /* synthetic */ hho b;
    final /* synthetic */ eey c;
    final /* synthetic */ ffmj d;
    final /* synthetic */ haq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gax(ffsk ffskVar, hho hhoVar, eey eeyVar, ffmj ffmjVar, haq haqVar) {
        super(1);
        this.a = ffskVar;
        this.b = hhoVar;
        this.c = eeyVar;
        this.d = ffmjVar;
        this.e = haqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        gcy.b(this.b, !gcy.h(r7));
        ffqy.d(this.a, null, null, new gaw(this.c, intValue, this.d, this.e, null), 3);
        return ffcu.a;
    }
}
