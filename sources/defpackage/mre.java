package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mre extends lxx {
    public final int a;

    public mre(Throwable th, mrf mrfVar) {
        super("Decoder failed: ".concat(String.valueOf(mrfVar == null ? null : mrfVar.a)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        int i = lvf.a;
        this.a = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
