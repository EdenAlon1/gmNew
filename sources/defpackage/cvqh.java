package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqh {
    public static final cvqh a;
    public static final cvqh b;
    public static final cvqh c;
    public static final cvqh d;
    public static final cvqh e;
    public static final cvqh f;
    public static final cvqh g;
    public static final cvqh h;
    public static final cvqh i;
    private static final /* synthetic */ cvqh[] k;
    public final int j;

    static {
        cvqh cvqhVar = new cvqh("DATETIME", 0, 1);
        a = cvqhVar;
        cvqh cvqhVar2 = new cvqh("LINK", 1, 2);
        b = cvqhVar2;
        cvqh cvqhVar3 = new cvqh("PHONE_NUMBER", 2, 3);
        c = cvqhVar3;
        cvqh cvqhVar4 = new cvqh(VCardConstants.PROPERTY_EMAIL, 3, 4);
        d = cvqhVar4;
        cvqh cvqhVar5 = new cvqh("ADDRESS", 4, 5);
        e = cvqhVar5;
        cvqh cvqhVar6 = new cvqh("MAP_LINK", 5, 6);
        f = cvqhVar6;
        cvqh cvqhVar7 = new cvqh("IMAGE", 6, 7);
        g = cvqhVar7;
        cvqh cvqhVar8 = new cvqh(VCardConstants.PARAM_TYPE_VIDEO, 7, 8);
        h = cvqhVar8;
        cvqh cvqhVar9 = new cvqh("OTHERS", 8, 9);
        i = cvqhVar9;
        cvqh[] cvqhVarArr = {cvqhVar, cvqhVar2, cvqhVar3, cvqhVar4, cvqhVar5, cvqhVar6, cvqhVar7, cvqhVar8, cvqhVar9};
        k = cvqhVarArr;
        ffhw.a(cvqhVarArr);
    }

    private cvqh(String str, int i2, int i3) {
        this.j = i3;
    }

    public static cvqh[] values() {
        return (cvqh[]) k.clone();
    }
}
