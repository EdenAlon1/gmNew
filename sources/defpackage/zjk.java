package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zjt b;
    final /* synthetic */ alxr c;
    final /* synthetic */ fgdj d;
    final /* synthetic */ ffix e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjk(zjt zjtVar, alxr alxrVar, fgdj fgdjVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zjtVar;
        this.c = alxrVar;
        this.d = fgdjVar;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjk) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zjj zjjVar = new zjj((ffxy) this.f, this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (ffsl.a(zjjVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zjk zjkVar = new zjk(this.b, this.c, this.d, this.e, ffguVar);
        zjkVar.f = obj;
        return zjkVar;
    }
}
