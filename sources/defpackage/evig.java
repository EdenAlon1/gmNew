package defpackage;

import java.util.Collection;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evig extends enuq {
    private final Collection a;

    public evig(String str, Collection collection) {
        super(str);
        this.a = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ento
    public final void b(entl entlVar) {
        enqv it = ((engw) this.a).iterator();
        while (it.hasNext()) {
            ento entoVar = (ento) it.next();
            if (entlVar.S() || entoVar.c(entlVar.m())) {
                entoVar.b(entlVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ento
    public final boolean c(Level level) {
        enqv it = ((engw) this.a).iterator();
        while (it.hasNext()) {
            if (((ento) it.next()).c(level)) {
                return true;
            }
        }
        return false;
    }
}
