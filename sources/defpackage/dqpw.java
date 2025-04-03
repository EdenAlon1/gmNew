package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpw {
    public static final dqpw a;
    public static final dqpw b;
    public static final dqpw c;
    private static final /* synthetic */ dqpw[] d;

    static {
        dqpw dqpwVar = new dqpw("PER_EMOJI", 0);
        a = dqpwVar;
        dqpw dqpwVar2 = new dqpw("PER_GROUP", 1);
        b = dqpwVar2;
        dqpw dqpwVar3 = new dqpw("GLOBAL", 2);
        c = dqpwVar3;
        dqpw[] dqpwVarArr = {dqpwVar, dqpwVar2, dqpwVar3};
        d = dqpwVarArr;
        ffhw.a(dqpwVarArr);
    }

    private dqpw(String str, int i) {
    }

    public static dqpw[] values() {
        return (dqpw[]) d.clone();
    }
}
