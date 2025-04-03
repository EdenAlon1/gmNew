package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjy {
    public static final fjy a;
    public static final fjy b;
    private static final /* synthetic */ fjy[] c;

    static {
        fjy fjyVar = new fjy("Closed", 0);
        a = fjyVar;
        fjy fjyVar2 = new fjy("Open", 1);
        b = fjyVar2;
        fjy[] fjyVarArr = {fjyVar, fjyVar2};
        c = fjyVarArr;
        ffhw.a(fjyVarArr);
    }

    private fjy(String str, int i) {
    }

    public static fjy[] values() {
        return (fjy[]) c.clone();
    }
}
