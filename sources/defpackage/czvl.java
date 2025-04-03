package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czvl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ czvw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czvl(czvw czvwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = czvwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czvl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl h = this.b.d.h();
            this.a = 1;
            obj = fgfz.c(h, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        czvy czvyVar = (czvy) obj;
        if (czvyVar.e) {
            return "";
        }
        String str = czvyVar.f;
        str.getClass();
        return str;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czvl(this.b, ffguVar);
    }
}
