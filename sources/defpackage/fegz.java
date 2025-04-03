package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegz extends InputStream implements InputStreamRetargetInterface {
    public final Parcelable.Creator a;
    public final boolean b;
    public final Parcelable c;
    InputStream d;
    Parcelable e;

    public fegz(Parcelable.Creator creator, Parcelable parcelable, boolean z) {
        this.a = creator;
        this.c = parcelable;
        this.b = z;
        boolean z2 = true;
        if (creator == null && !z) {
            z2 = false;
        }
        emxf.a(z2);
    }

    private final InputStream b() {
        if (this.d == null) {
            Parcelable parcelable = this.c;
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(parcelable, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            this.d = new ByteArrayInputStream(marshall);
        }
        return this.d;
    }

    final int a(Parcel parcel) {
        Parcelable parcelable = this.c;
        int dataPosition = parcel.dataPosition();
        parcel.writeParcelable(this.c, parcelable.describeContents());
        return parcel.dataPosition() - dataPosition;
    }

    @Override // java.io.InputStream
    public final int available() {
        return b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return b().read();
    }

    @Override // java.io.InputStream
    public final void reset() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        return b().skip(j);
    }

    public final String toString() {
        return "ParcelableInputStream[V: " + String.valueOf(this.c) + "]";
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return b().read(bArr, i, i2);
    }
}
