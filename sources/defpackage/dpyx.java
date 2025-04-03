package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyx {
    public static final dpyx a;
    public static final dpyx b;
    public static final dpyx c;
    private static final /* synthetic */ dpyx[] d;

    static {
        dpyx dpyxVar = new dpyx("NONE", 0);
        a = dpyxVar;
        dpyx dpyxVar2 = new dpyx("PARTIAL", 1);
        b = dpyxVar2;
        dpyx dpyxVar3 = new dpyx("FULL", 2);
        c = dpyxVar3;
        dpyx[] dpyxVarArr = {dpyxVar, dpyxVar2, dpyxVar3};
        d = dpyxVarArr;
        ffhw.a(dpyxVarArr);
    }

    private dpyx(String str, int i) {
    }

    public static dpyx[] values() {
        return (dpyx[]) d.clone();
    }
}
