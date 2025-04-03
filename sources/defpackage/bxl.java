package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxl extends bxi {
    private String a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private int f;

    @Override // defpackage.bxi
    public final bxj a() {
        String str = this.a;
        Integer num = this.b;
        String str2 = str == null ? " mimeType" : "";
        if (num == null) {
            str2 = str2.concat(" profile");
        }
        if (this.f == 0) {
            str2 = str2.concat(" inputTimebase");
        }
        if (this.c == null) {
            str2 = str2.concat(" bitrate");
        }
        if (this.d == null) {
            str2 = str2.concat(" sampleRate");
        }
        if (this.e == null) {
            str2 = str2.concat(" channelCount");
        }
        if (str2.isEmpty()) {
            return new bxm(this.a, this.b.intValue(), this.f, this.c.intValue(), this.d.intValue(), this.e.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str2));
    }

    @Override // defpackage.bxi
    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.bxi
    public final void d(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.bxi
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.a = str;
    }

    @Override // defpackage.bxi
    public final void f(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.bxi
    public final void g(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.bxi
    public final void h() {
        this.f = 1;
    }
}
