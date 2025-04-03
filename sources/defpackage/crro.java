package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crro extends eyfy implements eyht {
    public static final crro a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        crro crroVar = new crro();
        a = crroVar;
        eyfy.registerDefaultInstance(crro.class, crroVar);
    }

    private crro() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new crro();
        }
        if (ordinal == 4) {
            return new crrn();
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
        synchronized (crro.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
