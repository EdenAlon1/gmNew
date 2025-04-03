package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.alwb;
import defpackage.aoku;
import defpackage.aolr;
import defpackage.aoor;
import defpackage.aoqm;
import defpackage.avkl;
import defpackage.avkm;
import defpackage.awah;
import defpackage.awui;
import defpackage.awwf;
import defpackage.axnw;
import defpackage.axol;
import defpackage.ayfi;
import defpackage.ayhv;
import defpackage.bawr;
import defpackage.baze;
import defpackage.bbbk;
import defpackage.bbbp;
import defpackage.bbcg;
import defpackage.bbge;
import defpackage.bdhg;
import defpackage.bseh;
import defpackage.bskr;
import defpackage.bsob;
import defpackage.bsol;
import defpackage.bsom;
import defpackage.cbek;
import defpackage.cfva;
import defpackage.cgte;
import defpackage.cjja;
import defpackage.ckaw;
import defpackage.ckbw;
import defpackage.ckbx;
import defpackage.ckdp;
import defpackage.ckju;
import defpackage.ckjy;
import defpackage.ckjz;
import defpackage.covh;
import defpackage.covs;
import defpackage.covx;
import defpackage.coxg;
import defpackage.coxk;
import defpackage.cpxu;
import defpackage.cpxv;
import defpackage.cqoh;
import defpackage.cqos;
import defpackage.crbb;
import defpackage.crbh;
import defpackage.crbv;
import defpackage.crga;
import defpackage.crme;
import defpackage.csrv;
import defpackage.csux;
import defpackage.ctwb;
import defpackage.djrv;
import defpackage.dtnq;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emxe;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.emys;
import defpackage.endq;
import defpackage.engr;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.eopp;
import defpackage.epby;
import defpackage.epxw;
import defpackage.epyb;
import defpackage.eqww;
import defpackage.eqxh;
import defpackage.eqxi;
import defpackage.eqxj;
import defpackage.eqxk;
import defpackage.eroh;
import defpackage.errl;
import defpackage.eykm;
import defpackage.ffbr;
import defpackage.fgjz;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SendMessageAction extends Action<Void> implements Parcelable, baze {
    private final ffbr A;
    private final errl B;
    private final emyl C;
    private final ffbr D;
    private final emyl E;
    private final emyl F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbr Q;
    private final ffbr R;
    private final ffbr S;
    private final ffbr T;
    private final emyl U;
    private final ffbr V;
    private final ffbr W;
    private final ffbr X;
    private final ffbr Y;
    private final ffbr Z;
    public final emyl a;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final ffbr ad;
    private final ffbr ae;
    private final ffbr af;
    private final ffbr ag;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final Context f;
    private final ffbr g;
    private final emyl h;
    private final ffbr i;
    private final ffbr j;
    private final cqoh k;
    private final ffbr l;
    private final ffbr m;
    private final emyl n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr y;
    private final ffbr z;
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bawr();

    /* compiled from: PG */
    public interface a {
        bbge bs();
    }

    public SendMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, final ffbr ffbrVar4, final ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cqoh cqohVar, ffbr ffbrVar8, ffbr ffbrVar9, final ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, errl errlVar, final ffbr ffbrVar16, ffbr ffbrVar17, final ffbr ffbrVar18, final ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, final ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, ffbr ffbrVar47, ffbr ffbrVar48) {
        super(eogt.SEND_MESSAGE_ACTION);
        this.f = context;
        this.g = ffbrVar;
        this.o = ffbrVar2;
        this.h = emys.a(new emyl() { // from class: bawl
            @Override // defpackage.emyl
            public final Object get() {
                return (bdtd) ffbr.this.b();
            }
        });
        this.a = emys.a(new emyl() { // from class: bawm
            @Override // defpackage.emyl
            public final Object get() {
                return (baxz) ffbr.this.b();
            }
        });
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = cqohVar;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
        this.n = emys.a(new emyl() { // from class: bawn
            @Override // defpackage.emyl
            public final Object get() {
                return (ctwb) ffbr.this.b();
            }
        });
        this.p = ffbrVar11;
        this.q = ffbrVar12;
        this.y = ffbrVar13;
        this.z = ffbrVar14;
        this.A = ffbrVar15;
        this.B = errlVar;
        this.C = emys.a(new emyl() { // from class: bawo
            @Override // defpackage.emyl
            public final Object get() {
                return (bzqa) ffbr.this.b();
            }
        });
        this.D = ffbrVar17;
        this.E = emys.a(new emyl() { // from class: bawp
            @Override // defpackage.emyl
            public final Object get() {
                return (crbb) ffbr.this.b();
            }
        });
        this.F = emys.a(new emyl() { // from class: bawa
            @Override // defpackage.emyl
            public final Object get() {
                return (cqos) ffbr.this.b();
            }
        });
        this.G = ffbrVar20;
        this.H = ffbrVar21;
        this.I = ffbrVar22;
        this.J = ffbrVar3;
        this.K = ffbrVar23;
        this.L = ffbrVar24;
        this.b = ffbrVar25;
        this.M = ffbrVar26;
        this.N = ffbrVar27;
        this.O = ffbrVar28;
        this.P = ffbrVar29;
        this.Q = ffbrVar30;
        this.R = ffbrVar31;
        this.S = ffbrVar32;
        this.T = ffbrVar33;
        this.U = emys.a(new emyl() { // from class: bawb
            @Override // defpackage.emyl
            public final Object get() {
                return (alwb) ffbr.this.b();
            }
        });
        this.V = ffbrVar37;
        this.W = ffbrVar36;
        this.X = ffbrVar35;
        this.c = ffbrVar38;
        this.d = ffbrVar39;
        this.Y = ffbrVar40;
        this.Z = ffbrVar41;
        this.aa = ffbrVar42;
        this.ab = ffbrVar43;
        this.ac = ffbrVar44;
        this.ad = ffbrVar45;
        this.ae = ffbrVar46;
        this.af = ffbrVar47;
        this.ag = ffbrVar48;
    }

    private final ckbx H(MessageCoreData messageCoreData, Uri uri, engw engwVar, bbbp bbbpVar) {
        ((crga) this.N.b()).c(messageCoreData);
        try {
            crbv a2 = ((crbb) this.E.get()).a(messageCoreData, engwVar);
            if (messageCoreData == null) {
                throw new NullPointerException("Null messageCoreData");
            }
            crbh crbhVar = new crbh(messageCoreData, a2);
            O(bbbpVar, fgjz.BUGLE_SENDING_INTERNAL_STATUS_PASSING_TO_FILE_TRANSFER);
            try {
                ckbx ckbxVar = (ckbx) dtnq.a(((cqos) this.F.get()).b().c(crbhVar));
                if (ckbxVar.c() != 0 && ckbxVar.c() != -1) {
                    epxw epxwVar = (epxw) epyb.a.createBuilder();
                    epxwVar.copyOnWrite();
                    epyb epybVar = (epyb) epxwVar.instance;
                    epybVar.e = 0;
                    epybVar.b |= 1;
                    ((crga) this.N.b()).a(messageCoreData, (epyb) epxwVar.build(), Optional.empty());
                }
                return ckbxVar;
            } catch (InterruptedException | ExecutionException e2) {
                ensk i = e.i();
                i.Y(ente.a, "BugleDataModel");
                enrr enrrVar = (enrr) i;
                enrrVar.Y(csux.f, messageCoreData.E());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1528, "SendMessageAction.java")).q("Cannot start RCS FT, failed to get active transport.");
                epxw epxwVar2 = (epxw) epyb.a.createBuilder();
                epxwVar2.copyOnWrite();
                epyb epybVar2 = (epyb) epxwVar2.instance;
                epybVar2.e = 16;
                epybVar2.b |= 1;
                ((crga) this.N.b()).a(messageCoreData, (epyb) epxwVar2.build(), Optional.empty());
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IllegalStateException("Failed to get active transport.", e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            ensk i2 = e.i();
            i2.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) i2;
            enrrVar2.Y(csux.f, messageCoreData.E());
            ((enrr) ((enrr) enrrVar2.g(e3)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1477, "SendMessageAction.java")).q("Unable to prepare file for uploading to content server.");
            epxw epxwVar3 = (epxw) epyb.a.createBuilder();
            epxwVar3.copyOnWrite();
            epyb epybVar3 = (epyb) epxwVar3.instance;
            epybVar3.e = 15;
            epybVar3.b |= 1;
            int i3 = true != (e3 instanceof IllegalArgumentException) ? 3 : 2;
            epxwVar3.copyOnWrite();
            epyb epybVar4 = (epyb) epxwVar3.instance;
            epybVar4.d = Integer.valueOf(i3 - 1);
            epybVar4.c = 8;
            ((crga) this.N.b()).a(messageCoreData, (epyb) epxwVar3.build(), Optional.empty());
            ckbw j = ckbx.j(3, 10001);
            ckaw ckawVar = (ckaw) j;
            ckawVar.c = uri;
            j.b(1);
            eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
            eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
            eqxjVar.copyOnWrite();
            eqxk eqxkVar = (eqxk) eqxjVar.instance;
            eqxkVar.e = 1;
            eqxkVar.b |= 4;
            eqww eqwwVar = eqww.CHAT_API_UPLOAD_START_FAILED;
            eqxjVar.copyOnWrite();
            eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
            eqxkVar2.f = eqwwVar.C;
            eqxkVar2.b = 8 | eqxkVar2.b;
            eqxk eqxkVar3 = (eqxk) eqxjVar.build();
            eqxhVar.copyOnWrite();
            eqxi eqxiVar = (eqxi) eqxhVar.instance;
            eqxkVar3.getClass();
            eqxiVar.c = eqxkVar3;
            eqxiVar.b |= 1;
            ckawVar.d = (eqxi) eqxhVar.build();
            return j.a();
        }
    }

    private final ckbx I(MessageCoreData messageCoreData) {
        try {
            awah awahVar = (awah) this.aa.b();
            messageCoreData.getClass();
            return ckbx.i;
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException("Error during starting message processing.", e2);
        }
    }

    private static engw J(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: bawk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Void>> creator = SendMessageAction.CREATOR;
                cfva cfvaVar = aoqm.a;
                return emxe.b(((aoku) obj).k(((Boolean) new aoor().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    private final Optional K(Uri uri, int i) {
        if (((csrv) this.z.b()).p) {
            ensk j = e.j();
            j.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1184, "SendMessageAction.java")).q("Emulate RCS send failure for debugging");
            return Optional.of(ckdp.b(true, uri));
        }
        if (((csrv) this.z.b()).q) {
            ensk j2 = e.j();
            j2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1190, "SendMessageAction.java")).q("Emulate RCS send permanent failure for debugging");
            return Optional.of(ckdp.b(false, uri));
        }
        int a2 = ((ctwb) this.n.get()).h(i).a();
        if (((djrv) this.o.b()).x(a2)) {
            return Optional.empty();
        }
        ensk i2 = e.i();
        i2.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) i2;
        enrrVar.Y(csux.t, Integer.valueOf(a2));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1200, "SendMessageAction.java")).q("Cannot send RCS on non-RCS.");
        ckbw j3 = ckbx.j(2, 10002);
        ckaw ckawVar = (ckaw) j3;
        ckawVar.c = uri;
        j3.b(4);
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.e = 1;
        eqxkVar.b = 4 | eqxkVar.b;
        eqww eqwwVar = eqww.CHAT_API_NO_RCS_SUBSCRIPTION;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.f = eqwwVar.C;
        eqxkVar2.b |= 8;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        ckawVar.d = (eqxi) eqxhVar.build();
        return Optional.of(j3.a());
    }

    private final Optional L(boolean z, ConversationIdType conversationIdType, List list) {
        if (list.isEmpty()) {
            ensk j = e.j();
            j.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.p, conversationIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRecipientsDescriptor", 1431, "SendMessageAction.java")).q("No messaging identities in conversation");
            return Optional.empty();
        }
        if (z) {
            avkm avkmVar = (avkm) this.K.b();
            return Optional.of(avkmVar.b(avkmVar.a.b(conversationIdType), list));
        }
        Optional e2 = ((aoku) list.get(0)).e();
        if (!e2.isEmpty()) {
            return Optional.of(new avkl((awui) e2.get()));
        }
        ensk j2 = e.j();
        j2.Y(ente.a, "BugleDataModel");
        enrr enrrVar2 = (enrr) j2;
        enrrVar2.Y(csux.p, conversationIdType);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRecipientsDescriptor", 1451, "SendMessageAction.java")).q("RCS messaging identity missing in one to one conversation");
        return Optional.empty();
    }

    private static String M(ConversationIdType conversationIdType) {
        bsob e2 = bsom.e();
        e2.z("getRcsConferenceUriForConversation");
        e2.c(bsom.c.ab);
        bsol bsolVar = new bsol();
        bsolVar.q(conversationIdType);
        e2.h(bsolVar);
        return ((bseh) ((bskr) e2.b().o()).cT()).ac();
    }

    private final void N(final MessageCoreData messageCoreData, elfl elflVar) {
        ekzz f = eleg.f("SendMessageAction::saveForEarlySend");
        try {
            ensk h = e.h();
            h.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "saveForEarlySend", 1744, "SendMessageAction.java")).q("Starting save for early send");
            if (elflVar == null) {
                elflVar = elfo.e(null);
            }
            elfl i = elflVar.i(new eroh() { // from class: bawi
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final SendMessageAction sendMessageAction = SendMessageAction.this;
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    return kfg.a(new kfd() { // from class: bawh
                        @Override // defpackage.kfd
                        public final Object a(kfb kfbVar) {
                            SendMessageAction sendMessageAction2 = SendMessageAction.this;
                            bahp bahpVar = (bahp) sendMessageAction2.d.b();
                            DeviceData deviceData = (DeviceData) sendMessageAction2.t.h("secondary_device");
                            MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) sendMessageAction2.t.h("message_usage_stats_data");
                            eooi b = eooi.b(sendMessageAction2.t.a("message_source"));
                            bbcg bbcgVar = sendMessageAction2.t;
                            bahpVar.d(new bagm(sendMessageAction2, messageCoreData2, deviceData, messageUsageStatisticsData, b, bbcgVar.d("sent_realtime"), bbcgVar.b("sub_id", -1), bbcgVar.b("locked_default_sms_sub_id", -1), bbcgVar.z("update_draft", true), bbcgVar.l("archive"), bbcgVar.z("should_refresh_notification", false), bbcgVar.y("from_notification"), bbcgVar.y("is_rbm_conversation"), bbcgVar.y("is_early_send"), bbcgVar.y("ui_has_been_notified"), new bawc(kfbVar)));
                            return "Start save future";
                        }
                    });
                }
            }, this.B);
            axnw.h(i);
            covh covhVar = (covh) this.Y.b();
            bdhg E = messageCoreData.E();
            E.getClass();
            covhVar.a.put(E, axol.e(i));
            axnw.h(i.h(new emwl() { // from class: bawj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Void r3 = (Void) obj;
                    ((cmlm) SendMessageAction.this.c.b()).e(messageCoreData);
                    return r3;
                }
            }, this.B));
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void O(bbbp bbbpVar, fgjz fgjzVar) {
        bbbk bbbkVar = (bbbk) bbbpVar;
        bbbkVar.c = fgjzVar;
        bbbkVar.d = eykm.d(this.k.f().toEpochMilli());
    }

    private static boolean P(MessageCoreData messageCoreData) {
        return ((Boolean) cjja.a.e()).booleanValue() && messageCoreData.Q() != null;
    }

    private final Uri l(MessageCoreData messageCoreData, engw engwVar) {
        bbcg bbcgVar = this.t;
        int b = bbcgVar.b("sub_id", -1);
        String l = bbcgVar.l("sub_phone_number");
        long o = messageCoreData.o();
        ((coxg) this.A.b()).i(o);
        int d = messageCoreData.d();
        ConversationIdType z = messageCoreData.z();
        cpxu a2 = ((Boolean) ayhv.a.e()).booleanValue() ? ((ayfi) this.P.b()).a(z) : ((cbek) this.J.b()).a(z);
        if (d == 1 || d == 2) {
            return ((coxk) this.i.b()).ac(this.f, J(engwVar), messageCoreData, ((cgte) this.j.b()).a(this.f, messageCoreData, b), cpxv.a(a2), b, l, o);
        }
        if (d != 0 || !P(messageCoreData)) {
            return n(messageCoreData, ((cgte) this.j.b()).a(this.f, messageCoreData, b), engwVar, cpxv.a(a2), b);
        }
        emxf.n(engwVar.size() == 1, "Expected 1 recipient, got %s", engwVar.size());
        coxk coxkVar = (coxk) this.i.b();
        Context context = this.f;
        Uri uri = Telephony.Sms.CONTENT_URI;
        aoku aokuVar = (aoku) engwVar.get(0);
        cfva cfvaVar = aoqm.a;
        return coxkVar.n(context, uri, b, aokuVar.k(((Boolean) new aoor().get()).booleanValue()), ((Boolean) cjja.b.e()).booleanValue() ? emxe.b(messageCoreData.ar()) : messageCoreData.aD(), messageCoreData.ac().toEpochMilli(), -1, 2, a2, messageCoreData.aI(), messageCoreData.ad());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Uri m(MessageCoreData messageCoreData, avkl avklVar) {
        long a2;
        ekzz f = eleg.f("SendMessageAction::insertInTelephonyForChatApi");
        try {
            ((coxg) this.A.b()).i(messageCoreData.o());
            int i = engw.d;
            engr engrVar = new engr();
            engw engwVar = avklVar.a;
            int size = engwVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                engrVar.h(((awui) engwVar.get(i2)).d);
            }
            engw g = engrVar.g();
            engw z = ((aolr) this.Q.b()).z(avklVar);
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                a2 = cpxv.a(((ayfi) this.P.b()).a(messageCoreData.z()));
            } else if (avklVar.d()) {
                awwf b = avklVar.b();
                ckjy w = ckjz.w();
                w.j(false);
                w.p(false);
                w.q(true);
                w.w(epby.MESSAGE_SENDING_THREAD_ID_VERIFICATION);
                awui awuiVar = b.d;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                w.s(awuiVar.d);
                w.u(b.c);
                crme c = ((ckju) this.L.b()).c(w.D());
                if (c == null) {
                    throw new IllegalArgumentException("Could not find conversation for group");
                }
                a2 = cpxv.a(c.c());
            } else {
                cfva cfvaVar = aoqm.a;
                a2 = ((Boolean) new aoor().get()).booleanValue() ? ((covx) this.y.b()).a((aoku) z.get(0)) : ((covs) this.q.b()).e((String) g.get(0));
            }
            long j = a2;
            int b2 = this.t.b("sub_id", -1);
            Uri n = n(messageCoreData, ((cgte) this.j.b()).a(this.f, messageCoreData, b2), z, j, b2);
            f.close();
            return n;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|4|(4:9|(1:11)|13|14)|16|17|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r3 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e.i();
        r3.Y(defpackage.ente.a, "BugleDataModel");
        ((defpackage.enrr) ((defpackage.enrr) ((defpackage.enrr) r3).g(r0)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "updateMessageUriInSpan", 1398, "SendMessageAction.java")).q("Exception when inserting sending RCS message in telephony");
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:3:0x0006, B:6:0x001b, B:9:0x002a, B:11:0x008b, B:17:0x0049, B:21:0x0070), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r12, defpackage.cgtf r13, defpackage.engw r14, long r15, int r17) {
        /*
            r11 = this;
            java.lang.String r0 = "SendMessageAction::updateMessageUri"
            ekzz r1 = defpackage.eleg.f(r0)
            cfva r0 = defpackage.aoqm.a     // Catch: java.lang.Throwable -> Lbd
            aoor r0 = new aoor     // Catch: java.lang.Throwable -> Lbd
            r0.<init>()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = "BugleDataModel"
            if (r0 != 0) goto L49
            emyl r0 = r11.C     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lbd
            bzqa r0 = (defpackage.bzqa) r0     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            ffbr r0 = r11.p     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lbd
            r3 = r0
            ckch r3 = (defpackage.ckch) r3     // Catch: java.lang.Throwable -> Lbd
            engw r6 = J(r14)     // Catch: java.lang.Throwable -> Lbd
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r14 = r12.z()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r9 = M(r14)     // Catch: java.lang.Throwable -> Lbd
            r4 = r12
            r5 = r13
            r7 = r15
            r10 = r17
            android.net.Uri r13 = r3.b(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> Lbd
            goto L89
        L49:
            ffbr r0 = r11.p     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            java.lang.Object r0 = r0.b()     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            r3 = r0
            ckch r3 = (defpackage.ckch) r3     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r12.z()     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            java.lang.String r9 = M(r0)     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r10 = r17
            elfl r13 = r3.f(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            java.lang.Object r13 = defpackage.dtnq.a(r13)     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            android.net.Uri r13 = (android.net.Uri) r13     // Catch: java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L6d java.lang.Throwable -> Lbd
            goto L89
        L6b:
            r0 = move-exception
            goto L6e
        L6d:
            r0 = move-exception
        L6e:
            r13 = r0
            r9 = r13
            enru r13 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e     // Catch: java.lang.Throwable -> Lbd
            ensk r3 = r13.i()     // Catch: java.lang.Throwable -> Lbd
            ensn r13 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lbd
            r3.Y(r13, r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction"
            java.lang.String r6 = "updateMessageUriInSpan"
            java.lang.String r8 = "SendMessageAction.java"
            java.lang.String r4 = "Exception when inserting sending RCS message in telephony"
            r7 = 1398(0x576, float:1.959E-42)
            defpackage.a.p(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbd
            r13 = 0
        L89:
            if (r13 == 0) goto Lb9
            enru r14 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e     // Catch: java.lang.Throwable -> Lbd
            ensk r14 = r14.g()     // Catch: java.lang.Throwable -> Lbd
            ensn r0 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lbd
            r14.Y(r0, r2)     // Catch: java.lang.Throwable -> Lbd
            enrr r14 = (defpackage.enrr) r14     // Catch: java.lang.Throwable -> Lbd
            ensn r0 = defpackage.csux.b     // Catch: java.lang.Throwable -> Lbd
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r12 = r12.B()     // Catch: java.lang.Throwable -> Lbd
            r14.Y(r0, r12)     // Catch: java.lang.Throwable -> Lbd
            ensn r12 = defpackage.csux.X     // Catch: java.lang.Throwable -> Lbd
            r14.Y(r12, r13)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r12 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction"
            java.lang.String r0 = "updateMessageUriInSpan"
            java.lang.String r2 = "SendMessageAction.java"
            r3 = 1418(0x58a, float:1.987E-42)
            ensk r12 = r14.h(r12, r0, r3, r2)     // Catch: java.lang.Throwable -> Lbd
            enrr r12 = (defpackage.enrr) r12     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r14 = "Updated message with new URI."
            r12.q(r14)     // Catch: java.lang.Throwable -> Lbd
        Lb9:
            r1.close()
            return r13
        Lbd:
            r0 = move-exception
            r12 = r0
            r1.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc8
        Lc3:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        Lc8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, cgtf, engw, long, int):android.net.Uri");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SendMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        return elfo.g(new Callable() { // from class: bawd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SendMessageAction.this.k();
                return null;
            }
        }, this.B);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    public final eopp h(MessageCoreData messageCoreData) {
        return (eopp) ((alwb) this.U.get()).fP(messageCoreData.O());
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // defpackage.baze
    public final void k() {
        /*
            Method dump skipped, instructions count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.k():void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SendMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, final ffbr ffbrVar4, final ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cqoh cqohVar, ffbr ffbrVar8, ffbr ffbrVar9, final ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, errl errlVar, final ffbr ffbrVar16, ffbr ffbrVar17, final ffbr ffbrVar18, final ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, final ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, ffbr ffbrVar47, ffbr ffbrVar48, Parcel parcel) {
        super(parcel, eogt.SEND_MESSAGE_ACTION);
        this.f = context;
        this.g = ffbrVar;
        this.o = ffbrVar2;
        this.h = emys.a(new emyl() { // from class: bawl
            @Override // defpackage.emyl
            public final Object get() {
                return (bdtd) ffbr.this.b();
            }
        });
        this.a = emys.a(new emyl() { // from class: bawm
            @Override // defpackage.emyl
            public final Object get() {
                return (baxz) ffbr.this.b();
            }
        });
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = cqohVar;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
        this.n = emys.a(new emyl() { // from class: bawn
            @Override // defpackage.emyl
            public final Object get() {
                return (ctwb) ffbr.this.b();
            }
        });
        this.p = ffbrVar11;
        this.q = ffbrVar12;
        this.y = ffbrVar13;
        this.z = ffbrVar14;
        this.A = ffbrVar15;
        this.B = errlVar;
        this.C = emys.a(new emyl() { // from class: bawo
            @Override // defpackage.emyl
            public final Object get() {
                return (bzqa) ffbr.this.b();
            }
        });
        this.D = ffbrVar17;
        this.E = emys.a(new emyl() { // from class: bawp
            @Override // defpackage.emyl
            public final Object get() {
                return (crbb) ffbr.this.b();
            }
        });
        this.F = emys.a(new emyl() { // from class: bawa
            @Override // defpackage.emyl
            public final Object get() {
                return (cqos) ffbr.this.b();
            }
        });
        this.G = ffbrVar20;
        this.H = ffbrVar21;
        this.I = ffbrVar22;
        this.J = ffbrVar3;
        this.K = ffbrVar23;
        this.L = ffbrVar24;
        this.b = ffbrVar25;
        this.M = ffbrVar26;
        this.N = ffbrVar27;
        this.O = ffbrVar28;
        this.P = ffbrVar29;
        this.Q = ffbrVar30;
        this.R = ffbrVar31;
        this.S = ffbrVar32;
        this.T = ffbrVar33;
        this.U = emys.a(new emyl() { // from class: bawb
            @Override // defpackage.emyl
            public final Object get() {
                return (alwb) ffbr.this.b();
            }
        });
        this.W = ffbrVar35;
        this.V = ffbrVar36;
        this.X = ffbrVar37;
        this.c = ffbrVar38;
        this.d = ffbrVar39;
        this.Y = ffbrVar40;
        this.Z = ffbrVar41;
        this.aa = ffbrVar42;
        this.ab = ffbrVar43;
        this.ac = ffbrVar44;
        this.ad = ffbrVar45;
        this.ae = ffbrVar46;
        this.af = ffbrVar47;
        this.ag = ffbrVar48;
    }
}
