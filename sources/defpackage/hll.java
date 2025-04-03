package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hll extends hmq {
    public static final hll a = new hll();

    private hll() {
        super(0, 4, 1);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [hgh, hiq] */
    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        List a2;
        hhn hhnVar = (hhn) hmvVar.c(2);
        hhn hhnVar2 = (hhn) hmvVar.c(3);
        hfr hfrVar = (hfr) hmvVar.c(1);
        hhm hhmVar = (hhm) hmvVar.c(0);
        if (hhmVar == null && (hhmVar = hfrVar.c(hhnVar)) == null) {
            hfp.h("Could not resolve state for movable content");
            throw new ffbx();
        }
        if (hjvVar.n > 0 || hjvVar.j(hjvVar.q + 1) != 1) {
            hfp.j("Check failed");
        }
        hjr hjrVar = hhmVar.a;
        int i = hjvVar.q;
        int i2 = hjvVar.i;
        int i3 = hjvVar.j;
        hjvVar.y(1);
        hjvVar.M();
        hjvVar.z();
        hjv d = hjrVar.d();
        try {
            a2 = hju.a(d, 2, hjvVar, false, true, true);
            d.A(true);
            hjvVar.B();
            hjvVar.X();
            hjvVar.q = i;
            hjvVar.i = i2;
            hjvVar.j = i3;
            him.a(hjvVar, a2, hhnVar2.c);
        } catch (Throwable th) {
            d.A(false);
            throw th;
        }
    }
}
