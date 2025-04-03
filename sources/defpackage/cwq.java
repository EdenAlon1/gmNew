package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwp b;
    final /* synthetic */ long c;
    final /* synthetic */ cws d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwq(cwp cwpVar, long j, cws cwsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwpVar;
        this.c = j;
        this.d = cwsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwp cwpVar = this.b;
            kaf kafVar = new kaf(this.c);
            cxt cxtVar = this.d.a;
            this.a = 1;
            obj = cxj.j(cwpVar.a, kafVar, cxtVar, null, this, 12);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int i2 = ((cxr) obj).a;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwq(this.b, this.c, this.d, ffguVar);
    }
}
