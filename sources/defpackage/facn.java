package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class facn extends fadp {
    public engw a;
    private long b;
    private byte c;

    @Override // defpackage.fadp
    public final fadq a() {
        engw engwVar;
        if (this.c == 1 && (engwVar = this.a) != null) {
            return new faco(this.b, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" parentGlContextHandle");
        }
        if (this.a == null) {
            sb.append(" servicePacketHandles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.fadp
    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
