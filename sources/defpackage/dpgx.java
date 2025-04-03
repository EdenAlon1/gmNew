package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgx implements dphb {
    public final drni a;

    public dpgx(drni drniVar) {
        this.a = drniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpgx) && ffkj.e(this.a, ((dpgx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Playback(capturedMedia=" + this.a + ")";
    }
}
