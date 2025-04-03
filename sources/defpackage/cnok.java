package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnok {
    public static final cnok a;
    public static final cnok b;
    public static final cnok c;
    public static final cnok d;
    public static final cnok e;
    public static final cnok f;
    private static final /* synthetic */ cnok[] g;

    static {
        cnok cnokVar = new cnok("UNKNOWN", 0);
        a = cnokVar;
        cnok cnokVar2 = new cnok("SATELLITE", 1);
        b = cnokVar2;
        cnok cnokVar3 = new cnok("CELLULAR", 2);
        c = cnokVar3;
        cnok cnokVar4 = new cnok("WIFI", 3);
        d = cnokVar4;
        cnok cnokVar5 = new cnok("NO_CONNECTION", 4);
        e = cnokVar5;
        cnok cnokVar6 = new cnok(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 5);
        f = cnokVar6;
        cnok[] cnokVarArr = {cnokVar, cnokVar2, cnokVar3, cnokVar4, cnokVar5, cnokVar6};
        g = cnokVarArr;
        ffhw.a(cnokVarArr);
    }

    private cnok(String str, int i) {
    }

    public static cnok[] values() {
        return (cnok[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d;
    }
}
