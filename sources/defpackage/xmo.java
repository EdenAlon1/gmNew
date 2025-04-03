package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xmp b;
    final /* synthetic */ drnn c;
    final /* synthetic */ fgcm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmo(xmp xmpVar, drnn drnnVar, fgcm fgcmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xmpVar;
        this.c = drnnVar;
        this.d = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xmo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xmp xmpVar = this.b;
            drnn drnnVar = this.c;
            this.a = 1;
            if (xmpVar.a.a(drnnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.f(false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xmo(this.b, this.c, this.d, ffguVar);
    }
}
