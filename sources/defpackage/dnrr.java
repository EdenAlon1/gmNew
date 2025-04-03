package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrr(long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnrr(this.b, ffguVar);
    }
}
