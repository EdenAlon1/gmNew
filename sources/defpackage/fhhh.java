package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhh {
    public static final fhhh a;
    public static final fhhh b;
    public static final fhhh c;
    public static final fhhh d;
    public static final fhhh e;
    private static final /* synthetic */ fhhh[] g;
    public final String f;

    static {
        fhhh fhhhVar = new fhhh("TLS_1_3", 0, "TLSv1.3");
        a = fhhhVar;
        fhhh fhhhVar2 = new fhhh("TLS_1_2", 1, "TLSv1.2");
        b = fhhhVar2;
        fhhh fhhhVar3 = new fhhh("TLS_1_1", 2, "TLSv1.1");
        c = fhhhVar3;
        fhhh fhhhVar4 = new fhhh("TLS_1_0", 3, "TLSv1");
        d = fhhhVar4;
        fhhh fhhhVar5 = new fhhh("SSL_3_0", 4, "SSLv3");
        e = fhhhVar5;
        fhhh[] fhhhVarArr = {fhhhVar, fhhhVar2, fhhhVar3, fhhhVar4, fhhhVar5};
        g = fhhhVarArr;
        ffhw.a(fhhhVarArr);
    }

    private fhhh(String str, int i, String str2) {
        this.f = str2;
    }

    public static fhhh[] values() {
        return (fhhh[]) g.clone();
    }
}
