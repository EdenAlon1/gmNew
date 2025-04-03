package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siv extends adu {
    final /* synthetic */ siz a;

    public siv(siz sizVar) {
        this.a = sizVar;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Locale locale = (Locale) obj;
        locale.getClass();
        Intent intent = new Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE");
        enru enruVar = eerd.a;
        Iterator<ResolveInfo> it = this.a.d.getPackageManager().queryIntentActivities(new Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE"), 0).iterator();
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                    componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    break;
                }
                if (next.activityInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                    componentName2 = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                }
            } else if (componentName2 == null) {
                ((enrr) ((enrr) eerd.a.j()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerDownloadComponent", 241, "TranscriptionUtils.java")).q("No Model Manager Download Language Pack API provided by Google.");
            } else {
                componentName = componentName2;
            }
        }
        Intent putExtra = intent.setComponent(componentName).putExtra("android.speech.extra.LANGUAGE", locale.toLanguageTag());
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        byte[] byteArray;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (byteArray = extras.getByteArray("com.google.recognition.extra.ENQUEUE_STATUS")) != null) {
                    return (sdv) eyfy.parseFrom(sdv.a, byteArray, eyfc.a());
                }
            } catch (eygu unused) {
            }
        }
        return null;
    }
}
