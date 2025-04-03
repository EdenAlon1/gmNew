package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmm {
    public final dqrp a;

    public dqmm(dqrp dqrpVar) {
        this.a = dqrpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqmm) && ffkj.e(this.a, ((dqmm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeEmojiSpan(emojiUsage=" + this.a + ")";
    }
}
