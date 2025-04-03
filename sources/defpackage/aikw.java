package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikw implements aihs {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/ForwardMessage");
    public final appj b;

    public aikw(appj appjVar) {
        this.b = appjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aikw) && ffkj.e(this.b, ((aikw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ForwardMessage(content=" + this.b + ")";
    }

    public aikw(alxr alxrVar) {
        this(alxrVar.g());
    }
}
