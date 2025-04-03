package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ras {
    private final rax a;
    private final rar b;

    public ras(kst kstVar) {
        rax raxVar = new rax(kstVar);
        this.b = new rar();
        this.a = raxVar;
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final synchronized List b(Class cls) {
        raq raqVar = (raq) this.b.a.get(cls);
        List list = raqVar == null ? null : raqVar.a;
        if (list != null) {
            return list;
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(this.a.b(cls));
        if (((raq) this.b.a.put(cls, new raq(unmodifiableList))) == null) {
            return unmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    public final synchronized void c(Class cls, Class cls2, rap rapVar) {
        this.a.d(cls, cls2, rapVar);
        this.b.a();
    }

    public final synchronized void d(Class cls, Class cls2, rap rapVar) {
        this.a.e(cls, cls2, rapVar);
        this.b.a();
    }
}
