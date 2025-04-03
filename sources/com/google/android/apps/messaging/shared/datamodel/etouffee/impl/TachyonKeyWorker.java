package com.google.android.apps.messaging.shared.datamodel.etouffee.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bzwd;
import defpackage.cafx;
import defpackage.csjb;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppp;
import defpackage.ppr;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class TachyonKeyWorker extends ppr {
    private final cafx e;
    private final elbx f;

    /* compiled from: PG */
    public interface a {
        elbx b();

        cafx bF();
    }

    public TachyonKeyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.bF();
        this.f = aVar.b();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        elfl e;
        ekzm b = this.f.b("TachyonKeyWorker.startWork");
        try {
            final cafx cafxVar = this.e;
            pot f = f();
            cafx.a.p("Start uploading prekeys in worker helper");
            if (bzwd.a()) {
                final String d = f.d("canonical_number");
                if (TextUtils.isEmpty(d)) {
                    cafx.a.n("Missing RCS phone number");
                    e = elfo.e(new ppn());
                } else {
                    e = cafxVar.d.a(d).i(new eroh() { // from class: cafs
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            if (TextUtils.isEmpty((String) obj)) {
                                throw new fedn(Status.g.withDescription("This device is not registered with Tachyon"));
                            }
                            return cafx.this.b.a(d);
                        }
                    }, cafxVar.f).i(new eroh() { // from class: caft
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            csjb a2 = cafx.a.a();
                            a2.I("Setting prekeys");
                            a2.r();
                            final cafx cafxVar2 = cafx.this;
                            cafn cafnVar = cafxVar2.c;
                            final String str = d;
                            cafm a3 = cafnVar.a(str);
                            return elfl.g(((chep) a3.c.b()).b(new cage((TachyonCommon$PublicPreKeySets) obj, a3.d), cafm.b)).i(new eroh() { // from class: cafp
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    Status status = (Status) obj2;
                                    if (status.f()) {
                                        String str2 = str;
                                        cafx cafxVar3 = cafx.this;
                                        cafx.a.p("Successfully set prekeys");
                                        return ((chbx) cafxVar3.e.b()).d(str2, 8).h(new emwl() { // from class: cafv
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj3) {
                                                return ((chbu) obj3).m();
                                            }
                                        }, cafxVar3.g).i(new eroh() { // from class: cafw
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                return ((chpy) obj3).h(chob.SUFFICIENT_PREKEYS);
                                            }
                                        }, cafxVar3.g);
                                    }
                                    csjb e2 = cafx.a.e();
                                    e2.I("Failed to set prekeys");
                                    e2.A("status", status.toString());
                                    e2.r();
                                    return elfo.d(new IllegalStateException("Failed to set prekeys"));
                                }
                            }, erpp.a).h(new emwl() { // from class: cafq
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return new ppp();
                                }
                            }, erpp.a).e(Throwable.class, new emwl() { // from class: cafr
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return new ppn();
                                }
                            }, erpp.a);
                        }
                    }, cafxVar.f).e(Throwable.class, new emwl() { // from class: cafu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            cafx.a.s("Failed to set prekeys:", (Throwable) obj);
                            return new ppn();
                        }
                    }, erpp.a);
                }
            } else {
                csjb a2 = cafx.a.a();
                a2.I("The task is not enabled.");
                a2.r();
                e = elfo.e(new ppp());
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
