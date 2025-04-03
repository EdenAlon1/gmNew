package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnp extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ goa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnp(boolean z, String str, goa goaVar) {
        super(1);
        this.a = z;
        this.b = str;
        this.c = goaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        if (this.a) {
            jkr.n(jkvVar, 0);
        }
        jkr.d(jkvVar, null, new gno(this.c));
        jkr.o(jkvVar, this.b);
        return ffcu.a;
    }
}
