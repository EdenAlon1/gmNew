package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzt extends ekxs {
    public static final ekzt a = new ekzt(UUID.randomUUID());

    private ekzt(UUID uuid) {
        super("<skip trace>", uuid, elad.a, ekyf.b());
    }

    @Override // defpackage.elat
    public final elae l() {
        return elad.a;
    }

    @Override // defpackage.elat
    public final elat m(String str, elae elaeVar, elao elaoVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.elat
    public final boolean q() {
        return false;
    }

    @Override // defpackage.elat
    public final void s() {
    }

    @Override // defpackage.elat
    public final void n(int i) {
    }

    @Override // defpackage.elat
    public final void p(boolean z) {
    }

    @Override // defpackage.elat
    public final void o(elab elabVar, Object obj) {
    }
}
