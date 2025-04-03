package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvm {
    public static final amvm a;
    public static final amvm b;
    public static final amvm c;
    public static final amvm d;
    public static final amvm e;
    public static final amvm f;
    public static final amvm g;
    public static final amvm h;
    public static final amvm i;
    public static final amvm j;
    public static final amvm k;
    public static final amvm l;
    public static final amvm m;
    public static final amvm n;
    private static final /* synthetic */ amvm[] o;

    static {
        amvm amvmVar = new amvm("GROUP_UPGRADE_ELIGIBLE_SELF_ACTIVE_UPGRADER", 0);
        a = amvmVar;
        amvm amvmVar2 = new amvm("SELF_NOT_ACTIVE_UPGRADER", 1);
        b = amvmVar2;
        amvm amvmVar3 = new amvm("CONVERSATION_NOT_ACTIVE", 2);
        c = amvmVar3;
        amvm amvmVar4 = new amvm("ACTIVE_SELF_NOT_FOUND", 3);
        d = amvmVar4;
        amvm amvmVar5 = new amvm("MAX_GROUP_SIZE_EXCEEDED", 4);
        e = amvmVar5;
        amvm amvmVar6 = new amvm("SELF_NOT_RCS_CAPABLE", 5);
        f = amvmVar6;
        amvm amvmVar7 = new amvm("SELF_NOT_REGISTERED", 6);
        g = amvmVar7;
        amvm amvmVar8 = new amvm("PARTICIPANT_NOT_RCS_CAPABLE", 7);
        h = amvmVar8;
        amvm amvmVar9 = new amvm("PARTICIPANT_NOT_UPGRADE_CAPABLE", 8);
        i = amvmVar9;
        amvm amvmVar10 = new amvm("REMOTE_PARTICIPANT_NOT_NORMALIZED", 9);
        j = amvmVar10;
        amvm amvmVar11 = new amvm("GROUP_SIZE_TOO_LARGE", 10);
        k = amvmVar11;
        amvm amvmVar12 = new amvm("PARTICIPANT_NOT_GOOGLE_MESSAGES", 11);
        l = amvmVar12;
        amvm amvmVar13 = new amvm("DUPLICATE_RCS_GROUP_EXISTS", 12);
        m = amvmVar13;
        amvm amvmVar14 = new amvm("SELF_IDENTITY_IN_PARTICIPANTS", 13);
        n = amvmVar14;
        amvm[] amvmVarArr = {amvmVar, amvmVar2, amvmVar3, amvmVar4, amvmVar5, amvmVar6, amvmVar7, amvmVar8, amvmVar9, amvmVar10, amvmVar11, amvmVar12, amvmVar13, amvmVar14};
        o = amvmVarArr;
        ffhw.a(amvmVarArr);
    }

    private amvm(String str, int i2) {
    }

    public static amvm[] values() {
        return (amvm[]) o.clone();
    }
}
