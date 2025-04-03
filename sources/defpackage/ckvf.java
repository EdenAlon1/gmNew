package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckvf {
    public static final ckvf a;
    public static final ckvf b;
    public static final ckvf c;
    public static final ckvf d;
    public static final ckvf e;
    public static final ckvf f;
    public static final ckvf g;
    private static final /* synthetic */ ckvf[] i;
    public final int h;

    static {
        ckvf ckvfVar = new ckvf("REPAIR_NOT_NEEDED", 0, 0);
        a = ckvfVar;
        ckvf ckvfVar2 = new ckvf("MERGE_TO_EXISTING_CONVERSATION", 1, 1);
        b = ckvfVar2;
        ckvf ckvfVar3 = new ckvf("REPLACE_PARTICIPANTS", 2, 2);
        c = ckvfVar3;
        ckvf ckvfVar4 = new ckvf("NO_INCOMING_MESSAGE", 3, 3);
        d = ckvfVar4;
        ckvf ckvfVar5 = new ckvf("SELF_NUMBER_NOT_AVAILABLE", 4, 4);
        e = ckvfVar5;
        ckvf ckvfVar6 = new ckvf("INVALID_RAW_PARTICIPANTS", 5, 5);
        f = ckvfVar6;
        ckvf ckvfVar7 = new ckvf("SELF_NOT_IN_RAW_PARTICIPANTS", 6, 6);
        g = ckvfVar7;
        ckvf[] ckvfVarArr = {ckvfVar, ckvfVar2, ckvfVar3, ckvfVar4, ckvfVar5, ckvfVar6, ckvfVar7};
        i = ckvfVarArr;
        ffhw.a(ckvfVarArr);
    }

    private ckvf(String str, int i2, int i3) {
        this.h = i3;
    }

    public static ckvf[] values() {
        return (ckvf[]) i.clone();
    }
}
