package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.speech.SpeechRecognizer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shv {
    public static final cfup a = cfvl.k(cfvl.b, "vmt_throughput_limit", 128000);
    public static final cfup b = cfvl.k(cfvl.b, "vmt_warmup_period", 2);
    public static final cfva c = cfvl.u(cfvl.b, "vmt_locale_config", shs.a, new ecwg() { // from class: sht
        @Override // defpackage.ecwg
        public final Object a(byte[] bArr) {
            return (shs) eyfy.parseFrom(shs.a, bArr);
        }
    });
    public static final cfup d = cfvl.k(cfvl.b, "vmt_language_detector_look_back_window", 5);
    public static final emyl e = cfvl.y("enable_vmt_client_side_language_gating");
    public static final cfva f = cfvl.u(cfvl.b, "vmt_supported_languages", ezgw.a, new ecwg() { // from class: shu
        @Override // defpackage.ecwg
        public final Object a(byte[] bArr) {
            return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
        }
    });
    public static final emyl g = cfvl.y("enable_vmt_aiai");
    private static final cfup k = cfvl.n(cfvl.b, "force_vmt_aiai", false);
    public static final cfup h = cfvl.k(cfvl.b, "vmt_agsa_minimum_version_code", 301195513);
    public static final cfup i = cfvl.k(cfvl.b, "vmt_ssbg_minimum_version_code", 210375916);
    public static final emyl j = cfvl.y("enable_vmt_for_old_messages");

    public static final boolean a(Context context) {
        boolean isOnDeviceRecognitionAvailable;
        long longVersionCode;
        if (kqq.b()) {
            enru enruVar = eerd.a;
            isOnDeviceRecognitionAvailable = SpeechRecognizer.isOnDeviceRecognitionAvailable(context);
            if (isOnDeviceRecognitionAvailable) {
                try {
                    longVersionCode = context.getPackageManager().getPackageInfo("com.google.android.as", 0).getLongVersionCode();
                    ((enrr) ((enrr) eerd.a.e()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "isOnDeviceModelManagerAvailable", PrivateKeyType.INVALID, "TranscriptionUtils.java")).s("AiAi version: %d", longVersionCode);
                    if (longVersionCode >= 8579823 && ((Boolean) ((cfup) g.get()).e()).booleanValue()) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    ((enrr) ((enrr) ((enrr) eerd.a.i()).g(e2)).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "isOnDeviceModelManagerAvailable", (char) 258, "TranscriptionUtils.java")).q("Error fetching AiAi version code");
                }
            }
        }
        return ((Boolean) k.e()).booleanValue();
    }
}
