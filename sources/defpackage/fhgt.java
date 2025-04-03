package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgt {
    public static final fhgt a;
    public static final fhgt b;

    @ffbs
    public static final fhgt c;
    public static final fhgt d;
    public static final fhgt e;
    public static final fhgt f;
    private static final /* synthetic */ fhgt[] h;
    public final String g;

    static {
        fhgt fhgtVar = new fhgt("HTTP_1_0", 0, "http/1.0");
        a = fhgtVar;
        fhgt fhgtVar2 = new fhgt("HTTP_1_1", 1, "http/1.1");
        b = fhgtVar2;
        fhgt fhgtVar3 = new fhgt("SPDY_3", 2, "spdy/3.1");
        c = fhgtVar3;
        fhgt fhgtVar4 = new fhgt("HTTP_2", 3, "h2");
        d = fhgtVar4;
        fhgt fhgtVar5 = new fhgt("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = fhgtVar5;
        fhgt fhgtVar6 = new fhgt("QUIC", 5, "quic");
        f = fhgtVar6;
        fhgt[] fhgtVarArr = {fhgtVar, fhgtVar2, fhgtVar3, fhgtVar4, fhgtVar5, fhgtVar6};
        h = fhgtVarArr;
        ffhw.a(fhgtVarArr);
    }

    private fhgt(String str, int i, String str2) {
        this.g = str2;
    }

    public static fhgt[] values() {
        return (fhgt[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
