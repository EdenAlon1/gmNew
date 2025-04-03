package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dscr extends ffju implements ffjm {
    public dscr(Object obj) {
        super(2, obj, drex.class, "fromString", "fromString(Ljava/lang/String;)Lcom/google/android/libraries/compose/gifsticker/data/usage/GifStickerRecord$StickerRecord;", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        drek drekVar;
        String str = (String) obj;
        str.getClass();
        List V = ffpc.V(str, new String[]{"|"}, 0, 6);
        if (V.size() != 2) {
            V = null;
        }
        if (V == null) {
            throw new IllegalStateException("Unable to parse sticker record ".concat(str));
        }
        String str2 = (String) V.get(0);
        String str3 = (String) V.get(1);
        str2.getClass();
        if (ffkj.e(str2, "STICKER_API")) {
            drekVar = dsch.a;
        } else {
            if (!ffkj.e(str2, "TENOR")) {
                throw new IllegalArgumentException("Invalid GIF/Sticker media source ".concat(str2));
            }
            drekVar = drej.a;
        }
        return new drey(str3, drekVar);
    }
}
