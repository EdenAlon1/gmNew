package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class gey {
    public static final gey a;
    public static final gey b;
    private static final /* synthetic */ gey[] c;

    static {
        gey geyVar = new gey("Selector", 0);
        a = geyVar;
        gey geyVar2 = new gey("InnerCircle", 1);
        b = geyVar2;
        gey[] geyVarArr = {geyVar, geyVar2};
        c = geyVarArr;
        ffhw.a(geyVarArr);
    }

    private gey(String str, int i) {
    }

    public static gey[] values() {
        return (gey[]) c.clone();
    }
}
