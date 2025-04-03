package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgrx extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public fgrx(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgrx) c((drja) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((drja) this.a).l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgrx fgrxVar = new fgrx(ffguVar);
        fgrxVar.a = obj;
        return fgrxVar;
    }
}
