package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgx {
    public static final aqgx a;
    public static final aqgx b;
    public static final aqgx c;
    public static final aqgx d;
    public static final aqgx e;
    private static final /* synthetic */ aqgx[] f;

    static {
        aqgx aqgxVar = new aqgx("UNKNOWN", 0);
        a = aqgxVar;
        aqgx aqgxVar2 = new aqgx("DO_NOT_SEND", 1);
        b = aqgxVar2;
        aqgx aqgxVar3 = new aqgx("NOT_SENT", 2);
        c = aqgxVar3;
        aqgx aqgxVar4 = new aqgx("SENT", 3);
        d = aqgxVar4;
        aqgx aqgxVar5 = new aqgx("SHOULD_SEND_NEW", 4);
        e = aqgxVar5;
        aqgx[] aqgxVarArr = {aqgxVar, aqgxVar2, aqgxVar3, aqgxVar4, aqgxVar5};
        f = aqgxVarArr;
        ffhw.a(aqgxVarArr);
    }

    private aqgx(String str, int i) {
    }

    public static aqgx[] values() {
        return (aqgx[]) f.clone();
    }
}
