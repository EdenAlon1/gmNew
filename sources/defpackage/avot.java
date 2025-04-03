package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avot {
    public static final avot a;
    public static final avot b;
    private static final /* synthetic */ avot[] c;

    static {
        avot avotVar = new avot("LATCHED", 0);
        a = avotVar;
        avot avotVar2 = new avot("UNLATCHED", 1);
        b = avotVar2;
        avot[] avotVarArr = {avotVar, avotVar2};
        c = avotVarArr;
        ffhw.a(avotVarArr);
    }

    private avot(String str, int i) {
    }

    public static avot[] values() {
        return (avot[]) c.clone();
    }
}
