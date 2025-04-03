package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszr {
    public static final dszr a;
    public static final dszr b;
    public static final dszr c;
    public static final dszr d;
    public static final dszr e;
    public static final dszr f;
    public static final dszr g;
    public static final dszr h;
    public static final dszr i;
    public static final /* synthetic */ ffhx k;
    private static final /* synthetic */ dszr[] l;
    public final int j;

    static {
        dszr dszrVar = new dszr("CAMERA_GALLERY", 0, R.string.camera_gallery_screen_title);
        a = dszrVar;
        dszr dszrVar2 = new dszr("EMOJI", 1, R.string.emoji_screen_title);
        b = dszrVar2;
        dszr dszrVar3 = new dszr("GIFS", 2, R.string.gif_screen_title);
        c = dszrVar3;
        dszr dszrVar4 = new dszr("PROXY", 3, R.string.proxy_screen_title);
        d = dszrVar4;
        dszr dszrVar5 = new dszr("SHORTCUTS", 4, R.string.shortcuts_screen_title);
        e = dszrVar5;
        dszr dszrVar6 = new dszr("STICKERS", 5, R.string.sticker_screen_title);
        f = dszrVar6;
        dszr dszrVar7 = new dszr(VCardConstants.PARAM_TYPE_VOICE, 6, R.string.voice_screen_title);
        g = dszrVar7;
        dszr dszrVar8 = new dszr("MAGIC_COMPOSE", 7, R.string.placeholder);
        h = dszrVar8;
        dszr dszrVar9 = new dszr("EMOTIFY", 8, R.string.penpal_screen_title);
        i = dszrVar9;
        dszr[] dszrVarArr = {dszrVar, dszrVar2, dszrVar3, dszrVar4, dszrVar5, dszrVar6, dszrVar7, dszrVar8, dszrVar9};
        l = dszrVarArr;
        k = ffhw.a(dszrVarArr);
    }

    private dszr(String str, int i2, int i3) {
        this.j = i3;
    }

    public static dszr a(String str) {
        return (dszr) Enum.valueOf(dszr.class, str);
    }

    public static dszr[] values() {
        return (dszr[]) l.clone();
    }
}
