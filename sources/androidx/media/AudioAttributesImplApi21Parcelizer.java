package androidx.media;

import android.media.AudioAttributes;
import defpackage.pcl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(pcl pclVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) pclVar.d(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = pclVar.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, pcl pclVar) {
        pclVar.u(audioAttributesImplApi21.a, 1);
        pclVar.s(audioAttributesImplApi21.b, 2);
    }
}
