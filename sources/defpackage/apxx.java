package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxx implements apyv {
    public final String a;

    public apxx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apxx) && ffkj.e(this.a, ((apxx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmojiReaction(emoji=" + this.a + ")";
    }
}
