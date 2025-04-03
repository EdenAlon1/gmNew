package defpackage;

import android.os.Trace;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espa {
    public static final entd a = entd.c("SqlStatementShared");
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;

    public final Status a(long j) {
        Status a2;
        Trace.beginSection("SqlStatement.bindInt");
        try {
            try {
                this.c.add(String.valueOf(j));
                this.b.add(Long.valueOf(j));
                a2 = Status.b;
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindInt", 'Q', "SqlStatementShared.java")).q("Error binding int to SqlStatement.");
                a2 = esoy.a(e);
            }
            Trace.endSection();
            return a2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Status b(byte[] bArr) {
        Status a2;
        if (bArr == null) {
            ((ensz) ((ensz) a.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", 27, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindString");
        try {
            try {
                int length = bArr.length;
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = (char) bArr[i];
                }
                this.c.add(new String(cArr));
                this.b.add(new String(cArr));
                a2 = Status.b;
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", '1', "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
                a2 = esoy.a(e);
            }
            Trace.endSection();
            return a2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void c() {
        this.b.clear();
        this.c.clear();
    }
}
