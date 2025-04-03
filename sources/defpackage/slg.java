package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slg {
    public static final Intent a(Context context) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("calling_package", context.getPackageName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intent.putExtra("com.google.recognition.extra.REQUEST_SODA_EVENTS", true);
        intent.putExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", true);
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", true);
        if (!kqq.b()) {
            intent.putExtra("com.google.recognition.extra.ENABLE_TEXT_FORMATTING", true);
            intent.putExtra("com.google.recognition.extra.MASK_OFFENSIVE_WORDS", false);
            return intent;
        }
        intent.putExtra("android.speech.extra.SEGMENTED_SESSION", "android.speech.extra.AUDIO_SOURCE");
        intent.putExtra("android.speech.extra.ENABLE_FORMATTING", "latency");
        intent.putExtra("android.speech.extra.MASK_OFFENSIVE_WORDS", false);
        return intent;
    }
}
