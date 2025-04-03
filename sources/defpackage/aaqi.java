package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqi {
    public final zvp a;
    public final boolean b;
    public final byyt c;
    public final aawt d;
    public final zwb e;

    public aaqi(zvp zvpVar, boolean z, byyt byytVar, aawt aawtVar, zwb zwbVar) {
        this.a = zvpVar;
        this.b = z;
        this.c = byytVar;
        this.d = aawtVar;
        this.e = zwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaqi)) {
            return false;
        }
        aaqi aaqiVar = (aaqi) obj;
        return ffkj.e(this.a, aaqiVar.a) && this.b == aaqiVar.b && this.c == aaqiVar.c && ffkj.e(this.d, aaqiVar.d) && ffkj.e(this.e, aaqiVar.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        zwb zwbVar = this.e;
        return (hashCode * 31) + (zwbVar == null ? 0 : zwbVar.hashCode());
    }

    public final String toString() {
        return "MultiPartMessageArgs(messageWithMetadata=" + this.a + ", isGroupConversation=" + this.b + ", archiveStatus=" + this.c + ", selectionData=" + this.d + ", searchData=" + this.e + ")";
    }
}
