package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbv extends axbq {
    public final awui a;

    public axbv(awui awuiVar) {
        awuiVar.getClass();
        this.a = awuiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axbv) && ffkj.e(this.a, ((axbv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshRegistrationData(selfChatEndpoint=" + this.a + ")";
    }
}
