package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbbk extends bbbp {
    public fjay a;
    public bdhg b;
    public fgjz c;
    public eyja d;
    public int e;
    public int f;
    public int g;

    @Override // defpackage.bbbp
    public final bbbq a() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0 && (i = this.f) != 0 && (i2 = this.g) != 0) {
            return new bbbl(this.a, this.b, i3, i, i2, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" type");
        }
        if (this.f == 0) {
            sb.append(" xslNode");
        }
        if (this.g == 0) {
            sb.append(" xslInsideNode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
