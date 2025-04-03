package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class airn {
    public final enip a;
    public final enip b;

    public airn(enip enipVar, enip enipVar2) {
        this.a = enipVar;
        this.b = enipVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof airn)) {
            return false;
        }
        airn airnVar = (airn) obj;
        return ffkj.e(this.a, airnVar.a) && ffkj.e(this.b, airnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProcessedConversationIds(insertedIds=" + this.a + ", handledIds=" + this.b + ")";
    }
}
