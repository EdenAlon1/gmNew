package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.atrl;
import defpackage.awui;
import defpackage.bbaa;
import defpackage.bbab;
import defpackage.bbcg;
import defpackage.bdgq;
import defpackage.bdtd;
import defpackage.bzqb;
import defpackage.bzqj;
import defpackage.bzqk;
import defpackage.caqc;
import defpackage.cskc;
import defpackage.csux;
import defpackage.ekzz;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.endq;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationEncryptionStatusAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ffbr c;
    private final errl e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    public static final cskc a = cskc.g("BugleDataModel", "UpdateConversationEncryptionStatusAction");
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/action/UpdateConversationEncryptionStatusAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbaa();

    /* compiled from: PG */
    public interface a {
        bbab is();
    }

    public UpdateConversationEncryptionStatusAction(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Parcel parcel) {
        super(parcel, eogt.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.e = errlVar;
        this.g = ffbrVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateConversationEncryptionStatusAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        return elfo.f(new Runnable() { // from class: bazy
            @Override // java.lang.Runnable
            public final void run() {
                UpdateConversationEncryptionStatusAction.this.w();
            }
        }, erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        elfl a2;
        bbcg bbcgVar = this.t;
        ekzz f = eleg.f("UpdateConversationEncryptionStatusAction#performTask");
        try {
            ekzz f2 = eleg.f("UpdateConversationEncryptionStatusAction#performTaskForAllIdentities");
            try {
                final ConversationIdType b = bdgq.b(bbcgVar.l("conversation_id"));
                ArrayList arrayList = new ArrayList();
                ekzz f3 = eleg.f("UpdateConversationEncryptionStatusAction#getLocalSelfIdentities");
                try {
                    Stream map = Collection.EL.stream(((bdtd) this.f.b()).h()).filter(new Predicate() { // from class: bazt
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
                            return !((aztg) obj).j();
                        }
                    }).map(new Function() { // from class: bazu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            aztg aztgVar = (aztg) obj;
                            int e = aztgVar.e();
                            Optional g = ((djsi) UpdateConversationEncryptionStatusAction.this.c.b()).g(e);
                            if (g.isEmpty()) {
                                ConversationIdType conversationIdType = b;
                                csjb c = UpdateConversationEncryptionStatusAction.a.c();
                                c.I("Self identity is not RCS enabled, skipping conversation e2ee status update");
                                c.c(conversationIdType);
                                c.m(e);
                                c.M("subscriptionName", aztgVar.h());
                                c.r();
                            }
                            return g;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: bazv
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
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: bazw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((avkc) UpdateConversationEncryptionStatusAction.this.b.b()).c(((djrj) ((Optional) obj).get()).a);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    engw engwVar = (engw) map.collect(endq.a);
                    f3.close();
                    if (((atrl) this.i.b()).a() && engwVar.isEmpty()) {
                        ((bzqb) this.h.b()).i(b, 0, caqc.NO_RCS_IDENTITIES_AVAILABLE);
                        ensk h = d.h();
                        h.Y(ente.a, "BugleEtouffee");
                        enrr enrrVar = (enrr) h;
                        enrrVar.Y(csux.p, b);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/UpdateConversationEncryptionStatusAction", "downgradeEncryption", 247, "UpdateConversationEncryptionStatusAction.java")).q("No RCS identities. Disabling encryption for conversation.");
                        a2 = elfo.e(null);
                    } else {
                        int size = engwVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            bzqj a3 = ((bzqk) this.g.b()).a((awui) engwVar.get(i2), b);
                            if (bbcgVar.x("participants_added_list")) {
                                arrayList.add(a3.b((engw) Collection.EL.stream(bbcgVar.m("participants_added_list")).map(new Function() { // from class: bazs
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cskc cskcVar = UpdateConversationEncryptionStatusAction.a;
                                        return (awui) ((eyjv) obj).a(awui.a, eyfc.a());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a)));
                            } else {
                                arrayList.add(a3.a());
                            }
                        }
                        a2 = elfo.j(arrayList).a(eldl.m(new Callable() { // from class: bazz
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }), this.e);
                    }
                    f2.close();
                    f.b(a2);
                    f.close();
                    return a2.h(new emwl() { // from class: bazx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return null;
                        }
                    }, this.e);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateConversationEncryptionStatusAction(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ConversationIdType conversationIdType) {
        super(eogt.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.e = errlVar;
        this.g = ffbrVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.t.v("conversation_id", conversationIdType.a());
    }
}
