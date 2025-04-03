package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axpv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ fflb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpv(ffji ffjiVar, Object obj, long j, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
        this.c = obj;
        this.d = j;
        this.e = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axpv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.invoke(this.c);
            long j = this.d;
            this.a = 1;
            if (ffsw.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.e.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axpv(this.b, this.c, this.d, this.e, ffguVar);
    }
}
