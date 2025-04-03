package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckte {
    public static final ckte a;
    public static final ckte b;
    public static final ckte c;
    public static final ckte d;
    public static final ckte e;
    public static final ckte f;
    public static final ckte g;
    public static final ckte h;
    public static final ckte i;
    public static final ckte j;
    private static final /* synthetic */ ckte[] l;
    public final int k;

    static {
        ckte ckteVar = new ckte("UNKNOWN", 0, 0);
        a = ckteVar;
        ckte ckteVar2 = new ckte("NOT_ELIGIBLE_BECAUSE_INACTIVE", 1, 1);
        b = ckteVar2;
        ckte ckteVar3 = new ckte("NOT_ELIGIBLE_NOT_EVERYONE_RCS", 2, 2);
        c = ckteVar3;
        ckte ckteVar4 = new ckte("NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT", 3, 3);
        d = ckteVar4;
        ckte ckteVar5 = new ckte("ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER", 4, 4);
        e = ckteVar5;
        ckte ckteVar6 = new ckte("UPGRADE_STARTED", 5, 5);
        f = ckteVar6;
        ckte ckteVar7 = new ckte("RCS_GROUP_CREATION_FAILED", 6, 6);
        g = ckteVar7;
        ckte ckteVar8 = new ckte("RCS_GROUP_CREATION_SUCCEEDED", 7, 7);
        h = ckteVar8;
        ckte ckteVar9 = new ckte("UPGRADE_FAILED", 8, 8);
        i = ckteVar9;
        ckte ckteVar10 = new ckte("UPGRADE_COMPLETE", 9, 9);
        j = ckteVar10;
        ckte[] ckteVarArr = {ckteVar, ckteVar2, ckteVar3, ckteVar4, ckteVar5, ckteVar6, ckteVar7, ckteVar8, ckteVar9, ckteVar10};
        l = ckteVarArr;
        ffhw.a(ckteVarArr);
    }

    private ckte(String str, int i2, int i3) {
        this.k = i3;
    }

    public static ckte[] values() {
        return (ckte[]) l.clone();
    }
}
