package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccjm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsIncrementalMessageRestoreUpsertRunner");
    public static final cfup b = cfvl.i(cfvl.b, "cms_check_spam_status_from_fi", false);
    public final ccml c;
    public final ffbr d;
    public final cbgf e;
    public final ffbr f;
    public final ffbr g;
    public final dtuu h;
    public final bdxd i;
    public final ffbr j;
    public final ffbr k;
    public final byzp l;
    private final errl m;
    private final errl n;

    public ccjm(ccml ccmlVar, ffbr ffbrVar, cbgf cbgfVar, ffbr ffbrVar2, ffbr ffbrVar3, dtuu dtuuVar, bdxd bdxdVar, ffbr ffbrVar4, ffbr ffbrVar5, byzp byzpVar, errl errlVar, errl errlVar2) {
        this.c = ccmlVar;
        this.d = ffbrVar;
        this.e = cbgfVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = dtuuVar;
        this.i = bdxdVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = byzpVar;
        this.m = errlVar;
        this.n = errlVar2;
    }

    public final elfl a(final eszz eszzVar) {
        return elfo.h(new erog() { // from class: ccjj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                eszz eszzVar2 = eszzVar;
                ccjm ccjmVar = ccjm.this;
                return csgj.a() ? ccjmVar.c.f(eszzVar2, true, false) : ccjmVar.c.e(eszzVar2, false);
            }
        }, this.n).h(new emwl() { // from class: ccjk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eszz eszzVar2 = eszzVar;
                Optional ofNullable = Optional.ofNullable(MessagesTable.a(eszzVar2.c));
                boolean isPresent = ofNullable.isPresent();
                final ccjm ccjmVar = ccjm.this;
                if (isPresent && !((MessagesTable.BindData) ofNullable.get()).D().c()) {
                    ccjmVar.i.a(((MessagesTable.BindData) ofNullable.get()).D());
                }
                if (((Boolean) ccjm.b.e()).booleanValue() && ofNullable.isPresent()) {
                    MessageCoreData a2 = ccjmVar.l.a();
                    a2.bZ((MessagesTable.BindData) ofNullable.get());
                    ((cukj) ccjmVar.k.b()).a(a2, null, a2.aa());
                }
                final String str = eszzVar2.c;
                Consumer consumer = new Consumer() { // from class: ccjg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        MessagesTable.BindData bindData = (MessagesTable.BindData) obj2;
                        final ConversationIdType C = bindData.C();
                        bindData.D();
                        C.getClass();
                        final ccjm ccjmVar2 = ccjm.this;
                        ccjmVar2.h.d("CmsIncrementalRestoreRunner#refreshConversationDataForMessageAndUnarchive", new Runnable() { // from class: ccji
                            @Override // java.lang.Runnable
                            public final void run() {
                                ccjm ccjmVar3 = ccjm.this;
                                bczy bczyVar = (bczy) ccjmVar3.f.b();
                                ConversationIdType conversationIdType = C;
                                byyt s = bczyVar.s(conversationIdType);
                                if (s != null && s.equals(byyt.ARCHIVED)) {
                                    s = byyt.UNARCHIVED;
                                }
                                bdfl bdflVar = (bdfl) ccjmVar3.g.b();
                                if (s == null) {
                                    s = byyt.UNARCHIVED;
                                }
                                bdflVar.b(conversationIdType, false, s);
                            }
                        });
                        ccjmVar2.e.d(C);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Runnable runnable = new Runnable() { // from class: ccjh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ensk j = ccjm.a.j();
                        j.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsIncrementalMessageRestoreUpsertRunner", "refreshConversationDataForMessageAndUnarchive", BasePaymentResult.ERROR_REQUEST_FAILED, "CmsIncrementalMessageRestoreUpsertRunner.java")).D("The message is not restored correctly. %s: %s.", cdii.e.a, str);
                    }
                };
                MessagesTable.BindData a3 = MessagesTable.a(str);
                if (a3 != null) {
                    consumer.accept(a3);
                } else {
                    runnable.run();
                }
                ((cryg) ccjmVar.d.b()).f(ofNullable.isPresent() ? ((MessagesTable.BindData) ofNullable.get()).D().b() : "", eszzVar2.c, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "success");
                return ofNullable;
            }
        }, this.m).i(new eroh() { // from class: ccjl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent() || ((MessagesTable.BindData) optional.get()).C().b() || !MessageData.cJ(((MessagesTable.BindData) optional.get()).s())) {
                    return elfo.e(null);
                }
                cins cinsVar = (cins) ccjm.this.j.b();
                ((MessagesTable.BindData) optional.get()).af();
                ((MessagesTable.BindData) optional.get()).C();
                return cinsVar.N();
            }
        }, this.m);
    }
}
