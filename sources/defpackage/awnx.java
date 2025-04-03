package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnx {
    public static final awnx a;
    public static final awnx b;
    public static final awnx c;
    public static final awnx d;
    public static final awnx e;
    public static final awnx f;
    public static final awnx g;
    public static final awnx h;
    public static final awnx i;
    public static final awnx j;
    private static final /* synthetic */ awnx[] l;
    public final int k;

    static {
        awnx awnxVar = new awnx("FULL_STATE_EQUAL", 0, 1);
        a = awnxVar;
        awnx awnxVar2 = new awnx("FULL_STATE_LEGACY_NOT_EXISTS", 1, 2);
        b = awnxVar2;
        awnx awnxVar3 = new awnx("FULL_STATE_GROUP_PRIMITIVE_NOT_EXISTS", 2, 3);
        c = awnxVar3;
        awnx awnxVar4 = new awnx("FULL_STATE_DIFFERENT_MEMBERS", 3, 4);
        d = awnxVar4;
        awnx awnxVar5 = new awnx("FULL_STATE_DIFFERENT_DETAILS", 4, 5);
        e = awnxVar5;
        awnx awnxVar6 = new awnx("PARTIAL_UPDATE_EQUAL", 5, 6);
        f = awnxVar6;
        awnx awnxVar7 = new awnx("PARTIAL_UPDATE_LEGACY_NOT_EXISTS", 6, 7);
        g = awnxVar7;
        awnx awnxVar8 = new awnx("PARTIAL_UPDATE_GROUP_PRIMITIVE_NOT_EXISTS", 7, 8);
        h = awnxVar8;
        awnx awnxVar9 = new awnx("PARTIAL_UPDATE_DIFFERENT_MEMBERS", 8, 9);
        i = awnxVar9;
        awnx awnxVar10 = new awnx("PARTIAL_UPDATE_DIFFERENT_DETAILS", 9, 10);
        j = awnxVar10;
        awnx[] awnxVarArr = {awnxVar, awnxVar2, awnxVar3, awnxVar4, awnxVar5, awnxVar6, awnxVar7, awnxVar8, awnxVar9, awnxVar10};
        l = awnxVarArr;
        ffhw.a(awnxVarArr);
    }

    private awnx(String str, int i2, int i3) {
        this.k = i3;
    }

    public static awnx[] values() {
        return (awnx[]) l.clone();
    }
}
