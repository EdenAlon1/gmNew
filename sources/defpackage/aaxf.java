package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxf {
    public static final aaxf a;
    public static final aaxf b;
    public static final aaxf c;
    public static final aaxf d;
    public static final aaxf e;
    private static final /* synthetic */ aaxf[] f;

    static {
        aaxf aaxfVar = new aaxf("NONE", 0);
        a = aaxfVar;
        aaxf aaxfVar2 = new aaxf("SINGLE_SELECT", 1);
        b = aaxfVar2;
        aaxf aaxfVar3 = new aaxf("MULTI_SELECT", 2);
        c = aaxfVar3;
        aaxf aaxfVar4 = new aaxf("SENSITIVE_CONTENT_SINGLE_SELECT", 3);
        d = aaxfVar4;
        aaxf aaxfVar5 = new aaxf("SENSITIVE_CONTENT_MULTI_SELECT", 4);
        e = aaxfVar5;
        aaxf[] aaxfVarArr = {aaxfVar, aaxfVar2, aaxfVar3, aaxfVar4, aaxfVar5};
        f = aaxfVarArr;
        ffhw.a(aaxfVarArr);
    }

    private aaxf(String str, int i) {
    }

    public static aaxf[] values() {
        return (aaxf[]) f.clone();
    }
}
