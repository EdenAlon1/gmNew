package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpz {
    public int a;

    public hpz() {
        this((char[]) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    public hpz(byte[] bArr) {
        this.a = 0;
    }

    public /* synthetic */ hpz(char[] cArr) {
        this((byte[]) null);
    }
}
