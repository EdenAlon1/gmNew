package defpackage;

import android.media.AudioFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdt {
    public final fgcq b;
    public final AudioFormat c;
    public final String a = "denoise_seanet_16khz_android_messages";
    private final int d = 100;

    public dpdt(fgcq fgcqVar, AudioFormat audioFormat) {
        this.b = fgcqVar;
        this.c = audioFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpdt)) {
            return false;
        }
        dpdt dpdtVar = (dpdt) obj;
        if (!ffkj.e(this.a, dpdtVar.a) || !ffkj.e(this.b, dpdtVar.b) || !ffkj.e(this.c, dpdtVar.c)) {
            return false;
        }
        int i = dpdtVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 100;
    }

    public final String toString() {
        return "XenoAudioProcessorConfiguration(effectId=" + this.a + ", inputFlow=" + this.b + ", audioFormat=" + this.c + ", extraBufferCapacity=100)";
    }
}
