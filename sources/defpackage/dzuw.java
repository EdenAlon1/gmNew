package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuw extends dzvy {
    private String a;
    private int b;
    private int c;
    private byte d;

    @Override // defpackage.dzvy
    public final dzvz a() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new dzux(str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if ((this.d & 1) == 0) {
            sb.append(" backgroundColor");
        }
        if ((this.d & 2) == 0) {
            sb.append(" textColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvy
    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.dzvy
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }

    @Override // defpackage.dzvy
    public final void d(int i) {
        this.c = i;
        this.d = (byte) (this.d | 2);
    }
}
