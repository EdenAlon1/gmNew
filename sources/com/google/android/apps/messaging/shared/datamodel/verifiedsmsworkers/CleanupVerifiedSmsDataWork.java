package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cbxr;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.ppr;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CleanupVerifiedSmsDataWork extends ppr {
    private static final cskc e = cskc.g("Bugle", "CleanupVerifiedSmsDataWork");
    private final cbxr f;
    private final elbx g;

    /* compiled from: PG */
    public interface a {
        elbx b();

        cbxr bN();
    }

    public CleanupVerifiedSmsDataWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.f = aVar.bN();
        this.g = aVar.b();
        csjb a2 = e.a();
        a2.I("CleanupVerifiedSmsDataWork created.");
        a2.r();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        csjb a2 = e.a();
        a2.I("Beginning CleanupVerifiedSmsDataWork work.");
        a2.r();
        ekzm b = this.g.b("CleanupVerifiedSmsDataWork");
        try {
            final cbxr cbxrVar = this.f;
            elfl h = elfo.f(new Runnable() { // from class: cbxn
                @Override // java.lang.Runnable
                public final void run() {
                    csjb a3 = cbxr.a.a();
                    a3.I("Cancelling pending Verified SMS work.");
                    a3.r();
                    cbxr cbxrVar2 = cbxr.this;
                    pqr.a(cbxrVar2.b).a("verified_sms_work_manager_tag");
                    pqr.a(cbxrVar2.b).b("verified_sms_request_verified_senders_unique_work_name");
                    pqr.a(cbxrVar2.b).b("verified_sms_key_rotation_unique_work_name");
                    csjb a4 = cbxr.a.a();
                    a4.I("Cleaning ParticipantsTable for Verified SMS.");
                    a4.r();
                    bvvr f = ParticipantsTable.f();
                    f.ap("cancelWorkAndClearVerificationData-participants");
                    f.V(new Function() { // from class: cbxg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar = (bvvw) obj;
                            bvvwVar.p(byzi.VERIFICATION_NA);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    f.B(byzi.VERIFICATION_NA);
                    f.N();
                    f.u();
                    f.w();
                    f.b().e();
                    csjb a5 = cbxr.a.a();
                    a5.I("Cleaning MessagesTable for Verified SMS.");
                    a5.r();
                    String[] strArr = MessagesTable.a;
                    buxr buxrVar = new buxr();
                    buxrVar.ap("cancelWorkAndClearVerificationData-messages");
                    buxrVar.Y(new Function() { // from class: cbxi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            byzi byziVar = byzi.VERIFICATION_NA;
                            int intValue = MessagesTable.g().intValue();
                            if (intValue < 29090) {
                                dtub.w(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, intValue);
                            }
                            buxzVar.aq(new dtwe("messages.verification_status", 7, Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal())));
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    buxrVar.V(byzi.VERIFICATION_NA);
                    buxrVar.ak();
                    buxrVar.b().e();
                    csjb a6 = cbxr.a.a();
                    a6.I("Cleaning VerifiedSmsSendersTable for Verified SMS.");
                    a6.r();
                    String[] strArr2 = byxc.a;
                    bywt bywtVar = new bywt();
                    bywtVar.e();
                    bywtVar.f("cancelWorkAndClearVerificationData#verifiedsmssends#delete");
                    bywtVar.d();
                    csjb a7 = cbxr.a.a();
                    a7.I("Cleaning VerifiedSmsBrandsTable for Verified SMS.");
                    a7.r();
                    String[] strArr3 = byvy.a;
                    byvp byvpVar = new byvp();
                    byvpVar.e();
                    byvpVar.f("cancelWorkAndClearVerificationData#verifiedsmsbrands#delete");
                    byvpVar.d();
                    ((bczy) cbxrVar2.e.b()).O();
                    cbxrVar2.i.b();
                    cbxrVar2.i.a();
                    cbxrVar2.i.c();
                    cbxrVar2.h.d(false);
                    csjb c = cbxr.a.c();
                    c.I("Verified SMS data cleaned up");
                    c.r();
                }
            }, cbxrVar.j).i(new eroh() { // from class: cbxo
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cbxr.this.g.g(-1L);
                }
            }, erpp.a).h(new emwl() { // from class: cbwr
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return new ppp();
                }
            }, erpp.a);
            b.close();
            return h;
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
