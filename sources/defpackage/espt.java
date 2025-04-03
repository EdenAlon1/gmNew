package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espt {
    public static final espt a;
    public static final espt b;
    public static final espt c;
    public static final espt d;
    public static final espt e;
    public static final espt f;
    public static final espt g;
    public static final espt h;
    public static final espt i;
    public static final espt j;
    public static final espt k;
    public static final espt l;
    public static final espt m;
    public static final espt n;
    public static final espt o;
    public static final espt p;
    public static final espt q;
    public static final espt r;
    private static final /* synthetic */ espt[] s;

    static {
        espt esptVar = new espt("CANCELLED", 0);
        a = esptVar;
        espt esptVar2 = new espt("UNKNOWN", 1);
        b = esptVar2;
        espt esptVar3 = new espt("INVALID_ARGUMENT", 2);
        c = esptVar3;
        espt esptVar4 = new espt("DEADLINE_EXCEEDED", 3);
        d = esptVar4;
        espt esptVar5 = new espt("NOT_FOUND", 4);
        e = esptVar5;
        espt esptVar6 = new espt("ALREADY_EXISTS", 5);
        f = esptVar6;
        espt esptVar7 = new espt("PERMISSION_DENIED", 6);
        g = esptVar7;
        espt esptVar8 = new espt("RESOURCE_EXHAUSTED", 7);
        h = esptVar8;
        espt esptVar9 = new espt("FAILED_PRECONDITION", 8);
        i = esptVar9;
        espt esptVar10 = new espt("ABORTED", 9);
        j = esptVar10;
        espt esptVar11 = new espt("OUT_OF_RANGE", 10);
        k = esptVar11;
        espt esptVar12 = new espt("UNIMPLEMENTED", 11);
        l = esptVar12;
        espt esptVar13 = new espt("INTERNAL", 12);
        m = esptVar13;
        espt esptVar14 = new espt("UNAVAILABLE", 13);
        n = esptVar14;
        espt esptVar15 = new espt("DATA_LOSS", 14);
        o = esptVar15;
        espt esptVar16 = new espt("UNAUTHENTICATED", 15);
        p = esptVar16;
        espt esptVar17 = new espt("TACHYGRAM_INTERNAL", 16);
        q = esptVar17;
        espt esptVar18 = new espt("TACHYGRAM_EXTERNAL", 17);
        r = esptVar18;
        espt[] esptVarArr = {esptVar, esptVar2, esptVar3, esptVar4, esptVar5, esptVar6, esptVar7, esptVar8, esptVar9, esptVar10, esptVar11, esptVar12, esptVar13, esptVar14, esptVar15, esptVar16, esptVar17, esptVar18};
        s = esptVarArr;
        ffhw.a(esptVarArr);
    }

    private espt(String str, int i2) {
    }

    public static espt[] values() {
        return (espt[]) s.clone();
    }
}
