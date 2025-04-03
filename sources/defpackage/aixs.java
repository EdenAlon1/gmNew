package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixs {
    public static final aixs a;
    public static final aixs b;
    public static final aixs c;
    public static final aixs d;
    public static final aixs e;
    public static final aixs f;
    public static final aixs g;
    public static final aixs h;
    public static final aixs i;
    private static final /* synthetic */ aixs[] j;

    static {
        aixs aixsVar = new aixs("NOT_GAIA_SIGNED_IN", 0);
        a = aixsVar;
        aixs aixsVar2 = new aixs("NON_G1_MEMBER", 1);
        b = aixsVar2;
        aixs aixsVar3 = new aixs("UNDER_AGE", 2);
        c = aixsVar3;
        aixs aixsVar4 = new aixs("AGE_CHECK_FAILED", 3);
        d = aixsVar4;
        aixs aixsVar5 = new aixs("IS_DASHER", 4);
        e = aixsVar5;
        aixs aixsVar6 = new aixs("DASHER_CHECK_FAILED", 5);
        f = aixsVar6;
        aixs aixsVar7 = new aixs("FEATURES_UNAVAILABLE", 6);
        g = aixsVar7;
        aixs aixsVar8 = new aixs("SENSITIVE_CLASSIFIER_UNAVAILABLE", 7);
        h = aixsVar8;
        aixs aixsVar9 = new aixs("IS_ON_SATELLITE", 8);
        i = aixsVar9;
        aixs[] aixsVarArr = {aixsVar, aixsVar2, aixsVar3, aixsVar4, aixsVar5, aixsVar6, aixsVar7, aixsVar8, aixsVar9};
        j = aixsVarArr;
        ffhw.a(aixsVarArr);
    }

    private aixs(String str, int i2) {
    }

    public static aixs[] values() {
        return (aixs[]) j.clone();
    }
}
