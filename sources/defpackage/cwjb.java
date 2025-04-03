package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjb {
    public static final cwjb a;
    public static final cwjb b;
    public static final cwjb c;
    public static final cwjb d;
    public static final cwjb e;
    public static final cwjb f;
    private static final /* synthetic */ cwjb[] g;

    static {
        cwjb cwjbVar = new cwjb("ONE_TO_ONE", 0);
        a = cwjbVar;
        cwjb cwjbVar2 = new cwjb("CREATE_GROUP", 1);
        b = cwjbVar2;
        cwjb cwjbVar3 = new cwjb("MULTI_SELECT", 2);
        c = cwjbVar3;
        cwjb cwjbVar4 = new cwjb("ADD_TO_RCS_GROUP", 3);
        d = cwjbVar4;
        cwjb cwjbVar5 = new cwjb("ADD_TO_EMPTY_RCS_GROUP", 4);
        e = cwjbVar5;
        cwjb cwjbVar6 = new cwjb("ADD_TO_E2EE_GROUP", 5);
        f = cwjbVar6;
        cwjb[] cwjbVarArr = {cwjbVar, cwjbVar2, cwjbVar3, cwjbVar4, cwjbVar5, cwjbVar6};
        g = cwjbVarArr;
        ffhw.a(cwjbVarArr);
    }

    private cwjb(String str, int i) {
    }

    public static cwjb[] values() {
        return (cwjb[]) g.clone();
    }

    public final boolean a() {
        return this == b || this == d || this == e || this == f;
    }

    public final boolean b() {
        return this == f;
    }

    public final boolean c() {
        return this == d || this == e || this == f;
    }

    public final boolean d() {
        return this == a;
    }

    public final boolean e() {
        return this == b || this == c || this == d || this == e || this == f;
    }
}
