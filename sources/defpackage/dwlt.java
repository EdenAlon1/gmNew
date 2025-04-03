package defpackage;

import android.content.Context;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlt {
    public static final FontFamily.Builder a(Context context, dwlg dwlgVar, dwlm dwlmVar, CancellationSignal cancellationSignal) {
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build;
        context.getClass();
        dwlgVar.getClass();
        dwlmVar.getClass();
        ParcelFileDescriptor parcelFileDescriptor = eepn.e(context, dwlgVar.a, cancellationSignal, ffkj.e(context.getPackageName(), "com.google.android.gms") ? eepm.c : eepm.a("com.google.android.gms")).getParcelFileDescriptor();
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            weight = new Font.Builder(parcelFileDescriptor).setWeight(dwlgVar.c);
            slant = weight.setSlant(dwlgVar.d ? 1 : 0);
            ttcIndex = slant.setTtcIndex(dwlgVar.b);
            fontVariationSettings = ttcIndex.setFontVariationSettings(dwll.a(dwlmVar.b, context));
            build = fontVariationSettings.build();
            build.getClass();
            FontFamily.Builder builder = new FontFamily.Builder(build);
            ffig.a(parcelFileDescriptor, null);
            return builder;
        } finally {
        }
    }
}
