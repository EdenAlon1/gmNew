package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easa {
    public static final easa a;
    public static final easa b;
    public static final easa c;
    public static final easa d;
    public static final easa e;
    public static final easa f;
    private static final /* synthetic */ easa[] g;

    static {
        easa easaVar = new easa("DEFAULT", 0);
        a = easaVar;
        easa easaVar2 = new easa("TV", 1);
        b = easaVar2;
        easa easaVar3 = new easa("WEARABLE", 2);
        c = easaVar3;
        easa easaVar4 = new easa("AUTOMOTIVE", 3);
        d = easaVar4;
        easa easaVar5 = new easa("BATTLESTAR", 4);
        e = easaVar5;
        easa easaVar6 = new easa("CHROME_OS", 5);
        f = easaVar6;
        easa[] easaVarArr = {easaVar, easaVar2, easaVar3, easaVar4, easaVar5, easaVar6};
        g = easaVarArr;
        ffhw.a(easaVarArr);
    }

    private easa(String str, int i) {
    }

    public static easa[] values() {
        return (easa[]) g.clone();
    }
}
