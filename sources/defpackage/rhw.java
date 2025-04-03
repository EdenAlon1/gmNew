package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhw {
    private final List a = new ArrayList();

    public final synchronized qtx a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            rhv rhvVar = (rhv) this.a.get(i);
            if (rhvVar.a.isAssignableFrom(cls)) {
                return rhvVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, qtx qtxVar) {
        this.a.add(new rhv(cls, qtxVar));
    }
}
