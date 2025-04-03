package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cusn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuso b;
    final /* synthetic */ cusr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusn(cuso cusoVar, cusr cusrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cusoVar;
        this.c = cusrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cusm cusmVar = (cusm) this.b.a.b();
            cusr cusrVar = this.c;
            this.a = 1;
            if (cusmVar.a(cusrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cusn(this.b, this.c, ffguVar);
    }
}
