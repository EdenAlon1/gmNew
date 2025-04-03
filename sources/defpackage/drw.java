package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dse b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drw(dse dseVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dseVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dse dseVar = this.b;
            long j = this.c;
            this.a = 1;
            if (dseVar.b.h(j, false, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drw(this.b, this.c, ffguVar);
    }
}
