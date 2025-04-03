package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugx {
    public final ffji a;
    public final ffix b;
    public final ffix c;
    private final ffix d;

    public ugx(ffji ffjiVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        this.a = ffjiVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = ffixVar3;
    }

    public final long a() {
        return ((Number) this.b.invoke()).longValue();
    }

    public final boolean b() {
        int intValue = ((Number) this.a.invoke(false)).intValue();
        return intValue == 30 || intValue == 40;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugx)) {
            return false;
        }
        ugx ugxVar = (ugx) obj;
        return ffkj.e(this.a, ugxVar.a) && ffkj.e(this.b, ugxVar.b) && ffkj.e(this.c, ugxVar.c) && ffkj.e(this.d, ugxVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SendingCapabilities(draftMessageType=" + this.a + ", maxSizeBytes=" + this.b + ", currentDraftSizeBytes=" + this.c + ", isGroup=" + this.d + ")";
    }
}
