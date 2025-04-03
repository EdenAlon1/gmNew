package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import j$.time.Duration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class diud implements Runnable {
    private final diuc a;
    private final ffbr b;
    public final long c;
    public final InstantMessageConfiguration d;
    public final String e;
    protected final dips f;
    protected final Context g;
    protected final dijy h;
    public int i = 0;
    public volatile boolean j;

    protected diud(Context context, long j, String str, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, dips dipsVar, dijy dijyVar, ffbr ffbrVar) {
        this.g = context;
        this.c = j;
        this.d = instantMessageConfiguration;
        this.e = str;
        this.a = diucVar;
        this.f = dipsVar;
        this.h = dijyVar;
        this.b = ffbrVar;
    }

    protected static final long h(diqh diqhVar) {
        int i = ((diqd) diqhVar).a;
        if (i == 1) {
            return 201L;
        }
        if (i == 2) {
            return 202L;
        }
        if (i == 3 || i == 4) {
            return 203L;
        }
        dkty.g("Invalid type %d", Integer.valueOf(i));
        return 8L;
    }

    public void a() {
        this.j = true;
    }

    protected final void b(diqh diqhVar) {
        this.i++;
        this.a.c(diqhVar);
    }

    protected final void c(byte[] bArr, Uri uri) {
        this.a.b(bArr, uri);
    }

    protected final void d(int i, long j) {
        this.f.c(new FileTransferEvent(i, this.c, j, this.e), dkuj.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    protected final void e() {
        if (this.j) {
            throw new IOException("Cancelled");
        }
    }

    public final byte[] f(InputStream inputStream) {
        return g(inputStream, -1L);
    }

    final byte[] g(InputStream inputStream, long j) {
        e();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            j2 += read;
            if (j != -1 && j2 > j) {
                this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE);
                throw new IOException("Data corrupted, expected " + j + " bytes but received " + j2 + " bytes");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    protected final void i(long j, Duration duration) {
        this.f.c(new FileTransferEvent(20013, this.c, j, this.e, duration), dkuj.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    public String toString() {
        return "File ID " + this.e + ", session ID " + this.c + ", failure count " + this.i + ", cancelled " + this.j;
    }
}
