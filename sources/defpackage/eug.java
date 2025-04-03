package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eug {
    public static final eug a;
    public static final eug b;
    public static final eug c;
    private static final /* synthetic */ eug[] d;

    static {
        eug eugVar = new eug("None", 0);
        a = eugVar;
        eug eugVar2 = new eug("Selection", 1);
        b = eugVar2;
        eug eugVar3 = new eug("Cursor", 2);
        c = eugVar3;
        eug[] eugVarArr = {eugVar, eugVar2, eugVar3};
        d = eugVarArr;
        ffhw.a(eugVarArr);
    }

    private eug(String str, int i) {
    }

    public static eug[] values() {
        return (eug[]) d.clone();
    }
}
