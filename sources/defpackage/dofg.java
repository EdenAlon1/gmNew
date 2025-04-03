package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofg implements dofi {
    public final List a;
    public final Integer b;
    public final ffix d;
    public final huo e;
    public final doff h;
    public final ffix i;
    public final boolean c = true;
    public final boolean f = true;
    public final boolean g = true;

    public dofg(List list, Integer num, ffix ffixVar, huo huoVar, doff doffVar, ffix ffixVar2) {
        this.a = list;
        this.b = num;
        this.d = ffixVar;
        this.e = huoVar;
        this.h = doffVar;
        this.i = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dofg)) {
            return false;
        }
        dofg dofgVar = (dofg) obj;
        if (!ffkj.e(this.a, dofgVar.a) || !ffkj.e(this.b, dofgVar.b)) {
            return false;
        }
        boolean z = dofgVar.c;
        if (!ffkj.e(this.d, dofgVar.d) || !ffkj.e(this.e, dofgVar.e)) {
            return false;
        }
        boolean z2 = dofgVar.f;
        boolean z3 = dofgVar.g;
        return ffkj.e(this.h, dofgVar.h) && ffkj.e(this.i, dofgVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + 1231) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1231) * 31) + 1231) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ScrollingReactionsBarUiData(reactionItems=" + this.a + ", selectedIndex=" + this.b + ", enableEnterAnimation=true, customEmojiButtonOnClick=" + this.d + ", contentAlignment=" + this.e + ", replayItemAnimationsOnScroll=true, hasBackgroundPill=true, flags=" + this.h + ", emotifyButtonOnClick=" + this.i + ")";
    }
}
