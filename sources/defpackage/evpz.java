package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpz extends evqj {
    public evpx a;
    private boolean b;
    private byte c;

    @Override // defpackage.evqj
    public final evqk a() {
        if (this.c == 1) {
            return new evqa(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: keepRawInput");
    }

    @Override // defpackage.evqj
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
