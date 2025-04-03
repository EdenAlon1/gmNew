package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class firy extends firv implements Serializable, firs {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long a;

    protected firy(long j) {
        this.a = j;
    }

    @Override // defpackage.firs
    public long getMillis() {
        return this.a;
    }
}
