package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qad {
    public static final String a = ppt.d("NetworkRequestCompat");
    public final Object b;

    public qad() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qad) && ffkj.e(this.b, ((qad) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public qad(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ qad(byte[] bArr) {
        this((Object) null);
    }
}
