package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpa {
    public static final cvpa a;
    public static final cvpa b;
    public static final cvpa c;
    private static final /* synthetic */ cvpa[] e;
    public final int d;

    static {
        cvpa cvpaVar = new cvpa("IMPRESSION", 0, 0);
        a = cvpaVar;
        cvpa cvpaVar2 = new cvpa("POSITIVE", 1, 1);
        b = cvpaVar2;
        cvpa cvpaVar3 = new cvpa("NEGATIVE", 2, 2);
        c = cvpaVar3;
        cvpa[] cvpaVarArr = {cvpaVar, cvpaVar2, cvpaVar3};
        e = cvpaVarArr;
        ffhw.a(cvpaVarArr);
    }

    private cvpa(String str, int i, int i2) {
        this.d = i2;
    }

    public static cvpa[] values() {
        return (cvpa[]) e.clone();
    }
}
