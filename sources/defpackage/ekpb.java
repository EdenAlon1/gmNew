package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpb extends ekot {
    public final String a = "oauth2:https://www.googleapis.com/auth/carrier-message-store https://www.googleapis.com/auth/android-messages";

    public ekpb(String str) {
    }

    @Override // defpackage.ekot
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekot) {
            return this.a.equals(((ekot) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AuthTokenManagerConfig{scope=" + this.a + "}";
    }
}
