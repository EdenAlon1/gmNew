package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtfj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dtfs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtfj(ffjm ffjmVar, dtfs dtfsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = dtfsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtfj) c((dpea) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffjm ffjmVar = this.b;
            dtfs dtfsVar = this.c;
            this.a = 1;
            if (ffjmVar.a(dtfsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtfj(this.b, this.c, ffguVar);
    }
}
