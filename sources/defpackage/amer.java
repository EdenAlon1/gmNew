package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amer {
    public static final amer a;
    public static final amer b;
    public static final amer c;
    private static final /* synthetic */ amer[] d;

    static {
        amer amerVar = new amer("UNKNOWN", 0);
        a = amerVar;
        amer amerVar2 = new amer("INCOMING_ENCRYPTED_RCS_MESSAGE", 1);
        b = amerVar2;
        amer amerVar3 = new amer("FORWARD_SYNC", 2);
        c = amerVar3;
        amer[] amerVarArr = {amerVar, amerVar2, amerVar3};
        d = amerVarArr;
        ffhw.a(amerVarArr);
    }

    private amer(String str, int i) {
    }

    public static amer[] values() {
        return (amer[]) d.clone();
    }
}
