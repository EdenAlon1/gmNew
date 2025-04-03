package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ oia b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohx(oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx c = fgau.c(this.b.f.b(ofz.c), this.b.f.b(ofz.b));
            ohw ohwVar = new ohw(this.b, null);
            this.a = 1;
            obj = fgbj.d(c, ohwVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        olp olpVar = (olp) obj;
        if (olpVar != null) {
            oia oiaVar = this.b;
            if (oka.a(3)) {
                oka.b(3, "Jump triggered on PagingSource " + oiaVar.a + " by " + olpVar);
            }
            this.b.e.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ohx(this.b, ffguVar);
    }
}
