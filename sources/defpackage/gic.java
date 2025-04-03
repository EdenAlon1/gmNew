package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gic extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ gmk b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ ffix f;
    final /* synthetic */ ffsk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gic(boolean z, gmk gmkVar, String str, String str2, String str3, ffix ffixVar, ffsk ffskVar) {
        super(1);
        this.a = z;
        this.b = gmkVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ffixVar;
        this.g = ffskVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        if (this.a) {
            gmk gmkVar = this.b;
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            ffix ffixVar = this.f;
            ffsk ffskVar = this.g;
            jkr.d(jkvVar, str, new ghx(ffixVar));
            if (gmkVar.c() == gml.c) {
                jkr.f(jkvVar, str2, new ghz(gmkVar, ffskVar, gmkVar));
            } else if (gmkVar.j()) {
                jkr.a(jkvVar, str3, new gib(gmkVar, ffskVar));
            }
        }
        return ffcu.a;
    }
}
