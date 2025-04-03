package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozq extends eyfy implements eyht {
    public static final eozq a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public boolean f;
    public int g;
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();
    public String h = "";

    static {
        eozq eozqVar = new eozq();
        a = eozqVar;
        eyfy.registerDefaultInstance(eozq.class, eozqVar);
    }

    private eozq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005င\u0002\u0006ဈ\u0003", new Object[]{"b", "c", eozm.a, "d", eozp.class, "e", eozp.class, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eozq();
        }
        if (ordinal == 4) {
            return new eozl();
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
        synchronized (eozq.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
