package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akqg extends akqr {
    private final String a;

    public akqg(String str) {
        if (str == null) {
            throw new NullPointerException("Null scheduledSendId");
        }
        this.a = str;
    }

    @Override // defpackage.akqr
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqr) {
            return this.a.equals(((akqr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageDeleteConfirmedEvent{scheduledSendId=" + this.a + "}";
    }
}
