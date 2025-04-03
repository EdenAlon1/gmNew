package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjco {
    public static final cjco a;
    public static final cjco b;
    public static final cjco c;
    public static final cjco d;
    private static final /* synthetic */ cjco[] e;

    static {
        cjco cjcoVar = new cjco("UNKNOWN", 0);
        a = cjcoVar;
        cjco cjcoVar2 = new cjco("LOW", 1);
        b = cjcoVar2;
        cjco cjcoVar3 = new cjco("DEFAULT", 2);
        c = cjcoVar3;
        cjco cjcoVar4 = new cjco("HIGH", 3);
        d = cjcoVar4;
        cjco[] cjcoVarArr = {cjcoVar, cjcoVar2, cjcoVar3, cjcoVar4};
        e = cjcoVarArr;
        ffhw.a(cjcoVarArr);
    }

    private cjco(String str, int i) {
    }

    public static cjco[] values() {
        return (cjco[]) e.clone();
    }
}
