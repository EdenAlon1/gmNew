package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fve extends ffkk implements ffji {
    final /* synthetic */ gmk a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ ffsk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fve(gmk gmkVar, boolean z, String str, String str2, String str3, ffsk ffskVar) {
        super(1);
        this.a = gmkVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ffskVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        gmk gmkVar = this.a;
        if (gmkVar.d.p().a.size() > 1 && this.b) {
            ffsk ffskVar = this.f;
            gml c = gmkVar.c();
            gml gmlVar = gml.c;
            if (c == gmlVar) {
                if (((Boolean) gmkVar.d.b.invoke(gml.b)).booleanValue()) {
                    jkr.f(jkvVar, this.c, new fuz(ffskVar, gmkVar));
                }
            } else if (((Boolean) gmkVar.d.b.invoke(gmlVar)).booleanValue()) {
                jkr.a(jkvVar, this.d, new fvb(ffskVar, gmkVar));
            }
            if (!gmkVar.b) {
                jkr.d(jkvVar, this.e, new fvd(ffskVar, gmkVar));
            }
        }
        return ffcu.a;
    }
}
