package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamb {
    public static final eamb a;
    public static final eamb b;
    public static final eamb c;
    public static final eamb d;
    public static final eamb e;
    private static final /* synthetic */ eamb[] g;
    public final int f;

    static {
        eamb eambVar = new eamb("UNKNOWN", 0, 0);
        a = eambVar;
        eamb eambVar2 = new eamb("SIGNED_IN", 1, 1);
        b = eambVar2;
        eamb eambVar3 = new eamb("SIGNED_OUT_ZWIEBACK", 2, 2);
        c = eambVar3;
        eamb eambVar4 = new eamb("SIGNED_OUT_YOUTUBE_VISITOR", 3, 3);
        d = eambVar4;
        eamb eambVar5 = new eamb("SIGNED_IN_FITBIT", 4, 4);
        e = eambVar5;
        eamb[] eambVarArr = {eambVar, eambVar2, eambVar3, eambVar4, eambVar5};
        g = eambVarArr;
        ffhw.a(eambVarArr);
    }

    private eamb(String str, int i, int i2) {
        this.f = i2;
    }

    public static eamb[] values() {
        return (eamb[]) g.clone();
    }
}
