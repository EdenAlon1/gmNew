package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfm {
    public static final azfm a;
    public static final azfm b;
    public static final azfm c;
    public static final azfm d;
    private static final /* synthetic */ azfm[] e;

    static {
        azfm azfmVar = new azfm("NOT_SYNCED", 0);
        a = azfmVar;
        azfm azfmVar2 = new azfm("CREATING", 1);
        b = azfmVar2;
        azfm azfmVar3 = new azfm(VCardConstants.PROPERTY_MEMBER, 2);
        c = azfmVar3;
        azfm azfmVar4 = new azfm("NOT_MEMBER", 3);
        d = azfmVar4;
        azfm[] azfmVarArr = {azfmVar, azfmVar2, azfmVar3, azfmVar4};
        e = azfmVarArr;
        ffhw.a(azfmVarArr);
    }

    private azfm(String str, int i) {
    }

    public static azfm[] values() {
        return (azfm[]) e.clone();
    }
}
