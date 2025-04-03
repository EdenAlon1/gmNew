package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.aopn;
import defpackage.aoqm;
import defpackage.atmh;
import defpackage.awui;
import defpackage.bahw;
import defpackage.bahx;
import defpackage.bbcg;
import defpackage.cers;
import defpackage.cfva;
import defpackage.ckch;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emxf;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InsertRcsMessageInTelephonyAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ckch c;
    public final cers d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    private final errl h;
    private final atmh i;
    public static final cskc a = cskc.g("BugleDataModel", "InsertRcsMessageInTelephonyAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bahw();

    /* compiled from: PG */
    public interface a {
        bahx hR();
    }

    public InsertRcsMessageInTelephonyAction(Parcel parcel, ffbr ffbrVar, ckch ckchVar, cers cersVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3, atmh atmhVar) {
        super(parcel, eogt.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.b = ffbrVar;
        this.c = ckchVar;
        this.d = cersVar;
        this.e = errlVar;
        this.h = errlVar2;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.i = atmhVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("InsertRcsMessageInTelephonyAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertRcsMessageInTelephony.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        elfl g;
        if (this.i.a()) {
            final String l = this.t.l("conversationId");
            g = elfo.g(new Callable() { // from class: bahu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cpxu a2 = ((ayfi) InsertRcsMessageInTelephonyAction.this.g.b()).a(bdgq.b(l));
                    if (a2.c()) {
                        return Long.valueOf(a2.a());
                    }
                    return -1L;
                }
            }, this.h);
        } else {
            g = elfo.e(Long.valueOf(this.t.d("threadId")));
        }
        final bbcg bbcgVar = this.t;
        return g.i(new eroh() { // from class: bahq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                aoku u;
                long longValue = ((Long) obj).longValue();
                bbcg bbcgVar2 = bbcgVar;
                MessageIdType b = bdhb.b(bbcgVar2.l("messageId"));
                cfva cfvaVar = aoqm.a;
                boolean booleanValue = ((Boolean) new aopn().get()).booleanValue();
                final InsertRcsMessageInTelephonyAction insertRcsMessageInTelephonyAction = InsertRcsMessageInTelephonyAction.this;
                if (booleanValue && bbcgVar2.x("remoteChatEndpoint")) {
                    u = ((aolr) insertRcsMessageInTelephonyAction.f.b()).b((awui) ((eyjv) bbcgVar2.h("remoteChatEndpoint")).a(awui.a, eyfc.a()));
                } else {
                    u = ((aolr) insertRcsMessageInTelephonyAction.f.b()).u(bbcgVar2.l("senderId"), bbcgVar2.a("subId"));
                }
                int a2 = bbcgVar2.a("subId");
                String l2 = bbcgVar2.l("rcsConferenceUri");
                final boolean y = bbcgVar2.y("scheduleBusinessInfoDownload");
                MessageCoreData v = ((bdmq) insertRcsMessageInTelephonyAction.b.b()).v(b);
                final String b2 = emxe.b(u.i(((Boolean) new aopn().get()).booleanValue()));
                if (v != null) {
                    return insertRcsMessageInTelephonyAction.c.l(v, longValue, u, l2, a2).i(new eroh() { // from class: baht
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final Uri uri = (Uri) obj2;
                            if (!y) {
                                return elfo.e(uri);
                            }
                            String str = b2;
                            InsertRcsMessageInTelephonyAction insertRcsMessageInTelephonyAction2 = InsertRcsMessageInTelephonyAction.this;
                            cero ceroVar = (cero) cerr.a.createBuilder();
                            ceroVar.copyOnWrite();
                            ((cerr) ceroVar.instance).b = str;
                            ceroVar.copyOnWrite();
                            ((cerr) ceroVar.instance).d = cerq.a(6);
                            ceroVar.copyOnWrite();
                            ((cerr) ceroVar.instance).c = cerp.a(3);
                            cerr cerrVar = (cerr) ceroVar.build();
                            cetp cetpVar = new cetp();
                            cetpVar.a = str;
                            cetpVar.b = str;
                            return insertRcsMessageInTelephonyAction2.d.a(cerrVar, cetpVar.a()).h(new emwl() { // from class: bahv
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    cskc cskcVar = InsertRcsMessageInTelephonyAction.a;
                                    return uri;
                                }
                            }, insertRcsMessageInTelephonyAction2.e);
                        }
                    }, insertRcsMessageInTelephonyAction.e);
                }
                csjb b3 = InsertRcsMessageInTelephonyAction.a.b();
                b3.I("Cannot write message to telephony. Unable to read message");
                b3.A("messageId", b);
                b3.r();
                return elfo.e(null);
            }
        }, this.h).h(new emwl() { // from class: bahs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = InsertRcsMessageInTelephonyAction.a;
                return null;
            }
        }, erpp.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public InsertRcsMessageInTelephonyAction(ConversationIdType conversationIdType, MessageIdType messageIdType, awui awuiVar, int i, Optional optional, boolean z, ffbr ffbrVar, ckch ckchVar, cers cersVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3, atmh atmhVar) {
        this(messageIdType, awuiVar, i, optional, z, ffbrVar, ckchVar, cersVar, errlVar, errlVar2, ffbrVar2, ffbrVar3, atmhVar);
        emxf.l(atmhVar.a());
        this.t.v("conversationId", conversationIdType.a());
    }

    public InsertRcsMessageInTelephonyAction(MessageIdType messageIdType, awui awuiVar, int i, long j, Optional optional, boolean z, ffbr ffbrVar, ckch ckchVar, cers cersVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3, atmh atmhVar) {
        this(messageIdType, awuiVar, i, optional, z, ffbrVar, ckchVar, cersVar, errlVar, errlVar2, ffbrVar2, ffbrVar3, atmhVar);
        this.t.s("threadId", j);
    }

    public InsertRcsMessageInTelephonyAction(MessageIdType messageIdType, awui awuiVar, int i, Optional optional, boolean z, ffbr ffbrVar, ckch ckchVar, cers cersVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3, atmh atmhVar) {
        super(eogt.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.t.v("messageId", messageIdType.b());
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aopn().get()).booleanValue()) {
            this.t.t("remoteChatEndpoint", new ProtoParsers.InternalDontUse(null, awuiVar));
        }
        this.t.v("senderId", awuiVar.d);
        this.t.r("subId", i);
        this.t.p("scheduleBusinessInfoDownload", z);
        optional.ifPresent(new Consumer() { // from class: bahr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InsertRcsMessageInTelephonyAction.this.t.v("rcsConferenceUri", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b = ffbrVar;
        this.c = ckchVar;
        this.d = cersVar;
        this.e = errlVar;
        this.h = errlVar2;
        this.i = atmhVar;
    }
}
