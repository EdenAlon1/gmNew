package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejp {
    public static final dejp a;
    public static final dejp b;
    public static final dejp c;
    private static final /* synthetic */ dejp[] d;

    static {
        dejp dejpVar = new dejp("NO_ACTIVITY", 0);
        a = dejpVar;
        dejp dejpVar2 = new dejp("WELCOME_FLOW_SIGNIN_USER", 1);
        b = dejpVar2;
        dejp dejpVar3 = new dejp("WELCOME_FLOW_SIGNOUT_USER", 2);
        c = dejpVar3;
        dejp[] dejpVarArr = {dejpVar, dejpVar2, dejpVar3};
        d = dejpVarArr;
        ffhw.a(dejpVarArr);
    }

    private dejp(String str, int i) {
    }

    public static dejp[] values() {
        return (dejp[]) d.clone();
    }
}
