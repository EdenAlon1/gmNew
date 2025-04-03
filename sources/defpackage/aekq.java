package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aekq {
    public final enhk a;
    public final Integer b;
    public final aqys c;
    private final Integer d = null;

    public aekq(enhk enhkVar, Integer num, aqys aqysVar) {
        this.a = enhkVar;
        this.b = num;
        this.c = aqysVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekq)) {
            return false;
        }
        aekq aekqVar = (aekq) obj;
        Integer num = aekqVar.d;
        return ffkj.e(null, null) && ffkj.e(this.a, aekqVar.a) && ffkj.e(this.b, aekqVar.b) && this.c == aekqVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aqys aqysVar = this.c;
        return hashCode2 + (aqysVar != null ? aqysVar.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationListItemViewAsyncData(testField=null, typingIndicatorData=" + this.a + ", groupUpgradeCounter=" + this.b + ", rcsAvailability=" + this.c + ")";
    }
}
