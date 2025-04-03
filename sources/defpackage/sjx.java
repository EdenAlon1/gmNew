package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjx implements ellf {
    public final String a;

    public sjx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjx) && ffkj.e(this.a, ((sjx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SodaQueueTranscriptionSnackbarEvent(text=" + this.a + ")";
    }
}
