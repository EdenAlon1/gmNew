package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class otw {
    public static final otw a;
    public static final otw b;
    public static final otw c;
    private static final /* synthetic */ otw[] d;

    static {
        otw otwVar = new otw("DEFERRED", 0);
        a = otwVar;
        otw otwVar2 = new otw("IMMEDIATE", 1);
        b = otwVar2;
        otw otwVar3 = new otw("EXCLUSIVE", 2);
        c = otwVar3;
        otw[] otwVarArr = {otwVar, otwVar2, otwVar3};
        d = otwVarArr;
        ffhw.a(otwVarArr);
    }

    private otw(String str, int i) {
    }

    public static otw[] values() {
        return (otw[]) d.clone();
    }
}
