package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdv extends eyfy implements eyht {
    public static final etdv a;
    private static volatile eyhz i;
    public int b;
    public etfd c;
    public eted e;
    public eygr g;
    public int h;
    public String d = "";
    public String f = "";

    static {
        etdv etdvVar = new etdv();
        a = etdvVar;
        eyfy.registerDefaultInstance(etdv.class, etdvVar);
    }

    private etdv() {
        emptyProtobufList();
        this.g = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ\u0006\u001b\b\f", new Object[]{"b", "c", "d", "e", "f", "g", etef.class, "h"});
        }
        if (ordinal == 3) {
            return new etdv();
        }
        if (ordinal == 4) {
            return new etdu();
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
        synchronized (etdv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
