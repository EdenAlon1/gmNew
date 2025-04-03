package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezdt extends eyfy implements eyht {
    public static final ezdt a;
    private static volatile eyhz k;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ezdt ezdtVar = new ezdt();
        a = ezdtVar;
        eyfy.registerDefaultInstance(ezdt.class, ezdtVar);
    }

    private ezdt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0004\bဌ\u0005", new Object[]{"d", "c", "b", ezdy.class, ezea.class, "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new ezdt();
        }
        if (ordinal == 4) {
            return new ezds();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezdt.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
