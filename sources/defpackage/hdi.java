package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdi {
    public static final hdi a;
    public static final hdi b;
    private static final /* synthetic */ hdi[] c;

    static {
        hdi hdiVar = new hdi("Filled", 0);
        a = hdiVar;
        hdi hdiVar2 = new hdi("Outlined", 1);
        b = hdiVar2;
        hdi[] hdiVarArr = {hdiVar, hdiVar2};
        c = hdiVarArr;
        ffhw.a(hdiVarArr);
    }

    private hdi(String str, int i) {
    }

    public static hdi[] values() {
        return (hdi[]) c.clone();
    }
}
