package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdc {
    public static final dsdc a;
    public static final dsdc b;
    public static final dsdc c;
    private static final /* synthetic */ dsdc[] d;

    static {
        dsdc dsdcVar = new dsdc("RECENTS", 0);
        a = dsdcVar;
        dsdc dsdcVar2 = new dsdc("FAVORITES", 1);
        b = dsdcVar2;
        dsdc dsdcVar3 = new dsdc("ALL_PACKS", 2);
        c = dsdcVar3;
        dsdc[] dsdcVarArr = {dsdcVar, dsdcVar2, dsdcVar3};
        d = dsdcVarArr;
        ffhw.a(dsdcVarArr);
    }

    private dsdc(String str, int i) {
    }

    public static dsdc[] values() {
        return (dsdc[]) d.clone();
    }
}
