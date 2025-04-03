package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwv {
    private static final enhk a;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("audio/aac", eplo.AUDIO_AAC);
        enhdVar.k("audio/mp3", eplo.AUDIO_MP3);
        enhdVar.k("audio/mpeg", eplo.AUDIO_MPEG);
        enhdVar.k("audio/mpg", eplo.AUDIO_MPG);
        enhdVar.k("audio/mp4", eplo.AUDIO_MP4);
        enhdVar.k("audio/mp4-latm", eplo.AUDIO_MP4_LATM);
        enhdVar.k("application/ogg", eplo.AUDIO_OGG);
        enhdVar.k("video/3gp", eplo.VIDEO_3GP);
        enhdVar.k("video/3gpp", eplo.VIDEO_3GPP);
        enhdVar.k("video/3gpp2", eplo.VIDEO_3G2);
        enhdVar.k("video/m4v", eplo.VIDEO_M4V);
        enhdVar.k("video/mp4", eplo.VIDEO_MP4);
        enhdVar.k("video/mpeg", eplo.VIDEO_MPEG);
        enhdVar.k("video/mpeg4", eplo.VIDEO_MPEG4);
        enhdVar.k("video/avc", eplo.VIDEO_MPEG4);
        enhdVar.k("video/webm", eplo.VIDEO_WEBM);
        a = enhdVar.c();
    }

    public static eplo a(String str) {
        if (!TextUtils.isEmpty(str)) {
            enhk enhkVar = a;
            if (enhkVar.containsKey(str)) {
                return (eplo) enhkVar.get(str);
            }
            if (le.f(str) || le.A(str)) {
                return eplo.MIME_OTHER;
            }
        }
        return eplo.MIME_UNKNOWN;
    }
}
