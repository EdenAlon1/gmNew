package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrd extends evrf {
    public final byte[] a;

    public evrd(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.evrf
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.evrf
    public final evrc b() {
        return new evrc(this);
    }
}
