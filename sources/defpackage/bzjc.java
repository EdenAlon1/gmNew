package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjc(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        elfl k = ((cgxw) this.b.g.b()).k();
        this.a = 1;
        if (fgfz.c(k, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzjc(this.b, ffguVar);
    }
}
