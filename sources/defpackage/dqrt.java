package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrt {
    public final dqqj a;
    private final List b;

    public dqrt(dqqj dqqjVar, List list) {
        this.a = dqqjVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqrt)) {
            return false;
        }
        dqrt dqrtVar = (dqrt) obj;
        return ffkj.e(this.a, dqrtVar.a) && ffkj.e(this.b, dqrtVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Result(emojiSet=" + this.a + ", searchTerms=" + this.b + ")";
    }
}
