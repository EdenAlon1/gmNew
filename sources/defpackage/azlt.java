package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlt extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ azop c;
    final /* synthetic */ djrj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azlt(azop azopVar, djrj djrjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = azopVar;
        this.d = djrjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azlt) c((azmp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            azmp azmpVar = (azmp) this.b;
            this.c.b();
            this.a = 1;
            if (azmpVar.p() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azlt azltVar = new azlt(this.c, this.d, ffguVar);
        azltVar.b = obj;
        return azltVar;
    }
}
