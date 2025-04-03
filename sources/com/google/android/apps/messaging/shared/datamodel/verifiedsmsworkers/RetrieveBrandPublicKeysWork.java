package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.RetrieveBrandPublicKeysWork;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cbwy;
import defpackage.chhs;
import defpackage.chkk;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.ernq;
import defpackage.erny;
import defpackage.erqc;
import defpackage.erqt;
import defpackage.errl;
import defpackage.etdy;
import defpackage.etdz;
import defpackage.eteb;
import defpackage.etec;
import defpackage.eted;
import defpackage.eteh;
import defpackage.etei;
import defpackage.etfd;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.fdxk;
import defpackage.febp;
import defpackage.febr;
import defpackage.febs;
import defpackage.ffae;
import defpackage.ffag;
import defpackage.ffat;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;
import io.grpc.Status;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class RetrieveBrandPublicKeysWork extends ppr {
    private static final cskc f = cskc.g("Bugle", "RetrieveBrandPublicKeysWork");
    public final cbwy e;
    private final errl g;
    private final chkk h;

    /* compiled from: PG */
    public interface a {
        cbwy bL();

        chkk bZ();

        errl p();
    }

    public RetrieveBrandPublicKeysWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.bL();
        this.g = aVar.p();
        this.h = aVar.bZ();
        csjb a2 = f.a();
        a2.I("RetrieveBrandPublicKeysWork created.");
        a2.r();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        Optional empty;
        cskc cskcVar = f;
        cskcVar.m("Beginning vsms RetrieveBrandPublicKeysWork work");
        pot f2 = f();
        cbwy.a.m("Creating GetPublicKeysRequest from input data");
        String d = f2.d("vsms_retrieve_brand_keys_sender_id_key");
        if (TextUtils.isEmpty(d)) {
            cbwy.a.r("Cannot create vsms GetPublicKeysRequest for empty sender");
            empty = Optional.empty();
        } else {
            int a2 = f2.a("vsms_retrieve_brand_keys_mcc_key", -1);
            int a3 = f2.a("vsms_retrieve_brand_keys_mnc_key", -1);
            if (a2 == -1 || a3 == -1) {
                cbwy.a.r("Cannot create vsms GetPublicKeysRequest for missing mcc/mnc");
                empty = Optional.empty();
            } else {
                etdy etdyVar = (etdy) etdz.a.createBuilder();
                etdyVar.copyOnWrite();
                etdz etdzVar = (etdz) etdyVar.instance;
                d.getClass();
                etdzVar.d = d;
                etec etecVar = (etec) eted.a.createBuilder();
                etecVar.copyOnWrite();
                ((eted) etecVar.instance).b = a2;
                etecVar.copyOnWrite();
                ((eted) etecVar.instance).c = a3;
                etdyVar.copyOnWrite();
                etdz etdzVar2 = (etdz) etdyVar.instance;
                eted etedVar = (eted) etecVar.build();
                etedVar.getClass();
                etdzVar2.e = etedVar;
                etdzVar2.b |= 2;
                etdz etdzVar3 = (etdz) etdyVar.build();
                csjb a4 = cbwy.a.a();
                a4.I("Successfully created vsms GetPublicKeysRequest");
                a4.M("senderId", d);
                a4.y("mcc", a2);
                a4.y("mnc", a3);
                a4.r();
                empty = Optional.of(etdzVar3);
            }
        }
        if (empty.isEmpty()) {
            cskcVar.r("Invalid data for requesting vsms brand keys.");
            return erqt.i(new ppn());
        }
        chkk chkkVar = this.h;
        etdy etdyVar2 = (etdy) ((eyfy) empty.get()).toBuilder();
        etfd a5 = chkk.a();
        etdyVar2.copyOnWrite();
        etdz etdzVar4 = (etdz) etdyVar2.instance;
        a5.getClass();
        etdzVar4.c = a5;
        etdzVar4.b |= 1;
        etdz etdzVar5 = (etdz) etdyVar2.build();
        eteh etehVar = (eteh) chkkVar.a.a().j(((Long) chhs.h.e()).longValue(), TimeUnit.MILLISECONDS);
        fdxk fdxkVar = etehVar.a;
        febs febsVar = etei.a;
        if (febsVar == null) {
            synchronized (etei.class) {
                febsVar = etei.a;
                if (febsVar == null) {
                    febp a6 = febs.a();
                    a6.c = febr.UNARY;
                    a6.d = febs.c("google.communications.verifiedsms.v1.MessageVerificationService", "GetPublicKeys");
                    a6.b();
                    etdz etdzVar6 = etdz.a;
                    eyfc eyfcVar = ffag.a;
                    a6.a = new ffae(etdzVar6);
                    a6.b = new ffae(eteb.a);
                    febsVar = a6.a();
                    etei.a = febsVar;
                }
            }
        }
        return ernq.f(erny.f(erqc.o(elfl.g(ffat.a(fdxkVar.a(febsVar, etehVar.b), etdzVar5))), new emwl() { // from class: cbws
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eteb etebVar = (eteb) obj;
                if (etebVar == null) {
                    cbwy.a.r("GetPublicKeysResponse for vsms sender was null");
                    return new ppp();
                }
                if (etebVar.b.isEmpty()) {
                    cbwy.a.r("No public keys returned for vsms sender");
                    return new ppp();
                }
                csjb c = cbwy.a.c();
                c.I("Brand keys successfully retrieved");
                c.y("key count", etebVar.b.size());
                c.r();
                pon ponVar = new pon();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < etebVar.b.size(); i++) {
                    String h = a.h(i, "vsms_brand_public_key_");
                    arrayList.add(h);
                    ponVar.d(h, ((eyee) etebVar.b.get(i)).I());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                strArr.getClass();
                ponVar.e("vsms_brand_public_keys_name_list", strArr);
                return new ppp(ponVar.a());
            }
        }, this.g), Throwable.class, new emwl() { // from class: cbwt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                RetrieveBrandPublicKeysWork retrieveBrandPublicKeysWork = RetrieveBrandPublicKeysWork.this;
                Throwable th = (Throwable) obj;
                pot f3 = retrieveBrandPublicKeysWork.f();
                if (Status.c(th).getCode() != Status.Code.NOT_FOUND) {
                    cbwy.a.s("Error in retrieving vsms brand keys", th);
                    cbwy.a.p("Marking retrieve brand public keys work as retry.");
                    return new ppo();
                }
                final String d2 = f3.d("vsms_retrieve_brand_keys_sender_id_key");
                csjb e = cbwy.a.e();
                e.I("Brand keys were not found for sender. Sanitizing sender and cancelling dependent work");
                e.M("sender id", d2);
                e.s(th);
                if (!TextUtils.isEmpty(d2)) {
                    cbwy cbwyVar = retrieveBrandPublicKeysWork.e;
                    if (TextUtils.isEmpty(d2)) {
                        cbxr.a.r("Cannot sanitize sender for empty sender id");
                    } else {
                        final cbxr cbxrVar = cbwyVar.b;
                        bpyj a7 = cbxrVar.f.a(d2);
                        if (a7 == null) {
                            cbxr.a.r("Sender ID is not VSMS brand.");
                        } else {
                            final String l = a7.a.l();
                            cbxrVar.c.d("sanitizeVerifiedSmsDataForSender", new Runnable() { // from class: cbxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object apply;
                                    csjb c = cbxr.a.c();
                                    c.I("cleaning up verified sms data");
                                    final String str = d2;
                                    c.M("sender id", str);
                                    c.r();
                                    csjb c2 = cbxr.a.c();
                                    c2.I("Cleaning participant");
                                    c2.r();
                                    cbxr cbxrVar2 = cbxr.this;
                                    final ParticipantsTable.BindData d3 = ((bdrr) cbxrVar2.d.b()).d(str);
                                    if (d3 == null) {
                                        csjb c3 = cbxr.a.c();
                                        c3.I("Attempted to cleanup verified sms data for sender but could not find participant");
                                        c3.A("sender id", str);
                                        c3.r();
                                        return;
                                    }
                                    final String str2 = l;
                                    bvvr f4 = ParticipantsTable.f();
                                    f4.ap("sanitizeVerifiedSmsDataForSender-participants");
                                    f4.V(new Function() { // from class: cbxj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bvvw bvvwVar = (bvvw) obj2;
                                            bvvwVar.k(ParticipantsTable.BindData.this.S());
                                            return bvvwVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    f4.B(byzi.VERIFICATION_NA);
                                    f4.N();
                                    f4.u();
                                    f4.w();
                                    f4.b().e();
                                    csjb c4 = cbxr.a.c();
                                    c4.I("Cleaning all messages from sender");
                                    c4.r();
                                    String[] strArr = MessagesTable.a;
                                    buxr buxrVar = new buxr();
                                    buxrVar.ap("sanitizeVerifiedSmsDataForSender-messages");
                                    buxrVar.Y(new Function() { // from class: cbxk
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            buxz buxzVar = (buxz) obj2;
                                            buxzVar.X(ParticipantsTable.BindData.this.S());
                                            return buxzVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    buxrVar.V(byzi.VERIFICATION_NA);
                                    buxrVar.b().e();
                                    csjb a8 = cbxr.a.a();
                                    a8.I("Cleaning VerifiedSmsSendersTable for Verified SMS for ".concat(String.valueOf(str)));
                                    a8.r();
                                    String[] strArr2 = byxc.a;
                                    bywt bywtVar = new bywt();
                                    bywtVar.f("sanitizeVerifiedSmsDataForSender");
                                    bywtVar.a(new Function() { // from class: cbxl
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            byxb byxbVar = (byxb) obj2;
                                            byxbVar.b(str);
                                            return byxbVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bywtVar.d();
                                    csjb a9 = cbxr.a.a();
                                    a9.I("Cleaning VerifiedSmsBrandsTable for Verified SMS for ".concat(String.valueOf(str2)));
                                    a9.r();
                                    String[] strArr3 = byvy.a;
                                    byvp byvpVar = new byvp();
                                    byvpVar.f("sanitizeVerifiedSmsDataForSender");
                                    apply = new Function() { // from class: cbxm
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            byvx byvxVar = (byvx) obj2;
                                            byvxVar.b(str2);
                                            return byvxVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }.apply(new byvx());
                                    byvpVar.b = new byvw((byvx) apply);
                                    byvpVar.d();
                                    ((bczy) cbxrVar2.e.b()).R(d3.S());
                                }
                            });
                        }
                    }
                }
                return new ppn();
            }
        }, this.g);
    }
}
