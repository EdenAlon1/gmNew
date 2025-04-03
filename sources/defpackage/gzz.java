package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzz extends ffkk implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ gvi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzz(String str, ffsk ffskVar, gvi gviVar) {
        super(1);
        this.a = str;
        this.b = ffskVar;
        this.c = gviVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkr.i((jkv) obj, this.a, new gzy(this.b, this.c));
        return ffcu.a;
    }
}
