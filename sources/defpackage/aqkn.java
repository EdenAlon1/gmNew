package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkn {
    public static final aqkn a;
    public static final aqkn b;
    public static final aqkn c;
    public static final aqkn d;
    public static final aqkn e;
    public static final aqkn f;
    private static final /* synthetic */ aqkn[] h;
    public final int g;

    static {
        aqkn aqknVar = new aqkn("UNKNOWN", 0, 0);
        a = aqknVar;
        aqkn aqknVar2 = new aqkn("CAN_SHARE", 1, 1);
        b = aqknVar2;
        aqkn aqknVar3 = new aqkn("CANNOT_SHARE", 2, 2);
        c = aqknVar3;
        aqkn aqknVar4 = new aqkn("SHOULD_NOT_SHARE", 3, 3);
        d = aqknVar4;
        aqkn aqknVar5 = new aqkn("SHARING", 4, 4);
        e = aqknVar5;
        aqkn aqknVar6 = new aqkn("SHOULD_SHARE_AGAIN", 5, 5);
        f = aqknVar6;
        aqkn[] aqknVarArr = {aqknVar, aqknVar2, aqknVar3, aqknVar4, aqknVar5, aqknVar6};
        h = aqknVarArr;
        ffhw.a(aqknVarArr);
    }

    private aqkn(String str, int i, int i2) {
        this.g = i2;
    }

    public static aqkn[] values() {
        return (aqkn[]) h.clone();
    }
}
