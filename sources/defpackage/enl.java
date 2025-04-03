package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enl extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ eot b;
    final /* synthetic */ ffsk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enl(boolean z, eot eotVar, ffsk ffskVar) {
        super(1);
        this.a = z;
        this.b = eotVar;
        this.c = ffskVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        if (this.a) {
            enh enhVar = new enh(this.b, this.c);
            ffmx[] ffmxVarArr = jkr.a;
            jku jkuVar = jjl.a;
            jkvVar.e(jjl.x, new jjb(null, enhVar));
            jkvVar.e(jjl.z, new jjb(null, new eni(this.b, this.c)));
        } else {
            enj enjVar = new enj(this.b, this.c);
            ffmx[] ffmxVarArr2 = jkr.a;
            jku jkuVar2 = jjl.a;
            jkvVar.e(jjl.y, new jjb(null, enjVar));
            jkvVar.e(jjl.A, new jjb(null, new enk(this.b, this.c)));
        }
        return ffcu.a;
    }
}
