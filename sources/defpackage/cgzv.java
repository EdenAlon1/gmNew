package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgzv {
    public static final engf h;
    public final ffbr A;
    public final ffbr B;
    public final ffbr C;
    public final ffbr D;
    public final asmq E;
    public final asli F;
    public final asld G;
    public final ffbr H;
    public final ffbr I;
    private final errl K;
    private final crpr L;
    private final ctap M;
    private final bdxe N;
    private final Optional O;
    private final bctx P;
    private final csjk Q;
    private final csuu R;
    private final ffbr S;
    private final ffbr T;
    private final bzgd U;
    private final alzc V;
    private final cpbw W;
    private final aqvh X;
    private final ahor Y;
    private final Optional Z;
    private final ffbr ab;
    private final fazb ac;
    private final int ad;
    private final ffbr af;
    private final ffbr ag;
    private final ffbr ah;
    private final ffbr ai;
    private final ffbr aj;
    private final atmv ak;
    private cnq al;
    public final Context i;
    public final errl j;
    public final fazb k;
    public final fazb l;
    public final fazb m;
    public final cqoh n;
    public final ffbr o;
    public final ctyx p;
    public final ckds q;
    public final ctwb r;
    public final csjk s;
    public final chho t;
    public final cubo u;
    public final Optional v;
    public final bzqa x;
    public final azaw z;
    public static final cskc a = cskc.g("BugleNetwork", "NetworkUtils");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/NetworkUtils");
    private static final cfup J = cfvl.e(cfvl.b, "ditto_thumbnail_size", 100);
    public static final cfup c = cfvl.e(cfvl.b, "ditto_thumbnail_quality", 0);
    public static final cfup d = cfvl.e(cfvl.b, "ditto_upload_thread_count", 3);
    public static final cfup e = cfvl.e(cfvl.b, "ditto_download_thread_count", 5);
    public static final cfup f = cfvl.e(cfvl.b, "ditto_last_fcm_downgrade_day_limit", 7);
    public static final engf g = engf.d(byyt.UNARCHIVED, eruv.ACTIVE, byyt.ARCHIVED, eruv.ARCHIVED, byyt.KEEP_ARCHIVED, eruv.KEEP_ARCHIVED, byyt.SPAM_FOLDER, eruv.SPAM_FOLDER, byyt.BLOCKED_FOLDER, eruv.BLOCKED_FOLDER, byyt.CROSS_COUNTRY_FOLDER, eruv.CROSS_COUNTRY_FOLDER);
    private final Object ae = new Object();
    private final emyl aa = emys.a(new emyl() { // from class: cgyr
        @Override // defpackage.emyl
        public final Object get() {
            return csln.a("DittoUpload", ((Integer) cgzv.d.e()).intValue(), 1);
        }
    });
    public final emyl w = emys.a(new emyl() { // from class: cgys
        @Override // defpackage.emyl
        public final Object get() {
            return csln.a("DittoDownload", ((Integer) cgzv.e.e()).intValue(), 1);
        }
    });
    public final Bitmap.CompressFormat y = Bitmap.CompressFormat.JPEG;

    static {
        engd engdVar = new engd();
        engdVar.d("image/jpeg", erzf.IMAGE_JPEG);
        engdVar.d("image/jpg", erzf.IMAGE_JPG);
        engdVar.d("image/png", erzf.IMAGE_PNG);
        engdVar.d("image/gif", erzf.IMAGE_GIF);
        engdVar.d("image/vnd.wap.wbmp", erzf.IMAGE_WBMP);
        engdVar.d("image/x-ms-bmp", erzf.IMAGE_X_MS_BMP);
        engdVar.d("video/mp4", erzf.VIDEO_MP4);
        engdVar.d("video/3gpp2", erzf.VIDEO_3G2);
        engdVar.d("video/3gpp", erzf.VIDEO_3GPP);
        engdVar.d("video/webm", erzf.VIDEO_WEBM);
        engdVar.d("video/x-matroska", erzf.VIDEO_MKV);
        engdVar.d("audio/aac", erzf.AUDIO_AAC);
        engdVar.d("audio/amr", erzf.AUDIO_AMR);
        engdVar.d("audio/mp3", erzf.AUDIO_MP3);
        engdVar.d("audio/mpeg", erzf.AUDIO_MPEG);
        engdVar.d("audio/mpg", erzf.AUDIO_MPG);
        engdVar.d("audio/mp4", erzf.AUDIO_MP4);
        engdVar.d("audio/mp4-latm", erzf.AUDIO_MP4_LATM);
        engdVar.d("audio/3gpp", erzf.AUDIO_3GPP);
        engdVar.d("application/ogg", erzf.AUDIO_OGG);
        engdVar.d("text/x-vCard".toLowerCase(Locale.US), erzf.TEXT_VCARD);
        engdVar.d("application/pdf", erzf.APP_PDF);
        engdVar.d("application/txt", erzf.APP_TXT);
        engdVar.d("application/html", erzf.APP_HTML);
        engdVar.d("application/msword", erzf.APP_DOC);
        engdVar.d("application/vnd.openxmlformats-officedocument.wordprocessingml.document", erzf.APP_DOCX);
        engdVar.d("application/vnd.openxmlformats-officedocument.presentationml.presentation", erzf.APP_PPTX);
        engdVar.d("application/vnd.ms-powerpoint", erzf.APP_PPT);
        engdVar.d("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", erzf.APP_XLSX);
        engdVar.d("application/vnd.ms-excel", erzf.APP_XLS);
        engdVar.d("application/vnd.android.package-archive", erzf.APP_APK);
        engdVar.d("application/zip", erzf.APP_ZIP);
        engdVar.d("application/java-archive", erzf.APP_JAR);
        engdVar.d("text/x-vCalendar", erzf.CAL_TEXT_VCALENDAR);
        engdVar.d("text/x-vcalendar", erzf.CAL_TEXT_XVCALENDAR);
        engdVar.d("text/calendar", erzf.CAL_TEXT_CALENDAR);
        engdVar.d("application/vcs", erzf.CAL_APPLICATION_VCS);
        engdVar.d("application/ics", erzf.CAL_APPLICATION_ICS);
        engdVar.d("application/hbs-vcs", erzf.CAL_APPLICATION_HBSVCS);
        h = engdVar.c();
    }

    public cgzv(Context context, errl errlVar, errl errlVar2, crpr crprVar, ctap ctapVar, fazb fazbVar, fazb fazbVar2, fazb fazbVar3, bdxe bdxeVar, Optional optional, cqoh cqohVar, ffbr ffbrVar, bctx bctxVar, csjk csjkVar, csuu csuuVar, ctyx ctyxVar, ckds ckdsVar, ffbr ffbrVar2, ffbr ffbrVar3, ctwb ctwbVar, csjk csjkVar2, bzgd bzgdVar, alzc alzcVar, cpbw cpbwVar, chho chhoVar, cubo cuboVar, Optional optional2, aqvh aqvhVar, ahor ahorVar, Optional optional3, fazb fazbVar4, bzqa bzqaVar, ffbr ffbrVar4, azaw azawVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, asld asldVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, asmq asmqVar, asli asliVar, ffbr ffbrVar13, ffbr ffbrVar14, atmv atmvVar, ffbr ffbrVar15) {
        this.i = context;
        this.K = errlVar;
        this.j = errlVar2;
        this.L = crprVar;
        this.M = ctapVar;
        this.k = fazbVar;
        this.l = fazbVar2;
        this.m = fazbVar3;
        this.N = bdxeVar;
        this.O = optional;
        this.n = cqohVar;
        this.o = ffbrVar;
        this.P = bctxVar;
        this.Q = csjkVar;
        this.R = csuuVar;
        this.p = ctyxVar;
        this.q = ckdsVar;
        this.S = ffbrVar2;
        this.T = ffbrVar3;
        this.r = ctwbVar;
        this.s = csjkVar2;
        this.U = bzgdVar;
        this.V = alzcVar;
        this.W = cpbwVar;
        this.t = chhoVar;
        this.u = cuboVar;
        this.v = optional2;
        this.X = aqvhVar;
        this.Y = ahorVar;
        this.Z = optional3;
        this.ac = fazbVar4;
        this.af = ffbrVar5;
        this.ah = ffbrVar10;
        this.H = ffbrVar11;
        this.x = bzqaVar;
        this.ab = ffbrVar4;
        this.B = ffbrVar7;
        this.C = ffbrVar8;
        this.D = ffbrVar12;
        this.E = asmqVar;
        this.F = asliVar;
        this.I = ffbrVar15;
        this.ad = context.getResources().getDimensionPixelSize(R.dimen.ditto_icon_size);
        this.z = azawVar;
        this.A = ffbrVar6;
        this.G = asldVar;
        this.ag = ffbrVar9;
        this.ai = ffbrVar13;
        this.aj = ffbrVar14;
        this.ak = atmvVar;
    }

    private static Uri G(MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        return t == null ? messagePartCoreData.x() : t;
    }

    private final ekms H(Uri uri) {
        return ekmq.a(this.i).b().D(qvx.c).ai().q((rig) new rig().F(rdi.b)).i(uri);
    }

    private final erzg I(bcse bcseVar, MessagePartCoreData messagePartCoreData, erzf erzfVar) {
        erze erzeVar = (erze) erzg.a.createBuilder();
        erzeVar.copyOnWrite();
        ((erzg) erzeVar.instance).c = erzfVar.a();
        String Q = messagePartCoreData.Q();
        if (!TextUtils.isEmpty(Q) && !messagePartCoreData.bc()) {
            erzeVar.copyOnWrite();
            erzg erzgVar = (erzg) erzeVar.instance;
            Q.getClass();
            erzgVar.d = Q;
        }
        boolean aV = messagePartCoreData.aV();
        erzeVar.copyOnWrite();
        ((erzg) erzeVar.instance).i = aV;
        String T = messagePartCoreData.T();
        if (!TextUtils.isEmpty(T) && !messagePartCoreData.bf()) {
            erzeVar.copyOnWrite();
            erzg erzgVar2 = (erzg) erzeVar.instance;
            T.getClass();
            erzgVar2.j = T;
        }
        boolean aW = messagePartCoreData.aW();
        erzeVar.copyOnWrite();
        ((erzg) erzeVar.instance).k = aW;
        if (TextUtils.isEmpty(messagePartCoreData.Y())) {
            Uri v = messagePartCoreData.v();
            String lastPathSegment = v == null ? "" : v.getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                Uri t = messagePartCoreData.t();
                String lastPathSegment2 = t != null ? t.getLastPathSegment() : "";
                if (!TextUtils.isEmpty(lastPathSegment2)) {
                    erzeVar.copyOnWrite();
                    erzg erzgVar3 = (erzg) erzeVar.instance;
                    lastPathSegment2.getClass();
                    erzgVar3.e = lastPathSegment2;
                }
            } else {
                erzeVar.copyOnWrite();
                erzg erzgVar4 = (erzg) erzeVar.instance;
                lastPathSegment.getClass();
                erzgVar4.e = lastPathSegment;
            }
        } else {
            String Y = messagePartCoreData.Y();
            erzeVar.copyOnWrite();
            erzg erzgVar5 = (erzg) erzeVar.instance;
            Y.getClass();
            erzgVar5.e = Y;
        }
        if (bcyf.c(messagePartCoreData.bL())) {
            byte[] bL = messagePartCoreData.bL();
            bL.getClass();
            eyee x = eyee.x(bL);
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).l = x;
        }
        if (bcyf.c(messagePartCoreData.bK())) {
            byte[] bK = messagePartCoreData.bK();
            bK.getClass();
            eyee x2 = eyee.x(bK);
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).m = x2;
        }
        if (messagePartCoreData.bo() || messagePartCoreData.bD()) {
            int c2 = messagePartCoreData.c();
            int b2 = messagePartCoreData.b();
            Uri t2 = messagePartCoreData.t();
            if (messagePartCoreData.bo() && ((c2 < 0 || b2 < 0) && t2 != null)) {
                Rect h2 = this.M.h(t2, messagePartCoreData.V());
                int width = h2.width();
                b2 = h2.height();
                c2 = width;
            }
            if (c2 >= 0 && b2 >= 0) {
                esbp esbpVar = (esbp) esbq.a.createBuilder();
                esbpVar.copyOnWrite();
                ((esbq) esbpVar.instance).b = c2;
                esbpVar.copyOnWrite();
                ((esbq) esbpVar.instance).c = b2;
                erzeVar.copyOnWrite();
                erzg erzgVar6 = (erzg) erzeVar.instance;
                esbq esbqVar = (esbq) esbpVar.build();
                esbqVar.getClass();
                erzgVar6.g = esbqVar;
                erzgVar6.b |= 1;
            }
            eyee u = u(messagePartCoreData);
            if (u != null && u.d() > 0) {
                erzeVar.copyOnWrite();
                ((erzg) erzeVar.instance).h = u;
            }
        }
        if (messagePartCoreData.k() > -1) {
            long k = messagePartCoreData.k();
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).n = k;
        }
        if (messagePartCoreData.l() > 0) {
            long l = messagePartCoreData.l();
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).f = l;
        } else if (messagePartCoreData.p() > 0) {
            long p = messagePartCoreData.p();
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).f = p;
        } else if (bcseVar.g.size() == 1) {
            long l2 = bcseVar.l();
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).f = l2;
        }
        String V = messagePartCoreData.V();
        if (V != null) {
            erzeVar.copyOnWrite();
            ((erzg) erzeVar.instance).o = V;
        }
        return (erzg) erzeVar.build();
    }

    private final escr J(int i) {
        ctwi h2 = this.r.h(i);
        escq escqVar = (escq) escr.a.createBuilder();
        escu a2 = chqb.a(i);
        escqVar.copyOnWrite();
        escr escrVar = (escr) escqVar.instance;
        a2.getClass();
        escrVar.c = a2;
        escrVar.b |= 1;
        int c2 = this.r.c();
        escqVar.copyOnWrite();
        ((escr) escqVar.instance).d = i == c2;
        String b2 = chqb.b(h2.b());
        escqVar.copyOnWrite();
        escr escrVar2 = (escr) escqVar.instance;
        b2.getClass();
        escrVar2.f = b2;
        int d2 = h2.d();
        escqVar.copyOnWrite();
        ((escr) escqVar.instance).g = d2;
        if (h2.r() != null) {
            String r = h2.r();
            escqVar.copyOnWrite();
            escr escrVar3 = (escr) escqVar.instance;
            r.getClass();
            escrVar3.e = r;
        }
        return (escr) escqVar.build();
    }

    private final void K(cgzu cgzuVar) {
        if (cgzuVar.ordinal() != 0) {
            throw new GeneralSecurityException("Attachment encryption strategy not recognized.");
        }
    }

    static eyee v(eyee eyeeVar, bcyo bcyoVar) {
        emxf.b(!eyeeVar.H(), "unencryptedData should not be null or empty");
        emxf.b(true, "keys should not be null");
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr2 = bcyoVar.d;
            bArr2.getClass();
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            byte[] doFinal = cipher.doFinal(eyeeVar.I());
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] bArr3 = bcyoVar.e;
            bArr3.getClass();
            mac.init(new SecretKeySpec(bArr3, "HmacSHA256"));
            byte[] doFinal2 = mac.doFinal(bcyo.d(doFinal, bArr));
            int length = doFinal2.length;
            csix.a(length, 32);
            int length2 = doFinal.length;
            int i = length2 + 16;
            byte[] copyOf = Arrays.copyOf(doFinal, i + length);
            System.arraycopy(bArr, 0, copyOf, length2, 16);
            System.arraycopy(doFinal2, 0, copyOf, i, length);
            return eyee.x(copyOf);
        } catch (GeneralSecurityException e2) {
            a.o("Failed to encrypt request data", e2);
            throw e2;
        }
    }

    public final void A(InputStream inputStream, OutputStream outputStream, bcyf bcyfVar) {
        if (!bcyfVar.b()) {
            throw new GeneralSecurityException("Decryption key is invalid");
        }
        int read = inputStream.read();
        enhk enhkVar = cgzu.b;
        Integer valueOf = Integer.valueOf(read);
        if (!enhkVar.containsKey(valueOf)) {
            throw new GeneralSecurityException("Attachment encryption strategy not recognized.");
        }
        cgzu cgzuVar = (cgzu) cgzu.b.get(valueOf);
        cgzuVar.getClass();
        K(cgzuVar);
        int pow = (int) Math.pow(2.0d, inputStream.read());
        bdxe.b(pow);
        byte[] bArr = new byte[pow];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        int i = 0;
        while (true) {
            int read2 = inputStream.read(bArr);
            if (read2 < 0) {
                return;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            byte[] c2 = bdxe.c(inputStream, i);
            cipher.init(2, new SecretKeySpec(bcyfVar.d(), "AES"), new GCMParameterSpec(128, copyOf));
            cipher.updateAAD(c2);
            byte[] doFinal = cipher.doFinal(Arrays.copyOfRange(bArr, 12, read2));
            outputStream.write(doFinal, 0, doFinal.length);
            i++;
        }
    }

    public final void B(InputStream inputStream, OutputStream outputStream, bcyf bcyfVar) {
        if (!bcyfVar.b()) {
            throw new GeneralSecurityException("Encryption key is invalid");
        }
        cgzu cgzuVar = cgzu.a;
        int i = cgzuVar.c;
        int i2 = 0;
        outputStream.write(0);
        K(cgzuVar);
        int pow = (int) Math.pow(2.0d, bdxe.a());
        bdxe.b(pow);
        int i3 = pow - 28;
        byte[] bArr = new byte[i3];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        outputStream.write((byte) bdxe.a());
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            }
            byte[] bArr2 = new byte[12];
            emxr.a.nextBytes(bArr2);
            byte[] c2 = bdxe.c(inputStream, i2);
            cipher.init(1, new SecretKeySpec(bcyfVar.d(), "AES"), new GCMParameterSpec(128, bArr2));
            cipher.updateAAD(c2);
            int min = Math.min(i3, read);
            byte[] doFinal = cipher.doFinal(min < i3 ? Arrays.copyOf(bArr, min) : bArr);
            outputStream.write(bArr2);
            outputStream.write(doFinal);
            i2++;
        }
    }

    public final void C(ConversationIdType conversationIdType) {
        csjb a2 = a.a();
        a2.I("Invalidating participants cache for");
        a2.A("conversation", true != conversationIdType.b() ? conversationIdType : "all");
        a2.r();
        if (conversationIdType.b()) {
            synchronized (this.ae) {
                cnq cnqVar = this.al;
                if (cnqVar != null) {
                    cnqVar.f(-1);
                }
            }
            return;
        }
        synchronized (this.ae) {
            cnq cnqVar2 = this.al;
            if (cnqVar2 != null) {
            }
        }
    }

    public final boolean D() {
        return ((csmz) this.Q.a()).p();
    }

    public final boolean E(MessagePartCoreData messagePartCoreData) {
        ctap ctapVar = this.M;
        long a2 = a(messagePartCoreData);
        ctan k = ctapVar.k(messagePartCoreData.V(), messagePartCoreData.t(), messagePartCoreData.v());
        return k.b != null && a2 > k.a.c;
    }

    public final int F(bcyk bcykVar) {
        if (bcykVar.d() == 1) {
            return 3;
        }
        return bcykVar.d() != 2 ? 2 : 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.v()
            java.lang.String r1 = "Uri"
            java.lang.String r2 = "Unable to get content length"
            r3 = 0
            if (r0 == 0) goto L23
            csuu r5 = r8.R     // Catch: java.lang.Exception -> L13
            long r5 = r5.b(r0)     // Catch: java.lang.Exception -> L13
            goto L24
        L13:
            r5 = move-exception
            cskc r6 = defpackage.cgzv.a
            csjb r6 = r6.e()
            r6.I(r2)
            r6.A(r1, r0)
            r6.s(r5)
        L23:
            r5 = r3
        L24:
            android.net.Uri r9 = r9.t()
            if (r9 == 0) goto L41
            csuu r0 = r8.R     // Catch: java.lang.Exception -> L31
            long r0 = r0.b(r9)     // Catch: java.lang.Exception -> L31
            goto L42
        L31:
            r0 = move-exception
            cskc r7 = defpackage.cgzv.a
            csjb r7 = r7.e()
            r7.I(r2)
            r7.A(r1, r9)
            r7.s(r0)
        L41:
            r0 = r3
        L42:
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 != 0) goto L47
            return r0
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzv.a(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData):long");
    }

    final bctw b(ConversationIdType conversationIdType) {
        bctw bctwVar;
        synchronized (this.ae) {
            cnq cnqVar = this.al;
            bctwVar = cnqVar != null ? (bctw) cnqVar.c(conversationIdType) : null;
        }
        if (bctwVar != null) {
            return bctwVar;
        }
        bctw a2 = this.P.a(engw.n(((bdfp) this.ag.b()).f(conversationIdType)));
        synchronized (this.ae) {
            if (this.al == null) {
                this.al = new cnq(((Integer) bzaq.g.e()).intValue());
            }
        }
        return a2;
    }

    public final elfl c() {
        final ListenableFuture submit = this.K.submit(new Callable() { // from class: cgyz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return crob.e(cgzv.this.i);
            }
        });
        aqvh aqvhVar = this.X;
        final elfl d2 = this.V.d();
        final elfl b2 = aqvhVar.a().b();
        final elfl a2 = elfo.k(d2, b2).a(new Callable() { // from class: cgza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = engw.d;
                final engr engrVar = new engr();
                final alzq alzqVar = (alzq) erqt.q(d2);
                Stream stream = Collection.EL.stream((engw) erqt.q(b2));
                final cgzv cgzvVar = cgzv.this;
                stream.forEach(new Consumer() { // from class: cgyn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        engr engrVar2 = engrVar;
                        cgzv cgzvVar2 = cgzv.this;
                        alzq alzqVar2 = alzqVar;
                        aqux aquxVar = (aqux) obj;
                        if (cgzvVar2.E.a() || ((Boolean) cfma.a.e()).booleanValue()) {
                            int b3 = aquxVar.b();
                            String n = aquxVar.n();
                            String r = aquxVar.r();
                            esbr esbrVar = (esbr) esbs.a.createBuilder();
                            String b4 = aquxVar.g().b();
                            esbrVar.copyOnWrite();
                            ((esbs) esbrVar.instance).b = b4;
                            engrVar2.h(cgzvVar2.s(alzqVar2, b3, n, r, (esbs) esbrVar.build()));
                        } else {
                            int b5 = aquxVar.b();
                            String n2 = aquxVar.n();
                            esbr esbrVar2 = (esbr) esbs.a.createBuilder();
                            String b6 = aquxVar.g().b();
                            esbrVar2.copyOnWrite();
                            ((esbs) esbrVar2.instance).b = b6;
                            engrVar2.h(cgzvVar2.s(alzqVar2, b5, n2, null, (esbs) esbrVar2.build()));
                        }
                        csjb a3 = cgzv.a.a();
                        a3.I("add selfId into SubSettings");
                        a3.A("selfId", aquxVar.g());
                        a3.y("subId", aquxVar.b());
                        a3.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return engrVar.g();
            }
        }, this.K);
        final ListenableFuture j = elfr.j(d2, new emwl() { // from class: cgzb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                alzq alzqVar = (alzq) obj;
                esaz esazVar = (esaz) esba.a.createBuilder();
                boolean equals = alzqVar.a().equals(alzn.ENABLED);
                esazVar.copyOnWrite();
                esba esbaVar = (esba) esazVar.instance;
                boolean z = true;
                esbaVar.b |= 1;
                esbaVar.c = equals;
                boolean equals2 = alzqVar.b().equals(alzo.SEND);
                esazVar.copyOnWrite();
                esba esbaVar2 = (esba) esazVar.instance;
                esbaVar2.b |= 2;
                esbaVar2.d = equals2;
                boolean equals3 = alzqVar.c().equals(alzp.SEND);
                esazVar.copyOnWrite();
                esba esbaVar3 = (esba) esazVar.instance;
                esbaVar3.b |= 4;
                esbaVar3.e = equals3;
                cgzv cgzvVar = cgzv.this;
                if (!((ckge) cgzvVar.s.a()).q() && !((ckge) cgzvVar.s.a()).s() && !((ckge) cgzvVar.s.a()).r()) {
                    z = false;
                }
                esazVar.copyOnWrite();
                esba esbaVar4 = (esba) esazVar.instance;
                esbaVar4.b |= 8;
                esbaVar4.f = z;
                return (esba) esazVar.build();
            }
        }, this.K);
        final elfl h2 = ((aleo) this.ab.b()).a().h(new emwl() { // from class: cgzc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgzv cgzvVar = cgzv.this;
                Resources resources = cgzvVar.i.getResources();
                String string = resources.getString(R.string.link_preview_enabled_pref_key);
                boolean z = resources.getBoolean(R.bool.link_preview_enabled_pref_default);
                ertz ertzVar = (ertz) erua.a.createBuilder();
                boolean q = cgzvVar.p.q(string, z);
                ertzVar.copyOnWrite();
                ((erua) ertzVar.instance).c = q;
                ertzVar.copyOnWrite();
                ((erua) ertzVar.instance).d = true;
                esbd esbdVar = (esbd) esbe.a.createBuilder();
                esbdVar.copyOnWrite();
                ((esbe) esbdVar.instance).b = true;
                boolean a3 = cmsk.a();
                esbdVar.copyOnWrite();
                ((esbe) esbdVar.instance).c = a3;
                esbdVar.copyOnWrite();
                ((esbe) esbdVar.instance).d = true;
                esbe esbeVar = (esbe) esbdVar.build();
                ertzVar.copyOnWrite();
                erua eruaVar = (erua) ertzVar.instance;
                esbeVar.getClass();
                eruaVar.e = esbeVar;
                eruaVar.b |= 1;
                erub erubVar = (erub) cgzvVar.v.orElse(erub.DEFAULT);
                ertzVar.copyOnWrite();
                ((erua) ertzVar.instance).f = erubVar.a();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ertzVar.copyOnWrite();
                erua eruaVar2 = (erua) ertzVar.instance;
                eruaVar2.b |= 4;
                eruaVar2.h = booleanValue;
                esbh esbhVar = (esbh) esbi.a.createBuilder();
                esbhVar.copyOnWrite();
                ((esbi) esbhVar.instance).b = true;
                eyfy build = esbhVar.build();
                build.getClass();
                ertzVar.copyOnWrite();
                erua eruaVar3 = (erua) ertzVar.instance;
                eruaVar3.g = (esbi) build;
                eruaVar3.b |= 2;
                return (erua) ertzVar.build();
            }
        }, this.K);
        final elfl a3 = ((chnf) this.o.b()).a();
        final elfl e2 = elfo.e(Optional.empty());
        final elfl a4 = elfo.m(a3, e2).a(new Callable() { // from class: cgzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = cgzv.a;
                Long l = (Long) erqt.q(elfl.this);
                Optional optional = (Optional) erqt.q(e2);
                ertx ertxVar = (ertx) erty.a.createBuilder();
                long longValue = l != null ? l.longValue() : 0L;
                ertxVar.copyOnWrite();
                ((erty) ertxVar.instance).c = longValue;
                if (optional.isPresent()) {
                    eruh eruhVar = (eruh) optional.get();
                    ertxVar.copyOnWrite();
                    erty ertyVar = (erty) ertxVar.instance;
                    ertyVar.d = eruhVar;
                    ertyVar.b |= 1;
                }
                return (erty) ertxVar.build();
            }
        }, this.j);
        final elfl h3 = elfo.g(new Callable() { // from class: cgze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cgzv.this.p.r("ditto_desktop_settings");
            }
        }, this.K).h(new emwl() { // from class: cgzg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    return null;
                }
                try {
                    return (ervg) eyfy.parseFrom(ervg.a, bArr);
                } catch (eygu e3) {
                    cgzv.this.p.n("ditto_desktop_settings");
                    csix.p("Failed to parse stored desktop settings", e3);
                    return null;
                }
            }
        }, this.j);
        if (!((Boolean) cfma.a.e()).booleanValue()) {
            return elfo.m(submit, a2, j, a4, h2, h3).a(new Callable() { // from class: cgzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    escf escfVar = (escf) escg.a.createBuilder();
                    escfVar.copyOnWrite();
                    ((escg) escfVar.instance).k = true;
                    String str = (String) erqt.q(submit);
                    escfVar.copyOnWrite();
                    escg escgVar = (escg) escfVar.instance;
                    str.getClass();
                    escgVar.c = str;
                    escfVar.a((Iterable) erqt.q(a2));
                    esba esbaVar = (esba) erqt.q(j);
                    escfVar.copyOnWrite();
                    escg escgVar2 = (escg) escfVar.instance;
                    esbaVar.getClass();
                    escgVar2.f = esbaVar;
                    escgVar2.b |= 2;
                    erty ertyVar = (erty) erqt.q(a4);
                    escfVar.copyOnWrite();
                    escg escgVar3 = (escg) escfVar.instance;
                    ertyVar.getClass();
                    escgVar3.h = ertyVar;
                    escgVar3.b |= 16;
                    erua eruaVar = (erua) erqt.q(h2);
                    escfVar.copyOnWrite();
                    escg escgVar4 = (escg) escfVar.instance;
                    eruaVar.getClass();
                    escgVar4.g = eruaVar;
                    escgVar4.b |= 8;
                    ervg ervgVar = (ervg) erqt.q(h3);
                    if (ervgVar != null) {
                        escfVar.copyOnWrite();
                        escg escgVar5 = (escg) escfVar.instance;
                        escgVar5.e = ervgVar;
                        escgVar5.b |= 1;
                    }
                    ertw i = cgzv.this.i();
                    escfVar.copyOnWrite();
                    escg escgVar6 = (escg) escfVar.instance;
                    i.getClass();
                    escgVar6.i = i;
                    escgVar6.b |= 32;
                    return (escg) escfVar.build();
                }
            }, this.j);
        }
        final elfl b3 = ((bzgi) this.ah.b()).b();
        final elfl a5 = ((bzgi) this.ah.b()).a();
        return elfo.m(submit, a2, b3, a5, j, a4, h2, h3).a(new Callable() { // from class: cgzf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                esba esbaVar = (esba) erqt.q(j);
                eyee eyeeVar = (eyee) erqt.q(b3);
                String str = (String) erqt.q(a5);
                esaz esazVar = (esaz) esbaVar.toBuilder();
                esazVar.copyOnWrite();
                ((esba) esazVar.instance).g = true;
                cgzv cgzvVar = cgzv.this;
                String g2 = ((akvz) cgzvVar.D.b()).g();
                esazVar.copyOnWrite();
                esba esbaVar2 = (esba) esazVar.instance;
                g2.getClass();
                esbaVar2.j = g2;
                if (eyeeVar != null) {
                    esazVar.copyOnWrite();
                    ((esba) esazVar.instance).h = eyeeVar;
                }
                elfl elflVar = h3;
                elfl elflVar2 = h2;
                ListenableFuture listenableFuture = a4;
                ListenableFuture listenableFuture2 = a2;
                ListenableFuture listenableFuture3 = submit;
                esazVar.copyOnWrite();
                esba esbaVar3 = (esba) esazVar.instance;
                str.getClass();
                esbaVar3.i = str;
                escf escfVar = (escf) escg.a.createBuilder();
                escfVar.copyOnWrite();
                ((escg) escfVar.instance).k = true;
                String str2 = (String) erqt.q(listenableFuture3);
                escfVar.copyOnWrite();
                escg escgVar = (escg) escfVar.instance;
                str2.getClass();
                escgVar.c = str2;
                escfVar.a((Iterable) erqt.q(listenableFuture2));
                esba esbaVar4 = (esba) esazVar.build();
                escfVar.copyOnWrite();
                escg escgVar2 = (escg) escfVar.instance;
                esbaVar4.getClass();
                escgVar2.f = esbaVar4;
                escgVar2.b |= 2;
                erty ertyVar = (erty) erqt.q(listenableFuture);
                escfVar.copyOnWrite();
                escg escgVar3 = (escg) escfVar.instance;
                ertyVar.getClass();
                escgVar3.h = ertyVar;
                escgVar3.b |= 16;
                erua eruaVar = (erua) erqt.q(elflVar2);
                escfVar.copyOnWrite();
                escg escgVar4 = (escg) escfVar.instance;
                eruaVar.getClass();
                escgVar4.g = eruaVar;
                escgVar4.b |= 8;
                ervg ervgVar = (ervg) erqt.q(elflVar);
                if (ervgVar != null) {
                    escfVar.copyOnWrite();
                    escg escgVar5 = (escg) escfVar.instance;
                    escgVar5.e = ervgVar;
                    escgVar5.b |= 1;
                }
                ertw i = cgzvVar.i();
                escfVar.copyOnWrite();
                escg escgVar6 = (escg) escfVar.instance;
                i.getClass();
                escgVar6.i = i;
                escgVar6.b |= 32;
                return (escg) escfVar.build();
            }
        }, this.j);
    }

    public final elfl d(MessagePartCoreData messagePartCoreData) {
        Uri G = G(messagePartCoreData);
        if (G == null) {
            return elfo.e(null);
        }
        int intValue = ((Integer) J.e()).intValue();
        final AtomicReference atomicReference = new AtomicReference();
        ekmt a2 = ekmq.a(this.i);
        ekms Q = H(G).Q(intValue, intValue);
        cgzi cgziVar = new cgzi(this, atomicReference);
        return elfl.g(erny.f(erqc.o(qsl.b(Q)), new qsf(cgziVar, a2), this.K)).h(new emwl() { // from class: cgzj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cgzv.a;
                return (eyee) atomicReference.get();
            }
        }, this.j).e(Exception.class, new emwl() { // from class: cgzk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgzv.a.s("exception getting thumbnail async", (Exception) obj);
                return null;
            }
        }, this.j);
    }

    public final elfl e(final bcyk bcykVar, final engw engwVar) {
        final elfl d2 = this.X.d(bcykVar.f());
        alzc alzcVar = this.V;
        final elfl f2 = f(bcykVar);
        final elfl d3 = alzcVar.d();
        return elfo.m(d2, f2, d3).a(new Callable() { // from class: cgyy
            /* JADX WARN: Code restructure failed: missing block: B:252:0x0181, code lost:
            
                if (android.text.TextUtils.equals(r6, "EMERGENCY+SERVICE+PROVIDER+DEMO") == false) goto L29;
             */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0620  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0686 A[Catch: all -> 0x0806, TryCatch #0 {all -> 0x0806, blocks: (B:124:0x067b, B:125:0x0680, B:127:0x0686, B:130:0x0696), top: B:123:0x067b }] */
            /* JADX WARN: Removed duplicated region for block: B:138:0x06a7  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x06c5  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x0772  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x0783  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:239:0x0282  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x02b3  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x01de  */
            /* JADX WARN: Removed duplicated region for block: B:245:0x015b  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x01d0  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x02f1  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x035b  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x037a  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x03c9  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0508  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 2065
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgyy.call():java.lang.Object");
            }
        }, this.K);
    }

    public final elfl f(final bcyk bcykVar) {
        elfl g2;
        if (bcykVar.W()) {
            return elfo.e(new cgwo(eruw.RCS, false));
        }
        if (bcykVar.L() == 2) {
            return elfo.e(new cgwo(eruw.RCS, false));
        }
        if (bcykVar.L() == 1) {
            return elfo.e(new cgwo(eruw.XMS, false));
        }
        if (bcykVar.L() != 0) {
            return elfo.e(new cgwo(eruw.XMS, false));
        }
        SelfIdentityId f2 = bcykVar.f();
        if (((atse) this.ai.b()).a()) {
            g2 = ((clws) this.aj.b()).b(f2);
        } else {
            final ckds ckdsVar = this.q;
            ckdsVar.getClass();
            g2 = elfo.g(new Callable() { // from class: cgyv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(ckds.this.I());
                }
            }, this.K);
        }
        return g2.i(new eroh() { // from class: cgzl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(new cgwo(eruw.XMS, false));
                }
                cgzv cgzvVar = cgzv.this;
                if (cgzvVar.q.D()) {
                    return elfo.e(new cgwo(eruw.XMS, false));
                }
                bcyk bcykVar2 = bcykVar;
                Optional p = bcykVar2.p();
                if (!p.isEmpty()) {
                    return cgzvVar.z.c((aoku) p.get()).h(new emwl() { // from class: cgyl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(((azau) obj2).e());
                        }
                    }, cgzvVar.j).h(new emwl() { // from class: cgyq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cskc cskcVar = cgzv.a;
                            return new cgwo(((Boolean) obj2).booleanValue() ? eruw.RCS : eruw.XMS, true);
                        }
                    }, cgzvVar.j);
                }
                csjb e2 = cgzv.a.e();
                e2.I("Other participant normalized destination should not be empty for a 1-1 conversation.");
                e2.A("conversation ID", bcykVar2.Q());
                e2.r();
                return elfo.e(new cgwo(eruw.XMS, false));
            }
        }, this.j);
    }

    public final ListenableFuture g(final MessagePartCoreData messagePartCoreData, cgwn cgwnVar, final Optional optional) {
        csjb a2 = a.a();
        a2.I("Uploading attachment for part with current status (before upload):");
        a2.A("partId", messagePartCoreData.aa());
        a2.B("isBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.Q()));
        a2.B("isBlobExpired", messagePartCoreData.bc());
        a2.z("BlobTimestamp", messagePartCoreData.d());
        a2.B("isCompressedBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.T()));
        a2.B("isCompressedBlobExpired", messagePartCoreData.bf());
        a2.z("compressedBlobTimestamp", messagePartCoreData.e());
        a2.r();
        return cgwnVar != null ? elfr.k(cgwnVar.k(), new eroh() { // from class: cgzm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cgwl) cgzv.this.l.b()).c((fcdu) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get()) : erny.g(((cgwk) this.k.b()).s(), new eroh() { // from class: cgzn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cgwl) cgzv.this.l.b()).c((fcdu) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get());
    }

    public final ListenableFuture h(final MessagePartCoreData messagePartCoreData, cgwn cgwnVar, final Optional optional) {
        return cgwnVar != null ? elfr.k(cgwnVar.k(), new eroh() { // from class: cgzp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cgwl) cgzv.this.l.b()).d((fcdu) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get()) : erny.g(((cgwk) this.k.b()).s(), new eroh() { // from class: cgzq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cgwl) cgzv.this.l.b()).d((fcdu) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get());
    }

    public final ertw i() {
        ertv ertvVar = (ertv) ertw.a.createBuilder();
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).b = true;
        if (((Boolean) ((cfup) bzaq.o.get()).e()).booleanValue()) {
            ertvVar.copyOnWrite();
            ((ertw) ertvVar.instance).i = true;
        }
        if (bzwf.g()) {
            ertvVar.copyOnWrite();
            ((ertw) ertvVar.instance).c = true;
        }
        if (this.x.k()) {
            ertvVar.copyOnWrite();
            ((ertw) ertvVar.instance).d = true;
        }
        if (this.x.r()) {
            ertvVar.copyOnWrite();
            ((ertw) ertvVar.instance).e = true;
        }
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).j = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).o = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).p = true;
        if (((Boolean) cfma.a.e()).booleanValue()) {
            ertvVar.copyOnWrite();
            ((ertw) ertvVar.instance).q = true;
        }
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).m = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).n = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).k = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).l = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).f = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).g = true;
        ertvVar.copyOnWrite();
        ((ertw) ertvVar.instance).h = true;
        return (ertw) ertvVar.build();
    }

    public final eruj j(bcqq bcqqVar, boolean z) {
        erui eruiVar = (erui) eruj.a.createBuilder();
        String l = Long.toString(bcqqVar.b);
        eruiVar.copyOnWrite();
        eruj erujVar = (eruj) eruiVar.instance;
        l.getClass();
        erujVar.c = l;
        String valueOf = String.valueOf(bcqqVar.j);
        eruiVar.copyOnWrite();
        eruj erujVar2 = (eruj) eruiVar.instance;
        valueOf.getClass();
        erujVar2.e = valueOf;
        String str = bcqqVar.f;
        if (str == null) {
            str = "";
        }
        eruiVar.copyOnWrite();
        ((eruj) eruiVar.instance).f = str;
        boolean z2 = bcqqVar.m;
        eruiVar.copyOnWrite();
        ((eruj) eruiVar.instance).h = z2;
        String str2 = bcqqVar.c;
        if (str2 != null) {
            eruiVar.copyOnWrite();
            ((eruj) eruiVar.instance).d = str2;
        }
        if (bcqqVar.g != null) {
            if (z) {
                eruiVar.copyOnWrite();
                ((eruj) eruiVar.instance).k = true;
            } else {
                erxo l2 = l(bcqqVar.f());
                if (l2 != null) {
                    eruiVar.copyOnWrite();
                    eruj erujVar3 = (eruj) eruiVar.instance;
                    erujVar3.i = l2;
                    erujVar3.b = 1 | erujVar3.b;
                }
            }
        }
        String x = x(bcqqVar.f());
        if (x == null && z) {
            ParticipantsTable.BindData t = bdqu.t(bcqqVar.b(bcqqVar.c(0)));
            x = chqb.b(((cttz) this.T.b()).h(t.T() != null ? t.T() : t.R()).a);
        }
        if (x != null) {
            eruiVar.copyOnWrite();
            ((eruj) eruiVar.instance).j = x;
        }
        for (int i = 0; i < bcqqVar.a(); i++) {
            bcqp c2 = bcqqVar.c(i);
            String j = c2.a.j();
            String p = c2.a.p(((Boolean) aolr.a.e()).booleanValue());
            j.getClass();
            p.getClass();
            String b2 = emxe.b(c2.a.G().a);
            eruk erukVar = (eruk) erul.a.createBuilder();
            erukVar.copyOnWrite();
            ((erul) erukVar.instance).c = j;
            erukVar.copyOnWrite();
            ((erul) erukVar.instance).d = p;
            erukVar.copyOnWrite();
            ((erul) erukVar.instance).e = b2;
            int i2 = 2;
            switch (c2.b) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 5;
                    break;
                case 4:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 7;
                    break;
                case 6:
                    i2 = 8;
                    break;
                case 7:
                    i2 = 9;
                    break;
                case 8:
                    i2 = 10;
                    break;
                case 9:
                    i2 = 11;
                    break;
                case 10:
                    i2 = 12;
                    break;
                case 11:
                    i2 = 13;
                    break;
                case 12:
                    i2 = 14;
                    break;
                case 13:
                    i2 = 15;
                    break;
                case 14:
                    i2 = 16;
                    break;
                case 15:
                    i2 = 17;
                    break;
                case 16:
                    i2 = 18;
                    break;
                case 17:
                    i2 = 19;
                    break;
                case 18:
                    i2 = 20;
                    break;
                case 19:
                    i2 = 21;
                    break;
                case 20:
                    i2 = 22;
                    break;
            }
            erukVar.copyOnWrite();
            ((erul) erukVar.instance).b = i2 - 2;
            eruiVar.copyOnWrite();
            eruj erujVar4 = (eruj) eruiVar.instance;
            erul erulVar = (erul) erukVar.build();
            erulVar.getClass();
            eygr eygrVar = erujVar4.g;
            if (!eygrVar.c()) {
                erujVar4.g = eyfy.mutableCopy(eygrVar);
            }
            erujVar4.g.add(erulVar);
        }
        return (eruj) eruiVar.build();
    }

    public final erur k(ConversationIdType conversationIdType) {
        eruo eruoVar = (eruo) erur.a.createBuilder();
        String a2 = conversationIdType.a();
        eruoVar.copyOnWrite();
        erur erurVar = (erur) eruoVar.instance;
        a2.getClass();
        erurVar.c = a2;
        eruv eruvVar = eruv.DELETED;
        eruoVar.copyOnWrite();
        ((erur) eruoVar.instance).k = eruvVar.a();
        return (erur) eruoVar.build();
    }

    public final erxo l(Uri uri) {
        crpr crprVar = this.L;
        Context context = this.i;
        int i = this.ad;
        Bitmap b2 = crprVar.b(context, uri, i, i, 0, false);
        if (b2 == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!b2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            return null;
        }
        eyee x = eyee.x(byteArrayOutputStream.toByteArray());
        erxn erxnVar = (erxn) erxo.a.createBuilder();
        erxnVar.copyOnWrite();
        ((erxo) erxnVar.instance).e = 1;
        erxnVar.copyOnWrite();
        ((erxo) erxnVar.instance).c = "image/png";
        erxnVar.copyOnWrite();
        ((erxo) erxnVar.instance).d = x;
        if (b2.getWidth() >= 0 && b2.getHeight() >= 0) {
            esbp esbpVar = (esbp) esbq.a.createBuilder();
            long width = b2.getWidth();
            esbpVar.copyOnWrite();
            ((esbq) esbpVar.instance).b = width;
            long height = b2.getHeight();
            esbpVar.copyOnWrite();
            ((esbq) esbpVar.instance).c = height;
            erxnVar.copyOnWrite();
            erxo erxoVar = (erxo) erxnVar.instance;
            esbq esbqVar = (esbq) esbpVar.build();
            esbqVar.getClass();
            erxoVar.f = esbqVar;
            erxoVar.b |= 1;
        }
        return (erxo) erxnVar.build();
    }

    public final erzn m(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        erzd erzdVar = (erzd) erzn.a.createBuilder();
        String a2 = conversationIdType.a();
        erzdVar.copyOnWrite();
        erzn erznVar = (erzn) erzdVar.instance;
        a2.getClass();
        erznVar.j = a2;
        String b2 = messageIdType.b();
        erzdVar.copyOnWrite();
        erzn erznVar2 = (erzn) erzdVar.instance;
        b2.getClass();
        erznVar2.c = b2;
        erzw erzwVar = (erzw) erzz.a.createBuilder();
        erzwVar.copyOnWrite();
        ((erzz) erzwVar.instance).c = 300;
        erzdVar.copyOnWrite();
        erzn erznVar3 = (erzn) erzdVar.instance;
        erzz erzzVar = (erzz) erzwVar.build();
        erzzVar.getClass();
        erznVar3.g = erzzVar;
        erznVar3.b |= 4;
        return (erzn) erzdVar.build();
    }

    public final erzn n(bcse bcseVar) {
        return o(bcseVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0719  */
    /* JADX WARN: Type inference failed for: r1v61, types: [bcqn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.erzn o(final defpackage.bcse r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzv.o(bcse, boolean):erzn");
    }

    public final esal p(ParticipantsTable.BindData bindData, boolean z) {
        emxf.b(!bdtd.m(bindData), "Use getParticipantProtoFromSelfIdentity() for building self-identities");
        esam esamVar = (esam) esao.a.createBuilder();
        String S = bindData.S();
        esamVar.copyOnWrite();
        esao esaoVar = (esao) esamVar.instance;
        S.getClass();
        esaoVar.d = S;
        String U = bindData.U();
        if (!TextUtils.isEmpty(U)) {
            int i = true != bdqv.c(bindData) ? 3 : 4;
            esamVar.copyOnWrite();
            ((esao) esamVar.instance).b = esan.a(i);
            esamVar.copyOnWrite();
            esao esaoVar2 = (esao) esamVar.instance;
            U.getClass();
            esaoVar2.c = U;
        }
        int e2 = ((cttz) this.T.b()).e(crjn.a(bindData.U()), false);
        esak esakVar = (esak) esal.a.createBuilder();
        esakVar.copyOnWrite();
        esal esalVar = (esal) esakVar.instance;
        esao esaoVar3 = (esao) esamVar.build();
        esaoVar3.getClass();
        esalVar.c = esaoVar3;
        esalVar.b |= 1;
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).g = false;
        String b2 = chqb.b(e2);
        esakVar.copyOnWrite();
        esal esalVar2 = (esal) esakVar.instance;
        b2.getClass();
        esalVar2.f = b2;
        escu a2 = chqb.a(bindData.r());
        esakVar.copyOnWrite();
        esal esalVar3 = (esal) esakVar.instance;
        a2.getClass();
        esalVar3.h = a2;
        esalVar3.b |= 4;
        int b3 = esad.b(bindData.D().ordinal());
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).n = esad.a(b3);
        if (!TextUtils.isEmpty(bindData.P())) {
            String P = bindData.P();
            esakVar.copyOnWrite();
            esal esalVar4 = (esal) esakVar.instance;
            P.getClass();
            esalVar4.o = P;
        }
        ProfilesTable.BindData bindData2 = !bindData.aE("profiles_table_join_tag") ? null : (ProfilesTable.BindData) bindData.aw("profiles_table_join_tag", ProfilesTable.BindData.class);
        if (bindData2 != null) {
            esax esaxVar = (esax) esay.a.createBuilder();
            if (!TextUtils.isEmpty(bindData2.v())) {
                String v = bindData2.v();
                esaxVar.copyOnWrite();
                esay esayVar = (esay) esaxVar.instance;
                v.getClass();
                esayVar.b = v;
            }
            if (!TextUtils.isEmpty(bindData2.w())) {
                String w = bindData2.w();
                esaxVar.copyOnWrite();
                esay esayVar2 = (esay) esaxVar.instance;
                w.getClass();
                esayVar2.c = w;
            }
            if (!TextUtils.isEmpty(bindData2.x())) {
                String x = bindData2.x();
                esaxVar.copyOnWrite();
                esay esayVar3 = (esay) esaxVar.instance;
                x.getClass();
                esayVar3.d = x;
            }
            esakVar.copyOnWrite();
            esal esalVar5 = (esal) esakVar.instance;
            esay esayVar4 = (esay) esaxVar.build();
            esayVar4.getClass();
            esalVar5.s = esayVar4;
            esalVar5.b |= 8;
        }
        Uri x2 = bindData.x();
        if (!TextUtils.isEmpty(bindData.T())) {
            String T = bindData.T();
            esakVar.copyOnWrite();
            esal esalVar6 = (esal) esakVar.instance;
            T.getClass();
            esalVar6.j = T;
        }
        if (x2 != null) {
            esakVar.copyOnWrite();
            ((esal) esakVar.instance).k = true;
        }
        if (!TextUtils.isEmpty(bindData.Q())) {
            String Q = bindData.Q();
            esakVar.copyOnWrite();
            esal esalVar7 = (esal) esakVar.instance;
            Q.getClass();
            esalVar7.d = Q;
        }
        if (!TextUtils.isEmpty(bindData.R())) {
            String R = bindData.R();
            esakVar.copyOnWrite();
            esal esalVar8 = (esal) esakVar.instance;
            R.getClass();
            esalVar8.e = R;
        }
        boolean ab = bindData.ab();
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).l = ab;
        int n = bindData.n();
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).m = n;
        boolean Y = bindData.Y();
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).p = Y;
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).i = z;
        return (esal) esakVar.build();
    }

    public final escr q(int i, String str, String str2) {
        escq escqVar = (escq) J(i).toBuilder();
        if (str != null) {
            escqVar.copyOnWrite();
            escr escrVar = (escr) escqVar.instance;
            escrVar.b |= 2;
            escrVar.h = str;
        }
        if (str2 != null) {
            escqVar.copyOnWrite();
            escr escrVar2 = (escr) escqVar.instance;
            escrVar2.b |= 4;
            escrVar2.i = str2;
        }
        return (escr) escqVar.build();
    }

    public final escr r(int i, String str) {
        escr J2 = J(i);
        if (str == null) {
            return J2;
        }
        escq escqVar = (escq) J2.toBuilder();
        escqVar.copyOnWrite();
        escr escrVar = (escr) escqVar.instance;
        escrVar.b |= 2;
        escrVar.h = str;
        return (escr) escqVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.escy s(defpackage.alzq r3, int r4, java.lang.String r5, java.lang.String r6, defpackage.esbs r7) {
        /*
            r2 = this;
            java.lang.String r0 = "NetworkUtils#createSubscriptionSettings_dsdrGroupsFlag"
            ekzz r0 = defpackage.eleg.f(r0)
            asmq r1 = r2.E     // Catch: java.lang.Throwable -> Lae
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L22
            cfup r1 = defpackage.cfma.a     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lae
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L1d
            goto L22
        L1d:
            escr r5 = r2.r(r4, r5)     // Catch: java.lang.Throwable -> Lae
            goto L26
        L22:
            escr r5 = r2.q(r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
        L26:
            r0.close()
            escy r6 = defpackage.escy.a
            eyfq r6 = r6.createBuilder()
            escv r6 = (defpackage.escv) r6
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r6.instance
            escy r0 = (defpackage.escy) r0
            r5.getClass()
            r0.c = r5
            int r5 = r0.b
            r5 = r5 | 1
            r0.b = r5
            ffbr r5 = r2.S
            java.lang.Object r5 = r5.b()
            djrv r5 = (defpackage.djrv) r5
            boolean r5 = r5.x(r4)
            if (r5 == 0) goto L84
            escx r5 = defpackage.escx.a
            eyfq r5 = r5.createBuilder()
            escw r5 = (defpackage.escw) r5
            alzn r3 = r3.a()
            alzn r0 = defpackage.alzn.ENABLED
            boolean r3 = r3.equals(r0)
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r5.instance
            escx r0 = (defpackage.escx) r0
            r0.b = r3
            eyfy r3 = r5.build()
            escx r3 = (defpackage.escx) r3
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r6.instance
            escy r5 = (defpackage.escy) r5
            r3.getClass()
            r5.d = r3
            int r3 = r5.b
            r3 = r3 | 2
            r5.b = r3
        L84:
            cpbw r3 = r2.W
            boolean r3 = r3.d(r4)
            r3 = r3 ^ 1
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r6.instance
            escy r4 = (defpackage.escy) r4
            r4.e = r3
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r3 = r6.instance
            escy r3 = (defpackage.escy) r3
            r7.getClass()
            r3.f = r7
            int r4 = r3.b
            r4 = r4 | 4
            r3.b = r4
            eyfy r3 = r6.build()
            escy r3 = (defpackage.escy) r3
            return r3
        Lae:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r4 = move-exception
            r3.addSuppressed(r4)
        Lb7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzv.s(alzq, int, java.lang.String, java.lang.String, esbs):escy");
    }

    public final eyee t(eyee eyeeVar, fcek fcekVar) {
        if (eyeeVar != null && !eyeeVar.H()) {
            bcyo a2 = bcyo.a(fcekVar.c);
            if (a2 == null && (a2 = this.U.d(fcekVar)) != null) {
                bcyo.b(fcekVar.c, a2);
            }
            if (a2 != null && a2.c()) {
                return v(eyeeVar, a2);
            }
            a.p("No Ditto encryption key in database");
        }
        return null;
    }

    public final eyee u(MessagePartCoreData messagePartCoreData) {
        Uri G = G(messagePartCoreData);
        eyee eyeeVar = null;
        if (G == null) {
            return null;
        }
        int intValue = ((Integer) J.e()).intValue();
        ria t = H(G).t(intValue, intValue);
        try {
            try {
                Bitmap bitmap = (Bitmap) dtnq.a(t);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap.compress(this.y, ((Integer) c.e()).intValue(), byteArrayOutputStream)) {
                    eyeeVar = eyee.x(byteArrayOutputStream.toByteArray());
                }
            } finally {
                ekmq.a(this.i).l(t);
            }
        } catch (InterruptedException | ExecutionException e2) {
            a.s("exception getting thumbnail", e2);
        }
        return eyeeVar;
    }

    public final Optional w(eyee eyeeVar, String str, fcek fcekVar) {
        byte[] bArr;
        byte[] bArr2;
        if (eyeeVar == null || eyeeVar.H()) {
            return Optional.of(eyee.b);
        }
        bcyo a2 = bcyo.a(fcekVar.c);
        if (a2 == null && (a2 = this.U.d(fcekVar)) != null) {
            bcyo.b(fcekVar.c, a2);
        }
        if (a2 == null || !a2.c()) {
            csjb c2 = a.c();
            c2.I("No Ditto encryption key in database");
            c2.A("request ID", z(str, fcekVar));
            c2.r();
            return Optional.empty();
        }
        int d2 = eyeeVar.d() - 48;
        byte[] bArr3 = null;
        if (d2 <= 0) {
            bArr = null;
        } else {
            bArr = new byte[d2];
            eyeeVar.G(bArr, 0, 0, d2);
        }
        int d3 = eyeeVar.d() - 48;
        if (d3 <= 0) {
            bArr2 = null;
        } else {
            bArr2 = new byte[16];
            eyeeVar.G(bArr2, d3, 0, 16);
        }
        int d4 = eyeeVar.d();
        if (d4 - 48 > 0) {
            byte[] bArr4 = new byte[32];
            eyeeVar.G(bArr4, d4 - 32, 0, 32);
            bArr3 = bArr4;
        }
        if (bArr == null || bArr2 == null || bArr3 == null) {
            csjb e2 = a.e();
            e2.I("Unable to parse cipher text");
            e2.A("request ID", z(str, fcekVar));
            e2.r();
            return Optional.empty();
        }
        byte[] d5 = bcyo.d(bArr, bArr2);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] bArr5 = a2.e;
            bArr5.getClass();
            mac.init(new SecretKeySpec(bArr5, "HmacSHA256"));
            if (MessageDigest.isEqual(mac.doFinal(d5), bArr3)) {
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                byte[] bArr6 = a2.d;
                bArr6.getClass();
                cipher.init(2, new SecretKeySpec(bArr6, "AES"), new IvParameterSpec(bArr2));
                return Optional.of(eyee.x(cipher.doFinal(bArr)));
            }
            csjb e3 = a.e();
            e3.I("Mismatched signature");
            e3.A("request ID", z(str, fcekVar));
            e3.r();
            return Optional.empty();
        } catch (GeneralSecurityException e4) {
            csjb e5 = a.e();
            e5.I("Failed to decrypt request data");
            e5.A("request ID", z(str, fcekVar));
            e5.s(e4);
            return Optional.empty();
        }
    }

    final String x(Uri uri) {
        String t = crjm.t(uri);
        if (t == null) {
            return null;
        }
        return chqb.b(((cttz) this.T.b()).h(t).a);
    }

    public final String y(String str, String str2, fcek fcekVar) {
        return String.format("[dcrId=%s, tachyonId=%s, browserId=%s]", str, str2, fcekVar.c);
    }

    public final String z(String str, fcek fcekVar) {
        return String.format("[requestId=%s, browserId=%s]", str, fcekVar.c);
    }
}
