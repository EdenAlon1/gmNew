package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mot {
    public final Set a = new HashSet();
    public mom b;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Exception exc, boolean z) {
        this.b = null;
        Set set = this.a;
        engw n = engw.n(set);
        set.clear();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            mom momVar = (mom) n.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            momVar.g(exc, i2);
        }
    }

    public final void b(mom momVar) {
        this.a.add(momVar);
        if (this.b != null) {
            return;
        }
        this.b = momVar;
        momVar.i();
    }
}
