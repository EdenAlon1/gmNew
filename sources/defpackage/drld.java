package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drld implements drka<drld, drkd> {
    public static final drkw b = new drkw("*");
    public static final drlu d = drlu.a;
    public static final ffbz e = ffca.a(new ffix() { // from class: drkh
        @Override // defpackage.ffix
        public final Object invoke() {
            drkw drkwVar = drld.b;
            return ffdx.g(drkk.a, drkm.a, drko.a, drkq.a, drks.a, drku.a, drky.a, drla.a, drlc.a);
        }
    });
    private final String a;

    public drld(String str) {
        this.a = str;
    }

    @Override // defpackage.drka
    public String a() {
        return this.a;
    }

    @Override // defpackage.drka
    public final drlw b() {
        return d;
    }

    @Override // defpackage.drka
    public final /* synthetic */ drlx c() {
        return drjy.a(this);
    }
}
