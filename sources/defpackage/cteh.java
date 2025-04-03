package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cteh extends cteq {
    public String a;
    public String b;
    private Uri c;
    private File d;
    private long e;
    private double f;
    private boolean g;
    private double h;
    private byte i;

    @Override // defpackage.cteq
    public final cter a() {
        Uri uri;
        File file;
        if (this.i == 15 && (uri = this.c) != null && (file = this.d) != null) {
            return new ctei(uri, file, this.e, this.f, this.g, this.h, this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" sourceUri");
        }
        if (this.d == null) {
            sb.append(" outputPath");
        }
        if ((this.i & 1) == 0) {
            sb.append(" sizeLimit");
        }
        if ((this.i & 2) == 0) {
            sb.append(" bitrateLimitFactor");
        }
        if ((this.i & 4) == 0) {
            sb.append(" enableHighBudgetVideoCompression");
        }
        if ((this.i & 8) == 0) {
            sb.append(" mmsVideoCompressionFudgeFactor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cteq
    public final void b(double d) {
        this.f = d;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.cteq
    public final void c(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.cteq
    public final void d(double d) {
        this.h = d;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.cteq
    public final void e(File file) {
        if (file == null) {
            throw new NullPointerException("Null outputPath");
        }
        this.d = file;
    }

    @Override // defpackage.cteq
    public final void f(long j) {
        this.e = j;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.cteq
    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null sourceUri");
        }
        this.c = uri;
    }
}
