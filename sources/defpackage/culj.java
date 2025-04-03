package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class culj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ culk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public culj(culk culkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = culkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((culj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((culp) this.b.b.b()).c();
            cuha cuhaVar = (cuha) this.b.c.b();
            this.a = 1;
            if (cuhaVar.d(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new culj(this.b, ffguVar);
    }
}
