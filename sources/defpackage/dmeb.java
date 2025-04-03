package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmeb {
    public static final dmeb a;
    public static final dmeb b;
    public static final dmeb c;
    private static final /* synthetic */ dmeb[] d;

    static {
        dmeb dmebVar = new dmeb("HORIZONTAL_EDGES", 0);
        a = dmebVar;
        dmeb dmebVar2 = new dmeb("HORIZONTAL_END", 1);
        b = dmebVar2;
        dmeb dmebVar3 = new dmeb(GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL, 2);
        c = dmebVar3;
        dmeb[] dmebVarArr = {dmebVar, dmebVar2, dmebVar3};
        d = dmebVarArr;
        ffhw.a(dmebVarArr);
    }

    private dmeb(String str, int i) {
    }

    public static dmeb[] values() {
        return (dmeb[]) d.clone();
    }
}
