package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mny extends mrk implements mhd {
    private lqc A;
    private long B;
    private boolean C;
    private int D;
    public final mmq j;
    public boolean k;
    public boolean l;
    private final mmw v;
    private final mqz w;
    private int x;
    private boolean y;
    private lqc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mny(Context context, mrb mrbVar, mrm mrmVar, Handler handler, mgi mgiVar, mmw mmwVar) {
        super(1, mrbVar, mrmVar, 44100.0f);
        mqz mqzVar = lvf.a >= 35 ? new mqz() : null;
        context.getApplicationContext();
        this.v = mmwVar;
        this.w = mqzVar;
        this.D = -1000;
        this.j = new mmq(handler, mgiVar);
        ((mnu) mmwVar).W = new mnx(this);
    }

    private static List aC(mrm mrmVar, lqc lqcVar, boolean z, mmw mmwVar) {
        mrf a;
        if (lqcVar.o != null) {
            return (!mmwVar.g(lqcVar) || (a = mrv.a()) == null) ? mrv.g(lqcVar, z, false) : engw.r(a);
        }
        int i = engw.d;
        return enou.a;
    }

    private final void aD() {
        long j;
        long j2;
        boolean T = T();
        final mnu mnuVar = (mnu) this.v;
        if (!mnuVar.t() || mnuVar.C) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(mnuVar.h.a(T), mnuVar.n.a(mnuVar.i()));
            while (!mnuVar.i.isEmpty() && min >= ((mnm) mnuVar.i.getFirst()).c) {
                mnuVar.v = (mnm) mnuVar.i.remove();
            }
            mnm mnmVar = mnuVar.v;
            long j3 = min - mnmVar.c;
            long s = lvf.s(j3, mnmVar.a.b);
            if (mnuVar.i.isEmpty()) {
                mnl mnlVar = mnuVar.U;
                if (mnlVar.c.h()) {
                    lsw lswVar = mnlVar.c;
                    if (lswVar.i >= 1024) {
                        long j4 = lswVar.h;
                        lti.f(lswVar.g);
                        long b = j4 - r2.b();
                        int i = lswVar.e.b;
                        int i2 = lswVar.d.b;
                        j3 = i == i2 ? lvf.w(j3, b, lswVar.i) : lvf.w(j3, b * i, lswVar.i * i2);
                    } else {
                        j3 = (long) (lswVar.b * j3);
                    }
                }
                mnm mnmVar2 = mnuVar.v;
                j2 = mnmVar2.b + j3;
                mnmVar2.d = j3 - s;
            } else {
                mnm mnmVar3 = mnuVar.v;
                j2 = mnmVar3.b + s + mnmVar3.d;
            }
            long j5 = mnuVar.U.b.f;
            j = j2 + mnuVar.n.a(j5);
            long j6 = mnuVar.R;
            if (j5 > j6) {
                long a = mnuVar.n.a(j5 - j6);
                mnuVar.R = j5;
                mnuVar.S += a;
                if (mnuVar.T == null) {
                    mnuVar.T = new Handler(Looper.myLooper());
                }
                mnuVar.T.removeCallbacksAndMessages(null);
                mnuVar.T.postDelayed(new Runnable() { // from class: mnd
                    @Override // java.lang.Runnable
                    public final void run() {
                        mnu mnuVar2 = mnu.this;
                        if (mnuVar2.S >= 300000) {
                            mnuVar2.W.a.l = true;
                            mnuVar2.S = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (j != Long.MIN_VALUE) {
            if (!this.k) {
                j = Math.max(this.B, j);
            }
            this.B = j;
            this.k = false;
        }
    }

    private static final int aE(mrf mrfVar, lqc lqcVar) {
        if ("OMX.google.raw.decoder".equals(mrfVar.a)) {
            int i = lvf.a;
        }
        return lqcVar.p;
    }

    @Override // defpackage.mea
    protected final void A() {
        aD();
        mnu mnuVar = (mnu) this.v;
        mnuVar.J = false;
        if (mnuVar.t()) {
            mmz mmzVar = mnuVar.h;
            mmzVar.c();
            if (mmzVar.o == -9223372036854775807L) {
                mmy mmyVar = mmzVar.c;
                lti.f(mmyVar);
                mmyVar.d();
            } else {
                mmzVar.q = mmzVar.b();
                if (!mnu.u(mnuVar.p)) {
                    return;
                }
            }
            mnuVar.p.pause();
        }
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.mrk, defpackage.mig
    public final boolean T() {
        if (!this.r) {
            return false;
        }
        mnu mnuVar = (mnu) this.v;
        if (mnuVar.t()) {
            return mnuVar.H && !mnuVar.f();
        }
        return true;
    }

    @Override // defpackage.mrk, defpackage.mig
    public final boolean U() {
        return this.v.f() || super.U();
    }

    @Override // defpackage.mrk
    protected final int W(mrm mrmVar, lqc lqcVar) {
        int i;
        boolean z;
        mmd mmdVar;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        if (lre.i(lqcVar.o)) {
            int i2 = lqcVar.M;
            boolean ay = ay(lqcVar);
            int i3 = 8;
            if (!ay || (i2 != 0 && mrv.a() == null)) {
                i = 0;
            } else {
                mnu mnuVar = (mnu) this.v;
                if (mnuVar.O) {
                    mmdVar = mmd.a;
                } else {
                    mnb mnbVar = mnuVar.V;
                    lpk lpkVar = mnuVar.t;
                    lti.f(lqcVar);
                    lti.f(lpkVar);
                    if (lvf.a < 29 || lqcVar.F == -1) {
                        mmdVar = mmd.a;
                    } else {
                        Context context = mnbVar.a;
                        Boolean bool = mnbVar.b;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        } else {
                            if (context != null) {
                                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                                if (audioManager != null) {
                                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                                    mnbVar.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                                } else {
                                    mnbVar.b = false;
                                }
                            } else {
                                mnbVar.b = false;
                            }
                            booleanValue = mnbVar.b.booleanValue();
                        }
                        String str = lqcVar.o;
                        lti.f(str);
                        int a = lre.a(str, lqcVar.k);
                        if (a == 0 || lvf.a < lvf.g(a)) {
                            mmdVar = mmd.a;
                        } else {
                            int h = lvf.h(lqcVar.E);
                            if (h == 0) {
                                mmdVar = mmd.a;
                            } else {
                                try {
                                    AudioFormat B = lvf.B(lqcVar.F, h, a);
                                    if (lvf.a >= 31) {
                                        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(B, lpkVar.a().a);
                                        if (playbackOffloadSupport == 0) {
                                            mmdVar = mmd.a;
                                        } else {
                                            mmc mmcVar = new mmc();
                                            boolean z2 = lvf.a > 32 && playbackOffloadSupport == 2;
                                            mmcVar.b();
                                            mmcVar.b = z2;
                                            mmcVar.c = booleanValue;
                                            mmdVar = mmcVar.a();
                                        }
                                    } else {
                                        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(B, lpkVar.a().a);
                                        if (isOffloadedPlaybackSupported) {
                                            mmc mmcVar2 = new mmc();
                                            mmcVar2.b();
                                            mmcVar2.c = booleanValue;
                                            mmdVar = mmcVar2.a();
                                        } else {
                                            mmdVar = mmd.a;
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                    mmdVar = mmd.a;
                                }
                            }
                        }
                    }
                }
                if (mmdVar.b) {
                    i = true != mmdVar.c ? 512 : 1536;
                    if (mmdVar.d) {
                        i |= 2048;
                    }
                } else {
                    i = 0;
                }
                if (this.v.g(lqcVar)) {
                    return mih.b(4, 8, 32, i);
                }
            }
            if ((!"audio/raw".equals(lqcVar.o) || this.v.g(lqcVar)) && this.v.g(lvf.F(2, lqcVar.E, lqcVar.F))) {
                List aC = aC(mrmVar, lqcVar, false, this.v);
                if (!aC.isEmpty()) {
                    if (ay) {
                        mrf mrfVar = (mrf) aC.get(0);
                        boolean d = mrfVar.d(lqcVar);
                        if (!d) {
                            for (int i4 = 1; i4 < ((enou) aC).c; i4++) {
                                mrf mrfVar2 = (mrf) aC.get(i4);
                                if (mrfVar2.d(lqcVar)) {
                                    z = false;
                                    d = true;
                                    mrfVar = mrfVar2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        int i5 = true != d ? 3 : 4;
                        if (d && mrfVar.f(lqcVar)) {
                            i3 = 16;
                        }
                        return mih.c(i5, i3, 32, true != mrfVar.g ? 0 : 64, true == z ? 128 : 0, i);
                    }
                    r1 = 2;
                }
            }
            r1 = 1;
        }
        return mih.a(r1);
    }

    @Override // defpackage.mrk
    protected final mec X(mrf mrfVar, lqc lqcVar, lqc lqcVar2) {
        int i;
        int i2;
        mec b = mrfVar.b(lqcVar, lqcVar2);
        int i3 = b.e;
        if (au(lqcVar2)) {
            i3 |= 32768;
        }
        if (aE(mrfVar, lqcVar2) > this.x) {
            i3 |= 64;
        }
        String str = mrfVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = b.d;
        }
        return new mec(str, lqcVar, lqcVar2, i2, i);
    }

    @Override // defpackage.mrk
    protected final mec Y(mgz mgzVar) {
        final lqc lqcVar = mgzVar.b;
        lti.f(lqcVar);
        this.z = lqcVar;
        final mmq mmqVar = this.j;
        Handler handler = mmqVar.a;
        final mec Y = super.Y(mgzVar);
        if (handler != null) {
            handler.post(new Runnable() { // from class: mmm
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1009, new lud() { // from class: mkp
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        return Y;
    }

    @Override // defpackage.mrk
    protected final mra Z(mrf mrfVar, lqc lqcVar, MediaCrypto mediaCrypto, float f) {
        lqc[] O = O();
        int length = O.length;
        int aE = aE(mrfVar, lqcVar);
        if (length != 1) {
            for (lqc lqcVar2 : O) {
                if (mrfVar.b(lqcVar, lqcVar2).d != 0) {
                    aE = Math.max(aE, aE(mrfVar, lqcVar2));
                }
            }
        }
        this.x = aE;
        int i = lvf.a;
        String str = mrfVar.a;
        this.y = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = mrfVar.c;
        int i2 = this.x;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", lqcVar.E);
        mediaFormat.setInteger("sample-rate", lqcVar.F);
        lum.f(mediaFormat, lqcVar.r);
        lum.d(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (lvf.a <= 28 && "audio/ac4".equals(lqcVar.o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (this.v.a(lvf.F(4, lqcVar.E, lqcVar.F)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (lvf.a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (lvf.a >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.D));
        }
        lqc lqcVar3 = null;
        if ("audio/raw".equals(mrfVar.b) && !"audio/raw".equals(lqcVar.o)) {
            lqcVar3 = lqcVar;
        }
        this.A = lqcVar3;
        return new mra(mrfVar, mediaFormat, lqcVar, null, mediaCrypto, this.w);
    }

    @Override // defpackage.mhd
    public final long a() {
        if (this.c == 2) {
            aD();
        }
        return this.B;
    }

    @Override // defpackage.mrk
    protected final List aa(mrm mrmVar, lqc lqcVar, boolean z) {
        return mrv.d(aC(mrmVar, lqcVar, z, this.v), lqcVar);
    }

    @Override // defpackage.mrk
    protected final void ab(lxz lxzVar) {
        lqc lqcVar;
        if (lvf.a < 29 || (lqcVar = lxzVar.b) == null || !Objects.equals(lqcVar.o, "audio/opus") || !((mrk) this).q) {
            return;
        }
        ByteBuffer byteBuffer = lxzVar.g;
        lti.f(byteBuffer);
        lti.f(lxzVar.b);
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = ((mnu) this.v).p;
            if (audioTrack != null) {
                mnu.u(audioTrack);
            }
        }
    }

    @Override // defpackage.mrk
    protected final void ac(final Exception exc) {
        luj.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        final mmq mmqVar = this.j;
        Handler handler = mmqVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mmk
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1029, new lud() { // from class: mkw
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mrk
    protected final void ad(final String str) {
        final mmq mmqVar = this.j;
        Handler handler = mmqVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mmp
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1012, new lud() { // from class: mja
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mrk
    protected final void ae(lqc lqcVar, MediaFormat mediaFormat) {
        int integer;
        lqc lqcVar2;
        int i;
        int intValue;
        lso lsoVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int d;
        lqc lqcVar3 = lqcVar;
        lqc lqcVar4 = this.A;
        int[] iArr = null;
        int i6 = 2;
        if (lqcVar4 != null) {
            lqcVar2 = lqcVar4;
        } else {
            if (((mrk) this).n != null) {
                lti.f(mediaFormat);
                if ("audio/raw".equals(lqcVar3.o)) {
                    integer = lqcVar3.G;
                } else {
                    int i7 = lvf.a;
                    integer = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? lvf.m(mediaFormat.getInteger("v-bits-per-sample")) : 2;
                }
                lqb lqbVar = new lqb();
                lqbVar.c("audio/raw");
                lqbVar.E = integer;
                lqbVar.F = lqcVar3.H;
                lqbVar.G = lqcVar3.I;
                lqbVar.k = lqcVar3.l;
                Object obj = lqcVar3.m;
                lqbVar.a = lqcVar3.a;
                lqbVar.b = lqcVar3.b;
                lqbVar.c = engw.n(lqcVar3.c);
                lqbVar.d = lqcVar3.d;
                lqbVar.e = lqcVar3.e;
                lqbVar.f = lqcVar3.f;
                lqbVar.C = mediaFormat.getInteger("channel-count");
                lqbVar.D = mediaFormat.getInteger("sample-rate");
                lqcVar3 = new lqc(lqbVar);
                if (this.y) {
                    int i8 = lqcVar3.E;
                    if (i8 == 3) {
                        iArr = new int[]{0, 2, 1};
                    } else if (i8 == 5) {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    } else if (i8 == 6) {
                        iArr = new int[]{0, 2, 1, 5, 3, 4};
                    } else if (i8 == 7) {
                        iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                    } else if (i8 == 8) {
                        iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                    }
                }
            }
            lqcVar2 = lqcVar3;
        }
        try {
            if (lvf.a >= 29) {
                if (((mrk) this).q) {
                    Q();
                }
                lti.c(lvf.a >= 29);
            }
            mmw mmwVar = this.v;
            ((mnu) mmwVar).m();
            if ("audio/raw".equals(lqcVar2.o)) {
                lti.a(lvf.X(lqcVar2.G));
                int n = lvf.n(lqcVar2.G, lqcVar2.E);
                engr engrVar = new engr();
                int i9 = lqcVar2.G;
                engrVar.j(((mnu) mmwVar).f);
                engrVar.i(((mnu) mmwVar).U.a);
                lso lsoVar2 = new lso(engrVar.g());
                if (lsoVar2.equals(((mnu) mmwVar).o)) {
                    lsoVar2 = ((mnu) mmwVar).o;
                }
                moc mocVar = ((mnu) mmwVar).e;
                int i10 = lqcVar2.H;
                int i11 = lqcVar2.I;
                mocVar.e = i10;
                mocVar.f = i11;
                ((mnu) mmwVar).d.e = iArr;
                try {
                    lsp a = lsoVar2.a(new lsp(lqcVar2));
                    intValue = a.d;
                    i = a.b;
                    int i12 = a.c;
                    int h = lvf.h(i12);
                    i2 = lvf.n(intValue, i12);
                    i4 = n;
                    i3 = h;
                    lsoVar = lsoVar2;
                    i6 = 0;
                } catch (lsq e) {
                    throw new mms(e, lqcVar2);
                }
            } else {
                int i13 = engw.d;
                lso lsoVar3 = new lso(enou.a);
                i = lqcVar2.F;
                mmd mmdVar = mmd.a;
                Pair a2 = ((mnu) mmwVar).q.a(lqcVar2, ((mnu) mmwVar).t);
                if (a2 == null) {
                    throw new mms("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(lqcVar2))), lqcVar2);
                }
                intValue = ((Integer) a2.first).intValue();
                int intValue2 = ((Integer) a2.second).intValue();
                lsoVar = lsoVar3;
                i2 = -1;
                i3 = intValue2;
                i4 = -1;
            }
            if (intValue == 0) {
                throw new mms("Invalid output encoding (mode=" + i6 + ") for: " + String.valueOf(lqcVar2), lqcVar2);
            }
            if (i3 == 0) {
                throw new mms("Invalid output channel config (mode=" + i6 + ") for: " + String.valueOf(lqcVar2), lqcVar2);
            }
            int i14 = lqcVar2.j;
            if ("audio/vnd.dts.hd;profile=lbr".equals(lqcVar2.o) && i14 == -1) {
                i14 = 768000;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i, i3, intValue);
            lti.c(minBufferSize != -2);
            int i15 = i2 != -1 ? i2 : 1;
            int i16 = 250000;
            if (i6 == 0) {
                i5 = i3;
                d = lvf.d(minBufferSize * 4, mnv.a(250000, i, i15), mnv.a(750000, i, i15));
            } else if (i6 != 1) {
                if (intValue == 5) {
                    i16 = 500000;
                } else if (intValue == 8) {
                    i16 = 1000000;
                    intValue = 8;
                }
                i5 = i3;
                d = ermn.a((i16 * (i14 != -1 ? erla.b(i14, 8, RoundingMode.CEILING) : mnv.b(intValue))) / 1000000);
            } else {
                i5 = i3;
                d = ermn.a((mnv.b(intValue) * 50000000) / 1000000);
            }
            int i17 = intValue;
            ((mnu) mmwVar).O = false;
            mnk mnkVar = new mnk(lqcVar2, i4, i6, i2, i, i5, i17, (((Math.max(minBufferSize, d) + i15) - 1) / i15) * i15, lsoVar);
            if (((mnu) mmwVar).t()) {
                ((mnu) mmwVar).m = mnkVar;
            } else {
                ((mnu) mmwVar).n = mnkVar;
            }
        } catch (mms e2) {
            throw h(e2, e2.a, 5001);
        }
    }

    @Override // defpackage.mrk
    protected final void af() {
        this.v.c();
    }

    @Override // defpackage.mrk
    protected final void ag() {
        try {
            mmw mmwVar = this.v;
            if (!((mnu) mmwVar).H && ((mnu) mmwVar).t() && ((mnu) mmwVar).r()) {
                ((mnu) mmwVar).n();
                ((mnu) mmwVar).H = true;
            }
        } catch (mmv e) {
            throw i(e, e.c, e.b, true != ((mrk) this).q ? 5002 : 5003);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0556, code lost:
    
        if (r0 != 0) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0428 A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x042e A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065e A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x066d A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a5 A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030c A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0330 A[Catch: mmv -> 0x06d5, mmt -> 0x06e8, TryCatch #1 {mmv -> 0x06d5, blocks: (B:14:0x0034, B:19:0x0043, B:21:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:40:0x00be, B:41:0x00a9, B:43:0x00b8, B:44:0x00c4, B:213:0x00d1, B:216:0x00dd, B:217:0x013d, B:219:0x014f, B:221:0x015d, B:222:0x016c, B:223:0x0186, B:225:0x018c, B:227:0x0194, B:229:0x01a8, B:230:0x01ab, B:232:0x01f1, B:233:0x01fd, B:235:0x0236, B:237:0x0247, B:238:0x0252, B:240:0x025a, B:241:0x026b, B:243:0x027a, B:245:0x028c, B:250:0x00f1, B:252:0x00fe, B:255:0x012e, B:259:0x06b8, B:260:0x06bb, B:261:0x06c2, B:47:0x0294, B:49:0x02a5, B:51:0x02cd, B:52:0x02d4, B:57:0x02fc, B:59:0x030c, B:61:0x0320, B:62:0x0328, B:64:0x0330, B:67:0x033b, B:74:0x0346, B:76:0x0350, B:78:0x0358, B:83:0x036a, B:85:0x036f, B:86:0x0372, B:87:0x037d, B:88:0x037e, B:89:0x0550, B:92:0x039d, B:94:0x03ac, B:98:0x03b8, B:101:0x03c3, B:104:0x03de, B:96:0x03ba, B:110:0x03f5, B:115:0x0428, B:116:0x042d, B:117:0x0405, B:120:0x040c, B:123:0x0412, B:128:0x0420, B:129:0x042e, B:131:0x043e, B:134:0x045d, B:135:0x044f, B:137:0x0469, B:139:0x0475, B:142:0x0480, B:145:0x048d, B:150:0x049d, B:151:0x04d2, B:152:0x04ec, B:153:0x04af, B:154:0x04d0, B:155:0x04c0, B:156:0x04d7, B:157:0x04f0, B:160:0x0527, B:162:0x053c, B:163:0x0543, B:165:0x04fa, B:167:0x0506, B:169:0x0510, B:171:0x051a, B:173:0x0525, B:174:0x0558, B:176:0x0560, B:178:0x056a, B:179:0x0578, B:181:0x05a6, B:183:0x05b3, B:185:0x05bb, B:186:0x05c3, B:187:0x05ca, B:189:0x05d2, B:191:0x05dc, B:195:0x0607, B:196:0x060c, B:198:0x0616, B:199:0x063f, B:200:0x0629, B:202:0x064b, B:204:0x065e, B:205:0x066d, B:209:0x068c, B:211:0x069b, B:263:0x06c4, B:265:0x06c8, B:266:0x06d4), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06ab  */
    @Override // defpackage.mrk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean ah(long r29, long r31, defpackage.mrc r33, java.nio.ByteBuffer r34, int r35, int r36, int r37, long r38, boolean r40, boolean r41, defpackage.lqc r42) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mny.ah(long, long, mrc, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, lqc):boolean");
    }

    @Override // defpackage.mrk
    protected final boolean ai(lqc lqcVar) {
        Q();
        return this.v.g(lqcVar);
    }

    @Override // defpackage.mrk
    protected final float aj(float f, lqc[] lqcVarArr) {
        int i = -1;
        for (lqc lqcVar : lqcVarArr) {
            int i2 = lqcVar.F;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.mrk
    protected final void ak(final String str, final long j, final long j2) {
        final mmq mmqVar = this.j;
        Handler handler = mmqVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mmo
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1008, new lud() { // from class: mjq
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mhd
    public final lri b() {
        return ((mnu) this.v).w;
    }

    @Override // defpackage.mhd
    public final void d(lri lriVar) {
        lri lriVar2 = new lri(lvf.a(lriVar.b, 0.1f, 8.0f), lvf.a(lriVar.c, 0.1f, 8.0f));
        mnu mnuVar = (mnu) this.v;
        mnuVar.w = lriVar2;
        mnuVar.p(lriVar);
    }

    @Override // defpackage.mhd
    public final boolean g() {
        boolean z = this.l;
        this.l = false;
        return z;
    }

    @Override // defpackage.mrk, defpackage.mea, defpackage.mic
    public final void r(int i, Object obj) {
        mqz mqzVar;
        LoudnessCodecController create;
        boolean addMediaCodec;
        if (i == 2) {
            mmw mmwVar = this.v;
            lti.f(obj);
            float floatValue = ((Float) obj).floatValue();
            mnu mnuVar = (mnu) mmwVar;
            if (mnuVar.E != floatValue) {
                mnuVar.E = floatValue;
                mnuVar.q();
                return;
            }
            return;
        }
        if (i == 3) {
            lpk lpkVar = (lpk) obj;
            mmw mmwVar2 = this.v;
            lti.f(lpkVar);
            mnu mnuVar2 = (mnu) mmwVar2;
            if (mnuVar2.t.equals(lpkVar)) {
                return;
            }
            mnuVar2.t = lpkVar;
            mma mmaVar = mnuVar2.r;
            if (mmaVar != null) {
                mmaVar.h = lpkVar;
                mmaVar.a(mlw.b(mmaVar.a, lpkVar, mmaVar.g));
            }
            mnuVar2.b();
            return;
        }
        if (i == 6) {
            lpl lplVar = (lpl) obj;
            mmw mmwVar3 = this.v;
            lti.f(lplVar);
            mnu mnuVar3 = (mnu) mmwVar3;
            if (mnuVar3.L.equals(lplVar)) {
                return;
            }
            if (mnuVar3.p != null) {
                int i2 = mnuVar3.L.a;
            }
            mnuVar3.L = lplVar;
            return;
        }
        if (i == 12) {
            int i3 = lvf.a;
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            mnu mnuVar4 = (mnu) this.v;
            mnuVar4.M = audioDeviceInfo != null ? new mmb(audioDeviceInfo) : null;
            mma mmaVar2 = mnuVar4.r;
            if (mmaVar2 != null) {
                mmaVar2.b(audioDeviceInfo);
            }
            AudioTrack audioTrack = mnuVar4.p;
            if (audioTrack != null) {
                mng.a(audioTrack, mnuVar4.M);
                return;
            }
            return;
        }
        if (i == 16) {
            lti.f(obj);
            this.D = ((Integer) obj).intValue();
            mrc mrcVar = ((mrk) this).n;
            if (mrcVar == null || lvf.a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.D));
            mrcVar.l(bundle);
            return;
        }
        if (i == 9) {
            mmw mmwVar4 = this.v;
            lti.f(obj);
            mnu mnuVar5 = (mnu) mmwVar4;
            mnuVar5.x = ((Boolean) obj).booleanValue();
            mnuVar5.p(mnuVar5.w);
            return;
        }
        if (i != 10) {
            super.r(i, obj);
            return;
        }
        lti.f(obj);
        int intValue = ((Integer) obj).intValue();
        mnu mnuVar6 = (mnu) this.v;
        if (mnuVar6.K != intValue) {
            mnuVar6.K = intValue;
            mnuVar6.b();
        }
        if (lvf.a < 35 || (mqzVar = this.w) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = mqzVar.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            mqzVar.b = null;
        }
        create = LoudnessCodecController.create(intValue, erpp.a, new mqy());
        mqzVar.b = create;
        Iterator it = mqzVar.a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void u() {
        this.C = true;
        this.z = null;
        try {
            this.v.b();
            super.u();
        } catch (Throwable th) {
            super.u();
            throw th;
        } finally {
            this.j.a(this.t);
        }
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void v(boolean z, boolean z2) {
        super.v(z, z2);
        final mmq mmqVar = this.j;
        Handler handler = mmqVar.a;
        final meb mebVar = this.t;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mme
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1007, new lud() { // from class: miy
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        Q();
        ((mnu) this.v).l = m();
        ((mnu) this.v).h.u = eN();
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void w(long j, boolean z) {
        super.w(j, z);
        this.v.b();
        this.B = j;
        this.l = false;
        this.k = true;
    }

    @Override // defpackage.mea
    protected final void x() {
        mqz mqzVar;
        mma mmaVar = ((mnu) this.v).r;
        if (mmaVar != null && mmaVar.i) {
            mmaVar.f = null;
            int i = lvf.a;
            mlx mlxVar = mmaVar.c;
            if (mlxVar != null) {
                AudioManager audioManager = (AudioManager) mmaVar.a.getSystemService("audio");
                lti.f(audioManager);
                audioManager.unregisterAudioDeviceCallback(mlxVar);
            }
            mmaVar.a.unregisterReceiver(mmaVar.d);
            mly mlyVar = mmaVar.e;
            if (mlyVar != null) {
                mlyVar.a.unregisterContentObserver(mlyVar);
            }
            mmaVar.i = false;
        }
        if (lvf.a < 35 || (mqzVar = this.w) == null) {
            return;
        }
        mqzVar.a.clear();
        LoudnessCodecController loudnessCodecController = mqzVar.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void y() {
        this.l = false;
        try {
            super.y();
            if (this.C) {
                this.C = false;
                this.v.e();
            }
        } catch (Throwable th) {
            if (this.C) {
                this.C = false;
                this.v.e();
            }
            throw th;
        }
    }

    @Override // defpackage.mea
    protected final void z() {
        this.v.d();
    }

    @Override // defpackage.mea, defpackage.mig
    public final mhd k() {
        return this;
    }
}
