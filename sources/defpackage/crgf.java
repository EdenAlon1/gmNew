package defpackage;

import androidx.car.app.model.Alert;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgf {
    public static final crgf a;
    public static final crgf b;
    public static final crgf c;
    public static final crgf d;
    private static final /* synthetic */ crgf[] h;
    public final int e;
    public final eqna f;
    public final String g;

    static {
        crgf crgfVar = new crgf("UNKNOWN", 0, Alert.DURATION_SHOW_INDEFINITELY, eqna.TRANSPORT_UNKNOWN, "UNKNOWN");
        a = crgfVar;
        crgf crgfVar2 = new crgf("SINGLE_REGISTRATION", 1, 0, eqna.TRANSPORT_SINGLE_REGISTRATION, "Chat API w/ RCS-SG");
        b = crgfVar2;
        crgf crgfVar3 = new crgf("TACHYGRAM", 2, 1, eqna.TRANSPORT_TACHYGRAM, "Chat API w/ Tachygram");
        c = crgfVar3;
        crgf crgfVar4 = new crgf("DUAL_REGISTRATION", 3, 2, eqna.TRANSPORT_RCS, "Chat API w/ RCS");
        d = crgfVar4;
        crgf[] crgfVarArr = {crgfVar, crgfVar2, crgfVar3, crgfVar4};
        h = crgfVarArr;
        ffhw.a(crgfVarArr);
    }

    private crgf(String str, int i, int i2, eqna eqnaVar, String str2) {
        this.e = i2;
        this.f = eqnaVar;
        this.g = str2;
    }

    public static crgf[] values() {
        return (crgf[]) h.clone();
    }
}
