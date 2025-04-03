package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dirt extends FilterOutputStream {
    static final diyy a = dizd.a(177202284);
    private final long b;
    private final int c;
    private final dips d;
    private final String e;
    private int f;
    private int g;

    public dirt(long j, int i, int i2, OutputStream outputStream, dips dipsVar, String str) {
        this(j, i2, outputStream, dipsVar, str);
        this.f = i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        long j = FileTransferEvent.j(this.f, this.c);
        this.d.b(((Boolean) a.a()).booleanValue() ? new FileTransferEvent(20012, this.b, j, this.e) : new FileTransferEvent(20012, this.b, j), dkuj.FILE_TRANSFER_PROGRESS_OUTPUT_STREAM);
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f += i2;
        int i3 = this.g + i2;
        this.g = i3;
        if (i3 > 20480) {
            this.g = i3 - 20480;
            flush();
        }
        super.write(bArr, i, i2);
    }

    public dirt(long j, int i, OutputStream outputStream, dips dipsVar, String str) {
        super(outputStream);
        this.b = j;
        this.c = i;
        this.d = dipsVar;
        this.e = str;
    }
}
