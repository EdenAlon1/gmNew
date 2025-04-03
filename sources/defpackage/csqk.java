package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csqk extends csqx {
    public String a;
    private long b;
    private byte c;

    @Override // defpackage.csqx
    public final csqy a() {
        if (this.c == 1) {
            return new csql(this.b, this.a);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    @Override // defpackage.csqx
    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
