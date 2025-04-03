package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dita extends AbstractHttpEntity {
    public final dirb a;
    public final FileTransferInfo b;
    private final long c;
    private final long d;
    private final dips e;
    private final djqt f;
    private final String g;

    public dita(long j, dirb dirbVar, FileTransferInfo fileTransferInfo, dips dipsVar, djqt djqtVar, String str) {
        this.c = j;
        this.a = dirbVar;
        this.b = fileTransferInfo;
        this.d = (fileTransferInfo.f - dirbVar.a) - 1;
        this.e = dipsVar;
        this.f = djqtVar;
        this.g = str;
        String str2 = fileTransferInfo.b;
        str2.getClass();
        setContentType(str2);
    }

    @Override // org.apache.http.HttpEntity
    public final InputStream getContent() {
        InputStream b = this.f.b(this.b.a().toString());
        long j = this.a.a + 1;
        for (long j2 = 0; j2 < j; j2 += b.skip(j - j2)) {
        }
        return b;
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.d;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) {
        dirt dirtVar = new dirt(this.c, (int) this.a.a, (int) this.b.f, outputStream, this.e, this.g);
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    dirtVar.flush();
                    return;
                }
                dirtVar.write(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }
}
