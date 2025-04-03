package androidx.media;

import defpackage.pcl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(pcl pclVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = pclVar.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = pclVar.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = pclVar.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = pclVar.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, pcl pclVar) {
        pclVar.s(audioAttributesImplBase.a, 1);
        pclVar.s(audioAttributesImplBase.b, 2);
        pclVar.s(audioAttributesImplBase.c, 3);
        pclVar.s(audioAttributesImplBase.d, 4);
    }
}
