package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clov extends eyfy implements eyht {
    public static final clov a;
    private static volatile eyhz i;
    public int b;
    public cltf e;
    public clor g;
    public clsl h;
    public String c = "";
    public String d = "";
    public eygr f = emptyProtobufList();

    static {
        clov clovVar = new clov();
        a = clovVar;
        eyfy.registerDefaultInstance(clov.class, clovVar);
    }

    private clov() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", cloz.class, "g", "h"});
        }
        if (ordinal == 3) {
            return new clov();
        }
        if (ordinal == 4) {
            return new clou();
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
        synchronized (clov.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
