package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apmn {
    public final apfz a;
    public final amfx b;

    public apmn(apfz apfzVar, amfx amfxVar) {
        apfzVar.getClass();
        amfxVar.getClass();
        this.a = apfzVar;
        this.b = amfxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apmn)) {
            return false;
        }
        apmn apmnVar = (apmn) obj;
        return ffkj.e(this.a, apmnVar.a) && ffkj.e(this.b, apmnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationDataCache(cachedConstraints=" + this.a + ", cachedConversationProperties=" + this.b + ")";
    }
}
