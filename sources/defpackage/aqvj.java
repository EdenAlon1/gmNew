package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqvj {
    public static final aqvj a;
    public static final aqvj b;
    public static final aqvj c;
    public static final aqvj d;
    public static final aqvj e;
    private static final /* synthetic */ aqvj[] f;

    static {
        aqvj aqvjVar = new aqvj("UNKNOWN", 0);
        a = aqvjVar;
        aqvj aqvjVar2 = new aqvj("CELLULAR", 1);
        b = aqvjVar2;
        aqvj aqvjVar3 = new aqvj("SATELLITE_MANUAL_ELIGIBLE", 2);
        c = aqvjVar3;
        aqvj aqvjVar4 = new aqvj("SATELLITE_AUTO_CONNECT", 3);
        d = aqvjVar4;
        aqvj aqvjVar5 = new aqvj("SATELLITE_MANUAL_CONNECT", 4);
        e = aqvjVar5;
        aqvj[] aqvjVarArr = {aqvjVar, aqvjVar2, aqvjVar3, aqvjVar4, aqvjVar5};
        f = aqvjVarArr;
        ffhw.a(aqvjVarArr);
    }

    private aqvj(String str, int i) {
    }

    public static aqvj[] values() {
        return (aqvj[]) f.clone();
    }

    public final boolean a() {
        return this == d;
    }
}
