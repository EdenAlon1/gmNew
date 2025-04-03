package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cttz {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/palette/PaletteUtil");
    public final Context b;
    public final crjx c;
    public final TypedArray[] d;
    public final TypedArray[] e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public cttz(Context context, crjx crjxVar, aurp aurpVar, akmj akmjVar) {
        TypedArray[] typedArrayArr = new TypedArray[3];
        this.d = typedArrayArr;
        TypedArray[] typedArrayArr2 = new TypedArray[3];
        this.e = typedArrayArr2;
        this.b = context;
        this.c = crjxVar;
        Resources resources = context.getResources();
        if (((Boolean) ctty.a.e()).booleanValue()) {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.oneplus_tile_colors);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.oneplus_dark_tile_colors);
            this.k = context.getColor(R.color.oneplus_dark_avatar_letter_color);
        } else {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.tile_colors_m2);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.dark_tile_colors_m2);
            if (((ersq) ((aurg) aurpVar).a.b()).a("bugle.read_samsung_bit_in_palette_util") && akmjVar.a()) {
                this.k = context.getColor(R.color.samsung_dark_avatar_letter_color);
            } else {
                this.k = context.getColor(R.color.dark_avatar_letter_color);
            }
        }
        typedArrayArr[2] = resources.obtainTypedArray(R.array.sender_text_colors_m2);
        typedArrayArr2[2] = resources.obtainTypedArray(R.array.dark_sender_text_colors_m2);
        typedArrayArr[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors);
        typedArrayArr2[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors_dark);
        this.h = context.getColor(R.color.google_blue600);
        this.i = context.getColor(R.color.google_blue500);
        this.j = context.getColor(R.color.google_white);
        for (int i = 0; i < 3; i++) {
            csix.a(this.d[i].length(), this.e[i].length());
        }
        this.f = this.d[0].getColor(0, 0);
        this.g = this.e[0].getColor(0, 0);
    }

    public static float a(int i) {
        float f;
        int i2 = (i >> 16) & PrivateKeyType.INVALID;
        int i3 = (i >> 8) & PrivateKeyType.INVALID;
        int i4 = i & PrivateKeyType.INVALID;
        int max = Math.max(i4, Math.max(i2, i3));
        int min = Math.min(i4, Math.min(i2, i3));
        if (max == min) {
            return 0.0f;
        }
        int i5 = max - i2;
        float f2 = max - min;
        float f3 = (max - i4) / f2;
        float f4 = (max - i3) / f2;
        if (i2 == max) {
            f = f3 - f4;
        } else {
            float f5 = i5 / f2;
            f = i3 == max ? (f5 + 2.0f) - f3 : (f4 + 4.0f) - f5;
        }
        float f6 = f / 6.0f;
        return f6 < 0.0f ? f6 + 1.0f : f6;
    }

    public static String i(int i) {
        return Integer.toHexString(i & 16777215);
    }

    public final int b() {
        return this.c.g() ? this.i : this.h;
    }

    public final int c() {
        return this.c.g() ? this.k : this.j;
    }

    public final int d(String str) {
        return e(str, this.c.g());
    }

    public final int e(String str, boolean z) {
        return (z ? this.e : this.d)[0].getColor(f(str), 0);
    }

    public final int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Math.abs(str.hashCode() % this.d[0].length());
    }

    public final cske g() {
        return new cske(this.f, this.g);
    }

    public final cske h(String str) {
        TypedArray[] typedArrayArr = this.d;
        int f = f(str);
        return new cske(typedArrayArr[0].getColor(f, 0), this.e[0].getColor(f, 0));
    }
}
