package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofh implements dofi {
    public final List a;
    public final Integer b;
    public final ffix c;
    private final boolean d = true;

    public dofh(List list, Integer num, ffix ffixVar) {
        this.a = list;
        this.b = num;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofh)) {
            return false;
        }
        dofh dofhVar = (dofh) obj;
        if (!ffkj.e(this.a, dofhVar.a) || !ffkj.e(this.b, dofhVar.b)) {
            return false;
        }
        boolean z = dofhVar.d;
        return ffkj.e(this.c, dofhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StaticReactionsBarUiData(reactionItems=" + this.a + ", selectedIndex=" + this.b + ", enableEnterAnimation=true, customEmojiButtonOnClick=" + this.c + ")";
    }
}
