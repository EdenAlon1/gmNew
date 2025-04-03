package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PG */
/* loaded from: classes5.dex */
public class emvf {
    public static final emvf a;
    public static final emvf b;
    public static final emvf c;
    public static final emvf d;
    public static final emvf e;
    private static final /* synthetic */ emvf[] h;
    public final emvz f;
    public final String g;

    static {
        final emvp emvpVar = new emvp('-');
        emvf emvfVar = new emvf(emvpVar) { // from class: emvc
        };
        a = emvfVar;
        final emvp emvpVar2 = new emvp('_');
        emvf emvfVar2 = new emvf(emvpVar2) { // from class: emvd
        };
        b = emvfVar2;
        emvf emvfVar3 = new emvf("LOWER_CAMEL", 2, new emvo('A', 'Z'), "");
        c = emvfVar3;
        emvf emvfVar4 = new emvf("UPPER_CAMEL", 3, new emvo('A', 'Z'), "");
        d = emvfVar4;
        final emvp emvpVar3 = new emvp('_');
        emvf emvfVar5 = new emvf(emvpVar3) { // from class: emve
        };
        e = emvfVar5;
        h = new emvf[]{emvfVar, emvfVar2, emvfVar3, emvfVar4, emvfVar5};
    }

    public emvf(String str, int i, emvz emvzVar, String str2) {
        this.f = emvzVar;
        this.g = str2;
    }

    private static String b(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return emuz.b(str.charAt(0)) + emuz.c(str.substring(1));
    }

    public static emvf[] values() {
        return (emvf[]) h.clone();
    }

    public final String a(String str) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return emuz.c(str);
        }
        if (ordinal == 1) {
            return emuz.c(str);
        }
        if (ordinal == 2) {
            return b(str);
        }
        if (ordinal == 3) {
            return b(str);
        }
        if (ordinal == 4) {
            return emuz.d(str);
        }
        throw null;
    }
}
