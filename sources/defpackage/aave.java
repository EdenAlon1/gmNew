package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aave {
    public final List a;
    public final dmxz b;

    public aave(List list, dmxz dmxzVar) {
        this.a = list;
        this.b = dmxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aave)) {
            return false;
        }
        aave aaveVar = (aave) obj;
        return ffkj.e(this.a, aaveVar.a) && ffkj.e(this.b, aaveVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ScheduledMessagesListUiData(listItemsUiData=" + this.a + ", listButtonUiData=" + this.b + ")";
    }
}
