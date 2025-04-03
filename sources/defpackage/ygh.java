package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ygi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygh(ygi ygiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ygiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ygh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ffyy.a(new ygg(this.b.c.a));
            ygd ygdVar = new ygd(this.b);
            this.a = 1;
            if (a.a(ygdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ygh(this.b, ffguVar);
    }
}
