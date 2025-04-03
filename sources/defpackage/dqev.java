package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqev extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfc b;
    final /* synthetic */ dqfs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqev(dqfc dqfcVar, dqfs dqfsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
        this.c = dqfsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b.f().a;
            dqeu dqeuVar = new dqeu(this.c);
            this.a = 1;
            if (ffyk.b(ffxxVar, dqeuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqev(this.b, this.c, ffguVar);
    }
}
