package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgly extends dgma {
    public String a;
    public String b;
    private int c;
    private byte d;

    @Override // defpackage.dgma
    public final dgmb a() {
        if (this.d == 1 && this.a != null && this.b != null) {
            return new dglz(this.a, this.c, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" hostName");
        }
        if (this.d == 0) {
            sb.append(" hostPort");
        }
        if (this.b == null) {
            sb.append(" apiKey");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dgma
    public final void b() {
        this.c = 443;
        this.d = (byte) 1;
    }
}
