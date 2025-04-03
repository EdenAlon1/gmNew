package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqs {
    public static final dqs a;
    public static final dqs b;
    private static final /* synthetic */ dqs[] c;

    static {
        dqs dqsVar = new dqs("Vertical", 0);
        a = dqsVar;
        dqs dqsVar2 = new dqs("Horizontal", 1);
        b = dqsVar2;
        dqs[] dqsVarArr = {dqsVar, dqsVar2};
        c = dqsVarArr;
        ffhw.a(dqsVarArr);
    }

    private dqs(String str, int i) {
    }

    public static dqs[] values() {
        return (dqs[]) c.clone();
    }
}
