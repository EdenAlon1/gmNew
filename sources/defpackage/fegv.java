package defpackage;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegv extends fegx {
    private final febs a;
    private final febo b;
    private final fevo c;

    public fegv(fefu fefuVar, int i, febs febsVar, febo feboVar, fevo fevoVar) {
        super(fefuVar, i, fevoVar);
        this.a = febsVar;
        this.b = feboVar;
        this.c = fevoVar;
    }

    @Override // defpackage.fegx
    protected final int a(Parcel parcel) {
        parcel.writeString(this.a.b);
        fegn.b(parcel, this.b);
        this.c.a();
        return this.a.a.b() ? 16 : 0;
    }

    @Override // defpackage.fegx
    protected final int b(Parcel parcel) {
        return 0;
    }

    final void c(fdys fdysVar) {
        this.b.e(fend.b);
        long max = Math.max(0L, fdysVar.b(TimeUnit.NANOSECONDS));
        this.b.g(fend.b, Long.valueOf(max));
    }
}
