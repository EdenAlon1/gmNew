package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.akzt;
import defpackage.aolr;
import defpackage.aoqm;
import defpackage.aqky;
import defpackage.asix;
import defpackage.axnw;
import defpackage.ayfg;
import defpackage.ayfy;
import defpackage.aygb;
import defpackage.aygc;
import defpackage.bazc;
import defpackage.bbfd;
import defpackage.bbff;
import defpackage.bbfg;
import defpackage.bcpt;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bdqu;
import defpackage.cetw;
import defpackage.cevh;
import defpackage.ceyr;
import defpackage.cfva;
import defpackage.cgrq;
import defpackage.cgrr;
import defpackage.cpn;
import defpackage.cqoh;
import defpackage.csux;
import defpackage.ctud;
import defpackage.cvgr;
import defpackage.cvho;
import defpackage.cvhr;
import defpackage.cvig;
import defpackage.cvih;
import defpackage.cvii;
import defpackage.deef;
import defpackage.deii;
import defpackage.dfuw;
import defpackage.dhqv;
import defpackage.dhqy;
import defpackage.dhre;
import defpackage.dhri;
import defpackage.dhrt;
import defpackage.dhzl;
import defpackage.dhzq;
import defpackage.duik;
import defpackage.duin;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.eldl;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.elgf;
import defpackage.emwl;
import defpackage.emyg;
import defpackage.emyl;
import defpackage.endq;
import defpackage.engw;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eoko;
import defpackage.eroh;
import defpackage.ffbr;
import defpackage.ffpc;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WearableBindService extends deef {
    public static final entd a = entd.c("BugleWearable");
    public ffbr A;
    public ffbr B;
    public ffbr C;
    public ffbr D;
    public ffbr E;
    public cpn b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;
    public ffbr k;
    public ffbr l;
    public ffbr m;
    public ffbr n;
    public ffbr o;
    public ffbr p;
    public ffbr q;
    public ffbr r;
    public ffbr s;
    public ffbr t;
    public ffbr u;
    public ffbr v;
    public ffbr w;
    public ffbr x;
    public ffbr y;
    public ffbr z;

    public static dhre c() {
        cvig cvigVar = (cvig) cvii.a.createBuilder();
        cvigVar.copyOnWrite();
        ((cvii) cvigVar.instance).d = cvih.a(4);
        return dhrt.c(((cvii) cvigVar.build()).toByteArray());
    }

    private final elfl q() {
        return ((cvhr) this.C.b()).a().h(new emwl() { // from class: deeu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk n = WearableBindService.a.n();
                n.Y(csux.O, "WearableBindService");
                ((ensz) n.h("com/google/android/apps/messaging/wearable/WearableBindService", "markPairedWatchAsOnline", 441, "WearableBindService.java")).t("Updated connection status of the paired watch to %s", (cvhq) obj);
                return null;
            }
        }, (Executor) this.u.b());
    }

    private final void r(final ChannelClient.Channel channel, final Uri uri) {
        elfo.f(new Runnable() { // from class: deeo
            @Override // java.lang.Runnable
            public final void run() {
                WearableBindService wearableBindService = WearableBindService.this;
                cpn cpnVar = wearableBindService.b;
                ChannelClient.Channel channel2 = channel;
                bcpt bcptVar = (bcpt) cpnVar.remove(channel2);
                if (bcptVar != null && bcptVar.g()) {
                    bcptVar.f();
                }
                Uri uri2 = uri;
                bcpt bcptVar2 = new bcpt();
                cbat e = new cbce(uri2, 250, 250, -1, -1, false, false, false, 0, true).e(wearableBindService, new deew(wearableBindService, bcptVar2, channel2, uri2));
                bcptVar2.c(e);
                wearableBindService.b.put(channel2, bcptVar2);
                ((cbbu) wearableBindService.l.b()).d(e);
            }
        }, (Executor) this.v.b()).k(axnw.b(), (Executor) this.u.b());
    }

    public final dhre b(elfl elflVar) {
        final dhri dhriVar = new dhri();
        elflVar.h(new emwl() { // from class: deen
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = WearableBindService.a;
                dhri.this.b(((cvii) obj).toByteArray());
                return null;
            }
        }, (Executor) this.u.b()).k(axnw.b(), (Executor) this.u.b());
        return dhriVar.a;
    }

    @Override // defpackage.diay, defpackage.dhzu
    public final dhre d(final String str, final String str2, final byte[] bArr) {
        ekzm b = ((elbx) this.q.b()).b("WearableBindService#onRequest");
        try {
            dhre a2 = duik.a(q().i(new eroh() { // from class: deei
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dhre e;
                    String str3;
                    String concat;
                    elfl c;
                    emyg c2 = emyg.c(emtt.a);
                    WearableBindService wearableBindService = WearableBindService.this;
                    String str4 = str;
                    String str5 = str2;
                    byte[] bArr2 = bArr;
                    if (str5.startsWith("/bugle/rpc/proto/v1/")) {
                        ensz enszVar = (ensz) WearableBindService.a.h();
                        enszVar.Y(csux.O, "WearableBindService");
                        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "handleProtoRpcPath", 452, "WearableBindService.java")).D("#onRequest nodeId: %s, path: %s", str4, str5);
                        ((cvhm) wearableBindService.r.b()).a(str5);
                        try {
                            cvit cvitVar = (cvit) eyfy.parseFrom(cvit.a, bArr2, eyfc.a());
                            String str6 = cvitVar.d;
                            cvitVar.getClass();
                            str5.getClass();
                            if (cvis.a(cvitVar.b).ordinal() != 0) {
                                concat = str5;
                            } else {
                                int a3 = cvhz.a((cvitVar.b == 2 ? (cvia) cvitVar.c : cvia.a).e);
                                if (a3 != 0) {
                                    if (a3 == 2) {
                                        str3 = "UNKNOWN_LOAD_TYPE";
                                    } else if (a3 == 3) {
                                        str3 = "LOAD_TYPE_PREVIOUS";
                                    } else if (a3 == 4) {
                                        str3 = "LOAD_TYPE_NEXT";
                                    } else if (a3 == 5) {
                                        str3 = "LOAD_TYPE_AROUND";
                                    } else if (a3 == 6) {
                                        str3 = "LOAD_TYPE_LATEST";
                                    }
                                    concat = str5.concat(str3);
                                }
                                str3 = "UNRECOGNIZED";
                                concat = str5.concat(str3);
                            }
                            try {
                                int ordinal = cvis.a(cvitVar.b).ordinal();
                                if (ordinal == 0) {
                                    e = wearableBindService.b(((defs) wearableBindService.z.b()).a(cvitVar.b == 2 ? (cvia) cvitVar.c : cvia.a, str4));
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                    }
                                    ensz enszVar2 = (ensz) WearableBindService.a.j();
                                    enszVar2.Y(csux.O, "WearableBindService");
                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "processProtoRequest", 574, "WearableBindService.java")).t("Unsupported Request Payload: %s", cvis.a(cvitVar.b));
                                    e = WearableBindService.c();
                                } else {
                                    degt degtVar = (degt) wearableBindService.A.b();
                                    cvic cvicVar = cvitVar.b == 3 ? (cvic) cvitVar.c : cvic.a;
                                    cvicVar.getClass();
                                    c = axol.c(degtVar.d, ffhe.a, ffsm.a, new degs(degtVar, cvicVar, null));
                                    e = wearableBindService.b(c);
                                }
                                wearableBindService.g(e, concat, str6, c2);
                            } catch (RuntimeException e2) {
                                c2.g();
                                wearableBindService.h("Exception while handling RPC for path", e2, concat, str6, c2.d());
                                throw e2;
                            }
                        } catch (eygu e3) {
                            c2.g();
                            wearableBindService.h("Unable to parse WearableSyncRequest from watch to the phone", e3, str5, "", c2.d());
                            cvig cvigVar = (cvig) cvii.a.createBuilder();
                            cvigVar.copyOnWrite();
                            ((cvii) cvigVar.instance).d = cvih.a(7);
                            e = dhrt.c(((cvii) cvigVar.build()).toByteArray());
                        }
                        ensz enszVar3 = (ensz) WearableBindService.a.h();
                        enszVar3.Y(csux.O, "WearableBindService");
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "onRequestInner", 382, "WearableBindService.java")).t("RPC proto onRequest complete. Path: %s", str5);
                    } else {
                        ensz enszVar4 = (ensz) WearableBindService.a.h();
                        enszVar4.Y(csux.O, "WearableBindService");
                        ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "handleDataMapRpcPath", 502, "WearableBindService.java")).D("#onRequest nodeId: %s, path: %s", str4, str5);
                        ((cvhm) wearableBindService.r.b()).a(str5);
                        dhzq c3 = dhzq.c(bArr2);
                        String b2 = cvgr.b(c3, "39");
                        try {
                            e = wearableBindService.e(str5, c3, str4);
                            wearableBindService.g(e, str5, b2, c2);
                            ensz enszVar5 = (ensz) WearableBindService.a.h();
                            enszVar5.Y(csux.O, "WearableBindService");
                            ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/WearableBindService", "onRequestInner", 390, "WearableBindService.java")).t("Message client onRequest complete. Path: %s", str5);
                        } catch (RuntimeException e4) {
                            c2.g();
                            wearableBindService.h("Exception while handling RPC for path", e4, str5, b2, c2.d());
                            throw e4;
                        }
                    }
                    return duin.a(e);
                }
            }, (Executor) this.u.b()));
            b.close();
            return a2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final dhre e(String str, dhzq dhzqVar, String str2) {
        char c;
        if (!((ctud) this.j.b()).k()) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.O, "WearableBindService");
            ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 846, "WearableBindService.java")).q("#performActionForRpc: Insufficient permissions.");
        }
        switch (str.hashCode()) {
            case -1880220590:
                if (str.equals("/bugle/rpc/open_conversation/")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1399332381:
                if (str.equals("/bugle/rpc/mark_as_read/")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -470962684:
                if (str.equals("/bugle/rpc/download_message/")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -398236043:
                if (str.equals("/bugle/rpc/call_contact/")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -197273462:
                if (str.equals("/bugle/rpc/update_data/")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 128641265:
                if (str.equals("/bugle/rpc/resend_message/")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 163286401:
                if (str.equals("/bugle/rpc/delete_message/")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 471377826:
                if (str.equals("/bugle/rpc/ping/")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 711558340:
                if (str.equals("/bugle/rpc/create_conversation/")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1124666163:
                if (str.equals("/bugle/rpc/delete_conversation/")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1261709220:
                if (str.equals("/bugle/rpc/request_more_messages/")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2097144196:
                if (str.equals("/bugle/rpc/send_message/")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent("android.intent.action.CALL", Uri.parse(cvgr.a(dhzqVar, "32")));
                intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                try {
                    eldl.p((Context) this.c.b(), intent);
                    break;
                } catch (SecurityException unused) {
                    ensz enszVar2 = (ensz) a.h();
                    enszVar2.Y(csux.O, "WearableBindService");
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 862, "WearableBindService.java")).q("Messages app has no direct permissions to make phone calls. Opening populated dialpad.");
                    intent.setAction("android.intent.action.DIAL");
                    eldl.p((Context) this.c.b(), intent);
                    break;
                }
            case 1:
                ((cevh) ((deii) this.o.b()).a.b()).g(ceyr.g("sync_data_to_wearable_app", cetw.a));
                break;
            case 2:
                ConversationIdType b = bdgq.b(cvgr.a(dhzqVar, "1"));
                ensz enszVar3 = (ensz) a.h();
                enszVar3.Y(csux.O, "WearableBindService");
                enszVar3.Y(csux.p, b);
                ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 884, "WearableBindService.java")).q("Sending message to conversation");
                ((bazc) this.m.b()).b(b, cvgr.b(dhzqVar, "android.intent.extra.TEXT"));
                break;
            case 3:
                Object obj = dhzqVar.a.get("23");
                String[] strArr = null;
                if (obj != null) {
                    try {
                        strArr = (String[]) obj;
                    } catch (ClassCastException e) {
                        dhzq.q("23", obj, "String[]", e);
                    }
                }
                strArr.getClass();
                String b2 = cvgr.b(dhzqVar, "android.intent.extra.TEXT");
                ensz enszVar4 = (ensz) a.h();
                enszVar4.Y(csux.O, "WearableBindService");
                ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMessageToRecipients", 583, "WearableBindService.java")).q("Sending message to recipients");
                ArrayList arrayList = new ArrayList();
                for (String str3 : strArr) {
                    String trim = str3.trim();
                    if (TextUtils.isEmpty(trim)) {
                        ensz enszVar5 = (ensz) a.j();
                        enszVar5.Y(csux.O, "WearableBindService");
                        ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMessageToRecipients", 603, "WearableBindService.java")).q("SendMessageToParticipantsAction hit empty recipient.");
                    } else {
                        cfva cfvaVar = aoqm.a;
                        if (((Boolean) new emyl() { // from class: aope
                            @Override // defpackage.emyl
                            public final Object get() {
                                return Boolean.valueOf(ersy.a("bugle.enable_mi_in_wearable_bind_service", "bugle"));
                            }
                        }.get()).booleanValue()) {
                            arrayList.add(((aqky) this.y.b()).a(((aolr) this.x.b()).n(trim)));
                        } else {
                            arrayList.add(bdqu.b(trim));
                        }
                    }
                }
                ((bazc) this.m.b()).c(arrayList, b2);
                break;
            case 4:
                ((bbfd) this.n.b()).d(bdgq.b(cvgr.a(dhzqVar, "1")));
                break;
            case 5:
                ((ayfg) this.k.b()).A((Context) this.c.b(), new BugleConversationId(bdgq.b(cvgr.a(dhzqVar, "1"))));
                break;
            case 6:
                String a2 = cvgr.a(dhzqVar, "4");
                ensz enszVar6 = (ensz) a.h();
                enszVar6.Y(csux.O, "WearableBindService");
                enszVar6.Y(csux.a, a2);
                ((ensz) enszVar6.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 925, "WearableBindService.java")).q("Resending message");
                ((bbfg) this.f.b()).d(bdhb.b(a2));
                break;
            case 7:
                String a3 = cvgr.a(dhzqVar, "4");
                if (((asix) this.B.b()).a()) {
                    ((cgrq) this.h.b()).f(bdhb.b(a3), cgrr.MESSAGE_NOT_DELIVERED_WEAR_DELETION);
                    break;
                } else {
                    ((cgrq) this.h.b()).d(bdhb.b(a3));
                    break;
                }
            case '\b':
                ConversationIdType b3 = bdgq.b(cvgr.a(dhzqVar, "1"));
                ((akzt) this.t.b()).c("Bugle.UI.DeleteConversation");
                ayfy ayfyVar = (ayfy) this.i.b();
                aygb f = aygc.f();
                f.b(b3);
                f.f(eoko.CONVERSATION_FROM_WEARABLE_ACTION);
                f.c(((cqoh) this.p.b()).f().toEpochMilli());
                axnw.h(ayfyVar.a(f.a()));
                break;
            case '\t':
                new RequestMoreMessagesAction(str2, bdgq.b(cvgr.a(dhzqVar, "1")), dhzqVar.p("8")).A();
                break;
            case '\n':
                ((bbff) this.g.b()).d(bdhb.b(cvgr.a(dhzqVar, "4")));
                break;
            case 11:
                break;
            default:
                ensz enszVar7 = (ensz) a.j();
                enszVar7.Y(csux.O, "WearableBindService");
                ((ensz) enszVar7.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 980, "WearableBindService.java")).t("Unsupported RPC path called: %s", str);
                return c();
        }
        cvig cvigVar = (cvig) cvii.a.createBuilder();
        cvigVar.copyOnWrite();
        ((cvii) cvigVar.instance).d = cvih.a(3);
        return dhrt.c(((cvii) cvigVar.build()).toByteArray());
    }

    public final elfl f(ChannelClient.Channel channel) {
        return elfl.g(duin.a(((ChannelClient) this.d.b()).a(channel)));
    }

    public final void g(dhre dhreVar, final String str, final String str2, final emyg emygVar) {
        dhreVar.a(elgf.b(new dhqy() { // from class: deej
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                emyg emygVar2 = emygVar;
                emygVar2.g();
                cvho cvhoVar = (cvho) WearableBindService.this.s.b();
                String str3 = str;
                Duration d = emygVar2.d();
                str3.getClass();
                String str4 = str2;
                str4.getClass();
                d.getClass();
                if (cvhoVar.b()) {
                    cvhoVar.c(9, str3, str4, d, cvho.b);
                }
            }
        }));
        dhreVar.t(elgf.a(new dhqv() { // from class: deek
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                emyg emygVar2 = emygVar;
                emygVar2.g();
                WearableBindService.this.h("Failed to handle RPC for path", exc, str, str2, emygVar2.d());
            }
        }));
    }

    public final void h(String str, Throwable th, String str2, String str3, Duration duration) {
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.O, "WearableBindService");
        ((ensz) ((ensz) enszVar.g(th)).h("com/google/android/apps/messaging/wearable/WearableBindService", "logRequestReceiveFailure", 992, "WearableBindService.java")).D("%s: %s", str, str2);
        cvho cvhoVar = (cvho) this.s.b();
        str2.getClass();
        str3.getClass();
        duration.getClass();
        if (cvhoVar.b()) {
            cvhoVar.c(9, str2, str3, duration, cvhoVar.a(th));
        }
    }

    @Override // defpackage.diay
    public final void i(ChannelClient.Channel channel) {
        boolean I;
        ekzm b = ((elbx) this.q.b()).b("WearableBindService#onChannelOpened");
        try {
            String a2 = channel.a();
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.O, "WearableBindService");
            ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelOpened", 635, "WearableBindService.java")).t("#onChannelOpened path: %s", a2);
            I = ffpc.I(a2, "#", false);
            if (I) {
                String a3 = channel.a();
                String substring = a3.substring(ffpc.Y(a3, "#") + 1);
                substring.getClass();
                int parseInt = Integer.parseInt(substring);
                String substring2 = a3.substring(0, ffpc.Y(a3, "#"));
                substring2.getClass();
                final Uri parse = Uri.parse(substring2);
                parse.getClass();
                if (parseInt == 0) {
                    r(channel, parse);
                } else {
                    if (parseInt != 2) {
                        throw new IllegalArgumentException(a.h(parseInt, "Unsupported content type: "));
                    }
                    f(channel).k(axnw.c(new Consumer() { // from class: deem
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            WearableBindService wearableBindService = WearableBindService.this;
                            Uri uri = parse;
                            OutputStream outputStream = (OutputStream) obj;
                            try {
                                try {
                                    eoej.a(eepn.b((Context) wearableBindService.c.b(), uri, eepm.a("com.android.providers.telephony")), outputStream);
                                    ((akzt) wearableBindService.t.b()).c("Bugle.Wear.VoiceMessage.Process.Success");
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                } finally {
                                }
                            } catch (IOException e) {
                                ensz enszVar2 = (ensz) WearableBindService.a.j();
                                enszVar2.Y(csux.O, "WearableBindService");
                                ((ensz) ((ensz) enszVar2.g(e)).h("com/google/android/apps/messaging/wearable/WearableBindService", "processAudioRequest", 731, "WearableBindService.java")).t("Failed to copy audio stream for file: %s", uri);
                                ((akzt) wearableBindService.t.b()).c("Bugle.Wear.VoiceMessage.Process.Failure");
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), (Executor) this.v.b());
                }
            } else {
                r(channel, Uri.parse(a2));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.diay, defpackage.dhzh
    public final void j(dhzl dhzlVar) {
        ekzm b = ((elbx) this.q.b()).b("WearableBindService#onDataChanged");
        try {
            Stream map = StreamSupport.stream(Spliterators.spliteratorUnknownSize(new dfuw(dhzlVar), 16), false).filter(new Predicate() { // from class: deeq
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
                public final boolean test(Object obj) {
                    entd entdVar = WearableBindService.a;
                    String path = ((dhzk) obj).b().a().getPath();
                    return Objects.equals(path, "/bugle/watch_version/") || Objects.equals(path, "/bugle/attachments/");
                }
            }).map(new Function() { // from class: deer
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (dhzk) ((dhzk) obj).d();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            final engw engwVar = (engw) map.collect(endq.a);
            dhzlVar.b();
            if (!engwVar.isEmpty()) {
                axnw.h(q().h(new emwl() { // from class: dees
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        engw engwVar2 = engwVar;
                        int size = engwVar2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dhzk dhzkVar = (dhzk) engwVar2.get(i2);
                            dhzm b2 = dhzkVar.b();
                            String path = b2.a().getPath();
                            if ("/bugle/watch_version/".equals(path)) {
                                CheckWearableAppVersionAction.h();
                            } else if (dhzkVar.a() == 1 && "/bugle/attachments/".equals(path)) {
                                final WearableBindService wearableBindService = WearableBindService.this;
                                final dhzq dhzqVar = dhzr.a(b2).a;
                                String b3 = cvgr.b(dhzqVar, "39");
                                cvho cvhoVar = (cvho) wearableBindService.s.b();
                                path.getClass();
                                if (cvhoVar.b()) {
                                    cvhoVar.c(5, path, b3, null, cvhoVar.a(new dfqu(new Status(0))));
                                }
                                final ConversationIdType b4 = bdgq.b(cvgr.a(dhzqVar, "1"));
                                String a2 = cvgr.a(dhzqVar, "26");
                                if (le.f(a2)) {
                                    Asset b5 = dhzqVar.b("27");
                                    if (b5 == null) {
                                        ensz enszVar = (ensz) WearableBindService.a.j();
                                        enszVar.Y(csux.O, "WearableBindService");
                                        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 293, "WearableBindService.java")).q("Asset is null, sending voice message stopped.");
                                    } else {
                                        final Uri d = cbgi.d(true != ((Boolean) ardj.a.e()).booleanValue() ? "amr" : "m4a", (Context) wearableBindService.c.b());
                                        if (d == null) {
                                            ensz enszVar2 = (ensz) WearableBindService.a.j();
                                            enszVar2.Y(csux.O, "WearableBindService");
                                            ((ensz) enszVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 304, "WearableBindService.java")).q("Creating Uri failed, sending voice message stopped.");
                                        } else {
                                            File i3 = cbgi.i(d, (Context) wearableBindService.c.b());
                                            if (i3 == null) {
                                                ensz enszVar3 = (ensz) WearableBindService.a.j();
                                                enszVar3.Y(csux.O, "WearableBindService");
                                                ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 314, "WearableBindService.java")).q("Unable to create the scratch file, sending voice message stopped.");
                                            } else {
                                                final Path path2 = FileRetargetClass.toPath(i3);
                                                axnw.h(elfl.g(duin.a(((dhzj) wearableBindService.e.b()).d(b5))).h(new emwl() { // from class: deet
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj2) {
                                                        WearableBindService wearableBindService2 = WearableBindService.this;
                                                        Path path3 = path2;
                                                        try {
                                                            InputStream a3 = ((dhzi) obj2).a();
                                                            try {
                                                                Files.copy(a3, path3, StandardCopyOption.REPLACE_EXISTING);
                                                                ((dhzj) wearableBindService2.e.b()).a(new Uri.Builder().scheme("wear").path("/bugle/attachments/").build());
                                                                if (a3 == null) {
                                                                    return null;
                                                                }
                                                                a3.close();
                                                                return null;
                                                            } finally {
                                                            }
                                                        } catch (IOException e) {
                                                            ensz enszVar4 = (ensz) ((ensz) WearableBindService.a.j()).g(e);
                                                            enszVar4.Y(csux.O, "WearableBindService");
                                                            ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "saveMediaFileToPath", 353, "WearableBindService.java")).t("Failed to get asset from %s. Sending voice message stopped.", path3);
                                                            return null;
                                                        }
                                                    }
                                                }, (Executor) wearableBindService.v.b()).h(new emwl() { // from class: deev
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj2) {
                                                        dhzq dhzqVar2 = dhzqVar;
                                                        Object obj3 = dhzqVar2.a.get("42");
                                                        long j = 0;
                                                        if (obj3 != null) {
                                                            try {
                                                                j = ((Long) obj3).longValue();
                                                            } catch (ClassCastException e) {
                                                                dhzq.q("42", obj3, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, e);
                                                            }
                                                        }
                                                        long j2 = j;
                                                        Uri uri = d;
                                                        ConversationIdType conversationIdType = b4;
                                                        WearableBindService wearableBindService2 = WearableBindService.this;
                                                        ((bazc) wearableBindService2.m.b()).a(conversationIdType, uri, j2, cvgr.a(dhzqVar2, "26"));
                                                        return null;
                                                    }
                                                }, (Executor) wearableBindService.u.b()));
                                            }
                                        }
                                    }
                                } else {
                                    ensz enszVar4 = (ensz) WearableBindService.a.j();
                                    enszVar4.Y(csux.O, "WearableBindService");
                                    ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "onDataChangedInner", 281, "WearableBindService.java")).t("Invalid attachment type: %s", a2);
                                }
                            }
                        }
                        return null;
                    }
                }, (Executor) this.w.b()));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.diay, defpackage.dhzt
    public final void k(final MessageEventParcelable messageEventParcelable) {
        ekzm b = ((elbx) this.q.b()).b("WearableBindService#onMessageReceived");
        try {
            axnw.h(q().h(new emwl() { // from class: deep
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    WearableBindService wearableBindService = WearableBindService.this;
                    boolean k = ((ctud) wearableBindService.j.b()).k();
                    ensz enszVar = (ensz) WearableBindService.a.h();
                    enszVar.Y(csux.O, "WearableBindService");
                    ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onMessageReceivedInner", 416, "WearableBindService.java");
                    MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                    String str = messageEventParcelable2.b;
                    enszVar2.E("#onMessageReceived path: %s, hasRequiredPermissions: %s", str, k);
                    ((cvhm) wearableBindService.r.b()).a(str);
                    String b2 = cvgr.b(dhzq.c(messageEventParcelable2.c), "39");
                    cvho cvhoVar = (cvho) wearableBindService.s.b();
                    str.getClass();
                    if (cvhoVar.b()) {
                        cvhoVar.c(3, str, b2, null, cvho.b);
                    }
                    wearableBindService.e(str, dhzq.c(messageEventParcelable2.c), messageEventParcelable2.d);
                    return null;
                }
            }, (Executor) this.u.b()));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.diay
    public final void l(ChannelClient.Channel channel) {
        ekzm b = ((elbx) this.q.b()).b("WearableBindService#onChannelClosed");
        try {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.O, "WearableBindService");
            ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelClosed", 818, "WearableBindService.java")).t("#onChannelClosed path: %s", channel.a());
            bcpt bcptVar = (bcpt) this.b.remove(channel);
            if (bcptVar != null && bcptVar.g()) {
                bcptVar.f();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.deef, defpackage.diay, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new cpn();
    }
}
