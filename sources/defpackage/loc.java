package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loc {
    private final lmx a;
    private final lms b;
    private final lnx c;
    private final loj d = new loj();

    public loc(lmx lmxVar, lms lmsVar, lnx lnxVar) {
        this.a = lmxVar;
        this.b = lmsVar;
        this.c = lnxVar;
    }

    public final lml a(ffmo ffmoVar, String str) {
        lml a;
        synchronized (this.d) {
            a = this.a.a(str);
            if (ffmoVar.d(a)) {
                Object obj = this.b;
                if (obj instanceof lmu) {
                    a.getClass();
                    ((lmu) obj).d(a);
                }
                a.getClass();
            } else {
                loa loaVar = new loa(this.c);
                loaVar.b(lmw.a, str);
                a = lod.a(this.b, ffmoVar, loaVar);
                lmx lmxVar = this.a;
                a.getClass();
                lml lmlVar = (lml) lmxVar.a.put(str, a);
                if (lmlVar != null) {
                    lmlVar.fC();
                }
            }
        }
        return a;
    }
}
