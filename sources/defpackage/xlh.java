package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlh {
    public final arae a;
    public final alyx b;
    public final String c;

    public xlh(arae araeVar, alyx alyxVar, String str) {
        this.a = araeVar;
        this.b = alyxVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlh)) {
            return false;
        }
        xlh xlhVar = (xlh) obj;
        return ffkj.e(this.a, xlhVar.a) && this.b == xlhVar.b && ffkj.e(this.c, xlhVar.c);
    }

    public final int hashCode() {
        arae araeVar = this.a;
        int hashCode = ((araeVar == null ? 0 : araeVar.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleMessagePropertiesData(simpleMessagePropertiesProvider=" + this.a + ", bestAvailableTransportFeatureSet=" + this.b + ", draftText=" + this.c + ")";
    }
}
