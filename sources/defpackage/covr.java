package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covr {
    public static final cskc a = cskc.g("Bugle", "MmsSender");
    public final cpaw b;
    public final cpbs c;
    public final ctwb d;
    protected final cnjt e;
    public final fazb f;
    public final ky g;
    private final csjk h;
    private final ctvb i;
    private final csrv j;
    private final aslt k;

    public covr(cpaw cpawVar, cpbs cpbsVar, csjk csjkVar, ctvb ctvbVar, ctwb ctwbVar, cnjt cnjtVar, fazb fazbVar, csrv csrvVar, ky kyVar, aslt asltVar) {
        this.b = cpawVar;
        this.c = cpbsVar;
        this.h = csjkVar;
        this.i = ctvbVar;
        this.d = ctwbVar;
        this.e = cnjtVar;
        this.f = fazbVar;
        this.j = csrvVar;
        this.g = kyVar;
        this.k = asltVar;
    }

    public final int a(int i, int i2, int i3) {
        csix.f(i == -1);
        if (!((csmz) this.h.a()).x() && (this.i.E() || this.d.a() <= 0)) {
            return 2;
        }
        if (i == 3) {
            if (!((csmz) this.h.a()).x() || ((csmz) this.h.a()).e(i3) != csod.UNAVAILABLE) {
                return 2;
            }
            i = 3;
        }
        if (i != 3) {
            if (i == 4) {
                if (i2 == 404) {
                    return 3;
                }
                csjb e = a.e();
                e.I("Platform returned HTTP failure, returning message send status AUTO_RETRY");
                e.y("httpStatusCode", i2);
                e.r();
                return 1;
            }
            if (i != 5) {
                return i != 13 ? i != 112 ? 2 : 1 : this.k.a() ? 1 : 2;
            }
        }
        csjb e2 = a.e();
        e2.I("Platform returned transient error, returning message send status AUTO_RETRY");
        e2.y("resultCode", i);
        e2.r();
        return 1;
    }

    protected final Uri b(Context context, lh lhVar, int i) {
        Uri d = cbgk.d(context);
        File e = cbgk.e(context, d);
        if (e == null) {
            a.n("Cannot create temp file");
            throw new covq(1, "Cannot create mms temp file");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(e);
            try {
                File parentFile = e.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                byte[] b = new cgtj(context, lhVar).b();
                if (b == null) {
                    throw new covq(3, "Failed to compose PDU");
                }
                int d2 = this.c.a(i).d();
                int length = b.length;
                if (length <= d2) {
                    fileOutputStream.write(b);
                    fileOutputStream.close();
                    return d;
                }
                csjb b2 = a.b();
                b2.I("pdu size exceeds limit.");
                b2.I("pduBytes:");
                b2.G(length);
                b2.I("limit:");
                b2.G(d2);
                b2.m(i);
                b2.r();
                throw new covq(3);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            e.delete();
            csjb b3 = a.b();
            b3.I("Cannot create temporary file");
            b3.I(e);
            b3.s(e2);
            throw new covq(1, "Cannot create raw mms file");
        } catch (OutOfMemoryError e3) {
            e.delete();
            csjb b4 = a.b();
            b4.I("Out of memory in composing PDU");
            b4.s(e3);
            throw new covq(2);
        }
    }

    public final void c(Context context, int i, String str, String str2, int i2, long j) {
        try {
            cskc cskcVar = a;
            if (cskcVar.t(3)) {
                csjb a2 = cskcVar.a();
                a2.I("Sending M-NotifyResp.ind for received MMS. status: 0X");
                a2.v(Integer.toHexString(i2));
                a2.r();
            }
            if (str2 == null) {
                cskcVar.r("Can't send NotifyResp; contentLocation is null");
                return;
            }
            if (str == null) {
                cskcVar.r("Can't send NotifyResp; transaction id is null");
                return;
            }
            lm lmVar = new lm(str.getBytes(StandardCharsets.UTF_8), i2);
            Uri parse = Uri.parse(str2);
            csjb c = cskcVar.c();
            c.I("sendNotifyResponseForMmsDownload");
            c.m(i);
            c.l(parse);
            c.r();
            if (true != this.c.a(i).s()) {
                str2 = null;
            }
            d(context, i, parse, str2, lmVar, false, null, j);
        } catch (covq | li e) {
            a.o("safeSendNotifyResponseForMmsDownload failed to retrieve message", e);
        }
    }

    public final void d(Context context, int i, Uri uri, String str, lh lhVar, boolean z, Bundle bundle, long j) {
        Uri b = b(context, lhVar, i);
        Intent c = this.e.c(context, uri, b, z, bundle, j);
        if (this.j.m != -2) {
            try {
                PendingIntent.getBroadcast(context, 0, c, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)).send(context, this.j.m, new Intent());
                return;
            } catch (PendingIntent.CanceledException e) {
                a.s("Not able to force MMS send result status", e);
            }
        }
        alsa e2 = ((altk) this.f.b()).e();
        if ((lhVar instanceof lz) && e2 != null) {
            e2.c(1, b);
        }
        ky kyVar = this.g;
        c.putExtra("mms_api", 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, c, ctie.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        csjb c2 = ky.a.c();
        c2.I("sending MMS. ");
        c2.w(j);
        c2.r();
        int a2 = la.a(i);
        SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(a2);
        if (ctid.e) {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, b, str, kyVar.a(a2), broadcast, j);
        } else {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, b, str, kyVar.a(a2), broadcast);
        }
    }
}
