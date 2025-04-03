package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfij extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfim b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfij(ffgu ffguVar, cfim cfimVar, String str) {
        super(2, ffguVar);
        this.b = cfimVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfij) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfim cfimVar = this.b;
            String str = this.c;
            this.a = 1;
            if (cfimVar.b(str, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfij cfijVar = new cfij(ffguVar, this.b, this.c);
        cfijVar.d = obj;
        return cfijVar;
    }
}
