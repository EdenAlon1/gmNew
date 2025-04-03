package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaid {
    public static final eaid a;
    public static final eaid b;
    public static final eaid c;
    private static final /* synthetic */ eaid[] d;

    static {
        eaid eaidVar = new eaid("INVALID", 0);
        a = eaidVar;
        eaid eaidVar2 = new eaid("SYSTEM_TRAY", 1);
        b = eaidVar2;
        eaid eaidVar3 = new eaid("IN_APP", 2);
        c = eaidVar3;
        eaid[] eaidVarArr = {eaidVar, eaidVar2, eaidVar3};
        d = eaidVarArr;
        ffhw.a(eaidVarArr);
    }

    private eaid(String str, int i) {
    }

    public static eaid[] values() {
        return (eaid[]) d.clone();
    }
}
