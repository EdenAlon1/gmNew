package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fijb {
    public final fihy a;
    private final fiic b;
    private final long c;

    public fijb(fiic fiicVar, long j, long j2) {
        fihy fihyVar = new fihy();
        this.a = fihyVar;
        this.b = fiicVar;
        fihyVar.a = j;
        this.c = j2;
    }

    public final int a() {
        return (int) (SystemClock.uptimeMillis() - this.c);
    }

    public final void b() {
        fihy fihyVar = this.a;
        if (fihyVar.b < 0 || fihyVar.c < 0) {
            return;
        }
        this.b.d(fihyVar);
    }
}
