package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evhm extends evhr {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    @Override // defpackage.evhr
    public final evhs a() {
        if (this.d == 7) {
            return new evhn(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" enableCelLogsiteMetadata");
        }
        if ((this.d & 2) == 0) {
            sb.append(" enableSafeFormatArgs");
        }
        if ((this.d & 4) == 0) {
            sb.append(" includeSuppressedExceptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.evhr
    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.evhr
    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.evhr
    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }
}
