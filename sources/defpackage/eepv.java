package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepv {
    public static final eepv a;
    public static final eepv b;
    public static final eepv c;
    private static final /* synthetic */ eepv[] d;

    static {
        eepv eepvVar = new eepv("PENCIL", 0);
        a = eepvVar;
        eepv eepvVar2 = new eepv("CALLIGRAPHY", 1);
        b = eepvVar2;
        eepv eepvVar3 = new eepv("HIGHLIGHTER", 2);
        c = eepvVar3;
        eepv[] eepvVarArr = {eepvVar, eepvVar2, eepvVar3};
        d = eepvVarArr;
        ffhw.a(eepvVarArr);
    }

    private eepv(String str, int i) {
    }

    public static eepv[] values() {
        return (eepv[]) d.clone();
    }
}
