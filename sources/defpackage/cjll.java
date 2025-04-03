package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjll {
    public static final long a(cjkh cjkhVar) {
        cjkhVar.getClass();
        return cjkhVar.f;
    }

    public static final cjkh b(long j) {
        Object obj;
        ffdb ffdbVar = new ffdb(cjkh.g);
        while (true) {
            if (!ffdbVar.hasNext()) {
                obj = null;
                break;
            }
            obj = ffdbVar.next();
            if (((cjkh) obj).f == ((int) j)) {
                break;
            }
        }
        cjkh cjkhVar = (cjkh) obj;
        return cjkhVar == null ? cjkh.a : cjkhVar;
    }
}
