package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxd extends lwh implements lwn {
    private final String a;
    private final lxk b;
    private final lxk c;
    private lwv d;
    private HttpURLConnection e;
    private InputStream f;
    private boolean g;
    private int h;
    private long i;
    private long j;

    public lxd(String str, lxk lxkVar) {
        super(true);
        this.a = str;
        this.b = lxkVar;
        this.c = new lxk();
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                luj.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.i;
            if (j != -1) {
                long j2 = j - this.j;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f;
            int i3 = lvf.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.j += read;
            g(read);
            return read;
        } catch (IOException e) {
            int i4 = lvf.a;
            throw lxh.a(e, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        if (r9 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    @Override // defpackage.lwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.lwv r27) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxd.b(lwv):long");
    }

    @Override // defpackage.lwn
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        lwv lwvVar = this.d;
        if (lwvVar != null) {
            return lwvVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lwn
    public final void d() {
        try {
            InputStream inputStream = this.f;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = lvf.a;
                    throw new lxh(e, 2000, 3);
                }
            }
        } finally {
            this.f = null;
            k();
            if (this.g) {
                this.g = false;
                h();
            }
            this.e = null;
            this.d = null;
        }
    }

    @Override // defpackage.lwh, defpackage.lwn
    public final Map e() {
        HttpURLConnection httpURLConnection = this.e;
        return httpURLConnection == null ? enoz.a : new lxc(httpURLConnection.getHeaderFields());
    }
}
