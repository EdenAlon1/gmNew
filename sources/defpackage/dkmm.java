package defpackage;

import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmm extends dkrd {
    private static final dktn f = new dktn("RcsImsServiceDispatcher");
    private final diod g;

    public dkmm(dkgw dkgwVar, ffbr ffbrVar, dkur dkurVar, diod diodVar, esfv esfvVar) {
        super(dkgwVar, ffbrVar, dkurVar, diodVar, esfvVar);
        this.g = diodVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        if (defpackage.dkut.A(r0, r6) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r13.j("Referred-By") != null) goto L56;
     */
    @Override // defpackage.dkrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.eenk r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkmm.a(eenk):void");
    }

    @Override // defpackage.dkrd
    public final void b(eenk eenkVar) {
        String j;
        if (dizg.E() && (j = eenkVar.j("Accept-Contact")) != null && dizg.E() && j.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg")) {
            i(eenkVar, 488, 24);
            return;
        }
        String h = eenkVar.h();
        if ("application/end-user-confirmation-request+xml".equals(h)) {
            dkiw dkiwVar = (dkiw) this.d.b(dkiw.class);
            if (!dkiwVar.r(eenkVar)) {
                dkiwVar.q(eenkVar);
                return;
            }
            eenh c = eenkVar.c("application/end-user-confirmation-request+xml");
            if (c == null) {
                return;
            }
            InputStream a = c.a();
            dkiv dkivVar = new dkiv();
            try {
                dkivVar.a = dkiu.a(dkiwVar.a.c().mT1 * 64, a);
                dkiwVar.g.put(dkivVar.a.f, dkivVar);
                if (dkivVar.a.e == 2) {
                    try {
                        dkiwVar.p(eenkVar);
                    } catch (dkix e) {
                        dkty.i(e, "Error while sending confirmation request response: %s", e.getMessage());
                    }
                }
                dklz dklzVar = dkiwVar.h;
                if (dklzVar != null) {
                    dkiu dkiuVar = dkivVar.a;
                    Intent intent = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_REQUEST);
                    intent.setFlags(805306368);
                    intent.putExtra(RcsIntents.EXTRA_REQUEST_ID, dkiuVar.f);
                    intent.putExtra(RcsIntents.EXTRA_SUBJECT, dkiuVar.b());
                    intent.putExtra(RcsIntents.EXTRA_TEXT, dkiuVar.c());
                    intent.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, dkiu.d(dkiuVar.a));
                    intent.putExtra(RcsIntents.EXTRA_BUTTON_NEGATIVE, dkiu.d(dkiuVar.b));
                    intent.putExtra(RcsIntents.EXTRA_PIN_REQUIRED, dkiuVar.d);
                    intent.putExtra(RcsIntents.EXTRA_TIMEOUT, dkiuVar.c);
                    dklzVar.a.startActivity(intent);
                    return;
                }
                return;
            } catch (IOException unused) {
                dkty.g("Error while parsing request", new Object[0]);
                return;
            }
        }
        if ("application/end-user-confirmation-ack+xml".equals(h)) {
            dkiw dkiwVar2 = (dkiw) this.d.b(dkiw.class);
            if (!dkiwVar2.r(eenkVar)) {
                dkiwVar2.q(eenkVar);
                return;
            }
            try {
                dkiwVar2.p(eenkVar);
            } catch (Exception e2) {
                dkty.i(e2, "Error while sending confirmation ack response: %s", e2.getMessage());
            }
            eenh c2 = eenkVar.c("application/end-user-confirmation-ack+xml");
            if (c2 != null) {
                try {
                    dkit dkitVar = new dkit(c2.a());
                    dklz dklzVar2 = dkiwVar2.h;
                    if (dklzVar2 != null) {
                        Intent intent2 = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_ACK);
                        intent2.setFlags(805306368);
                        intent2.putExtra(RcsIntents.EXTRA_REQUEST_ID, dkitVar.f);
                        intent2.putExtra(RcsIntents.EXTRA_SUBJECT, dkitVar.b());
                        intent2.putExtra(RcsIntents.EXTRA_TEXT, dkitVar.c());
                        dklzVar2.a.startActivity(intent2);
                        return;
                    }
                    return;
                } catch (IOException unused2) {
                    dkty.g("Error while parsing confirmation ack request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if ("application/end-user-notification-request+xml".equals(h)) {
            dkiw dkiwVar3 = (dkiw) this.d.b(dkiw.class);
            if (!dkiwVar3.r(eenkVar)) {
                dkiwVar3.q(eenkVar);
                return;
            }
            try {
                dkiwVar3.p(eenkVar);
            } catch (Exception e3) {
                dkty.i(e3, "Error while sending notification request response: %s", e3.getMessage());
            }
            eenh c3 = eenkVar.c("application/end-user-notification-request+xml");
            if (c3 != null) {
                try {
                    dkiy a2 = dkiy.a(c3.a());
                    dklz dklzVar3 = dkiwVar3.h;
                    if (dklzVar3 != null) {
                        Intent intent3 = new Intent(RcsIntents.ACTION_END_USER_NOTIFICATION_REQUEST);
                        intent3.setFlags(805306368);
                        intent3.putExtra(RcsIntents.EXTRA_REQUEST_ID, a2.f);
                        intent3.putExtra(RcsIntents.EXTRA_SUBJECT, a2.b());
                        intent3.putExtra(RcsIntents.EXTRA_TEXT, a2.c());
                        intent3.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, dkiy.d(a2.a));
                        dklzVar3.a.startActivity(intent3);
                        return;
                    }
                    return;
                } catch (IOException e4) {
                    dkty.i(e4, "Error while parsing notification request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if (!"application/system-request+xml".equals(h)) {
            dkkq dkkqVar = (dkkq) this.d.b(dkkq.class);
            dkty.l(dkkq.g, "Receive an instant message", new Object[0]);
            if (eenkVar.z().equals("NOTIFY")) {
                dkty.w(6, 3, "Received a pager message", new Object[0]);
            }
            try {
                eenl n = dkkqVar.f.n(eenkVar);
                n.r("P-Preferred-Identity: " + dkkqVar.a.e());
                dkkqVar.q().s(n);
            } catch (eejg e5) {
                dkty.j(e5, dkkq.g, "Can't send 200 OK for MESSAGE: %s", e5.getMessage());
            }
            String j2 = eenkVar.j(fhpi.a);
            if (Objects.isNull(j2)) {
                dkty.h(dkkq.g, "Ignoring message with null content type.", new Object[0]);
                return;
            }
            dkty.d(dkkq.g, "Checking incoming message content type [%s]", j2);
            eeit b = dkut.b(eenkVar, dkkqVar.j);
            b.getClass();
            dkjt dkjtVar = new dkjt(null, Objects.toString(eenkVar.g(), "").getBytes(StandardCharsets.UTF_8), j2);
            dkjtVar.c = b.toString();
            dkkqVar.p.f(dkjtVar);
            return;
        }
        dkiw dkiwVar4 = (dkiw) this.d.b(dkiw.class);
        if (!dkiwVar4.r(eenkVar)) {
            dkiwVar4.q(eenkVar);
            return;
        }
        try {
            dkiwVar4.p(eenkVar);
        } catch (Exception e6) {
            dkty.i(e6, "Error while sending system request response to : %s", e6.getMessage());
        }
        eenh c4 = eenkVar.c("application/system-request+xml");
        if (c4 != null) {
            try {
                dkja a3 = dkja.a(c4.a());
                dklz dklzVar4 = dkiwVar4.h;
                if (dklzVar4 != null) {
                    int i = a3.a;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 != 0) {
                        return;
                    }
                    dklzVar4.b.onReconfigurationRequested();
                }
            } catch (IOException e7) {
                dkty.i(e7, "Error while procesing system request: %s", e7.getMessage());
            }
        }
    }
}
