package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjy extends eyfy implements eyht {
    public static final epjy a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int f;
    public double h;
    public eygr d = eyfy.emptyProtobufList();
    public String e = "";
    public String g = "";

    static {
        epjy epjyVar = new epjy();
        a = epjyVar;
        eyfy.registerDefaultInstance(epjy.class, epjyVar);
    }

    private epjy() {
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000b\u0006\u0000\u0001\u0000\u0003\u001a\u0005ဈ\u0004\u0006᠌\u0005\tဈ\b\n᠌\u0001\u000bက\t", new Object[]{"b", "d", "e", "f", fbrf.a, "g", "c", fbrh.a, "h"});
        }
        if (ordinal == 3) {
            return new epjy();
        }
        if (ordinal == 4) {
            return new epjx();
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
        synchronized (epjy.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
