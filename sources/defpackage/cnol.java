package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnol {
    public static final cnol a;
    public static final cnol b;
    public static final cnol c;
    public static final cnol d;
    public static final cnol e;
    private static final /* synthetic */ cnol[] f;

    static {
        cnol cnolVar = new cnol("MANUAL_SATELLITE_CONNECT_ELIGIBLE", 0);
        a = cnolVar;
        cnol cnolVar2 = new cnol("SATELLITE_DATA", 1);
        b = cnolVar2;
        cnol cnolVar3 = new cnol("SATELLITE_SMS", 2);
        c = cnolVar3;
        cnol cnolVar4 = new cnol("TERRESTRIAL", 3);
        d = cnolVar4;
        cnol cnolVar5 = new cnol("NO_CONNECTION", 4);
        e = cnolVar5;
        cnol[] cnolVarArr = {cnolVar, cnolVar2, cnolVar3, cnolVar4, cnolVar5};
        f = cnolVarArr;
        ffhw.a(cnolVarArr);
    }

    private cnol(String str, int i) {
    }

    public static cnol[] values() {
        return (cnol[]) f.clone();
    }
}
