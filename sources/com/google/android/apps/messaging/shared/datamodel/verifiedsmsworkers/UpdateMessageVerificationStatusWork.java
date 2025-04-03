package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.UpdateMessageVerificationStatusWork;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cbxf;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.eldl;
import defpackage.errl;
import defpackage.ppr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class UpdateMessageVerificationStatusWork extends ppr {
    private static final cskc f = cskc.g("Bugle", "UpdateMessageVerificationStatusWork");
    public final cbxf e;
    private final errl g;
    private final elbx h;

    /* compiled from: PG */
    public interface a {
        elbx b();

        cbxf bM();

        errl p();
    }

    public UpdateMessageVerificationStatusWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.bM();
        this.g = aVar.p();
        this.h = aVar.b();
        csjb a2 = f.a();
        a2.I("UpdateMessageVerificationStatusWork created.");
        a2.r();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        ekzm b = this.h.b("UpdateMessageVerificationStatusWork");
        try {
            ListenableFuture submit = this.g.submit(eldl.m(new Callable() { // from class: cbwz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    byzi byziVar;
                    final cbxe a2;
                    long j;
                    UpdateMessageVerificationStatusWork updateMessageVerificationStatusWork = UpdateMessageVerificationStatusWork.this;
                    pot f2 = updateMessageVerificationStatusWork.f();
                    csjb a3 = cbxf.a.a();
                    a3.I("Beginning UpdateMessageVerificationStatusWork work.");
                    a3.r();
                    final cbxf cbxfVar = updateMessageVerificationStatusWork.e;
                    long epochMilli = cbxfVar.h.f().toEpochMilli();
                    long b2 = f2.b("vsms_verification_chain_start_time_key", -1L);
                    String b3 = emxe.b(f2.d("sms_verification_result_key"));
                    byzi byziVar2 = byzi.VERIFICATION_NA;
                    try {
                        byziVar = (byzi) Enum.valueOf(byzi.class, b3);
                    } catch (Exception unused) {
                        csix.c("No verification status found for string value: ".concat(String.valueOf(cskt.b(b3))));
                        byziVar = byzi.VERIFICATION_NA;
                    }
                    int a4 = f2.a("vsms_sub_id", -1);
                    final MessageIdType b4 = bdhb.b(f2.d("vsms_message_id"));
                    final ConversationIdType b5 = bdgq.b(f2.d("vsms_conversation_id"));
                    final String d = f2.d("vsms_participant_id");
                    if (b4.c()) {
                        cbxfVar.b(false, epochMilli);
                        cbxfVar.a(b2, false);
                        cbxf.a.n("Empty message id was given to UpdateMessageVerificationStatusWork");
                    } else if (b5.b()) {
                        cbxfVar.b(false, epochMilli);
                        cbxfVar.a(b2, false);
                        cbxf.a.n("Empty conversation id was given to UpdateMessageVerificationStatusWork");
                    } else {
                        if (!TextUtils.isEmpty(d)) {
                            cbxe a5 = cbxe.d(byziVar).a();
                            aoku u = ((aolr) cbxfVar.m.b()).u(emxe.b(f2.d("vsms_sender_id")), a4);
                            csjb c = cbxf.a.c();
                            c.I("SMS from");
                            c.N("senderIdentity", u);
                            c.d(b4);
                            c.A("verificationStatus", byziVar.name());
                            c.r();
                            if (byziVar == byzi.VERIFICATION_VERIFIED) {
                                try {
                                    if (TextUtils.isEmpty(f2.d("sms_verification_brand_id_key"))) {
                                        aoku u2 = ((aolr) cbxfVar.m.b()).u(emxe.b(f2.d("vsms_sender_id")), f2.a("vsms_sub_id", -1));
                                        csjb a6 = cbxf.a.a();
                                        a6.I("Fetching existing brand for sender");
                                        a6.N("senderIdentity", u2);
                                        a6.r();
                                        cbxd d2 = cbxe.d(byzi.VERIFICATION_VERIFIED);
                                        baam baamVar = cbxfVar.c;
                                        cfva cfvaVar = aoqm.a;
                                        bpyj a7 = baamVar.a(emxe.b(u2.p(((Boolean) new emyl() { // from class: aoqk
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                return Boolean.valueOf(ersy.a("bugle.enable_mi_in_update_message_verification_status_work_helper", "bugle"));
                                            }
                                        }.get()).booleanValue())));
                                        if (a7 == null) {
                                            csjb e = cbxf.a.e();
                                            e.I("Couldn't find verified sender: status has been updated to NA");
                                            e.N("senderIdentity", u2);
                                            e.r();
                                            d2.c(byzi.VERIFICATION_NA);
                                            a2 = d2.a();
                                        } else {
                                            String l = a7.a.l();
                                            if (TextUtils.isEmpty(l)) {
                                                csjb e2 = cbxf.a.e();
                                                e2.I("Couldn't find associated brand for verified sender: status has been updated to NA");
                                                e2.N("senderIdentity", u2);
                                                e2.A("existingBrandId", l);
                                                e2.r();
                                                d2.c(byzi.VERIFICATION_NA);
                                                a2 = d2.a();
                                            } else {
                                                byul byulVar = a7.a;
                                                etds etdsVar = (etds) etdt.a.createBuilder();
                                                String l2 = byulVar.l();
                                                etdsVar.copyOnWrite();
                                                etdt etdtVar = (etdt) etdsVar.instance;
                                                l2.getClass();
                                                etdtVar.b = l2;
                                                String n = byulVar.n();
                                                etdsVar.copyOnWrite();
                                                etdt etdtVar2 = (etdt) etdsVar.instance;
                                                n.getClass();
                                                etdtVar2.c = n;
                                                String m = byulVar.m();
                                                etdsVar.copyOnWrite();
                                                etdt etdtVar3 = (etdt) etdsVar.instance;
                                                m.getClass();
                                                etdtVar3.d = m;
                                                byulVar.az(6, "version_token");
                                                String str = byulVar.g;
                                                etdsVar.copyOnWrite();
                                                etdt etdtVar4 = (etdt) etdsVar.instance;
                                                str.getClass();
                                                etdtVar4.f = str;
                                                byulVar.az(4, "logo_url");
                                                String str2 = byulVar.e;
                                                etdsVar.copyOnWrite();
                                                etdt etdtVar5 = (etdt) etdsVar.instance;
                                                str2.getClass();
                                                etdtVar5.e = str2;
                                                d2.b((etdt) etdsVar.build());
                                                Uri k = a7.a.k();
                                                if (k != null && k.toString().isEmpty()) {
                                                    k = null;
                                                }
                                                ((cbwp) d2).a = k;
                                                a2 = d2.a();
                                            }
                                        }
                                    } else {
                                        aoku u3 = ((aolr) cbxfVar.m.b()).u(emxe.b(f2.d("vsms_sender_id")), f2.a("vsms_sub_id", -1));
                                        String d3 = f2.d("sms_verification_brand_id_key");
                                        csjb a8 = cbxf.a.a();
                                        a8.I("Associating new brand");
                                        a8.N("senderIdentity", u3);
                                        a8.A("brandId", d3);
                                        a8.r();
                                        cbxd d4 = cbxe.d(byzi.VERIFICATION_VERIFIED);
                                        String b6 = emxe.b(f2.d("sms_verification_brand_logo_key"));
                                        etds etdsVar2 = (etds) etdt.a.createBuilder();
                                        String b7 = emxe.b(f2.d("sms_verification_brand_id_key"));
                                        etdsVar2.copyOnWrite();
                                        ((etdt) etdsVar2.instance).b = b7;
                                        String b8 = emxe.b(f2.d("sms_verification_brand_name_key"));
                                        etdsVar2.copyOnWrite();
                                        ((etdt) etdsVar2.instance).c = b8;
                                        String b9 = emxe.b(f2.d("sms_verification_brand_description_key"));
                                        etdsVar2.copyOnWrite();
                                        ((etdt) etdsVar2.instance).d = b9;
                                        String b10 = emxe.b(f2.d("sms_verification_brand_version_key"));
                                        etdsVar2.copyOnWrite();
                                        ((etdt) etdsVar2.instance).f = b10;
                                        String b11 = emxe.b(f2.d("sms_verification_brand_logo_url_key"));
                                        etdsVar2.copyOnWrite();
                                        ((etdt) etdsVar2.instance).e = b11;
                                        final etdt etdtVar6 = (etdt) etdsVar2.build();
                                        cfva cfvaVar2 = aoqm.a;
                                        final String b12 = emxe.b(u3.p(((Boolean) new emyl() { // from class: aoqk
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                return Boolean.valueOf(ersy.a("bugle.enable_mi_in_update_message_verification_status_work_helper", "bugle"));
                                            }
                                        }.get()).booleanValue()));
                                        final baam baamVar2 = cbxfVar.c;
                                        final Uri parse = Uri.parse(b6);
                                        Optional optional = (Optional) baamVar2.b.c("VerifiedSmsEntityManager#associateSenderWithBrand", new emyl() { // from class: baaf
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                Object apply;
                                                baam baamVar3 = baam.this;
                                                String str3 = b12;
                                                bpyj a9 = baamVar3.a(str3);
                                                String l3 = a9 == null ? "" : a9.a.l();
                                                Uri uri = parse;
                                                final etdt etdtVar7 = etdtVar6;
                                                if (TextUtils.isEmpty(l3)) {
                                                    String str4 = etdtVar7.b;
                                                    csjb a10 = baam.a.a();
                                                    a10.I("Associating sender");
                                                    a10.M("senderId", str3);
                                                    a10.I("with brand");
                                                    a10.A("brandId", str4);
                                                    a10.r();
                                                    String[] strArr = byxc.a;
                                                    bywh bywhVar = new bywh();
                                                    bywhVar.c(str3);
                                                    bywhVar.b(str4);
                                                    final bywe a11 = bywhVar.a();
                                                    byxb byxbVar = new byxb();
                                                    byxbVar.b(str3);
                                                    final byxa byxaVar = new byxa(byxbVar);
                                                    final dtve b13 = byxc.b();
                                                    if (!((Boolean) b13.q(new emyl() { // from class: bywd
                                                        @Override // defpackage.emyl
                                                        public final Object get() {
                                                            String[] strArr2 = byxc.a;
                                                            bywz bywzVar = new bywz();
                                                            bywe byweVar = bywe.this;
                                                            byweVar.az(0, "sender_id");
                                                            dtub.u(bywzVar.a, "sender_id", byweVar.a);
                                                            byweVar.az(1, "brand_id");
                                                            dtub.u(bywzVar.a, "brand_id", byweVar.b);
                                                            bywzVar.al();
                                                            bywzVar.af(byxaVar);
                                                            bywzVar.an(new dtui("verified_sms_senders", "-updateOrInsert-update"));
                                                            if (bywzVar.b().e() != 0) {
                                                                return true;
                                                            }
                                                            final dtve dtveVar = b13;
                                                            return Boolean.valueOf(dtub.b(byxc.b(), "verified_sms_senders", byweVar, new Function() { // from class: bywb
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj) {
                                                                    return Long.valueOf(dtve.this.R("verified_sms_senders", (ContentValues) obj));
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            }, new Consumer() { // from class: bywc
                                                                @Override // java.util.function.Consumer
                                                                /* renamed from: accept */
                                                                public final void o(Object obj) {
                                                                }

                                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                                }
                                                            }) != -1);
                                                        }
                                                    })).booleanValue()) {
                                                        csjb b14 = baam.a.b();
                                                        b14.I("Can't update sender's row (missing or unchanged)");
                                                        b14.A("brandId", str4);
                                                        b14.I("with brand");
                                                        b14.M("senderId", str3);
                                                        b14.r();
                                                    }
                                                    csjb e3 = baam.a.e();
                                                    e3.I("Inserting new brand");
                                                    e3.A("brandId", etdtVar7.b);
                                                    e3.r();
                                                    baam.a.m("creating brand insert builder");
                                                    String[] strArr2 = byvy.a;
                                                    byuo byuoVar = new byuo();
                                                    byuoVar.b(etdtVar7.b);
                                                    csjb a12 = baam.a.a();
                                                    a12.A("brand name", etdtVar7.c);
                                                    a12.r();
                                                    byuoVar.g(etdtVar7.c);
                                                    csjb a13 = baam.a.a();
                                                    a13.A("brand description", etdtVar7.d);
                                                    a13.r();
                                                    byuoVar.c(etdtVar7.d);
                                                    csjb a14 = baam.a.a();
                                                    a14.A("brand logo", etdtVar7.g);
                                                    a14.r();
                                                    byuoVar.e(uri);
                                                    csjb a15 = baam.a.a();
                                                    a15.A("brand logo url", etdtVar7.e);
                                                    a15.r();
                                                    byuoVar.f(etdtVar7.e);
                                                    csjb a16 = baam.a.a();
                                                    a16.A("brand version token", etdtVar7.f);
                                                    a16.r();
                                                    byuoVar.h(etdtVar7.f);
                                                    final byul a17 = byuoVar.a();
                                                    final dtve b15 = byvy.b();
                                                    dtub.b(byvy.b(), "verified_sms_brands", a17, new Function() { // from class: byui
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj) {
                                                            return Long.valueOf(dtve.this.T("verified_sms_brands", (ContentValues) obj, 5));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: byuj
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void o(Object obj) {
                                                            Long l4 = (Long) obj;
                                                            if (l4.longValue() >= 0) {
                                                                byul byulVar2 = byul.this;
                                                                byulVar2.a = new byuk(l4).a.longValue();
                                                                byulVar2.fY(0);
                                                            }
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                } else {
                                                    if (!TextUtils.equals(etdtVar7.b, l3)) {
                                                        csjb e4 = baam.a.e();
                                                        e4.I("Can't change brand for");
                                                        e4.M("senderId", str3);
                                                        e4.A("old brand", l3);
                                                        e4.A("new brand", etdtVar7.b);
                                                        e4.r();
                                                        return Optional.of(new baal(String.format(Locale.US, "vSms: brand %s has been unexpectedly replaced with brand %s for sender %s.", l3, etdtVar7.b, cskt.b(str3))));
                                                    }
                                                    csjb a18 = baam.a.a();
                                                    a18.I("Updating brand");
                                                    a18.A("brandId", etdtVar7.b);
                                                    a18.r();
                                                    csjb a19 = baam.a.a();
                                                    a19.I("creating brand update builder");
                                                    a19.A("brand id", etdtVar7.b);
                                                    a19.r();
                                                    String[] strArr3 = byvy.a;
                                                    byvv byvvVar = new byvv();
                                                    byvvVar.ap("createBrandUpdateQuery");
                                                    csjb a20 = baam.a.a();
                                                    a20.A("brand name", etdtVar7.c);
                                                    a20.r();
                                                    dtub.u(byvvVar.a, "name", etdtVar7.c);
                                                    csjb a21 = baam.a.a();
                                                    a21.A("brand description", etdtVar7.d);
                                                    a21.r();
                                                    dtub.u(byvvVar.a, "description", etdtVar7.d);
                                                    csjb a22 = baam.a.a();
                                                    a22.A("brand logo", etdtVar7.g);
                                                    a22.r();
                                                    if (uri == null) {
                                                        byvvVar.a.putNull("logo_uri");
                                                    } else {
                                                        byvvVar.a.put("logo_uri", uri.toString());
                                                    }
                                                    csjb a23 = baam.a.a();
                                                    a23.A("brand logo url", etdtVar7.e);
                                                    a23.r();
                                                    dtub.u(byvvVar.a, "logo_url", etdtVar7.e);
                                                    csjb a24 = baam.a.a();
                                                    a24.A("brand version token", etdtVar7.f);
                                                    a24.r();
                                                    dtub.u(byvvVar.a, "version_token", etdtVar7.f);
                                                    apply = new Function() { // from class: baag
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj) {
                                                            byvx byvxVar = (byvx) obj;
                                                            byvxVar.b(etdt.this.b);
                                                            return byvxVar;
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }.apply(new byvx());
                                                    byvvVar.af(new byvw((byvx) apply));
                                                    if (byvvVar.b().e() != 1) {
                                                        csjb e5 = baam.a.e();
                                                        e5.I("Didn't update brand (no row, or row unchanged)");
                                                        e5.A("brandId", etdtVar7.b);
                                                        e5.r();
                                                    }
                                                }
                                                return Optional.empty();
                                            }
                                        });
                                        if (optional.isPresent()) {
                                            Exception exc = (Exception) optional.get();
                                            if (exc instanceof baal) {
                                                baam.a.n("Brand exception occurrred. ".concat(String.valueOf(exc.getMessage())));
                                                throw ((baal) exc);
                                            }
                                        }
                                        d4.b(etdtVar6);
                                        ((cbwp) d4).a = csuu.j(b6);
                                        a2 = d4.a();
                                    }
                                    j = b2;
                                } catch (baal unused2) {
                                    cfva cfvaVar3 = aoqm.a;
                                    final String b13 = emxe.b(u.p(((Boolean) new emyl() { // from class: aoqk
                                        @Override // defpackage.emyl
                                        public final Object get() {
                                            return Boolean.valueOf(ersy.a("bugle.enable_mi_in_update_message_verification_status_work_helper", "bugle"));
                                        }
                                    }.get()).booleanValue()));
                                    cbxfVar.j.d("cleaunpVerificationData", new Runnable() { // from class: cbxc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            csjb c2 = cbxf.a.c();
                                            c2.I("cleaning up verified sms data");
                                            String str3 = d;
                                            c2.f(str3);
                                            ConversationIdType conversationIdType = b5;
                                            c2.c(conversationIdType);
                                            final String str4 = b13;
                                            c2.A("sender id", str4);
                                            c2.r();
                                            csjb c3 = cbxf.a.c();
                                            c3.I("Cleaning participant");
                                            c3.r();
                                            bvvr f3 = ParticipantsTable.f();
                                            f3.ap("cleanupVerificationData-participants");
                                            bvvw bvvwVar = new bvvw();
                                            bvvwVar.k(str3);
                                            f3.U(bvvwVar);
                                            f3.B(byzi.VERIFICATION_NA);
                                            f3.N();
                                            f3.u();
                                            f3.w();
                                            f3.b().e();
                                            csjb c4 = cbxf.a.c();
                                            c4.I("Cleaning all messages from sender");
                                            c4.r();
                                            String[] strArr = MessagesTable.a;
                                            buxr buxrVar = new buxr();
                                            buxrVar.ap("cleanupVerificationData-messages");
                                            buxz buxzVar = new buxz();
                                            buxzVar.X(str3);
                                            buxrVar.X(buxzVar);
                                            buxrVar.V(byzi.VERIFICATION_NA);
                                            buxrVar.b().e();
                                            csjb c5 = cbxf.a.c();
                                            c5.I("Removing sender from VerifiedSmsSendersTable");
                                            c5.r();
                                            String[] strArr2 = byxc.a;
                                            bywt bywtVar = new bywt();
                                            bywtVar.f("cleanupVerificationData");
                                            bywtVar.a(new Function() { // from class: cbxa
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    byxb byxbVar = (byxb) obj;
                                                    byxbVar.b(str4);
                                                    return byxbVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            bywtVar.d();
                                            csjb c6 = cbxf.a.c();
                                            c6.I("Adding sender to blacklist");
                                            c6.r();
                                            String[] strArr3 = byuf.a;
                                            bytt byttVar = new bytt();
                                            byttVar.b(str4);
                                            bytq a9 = byttVar.a();
                                            final dtve a10 = byuf.a();
                                            dtub.b(byuf.a(), "verified_sms_blacklisted_senders", a9, new Function() { // from class: byto
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return Long.valueOf(dtve.this.T("verified_sms_blacklisted_senders", (ContentValues) obj, 4));
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Consumer() { // from class: bytp
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj) {
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            cbxf cbxfVar2 = cbxf.this;
                                            ((bczy) cbxfVar2.f.b()).R(str3);
                                            ensk h = cbxf.b.h();
                                            h.Y(ente.a, "BugleNotifications");
                                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper", "cleanupVerificationData", 345, "UpdateMessageVerificationStatusWorkHelper.java")).q("Creating notification from UpdateMessageVerificationStatusWorkHelper#cleanupVerificationData");
                                            ((cjbc) cbxfVar2.l.b()).e();
                                            cbxfVar2.i.k(conversationIdType);
                                        }
                                    });
                                    cbxfVar.b(false, epochMilli);
                                    cbxfVar.a(b2, false);
                                    return new ppn();
                                }
                            } else {
                                j = b2;
                                a2 = a5;
                            }
                            byzi byziVar3 = byzi.VERIFICATION_NA;
                            ParticipantsTable.BindData b14 = ParticipantsTable.b(d);
                            if (b14 != null) {
                                byziVar3 = b14.D();
                                csjb c2 = cbxf.a.c();
                                c2.A("latest participant status", byziVar3);
                                c2.r();
                            }
                            byzi byziVar4 = ((cbwq) a2).b;
                            if (byziVar3.a()) {
                                if (byziVar4 == byzi.VERIFICATION_NA) {
                                    byziVar4 = byzi.VERIFICATION_UNVERIFIED;
                                    csjb c3 = cbxf.a.c();
                                    c3.I("Participant is applicable, but verification status was NA. Converting to unverified.");
                                    c3.r();
                                }
                            } else if (byziVar4 == byzi.VERIFICATION_UNVERIFIED) {
                                byziVar4 = byzi.VERIFICATION_NA;
                                csjb c4 = cbxf.a.c();
                                c4.I("Participant is not applicable, converting unverified status to NA");
                                c4.r();
                            }
                            cbxfVar.d.e("Bugle.VerifiedSms.Verification.FinalAdjustedVerificationStatus", byziVar4.ordinal());
                            final byzi byziVar5 = byziVar4;
                            if (((Boolean) cbxfVar.j.c("UpdateMessageVerificationStatusWorkHelper#updateMessageVerificationStatus", new emyl() { // from class: cbxb
                                @Override // defpackage.emyl
                                public final Object get() {
                                    Optional empty;
                                    String[] strArr = MessagesTable.a;
                                    buxr buxrVar = new buxr();
                                    buxrVar.ap("updateMessageVerificationStatus");
                                    byzi byziVar6 = byziVar5;
                                    buxrVar.V(byziVar6);
                                    MessageIdType messageIdType = b4;
                                    boolean e3 = buxrVar.e(messageIdType);
                                    cbxf cbxfVar2 = cbxf.this;
                                    String str3 = d;
                                    final ConversationIdType conversationIdType = b5;
                                    boolean z = false;
                                    if (e3) {
                                        csjb c5 = cbxf.a.c();
                                        c5.I("notifying a message change for conversation");
                                        c5.f(str3);
                                        c5.d(messageIdType);
                                        c5.c(conversationIdType);
                                        c5.r();
                                        cbxfVar2.i.l(conversationIdType, messageIdType, new String[0]);
                                    }
                                    ekzz f3 = eleg.f("MessageDatabaseOperations#getLatestIncomingMessageId");
                                    try {
                                        csix.h();
                                        buxo d5 = MessagesTable.d();
                                        d5.z("getLatestIncomingMessageId");
                                        d5.h(new Function() { // from class: bdme
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                buxz buxzVar = (buxz) obj;
                                                cskc cskcVar = bdmq.a;
                                                buxzVar.m(ConversationIdType.this);
                                                buxzVar.ak(100, 117);
                                                return buxzVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        d5.f(new Function() { // from class: bdmf
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                cskc cskcVar = bdmq.a;
                                                return ((buum) obj).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        buum buumVar = MessagesTable.c;
                                        d5.d(new buxl(buumVar.i, false), new buxl(buumVar.a, false));
                                        d5.x(1);
                                        buuo buuoVar = (buuo) d5.b().o();
                                        try {
                                            if (buuoVar.moveToFirst()) {
                                                empty = Optional.of(buuoVar.q());
                                                buuoVar.close();
                                            } else {
                                                buuoVar.close();
                                                empty = Optional.empty();
                                            }
                                            f3.close();
                                            if (empty.isPresent()) {
                                                Object obj = empty.get();
                                                if (!messageIdType.equals(obj)) {
                                                    csjb c6 = cbxf.a.c();
                                                    c6.I("not updating participant status for vsms: not the last message");
                                                    c6.f(str3);
                                                    c6.d(messageIdType);
                                                    c6.c(conversationIdType);
                                                    c6.A("latestMessageId", obj);
                                                    c6.r();
                                                    return false;
                                                }
                                                cbxe cbxeVar = a2;
                                                csjb c7 = cbxf.a.c();
                                                c7.I("Updating participant for Verified SMS result");
                                                c7.r();
                                                csjb a9 = cbxf.a.a();
                                                a9.A("Participant verification status", byziVar6.name());
                                                a9.r();
                                                bvvr f4 = ParticipantsTable.f();
                                                f4.ap("UpdateMessageVerificationStatusWorkHelper#updateParticipant");
                                                f4.B(byziVar6);
                                                if (byziVar6.a()) {
                                                    f4.M(cbxfVar2.e.c(((cbwq) cbxeVar).c, byziVar6));
                                                }
                                                int ordinal = byziVar6.ordinal();
                                                if (ordinal == 1) {
                                                    String str4 = ((cbwq) cbxeVar).a.c;
                                                    if (!TextUtils.isEmpty(str4)) {
                                                        f4.t(str4);
                                                        f4.v(str4);
                                                    }
                                                } else if (ordinal == 2) {
                                                    f4.u();
                                                    f4.w();
                                                }
                                                z = f4.e(str3);
                                            }
                                            csjb c8 = cbxf.a.c();
                                            c8.B("participant was updated", z);
                                            c8.r();
                                            return Boolean.valueOf(z);
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            f3.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            })).booleanValue()) {
                                csjb a9 = cbxf.a.a();
                                a9.I("notifying participant about message change");
                                a9.f(d);
                                a9.d(b4);
                                a9.c(b5);
                                a9.r();
                                ((bczy) cbxfVar.f.b()).R(d);
                                ensk h = cbxf.b.h();
                                h.Y(ente.a, "BugleNotifications");
                                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper", "updateMessageVerificationStatus", 278, "UpdateMessageVerificationStatusWorkHelper.java")).q("Creating notification from UpdateMessageVerificationStatusWorkHelper#updateMessageVerificationStatus");
                                ((cjbc) cbxfVar.l.b()).c();
                            }
                            cfva cfvaVar4 = aoqm.a;
                            cbxfVar.k.ac(emxe.b(u.p(((Boolean) new emyl() { // from class: aoqk
                                @Override // defpackage.emyl
                                public final Object get() {
                                    return Boolean.valueOf(ersy.a("bugle.enable_mi_in_update_message_verification_status_work_helper", "bugle"));
                                }
                            }.get()).booleanValue())), a4, b4.b(), emxe.b(f2.d("vsms_message_body")), byziVar5);
                            cbxfVar.b(true, epochMilli);
                            cbxfVar.a(j, true);
                            return new ppp();
                        }
                        cbxfVar.b(false, epochMilli);
                        cbxfVar.a(b2, false);
                        cbxf.a.n("Empty participant id was given to UpdateMessageVerificationStatusWork");
                    }
                    return new ppn();
                }
            }));
            b.close();
            return submit;
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
