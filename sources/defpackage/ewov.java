package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewov extends eyfy implements eyht {
    public static final ewov a;
    private static volatile eyhz d;
    public int b;
    public ewor c;
    private int e;

    static {
        ewov ewovVar = new ewov();
        a = ewovVar;
        eyfy.registerDefaultInstance(ewov.class, ewovVar);
    }

    private ewov() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"e", "b", ewos.a, "c"});
        }
        if (ordinal == 3) {
            return new ewov();
        }
        if (ordinal == 4) {
            return new ewou();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewov.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
