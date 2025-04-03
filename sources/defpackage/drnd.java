package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drnd implements drka<drnd, drkf> {
    private static final drlv a;
    public static final ffbz b;
    private final String d;

    static {
        new drmu("*");
        a = drlv.a;
        b = ffca.a(new ffix() { // from class: drmf
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbz ffbzVar = drnd.b;
                return ffdx.g(drmy.a, drnc.a, drnb.a, drmh.a, drmk.a, drmm.a, drmo.a, drms.a, drmr.a, drmw.a);
            }
        });
    }

    public drnd(String str) {
        this.d = str;
    }

    @Override // defpackage.drka
    public String a() {
        return this.d;
    }

    @Override // defpackage.drka
    public final drlw b() {
        return a;
    }

    @Override // defpackage.drka
    public final /* synthetic */ drlx c() {
        return drjy.a(this);
    }
}
