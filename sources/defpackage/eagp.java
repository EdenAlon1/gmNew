package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagp {
    public static final eagp a;
    public static final eagp b;
    public static final eagp c;
    private static final /* synthetic */ eagp[] d;

    static {
        eagp eagpVar = new eagp("FCM", 0);
        a = eagpVar;
        eagp eagpVar2 = new eagp("FCM_AND_FETCH", 1);
        b = eagpVar2;
        eagp eagpVar3 = new eagp("FETCH_ONLY", 2);
        c = eagpVar3;
        eagp[] eagpVarArr = {eagpVar, eagpVar2, eagpVar3};
        d = eagpVarArr;
        ffhw.a(eagpVarArr);
    }

    private eagp(String str, int i) {
    }

    public static eagp[] values() {
        return (eagp[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == c || this == b;
    }
}
