package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azhr {
    public static final azhr a;
    public static final azhr b;
    private static final /* synthetic */ azhr[] c;

    static {
        azhr azhrVar = new azhr("RCS", 0);
        a = azhrVar;
        azhr azhrVar2 = new azhr("MMS", 1);
        b = azhrVar2;
        azhr[] azhrVarArr = {azhrVar, azhrVar2};
        c = azhrVarArr;
        ffhw.a(azhrVarArr);
    }

    private azhr(String str, int i) {
    }

    public static azhr[] values() {
        return (azhr[]) c.clone();
    }
}
