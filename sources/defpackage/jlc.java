package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlc {
    public static final jlc a;
    public static final jlc b;
    public static final jlc c;
    private static final /* synthetic */ jlc[] d;

    static {
        jlc jlcVar = new jlc("On", 0);
        a = jlcVar;
        jlc jlcVar2 = new jlc("Off", 1);
        b = jlcVar2;
        jlc jlcVar3 = new jlc("Indeterminate", 2);
        c = jlcVar3;
        jlc[] jlcVarArr = {jlcVar, jlcVar2, jlcVar3};
        d = jlcVarArr;
        ffhw.a(jlcVarArr);
    }

    private jlc(String str, int i) {
    }

    public static jlc[] values() {
        return (jlc[]) d.clone();
    }
}
