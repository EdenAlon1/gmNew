package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssn {
    public static final ssn a;
    public static final ssn b;
    private static final /* synthetic */ ssn[] c;

    static {
        ssn ssnVar = new ssn("UNKNOWN", 0);
        a = ssnVar;
        ssn ssnVar2 = new ssn("HIDDEN", 1);
        b = ssnVar2;
        ssn[] ssnVarArr = {ssnVar, ssnVar2};
        c = ssnVarArr;
        ffhw.a(ssnVarArr);
    }

    private ssn(String str, int i) {
    }

    public static ssn[] values() {
        return (ssn[]) c.clone();
    }
}
