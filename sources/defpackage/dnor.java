package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnor {
    public static final dnor a;
    public static final dnor b;
    public static final dnor c;
    private static final /* synthetic */ dnor[] d;

    static {
        dnor dnorVar = new dnor("START", 0);
        a = dnorVar;
        dnor dnorVar2 = new dnor("CENTER", 1);
        b = dnorVar2;
        dnor dnorVar3 = new dnor(VCardConstants.PROPERTY_END, 2);
        c = dnorVar3;
        dnor[] dnorVarArr = {dnorVar, dnorVar2, dnorVar3};
        d = dnorVarArr;
        ffhw.a(dnorVarArr);
    }

    private dnor(String str, int i) {
    }

    public static dnor[] values() {
        return (dnor[]) d.clone();
    }
}
