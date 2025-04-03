package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.axnw;
import defpackage.baca;
import defpackage.barp;
import defpackage.barq;
import defpackage.barv;
import defpackage.barw;
import defpackage.bdhb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.eogt;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveP2pSuggestionsAction extends Action<Void> implements Parcelable {
    private final barw b;
    private static final cskc a = cskc.g("BugleDataModel", "ReceiveP2pSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new barp();

    /* compiled from: PG */
    public interface a {
        barq ih();
    }

    public ReceiveP2pSuggestionsAction(barw barwVar, Bundle bundle) {
        super(bundle, eogt.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = barwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReceiveP2pSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        h();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl e;
        ekzz f = eleg.f("ReceiveP2pSuggestionsAction.executeActionAsync");
        try {
            try {
                MessageIdType b = bdhb.b(this.t.l("target_message_id"));
                e = this.b.d(b, this.t.m("rcs.intent.extra.conversationClassifications"), new Supplier() { // from class: bari
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (ArrayList) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS)).map(new Function() { // from class: barl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbxa) ((eyjv) ((Parcelable) obj)).a(fbxa.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                }, new Supplier() { // from class: barj
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m("rcs.intent.extra.messageClassifications")).map(new Function() { // from class: baro
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbwv) ((eyjv) ((Parcelable) obj)).a(fbwv.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                }, new Supplier() { // from class: bark
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m("rcs.intent.extra.conversationTags")).map(new Function() { // from class: bard
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbwv) ((eyjv) ((Parcelable) obj)).a(fbwv.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                });
                f.b(e);
            } catch (BadParcelableException unused) {
                a.n("Failed to unparcel parameters.");
                e = elfo.e(null);
            }
            f.close();
            return e;
        } finally {
        }
    }

    public final void h() {
        Object obj;
        ekzz f = eleg.f("ReceiveP2pSuggestionsAction.executeAction");
        try {
            try {
                MessageIdType b = bdhb.b(this.t.l("target_message_id"));
                ArrayList E = this.t.E(new ArrayList());
                barw barwVar = this.b;
                Supplier supplier = new Supplier() { // from class: barc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (ArrayList) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS)).map(new Function() { // from class: bare
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbxa) ((eyjv) ((Parcelable) obj2)).a(fbxa.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                };
                Supplier supplier2 = new Supplier() { // from class: barg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m("rcs.intent.extra.messageClassifications")).map(new Function() { // from class: barf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbwv) ((eyjv) ((Parcelable) obj2)).a(fbwv.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                };
                Supplier supplier3 = new Supplier() { // from class: barh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(ReceiveP2pSuggestionsAction.this.t.m("rcs.intent.extra.conversationTags")).map(new Function() { // from class: barn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (fbwv) ((eyjv) ((Parcelable) obj2)).a(fbwv.a, eyfc.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new barm()));
                    }
                };
                obj = supplier2.get();
                List list = (List) obj;
                barv a2 = barwVar.a(b);
                if (a2 != null) {
                    barwVar.a.a(b, E, list, ((baca) a2).b);
                }
                barwVar.e(b, supplier);
                axnw.h(barwVar.c(b, supplier2));
                axnw.h(barwVar.b(b, supplier3));
            } catch (BadParcelableException unused) {
                a.n("Failed to unparcel parameters.");
            }
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReceiveP2pSuggestionsAction(barw barwVar, Parcel parcel) {
        super(parcel, eogt.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = barwVar;
    }
}
