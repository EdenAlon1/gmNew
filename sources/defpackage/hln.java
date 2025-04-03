package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hln extends hmq {
    public static final hln a = new hln();

    private hln() {
        super(0, 2, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        int i;
        hpz hpzVar = (hpz) hmvVar.c(0);
        int a2 = hjvVar.a((hen) hmvVar.c(1));
        if (hjvVar.q >= a2) {
            hfp.j("Check failed");
        }
        hmu.a(hjvVar, hepVar, a2);
        int i2 = hjvVar.q;
        int i3 = hjvVar.s;
        while (i3 >= 0 && !hjvVar.T(i3)) {
            i3 = hjvVar.l(i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (hjvVar.S(i2, i4)) {
                if (true == hjvVar.T(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += hjvVar.T(i4) ? 1 : hjvVar.k(i4);
                i4 += hjvVar.j(i4);
            }
        }
        while (true) {
            i = hjvVar.q;
            if (i >= a2) {
                break;
            }
            if (hjvVar.S(a2, i)) {
                int i6 = hjvVar.q;
                if (i6 < hjvVar.r && (hjvVar.b[(hjvVar.h(i6) * 5) + 1] & 1073741824) != 0) {
                    hepVar.d(hjvVar.w(i6));
                    i5 = 0;
                }
                hjvVar.M();
            } else {
                i5 += hjvVar.m();
            }
        }
        if (i != a2) {
            hfp.j("Check failed");
        }
        hpzVar.a = i5;
    }
}
