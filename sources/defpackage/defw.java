package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cvik c;
    final /* synthetic */ degd d;
    final /* synthetic */ cvia e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defw(cvik cvikVar, degd degdVar, cvia cviaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cvikVar;
        this.d = degdVar;
        this.e = cviaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            this.c.b(3);
            cvik cvikVar = this.c;
            degd degdVar = this.d;
            cvia cviaVar = this.e;
            this.a = cvikVar;
            this.b = 1;
            Object b = degdVar.b(cviaVar, this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
            obj2 = cvikVar;
            obj = b;
        }
        cvhx cvhxVar = (cvhx) obj;
        cvhxVar.getClass();
        cvig cvigVar = ((cvik) obj2).a;
        cvigVar.copyOnWrite();
        cvii cviiVar = (cvii) cvigVar.instance;
        cvii cviiVar2 = cvii.a;
        cviiVar.c = cvhxVar;
        cviiVar.b = 2;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new defw(this.c, this.d, this.e, ffguVar);
    }
}
