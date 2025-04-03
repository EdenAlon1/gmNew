package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmj extends dzoq {
    private boolean a;
    private byte b;

    @Override // defpackage.dzoq
    public final dzor a() {
        if (this.b == 1) {
            return new dzmk(this.a);
        }
        throw new IllegalStateException("Missing required properties: blocked");
    }

    @Override // defpackage.dzoq
    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
