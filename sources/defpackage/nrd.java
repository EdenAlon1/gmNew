package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrd extends Exception {
    static final engf a;
    public final int b;

    static {
        engd engdVar = new engd();
        engdVar.d("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        engdVar.d("ERROR_CODE_IO_UNSPECIFIED", 2000);
        engdVar.d("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        engdVar.d("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        engdVar.d("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        engdVar.d("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        engdVar.d("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        engdVar.d("ERROR_CODE_IO_NO_PERMISSION", 2006);
        engdVar.d("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        engdVar.d("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        engdVar.d("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        engdVar.d("ERROR_CODE_DECODING_FAILED", 3002);
        engdVar.d("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        engdVar.d("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        engdVar.d("ERROR_CODE_ENCODING_FAILED", 4002);
        engdVar.d("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        engdVar.d("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        engdVar.d("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        engdVar.d("ERROR_CODE_MUXING_FAILED", 7001);
        engdVar.d("ERROR_CODE_MUXING_TIMEOUT", 7002);
        engdVar.d("ERROR_CODE_MUXING_APPEND", 7003);
        a = engdVar.c();
    }

    public nrd(String str, Throwable th, int i) {
        this(str, th, i, null);
    }

    public static nrd a(lsq lsqVar, String str) {
        return new nrd("Audio error: " + str + ", audioFormat=" + String.valueOf(lsqVar.a), lsqVar, 6001);
    }

    public static nrd b(Throwable th, int i, nrc nrcVar) {
        return new nrd("Codec exception: ".concat(nrcVar.toString()), th, i, null);
    }

    private nrd(String str, Throwable th, int i, byte[] bArr) {
        super(str, th);
        this.b = i;
        SystemClock.elapsedRealtime();
    }
}
