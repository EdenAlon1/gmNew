package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gos {
    public static final gos a;
    public static final gos b;
    private static final /* synthetic */ gos[] c;

    static {
        gos gosVar = new gos("Dismissed", 0);
        a = gosVar;
        gos gosVar2 = new gos("ActionPerformed", 1);
        b = gosVar2;
        gos[] gosVarArr = {gosVar, gosVar2};
        c = gosVarArr;
        ffhw.a(gosVarArr);
    }

    private gos(String str, int i) {
    }

    public static gos[] values() {
        return (gos[]) c.clone();
    }
}
