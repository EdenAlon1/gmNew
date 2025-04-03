package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edme extends edqm {
    public edpb a;
    public edor b;
    public edpc c;
    private boolean d;
    private byte e;

    @Override // defpackage.edqm
    public final edqn a() {
        edor edorVar;
        edpc edpcVar;
        if (this.e == 1 && (edorVar = this.b) != null && (edpcVar = this.c) != null) {
            return new edon(this.a, edorVar, edpcVar, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" day");
        }
        if (this.c == null) {
            sb.append(" time");
        }
        if (this.e == 0) {
            sb.append(" truncated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edqm
    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
