package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvv extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ drwc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvv(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object bj;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        String str = null;
        if (this.c != 0) {
            obj2 = this.b;
            bj = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            drwc drwcVar = this.d;
            bj = drwcVar.bj();
            drua druaVar = new drua(drwcVar.bh());
            aepl aeplVar = this.d.an;
            if (aeplVar == null) {
                ffkj.c("accountSignIn");
                aeplVar = null;
            }
            this.a = bj;
            this.b = druaVar;
            this.c = 1;
            obj = aeplVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = druaVar;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str2 = this.d.al;
        if (str2 == null) {
            ffkj.c("mimeType");
        } else {
            str = str2;
        }
        ((aesp) bj).b((druc) obj2, booleanValue, str);
        this.d.ai.invoke();
        this.d.hw();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drvv(this.d, ffguVar);
    }
}
