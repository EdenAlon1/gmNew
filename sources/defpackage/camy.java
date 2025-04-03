package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camy {
    public static final camy a;
    public static final camy b;
    public static final camy c;
    public static final camy d;
    private static final /* synthetic */ camy[] e;

    static {
        camy camyVar = new camy("UNKNOWN", 0);
        a = camyVar;
        camy camyVar2 = new camy("MMS", 1);
        b = camyVar2;
        camy camyVar3 = new camy("RCS", 2);
        c = camyVar3;
        camy camyVar4 = new camy("ENCRYPTED_RCS", 3);
        d = camyVar4;
        camy[] camyVarArr = {camyVar, camyVar2, camyVar3, camyVar4};
        e = camyVarArr;
        ffhw.a(camyVarArr);
    }

    private camy(String str, int i) {
    }

    public static camy[] values() {
        return (camy[]) e.clone();
    }
}
