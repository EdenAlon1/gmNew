package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzrw extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzse b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ byte[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzrw(bzse bzseVar, String str, String str2, byte[] bArr, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzseVar;
        this.c = str;
        this.d = str2;
        this.e = bArr;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dhre d = ((dgaf) this.b.a.b()).d(this.c, this.d, this.e);
            this.a = 1;
            if (axpj.a(d, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        if (this.b.b.a()) {
            ((akzt) this.b.c.b()).e("Bugle.Etouffee.ContactKeyApiService.Success.Count", 5);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzrw(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
