package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gas extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gas(eey eeyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gas) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object j;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eey eeyVar = this.b;
                int b = eeyVar.b() - 1;
                this.a = 1;
                j = eeyVar.j(b, 0, this);
                if (j == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gas(this.b, ffguVar);
    }
}
