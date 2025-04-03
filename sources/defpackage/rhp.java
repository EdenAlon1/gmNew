package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhp {
    private final List a = new ArrayList();

    public final synchronized qta a(Class cls) {
        for (rho rhoVar : this.a) {
            if (rhoVar.a.isAssignableFrom(cls)) {
                return rhoVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, qta qtaVar) {
        this.a.add(new rho(cls, qtaVar));
    }
}
