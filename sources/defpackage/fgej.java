package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgej extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgen b;
    final /* synthetic */ ffxy c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgej(fgen fgenVar, ffxy ffxyVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgenVar;
        this.c = ffxyVar;
        this.d = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgej) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgen fgenVar = this.b;
            ffxy ffxyVar = this.c;
            Object obj2 = this.d;
            this.a = 1;
            if (fgenVar.e.a(ffxyVar, obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgej(this.b, this.c, this.d, ffguVar);
    }
}
