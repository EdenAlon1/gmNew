package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apqi extends apqm {
    private long a;
    private long b;
    private boolean c;
    private byte d;

    @Override // defpackage.apqm
    public final apqn a() {
        if (this.d == 7) {
            return new apqj(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" bytesTransferred");
        }
        if ((this.d & 2) == 0) {
            sb.append(" totalBytesInFile");
        }
        if ((this.d & 4) == 0) {
            sb.append(" isFinished");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apqm
    public final void b(long j) {
        this.a = j;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.apqm
    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    @Override // defpackage.apqm
    public final void d(long j) {
        this.b = j;
        this.d = (byte) (this.d | 2);
    }
}
