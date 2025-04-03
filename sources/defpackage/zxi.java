package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zxk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxi(zxk zxkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl c = ((csyy) this.b.f.b()).c(((cqoh) this.b.e.b()).f().toEpochMilli());
            c.getClass();
            this.a = 1;
            if (fgfz.c(c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zxi(this.b, ffguVar);
    }
}
