package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tph extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ eszk c;
    final /* synthetic */ tpi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tph(eszk eszkVar, tpi tpiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = eszkVar;
        this.d = tpiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tph) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        try {
        } catch (csgw e) {
            ((ensz) tpi.a.h()).q("Resetting Folsom keys and disabling CMS.");
            axld axldVar = (axld) this.d.c.b();
            this.a = e;
            this.b = 2;
            if (axldVar.f(this) != ffhhVar) {
                obj2 = e;
            }
        }
        if (i == 0) {
            ffci.b(obj);
            if (csgj.a()) {
                ((ensz) tpi.a.h()).q("BoxResetEvent received.");
                eszk eszkVar = this.c;
                eswk eswkVar = eszkVar.b == 15 ? (eswk) eszkVar.c : eswk.a;
                eswkVar.getClass();
                int i2 = eswkVar.b;
                eswj b = eswj.b(i2);
                if (b == null) {
                    b = eswj.UNRECOGNIZED;
                }
                if (b != eswj.RESET_ALL_RESOURCES) {
                    ensz enszVar = (ensz) tpi.a.h();
                    eswj b2 = eswj.b(i2);
                    if (b2 == null) {
                        b2 = eswj.UNRECOGNIZED;
                    }
                    enszVar.t("BoxResetEvent is of type %s, will not opt the user out", b2);
                    return null;
                }
                tpq tpqVar = (tpq) this.d.b.b();
                this.b = 1;
                obj = tpqVar.a(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return null;
        }
        if (i != 1) {
            obj2 = this.a;
            ffci.b(obj);
            throw ((Throwable) obj2);
        }
        ffci.b(obj);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tph(this.c, this.d, ffguVar);
    }
}
