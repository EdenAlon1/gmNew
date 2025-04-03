package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcg {
    public static final azcg a;
    public static final azcg b;
    public static final azcg c;
    public static final azcg d;
    private static final /* synthetic */ azcg[] e;

    static {
        azcg azcgVar = new azcg("PHONE_E164", 0);
        a = azcgVar;
        azcg azcgVar2 = new azcg("BOT", 1);
        b = azcgVar2;
        azcg azcgVar3 = new azcg("GROUP", 2);
        c = azcgVar3;
        azcg azcgVar4 = new azcg("EMERGENCY", 3);
        d = azcgVar4;
        azcg[] azcgVarArr = {azcgVar, azcgVar2, azcgVar3, azcgVar4};
        e = azcgVarArr;
        ffhw.a(azcgVarArr);
    }

    private azcg(String str, int i) {
    }

    public static azcg[] values() {
        return (azcg[]) e.clone();
    }
}
