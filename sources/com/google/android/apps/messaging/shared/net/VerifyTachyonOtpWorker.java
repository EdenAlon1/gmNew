package com.google.android.apps.messaging.shared.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.chgk;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erqt;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VerifyTachyonOtpWorker extends ppr {
    private final chgk e;
    private final elbx f;

    /* compiled from: PG */
    public interface a {
        elbx b();

        chgk bX();
    }

    public VerifyTachyonOtpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.bX();
        this.f = aVar.b();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        ListenableFuture e;
        ekzm b = this.f.b("VerifyTachyonOtpWorker.startWork");
        try {
            pot f = f();
            chgk chgkVar = this.e;
            final String d = f.d("otpCode");
            if (TextUtils.isEmpty(d)) {
                chgk.a.r("Invalid input data: missing otp.");
                e = erqt.i(new ppn());
            } else {
                String d2 = f.d("msisdn");
                if (TextUtils.isEmpty(d2)) {
                    chgk.a.r("Invalid input data: missing phone number");
                    e = erqt.i(new ppn());
                } else {
                    e = elfl.g(chgkVar.b.b(d2).i(new eroh() { // from class: chgg
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ((chbu) obj).p(d);
                        }
                    }, chgkVar.c).f(Exception.class, new eroh() { // from class: chgh
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            Exception exc = (Exception) obj;
                            chgk.a.o("Failed to verify tachyon registration", exc);
                            throw exc;
                        }
                    }, erpp.a)).h(new emwl() { // from class: chgi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return new ppp();
                        }
                    }, erpp.a).e(Exception.class, new emwl() { // from class: chgj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            chgk.a.o("Failed to verify", (Exception) obj);
                            return new ppn();
                        }
                    }, erpp.a);
                }
            }
            b.close();
            return e;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
