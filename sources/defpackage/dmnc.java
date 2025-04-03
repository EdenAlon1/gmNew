package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnc implements dmne {
    public static final dmnc a;
    public static final dmnc b;
    public static final dmnc c;
    public static final dmnc d;
    public static final dmnc e;
    public static final dmnc f;
    private static final /* synthetic */ dmnc[] g;

    static {
        dmnc dmncVar = new dmnc("AI_REWRITE", 0);
        a = dmncVar;
        dmnc dmncVar2 = new dmnc("AI_SUGGEST", 1);
        b = dmncVar2;
        dmnc dmncVar3 = new dmnc("GALLERY", 2);
        c = dmncVar3;
        dmnc dmncVar4 = new dmnc("EMOTIVE", 3);
        d = dmncVar4;
        dmnc dmncVar5 = new dmnc("SHORTCUTS", 4);
        e = dmncVar5;
        dmnc dmncVar6 = new dmnc(VCardConstants.PARAM_TYPE_VOICE, 5);
        f = dmncVar6;
        dmnc[] dmncVarArr = {dmncVar, dmncVar2, dmncVar3, dmncVar4, dmncVar5, dmncVar6};
        g = dmncVarArr;
        ffhw.a(dmncVarArr);
    }

    private dmnc(String str, int i) {
    }

    public static dmnc[] values() {
        return (dmnc[]) g.clone();
    }
}
