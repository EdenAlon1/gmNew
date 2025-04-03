package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmd extends ecmo {
    public int a;
    public byte b;
    public int c;

    @Override // defpackage.ecmo
    public final ecmp a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            return new ecme(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.b & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecmo
    public final ecmo b(int i) {
        this.c = i;
        return this;
    }
}
