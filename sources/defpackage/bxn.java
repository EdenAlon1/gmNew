package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxn extends cag {
    public Integer a;
    public cai b;
    public Integer c;
    private String d;
    private Integer e;
    private Size f;
    private Integer g;
    private Integer h;
    private int i;

    public bxn() {
    }

    @Override // defpackage.cag
    public final cah a() {
        String str = this.d;
        Integer num = this.e;
        String str2 = str == null ? " mimeType" : "";
        if (num == null) {
            str2 = str2.concat(" profile");
        }
        if (this.i == 0) {
            str2 = str2.concat(" inputTimebase");
        }
        if (this.f == null) {
            str2 = str2.concat(" resolution");
        }
        if (this.a == null) {
            str2 = str2.concat(" colorFormat");
        }
        if (this.b == null) {
            str2 = str2.concat(" dataSpace");
        }
        if (this.g == null) {
            str2 = str2.concat(" frameRate");
        }
        if (this.c == null) {
            str2 = str2.concat(" IFrameInterval");
        }
        if (this.h == null) {
            str2 = str2.concat(" bitrate");
        }
        if (str2.isEmpty()) {
            return new bxo(this.d, this.e.intValue(), this.i, this.f, this.a.intValue(), this.b, this.g.intValue(), this.c.intValue(), this.h.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str2));
    }

    @Override // defpackage.cag
    public final void b(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.cag
    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.cag
    public final void d(int i) {
        if (i == 0) {
            throw new NullPointerException("Null inputTimebase");
        }
        this.i = i;
    }

    @Override // defpackage.cag
    public final void e(String str) {
        this.d = str;
    }

    @Override // defpackage.cag
    public final void f(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cag
    public final void g(Size size) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f = size;
    }

    public bxn(cah cahVar) {
        bxo bxoVar = (bxo) cahVar;
        this.d = bxoVar.a;
        this.e = Integer.valueOf(bxoVar.b);
        this.i = bxoVar.i;
        this.f = bxoVar.c;
        this.a = Integer.valueOf(bxoVar.d);
        this.b = bxoVar.e;
        this.g = Integer.valueOf(bxoVar.f);
        this.c = Integer.valueOf(bxoVar.g);
        this.h = Integer.valueOf(bxoVar.h);
    }
}
