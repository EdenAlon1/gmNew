package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cnfq;
import defpackage.csjk;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.entd;
import defpackage.erog;
import defpackage.fazb;
import defpackage.ffbr;
import j$.time.Instant;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class IncomingRcsEventReceiver extends cnfq {
    public static final cskc a = cskc.g("Bugle", "IncomingRcsEventReceiver");
    public static final cskc b = cskc.g("BugleAction", "IncomingRcsEventReceiver");
    public static final entd c = entd.c("BugleAction");
    public csjk d;
    public fazb e;
    public fazb f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;
    public ffbr k;
    public elbx l;
    public ffbr m;
    public ffbr n;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.l.b("IncomingRcsEventReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 3;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    public final elfl j(Context context, final Intent intent) {
        return elfo.h(new erog() { // from class: cngh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl e;
                long j;
                elfl b2;
                elfl b3;
                Action action;
                IncomingRcsEventReceiver incomingRcsEventReceiver = IncomingRcsEventReceiver.this;
                ckds ckdsVar = (ckds) incomingRcsEventReceiver.h.b();
                Intent intent2 = intent;
                if (!ckdsVar.C(intent2)) {
                    IncomingRcsEventReceiver.a.r("Package not authorized. Returning.");
                    return elfo.e(null);
                }
                String action2 = intent2.getAction();
                if (action2 == null) {
                    ((ensz) ((ensz) IncomingRcsEventReceiver.c.j()).h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 130, "IncomingRcsEventReceiver.java")).q("Received an intent with no action");
                    return elfo.e(null);
                }
                csjb c2 = IncomingRcsEventReceiver.b.c();
                c2.I("doInBackground");
                c2.A(GroupManagementRequest.ACTION_TAG, action2);
                c2.r();
                ckgb ckgbVar = ckgb.NO_HINT;
                if (!RcsIntents.isProvisioningIntentAction(action2)) {
                    ckgbVar = ckgb.RECEIVED_POST_PROVISIONING_INTENT;
                }
                ((ckge) incomingRcsEventReceiver.d.a()).o(ckgbVar);
                ((alir) incomingRcsEventReceiver.g.b()).f(aliq.RCS_ACTION, Optional.ofNullable(action2));
                Bundle extras = intent2.getExtras();
                if (RcsIntents.ACTION_INCOMING_CHAT_MESSAGE.equals(action2)) {
                    ((enrr) IncomingRcsEventReceiver.b.k().h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 150, "IncomingRcsEventReceiver.java")).q("Received unexpected ACTION_INCOMING_CHAT_MESSAGE RCS event.");
                    return elfo.e(null);
                }
                if (RcsIntents.ACTION_LOCATION_RECEIVED.equals(action2)) {
                    ((enrr) IncomingRcsEventReceiver.b.k().h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 153, "IncomingRcsEventReceiver.java")).q("Received unexpected ACTION_LOCATION_RECEIVED RCS event.");
                    return elfo.e(null);
                }
                if (RcsIntents.ACTION_INCOMING_GROUP_CHAT.equals(action2)) {
                    String stringExtra = intent2.getStringExtra(RcsIntents.EXTRA_REFERRER);
                    long longExtra = intent2.getLongExtra("rcs.intent.extra.sessionid", -1L);
                    GroupInfo groupInfo = (GroupInfo) intent2.getParcelableExtra(RcsIntents.EXTRA_GROUP_INFO);
                    ckpq ckpqVar = (ckpq) ckpr.a.createBuilder();
                    String b4 = emxe.b(stringExtra);
                    ckpqVar.copyOnWrite();
                    ((ckpr) ckpqVar.instance).g = b4;
                    ckpqVar.copyOnWrite();
                    ((ckpr) ckpqVar.instance).b = longExtra;
                    if (groupInfo != null) {
                        ArrayList arrayList = new ArrayList();
                        for (UserInfo userInfo : groupInfo.b) {
                            if (!userInfo.d) {
                                arrayList.add(userInfo.a);
                            }
                        }
                        String b5 = emxe.b(groupInfo.c);
                        ckpqVar.copyOnWrite();
                        ((ckpr) ckpqVar.instance).c = b5;
                        String b6 = emxe.b(groupInfo.d);
                        ckpqVar.copyOnWrite();
                        ((ckpr) ckpqVar.instance).d = b6;
                        String b7 = emxe.b(groupInfo.a);
                        ckpqVar.copyOnWrite();
                        ((ckpr) ckpqVar.instance).e = b7;
                        ckpqVar.copyOnWrite();
                        ckpr ckprVar = (ckpr) ckpqVar.instance;
                        eygr eygrVar = ckprVar.f;
                        if (!eygrVar.c()) {
                            ckprVar.f = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(arrayList, ckprVar.f);
                    }
                    ((cevh) ((ckps) incomingRcsEventReceiver.n.b()).a.b()).a(ceyr.g("incoming_rcs_group_invitation", (ckpr) ckpqVar.build()));
                    return elfo.e(null);
                }
                if (RcsIntents.ACTION_INCOMING_CONVERSATION_SUGGESTIONS_MESSAGE.equals(action2)) {
                    if (extras == null) {
                        IncomingRcsEventReceiver.b.r("No extras found in incoming conversation suggestions message intent");
                        return elfo.e(null);
                    }
                    action = ((bart) incomingRcsEventReceiver.j.b()).a(extras);
                } else {
                    if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER.equals(action2) || RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE.equals(action2) || RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED.equals(action2) || RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE.equals(action2)) {
                        if (extras == null) {
                            IncomingRcsEventReceiver.b.r("No extras found in incoming file transfer intent");
                            return elfo.e(null);
                        }
                        final cnko cnkoVar = (cnko) incomingRcsEventReceiver.f.b();
                        if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER.equals(action2)) {
                            ((enrr) cnko.a.k().h("com/google/android/apps/messaging/shared/receiver/rcsprocessor/IncomingRcsFileTransferEventProcessor", "process", 108, "IncomingRcsFileTransferEventProcessor.java")).q("Received unexpected ACTION_INCOMING_FILE_TRANSFER event.");
                            e = elfo.e(null);
                        } else if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE.equals(action2)) {
                            byte[] byteArray = extras.getByteArray(RcsIntents.EXTRA_PREVIEW_DATA);
                            if (byteArray == null) {
                                csjb b8 = cnko.a.b();
                                b8.I("Received an incoming file transfer preview update event but there was no preview provided.");
                                b8.r();
                                b3 = elfo.e(null);
                            } else {
                                byte[] byteArray2 = extras.getByteArray("file_transfer_service_download_response_extra");
                                if (byteArray2 == null) {
                                    csjb b9 = cnko.a.b();
                                    b9.I("Received an incoming file transfer preview update event but there was no opaque data.");
                                    b9.r();
                                    b3 = elfo.e(null);
                                } else {
                                    String string = extras.getString(RcsIntents.EXTRA_FILENAME);
                                    crag cragVar = (crag) crah.a.createBuilder();
                                    eyee x = eyee.x(byteArray2);
                                    cragVar.copyOnWrite();
                                    ((crah) cragVar.instance).b = x;
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                                        try {
                                            String uri = cbgi.g(byteArrayInputStream, cnkoVar.c).toString();
                                            cragVar.copyOnWrite();
                                            crah crahVar = (crah) cragVar.instance;
                                            uri.getClass();
                                            crahVar.d = uri;
                                            byteArrayInputStream.close();
                                        } finally {
                                        }
                                    } catch (IOException e2) {
                                        csjb b10 = cnko.a.b();
                                        b10.I("Failed to close input stream after writing thumbnail to scratch space.");
                                        b10.s(e2);
                                    }
                                    if (string != null) {
                                        cragVar.copyOnWrite();
                                        ((crah) cragVar.instance).c = string;
                                    }
                                    b3 = ((cevh) cnkoVar.g.a.b()).b(ceyr.g("persist_thumbnail", (crah) cragVar.build()));
                                }
                            }
                            e = b3.i(new eroh() { // from class: cnkj
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    cskc cskcVar = cnko.a;
                                    return ((cevg) obj).b().h(new emwl() { // from class: cnkn
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cskc cskcVar2 = cnko.a;
                                            return null;
                                        }
                                    }, erpp.a);
                                }
                            }, cnkoVar.d);
                        } else if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED.equals(action2)) {
                            String string2 = extras.getString("rcs.intent.extra.uri");
                            if (string2 == null) {
                                b2 = elfo.d(new IllegalArgumentException("Received an incoming file transfer completed event but there was no URI provided."));
                            } else {
                                byte[] byteArray3 = extras.getByteArray("file_transfer_service_download_response_extra");
                                if (byteArray3 == null) {
                                    throw new IllegalArgumentException("Received an incoming file transfer completed event but there was no opaque data.");
                                }
                                try {
                                    String str = ((cqxn) eyfy.parseFrom(cqxn.a, byteArray3, eyfc.a())).b;
                                    if (emxe.c(str)) {
                                        b2 = elfo.d(new IllegalArgumentException("Received an incoming file transfer completed event cannot find the associating RCS message ID."));
                                    } else {
                                        String string3 = extras.getString(RcsIntents.EXTRA_FILENAME);
                                        cqxj cqxjVar = (cqxj) cqxk.a.createBuilder();
                                        cqxjVar.copyOnWrite();
                                        cqxk cqxkVar = (cqxk) cqxjVar.instance;
                                        str.getClass();
                                        cqxkVar.b |= 1;
                                        cqxkVar.c = str;
                                        String b11 = emxe.b(string3);
                                        cqxjVar.copyOnWrite();
                                        cqxk cqxkVar2 = (cqxk) cqxjVar.instance;
                                        cqxkVar2.b |= 4;
                                        cqxkVar2.e = b11;
                                        cqxjVar.copyOnWrite();
                                        cqxk cqxkVar3 = (cqxk) cqxjVar.instance;
                                        cqxkVar3.b |= 2;
                                        cqxkVar3.d = string2;
                                        long j2 = extras.getLong(RcsIntents.EXTRA_SIZE);
                                        cqxjVar.copyOnWrite();
                                        cqxk cqxkVar4 = (cqxk) cqxjVar.instance;
                                        cqxkVar4.b |= 8;
                                        cqxkVar4.f = j2;
                                        eqyl eqylVar = eqyl.RCS_SMAPI;
                                        cqxjVar.copyOnWrite();
                                        cqxk cqxkVar5 = (cqxk) cqxjVar.instance;
                                        cqxkVar5.g = eqylVar.h;
                                        cqxkVar5.b |= 16;
                                        cqxk cqxkVar6 = (cqxk) cqxjVar.build();
                                        csjb a2 = cnko.a.a();
                                        a2.I("Scheduling file download completed handler.");
                                        a2.h(bdhg.a(str));
                                        a2.r();
                                        b2 = ((cevh) cnkoVar.h.a.b()).b(ceyr.g("file_download_completed", cqxkVar6));
                                    }
                                } catch (eygu e3) {
                                    throw new IllegalArgumentException("Received an incoming file transfer completed event but failed to parse FileDownloadExtras", e3);
                                }
                            }
                            e = b2.i(new eroh() { // from class: cnkk
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    cskc cskcVar = cnko.a;
                                    return ((cevg) obj).b().h(new emwl() { // from class: cnkm
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cskc cskcVar2 = cnko.a;
                                            return null;
                                        }
                                    }, erpp.a);
                                }
                            }, cnkoVar.d);
                        } else if (RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE.equals(action2)) {
                            final bdhg b12 = bdhg.b(extras, RcsIntents.EXTRA_MESSAGE_ID);
                            final String string4 = extras.getString(RcsIntents.EXTRA_FALLBACK_URL);
                            if (extras.containsKey(RcsIntents.EXTRA_EXPIRY)) {
                                j = extras.getLong(RcsIntents.EXTRA_EXPIRY);
                            } else {
                                j = cnkoVar.f.f().toEpochMilli() + ((Long) cnko.b.e()).longValue();
                                csjb a3 = cnko.a.a();
                                a3.I("Expiry is absent on file transfer metadata update");
                                a3.r();
                                ((akzt) cnkoVar.e.b()).c("Bugle.Message.Send.RcsFileTransfer.AbsentExpiry.Count");
                            }
                            final Instant ofEpochMilli = Instant.ofEpochMilli(j);
                            final byte[] byteArray4 = extras.getByteArray(RcsIntents.EXTRA_RAW_FILE_TRANSFER_XML_BYTES);
                            if (b12.i()) {
                                cnko.a.n("RCS message id is null, cannot update file transfer metadata.");
                                e = elfo.e(null);
                            } else {
                                e = elfo.h(new erog() { // from class: cnkl
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        byte[] bArr = byteArray4;
                                        if (bArr == null) {
                                            throw new IllegalStateException("Missing RCS XML response.");
                                        }
                                        bdhg bdhgVar = b12;
                                        String str2 = string4;
                                        Instant instant = ofEpochMilli;
                                        crbi crbiVar = new crbi();
                                        crbiVar.b = Optional.of(instant);
                                        crbiVar.b(str2);
                                        crbiVar.a = bdhgVar;
                                        HttpFileTransferPushMessage a4 = HttpFileTransferPushMessage.a(bArr);
                                        awvb a5 = cnko.a(instant, a4.mFileInfo);
                                        awvc awvcVar = (awvc) awvd.a.createBuilder();
                                        awvcVar.copyOnWrite();
                                        awvd awvdVar = (awvd) awvcVar.instance;
                                        a5.getClass();
                                        awvdVar.c = a5;
                                        awvdVar.b |= 1;
                                        if (a4.b()) {
                                            awvb a6 = cnko.a(instant, a4.mThumbnailInfo);
                                            awvcVar.copyOnWrite();
                                            awvd awvdVar2 = (awvd) awvcVar.instance;
                                            a6.getClass();
                                            awvdVar2.d = a6;
                                            awvdVar2.b |= 2;
                                        }
                                        cnko cnkoVar2 = cnko.this;
                                        crbiVar.c((awvd) awvcVar.build());
                                        return cnkoVar2.i.a(crbiVar.a(), Optional.empty());
                                    }
                                }, cnkoVar.d);
                            }
                        } else {
                            csjb b13 = cnko.a.b();
                            b13.I("Unknown file transfer event:");
                            b13.I(action2);
                            b13.r();
                            e = elfo.e(null);
                        }
                        return e.h(new emwl() { // from class: cngf
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                cskc cskcVar = IncomingRcsEventReceiver.a;
                                return null;
                            }
                        }, erpp.a);
                    }
                    if ("com.google.android.ims.ZERO_SESSION_ID".equals(action2)) {
                        IncomingRcsEventReceiver.b.m("ClearSessionIds started");
                        ((cevh) ((cepo) incomingRcsEventReceiver.k.b()).a.b()).a(ceyr.g("clear_session_ids", cetw.a));
                    } else {
                        Event event = (Event) intent2.getParcelableExtra(RcsIntents.EXTRA_EVENT);
                        if (event != null) {
                            ((cnki) incomingRcsEventReceiver.e.b()).c(event, incomingRcsEventReceiver);
                        } else {
                            csjb d = IncomingRcsEventReceiver.b.d();
                            d.I("ignoring action");
                            d.I(action2);
                            d.r();
                        }
                    }
                    action = null;
                }
                if (action == null) {
                    return elfo.e(null);
                }
                ((clws) incomingRcsEventReceiver.i.b()).q(incomingRcsEventReceiver);
                return elfl.g(action.r(incomingRcsEventReceiver)).h(new emwl() { // from class: cngg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cskc cskcVar = IncomingRcsEventReceiver.a;
                        return null;
                    }
                }, erpp.a);
            }
        }, (Executor) this.m.b());
    }
}
