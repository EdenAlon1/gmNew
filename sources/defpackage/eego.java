package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eego implements eegk, eegq {
    public final String a;
    public final eefq b;
    public final String c;
    public final List d;
    public final eyss e;
    public final dktn f;
    public final HashMap g = new HashMap();
    public Optional h = Optional.empty();
    public final Set i = enpw.i();
    private final String j;
    private final String k;
    private final eegj l;
    private final SecureRandom m;

    public eego(String str, eefq eefqVar, String str2, String str3, String str4, eegj eegjVar, List list, SecureRandom secureRandom, Optional optional) {
        this.f = new dktn("MsrpSessionImpl[%s]", str);
        this.a = str;
        this.b = eefqVar;
        this.j = str2;
        this.k = str3;
        this.c = str4;
        this.d = list;
        this.m = secureRandom;
        this.l = eegjVar;
        eyss eyssVar = null;
        erls erlsVar = (erls) optional.orElse(null);
        if (erlsVar != null) {
            eysr eysrVar = (eysr) eyss.a.createBuilder();
            String str5 = erlsVar.a;
            eysrVar.copyOnWrite();
            eyss eyssVar2 = (eyss) eysrVar.instance;
            str5.getClass();
            eyssVar2.b |= 1;
            eyssVar2.c = str5;
            emxf.l(erlsVar.c());
            int i = erlsVar.b;
            eysrVar.copyOnWrite();
            eyss eyssVar3 = (eyss) eysrVar.instance;
            eyssVar3.b |= 2;
            eyssVar3.d = i;
            eyssVar = (eyss) eysrVar.build();
        }
        this.e = eyssVar;
    }

    private final String g() {
        byte[] bArr = new byte[8];
        this.m.nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    private final void h(eegc eegcVar) {
        if (this.h.isPresent() && eegcVar.c().equals(((eegh) this.h.get()).a())) {
            this.h = Optional.empty();
        }
    }

    private final void i(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        synchronized (this.b) {
            eefq eefqVar = this.b;
            int arrayOffset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            if (((Boolean) dinr.g.a()).booleanValue() && dizq.o()) {
                eebi eebiVar = new eebi(eefqVar.a());
                eebiVar.write(array, arrayOffset, position);
                eebiVar.flush();
                dkty.d(eefq.a, "Msrp message: %s", new String(eebiVar.a.array(), StandardCharsets.UTF_8));
            } else {
                eefqVar.a().write(array, arrayOffset, position);
                eefqVar.a().flush();
            }
        }
    }

    @Override // defpackage.eegk
    public final void a() {
        dkty.d(this.f, "Starting MSRP media session", new Object[0]);
        eefq eefqVar = this.b;
        eefqVar.e = this;
        synchronized (eefqVar.c) {
            if (eefqVar.b == null) {
                dkty.c("Waiting for connection to be established", new Object[0]);
                long intValue = ((Integer) dizq.c().a.c.a()).intValue() * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                while (eefqVar.b == null) {
                    long currentTimeMillis2 = intValue - (System.currentTimeMillis() - currentTimeMillis);
                    if (currentTimeMillis2 <= 0) {
                        break;
                    } else {
                        try {
                            eefqVar.c.wait(currentTimeMillis2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            InputStream inputStream = eefqVar.b;
            if (inputStream != null) {
                eefqVar.d = new eege(eefqVar.g, eefqVar.e, inputStream);
                eefqVar.d.start();
            }
        }
        if (this.b.c()) {
            dkty.d(this.f, "Sending initial empty request", new Object[0]);
            eegc eegcVar = new eegc();
            eegcVar.e("yes");
            eegcVar.g();
            eegcVar.k = true;
            b(eegcVar);
        }
        dkty.d(this.f, "MSRP media session started", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x011e, IOException -> 0x0120, TryCatch #0 {IOException -> 0x0120, blocks: (B:16:0x0058, B:18:0x005c, B:22:0x0068, B:24:0x0071, B:29:0x0081, B:30:0x0095, B:32:0x009b, B:33:0x00b3, B:35:0x00b9, B:39:0x00c7, B:40:0x00da, B:41:0x00f3, B:43:0x00f9, B:45:0x0103, B:47:0x0109, B:49:0x010f), top: B:15:0x0058, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    @Override // defpackage.eegk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.eegc r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eego.b(eegc):void");
    }

    public final eegg c(eegc eegcVar, boolean z) {
        boolean z2;
        eegg eeggVar;
        eegi eegiVar = new eegi(this.l, eegcVar);
        while (true) {
            eegg eeggVar2 = null;
            while (eegiVar.f) {
                if (eegcVar.m && (eeggVar = eegcVar.n) != null) {
                    return eeggVar;
                }
                ByteBuffer next = eegiVar.next();
                dkty.d(this.f, "Sending chunk for message ID: %s. Transaction ID: %s.", eegcVar.b(), eegcVar.c());
                if (z) {
                    this.h = Optional.of(new eegh(eegcVar));
                    z2 = true;
                } else {
                    z2 = false;
                }
                i(next);
                eegcVar.q = dkvj.a().longValue();
                if (z2) {
                    String c = eegcVar.c();
                    dkty.d(this.f, "Wait transaction (id=%s) response for: %d seconds", c, Integer.valueOf(dizq.a()));
                    if (this.h.isEmpty()) {
                        dkty.h(this.f, "Wait for response but there is no countdown latch for transaction ID: %s", c);
                    } else {
                        try {
                            ((eegh) this.h.get()).await(dizq.a(), TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            dkty.j(e, this.f, "Wait for response has been interrupted for transaction ID: %s, the session has been stopped.", c);
                        }
                        eegg eeggVar3 = ((eegh) this.h.get()).b;
                        if (eeggVar3 == null) {
                            dkty.h(this.f, "No response for transaction id=%s", c);
                        } else {
                            if (eeggVar3.a == 413) {
                                dkty.r(this.f, "Received 413 STOP_SEND response for transaction ID: %s", c);
                                eegcVar.n = eeggVar3;
                                eegcVar.m = true;
                            }
                            eeggVar2 = eeggVar3;
                        }
                    }
                }
            }
            dkty.d(this.f, "Timestamp for %s SENT_CONTENT_OVER_MSRP: %d", eegcVar.h, Long.valueOf(eegcVar.q));
            return z ? eeggVar2 : new eegg(eegcVar.c(), BasePaymentResult.ERROR_REQUEST_FAILED, "OK");
        }
    }

    public final void d(eegc eegcVar) {
        enqv it = ((engw) this.d).iterator();
        while (it.hasNext()) {
            ((eefv) it.next()).aO(this, eegcVar);
        }
    }

    public final void e(eegg eeggVar, eegf eegfVar) {
        dkty.w(20, 3, "Sending MSRP response: %d", Integer.valueOf(eeggVar.a));
        dkty.c("Sending MSRP response: %d, id: %s", Integer.valueOf(eeggVar.a), eeggVar.d);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[4000]);
        eegj.c(wrap, eeggVar.d, String.valueOf(eeggVar.a) + " " + eeggVar.b);
        String f = eeggVar.f();
        if (f == null) {
            throw new IllegalStateException("expected non-null `to`");
        }
        eegj.b(wrap, eefu.i, f.getBytes());
        String d = eeggVar.d();
        if (d == null) {
            throw new IllegalStateException("expected non-null `from`");
        }
        eegj.b(wrap, eefu.j, d.getBytes());
        eegj.a(wrap, eeggVar.d, 36);
        i(wrap);
        enqv it = ((engw) this.d).iterator();
        while (it.hasNext()) {
            ((eefv) it.next()).aR(this, eeggVar, eegfVar);
        }
    }

    public final void f(eegc eegcVar, int i) {
        enqv it = ((engw) this.d).iterator();
        while (it.hasNext()) {
            ((eefv) it.next()).bi(this, eegcVar, i);
        }
    }

    public final String toString() {
        return "MsrpSession for session ID " + this.a + "\r\n To: " + dktx.PHONE_NUMBER.c(this.j) + "\r\n From: " + dktx.PHONE_NUMBER.c(this.k) + "\r\n Connection: " + this.b.toString();
    }
}
