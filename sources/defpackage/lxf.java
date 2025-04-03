package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxf extends lwh {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public lxf() {
        super(false);
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = lvf.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (read > 0) {
                this.c -= read;
                g(read);
            }
            return read;
        } catch (IOException e) {
            throw new lxe(e, 2000);
        }
    }

    @Override // defpackage.lwn
    public final long b(lwv lwvVar) {
        Uri uri = lwvVar.a;
        this.b = uri;
        j();
        try {
            String path = uri.getPath();
            lti.f(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(lwvVar.e);
                long j = lwvVar.f;
                long length = this.a.length() - lwvVar.e;
                this.c = length;
                if (length < 0) {
                    throw new lxe(null, null, 2008);
                }
                this.d = true;
                i(lwvVar);
                return this.c;
            } catch (IOException e) {
                throw new lxe(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new lxe(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new lxe(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new lxe(e3, 2006);
        } catch (RuntimeException e4) {
            throw new lxe(e4, 2000);
        }
    }

    @Override // defpackage.lwn
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.lwn
    public final void d() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new lxe(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
