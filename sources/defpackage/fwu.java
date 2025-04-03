package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwu extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ jlc b;
    final /* synthetic */ hvi c;
    final /* synthetic */ fwq d;
    final /* synthetic */ ifv e;
    final /* synthetic */ ifv f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwu(boolean z, jlc jlcVar, hvi hviVar, fwq fwqVar, ifv ifvVar, ifv ifvVar2, int i) {
        super(2);
        this.a = z;
        this.b = jlcVar;
        this.c = hviVar;
        this.d = fwqVar;
        this.e = ifvVar;
        this.f = ifvVar2;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = this.a;
        jlc jlcVar = this.b;
        hvi hviVar = this.c;
        fwq fwqVar = this.d;
        ifv ifvVar = this.e;
        fwy.a(z, jlcVar, hviVar, fwqVar, ifvVar, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
