package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffck implements Serializable, ffbz {
    private ffix a;
    private volatile Object b = ffcr.a;
    private final Object c = this;

    public /* synthetic */ ffck(ffix ffixVar) {
        this.a = ffixVar;
    }

    private final Object writeReplace() {
        return new ffbw(a());
    }

    @Override // defpackage.ffbz
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != ffcr.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == ffcr.a) {
                ffix ffixVar = this.a;
                ffixVar.getClass();
                obj = ffixVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.ffbz
    public final boolean b() {
        return this.b != ffcr.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
