package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewx implements ceww {
    static final cfva a;
    private static final cskc b = cskc.g("BugleWorkQueue", "WorkQueueHandlerManagerImpl");
    private final ffbr c;
    private final ffbr d;

    static {
        ecwh ecwhVar = cfvl.a;
        a = new cfvk(cfvl.a, "WorkQueue__").a("max_rows_per_query", 100);
    }

    public cewx(ffbr ffbrVar, ffbr ffbrVar2) {
        boolean z;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        Iterator it = ((Map) ffbrVar.b()).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            String str = (String) it.next();
            if (str.contains("-")) {
                b.n("illegal handler name (contains -): ".concat(String.valueOf(str)));
                z = false;
                break;
            }
        }
        emxf.l(z);
    }

    @Override // defpackage.ceww
    public final int a(String str) {
        Integer num = (Integer) ((Map) this.d.b()).get(str);
        if (num == null) {
            num = (Integer) a.e();
        }
        return num.intValue();
    }

    @Override // defpackage.ceww
    public final ceve b(String str) {
        ffbr ffbrVar = (ffbr) ((Map) this.c.b()).get(str);
        if (ffbrVar != null) {
            return (ceve) ffbrVar.b();
        }
        return null;
    }

    @Override // defpackage.ceww
    public final ceve c(String str) {
        ffbr ffbrVar = (ffbr) ((Map) this.c.b()).get(str);
        if (ffbrVar == null) {
            ffbrVar = (ffbr) ((Map) this.c.b()).get("__UNHANDLED_HANDLER");
        }
        if (ffbrVar != null) {
            return (ceve) ffbrVar.b();
        }
        throw new IllegalArgumentException(a.a(str, "no default handler found (type was ", ")"));
    }

    @Override // defpackage.ceww
    public final String d(ceve ceveVar) {
        for (Map.Entry entry : ((Map) this.c.b()).entrySet()) {
            if (((ceve) ((ffbr) entry.getValue()).b()).getClass().getName().equals(ceveVar.getClass().getName())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
