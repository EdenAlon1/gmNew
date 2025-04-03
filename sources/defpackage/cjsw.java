package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsw extends eyfy implements eyht {
    public static final cjsw a;
    private static volatile eyhz f;
    public int b;
    public eyja d;
    public eyhm e = eyhm.a;
    public String c = "";

    static {
        cjsw cjswVar = new cjsw();
        a = cjswVar;
        eyfy.registerDefaultInstance(cjsw.class, cjswVar);
    }

    private cjsw() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.e;
        if (!eyhmVar.b) {
            this.e = eyhmVar.a();
        }
        return this.e;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0000\u0000\u0002ဈ\u0000\u0004ဉ\u0001\u00052", new Object[]{"b", "c", "d", "e", cjsv.a});
        }
        if (ordinal == 3) {
            return new cjsw();
        }
        if (ordinal == 4) {
            return new cjsu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjsw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
