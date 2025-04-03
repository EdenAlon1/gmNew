package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cguq implements cgun {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RcsOnboardingFlagsConfigurationListener");
    private final ffbr b;

    public cguq(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cgun
    public final elfl a(engw engwVar) {
        int i = engw.d;
        engr engrVar = new engr();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            cgue cgueVar = (cgue) engwVar.get(i2);
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RcsOnboardingFlagsConfigurationListener", "onNewConfig", 33, "RcsOnboardingFlagsConfigurationListener.java")).t("Rcs flags configuration id updated: %s", cgueVar.d());
            engrVar.h(((ckaj) this.b.b()).e(cgueVar.b()));
        }
        return elfo.l(engrVar.g()).a(new Callable() { // from class: cgup
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }
}
