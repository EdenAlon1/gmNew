package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpad {
    public static final dpad a;
    public static final dpad b;
    private static final /* synthetic */ dpad[] c;

    static {
        dpad dpadVar = new dpad("MINIMUM", 0);
        a = dpadVar;
        dpad dpadVar2 = new dpad("MAXIMUM", 1);
        b = dpadVar2;
        dpad[] dpadVarArr = {dpadVar, dpadVar2};
        c = dpadVarArr;
        ffhw.a(dpadVarArr);
    }

    private dpad(String str, int i) {
    }

    public static dpad[] values() {
        return (dpad[]) c.clone();
    }
}
