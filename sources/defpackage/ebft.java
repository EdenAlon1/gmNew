package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebft extends ebfv {
    public byte a;
    private boolean b;

    @Override // defpackage.ebfv
    public final ebfw a() {
        if (this.a == 3) {
            return new ebfu(this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" showSwitchProfileAction");
        }
        if ((this.a & 2) == 0) {
            sb.append(" disableDecorationFeatures");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebfv
    public final void b(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }
}
