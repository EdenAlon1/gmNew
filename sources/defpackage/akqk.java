package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akqk extends akre {
    private final String a;

    public akqk(String str) {
        if (str == null) {
            throw new NullPointerException("Null scheduledSendId");
        }
        this.a = str;
    }

    @Override // defpackage.akre
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akre) {
            return this.a.equals(((akre) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageSendEvent{scheduledSendId=" + this.a + "}";
    }
}
