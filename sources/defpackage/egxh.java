package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ god b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egxh(god godVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = godVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            god godVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = godVar.c(str, null, false, 2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egxh(this.b, this.c, ffguVar);
    }
}
