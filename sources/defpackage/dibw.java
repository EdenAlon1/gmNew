package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibw extends OutputStream {
    public volatile dibq a;
    private final OutputStream b;

    public dibw(OutputStream outputStream) {
        this.b = outputStream;
    }

    private final IOException a(IOException iOException) {
        if (this.a == null) {
            return iOException;
        }
        if (Log.isLoggable("ChannelOutputStream", 2)) {
            Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new dhza();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.b.write(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        try {
            this.b.write(bArr);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.b.write(bArr, i, i2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
