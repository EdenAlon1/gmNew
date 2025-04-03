package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfi {
    private static final double n = TimeUnit.SECONDS.toMicros(1);
    public MediaExtractor a;
    public MediaExtractor b;
    public ctek c;
    public cteo d;
    public MediaCodec e;
    public MediaCodec f;
    public MediaCodec g;
    public MediaCodec h;
    public MediaMuxer i;
    public volatile boolean j;
    public long k;
    public final Context l;
    public final ctfl m;
    private MediaCodecInfo q;
    private MediaCodecInfo r;
    private MediaFormat s;
    private MediaFormat t;
    private ecri v;
    private final cqoh w;
    private final ffbr x;
    private double o = 0.03d;
    private double p = 0.9d;
    private int u = 0;

    public ctfi(Context context, ctfl ctflVar, cqoh cqohVar, ffbr ffbrVar) {
        this.l = context;
        this.m = ctflVar;
        this.w = cqohVar;
        this.x = ffbrVar;
    }

    static Optional a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (emuz.e(str2, str)) {
                        return Optional.of(codecInfoAt);
                    }
                }
            }
        }
        return Optional.empty();
    }

    public static void b(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (IllegalStateException e) {
                ((ensz) ((ensz) ((ensz) ctfm.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "release", (char) 896, "VideoTranscoder.java")).q("Error releasing codec");
            }
        }
    }

    public static void c(MediaExtractor mediaExtractor) {
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    private final int e(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        this.m.r(9);
        throw new ctfk("Required key " + str + " not found in " + String.valueOf(mediaFormat));
    }

    private final MediaExtractor f(Uri uri) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.l, uri, (Map<String, String>) null);
        return mediaExtractor;
    }

    private final MediaMuxer g(File file) {
        try {
            return new MediaMuxer(file.getAbsolutePath(), 0);
        } catch (IOException | NoClassDefFoundError e) {
            this.m.r(6);
            throw new ctfk("Failed to create muxer", e);
        }
    }

    private final void h(cten ctenVar) {
        int dequeueInputBuffer;
        if (!ctenVar.g && ((ctenVar.h == null || ctenVar.m) && (dequeueInputBuffer = ctenVar.e.a.dequeueInputBuffer(10000L)) != -1)) {
            int readSampleData = ctenVar.a.readSampleData(ctenVar.e.c[dequeueInputBuffer], 0);
            long sampleTime = ctenVar.a.getSampleTime();
            if (readSampleData >= 0) {
                ctenVar.e.a.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, ctenVar.a.getSampleFlags());
            }
            ctenVar.g = !ctenVar.a.advance();
            ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "extract", 111, "MediaTrackPipeline.java")).K("extract(track= %s, size= %s, presentationTime: %s (%s)", Integer.valueOf(ctenVar.f), Integer.valueOf(readSampleData), Long.valueOf(sampleTime), Long.valueOf(ctenVar.a.getSampleTime() - sampleTime));
            if (ctenVar.g) {
                ctenVar.e.a.queueInputBuffer(ctenVar.e.a.dequeueInputBuffer(10000L), 0, 0, 0L, 4);
            }
        }
        if (ctenVar.b == null || ctenVar.c == null) {
            ctem ctemVar = ctenVar.e;
            if (!ctemVar.e && ctenVar.i == -1 && (ctenVar.h == null || ctenVar.m)) {
                int dequeueOutputBuffer = ctemVar.a.dequeueOutputBuffer(ctemVar.b, 10000L);
                ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 141, "MediaTrackPipeline.java")).J("dequeOutputBuffer(track= %s, size=%s...):%s", Integer.valueOf(ctenVar.f), Integer.valueOf(ctenVar.e.b.size), Integer.valueOf(dequeueOutputBuffer));
                if (dequeueOutputBuffer == -1) {
                    ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 145, "MediaTrackPipeline.java")).q("MediaCodec.INFO_TRY_AGAIN_LATER");
                } else if (dequeueOutputBuffer == -3) {
                    ctem ctemVar2 = ctenVar.e;
                    ctemVar2.d = ctemVar2.a.getOutputBuffers();
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = ctenVar.e.a.getOutputFormat();
                    if (outputFormat.containsKey("sample-rate")) {
                        ctenVar.n = outputFormat.getInteger("sample-rate");
                    }
                    if (outputFormat.containsKey("channel-count")) {
                        ctenVar.o = outputFormat.getInteger("channel-count");
                    }
                    ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 158, "MediaTrackPipeline.java")).w("transcodeViaBuffers: track %s decoder output format changed to %s", ctenVar.f, outputFormat);
                } else if ((ctenVar.e.b.flags & 2) != 0) {
                    ctenVar.e.a.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    ctenVar.i = dequeueOutputBuffer;
                }
            }
            if (ctenVar.i != -1) {
                int dequeueInputBuffer2 = ctenVar.d.a.dequeueInputBuffer(10000L);
                ctenVar.j = dequeueInputBuffer2;
                if (dequeueInputBuffer2 != -1) {
                    MediaCodec.BufferInfo bufferInfo = ctenVar.e.b;
                    int i = bufferInfo.size - bufferInfo.offset;
                    ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 177, "MediaTrackPipeline.java")).J("bytesQueued=%s, size= %s, offset=%s", Integer.valueOf(i), Integer.valueOf(ctenVar.e.b.size), Integer.valueOf(ctenVar.e.b.offset));
                    emxf.b(ctenVar.o > 0, "audioChannelCount can't smaller than 1");
                    emxf.b(ctenVar.n > 0, "audioSampleRate can't be smaller than 1");
                    long j = ctenVar.e.b.presentationTimeUs;
                    if (ctenVar.n > 0 && ctenVar.o > 0) {
                        double d = ctenVar.n * ctenVar.o;
                        long micros = (long) (ctenVar.e.b.offset * (TimeUnit.SECONDS.toMicros(1L) / (d + d)));
                        ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 190, "MediaTrackPipeline.java")).z("presentationTime=%s, delta=%s", j, micros);
                        j += micros;
                    }
                    long j2 = j;
                    ByteBuffer byteBuffer = ctenVar.d.c[ctenVar.j];
                    ByteBuffer duplicate = ctenVar.e.d[ctenVar.i].duplicate();
                    duplicate.position(ctenVar.e.b.offset);
                    int min = Math.min(byteBuffer.capacity(), i);
                    duplicate.limit(ctenVar.e.b.offset + min);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "MediaTrackPipeline.java")).J("queueInputBuffer( %s): size=%s, presentationTime=%s", Integer.valueOf(ctenVar.f), Integer.valueOf(min), Long.valueOf(j2));
                    if (j2 > 0 && j2 < ctenVar.k) {
                        ((ensz) ctfm.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 207, "MediaTrackPipeline.java")).z("presentationTime out of sequence? %s < %s", j2, ctenVar.k);
                        j2 = ctenVar.k;
                    }
                    long j3 = j2;
                    ctenVar.k = Math.max(j3, ctenVar.k);
                    if (min > 0) {
                        ctenVar.d.a.queueInputBuffer(ctenVar.j, 0, min, j3, ctenVar.e.b.flags);
                        ctenVar.j = -1;
                        ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 225, "MediaTrackPipeline.java")).v("track %s queueinput %s s", ctenVar.f, TimeUnit.MICROSECONDS.toSeconds(j3));
                    } else {
                        ((ensz) ctfm.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 229, "MediaTrackPipeline.java")).r("track %s defer EOS", ctenVar.f);
                    }
                    if (ctenVar.e.b.offset + min < ctenVar.e.b.size) {
                        ctenVar.e.b.offset += min;
                    } else {
                        ctenVar.e.a.releaseOutputBuffer(ctenVar.i, false);
                        ctenVar.i = -1;
                        if ((ctenVar.e.b.flags & 4) != 0) {
                            ctenVar.e.e = true;
                        }
                    }
                }
            }
        } else {
            ctem ctemVar3 = ctenVar.e;
            if (!ctemVar3.e && (ctenVar.h == null || ctenVar.m)) {
                int dequeueOutputBuffer2 = ctemVar3.a.dequeueOutputBuffer(ctemVar3.b, 10000L);
                ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 268, "MediaTrackPipeline.java")).J("dequeOutputBuffer(track= %s, size=%s...): %s", Integer.valueOf(ctenVar.f), Integer.valueOf(ctenVar.e.b.size), Integer.valueOf(dequeueOutputBuffer2));
                if (dequeueOutputBuffer2 >= 0) {
                    if ((ctenVar.e.b.flags & 2) != 0) {
                        ctenVar.e.a.releaseOutputBuffer(dequeueOutputBuffer2, false);
                    } else {
                        boolean z = ctenVar.e.b.size != 0;
                        ctenVar.e.a.releaseOutputBuffer(dequeueOutputBuffer2, z);
                        if (z) {
                            cteo cteoVar = ctenVar.c;
                            synchronized (cteoVar.d) {
                                while (!cteoVar.f) {
                                    try {
                                        cteoVar.d.wait(cteo.a);
                                    } catch (InterruptedException e) {
                                        ((ensz) ((ensz) ((ensz) ctfm.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/OutputSurface", "awaitNewImage", 'N', "OutputSurface.java")).q("Unexpected exception");
                                    }
                                    if (!cteoVar.f) {
                                        throw new RuntimeException("Surface frame wait timed out");
                                    }
                                }
                                cteoVar.f = false;
                            }
                            cteoVar.b.updateTexImage();
                            cteo cteoVar2 = ctenVar.c;
                            ctep ctepVar = cteoVar2.e;
                            cteoVar2.b.getTransformMatrix(ctepVar.c);
                            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
                            GLES20.glClear(16640);
                            GLES20.glUseProgram(ctepVar.d);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, ctepVar.e);
                            ctepVar.a.position(0);
                            GLES20.glVertexAttribPointer(ctepVar.h, 3, 5126, false, 20, (Buffer) ctepVar.a);
                            GLES20.glEnableVertexAttribArray(ctepVar.h);
                            ctepVar.a.position(3);
                            GLES20.glVertexAttribPointer(ctepVar.i, 2, 5126, false, 20, (Buffer) ctepVar.a);
                            GLES20.glEnableVertexAttribArray(ctepVar.i);
                            Matrix.setIdentityM(ctepVar.b, 0);
                            GLES20.glUniformMatrix4fv(ctepVar.f, 1, false, ctepVar.b, 0);
                            GLES20.glUniformMatrix4fv(ctepVar.g, 1, false, ctepVar.c, 0);
                            if (!ctepVar.n) {
                                GLES20.glUniform1f(ctepVar.j, ctepVar.l);
                                GLES20.glUniform1f(ctepVar.k, ctepVar.m);
                            }
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glFinish();
                            ctek ctekVar = ctenVar.b;
                            EGLExt.eglPresentationTimeANDROID(ctekVar.a, ctekVar.c, ctenVar.e.b.presentationTimeUs * 1000);
                            ctek ctekVar2 = ctenVar.b;
                            EGL14.eglSwapBuffers(ctekVar2.a, ctekVar2.c);
                            ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 290, "MediaTrackPipeline.java")).v("track %s queueinput %s s", ctenVar.f, TimeUnit.MICROSECONDS.toSeconds(ctenVar.e.b.presentationTimeUs));
                        }
                        if ((ctenVar.e.b.flags & 4) != 0) {
                            ctenVar.e.e = true;
                            ((ensz) ctfm.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 297, "MediaTrackPipeline.java")).r("track %s signaling EOS", ctenVar.f);
                            ctenVar.d.a.signalEndOfInputStream();
                        }
                    }
                }
            }
        }
        if (ctenVar.c()) {
            return;
        }
        ctenVar.b(this.i);
    }

    private static int i(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("rotation-degrees")) {
            return mediaFormat.getInteger("rotation-degrees");
        }
        return 0;
    }

    private static int j(MediaExtractor mediaExtractor) {
        int i = 0;
        while (i < 5 && mediaExtractor.advance()) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x04ab, code lost:
    
        r2 = r14.getInteger("color-transfer", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05f7, code lost:
    
        r4.releaseOutputBuffer(r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0036, code lost:
    
        if (r50.r == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1 A[Catch: all -> 0x02e2, TRY_LEAVE, TryCatch #36 {all -> 0x02e2, blocks: (B:105:0x02cc, B:110:0x02f1, B:122:0x0382, B:134:0x0433, B:448:0x02db), top: B:102:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06d0 A[Catch: all -> 0x0925, IOException -> 0x092e, IllegalStateException -> 0x0930, TRY_LEAVE, TryCatch #62 {IOException -> 0x092e, IllegalStateException -> 0x0930, all -> 0x0925, blocks: (B:153:0x046a, B:181:0x0508, B:185:0x06b6, B:187:0x06d0, B:191:0x06ec, B:194:0x0719, B:195:0x0750, B:205:0x07f8, B:208:0x0806, B:210:0x0820, B:212:0x0828, B:215:0x0837, B:217:0x083b, B:218:0x084a, B:220:0x0882, B:222:0x0886, B:227:0x0844, B:288:0x0727, B:287:0x0724, B:298:0x0732, B:297:0x072f, B:299:0x0733), top: B:152:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x076b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0820 A[Catch: all -> 0x0925, IOException -> 0x092e, IllegalStateException -> 0x0930, TryCatch #62 {IOException -> 0x092e, IllegalStateException -> 0x0930, all -> 0x0925, blocks: (B:153:0x046a, B:181:0x0508, B:185:0x06b6, B:187:0x06d0, B:191:0x06ec, B:194:0x0719, B:195:0x0750, B:205:0x07f8, B:208:0x0806, B:210:0x0820, B:212:0x0828, B:215:0x0837, B:217:0x083b, B:218:0x084a, B:220:0x0882, B:222:0x0886, B:227:0x0844, B:288:0x0727, B:287:0x0724, B:298:0x0732, B:297:0x072f, B:299:0x0733), top: B:152:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x083b A[Catch: all -> 0x0925, IOException -> 0x092e, IllegalStateException -> 0x0930, TryCatch #62 {IOException -> 0x092e, IllegalStateException -> 0x0930, all -> 0x0925, blocks: (B:153:0x046a, B:181:0x0508, B:185:0x06b6, B:187:0x06d0, B:191:0x06ec, B:194:0x0719, B:195:0x0750, B:205:0x07f8, B:208:0x0806, B:210:0x0820, B:212:0x0828, B:215:0x0837, B:217:0x083b, B:218:0x084a, B:220:0x0882, B:222:0x0886, B:227:0x0844, B:288:0x0727, B:287:0x0724, B:298:0x0732, B:297:0x072f, B:299:0x0733), top: B:152:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0882 A[Catch: all -> 0x0925, IOException -> 0x092e, IllegalStateException -> 0x0930, TryCatch #62 {IOException -> 0x092e, IllegalStateException -> 0x0930, all -> 0x0925, blocks: (B:153:0x046a, B:181:0x0508, B:185:0x06b6, B:187:0x06d0, B:191:0x06ec, B:194:0x0719, B:195:0x0750, B:205:0x07f8, B:208:0x0806, B:210:0x0820, B:212:0x0828, B:215:0x0837, B:217:0x083b, B:218:0x084a, B:220:0x0882, B:222:0x0886, B:227:0x0844, B:288:0x0727, B:287:0x0724, B:298:0x0732, B:297:0x072f, B:299:0x0733), top: B:152:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0733 A[Catch: all -> 0x0925, IOException -> 0x092e, IllegalStateException -> 0x0930, TryCatch #62 {IOException -> 0x092e, IllegalStateException -> 0x0930, all -> 0x0925, blocks: (B:153:0x046a, B:181:0x0508, B:185:0x06b6, B:187:0x06d0, B:191:0x06ec, B:194:0x0719, B:195:0x0750, B:205:0x07f8, B:208:0x0806, B:210:0x0820, B:212:0x0828, B:215:0x0837, B:217:0x083b, B:218:0x084a, B:220:0x0882, B:222:0x0886, B:227:0x0844, B:288:0x0727, B:287:0x0724, B:298:0x0732, B:297:0x072f, B:299:0x0733), top: B:152:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x069e A[Catch: all -> 0x06a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x06a2, blocks: (B:337:0x05fd, B:338:0x0600, B:344:0x069e), top: B:300:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a6c A[Catch: all -> 0x0a90, TryCatch #62 {all -> 0x0a90, blocks: (B:238:0x08da, B:237:0x08d7, B:421:0x0a62, B:423:0x0a6c, B:424:0x0a71, B:426:0x0a75, B:427:0x0a88, B:428:0x0a8f, B:274:0x08eb, B:273:0x08e8, B:357:0x0913, B:356:0x0910, B:414:0x0924, B:413:0x0921, B:151:0x0963, B:150:0x0960, B:476:0x0974, B:477:0x09b0, B:66:0x09d0, B:65:0x09cd, B:502:0x0a1b, B:501:0x0a18, B:525:0x0a1c, B:526:0x0a32, B:536:0x0a41, B:535:0x0a3e, B:546:0x0a50, B:545:0x0a4d), top: B:10:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0a75 A[Catch: all -> 0x0a90, TryCatch #62 {all -> 0x0a90, blocks: (B:238:0x08da, B:237:0x08d7, B:421:0x0a62, B:423:0x0a6c, B:424:0x0a71, B:426:0x0a75, B:427:0x0a88, B:428:0x0a8f, B:274:0x08eb, B:273:0x08e8, B:357:0x0913, B:356:0x0910, B:414:0x0924, B:413:0x0921, B:151:0x0963, B:150:0x0960, B:476:0x0974, B:477:0x09b0, B:66:0x09d0, B:65:0x09cd, B:502:0x0a1b, B:501:0x0a18, B:525:0x0a1c, B:526:0x0a32, B:536:0x0a41, B:535:0x0a3e, B:546:0x0a50, B:545:0x0a4d), top: B:10:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x040a A[Catch: all -> 0x0949, TryCatch #21 {all -> 0x0949, blocks: (B:100:0x02bc, B:111:0x0306, B:124:0x039f, B:129:0x0412, B:136:0x0439, B:435:0x0400, B:436:0x0408, B:437:0x040a, B:440:0x0343, B:445:0x034a, B:446:0x02fc), top: B:99:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x034a A[Catch: all -> 0x0949, TRY_LEAVE, TryCatch #21 {all -> 0x0949, blocks: (B:100:0x02bc, B:111:0x0306, B:124:0x039f, B:129:0x0412, B:136:0x0439, B:435:0x0400, B:436:0x0408, B:437:0x040a, B:440:0x0343, B:445:0x034a, B:446:0x02fc), top: B:99:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x02fc A[Catch: all -> 0x0949, TRY_ENTER, TryCatch #21 {all -> 0x0949, blocks: (B:100:0x02bc, B:111:0x0306, B:124:0x039f, B:129:0x0412, B:136:0x0439, B:435:0x0400, B:436:0x0408, B:437:0x040a, B:440:0x0343, B:445:0x034a, B:446:0x02fc), top: B:99:0x02bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(final defpackage.cter r51) {
        /*
            Method dump skipped, instructions count: 2819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctfi.d(cter):boolean");
    }
}
