package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awjp extends awmp {
    private boolean a;
    private boolean b;
    private byte c;

    @Override // defpackage.awmp
    public final awmq a() {
        if (this.c == 3) {
            return new awjq(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" isSuccessful");
        }
        if ((this.c & 2) == 0) {
            sb.append(" shouldRefreshConversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.awmp
    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.awmp
    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }
}
