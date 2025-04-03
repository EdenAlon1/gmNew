package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcr {
    public static final awcr a;
    public static final awcr b;
    public static final awcr c;
    public static final awcr d;
    public static final awcr e;
    public static final awcr f;
    public static final awcr g;
    public static final awcr h;
    public static final awcr i;
    public static final awcr j;
    public static final awcr k;
    private static final /* synthetic */ awcr[] l;

    static {
        awcr awcrVar = new awcr("PRE_WARM", 0);
        a = awcrVar;
        awcr awcrVar2 = new awcr("AWAITING_SENDING", 1);
        b = awcrVar2;
        awcr awcrVar3 = new awcr("FILE_RESIZING", 2);
        c = awcrVar3;
        awcr awcrVar4 = new awcr("THUMBNAIL_RESIZING", 3);
        d = awcrVar4;
        awcr awcrVar5 = new awcr("FILE_ENCRYPTION", 4);
        e = awcrVar5;
        awcr awcrVar6 = new awcr("THUMBNAIL_ENCRYPTION", 5);
        f = awcrVar6;
        awcr awcrVar7 = new awcr("UPLOAD", 6);
        g = awcrVar7;
        awcr awcrVar8 = new awcr("SEND", 7);
        h = awcrVar8;
        awcr awcrVar9 = new awcr("NO_OP", 8);
        i = awcrVar9;
        awcr awcrVar10 = new awcr("FILE_AND_THUMBNAIL_COMBINER", 9);
        j = awcrVar10;
        awcr awcrVar11 = new awcr("SEQUENTIAL_PIPELINE", 10);
        k = awcrVar11;
        awcr[] awcrVarArr = {awcrVar, awcrVar2, awcrVar3, awcrVar4, awcrVar5, awcrVar6, awcrVar7, awcrVar8, awcrVar9, awcrVar10, awcrVar11};
        l = awcrVarArr;
        ffhw.a(awcrVarArr);
    }

    private awcr(String str, int i2) {
    }

    public static awcr[] values() {
        return (awcr[]) l.clone();
    }
}
