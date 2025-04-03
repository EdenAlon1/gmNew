package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtm {
    public static final ajtm a;
    public static final ajtm b;
    public static final ajtm c;
    public static final ajtm d;
    public static final ajtm e;
    public static final ajtm f;
    public static final ajtm g;
    public static final ajtm h;
    private static final /* synthetic */ ajtm[] i;

    static {
        ajtm ajtmVar = new ajtm("UNKNOWN", 0);
        a = ajtmVar;
        ajtm ajtmVar2 = new ajtm("PLAIN_TEXT", 1);
        b = ajtmVar2;
        ajtm ajtmVar3 = new ajtm("LINK_PREVIEW", 2);
        c = ajtmVar3;
        ajtm ajtmVar4 = new ajtm("IMAGE", 3);
        d = ajtmVar4;
        ajtm ajtmVar5 = new ajtm("AUDIO", 4);
        e = ajtmVar5;
        ajtm ajtmVar6 = new ajtm(VCardConstants.PARAM_TYPE_VIDEO, 5);
        f = ajtmVar6;
        ajtm ajtmVar7 = new ajtm("FILE", 6);
        g = ajtmVar7;
        ajtm ajtmVar8 = new ajtm("VCARD", 7);
        h = ajtmVar8;
        ajtm[] ajtmVarArr = {ajtmVar, ajtmVar2, ajtmVar3, ajtmVar4, ajtmVar5, ajtmVar6, ajtmVar7, ajtmVar8};
        i = ajtmVarArr;
        ffhw.a(ajtmVarArr);
    }

    private ajtm(String str, int i2) {
    }

    public static ajtm[] values() {
        return (ajtm[]) i.clone();
    }
}
