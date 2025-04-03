package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueb {
    public static final ueb a;
    public static final ueb b;
    public static final ueb c;
    private static final /* synthetic */ ueb[] d;

    static {
        ueb uebVar = new ueb("DEFAULT", 0);
        a = uebVar;
        ueb uebVar2 = new ueb("COMBINE", 1);
        b = uebVar2;
        ueb uebVar3 = new ueb("COMBINE_AND_RETAIN_REPLY", 2);
        c = uebVar3;
        ueb[] uebVarArr = {uebVar, uebVar2, uebVar3};
        d = uebVarArr;
        ffhw.a(uebVarArr);
    }

    private ueb(String str, int i) {
    }

    public static ueb[] values() {
        return (ueb[]) d.clone();
    }
}
