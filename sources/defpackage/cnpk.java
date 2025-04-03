package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpk {
    public static final cnpk a;
    public static final cnpk b;
    public static final cnpk c;
    public static final cnpk d;
    public static final cnpk e;
    private static final /* synthetic */ cnpk[] f;

    static {
        cnpk cnpkVar = new cnpk("UNKNOWN", 0);
        a = cnpkVar;
        cnpk cnpkVar2 = new cnpk("ON_SATELLITE_AUTO_CONNECT", 1);
        b = cnpkVar2;
        cnpk cnpkVar3 = new cnpk("ON_SATELLITE_MANUAL_CONNECT", 2);
        c = cnpkVar3;
        cnpk cnpkVar4 = new cnpk("SATELLITE_MANUAL_ELIGIBLE", 3);
        d = cnpkVar4;
        cnpk cnpkVar5 = new cnpk("OFF_SATELLITE", 4);
        e = cnpkVar5;
        cnpk[] cnpkVarArr = {cnpkVar, cnpkVar2, cnpkVar3, cnpkVar4, cnpkVar5};
        f = cnpkVarArr;
        ffhw.a(cnpkVarArr);
    }

    private cnpk(String str, int i) {
    }

    public static cnpk[] values() {
        return (cnpk[]) f.clone();
    }

    public final boolean a() {
        return ersy.a("bugle.enable_manual_satellite_connection_feature", "bugle") ? this == b || this == c : this == b;
    }

    public final boolean b() {
        return this == b;
    }

    public final boolean c() {
        return this == c;
    }
}
