package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzkx {
    public static final bzkx a;
    public static final bzkx b;
    public static final bzkx c;
    public static final bzkx d;
    private static final /* synthetic */ bzkx[] e;

    static {
        bzkx bzkxVar = new bzkx("UNKNOWN", 0);
        a = bzkxVar;
        bzkx bzkxVar2 = new bzkx("IS_PRIMARY", 1);
        b = bzkxVar2;
        bzkx bzkxVar3 = new bzkx("NOT_PRIMARY", 2);
        c = bzkxVar3;
        bzkx bzkxVar4 = new bzkx("ERROR", 3);
        d = bzkxVar4;
        bzkx[] bzkxVarArr = {bzkxVar, bzkxVar2, bzkxVar3, bzkxVar4};
        e = bzkxVarArr;
        ffhw.a(bzkxVarArr);
    }

    private bzkx(String str, int i) {
    }

    public static bzkx[] values() {
        return (bzkx[]) e.clone();
    }
}
