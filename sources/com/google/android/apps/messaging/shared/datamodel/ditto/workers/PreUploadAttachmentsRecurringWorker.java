package com.google.android.apps.messaging.shared.datamodel.ditto.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.ditto.workers.PreUploadAttachmentsRecurringWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bzgd;
import defpackage.bzom;
import defpackage.cfuu;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ppr;
import defpackage.pqc;
import defpackage.pqr;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PreUploadAttachmentsRecurringWorker extends ppr {
    public static final Duration e = Duration.ofHours(8);
    public final Context f;
    private final elbx g;

    /* compiled from: PG */
    public interface a {
        bzom aM();
    }

    /* compiled from: PG */
    public interface b {
        elbx b();

        bzgd bD();

        bzom bE();

        cfuu iy();

        errl p();
    }

    public PreUploadAttachmentsRecurringWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = ((b) ekhw.a(context, b.class)).b();
        this.f = context;
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        if (this.b.c.contains("pre_upload_attachments_recurring_worker")) {
            return elfl.g(((pqc) pqr.a(this.f).a("pre_upload_attachments_recurring_worker")).c).h(new emwl() { // from class: bzoo
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Duration duration = PreUploadAttachmentsRecurringWorker.e;
                    return new ppn();
                }
            }, erpp.a);
        }
        ekzm b2 = this.g.b("PreUploadAttachmentsRecurringWorker.startWork");
        try {
            final b bVar = (b) ekhw.a(this.f, b.class);
            elfl i = bVar.bD().h().h(new emwl() { // from class: bzon
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    if (!optional.isPresent()) {
                        return bVar.bE();
                    }
                    PreUploadAttachmentsRecurringWorker preUploadAttachmentsRecurringWorker = PreUploadAttachmentsRecurringWorker.this;
                    return ((PreUploadAttachmentsRecurringWorker.a) ekhv.a(preUploadAttachmentsRecurringWorker.f, PreUploadAttachmentsRecurringWorker.a.class, (eisx) optional.get())).aM();
                }
            }, erpp.a).i(new eroh() { // from class: bzop
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final bzom bzomVar = (bzom) obj;
                    bzom.a.m("Pre-uploading conversations' attachments...");
                    return !Collection.EL.stream((Set) bzomVar.m.b()).allMatch(new Predicate() { // from class: bzoj
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((bzhr) obj2).b();
                        }
                    }) ? elfo.e(new ppn()) : elfo.h(new erog() { // from class: bzok
                        /* JADX WARN: Code restructure failed: missing block: B:22:0x00fd, code lost:
                        
                            if (((java.lang.Boolean) defpackage.bznu.b.e()).booleanValue() != false) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
                        
                            r10.b.e(r3, true).t();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x010d, code lost:
                        
                            return defpackage.elfo.e(true);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
                        
                            r1 = r10.c;
                            r5 = r10.k;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x011e, code lost:
                        
                            if (((java.lang.Boolean) defpackage.cgcv.a.e()).booleanValue() == false) goto L32;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x0120, code lost:
                        
                            r0 = r10.l;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x013e, code lost:
                        
                            return r1.a(defpackage.bznu.b(r3, null), true, null, r5, r0).h(new defpackage.bzoi(), r10.e);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
                        
                            r0 = j$.util.Optional.empty();
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.erog
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a() {
                            /*
                                Method dump skipped, instructions count: 319
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bzok.a():com.google.common.util.concurrent.ListenableFuture");
                        }
                    }, bzomVar.e).h(new emwl() { // from class: bzol
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            csjb d = bzom.a.d();
                            d.I("Recurring task completed.");
                            d.A("success", (Boolean) obj2);
                            d.r();
                            return new ppp();
                        }
                    }, bzomVar.e);
                }
            }, bVar.p());
            b2.close();
            return i;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
