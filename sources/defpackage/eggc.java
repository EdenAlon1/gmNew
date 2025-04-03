package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggc extends egge {
    private final long a;

    public eggc(long j) {
        this.a = j;
    }

    @Override // defpackage.egge, defpackage.eghh
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eghh
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eghh) {
            eghh eghhVar = (eghh) obj;
            if (eghhVar.b() == 1 && this.a == eghhVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ImageIdOrUri{imageId=" + this.a + "}";
    }
}
