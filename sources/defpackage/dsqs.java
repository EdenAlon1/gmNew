package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqs {
    public static final dsqs a;
    public static final dsqs b;
    public static final dsqs c;
    public static final dsqs d;
    public static final dsqs e;
    public static final dsqs f;
    public static final dsqs g;
    private static final /* synthetic */ dsqs[] h;

    static {
        dsqs dsqsVar = new dsqs("Background", 0);
        a = dsqsVar;
        dsqs dsqsVar2 = new dsqs("Header", 1);
        b = dsqsVar2;
        dsqs dsqsVar3 = new dsqs("Content", 2);
        c = dsqsVar3;
        dsqs dsqsVar4 = new dsqs("Footer", 3);
        d = dsqsVar4;
        dsqs dsqsVar5 = new dsqs("ContentOverlay", 4);
        e = dsqsVar5;
        dsqs dsqsVar6 = new dsqs("ScreenOverlay", 5);
        f = dsqsVar6;
        dsqs dsqsVar7 = new dsqs("Snackbar", 6);
        g = dsqsVar7;
        dsqs[] dsqsVarArr = {dsqsVar, dsqsVar2, dsqsVar3, dsqsVar4, dsqsVar5, dsqsVar6, dsqsVar7};
        h = dsqsVarArr;
        ffhw.a(dsqsVarArr);
    }

    private dsqs(String str, int i) {
    }

    public static dsqs[] values() {
        return (dsqs[]) h.clone();
    }
}
