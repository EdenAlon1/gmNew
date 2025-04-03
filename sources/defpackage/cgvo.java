package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgvo {
    public static final cgvo a;
    public static final cgvo b;
    public static final cgvo c;
    public static final cgvo d;
    public static final cgvo e;
    public static final cgvo f;
    public static final cgvo g;
    public static final cgvo h;
    public static final cgvo i;
    public static final cgvo j;
    private static final /* synthetic */ cgvo[] k;

    static {
        cgvo cgvoVar = new cgvo("UNKNOWN", 0);
        a = cgvoVar;
        cgvo cgvoVar2 = new cgvo("WRONG_CODE_SELECTED", 1);
        b = cgvoVar2;
        cgvo cgvoVar3 = new cgvo("CANCELED_VERIFICATION", 2);
        c = cgvoVar3;
        cgvo cgvoVar4 = new cgvo("CANCELED_VERIFICATION_ON_WEB", 3);
        d = cgvoVar4;
        cgvo cgvoVar5 = new cgvo("DENY_VERIFICATION", 4);
        e = cgvoVar5;
        cgvo cgvoVar6 = new cgvo("EMOJI_DOWNLOAD_FAILED", 5);
        f = cgvoVar6;
        cgvo cgvoVar7 = new cgvo("TIME_OUT", 6);
        g = cgvoVar7;
        cgvo cgvoVar8 = new cgvo("SUCCESS", 7);
        h = cgvoVar8;
        cgvo cgvoVar9 = new cgvo("NEW_REQUEST_WHILE_WAITING", 8);
        i = cgvoVar9;
        cgvo cgvoVar10 = new cgvo("UKEY2_ERROR", 9);
        j = cgvoVar10;
        cgvo[] cgvoVarArr = {cgvoVar, cgvoVar2, cgvoVar3, cgvoVar4, cgvoVar5, cgvoVar6, cgvoVar7, cgvoVar8, cgvoVar9, cgvoVar10};
        k = cgvoVarArr;
        ffhw.a(cgvoVarArr);
    }

    private cgvo(String str, int i2) {
    }

    public static cgvo[] values() {
        return (cgvo[]) k.clone();
    }
}
