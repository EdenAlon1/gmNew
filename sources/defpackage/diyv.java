package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyv {
    public static volatile diyu b;
    public static final diyt a = diyt.OFF;
    private static final Object c = new Object();

    public static diyu a() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = ((diys) dipp.a(diys.class)).l();
                    b.l();
                }
            }
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibAllowSwitch flags are not initialized!");
    }

    public static diyy b(String str) {
        diyu a2 = a();
        diyy diyyVar = (diyy) a2.a.get(str);
        if (diyyVar != null) {
            return diyyVar;
        }
        diza i = a2.i(str, a2.b);
        diyy diyyVar2 = (diyy) a2.a.putIfAbsent(str, i);
        return diyyVar2 == null ? i : diyyVar2;
    }
}
