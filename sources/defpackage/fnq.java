package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fnv b;
    final /* synthetic */ iyi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnq(fnv fnvVar, iyi iyiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fnvVar;
        this.c = iyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fnq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fnv fnvVar = this.b;
            if (fnvVar != null) {
                iyi iyiVar = this.c;
                int i2 = fnvVar.b;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 - 1 != 0) {
                    throw new ffcd();
                }
                long a = iyiVar != null ? iyiVar.a(4000L, false) : 4000L;
                this.a = 1;
                if (ffsw.c(a, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        this.b.a();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fnq(this.b, this.c, ffguVar);
    }
}
