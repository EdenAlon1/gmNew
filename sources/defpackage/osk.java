package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class osk {
    public static final osk a;
    public static final osk b;
    public static final osk c;
    private static final /* synthetic */ osk[] d;

    static {
        osk oskVar = new osk("NO_OP", 0);
        a = oskVar;
        osk oskVar2 = new osk("ADD", 1);
        b = oskVar2;
        osk oskVar3 = new osk("REMOVE", 2);
        c = oskVar3;
        osk[] oskVarArr = {oskVar, oskVar2, oskVar3};
        d = oskVarArr;
        ffhw.a(oskVarArr);
    }

    private osk(String str, int i) {
    }

    public static osk[] values() {
        return (osk[]) d.clone();
    }
}
