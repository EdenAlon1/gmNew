package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqus extends dquu {
    public final dqqj a;
    private final int b;

    public dqus(dqqj dqqjVar, int i) {
        dqqjVar.getClass();
        this.a = dqqjVar;
        this.b = i;
        dqqjVar.a().a().toString();
    }

    @Override // defpackage.dquu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dquu
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqus)) {
            return false;
        }
        dqus dqusVar = (dqus) obj;
        return ffkj.e(this.a, dqusVar.a) && this.b == dqusVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Emoji(emojiSet=" + this.a + ", categoryId=" + this.b + ")";
    }
}
