package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsp {
    public static final xsp a;
    public static final xsp b;
    public static final xsp c;
    public static final xsp d;
    public static final xsp e;
    private static final /* synthetic */ xsp[] f;

    static {
        xsp xspVar = new xsp("NONE", 0);
        a = xspVar;
        xsp xspVar2 = new xsp("SUBJECT_URGENT", 1);
        b = xspVar2;
        xsp xspVar3 = new xsp("REPLY", 2);
        c = xspVar3;
        xsp xspVar4 = new xsp("SCHEDULED_SEND", 3);
        d = xspVar4;
        xsp xspVar5 = new xsp("EDIT", 4);
        e = xspVar5;
        xsp[] xspVarArr = {xspVar, xspVar2, xspVar3, xspVar4, xspVar5};
        f = xspVarArr;
        ffhw.a(xspVarArr);
    }

    private xsp(String str, int i) {
    }

    public static xsp[] values() {
        return (xsp[]) f.clone();
    }
}
