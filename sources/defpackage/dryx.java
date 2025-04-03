package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryx {
    public static final dryx a;
    public static final dryx b;
    private static final /* synthetic */ dryx[] c;

    static {
        dryx dryxVar = new dryx("NONE", 0);
        a = dryxVar;
        dryx dryxVar2 = new dryx("CLEAR", 1);
        b = dryxVar2;
        dryx[] dryxVarArr = {dryxVar, dryxVar2};
        c = dryxVarArr;
        ffhw.a(dryxVarArr);
    }

    private dryx(String str, int i) {
    }

    public static dryx[] values() {
        return (dryx[]) c.clone();
    }
}
