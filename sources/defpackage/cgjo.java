package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgjo implements eiyb {
    private static final cskc a = cskc.g("Lighter", "LighterAccountCleanupInterceptor");
    private final ffbr b;

    public cgjo(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.eiyb
    public final ListenableFuture b(eiyc eiycVar) {
        if (((Optional) this.b.b()).isEmpty() || !cgje.a()) {
            return erqt.i(null);
        }
        a.p("Start Lighter cleanup task for removed account");
        return ((cgjp) ((Optional) this.b.b()).get()).e(((eizj) eiycVar).b);
    }
}
