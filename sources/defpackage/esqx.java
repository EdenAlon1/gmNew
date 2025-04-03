package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqx {
    public static final esqx a;
    public static final esqx b;
    public static final esqx c;
    private static final /* synthetic */ esqx[] d;

    static {
        esqx esqxVar = new esqx("UNKNOWN", 0);
        a = esqxVar;
        esqx esqxVar2 = new esqx("DEFAULT", 1);
        b = esqxVar2;
        esqx esqxVar3 = new esqx("ADMINISTRATOR", 2);
        c = esqxVar3;
        esqx[] esqxVarArr = {esqxVar, esqxVar2, esqxVar3};
        d = esqxVarArr;
        ffhw.a(esqxVarArr);
    }

    private esqx(String str, int i) {
    }

    public static esqx[] values() {
        return (esqx[]) d.clone();
    }
}
