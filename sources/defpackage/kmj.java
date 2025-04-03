package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmj {
    static AudioAttributes.Builder a() {
        return new AudioAttributes.Builder();
    }

    static AudioAttributes.Builder b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(4);
    }

    static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(5);
    }

    static AudioAttributes e(AudioAttributes.Builder builder) {
        return builder.build();
    }
}
