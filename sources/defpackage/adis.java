package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adis extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adit b;
    final /* synthetic */ eivt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adis(adit aditVar, eivt eivtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aditVar;
        this.c = eivtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adis) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cutv cutvVar = (cutv) this.b.a.b();
            eisx a = this.c.a();
            a.getClass();
            this.a = 1;
            obj = cutvVar.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adis(this.b, this.c, ffguVar);
    }
}
