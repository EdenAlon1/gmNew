package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtqz extends dtvc {
    public byte a;
    private boolean b;

    @Override // defpackage.dtvc
    public final dtvd a() {
        if (this.a == 3) {
            return new dtra(this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" withoutSqliteTransaction");
        }
        if ((this.a & 2) == 0) {
            sb.append(" deferredForeignKeyConstraints");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtvc
    public final void b(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }
}
