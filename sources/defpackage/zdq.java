package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdq {
    public final String a;
    public final boolean b;
    public final List c;
    public final ffix d;
    private final dmzz e;

    public /* synthetic */ zdq(String str, List list, ffix ffixVar, int i) {
        list = (i & 8) != 0 ? ffel.a : list;
        boolean z = (i & 4) == 0;
        list.getClass();
        this.a = str;
        this.e = null;
        this.b = !z;
        this.c = list;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdq)) {
            return false;
        }
        zdq zdqVar = (zdq) obj;
        if (!ffkj.e(this.a, zdqVar.a)) {
            return false;
        }
        dmzz dmzzVar = zdqVar.e;
        return this.b == zdqVar.b && ffkj.e(this.c, zdqVar.c) && ffkj.e(this.d, zdqVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DebugActionUiData(title=" + this.a + ", icon=null, isVisible=" + this.b + ", subActions=" + this.c + ", execute=" + this.d + ")";
    }
}
