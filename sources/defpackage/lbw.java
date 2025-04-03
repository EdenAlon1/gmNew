package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lcc b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbw(lcc lccVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lccVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lbw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.d;
        ffrq ffrqVar = new ffrq();
        lct lctVar = new lct(this.c, ffrqVar, this.b.c.a(), ffskVar.hT());
        ldc ldcVar = this.b.f;
        Object b = ldcVar.c.b(lctVar);
        if (b instanceof ffwq) {
            Throwable b2 = ffws.b(b);
            if (b2 == null) {
                throw new ffwy("Channel was closed normally");
            }
            throw b2;
        }
        if (!ffws.c(b)) {
            throw new IllegalStateException("Check failed.");
        }
        if (ldcVar.d.a.getAndIncrement() == 0) {
            ffqy.d(ldcVar.a, null, null, new ldb(ldcVar, null), 3);
        }
        this.a = 1;
        Object B = ffrqVar.B(this);
        return B == ffhhVar ? ffhhVar : B;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lbw lbwVar = new lbw(this.b, this.c, ffguVar);
        lbwVar.d = obj;
        return lbwVar;
    }
}
