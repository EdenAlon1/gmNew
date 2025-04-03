package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capm {
    public static final capm a;
    public static final capm b;
    public static final capm c;
    private static final /* synthetic */ capm[] d;

    static {
        capm capmVar = new capm("NONE", 0);
        a = capmVar;
        capm capmVar2 = new capm("ONE_ON_ONE", 1);
        b = capmVar2;
        capm capmVar3 = new capm("GROUP", 2);
        c = capmVar3;
        capm[] capmVarArr = {capmVar, capmVar2, capmVar3};
        d = capmVarArr;
        ffhw.a(capmVarArr);
    }

    private capm(String str, int i) {
    }

    public static capm[] values() {
        return (capm[]) d.clone();
    }
}
