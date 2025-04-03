package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zru {
    public final zst a;
    public final zqz b;
    public final ffsk c;

    public zru(zst zstVar, zqz zqzVar, ffsk ffskVar) {
        this.a = zstVar;
        this.b = zqzVar;
        this.c = ffskVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zru)) {
            return false;
        }
        zru zruVar = (zru) obj;
        return ffkj.e(this.a, zruVar.a) && ffkj.e(this.b, zruVar.b) && ffkj.e(this.c, zruVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CacheValue(messageBubbleArgs=" + this.a + ", uiDataWrapper=" + this.b + ", scope=" + this.c + ")";
    }
}
