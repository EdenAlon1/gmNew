package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzp extends dzal {
    private boolean a;
    private int b;
    private byte c;

    @Override // defpackage.dzal
    public final dzam a() {
        if (this.c == 3) {
            return new dyzq(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" isSuccessful");
        }
        if ((this.c & 2) == 0) {
            sb.append(" conversationsDownloaded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzal
    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.dzal
    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }
}
