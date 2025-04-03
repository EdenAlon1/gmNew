package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolr {
    public final String a;
    public final String b;

    public dolr(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dolr)) {
            return false;
        }
        dolr dolrVar = (dolr) obj;
        return ffkj.e(this.a, dolrVar.a) && ffkj.e(this.b, dolrVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EmojiAnimationFile(emoji=" + this.a + ", animationFileName=" + this.b + ")";
    }
}
