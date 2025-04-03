package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprl extends eyfy implements eyht {
    public static final eprl a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int h;
    public int c = 0;
    public String g = "";

    static {
        eprl eprlVar = new eprl();
        a = eprlVar;
        eyfy.registerDefaultInstance(eprl.class, eprlVar);
    }

    private eprl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001n\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဈ\u0003\u0005င\u0004e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", epqu.class, epra.class, epqy.class, eprc.class, epri.class, epqr.class, epre.class, eprk.class, eprg.class, epqw.class});
        }
        if (ordinal == 3) {
            return new eprl();
        }
        if (ordinal == 4) {
            return new epqs();
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
        synchronized (eprl.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
