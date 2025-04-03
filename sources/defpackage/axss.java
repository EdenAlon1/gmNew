package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axss extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffkz c;
    final /* synthetic */ ffxy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axss(ffkz ffkzVar, ffxy ffxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffkzVar;
        this.d = ffxyVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axss) c(new ffws(((ffws) obj).b), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Object obj3 = ((ffws) this.b).b;
            this.c.a++;
            ffxy ffxyVar = this.d;
            if (!(obj3 instanceof ffwr)) {
                this.b = obj3;
                this.a = 1;
                if (ffxyVar.fQ(obj3, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            obj2 = obj3;
        }
        if (!(obj2 instanceof ffwq)) {
            return true;
        }
        ffws.b(obj2);
        return false;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axss axssVar = new axss(this.c, this.d, ffguVar);
        axssVar.b = obj;
        return axssVar;
    }
}
