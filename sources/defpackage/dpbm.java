package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbm {
    public static final dpbm a;
    public static final dpbm b;
    public static final dpbm c;
    public static final dpbm d;
    private static final /* synthetic */ dpbm[] e;

    static {
        dpbm dpbmVar = new dpbm("QUEUED_INPUT_BUFFER", 0);
        a = dpbmVar;
        dpbm dpbmVar2 = new dpbm("NO_AVAILABLE_INPUT_BUFFER", 1);
        b = dpbmVar2;
        dpbm dpbmVar3 = new dpbm("REACHED_END_OF_FILE", 2);
        c = dpbmVar3;
        dpbm dpbmVar4 = new dpbm("INPUT_BUFFER_NOT_QUEUED", 3);
        d = dpbmVar4;
        dpbm[] dpbmVarArr = {dpbmVar, dpbmVar2, dpbmVar3, dpbmVar4};
        e = dpbmVarArr;
        ffhw.a(dpbmVarArr);
    }

    private dpbm(String str, int i) {
    }

    public static dpbm[] values() {
        return (dpbm[]) e.clone();
    }
}
