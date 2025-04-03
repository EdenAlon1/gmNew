package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqd extends kqh {
    private static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.fonts.Font h(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r0 = r7 & 1
            android.graphics.fonts.FontStyle r1 = new android.graphics.fonts.FontStyle
            r2 = 1
            if (r2 == r0) goto La
            r0 = 400(0x190, float:5.6E-43)
            goto Lc
        La:
            r0 = 700(0x2bc, float:9.81E-43)
        Lc:
            r7 = r7 & 2
            r3 = 0
            if (r7 == 0) goto L13
            r7 = r2
            goto L14
        L13:
            r7 = r3
        L14:
            r1.<init>(r0, r7)
            android.graphics.fonts.Font r7 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r6, r3)
            android.graphics.fonts.FontStyle r0 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r7)
            int r0 = g(r1, r0)
        L23:
            int r3 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r2 >= r3) goto L41
            android.graphics.fonts.Font r3 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r6, r2)
            android.graphics.fonts.FontStyle r4 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r3)
            int r4 = g(r1, r4)
            if (r4 >= r0) goto L39
            r5 = r4
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r4 >= r0) goto L3d
            r7 = r3
        L3d:
            int r2 = r2 + 1
            r0 = r5
            goto L23
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqd.h(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    private static FontFamily i(krt[] krtVarArr, ContentResolver contentResolver) {
        FontFamily build;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build2;
        FontFamily.Builder builder = null;
        for (krt krtVar : krtVarArr) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(krtVar.a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(krtVar.c);
                        slant = weight.setSlant(krtVar.d ? 1 : 0);
                        ttcIndex = slant.setTtcIndex(krtVar.b);
                        build2 = ttcIndex.build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build2);
                        } else {
                            builder.addFont(build2);
                        }
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        build = builder.build();
        return build;
    }

    @Override // defpackage.kqh
    public final Typeface a(Context context, kpc kpcVar, Resources resources, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (kpd kpdVar : kpcVar.a) {
                try {
                    weight = new Font.Builder(resources, kpdVar.f).setWeight(kpdVar.b);
                    slant = weight.setSlant(kpdVar.c ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(kpdVar.e);
                    fontVariationSettings = ttcIndex.setFontVariationSettings(kpdVar.d);
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = h(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.kqh
    public final Typeface b(Context context, krt[] krtVarArr, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        try {
            FontFamily i2 = i(krtVarArr, context.getContentResolver());
            if (i2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i2);
            style = h(i2, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.kqh
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.kqh
    public final Typeface f(Context context, List list, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i2 = i((krt[]) list.get(0), contentResolver);
            if (i2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i2);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily i4 = i((krt[]) list.get(i3), contentResolver);
                if (i4 != null) {
                    customFallbackBuilder.addCustomFallback(i4);
                }
            }
            style = h(i2, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.kqh
    protected final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.kqh
    protected final krt m(krt[] krtVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
