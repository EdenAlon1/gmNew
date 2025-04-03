package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqou extends cqpt {
    private long a;
    private long b;
    private byte c;

    @Override // defpackage.cqpt
    public final cqpu a() {
        if (this.c == 3) {
            return new cqov(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" bytesTransferred");
        }
        if ((this.c & 2) == 0) {
            sb.append(" totalBytesInFile");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cqpt
    public final void b(long j) {
        this.a = j;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.cqpt
    public final void c(long j) {
        this.b = j;
        this.c = (byte) (this.c | 2);
    }
}
