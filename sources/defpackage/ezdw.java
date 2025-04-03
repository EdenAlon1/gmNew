package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezdw extends eyfy implements eyht {
    public static final ezdw a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;

    static {
        ezdw ezdwVar = new ezdw();
        a = ezdwVar;
        eyfy.registerDefaultInstance(ezdw.class, ezdwVar);
    }

    private ezdw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", ezdv.a, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ezdw();
        }
        if (ordinal == 4) {
            return new ezdu();
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
        synchronized (ezdw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
