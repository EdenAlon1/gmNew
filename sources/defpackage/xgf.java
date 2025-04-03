package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgf {
    public final boolean a;
    public final int b;
    private final dqof c;

    public xgf(dqof dqofVar, int i, boolean z) {
        this.c = dqofVar;
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf)) {
            return false;
        }
        xgf xgfVar = (xgf) obj;
        return ffkj.e(this.c, xgfVar.c) && this.b == xgfVar.b && this.a == xgfVar.a;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.b) * 31) + (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        CharSequence c = cskw.c(this.c.a());
        StringBuilder sb = new StringBuilder("EmojiUsage(emoji=");
        sb.append((Object) c);
        sb.append(", source=");
        int i = this.b;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? "EXTERNAL" : "GBOARD" : "SEARCH" : "COLLECTION" : "RECENTS"));
        sb.append(", fromVariantPicker=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
