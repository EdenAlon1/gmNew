package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuq extends dzvm {
    public dzvq a;
    public String b;
    private eyee c;
    private int d;
    private int e;
    private String f;
    private byte g;

    @Override // defpackage.dzvm
    public final dzvm a(eyee eyeeVar) {
        this.c = eyeeVar;
        return this;
    }

    @Override // defpackage.dzvm
    public final dzvn b() {
        if (this.g == 3 && this.a != null && this.c != null && this.f != null) {
            return new dzur(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaSource");
        }
        if (this.c == null) {
            sb.append(" thumbnail");
        }
        if ((this.g & 1) == 0) {
            sb.append(" width");
        }
        if ((this.g & 2) == 0) {
            sb.append(" height");
        }
        if (this.f == null) {
            sb.append(" mediaDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvm
    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.dzvm
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaDescription");
        }
        this.f = str;
    }

    @Override // defpackage.dzvm
    public final void e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 1);
    }
}
