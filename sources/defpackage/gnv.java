package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ goa b;
    final /* synthetic */ iyi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnv(goa goaVar, iyi iyiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = goaVar;
        this.c = iyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            goa goaVar = this.b;
            if (goaVar != null) {
                gob gobVar = goaVar.b;
                boolean z = gobVar.b != null;
                iyi iyiVar = this.c;
                int i2 = gobVar.d - 1;
                long j = i2 != 1 ? i2 != 2 ? 4000L : Long.MAX_VALUE : 10000L;
                if (iyiVar != null) {
                    j = iyiVar.a(j, z);
                }
                this.a = 1;
                if (ffsw.c(j, this) == ffhhVar) {
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
        return new gnv(this.b, this.c, ffguVar);
    }
}
