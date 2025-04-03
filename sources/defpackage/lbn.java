package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbn extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ lcc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbn(lcc lccVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = lccVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ldh ldhVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        try {
        } catch (Throwable th) {
            lcs c = this.c.c();
            this.a = th;
            this.b = 2;
            Object d = c.d();
            if (d != ffhhVar) {
                obj2 = th;
                obj = d;
            }
        }
        if (i == 0) {
            ffci.b(obj);
            lcc lccVar = this.c;
            this.b = 1;
            obj = lccVar.k(true, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i != 1) {
                obj2 = this.a;
                ffci.b(obj);
                ldhVar = new lcw((Throwable) obj2, ((Number) obj).intValue());
                return new ffcf(ldhVar, true);
            }
            ffci.b(obj);
        }
        ldhVar = (ldh) obj;
        return new ffcf(ldhVar, true);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lbn(this.c, (ffgu) obj).b(ffcu.a);
    }
}
