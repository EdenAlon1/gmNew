package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoj {
    private final boolean a;

    public dqoj(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqoj)) {
            return false;
        }
        boolean z = ((dqoj) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "EmojiDataConfiguration(useGboardDefinitionsAndPreferences=false)";
    }

    public dqoj() {
        this(null);
    }
}
