package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbl {
    public static final dnbl a;
    public static final dnbl b;
    public static final dnbl c;
    public static final dnbl d;
    public static final dnbl e;
    private static final /* synthetic */ dnbl[] f;

    static {
        dnbl dnblVar = new dnbl("PROCESSING_NO_CONTENT", 0);
        a = dnblVar;
        dnbl dnblVar2 = new dnbl("DOWNLOADABLE_NO_CONTENT", 1);
        b = dnblVar2;
        dnbl dnblVar3 = new dnbl("NO_CONNECTION_NO_CONTENT", 2);
        c = dnblVar3;
        dnbl dnblVar4 = new dnbl("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = dnblVar4;
        dnbl dnblVar5 = new dnbl("NORMAL", 4);
        e = dnblVar5;
        dnbl[] dnblVarArr = {dnblVar, dnblVar2, dnblVar3, dnblVar4, dnblVar5};
        f = dnblVarArr;
        ffhw.a(dnblVarArr);
    }

    private dnbl(String str, int i) {
    }

    public static dnbl[] values() {
        return (dnbl[]) f.clone();
    }
}
