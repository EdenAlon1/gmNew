package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cors {
    public static final cors a;
    public static final cors b;
    public static final cors c;
    private static final /* synthetic */ cors[] d;

    static {
        cors corsVar = new cors("DEFAULT_CALL_SIM", 0);
        a = corsVar;
        cors corsVar2 = new cors("DEFAULT_SMS_SIM", 1);
        b = corsVar2;
        cors corsVar3 = new cors("DEFAULT_DATA_SIM", 2);
        c = corsVar3;
        cors[] corsVarArr = {corsVar, corsVar2, corsVar3};
        d = corsVarArr;
        ffhw.a(corsVarArr);
    }

    private cors(String str, int i) {
    }

    public static cors[] values() {
        return (cors[]) d.clone();
    }
}
