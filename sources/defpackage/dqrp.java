package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrp {
    public final dqqj a;
    public final dqof b;
    public final Integer c;
    public final dqro d;
    public final boolean e;

    public dqrp(dqqj dqqjVar, dqof dqofVar, Integer num, dqro dqroVar, boolean z) {
        dqofVar.getClass();
        this.a = dqqjVar;
        this.b = dqofVar;
        this.c = num;
        this.d = dqroVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqrp)) {
            return false;
        }
        dqrp dqrpVar = (dqrp) obj;
        return ffkj.e(this.a, dqrpVar.a) && ffkj.e(this.b, dqrpVar.b) && ffkj.e(this.c, dqrpVar.c) && ffkj.e(this.d, dqrpVar.d) && this.e == dqrpVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        return (((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "EmojiUsage(emojiSet=" + this.a + ", selectedEmoji=" + this.b + ", listPosition=" + this.c + ", source=" + this.d + ", fromVariantPicker=" + this.e + ")";
    }

    public /* synthetic */ dqrp(dqqj dqqjVar, dqof dqofVar, Integer num, dqro dqroVar, boolean z, int i) {
        this(dqqjVar, dqofVar, (i & 4) != 0 ? null : num, dqroVar, ((i & 16) == 0) & z);
    }
}
