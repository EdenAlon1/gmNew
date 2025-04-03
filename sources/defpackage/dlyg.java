package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyg {
    public static final dlyg a;
    public static final dlyg b;
    public static final dlyg c;
    private static final /* synthetic */ dlyg[] d;

    static {
        dlyg dlygVar = new dlyg("PDF", 0);
        a = dlygVar;
        dlyg dlygVar2 = new dlyg("CALENDAR", 1);
        b = dlygVar2;
        dlyg dlygVar3 = new dlyg("GENERIC_FILE", 2);
        c = dlygVar3;
        dlyg[] dlygVarArr = {dlygVar, dlygVar2, dlygVar3};
        d = dlygVarArr;
        ffhw.a(dlygVarArr);
    }

    private dlyg(String str, int i) {
    }

    public static dlyg[] values() {
        return (dlyg[]) d.clone();
    }
}
