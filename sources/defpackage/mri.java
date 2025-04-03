package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mri extends Exception {
    public final String a;
    public final boolean b;
    public final mrf c;
    public final String d;

    public mri(lqc lqcVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + lqcVar.toString(), th, lqcVar.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public mri(String str, Throwable th, String str2, boolean z, mrf mrfVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = mrfVar;
        this.d = str3;
    }
}
