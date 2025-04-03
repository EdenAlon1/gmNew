package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amny {
    public static final amny a;
    public static final amny b;
    public static final amny c;
    private static final /* synthetic */ amny[] d;

    static {
        amny amnyVar = new amny("UNKNOWN", 0);
        a = amnyVar;
        amny amnyVar2 = new amny("APPROVED", 1);
        b = amnyVar2;
        amny amnyVar3 = new amny("NOT_APPROVED", 2);
        c = amnyVar3;
        amny[] amnyVarArr = {amnyVar, amnyVar2, amnyVar3};
        d = amnyVarArr;
        ffhw.a(amnyVarArr);
    }

    private amny(String str, int i) {
    }

    public static amny[] values() {
        return (amny[]) d.clone();
    }
}
