package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepw {
    public static final eepw a;
    public static final eepw b;
    public static final eepw c;
    private static final /* synthetic */ eepw[] d;

    static {
        eepw eepwVar = new eepw("TRANSFORM", 0);
        a = eepwVar;
        eepw eepwVar2 = new eepw("STROKE", 1);
        b = eepwVar2;
        eepw eepwVar3 = new eepw("TEXT", 2);
        c = eepwVar3;
        eepw[] eepwVarArr = {eepwVar, eepwVar2, eepwVar3};
        d = eepwVarArr;
        ffhw.a(eepwVarArr);
    }

    private eepw(String str, int i) {
    }

    public static eepw[] values() {
        return (eepw[]) d.clone();
    }
}
