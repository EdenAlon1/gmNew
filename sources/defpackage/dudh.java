package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dudh implements Closeable {
    public static final enru a = enru.c("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient");
    public final feau b;
    public final eyev c;
    public final Boolean d;

    public dudh(feau feauVar, eyev eyevVar, Boolean bool) {
        this.b = feauVar;
        this.c = eyevVar;
        this.d = bool;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "close", 61, "GellerOnePlatformClient.java")).q("Shutting down managed channel.");
        try {
            this.b.d();
            this.b.f(TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "close", 'C', "GellerOnePlatformClient.java")).q("Failed to shut down managed channel");
        }
    }
}
