package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drav {
    public static final drav a;
    public static final drav b;
    public static final drav c;
    public static final drav d;
    private static final /* synthetic */ drav[] e;

    static {
        drav dravVar = new drav("REACTIONS_BAR", 0);
        a = dravVar;
        drav dravVar2 = new drav("REACTIONS_BOTTOM_SHEET", 1);
        b = dravVar2;
        drav dravVar3 = new drav("EMOJI_PICKER", 2);
        c = dravVar3;
        drav dravVar4 = new drav("SMART_ACTION", 3);
        d = dravVar4;
        drav[] dravVarArr = {dravVar, dravVar2, dravVar3, dravVar4};
        e = dravVarArr;
        ffhw.a(dravVarArr);
    }

    private drav(String str, int i) {
    }

    public static drav[] values() {
        return (drav[]) e.clone();
    }
}
