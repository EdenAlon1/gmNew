package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class jlq {
    public static final jlq a;
    public static final jlq b;
    public static final jlq c;
    public static final jlq d;
    public static final jlq e;
    public static final jlq f;
    public static final jlq g;
    private static final /* synthetic */ jlq[] h;

    static {
        jlq jlqVar = new jlq("Paragraph", 0);
        a = jlqVar;
        jlq jlqVar2 = new jlq("Span", 1);
        b = jlqVar2;
        jlq jlqVar3 = new jlq("VerbatimTts", 2);
        c = jlqVar3;
        jlq jlqVar4 = new jlq("Url", 3);
        d = jlqVar4;
        jlq jlqVar5 = new jlq("Link", 4);
        e = jlqVar5;
        jlq jlqVar6 = new jlq("Clickable", 5);
        f = jlqVar6;
        jlq jlqVar7 = new jlq("String", 6);
        g = jlqVar7;
        jlq[] jlqVarArr = {jlqVar, jlqVar2, jlqVar3, jlqVar4, jlqVar5, jlqVar6, jlqVar7};
        h = jlqVarArr;
        ffhw.a(jlqVarArr);
    }

    private jlq(String str, int i) {
    }

    public static jlq[] values() {
        return (jlq[]) h.clone();
    }
}
