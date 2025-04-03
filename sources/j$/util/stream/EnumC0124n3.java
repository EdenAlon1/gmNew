package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class EnumC0124n3 {
    public static final EnumC0124n3 DISTINCT;
    public static final EnumC0124n3 ORDERED;
    public static final EnumC0124n3 SHORT_CIRCUIT;
    public static final EnumC0124n3 SIZED;
    public static final EnumC0124n3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC0124n3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        EnumC0119m3 enumC0119m3 = EnumC0119m3.SPLITERATOR;
        C0114l3 G = G(enumC0119m3);
        EnumC0119m3 enumC0119m32 = EnumC0119m3.STREAM;
        G.a(enumC0119m32);
        EnumC0119m3 enumC0119m33 = EnumC0119m3.OP;
        G.a.put((EnumMap) enumC0119m33, (EnumC0119m3) 3);
        EnumC0124n3 enumC0124n3 = new EnumC0124n3("DISTINCT", 0, 0, G);
        DISTINCT = enumC0124n3;
        C0114l3 G2 = G(enumC0119m3);
        G2.a(enumC0119m32);
        G2.a.put((EnumMap) enumC0119m33, (EnumC0119m3) 3);
        EnumC0124n3 enumC0124n32 = new EnumC0124n3("SORTED", 1, 1, G2);
        SORTED = enumC0124n32;
        C0114l3 G3 = G(enumC0119m3);
        G3.a(enumC0119m32);
        EnumMap enumMap = G3.a;
        enumMap.put((EnumMap) enumC0119m33, (EnumC0119m3) 3);
        EnumC0119m3 enumC0119m34 = EnumC0119m3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC0119m34, (EnumC0119m3) 2);
        EnumC0119m3 enumC0119m35 = EnumC0119m3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC0119m35, (EnumC0119m3) 2);
        EnumC0124n3 enumC0124n33 = new EnumC0124n3("ORDERED", 2, 2, G3);
        ORDERED = enumC0124n33;
        C0114l3 G4 = G(enumC0119m3);
        G4.a(enumC0119m32);
        G4.a.put((EnumMap) enumC0119m33, (EnumC0119m3) 2);
        EnumC0124n3 enumC0124n34 = new EnumC0124n3("SIZED", 3, 3, G4);
        SIZED = enumC0124n34;
        C0114l3 G5 = G(enumC0119m33);
        G5.a(enumC0119m34);
        int i2 = 0;
        EnumC0124n3 enumC0124n35 = new EnumC0124n3("SHORT_CIRCUIT", 4, 12, G5);
        SHORT_CIRCUIT = enumC0124n35;
        v = new EnumC0124n3[]{enumC0124n3, enumC0124n32, enumC0124n33, enumC0124n34, enumC0124n35};
        f = u(enumC0119m3);
        g = u(enumC0119m32);
        h = u(enumC0119m33);
        u(enumC0119m34);
        u(enumC0119m35);
        for (EnumC0124n3 enumC0124n36 : values()) {
            i2 |= enumC0124n36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0124n3 enumC0124n37 = DISTINCT;
        m = enumC0124n37.c;
        n = enumC0124n37.d;
        EnumC0124n3 enumC0124n38 = SORTED;
        o = enumC0124n38.c;
        p = enumC0124n38.d;
        EnumC0124n3 enumC0124n39 = ORDERED;
        q = enumC0124n39.c;
        r = enumC0124n39.d;
        EnumC0124n3 enumC0124n310 = SIZED;
        s = enumC0124n310.c;
        t = enumC0124n310.d;
        u = SHORT_CIRCUIT.c;
    }

    private EnumC0124n3(String str, int i2, int i3, C0114l3 c0114l3) {
        EnumC0119m3[] values = EnumC0119m3.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = c0114l3.a;
            if (i4 >= length) {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            Map.EL.putIfAbsent(enumMap, values[i4], 0);
            i4++;
        }
    }

    private static C0114l3 G(EnumC0119m3 enumC0119m3) {
        C0114l3 c0114l3 = new C0114l3(new EnumMap(EnumC0119m3.class));
        c0114l3.a(enumC0119m3);
        return c0114l3;
    }

    static int Z(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int o(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    private static int u(EnumC0119m3 enumC0119m3) {
        int i2 = 0;
        for (EnumC0124n3 enumC0124n3 : values()) {
            i2 |= ((Integer) enumC0124n3.a.get(enumC0119m3)).intValue() << enumC0124n3.b;
        }
        return i2;
    }

    static int v(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    public static EnumC0124n3 valueOf(String str) {
        return (EnumC0124n3) Enum.valueOf(EnumC0124n3.class, str);
    }

    public static EnumC0124n3[] values() {
        return (EnumC0124n3[]) v.clone();
    }

    final boolean D(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }

    final boolean y(int i2) {
        return (i2 & this.e) == this.c;
    }
}
