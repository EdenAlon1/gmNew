package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class appn {
    public static final appn a;
    public static final appn b;
    public static final appn c;
    public static final appn d;
    private static final /* synthetic */ appn[] e;

    static {
        appn appnVar = new appn("IMAGE", 0);
        a = appnVar;
        appn appnVar2 = new appn("LINK", 1);
        b = appnVar2;
        appn appnVar3 = new appn("LOCATION", 2);
        c = appnVar3;
        appn appnVar4 = new appn(VCardConstants.PARAM_TYPE_VIDEO, 3);
        d = appnVar4;
        appn[] appnVarArr = {appnVar, appnVar2, appnVar3, appnVar4};
        e = appnVarArr;
        ffhw.a(appnVarArr);
    }

    private appn(String str, int i) {
    }

    public static appn[] values() {
        return (appn[]) e.clone();
    }
}
