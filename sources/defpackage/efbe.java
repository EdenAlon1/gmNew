package defpackage;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbe extends efdd {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public efbe(InputStream inputStream, List list) {
        super(inputStream);
        this.b = list;
        efdh.a(true, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((efeh) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efeh) it.next()).a();
            }
        }
        return read;
    }

    @Override // defpackage.efdd, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efeh) it.next()).a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efeh) it.next()).a();
            }
        }
        return read;
    }
}
