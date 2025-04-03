package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrd extends edsd {
    public edqc a;
    public String b;
    private long c;
    private dhqd d;
    private byte e;

    @Override // defpackage.edsd
    public final edse a() {
        if (this.e == 1) {
            return new edre(this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }

    @Override // defpackage.edsd
    public final void b(dhqd dhqdVar) {
        this.d = dhqdVar;
    }

    @Override // defpackage.edsd
    public final void c(long j) {
        this.c = j;
        this.e = (byte) 1;
    }
}
