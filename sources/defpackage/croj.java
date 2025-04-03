package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class croj {
    public static final croj a;
    public static final croj b;
    public static final croj c;
    private static final /* synthetic */ croj[] e;
    public final String d;

    static {
        croj crojVar = new croj("FAKE", 0, "fake-security-domain");
        a = crojVar;
        croj crojVar2 = new croj("PAIRING", 1, "dialer-messages-pairing");
        b = crojVar2;
        croj crojVar3 = new croj("BACKUP_AND_RESTORE", 2, "messages-backup");
        c = crojVar3;
        croj[] crojVarArr = {crojVar, crojVar2, crojVar3};
        e = crojVarArr;
        ffhw.a(crojVarArr);
    }

    private croj(String str, int i, String str2) {
        this.d = str2;
    }

    public static croj[] values() {
        return (croj[]) e.clone();
    }
}
