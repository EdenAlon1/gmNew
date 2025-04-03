package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqq extends diqv {
    private boolean a;
    private boolean b;
    private byte c;

    @Override // defpackage.diqv
    public final diqw a() {
        if (this.c == 3) {
            return new diqr(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" cleanupFileTransferAfterUploadCompletes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" isFileTransferViaSmsSupported");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.diqv
    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.diqv
    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }
}
