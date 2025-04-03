package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnv extends eyfy implements eyht {
    public static final esnv a;
    private static volatile eyhz i;
    public esly b;
    public long c;
    public String d = "";
    public String e = "";
    public eyee f = eyee.b;
    public String g = "";
    public esol h;
    private int j;

    static {
        esnv esnvVar = new esnv();
        a = esnvVar;
        eyfy.registerDefaultInstance(esnv.class, esnvVar);
    }

    private esnv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\n\u0006Ȉ\u0007ဉ\u0001", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new esnv();
        }
        if (ordinal == 4) {
            return new esnu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esnv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
