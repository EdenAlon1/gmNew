package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llw implements lkp {
    private final lme a;

    public llw(lme lmeVar) {
        this.a = lmeVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar != lki.ON_CREATE) {
            Objects.toString(lkiVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(lkiVar.toString()));
        }
        lkrVar.P().d(this);
        this.a.b();
    }
}
