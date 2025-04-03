package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqys {
    public static final aqys a;
    public static final aqys b;
    public static final aqys c;
    private static final /* synthetic */ aqys[] d;

    static {
        aqys aqysVar = new aqys("AVAILABLE", 0);
        a = aqysVar;
        aqys aqysVar2 = new aqys("NOT_AVAILABLE", 1);
        b = aqysVar2;
        aqys aqysVar3 = new aqys("UNSUPPORTED_BY_CARRIER", 2);
        c = aqysVar3;
        aqys[] aqysVarArr = {aqysVar, aqysVar2, aqysVar3};
        d = aqysVarArr;
        ffhw.a(aqysVarArr);
    }

    private aqys(String str, int i) {
    }

    public static aqys[] values() {
        return (aqys[]) d.clone();
    }

    public final boolean a() {
        return this == a;
    }
}
