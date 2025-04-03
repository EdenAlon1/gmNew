package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class azbq {
    private final avrk a;

    public azbq(avrk avrkVar) {
        this.a = avrkVar;
    }

    @Deprecated
    public final avlk a(aoku aokuVar) {
        return aokuVar.e().isEmpty() ? avlk.d() : avlk.b(b((awui) aokuVar.e().get()).a());
    }

    public final avmz b(awui awuiVar) {
        try {
            return (avmz) erqt.q(this.a.b(awuiVar));
        } catch (ExecutionException e) {
            axnw.d(e);
            throw new AssertionError("RcsCapabilitiesSyncGetter should have crashed.");
        }
    }
}
