package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debk {
    public static final entd a = entd.c("BugleWearable");
    public static final cfva b = cfvl.n(cfvl.b, "simulate_roaming_in_eu", false);
    public final ffbz c;
    public final ffbz d;
    private final ctwb e;

    public debk(ctwb ctwbVar) {
        ctwbVar.getClass();
        this.e = ctwbVar;
        this.c = ffca.a(new ffix() { // from class: debi
            @Override // defpackage.ffix
            public final Object invoke() {
                boolean t;
                if (((Boolean) debk.b.e()).booleanValue()) {
                    ensz enszVar = (ensz) debk.a.h();
                    enszVar.Y(csux.O, "WearSubscriptionUtil");
                    enszVar.q("Device is simulating roaming in EU and isMccInEU sets to true ");
                    t = true;
                } else {
                    String v = debk.this.a().v();
                    ensz enszVar2 = (ensz) debk.a.h();
                    enszVar2.Y(csux.O, "WearSubscriptionUtil");
                    enszVar2.t("isMccInEu: simOperator=%s", v);
                    v.getClass();
                    t = ffpc.t(v, "2");
                }
                return Boolean.valueOf(t);
            }
        });
        this.d = ffca.a(new ffix() { // from class: debj
            @Override // defpackage.ffix
            public final Object invoke() {
                boolean C;
                if (((Boolean) debk.b.e()).booleanValue()) {
                    ensz enszVar = (ensz) debk.a.h();
                    enszVar.Y(csux.O, "WearSubscriptionUtil");
                    enszVar.q("Device is simulating roaming in EU and isRoaming sets to true ");
                    C = true;
                } else {
                    C = debk.this.a().C();
                    ensz enszVar2 = (ensz) debk.a.h();
                    enszVar2.Y(csux.O, "WearSubscriptionUtil");
                    enszVar2.t("isRoaming: %b", Boolean.valueOf(C));
                }
                return Boolean.valueOf(C);
            }
        });
    }

    public final ctwi a() {
        ctwb ctwbVar = this.e;
        return ctwbVar.h(ctwbVar.c());
    }
}
