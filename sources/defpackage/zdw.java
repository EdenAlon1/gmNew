package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ zdx c;
    final /* synthetic */ azpx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdw(zdx zdxVar, azpx azpxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zdxVar;
        this.d = azpxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgcm fgcmVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            fgcmVar = obj2;
        } else {
            ffci.b(obj);
            zdx zdxVar = this.c;
            azpx azpxVar = this.d;
            fgcm fgcmVar2 = zdxVar.b;
            this.a = fgcmVar2;
            this.b = 1;
            Object d = azpxVar.d(this);
            if (d == ffhhVar) {
                return ffhhVar;
            }
            fgcmVar = fgcmVar2;
            obj = d;
        }
        fgcmVar.f(ffdx.L((Iterable) obj));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zdw(this.c, this.d, ffguVar);
    }
}
