package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffyr extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ fflb d;
    final /* synthetic */ ffxy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffyr(fflb fflbVar, ffxy ffxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = fflbVar;
        this.e = ffxyVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffyr) c(new ffws(((ffws) obj).b), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b == 0) {
            ffci.b(obj);
            Object obj3 = ((ffws) this.c).b;
            fflb fflbVar = this.d;
            boolean z = obj3 instanceof ffwr;
            if (!z) {
                fflbVar.a = obj3;
            }
            ffxy ffxyVar = this.e;
            if (z) {
                Throwable b = ffws.b(obj3);
                if (b != null) {
                    throw b;
                }
                Object obj4 = fflbVar.a;
                if (obj4 != null) {
                    if (obj4 == fgfg.a) {
                        obj4 = null;
                    }
                    this.c = obj3;
                    this.a = fflbVar;
                    this.b = 1;
                    if (ffxyVar.fQ(obj4, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
                obj2 = fflbVar;
            }
            return ffcu.a;
        }
        obj2 = this.a;
        ffci.b(obj);
        ((fflb) obj2).a = fgfg.c;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ffyr ffyrVar = new ffyr(this.d, this.e, ffguVar);
        ffyrVar.c = obj;
        return ffyrVar;
    }
}
