package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahzg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzf(ahzg ahzgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahzgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ahzg ahzgVar = this.b;
            ffxx b = ahzgVar.b.b();
            ahze ahzeVar = new ahze(ahzgVar);
            this.a = 1;
            if (b.a(ahzeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahzf(this.b, ffguVar);
    }
}
