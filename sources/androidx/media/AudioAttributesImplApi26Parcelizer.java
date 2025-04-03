package androidx.media;

import android.media.AudioAttributes;
import defpackage.pcl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(pcl pclVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) pclVar.d(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = pclVar.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, pcl pclVar) {
        pclVar.u(audioAttributesImplApi26.a, 1);
        pclVar.s(audioAttributesImplApi26.b, 2);
    }
}
