package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpj {
    public static final gpj a;
    public static final gpj b;
    public static final gpj c;
    private static final /* synthetic */ gpj[] d;

    static {
        gpj gpjVar = new gpj("StartToEnd", 0);
        a = gpjVar;
        gpj gpjVar2 = new gpj("EndToStart", 1);
        b = gpjVar2;
        gpj gpjVar3 = new gpj("Settled", 2);
        c = gpjVar3;
        gpj[] gpjVarArr = {gpjVar, gpjVar2, gpjVar3};
        d = gpjVarArr;
        ffhw.a(gpjVarArr);
    }

    private gpj(String str, int i) {
    }

    public static gpj[] values() {
        return (gpj[]) d.clone();
    }
}
