package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmu {
    public static final void a(hjv hjvVar, hep hepVar, int i) {
        while (true) {
            int i2 = hjvVar.s;
            if (i > i2 && i < hjvVar.r) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            hjvVar.K();
            if (hjvVar.T(hjvVar.s)) {
                hepVar.h();
            }
            hjvVar.X();
        }
    }
}
