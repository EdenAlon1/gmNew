package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspu {
    public static final cspu a;
    public static final cspu b;
    private static final /* synthetic */ cspu[] c;

    static {
        cspu cspuVar = new cspu("ELIGIBLE", 0);
        a = cspuVar;
        cspu cspuVar2 = new cspu("INELIGIBLE", 1);
        b = cspuVar2;
        cspu[] cspuVarArr = {cspuVar, cspuVar2};
        c = cspuVarArr;
        ffhw.a(cspuVarArr);
    }

    private cspu(String str, int i) {
    }

    public static cspu[] values() {
        return (cspu[]) c.clone();
    }
}
