package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabz {
    public static final dabz a;
    public static final dabz b;
    public static final dabz c;
    public static final dabz d;
    private static final /* synthetic */ dabz[] f;
    public final long e;

    static {
        dabz dabzVar = new dabz("UNKNOWN", 0, 0L);
        a = dabzVar;
        dabz dabzVar2 = new dabz("INSERT", 1, 1L);
        b = dabzVar2;
        dabz dabzVar3 = new dabz("UPDATE", 2, 2L);
        c = dabzVar3;
        dabz dabzVar4 = new dabz("DELETE", 3, 3L);
        d = dabzVar4;
        dabz[] dabzVarArr = {dabzVar, dabzVar2, dabzVar3, dabzVar4};
        f = dabzVarArr;
        ffhw.a(dabzVarArr);
    }

    private dabz(String str, int i, long j) {
        this.e = j;
    }

    public static dabz[] values() {
        return (dabz[]) f.clone();
    }
}
