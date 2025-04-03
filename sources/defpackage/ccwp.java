package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwp extends csgp {
    public ccwp(String str) {
        super(11, csgx.NO_RETRY, a.a(str, "Could not find row with Id ", " for backup"));
    }

    @Override // defpackage.csgy
    public final int a() {
        return 2;
    }

    public ccwp(String str, ffbr ffbrVar) {
        this(str);
        Long h = ffpc.h(str);
        if (h != null) {
            ccix ccixVar = (ccix) ffbrVar.b();
            axol.k(ccixVar.g, null, new cciv(ccixVar, h.longValue(), null), 3);
        }
    }
}
