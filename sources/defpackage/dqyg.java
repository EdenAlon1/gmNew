package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqyg {
    public final dqof a;
    public final dqqj b;

    public dqyg(dqof dqofVar, dqqj dqqjVar) {
        dqofVar.getClass();
        dqqjVar.getClass();
        this.a = dqofVar;
        this.b = dqqjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqyg)) {
            return false;
        }
        dqyg dqygVar = (dqyg) obj;
        return ffkj.e(this.a, dqygVar.a) && ffkj.e(this.b, dqygVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiWithEmojiSet(emoji=" + this.a + ", emojiSet=" + this.b + ")";
    }
}
