package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zeb {
    public final ffxx a;

    public zeb(ffxx ffxxVar) {
        this.a = ffxxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zeb) && ffkj.e(this.a, ((zeb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsWatermarkUiData(shouldShow=" + this.a + ")";
    }
}
