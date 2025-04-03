package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegy implements Closeable {
    private Parcel a;

    public fegy(Parcel parcel) {
        this.a = parcel;
    }

    public static fegy c() {
        return new fegy(Parcel.obtain());
    }

    public final Parcel a() {
        emxf.m(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel a = a();
        this.a = null;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
