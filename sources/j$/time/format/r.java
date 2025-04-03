package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
final class r implements InterfaceC0036f {
    public static final r INSENSITIVE;
    public static final r LENIENT;
    public static final r SENSITIVE;
    public static final r STRICT;
    private static final /* synthetic */ r[] a;

    static {
        r rVar = new r("SENSITIVE", 0);
        SENSITIVE = rVar;
        r rVar2 = new r("INSENSITIVE", 1);
        INSENSITIVE = rVar2;
        r rVar3 = new r("STRICT", 2);
        STRICT = rVar3;
        r rVar4 = new r("LENIENT", 3);
        LENIENT = rVar4;
        a = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) a.clone();
    }

    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            wVar.m(true);
            return i;
        }
        if (ordinal == 1) {
            wVar.m(false);
            return i;
        }
        if (ordinal == 2) {
            wVar.q(true);
            return i;
        }
        if (ordinal != 3) {
            return i;
        }
        wVar.q(false);
        return i;
    }
}
