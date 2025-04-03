package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axpw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ fflb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpw(ffjm ffjmVar, Object obj, Object obj2, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = obj;
        this.d = obj2;
        this.e = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axpw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d);
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.e.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axpw(this.b, this.c, this.d, this.e, ffguVar);
    }
}
