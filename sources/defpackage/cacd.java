package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cacd extends ceut {
    private static final cskc a = cskc.g("BugleEtouffee", "IdentityVerificationPendingMessageWorkItemHandler");
    private final Context b;
    private final cacb c;
    private final cins d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cacd(Context context, cacb cacbVar, cins cinsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = context;
        this.c = cacbVar;
        this.d = cinsVar;
        this.e = ffbrVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar2;
        this.i = ffbrVar5;
    }

    public static String k(String str, awui awuiVar) {
        return awuiVar == null ? str : awuiVar.d;
    }

    private final awui l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aopq().get()).booleanValue()) {
            return ((avkc) this.h.b()).a(str, false);
        }
        return null;
    }

    private final elfl m(final String str, final awui awuiVar, int i, eozj eozjVar) {
        int i2;
        if (eozjVar == eozj.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED) {
            ((akzt) this.f.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED.y);
        }
        bwgr a2 = bwgw.a();
        a2.z("logFailureForPendingMessages");
        a2.d(new Function() { // from class: cacc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwgv bwgvVar = (bwgv) obj;
                bwgvVar.e(cacd.k(str, awuiVar));
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwfp bwfpVar = (bwfp) a2.b().o();
        while (bwfpVar.moveToNext()) {
            try {
                bzzi bzziVar = (bzzi) this.e.b();
                String e = bdhg.e(bwfpVar.c());
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eozh eozhVar = (eozh) eozk.a.createBuilder();
                eozhVar.copyOnWrite();
                eozk eozkVar = (eozk) eozhVar.instance;
                eozkVar.b |= 1;
                eozkVar.c = e;
                eozhVar.copyOnWrite();
                eozk eozkVar2 = (eozk) eozhVar.instance;
                eozkVar2.d = eozjVar.i;
                eozkVar2.b |= 2;
                eozhVar.copyOnWrite();
                eozk eozkVar3 = (eozk) eozhVar.instance;
                eozkVar3.b |= 4;
                eozkVar3.e = i;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eozk eozkVar4 = (eozk) eozhVar.build();
                eozkVar4.getClass();
                eolvVar2.ae = eozkVar4;
                eolvVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                ((akxl) bzziVar.a.b()).j(eoluVar);
                bzzi bzziVar2 = (bzzi) this.e.b();
                bdhg c = bwfpVar.c();
                int ordinal = eozjVar.ordinal();
                if (ordinal == 2) {
                    i2 = 25;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalStateException("Unknown reason");
                    }
                    i2 = 42;
                }
                bzziVar2.c(c, i2);
            } catch (Throwable th) {
                try {
                    bwfpVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bwfpVar.close();
        final awui l = l(k(str, awuiVar));
        final String k = k(str, awuiVar);
        bwgl bwglVar = new bwgl();
        bwglVar.f("IdentityVerificationPendingMessageProcessor#clearQueue");
        bwglVar.a(new Function() { // from class: cabl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwgv bwgvVar = (bwgv) obj;
                bwgvVar.e(cacb.a(awui.this, k));
                bwgvVar.c(byze.WAITING_IDENTITY_VERIFICATION, byze.WAITING_PRIOR_MESSAGE);
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwglVar.d();
        return elfo.e(ceyt.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final elfl n(ceuw ceuwVar, String str, awui awuiVar) {
        cskc cskcVar = a;
        csjb c = cskcVar.c();
        c.I("Starting identity verification worker.");
        String str2 = awuiVar == 0 ? "remoteUserId" : "chatEndpoint";
        String str3 = awuiVar == 0 ? str : awuiVar;
        c.N(str2, str3);
        c.r();
        final int i = ((cetk) ceuwVar.a()).c;
        if (i > ((Integer) bzwd.w.e()).intValue()) {
            csjb e = cskcVar.e();
            e.I("Unable to refresh remote user registration. Dropping all pending messages from that user.");
            e.N(awuiVar != 0 ? "chatEndpoint" : "remoteUserId", str3);
            e.y("runAttemptCount", i);
            e.r();
            return m(str, awuiVar, i, eozj.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        final cacb cacbVar = this.c;
        final awui l = l(k(str, awuiVar));
        final String k = k(str, awuiVar);
        bwgr a2 = bwgw.a();
        a2.z("pendingMessagesExistFor1");
        a2.d(new Function() { // from class: cabv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwgv bwgvVar = (bwgv) obj;
                bwgvVar.e(cacb.a(awui.this, k));
                bwgvVar.c(byze.WAITING_PRIOR_MESSAGE, byze.WAITING_IDENTITY_VERIFICATION);
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return elfl.g(a2.b().C()).i(new eroh() { // from class: cabn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(ceyt.i());
                }
                final int i2 = i;
                final String str4 = k;
                final awui awuiVar2 = l;
                final cacb cacbVar2 = cacb.this;
                return elfo.g(new Callable() { // from class: cabt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bwgr a3 = bwgw.a();
                        a3.z("pendingIdentityVerificationFor");
                        final awui awuiVar3 = awui.this;
                        final String str5 = str4;
                        a3.d(new Function() { // from class: caca
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bwgv bwgvVar = (bwgv) obj2;
                                bwgvVar.e(cacb.a(awui.this, str5));
                                bwgvVar.b(byze.WAITING_IDENTITY_VERIFICATION);
                                return bwgvVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return Optional.ofNullable((bwdu) ((bwfp) a3.b().o()).cQ());
                    }
                }, cacbVar2.c).i(new eroh() { // from class: cabu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Optional optional = (Optional) obj2;
                        if (!optional.isPresent()) {
                            return elfo.e(ceyt.i());
                        }
                        awui awuiVar3 = awuiVar2;
                        cacb cacbVar3 = cacb.this;
                        String o = ((bwdu) optional.get()).o();
                        o.getClass();
                        awui c2 = ((avkc) cacbVar3.k.b()).c(o);
                        if (awuiVar3 == null) {
                            awuiVar3 = ((avkc) cacbVar3.k.b()).a(str4, false);
                        }
                        return cacbVar3.d.a(c2, engw.r(awuiVar3), eozn.RECEIVED_FIRST_ENCRYPTED_MESSAGE).h(new emwl() { // from class: cabq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                ppq ppqVar = (ppq) obj3;
                                return new ppp().equals(ppqVar) ? ceyt.i() : new ppn().equals(ppqVar) ? ceyt.m() : new ppo().equals(ppqVar) ? ceyt.m() : ceyt.k();
                            }
                        }, erpp.a);
                    }
                }, cacbVar2.c).h(new emwl() { // from class: cabr
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ceyt ceytVar = (ceyt) obj2;
                        ensk f = cacb.a.f();
                        f.Y(ente.a, "BugleEtouffee");
                        enrr enrrVar = (enrr) f;
                        ensn ensnVar = csux.E;
                        final String str5 = str4;
                        enrrVar.Y(ensnVar, str5);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 318, "IdentityVerificationPendingMessageProcessor.java")).t("Completed download remote registration id from tachyon. result: %s", ceytVar);
                        boolean e2 = ceytVar.e();
                        final cacb cacbVar3 = cacb.this;
                        if (!e2) {
                            int i3 = i2;
                            ensk j = cacb.a.j();
                            j.Y(ente.a, "BugleEtouffee");
                            enrr enrrVar2 = (enrr) j;
                            enrrVar2.Y(csux.E, str5);
                            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 334, "IdentityVerificationPendingMessageProcessor.java")).q("Refreshing remote registration failed");
                            ((bzzi) cacbVar3.i.b()).a(eozj.TACHYON_DOWNLOAD_FAILED, i3);
                            return ceyt.m();
                        }
                        bwgr a3 = bwgw.a();
                        a3.z("getAllPendingMessages1");
                        boolean z = true;
                        a3.C((String) DesugarArrays.stream(new bwgo[]{new bwgo(bwgw.c.g)}).map(new Function() { // from class: bwgq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bwgo) obj3).a();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        a3.d(new Function() { // from class: cabk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bwgv bwgvVar = (bwgv) obj3;
                                bwgvVar.e(str5);
                                bwgvVar.c(byze.WAITING_PRIOR_MESSAGE, byze.WAITING_IDENTITY_VERIFICATION);
                                return bwgvVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        engw y = a3.b().y();
                        int i4 = ((enou) y).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            bwdu bwduVar = (bwdu) y.get(i5);
                            ensk f2 = cacb.a.f();
                            f2.Y(ente.a, "BugleEtouffee");
                            enrr enrrVar3 = (enrr) f2;
                            enrrVar3.Y(csux.f, bwduVar.k());
                            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 327, "IdentityVerificationPendingMessageProcessor.java")).q("Processing queued message");
                            final bdhg k2 = bwduVar.k();
                            bwgl bwglVar = new bwgl();
                            bwglVar.f("deletePendingMessage");
                            bwglVar.a(new Function() { // from class: cabm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bwgv bwgvVar = (bwgv) obj3;
                                    bwgvVar.d(bdhg.this);
                                    bwgvVar.c(byze.WAITING_PRIOR_MESSAGE, byze.WAITING_IDENTITY_VERIFICATION);
                                    return bwgvVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bwglVar.d();
                            String l2 = bwduVar.l();
                            l2.getClass();
                            ContentType e3 = ContentType.e(l2);
                            awxh awxhVar = (awxh) awxk.b.createBuilder();
                            awuf awufVar = (awuf) awui.a.createBuilder();
                            boolean z2 = z;
                            String n = bwduVar.n();
                            n.getClass();
                            awufVar.copyOnWrite();
                            awui awuiVar3 = (awui) awufVar.instance;
                            engw engwVar = y;
                            awuiVar3.b |= 2;
                            awuiVar3.d = n;
                            awuh awuhVar = awuh.PHONE;
                            awufVar.copyOnWrite();
                            awui awuiVar4 = (awui) awufVar.instance;
                            awuiVar4.c = awuhVar.f;
                            awuiVar4.b |= 1;
                            awxhVar.copyOnWrite();
                            awxk awxkVar = (awxk) awxhVar.instance;
                            awui awuiVar5 = (awui) awufVar.build();
                            awuiVar5.getClass();
                            awxkVar.d = awuiVar5;
                            awxkVar.c |= 1;
                            awuf awufVar2 = (awuf) awui.a.createBuilder();
                            String n2 = bwduVar.n();
                            n2.getClass();
                            awufVar2.copyOnWrite();
                            awui awuiVar6 = (awui) awufVar2.instance;
                            awuiVar6.b |= 2;
                            awuiVar6.d = n2;
                            awuh awuhVar2 = awuh.PHONE;
                            awufVar2.copyOnWrite();
                            awui awuiVar7 = (awui) awufVar2.instance;
                            awuiVar7.c = awuhVar2.f;
                            awuiVar7.b |= 1;
                            awxhVar.copyOnWrite();
                            awxk awxkVar2 = (awxk) awxhVar.instance;
                            awui awuiVar8 = (awui) awufVar2.build();
                            awuiVar8.getClass();
                            awxkVar2.g = awuiVar8;
                            awxkVar2.c |= 8;
                            String str6 = bwduVar.k().b;
                            str6.getClass();
                            awxhVar.copyOnWrite();
                            awxk awxkVar3 = (awxk) awxhVar.instance;
                            awxkVar3.c |= 256;
                            awxkVar3.l = str6;
                            awxhVar.copyOnWrite();
                            awxk awxkVar4 = (awxk) awxhVar.instance;
                            awxkVar4.c |= 512;
                            awxkVar4.m = "Dummy conversation ID for 1:1 E2EE message.";
                            awuk awukVar = (awuk) awul.a.createBuilder();
                            awup awupVar = (awup) cacbVar3.g.m().fP(e3);
                            awukVar.copyOnWrite();
                            awul awulVar = (awul) awukVar.instance;
                            awupVar.getClass();
                            awulVar.c = awupVar;
                            awulVar.b |= 1;
                            String m = bwduVar.m();
                            m.getClass();
                            eyee A = eyee.A(m);
                            awukVar.copyOnWrite();
                            awul awulVar2 = (awul) awukVar.instance;
                            awulVar2.b |= 2;
                            awulVar2.d = A;
                            awxhVar.b(awukVar);
                            bwduVar.az(6, "sent_timestamp");
                            int i6 = i4;
                            eyja d = eykm.d(bwduVar.g);
                            awxhVar.copyOnWrite();
                            awxk awxkVar5 = (awxk) awxhVar.instance;
                            d.getClass();
                            awxkVar5.p = d;
                            awxkVar5.c |= 2048;
                            String o = bwduVar.o();
                            o.getClass();
                            emxf.l(!TextUtils.isEmpty(o));
                            awui a4 = ((avkc) cacbVar3.k.b()).a(o, false);
                            awxhVar.copyOnWrite();
                            awxk awxkVar6 = (awxk) awxhVar.instance;
                            a4.getClass();
                            awxkVar6.j = a4;
                            awxkVar6.c |= 64;
                            bwduVar.az(13, "is_group");
                            if (bwduVar.n) {
                                bwduVar.az(14, "conversation_id");
                                String str7 = bwduVar.o;
                                str7.getClass();
                                awxhVar.copyOnWrite();
                                awxk awxkVar7 = (awxk) awxhVar.instance;
                                awxkVar7.c |= 512;
                                awxkVar7.m = str7;
                                awuf awufVar3 = (awuf) awui.a.createBuilder();
                                bwduVar.az(15, "conference_uri");
                                String str8 = bwduVar.p;
                                str8.getClass();
                                awufVar3.copyOnWrite();
                                awui awuiVar9 = (awui) awufVar3.instance;
                                awuiVar9.b |= 2;
                                awuiVar9.d = str8;
                                awuh awuhVar3 = awuh.GROUP;
                                awufVar3.copyOnWrite();
                                awui awuiVar10 = (awui) awufVar3.instance;
                                awuiVar10.c = awuhVar3.f;
                                awuiVar10.b |= 1;
                                awui awuiVar11 = (awui) awufVar3.build();
                                awxhVar.copyOnWrite();
                                awxk awxkVar8 = (awxk) awxhVar.instance;
                                awuiVar11.getClass();
                                awxkVar8.g = awuiVar11;
                                awxkVar8.c |= 8;
                            }
                            bwduVar.az(12, "custom_headers");
                            fayv fayvVar = bwduVar.m;
                            if (fayvVar != null) {
                                awxhVar.copyOnWrite();
                                awxk awxkVar9 = (awxk) awxhVar.instance;
                                awxkVar9.n = fayvVar;
                                awxkVar9.c |= 1024;
                            }
                            bwduVar.az(16, "is_delivery_report_requested");
                            if (bwduVar.q) {
                                awxhVar.d(awxj.POSITIVE_DELIVERY);
                            }
                            bwduVar.az(17, "is_display_report_requested");
                            if (bwduVar.r) {
                                awxhVar.d(awxj.DISPLAY);
                            }
                            if (((augx) cacbVar3.m.b()).a()) {
                                bwduVar.az(18, "is_negative_delivery_report_requested");
                                if (bwduVar.s) {
                                    awxhVar.d(awxj.NEGATIVE_DELIVERY);
                                }
                            }
                            cacbVar3.l.a((awxk) awxhVar.build()).i(new eroh() { // from class: caby
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    awxk awxkVar10 = (awxk) obj3;
                                    final bdhg a5 = bdhg.a(awxkVar10.l);
                                    final cacb cacbVar4 = cacb.this;
                                    return cacbVar4.f.e(awxkVar10).i(new eroh() { // from class: cabx
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            awud awudVar = (awud) obj4;
                                            awuc awucVar = awuc.OK;
                                            awuc b = awuc.b(awudVar.c);
                                            if (b == null) {
                                                b = awuc.UNKNOWN_STATUS;
                                            }
                                            bdhg bdhgVar = a5;
                                            if (awucVar.equals(b)) {
                                                ensk f3 = cacb.a.f();
                                                f3.Y(ente.a, "BugleEtouffee");
                                                enrr enrrVar4 = (enrr) f3;
                                                enrrVar4.Y(csux.f, bdhgVar);
                                                ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "chatApiHandleMessage", 418, "IdentityVerificationPendingMessageProcessor.java")).q("Restoring pending message to incoming Chat API path.");
                                            } else {
                                                akzt akztVar = (akzt) cacb.this.h.b();
                                                awuc b2 = awuc.b(awudVar.c);
                                                if (b2 == null) {
                                                    b2 = awuc.UNKNOWN_STATUS;
                                                }
                                                akztVar.e("Bugle.Etouffee.FailedToResumeIncomingChatApiMessageThatWasPendingVerification.Status", b2.f);
                                                ensk j2 = cacb.a.j();
                                                j2.Y(ente.a, "BugleEtouffee");
                                                enrr enrrVar5 = (enrr) j2;
                                                enrrVar5.Y(csux.f, bdhgVar);
                                                enrr enrrVar6 = (enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "chatApiHandleMessage", 427, "IdentityVerificationPendingMessageProcessor.java");
                                                awuc b3 = awuc.b(awudVar.c);
                                                if (b3 == null) {
                                                    b3 = awuc.UNKNOWN_STATUS;
                                                }
                                                awua b4 = awua.b(awudVar.d);
                                                if (b4 == null) {
                                                    b4 = awua.UNKNOWN_CAUSE;
                                                }
                                                enrrVar6.u("Failed to restore pending message to incoming Chat API path. error status: %d. error cause: %d", b3.f, b4.v);
                                            }
                                            return elfo.e(null);
                                        }
                                    }, cacbVar4.e);
                                }
                            }, cacbVar3.e).k(axnw.b(), erpp.a);
                            i5++;
                            z = z2;
                            i4 = i6;
                            y = engwVar;
                        }
                        cfva cfvaVar = aoqm.a;
                        if (((Boolean) new aopf().get()).booleanValue()) {
                            cacbVar3.d(cacbVar3.j.b(((avkc) cacbVar3.k.b()).a(str5, false)), str5);
                        } else {
                            cacbVar3.c(str5);
                        }
                        return ceyt.i();
                    }
                }, cacbVar2.b).e(Throwable.class, new emwl() { // from class: cabs
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ensk j = cacb.a.j();
                        j.Y(ente.a, "BugleEtouffee");
                        ((enrr) ((enrr) ((enrr) j).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 362, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages in queue");
                        ((bzzi) cacb.this.i.b()).a(eozj.OTHER_EXCEPTION, i2);
                        return ceyt.m();
                    }
                }, cacbVar2.e);
            }
        }, cacbVar.e).h(new emwl() { // from class: cabo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (ceytVar.e()) {
                    ((bzzi) cacb.this.i.b()).a(eozj.SUCCESS, i);
                }
                return ceytVar;
            }
        }, cacbVar.e).e(Throwable.class, new emwl() { // from class: cabp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = cacb.a.j();
                j.Y(ente.a, "BugleEtouffee");
                ((enrr) ((enrr) ((enrr) j).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "tryProcessPendingMessages", 301, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages pending messages.");
                ((bzzi) cacb.this.i.b()).a(eozj.OTHER_EXCEPTION, i);
                return ceyt.m();
            }
        }, cacbVar.e);
    }

    private final elfl o(ceuw ceuwVar, String str, awui awuiVar, int i) {
        ((cakz) this.g.b()).a(i);
        return n(ceuwVar, str, awuiVar);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.FOREGROUND_SERVICE);
        l.g(60000L);
        poh pohVar = new poh();
        pohVar.c(2);
        ceti cetiVar = (ceti) l;
        cetiVar.a = pohVar.a();
        cetiVar.b = this.d.c(this.b.getString(R.string.identity_verification_notification_text));
        l.f(poa.EXPONENTIAL);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IdentityVerificationPendingMessageWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ezgs.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        ezgs ezgsVar = (ezgs) eyhsVar;
        String str = ezgsVar.c;
        cfva cfvaVar = aoqm.a;
        awui a2 = (!((Boolean) new aopf().get()).booleanValue() || str.isEmpty()) ? null : ((avkc) this.h.b()).a(str, false);
        if (!((Boolean) ((cfup) bzwd.y.get()).e()).booleanValue()) {
            return o(ceuwVar, str, a2, 1);
        }
        if ((ezgsVar.b & 2) == 0) {
            return o(ceuwVar, str, a2, 2);
        }
        ((cakz) this.g.b()).a(3);
        aolm aolmVar = (aolm) this.i.b();
        aora aoraVar = ezgsVar.d;
        if (aoraVar == null) {
            aoraVar = aora.a;
        }
        Optional e = aolmVar.d(aoraVar).e();
        if (e.isPresent()) {
            return n(ceuwVar, ((awui) e.get()).d, ((Boolean) new aopf().get()).booleanValue() ? (awui) e.get() : null);
        }
        return m(str, a2, ((cetk) ceuwVar.a()).c, eozj.SENDERS_USER_ID_EMPTY);
    }
}
