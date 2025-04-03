package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xck c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcj(xck xckVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xckVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            xck xckVar = this.c;
            cvfd cvfdVar = (cvfd) xckVar.c.b();
            fgcm fgcmVar2 = xckVar.l;
            this.a = fgcmVar2;
            this.b = 1;
            Object d = cvfdVar.d(this);
            if (d == ffhhVar) {
                return ffhhVar;
            }
            fgcmVar = fgcmVar2;
            obj = d;
        }
        fgcmVar.f(obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xcj(this.c, ffguVar);
    }
}
