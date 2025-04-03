package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alhb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ alhc c;
    final /* synthetic */ alha d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alhb(long j, alhc alhcVar, alha alhaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = alhcVar;
        this.d = alhaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alhb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (ffsw.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.c.b(this.d, 2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alhb(this.b, this.c, this.d, ffguVar);
    }
}
