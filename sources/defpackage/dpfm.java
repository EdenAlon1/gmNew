package defpackage;

import android.media.AudioFormat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfm implements dpey {
    public static final enru a = enru.c("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource");
    public final ffhd b;
    public final dpfo c;
    public final fgcl d;
    public final fgcq e;
    public final Long f;
    public long g;
    public int h;
    private final ffsk i;
    private exkx j;
    private ffud k;
    private boolean l;

    public dpfm(ffsk ffskVar, ffhd ffhdVar, dpfo dpfoVar) {
        Long l;
        this.i = ffskVar;
        this.b = ffhdVar;
        this.c = dpfoVar;
        fgcl e = fgcu.e(0, 0, 0, 5);
        this.d = e;
        this.e = new fgcn(e);
        Duration duration = dpfoVar.d;
        if (duration != null) {
            int i = dpfoVar.a;
            long a2 = ernc.a(duration) * i * dpfoVar.b;
            l = Long.valueOf((a2 + a2) / 1000000);
        } else {
            l = null;
        }
        this.f = l;
    }

    private final void f() {
        if (this.l) {
            exkx exkxVar = this.j;
            if (exkxVar == null) {
                ffkj.c("microphoneHelper");
                exkxVar = null;
            }
            exkxVar.c();
            this.l = false;
        }
    }

    @Override // defpackage.dpey
    public final Object a(ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "stop", 112, "MicrophoneAudioSource.kt")).q("Stopping MicrophoneAudioSource.");
        f();
        Object fQ = this.d.fQ(new dpdd((byte[]) null), ffguVar);
        return fQ == ffhh.a ? fQ : ffcu.a;
    }

    @Override // defpackage.dpdc
    public final Object b(ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        enrr enrrVar = (enrr) h.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "prepare", 78, "MicrophoneAudioSource.kt");
        StringBuilder sb = new StringBuilder("sampleRate = ");
        dpfo dpfoVar = this.c;
        sb.append(dpfoVar.a);
        String sb2 = sb.toString();
        String str = "channelCount = " + dpfoVar.b;
        Duration duration = dpfoVar.c;
        Objects.toString(duration);
        String concat = "outputTimeout = ".concat(duration.toString());
        Duration duration2 = dpfoVar.d;
        Objects.toString(duration2);
        enrrVar.t("Preparing MicrophoneAudioSource with configuration %s", ffdo.R(new String[]{sb2, str, "outputBufferCapacity = 0", concat, "maxDuration = ".concat(String.valueOf(duration2))}, null, 63));
        dpfo dpfoVar2 = this.c;
        int i = dpfoVar2.b;
        if (i != 1) {
            throw new IllegalArgumentException(a.f(i, "Channel count ", " not supported."));
        }
        exkx exkxVar = new exkx(dpfoVar2.a, 16);
        this.j = exkxVar;
        exkxVar.a(new exkn() { // from class: dpfh
            @Override // defpackage.exkn
            public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
                ShortBuffer asShortBuffer = byteBuffer.order(ByteOrder.nativeOrder()).asShortBuffer();
                asShortBuffer.getClass();
                while (true) {
                    dpfm dpfmVar = dpfm.this;
                    if (!asShortBuffer.hasRemaining()) {
                        byteBuffer.getClass();
                        ffqz.a(dpfmVar.b, new dpfj(dpfmVar, byteBuffer, null));
                        return;
                    } else {
                        int abs = Math.abs((int) asShortBuffer.get());
                        if (abs > dpfmVar.h) {
                            dpfmVar.h = abs;
                        }
                    }
                }
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.dpdc
    public final Object c(ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "release", 118, "MicrophoneAudioSource.kt")).q("Releasing MicrophoneAudioSource.");
        f();
        Object fQ = this.d.fQ(new dpdd((byte[]) null), ffguVar);
        return fQ == ffhh.a ? fQ : ffcu.a;
    }

    @Override // defpackage.dpdc
    public final Object d(ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 96, "MicrophoneAudioSource.kt")).q("Starting MicrophoneAudioSource.");
        if (!this.l) {
            exkx exkxVar = this.j;
            if (exkxVar == null) {
                ffkj.c("microphoneHelper");
                exkxVar = null;
            }
            exkxVar.b();
            this.l = true;
        }
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.dpfk
            if (r0 == 0) goto L13
            r0 = r9
            dpfk r0 = (defpackage.dpfk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpfk r0 = new dpfk
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            dpfm r0 = r0.d
            defpackage.ffci.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.ffci.b(r9)
            ffud r9 = r8.k
            if (r9 == 0) goto L3c
            ffcu r9 = defpackage.ffcu.a
            return r9
        L3c:
            enru r9 = defpackage.dpfm.a
            ensk r9 = r9.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "HugoAudio"
            r9.Y(r2, r5)
            java.lang.String r2 = "onMaxDurationReached"
            r5 = 179(0xb3, float:2.51E-43)
            java.lang.String r6 = "com/google/android/libraries/compose/audio/source/MicrophoneAudioSource"
            java.lang.String r7 = "MicrophoneAudioSource.kt"
            ensk r9 = r9.h(r6, r2, r5, r7)
            enrr r9 = (defpackage.enrr) r9
            dpfo r2 = r8.c
            j$.time.Duration r2 = r2.d
            if (r2 == 0) goto L67
            long r5 = r2.toMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            goto L68
        L67:
            r2 = r4
        L68:
            if (r2 == 0) goto L97
            java.lang.String r5 = "Max duration of %d ms reached, stopping recording."
            long r6 = r2.longValue()
            r9.s(r5, r6)
            fgcl r9 = r8.d
            dpdd r2 = new dpdd
            r2.<init>(r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r9.fQ(r2, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            r0 = r8
        L86:
            ffsk r9 = r0.i
            dpfl r1 = new dpfl
            r1.<init>(r0, r4)
            r2 = 3
            ffud r9 = defpackage.ffqy.d(r9, r4, r4, r1, r2)
            r0.k = r9
            ffcu r9 = defpackage.ffcu.a
            return r9
        L97:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot invoke onMaxDurationReached with 'null' maxDuration."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpfm.e(ffgu):java.lang.Object");
    }
}
