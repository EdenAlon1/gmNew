package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcim extends eyfy implements eyht {
    public static final fcim a;
    private static volatile eyhz i;
    public int b;
    public fcfo c;
    public fcek d;
    public fcfw f;
    public int h;
    public String e = "";
    public eygr g = emptyProtobufList();

    static {
        fcim fcimVar = new fcim();
        a = fcimVar;
        eyfy.registerDefaultInstance(fcim.class, fcimVar);
    }

    private fcim() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005ဉ\u0002\b\f", new Object[]{"b", "c", "d", "g", fcil.class, "e", "f", "h"});
        }
        if (ordinal == 3) {
            return new fcim();
        }
        if (ordinal == 4) {
            return new fcij();
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
        synchronized (fcim.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
