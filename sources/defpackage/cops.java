package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cops extends ffhv implements ffjm {
    int a;
    final /* synthetic */ copt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cops(copt coptVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = coptVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cops) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object a = ((csjk) this.b.a.b()).a();
            a.getClass();
            ckgb ckgbVar = ckgb.NO_HINT;
            this.a = 1;
            elfl a2 = ((ckge) a).a(ckgbVar);
            a2.getClass();
            Object c = fgfz.c(a2, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cops(this.b, ffguVar);
    }
}
