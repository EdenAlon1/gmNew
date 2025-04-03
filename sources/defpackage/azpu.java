package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azpu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azpw b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azpu(azpw azpwVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azpwVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azpu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azpu(this.b, this.c, ffguVar);
    }
}
