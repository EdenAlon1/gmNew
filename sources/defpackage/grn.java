package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ grr b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grn(grr grrVar, float f, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = grrVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b.d;
            if (cxjVar != null) {
                Float f = new Float(this.c);
                grr grrVar = this.b;
                cxt cxtVar = grrVar.c ? gpn.a : grrVar.b;
                this.a = 1;
                obj = cxj.j(cxjVar, f, cxtVar, null, this, 12);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new grn(this.b, this.c, ffguVar);
    }
}
