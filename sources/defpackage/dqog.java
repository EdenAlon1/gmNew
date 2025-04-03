package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqog {
    public final String a;
    public final List b;

    public dqog(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqog)) {
            return false;
        }
        dqog dqogVar = (dqog) obj;
        return ffkj.e(this.a, dqogVar.a) && ffkj.e(this.b, dqogVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiCategory(label=" + this.a + ", emojiSets=" + this.b + ")";
    }
}
