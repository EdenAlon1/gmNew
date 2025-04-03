package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czaj {
    public static final czaj a;
    public static final czaj b;
    public static final czaj c;
    public static final czaj d;
    private static final /* synthetic */ czaj[] e;

    static {
        czaj czajVar = new czaj("DO_NOT_RENDER", 0);
        a = czajVar;
        czaj czajVar2 = new czaj("CLICKED_FROM_CDP", 1);
        b = czajVar2;
        czaj czajVar3 = new czaj("CLICKED_FROM_MINI_CDP", 2);
        c = czajVar3;
        czaj czajVar4 = new czaj("DISMISSED", 3);
        d = czajVar4;
        czaj[] czajVarArr = {czajVar, czajVar2, czajVar3, czajVar4};
        e = czajVarArr;
        ffhw.a(czajVarArr);
    }

    private czaj(String str, int i) {
    }

    public static czaj[] values() {
        return (czaj[]) e.clone();
    }
}
