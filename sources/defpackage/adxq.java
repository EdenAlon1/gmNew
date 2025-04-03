package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adxq extends adxt {
    private final adtw a;

    public adxq(adtw adtwVar) {
        this.a = adtwVar;
    }

    @Override // defpackage.adxt
    public final adtw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adxt) {
            return this.a.equals(((adxt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FeedbackDataDetailRequestedEvent{feedbackData=" + this.a.toString() + "}";
    }
}
