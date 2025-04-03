package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apux extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apva b;
    final /* synthetic */ apvv c;
    final /* synthetic */ int d;
    long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apux(ffgu ffguVar, apva apvaVar, apvv apvvVar, int i) {
        super(2, ffguVar);
        this.b = apvaVar;
        this.c = apvvVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apux) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long j;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            j = this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            apva apvaVar = this.b;
            apvv apvvVar = this.c;
            long a = apvaVar.e.a();
            elfl f = apvaVar.b.f(apvvVar != null ? apvvVar.a : null, this.d);
            f.getClass();
            this.e = a;
            this.a = 1;
            obj = fgfz.c(f, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            j = a;
        }
        apva apvaVar2 = this.b;
        int i = this.d;
        apvf apvfVar = (apvf) obj;
        apvfVar.getClass();
        return apvaVar2.e.c(i, j, apvfVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apux apuxVar = new apux(ffguVar, this.b, this.c, this.d);
        apuxVar.f = obj;
        return apuxVar;
    }
}
