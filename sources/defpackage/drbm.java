package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drbm {
    public static final drbm a;
    public static final drbm b;
    public static final drbm c;
    private static final /* synthetic */ drbm[] d;

    static {
        drbm drbmVar = new drbm("ALL", 0);
        a = drbmVar;
        drbm drbmVar2 = new drbm("YOURS", 1);
        b = drbmVar2;
        drbm drbmVar3 = new drbm(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 2);
        c = drbmVar3;
        drbm[] drbmVarArr = {drbmVar, drbmVar2, drbmVar3};
        d = drbmVarArr;
        ffhw.a(drbmVarArr);
    }

    private drbm(String str, int i) {
    }

    public static drbm[] values() {
        return (drbm[]) d.clone();
    }
}
