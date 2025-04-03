package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egha extends egga {
    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private Bitmap f;
    private byte g;

    @Override // defpackage.egga
    public final eggb a() {
        String str;
        Bitmap bitmap;
        if (this.g == 15 && (str = this.e) != null && (bitmap = this.f) != null) {
            return new eghb(this.a, this.b, this.c, this.d, str, bitmap);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" skinTone");
        }
        if ((this.g & 2) == 0) {
            sb.append(" hue");
        }
        if ((this.g & 4) == 0) {
            sb.append(" saturation");
        }
        if ((this.g & 8) == 0) {
            sb.append(" lightness");
        }
        if (this.e == null) {
            sb.append(" url");
        }
        if (this.f == null) {
            sb.append(" bitmap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egga
    public final void b(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.f = bitmap;
    }

    @Override // defpackage.egga
    public final void c(int i) {
        this.b = i;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.egga
    public final void d(int i) {
        this.d = i;
        this.g = (byte) (this.g | 8);
    }

    @Override // defpackage.egga
    public final void e(int i) {
        this.c = i;
        this.g = (byte) (this.g | 4);
    }

    @Override // defpackage.egga
    public final void f(int i) {
        this.a = i;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.egga
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.e = str;
    }
}
