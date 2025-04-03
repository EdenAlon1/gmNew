package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpym {
    public static final dpym a;
    public static final dpym b;
    private static final /* synthetic */ dpym[] c;

    static {
        dpym dpymVar = new dpym("CAMERA", 0);
        a = dpymVar;
        dpym dpymVar2 = new dpym("GALLERY", 1);
        b = dpymVar2;
        dpym[] dpymVarArr = {dpymVar, dpymVar2};
        c = dpymVarArr;
        ffhw.a(dpymVarArr);
    }

    private dpym(String str, int i) {
    }

    public static dpym[] values() {
        return (dpym[]) c.clone();
    }
}
