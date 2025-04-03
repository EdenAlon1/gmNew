package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/common/PairingDesktopObserver");
    public final AtomicReference b = new AtomicReference();

    public final void a(fcek fcekVar) {
        this.b.set(fcekVar);
    }

    public final boolean b(fcek fcekVar) {
        return Objects.equals(fcekVar, this.b.get());
    }
}
