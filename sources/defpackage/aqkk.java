package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkk {
    public static final aqkk a;
    public static final aqkk b;
    public static final aqkk c;
    public static final aqkk d;
    private static final /* synthetic */ aqkk[] e;

    static {
        aqkk aqkkVar = new aqkk("UNKNOWN", 0);
        a = aqkkVar;
        aqkk aqkkVar2 = new aqkk("CANNOT_READ", 1);
        b = aqkkVar2;
        aqkk aqkkVar3 = new aqkk("READING", 2);
        c = aqkkVar3;
        aqkk aqkkVar4 = new aqkk("SHOULD_READ", 3);
        d = aqkkVar4;
        aqkk[] aqkkVarArr = {aqkkVar, aqkkVar2, aqkkVar3, aqkkVar4};
        e = aqkkVarArr;
        ffhw.a(aqkkVarArr);
    }

    private aqkk(String str, int i) {
    }

    public static aqkk[] values() {
        return (aqkk[]) e.clone();
    }
}
