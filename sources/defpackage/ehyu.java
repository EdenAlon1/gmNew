package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyu extends eibc {
    private boolean a;
    private byte b;

    @Override // defpackage.eibc
    public final eibd a() {
        if (this.b == 1) {
            return new ehyv(this.a);
        }
        throw new IllegalStateException("Missing required properties: supportsSubjectManagement");
    }

    @Override // defpackage.eibc
    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
