package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggp extends egfh {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private int e;
    private int f;
    private int g;
    private Bitmap h;
    private engw i;
    private byte j;

    @Override // defpackage.egfh
    public final egfi a() {
        String str;
        String str2;
        String str3;
        Bitmap bitmap;
        engw engwVar;
        if (this.j == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.d) != null && (bitmap = this.h) != null && (engwVar = this.i) != null) {
            return new eggq(str, str2, this.c, str3, this.e, this.f, this.g, bitmap, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        if ((this.j & 1) == 0) {
            sb.append(" customizable");
        }
        if (this.d == null) {
            sb.append(" displayName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" hue");
        }
        if ((this.j & 4) == 0) {
            sb.append(" saturation");
        }
        if ((this.j & 8) == 0) {
            sb.append(" lightness");
        }
        if (this.h == null) {
            sb.append(" bitmap");
        }
        if (this.i == null) {
            sb.append(" skinTones");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egfh
    public final void b(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.h = bitmap;
    }

    @Override // defpackage.egfh
    public final void c(boolean z) {
        this.c = z;
        this.j = (byte) (this.j | 1);
    }

    @Override // defpackage.egfh
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.d = str;
    }

    @Override // defpackage.egfh
    public final void e(int i) {
        this.e = i;
        this.j = (byte) (this.j | 2);
    }

    @Override // defpackage.egfh
    public final void f(int i) {
        this.g = i;
        this.j = (byte) (this.j | 8);
    }

    @Override // defpackage.egfh
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // defpackage.egfh
    public final void h(int i) {
        this.f = i;
        this.j = (byte) (this.j | 4);
    }

    @Override // defpackage.egfh
    public final void i(Iterable iterable) {
        this.i = engw.j(iterable);
    }

    @Override // defpackage.egfh
    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
