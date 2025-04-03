package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyzd extends eyfy implements eyht {
    public static final eyzd a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public eyhm e = eyhm.a;
    public eyhm f = eyhm.a;
    public String d = "";

    static {
        eyzd eyzdVar = new eyzd();
        a = eyzdVar;
        eyfy.registerDefaultInstance(eyzd.class, eyzdVar);
    }

    private eyzd() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.f;
        if (!eyhmVar.b) {
            this.f = eyhmVar.a();
        }
        return this.f;
    }

    public final eyhm b() {
        eyhm eyhmVar = this.e;
        if (!eyhmVar.b) {
            this.e = eyhmVar.a();
        }
        return this.e;
    }

    public final boolean c(String str) {
        return this.f.containsKey(str);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u00032\u00042", new Object[]{"b", "c", eyyy.a, "d", "e", eyzc.a, "f", eyyx.a});
        }
        if (ordinal == 3) {
            return new eyzd();
        }
        if (ordinal == 4) {
            return new eyyu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyzd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
