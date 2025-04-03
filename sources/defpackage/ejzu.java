package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzu {
    public static final ejzu a;
    public static final ejzu b;
    public static final ejzu c;
    public static final ejzu d;
    private static final /* synthetic */ ejzu[] e;

    static {
        ejzu ejzuVar = new ejzu("DEVICE", 0);
        a = ejzuVar;
        ejzu ejzuVar2 = new ejzu("USER", 1);
        b = ejzuVar2;
        ejzu ejzuVar3 = new ejzu("UI_DEVICE", 2);
        c = ejzuVar3;
        ejzu ejzuVar4 = new ejzu("UI_USER", 3);
        d = ejzuVar4;
        ejzu[] ejzuVarArr = {ejzuVar, ejzuVar2, ejzuVar3, ejzuVar4};
        e = ejzuVarArr;
        ffhw.a(ejzuVarArr);
    }

    private ejzu(String str, int i) {
    }

    public static ejzu[] values() {
        return (ejzu[]) e.clone();
    }
}
