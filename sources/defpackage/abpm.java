package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abpm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abpn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpm(abpn abpnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abpnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abpm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final abpn abpnVar = this.b;
            ffji ffjiVar = new ffji() { // from class: abpl
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ablu abluVar = (ablu) obj2;
                    long epochMilli = abpn.this.c.f().toEpochMilli();
                    abluVar.copyOnWrite();
                    ablv ablvVar = (ablv) abluVar.instance;
                    ablv ablvVar2 = ablv.a;
                    ablvVar.c = epochMilli;
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ctzl.b(abpnVar.b, ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abpm(this.b, ffguVar);
    }
}
