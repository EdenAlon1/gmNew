package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.android.vcard.VCardEntryCounter;
import com.android.vcard.VCardInterpreter;
import com.android.vcard.VCardSourceDetector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbaa implements cbbn {
    private static final cskc h = cskc.g("Bugle", "VCardRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);
    public final crji a;
    public final cbal b;
    public final cbak c;
    public final ffbr d;
    public final Context e;
    public final List f = new ArrayList();
    public cbaf g;
    private final ffbr j;
    private final cbbo k;
    private final Uri l;

    public cbaa(ffbr ffbrVar, crji crjiVar, cbal cbalVar, cbak cbakVar, ffbr ffbrVar2, Context context, cbbo cbboVar, Uri uri) {
        this.j = ffbrVar;
        this.a = crjiVar;
        this.b = cbalVar;
        this.c = cbakVar;
        this.d = ffbrVar2;
        this.e = context;
        this.k = cbboVar;
        this.l = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:5:0x0016, B:24:0x001f, B:25:0x0022, B:27:0x0026, B:28:0x0031, B:30:0x0035, B:35:0x0048, B:36:0x004f), top: B:4:0x0016, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean g(android.net.Uri r6, int r7, com.android.vcard.VCardInterpreter r8, boolean r9) {
        /*
            r5 = this;
            defpackage.csix.h()
            android.content.Context r0 = r5.e
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = 0
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: defpackage.qnn -> L56 defpackage.qns -> L57 java.io.IOException -> L63
            com.android.vcard.VCardParser_V21 r3 = new com.android.vcard.VCardParser_V21     // Catch: defpackage.qnn -> L56 defpackage.qns -> L57 java.io.IOException -> L63
            r3.<init>(r7)     // Catch: defpackage.qnn -> L56 defpackage.qns -> L57 java.io.IOException -> L63
            r3.addInterpreter(r8)     // Catch: defpackage.qnn -> L56 defpackage.qns -> L57 java.io.IOException -> L63
            r3.parse(r2)     // Catch: defpackage.qnt -> L1f java.lang.Throwable -> L45
            if (r2 == 0) goto L43
        L1b:
            r2.close()     // Catch: java.io.IOException -> L43 defpackage.qnn -> L56 defpackage.qns -> L57
            goto L43
        L1f:
            r2.close()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L45
        L22:
            boolean r3 = r8 instanceof defpackage.cbcg     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L31
            r3 = r8
            cbcg r3 = (defpackage.cbcg) r3     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r3.b = r4     // Catch: java.lang.Throwable -> L45
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L45
            r3.clear()     // Catch: java.lang.Throwable -> L45
        L31:
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: java.lang.Throwable -> L45
            com.android.vcard.VCardParser_V30 r6 = new com.android.vcard.VCardParser_V30     // Catch: java.lang.Throwable -> L45 defpackage.qnt -> L47
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L45 defpackage.qnt -> L47
            r6.addInterpreter(r8)     // Catch: java.lang.Throwable -> L45 defpackage.qnt -> L47
            r6.parse(r2)     // Catch: java.lang.Throwable -> L45 defpackage.qnt -> L47
            if (r2 == 0) goto L43
            goto L1b
        L43:
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L50
        L47:
            r6 = move-exception
            qnn r7 = new qnn     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "vCard with unsupported version."
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L45
            throw r7     // Catch: java.lang.Throwable -> L45
        L50:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L55 defpackage.qnn -> L56 defpackage.qns -> L57
        L55:
            throw r6     // Catch: defpackage.qnn -> L56 defpackage.qns -> L57 java.io.IOException -> L63
        L56:
            return r1
        L57:
            r6 = move-exception
            boolean r7 = r6 instanceof defpackage.qnr
            if (r7 == 0) goto L62
            if (r9 != 0) goto L5f
            goto L62
        L5f:
            qnr r6 = (defpackage.qnr) r6
            throw r6
        L62:
            return r1
        L63:
            r6 = move-exception
            cskc r7 = defpackage.cbaa.h
            java.lang.String r8 = "IOException was emitted."
            r7.o(r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbaa.g(android.net.Uri, int, com.android.vcard.VCardInterpreter, boolean):boolean");
    }

    @Override // defpackage.cbbn
    public final int a() {
        return 0;
    }

    @Override // defpackage.cbbn
    public final int b() {
        return 3;
    }

    @Override // defpackage.cbbn
    public final cbbl c() {
        return ((cbbm) this.j.b()).c(4);
    }

    @Override // defpackage.cbbn
    public final cbbo d() {
        return this.k;
    }

    @Override // defpackage.cbbn
    public final /* bridge */ /* synthetic */ cbcc e(List list) {
        boolean g;
        csix.h();
        csix.i(this.g);
        csix.a(0, this.f.size());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        csix.h();
        VCardInterpreter vCardEntryCounter = new VCardEntryCounter();
        VCardSourceDetector vCardSourceDetector = new VCardSourceDetector();
        Uri uri = this.l;
        try {
            try {
                g = g(uri, 0, vCardSourceDetector, true);
            } catch (qnr e) {
                h.o("Must not reach here.", e);
            }
        } catch (qnr unused) {
            g = g(uri, vCardSourceDetector.getEstimatedType(), vCardEntryCounter, false);
        }
        if (g) {
            csix.h();
            int estimatedType = vCardSourceDetector.getEstimatedType();
            if (estimatedType == 0) {
                estimatedType = VCardConfig.getVCardTypeFromString("default");
            }
            cbcg cbcgVar = new cbcg(estimatedType);
            cbcgVar.c.add(new cazz(this, countDownLatch));
            try {
                if (g(uri, estimatedType, cbcgVar, false)) {
                    countDownLatch.await(i, TimeUnit.MILLISECONDS);
                    cbaf cbafVar = this.g;
                    if (cbafVar != null) {
                        return cbafVar;
                    }
                    throw new qnn("Failure or timeout loading vcard");
                }
            } catch (qnr e2) {
                h.o("Must not reach here.", e2);
            }
        }
        throw new qnn("Invalid vcard");
    }

    @Override // defpackage.cbbn
    public final String f() {
        return this.l.toString();
    }
}
