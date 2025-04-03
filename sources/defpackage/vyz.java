package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyz {
    private final ffbr a;
    private final ffbr b;

    public vyz(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final int a(boolean z, boolean z2, boolean z3, ayhd ayhdVar) {
        if (((bzqa) this.a.b()).i() && z && z2 && z3) {
            return 14;
        }
        if (((atzz) this.b.b()).a()) {
            if (z && ayhdVar == ayhd.RCS_GROUP_SELF_ONLY) {
                return 12;
            }
            return (z && z2) ? 5 : 7;
        }
        if (z && z2) {
            return ayhd.RCS_GROUP_SELF_ONLY != ayhdVar ? 5 : 12;
        }
        return 7;
    }
}
