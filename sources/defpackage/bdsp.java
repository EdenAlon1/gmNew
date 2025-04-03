package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsp {
    public static final bdsp a;
    public static final bdsp b;
    public static final bdsp c;
    public static final bdsp d;
    public static final bdsp e;
    public static final bdsp f;
    public static final bdsp g;
    public static final bdsp h;
    public static final bdsp i;
    public static final bdsp j;
    private static final /* synthetic */ bdsp[] k;

    static {
        bdsp bdspVar = new bdsp("TEST", 0);
        a = bdspVar;
        bdsp bdspVar2 = new bdsp("GET_OR_CREATE_CONVERSATION", 1);
        b = bdspVar2;
        bdsp bdspVar3 = new bdsp("UPDATE_BUGLE_PARTICIPANT_TO_MORE_CANONICAL", 2);
        c = bdspVar3;
        bdsp bdspVar4 = new bdsp("REFRESH_SELF_PARTICIPANT", 3);
        d = bdspVar4;
        bdsp bdspVar5 = new bdsp("SANITIZE_PARTICIPANTS_ACTION", 4);
        e = bdspVar5;
        bdsp bdspVar6 = new bdsp("SELF_PARTICIPANTS_DATA", 5);
        f = bdspVar6;
        bdsp bdspVar7 = new bdsp("PARTICIPANT_RECOVERY_OPERATIONS", 6);
        g = bdspVar7;
        bdsp bdspVar8 = new bdsp("PARTICIPANT_REFRESH_SELF", 7);
        h = bdspVar8;
        bdsp bdspVar9 = new bdsp("PARTICIPANT_REFRESH_OTHER", 8);
        i = bdspVar9;
        bdsp bdspVar10 = new bdsp("CMS_PARTICIPANT_MERGE", 9);
        j = bdspVar10;
        bdsp[] bdspVarArr = {bdspVar, bdspVar2, bdspVar3, bdspVar4, bdspVar5, bdspVar6, bdspVar7, bdspVar8, bdspVar9, bdspVar10};
        k = bdspVarArr;
        ffhw.a(bdspVarArr);
    }

    private bdsp(String str, int i2) {
    }

    public static bdsp[] values() {
        return (bdsp[]) k.clone();
    }
}
