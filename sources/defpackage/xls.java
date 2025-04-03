package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xls {
    public static final xls a;
    public static final xls b;
    public static final xls c;
    public static final xls d;
    private static final /* synthetic */ xls[] e;

    static {
        xls xlsVar = new xls("PROCESSING_ATTACHMENTS", 0);
        a = xlsVar;
        xls xlsVar2 = new xls("EDIT_MESSAGE_TEXT_NOT_CHANGED", 1);
        b = xlsVar2;
        xls xlsVar3 = new xls("NO_SENDABLE_DRAFT_CONTENTS", 2);
        c = xlsVar3;
        xls xlsVar4 = new xls("LONGER_THAN_MAX_MESSAGE_SIZE", 3);
        d = xlsVar4;
        xls[] xlsVarArr = {xlsVar, xlsVar2, xlsVar3, xlsVar4};
        e = xlsVarArr;
        ffhw.a(xlsVarArr);
    }

    private xls(String str, int i) {
    }

    public static xls[] values() {
        return (xls[]) e.clone();
    }
}
