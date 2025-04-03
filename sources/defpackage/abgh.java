package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgh {
    public static final abgh a;
    public static final abgh b;
    public static final abgh c;
    private static final /* synthetic */ abgh[] d;

    static {
        abgh abghVar = new abgh("TEXT", 0);
        a = abghVar;
        abgh abghVar2 = new abgh("AUDIO", 1);
        b = abghVar2;
        abgh abghVar3 = new abgh(VCardConstants.PARAM_TYPE_VIDEO, 2);
        c = abghVar3;
        abgh[] abghVarArr = {abghVar, abghVar2, abghVar3};
        d = abghVarArr;
        ffhw.a(abghVarArr);
    }

    private abgh(String str, int i) {
    }

    public static abgh[] values() {
        return (abgh[]) d.clone();
    }
}
