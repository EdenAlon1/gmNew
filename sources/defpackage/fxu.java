package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ftb b;
    final /* synthetic */ cxt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxu(ftb ftbVar, cxt cxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ftbVar;
        this.c = cxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ftb ftbVar = this.b;
            cxt cxtVar = this.c;
            this.a = 1;
            if ((guk.b(ftbVar.f(), 0) && ftb.l(((Number) ftbVar.e.c()).floatValue()) == ftb.l(ftbVar.c)) || (guk.b(ftbVar.f(), 1) && ftb.l(((Number) ftbVar.e.c()).floatValue()) == ftb.l(ftbVar.d))) {
                a = ffcu.a;
            } else {
                a = ftbVar.f.a(dhy.c, new fsy(ftbVar, guk.b(ftbVar.f(), 0) ? ftbVar.a(ftbVar.c) : ftbVar.a(ftbVar.d), cxtVar, null), this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fxu(this.b, this.c, ffguVar);
    }
}
