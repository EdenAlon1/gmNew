package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dng extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dni b;
    final /* synthetic */ dhy c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dng(dni dniVar, dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dniVar;
        this.c = dhyVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dng) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dni dniVar = this.b;
            dhy dhyVar = this.c;
            dnf dnfVar = new dnf(dniVar, this.d, null);
            this.a = 1;
            if (dniVar.b.b(dniVar.d, dhyVar, dnfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dng(this.b, this.c, this.d, ffguVar);
    }
}
