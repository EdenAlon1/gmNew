package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euvg extends euvm {
    public String a;
    public int b;
    private long c;
    private byte d;

    @Override // defpackage.euvm
    public final euvn a() {
        if (this.d == 1) {
            return new euvh(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    @Override // defpackage.euvm
    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }
}
