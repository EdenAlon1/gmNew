package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpf implements ahph {
    public final String a;

    public ahpf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahpf) && ffkj.e(this.a, ((ahpf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(id=" + this.a + ")";
    }
}
