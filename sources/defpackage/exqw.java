package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exqw extends eyfy implements eyht {
    public static final exqw a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public eyee h;

    static {
        exqw exqwVar = new exqw();
        a = exqwVar;
        eyfy.registerDefaultInstance(exqw.class, exqwVar);
    }

    private exqw() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
        this.h = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002\tည\u0007", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
        }
        if (ordinal == 3) {
            return new exqw();
        }
        if (ordinal == 4) {
            return new exqv();
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
        synchronized (exqw.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
