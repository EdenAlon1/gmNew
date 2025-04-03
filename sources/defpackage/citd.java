package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citd extends cixc {
    private final String a = "incoming_message_group_key";

    @Override // defpackage.cixc
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cixc) {
            return this.a.equals(((cixc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "NotificationSummaryBuilderInfo{groupKey=" + this.a + "}";
    }
}
