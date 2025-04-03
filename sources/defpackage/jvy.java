package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class jvy {
    public static final jvy a;
    public static final jvy b;
    public static final jvy c;
    public static final jvy d;
    private static final /* synthetic */ jvy[] e;

    static {
        jvy jvyVar = new jvy("StartInput", 0);
        a = jvyVar;
        jvy jvyVar2 = new jvy("StopInput", 1);
        b = jvyVar2;
        jvy jvyVar3 = new jvy("ShowKeyboard", 2);
        c = jvyVar3;
        jvy jvyVar4 = new jvy("HideKeyboard", 3);
        d = jvyVar4;
        jvy[] jvyVarArr = {jvyVar, jvyVar2, jvyVar3, jvyVar4};
        e = jvyVarArr;
        ffhw.a(jvyVarArr);
    }

    private jvy(String str, int i) {
    }

    public static jvy[] values() {
        return (jvy[]) e.clone();
    }
}
