package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oem extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oem(ffxx ffxxVar, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oem) c((okz) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            okz okzVar = (okz) this.d;
            ffxx ffxxVar = this.b;
            oel oelVar = new oel(this.c, new odj(okzVar), null);
            this.a = 1;
            if (ffyk.b(ffxxVar, oelVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oem oemVar = new oem(this.b, this.c, ffguVar);
        oemVar.d = obj;
        return oemVar;
    }
}
