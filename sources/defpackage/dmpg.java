package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpg {
    public static final dmpg a;
    public static final dmpg b;
    public static final dmpg c;
    private static final /* synthetic */ dmpg[] d;

    static {
        dmpg dmpgVar = new dmpg("NEUTRAL", 0);
        a = dmpgVar;
        dmpg dmpgVar2 = new dmpg("TONAL", 1);
        b = dmpgVar2;
        dmpg dmpgVar3 = new dmpg("WHITE", 2);
        c = dmpgVar3;
        dmpg[] dmpgVarArr = {dmpgVar, dmpgVar2, dmpgVar3};
        d = dmpgVarArr;
        ffhw.a(dmpgVarArr);
    }

    private dmpg(String str, int i) {
    }

    public static dmpg[] values() {
        return (dmpg[]) d.clone();
    }
}
