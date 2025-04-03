package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eccz implements fbba {
    public static ecdc a(ffbr ffbrVar, ffbr ffbrVar2) {
        if (!efbd.g()) {
            ecct ecctVar = (ecct) ffbrVar2.b();
            if (!ecct.b()) {
                ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java")).t("Primes init triggered from background in package: %s", ecctVar.a);
                if (!ecctVar.a()) {
                    throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", ecctVar.a));
                }
            }
        }
        return new ecdc((ecdd) ffbrVar.b());
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
