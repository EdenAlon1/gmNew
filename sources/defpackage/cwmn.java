package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmn {
    public static final cwmn a;
    public static final cwmn b;
    public static final cwmn c;
    public static final cwmn d;
    private static final /* synthetic */ cwmn[] e;

    static {
        cwmn cwmnVar = new cwmn("COOL_RANCH", 0);
        a = cwmnVar;
        cwmn cwmnVar2 = new cwmn("SAMSUNG_DYNAMIC", 1);
        b = cwmnVar2;
        cwmn cwmnVar3 = new cwmn("MATERIAL_NEXT", 2);
        c = cwmnVar3;
        cwmn cwmnVar4 = new cwmn("SYSTEM_FONT", 3);
        d = cwmnVar4;
        cwmn[] cwmnVarArr = {cwmnVar, cwmnVar2, cwmnVar3, cwmnVar4};
        e = cwmnVarArr;
        ffhw.a(cwmnVarArr);
    }

    private cwmn(String str, int i) {
    }

    public static cwmn[] values() {
        return (cwmn[]) e.clone();
    }
}
