package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efoz {
    public static final efoz a;
    public static final efoz b;
    public static final efoz c;
    public static final efoz d;
    private static final /* synthetic */ efoz[] e;

    static {
        efoz efozVar = new efoz(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT, 0);
        a = efozVar;
        efoz efozVar2 = new efoz(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT, 1);
        b = efozVar2;
        efoz efozVar3 = new efoz("TOP", 2);
        c = efozVar3;
        efoz efozVar4 = new efoz("BOTTOM", 3);
        d = efozVar4;
        efoz[] efozVarArr = {efozVar, efozVar2, efozVar3, efozVar4};
        e = efozVarArr;
        ffhw.a(efozVarArr);
    }

    private efoz(String str, int i) {
    }

    public static efoz[] values() {
        return (efoz[]) e.clone();
    }
}
