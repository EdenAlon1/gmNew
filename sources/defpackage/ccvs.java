package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvs {
    public static final ccvs a;
    public static final ccvs b;
    public static final ccvs c;
    private static final /* synthetic */ ccvs[] d;

    static {
        ccvs ccvsVar = new ccvs("RARELY_CHANGED_PART", 0);
        a = ccvsVar;
        ccvs ccvsVar2 = new ccvs("FREQUENTLY_CHANGED_PART", 1);
        b = ccvsVar2;
        ccvs ccvsVar3 = new ccvs("ADDITIONAL_FIELDS_PART", 2);
        c = ccvsVar3;
        ccvs[] ccvsVarArr = {ccvsVar, ccvsVar2, ccvsVar3};
        d = ccvsVarArr;
        ffhw.a(ccvsVarArr);
    }

    private ccvs(String str, int i) {
    }

    public static ccvs[] values() {
        return (ccvs[]) d.clone();
    }
}
