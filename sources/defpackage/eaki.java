package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaki {
    public static final eaki a;
    public static final eaki b;
    public static final eaki c;
    public static final eaki d;
    public static final eaki e;
    public static final eaki f;
    private static final /* synthetic */ eaki[] g;

    static {
        eaki eakiVar = new eaki("PRODUCTION", 0);
        a = eakiVar;
        eaki eakiVar2 = new eaki("AUTOPUSH", 1);
        b = eakiVar2;
        eaki eakiVar3 = new eaki("AUTOPUSH_QUAL_PLAYGROUND", 2);
        c = eakiVar3;
        eaki eakiVar4 = new eaki("STAGING", 3);
        d = eakiVar4;
        eaki eakiVar5 = new eaki("STAGING_QUAL_QA", 4);
        e = eakiVar5;
        eaki eakiVar6 = new eaki("DEV", 5);
        f = eakiVar6;
        eaki[] eakiVarArr = {eakiVar, eakiVar2, eakiVar3, eakiVar4, eakiVar5, eakiVar6};
        g = eakiVarArr;
        ffhw.a(eakiVarArr);
    }

    private eaki(String str, int i) {
    }

    public static eaki[] values() {
        return (eaki[]) g.clone();
    }
}
