package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtz extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ idh b;
    final /* synthetic */ ffix c;
    final /* synthetic */ grs d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtz(boolean z, idh idhVar, ffix ffixVar, grs grsVar, ffjn ffjnVar, int i) {
        super(2);
        this.a = z;
        this.b = idhVar;
        this.c = ffixVar;
        this.d = grsVar;
        this.e = ffjnVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = this.a;
        idh idhVar = this.b;
        ffix ffixVar = this.c;
        grs grsVar = this.d;
        guj.r(z, idhVar, ffixVar, grsVar, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
