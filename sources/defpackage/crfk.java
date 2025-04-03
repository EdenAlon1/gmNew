package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crfk extends crfl {
    public final avvd a;

    public crfk(avvd avvdVar) {
        this.a = avvdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crfk) && ffkj.e(this.a, ((crfk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadFailure(fileTransferFailure=" + this.a + ")";
    }
}
