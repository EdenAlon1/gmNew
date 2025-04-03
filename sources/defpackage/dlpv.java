package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpv extends eyfy implements eyht {
    public static final dlpv a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public dlpu h;
    private boolean j;

    static {
        dlpv dlpvVar = new dlpv();
        a = dlpvVar;
        eyfy.registerDefaultInstance(dlpv.class, dlpvVar);
    }

    private dlpv() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
    }

    public static /* synthetic */ void a(dlpv dlpvVar) {
        dlpvVar.b |= 2048;
        dlpvVar.j = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဂ\u0003\u0005ဂ\u0004\bဇ\u000b\tဈ\u0006\nဈ\u0007\u0012ဉ\r", new Object[]{"b", "c", "d", "e", "j", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new dlpv();
        }
        if (ordinal == 4) {
            return new dlps();
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
        synchronized (dlpv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
