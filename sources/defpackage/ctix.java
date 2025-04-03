package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctix {
    public static final ctix a;
    public static final ctix b;
    public static final ctix c;
    public static final ctix d;
    public static final ctix e;
    public static final ctix f;
    private static final /* synthetic */ ctix[] g;

    static {
        ctix ctixVar = new ctix("NONE", 0);
        a = ctixVar;
        ctix ctixVar2 = new ctix("TEXT", 1);
        b = ctixVar2;
        ctix ctixVar3 = new ctix(VCardConstants.PARAM_PHONE_EXTRA_TYPE_ASSISTANT, 2);
        c = ctixVar3;
        ctix ctixVar4 = new ctix("REMINDER", 3);
        d = ctixVar4;
        ctix ctixVar5 = new ctix("STICKER", 4);
        e = ctixVar5;
        ctix ctixVar6 = new ctix("CALENDAR", 5);
        f = ctixVar6;
        ctix[] ctixVarArr = {ctixVar, ctixVar2, ctixVar3, ctixVar4, ctixVar5, ctixVar6};
        g = ctixVarArr;
        ffhw.a(ctixVarArr);
    }

    private ctix(String str, int i) {
    }

    public static ctix[] values() {
        return (ctix[]) g.clone();
    }
}
