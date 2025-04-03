package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekri {
    public ekrk a;
    private long b = -1;

    public final ekrj a() {
        return new ekre(this.a, this.b);
    }

    public final void b(long j, TimeUnit timeUnit) {
        emxf.a(true);
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
