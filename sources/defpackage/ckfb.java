package defpackage;

import android.os.TransactionTooLargeException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfb {
    private static final cskc a = cskc.g("BugleRcs", "ClientInfoProvider");
    private Optional b = Optional.empty();

    final boolean a() {
        if (this.b.isEmpty()) {
            try {
                this.b = Optional.of(false);
            } catch (TransactionTooLargeException | RuntimeException e) {
                a.s("Unable to get list of installed applications ", e);
            }
        }
        return ((Boolean) this.b.orElse(true)).booleanValue();
    }
}
