package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuo extends dzvk {
    public dzsq a;
    public String b;
    private eyee c;
    private int d;
    private int e;
    private String f;
    private byte g;

    @Override // defpackage.dzvk
    public final dzvk a(eyee eyeeVar) {
        this.c = eyeeVar;
        return this;
    }

    @Override // defpackage.dzvk
    public final dzvl b() {
        dzsq dzsqVar;
        eyee eyeeVar;
        String str;
        if (this.g == 3 && (dzsqVar = this.a) != null && (eyeeVar = this.c) != null && (str = this.f) != null) {
            return new dzup(dzsqVar, this.b, eyeeVar, this.d, this.e, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaId");
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
            sb.append(" imageDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvk
    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.dzvk
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null imageDescription");
        }
        this.f = str;
    }

    @Override // defpackage.dzvk
    public final void e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 1);
    }
}
