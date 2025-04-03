package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcv implements Serializable, ffbz {
    private ffix a;
    private Object b = ffcr.a;

    public ffcv(ffix ffixVar) {
        this.a = ffixVar;
    }

    private final Object writeReplace() {
        return new ffbw(a());
    }

    @Override // defpackage.ffbz
    public final Object a() {
        if (this.b == ffcr.a) {
            ffix ffixVar = this.a;
            ffixVar.getClass();
            this.b = ffixVar.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.ffbz
    public final boolean b() {
        return this.b != ffcr.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
