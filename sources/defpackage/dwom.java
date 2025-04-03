package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwom extends dwxd {
    private int a;
    private byte b;

    @Override // defpackage.dwxd
    public final dwxe a() {
        if (this.b == 1) {
            return new dwon(this.a);
        }
        throw new IllegalStateException("Missing required properties: removedFileGroupsCount");
    }

    @Override // defpackage.dwxd
    public final void b(int i) {
        this.a = i;
        this.b = (byte) 1;
    }
}
