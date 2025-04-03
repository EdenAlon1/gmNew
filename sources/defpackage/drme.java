package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drme {
    public static final drme a;
    public static final drme b;
    public static final drme c;
    public static final drme d;
    private static final /* synthetic */ drme[] e;

    static {
        drme drmeVar = new drme("VERY_LOW", 0);
        a = drmeVar;
        drme drmeVar2 = new drme("LOW", 1);
        b = drmeVar2;
        drme drmeVar3 = new drme("HIGH", 2);
        c = drmeVar3;
        drme drmeVar4 = new drme("ORIGINAL", 3);
        d = drmeVar4;
        drme[] drmeVarArr = {drmeVar, drmeVar2, drmeVar3, drmeVar4};
        e = drmeVarArr;
        ffhw.a(drmeVarArr);
    }

    private drme(String str, int i) {
    }

    public static drme[] values() {
        return (drme[]) e.clone();
    }
}
