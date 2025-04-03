package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ammx;
import defpackage.aqux;
import defpackage.aquz;
import defpackage.aqvf;
import defpackage.aqvh;
import defpackage.axad;
import defpackage.bafo;
import defpackage.bbeq;
import defpackage.cqoh;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emxe;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GetOrCreateConversationAction extends Action<ConversationIdType> implements Parcelable {
    public static final Parcelable.Creator<Action<ConversationIdType>> CREATOR = new bafo();
    public final cqoh a;
    public final ffbr b;
    private final ffbr c;
    private final errl d;

    /* compiled from: PG */
    public interface a {
        bbeq aQ();
    }

    public GetOrCreateConversationAction(cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, Parcel parcel) {
        super(parcel, eogt.GET_OR_CREATE_CONVERSATION_ACTION);
        this.a = cqohVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("GetOrCreateConversationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GetOrCreateConversation.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl d;
        SelfIdentityId c = aqvf.c(this.t.l("self_identity"));
        if (emxe.c(aquz.b(c))) {
            d = elfo.e(Optional.empty());
        } else {
            aqvh aqvhVar = (aqvh) this.c.b();
            c.getClass();
            d = aqvhVar.d(c);
        }
        return d.i(new eroh() { // from class: bafn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                axad build;
                GetOrCreateConversationAction getOrCreateConversationAction = GetOrCreateConversationAction.this;
                Optional optional = (Optional) obj;
                String l = getOrCreateConversationAction.t.l("trace_id");
                ammx ammxVar = (ammx) getOrCreateConversationAction.b.b();
                long epochMilli = getOrCreateConversationAction.a.f().toEpochMilli();
                bbcg bbcgVar = getOrCreateConversationAction.t;
                String l2 = bbcgVar.l("conversation_name");
                boolean y = bbcgVar.y("is_rcs_group_conversation");
                engw n = engw.n(bbcgVar.m("participants_list"));
                Optional empty = Optional.empty();
                if (l == null) {
                    build = null;
                } else {
                    axac createBuilder = axad.a.createBuilder();
                    createBuilder.copyOnWrite();
                    axad axadVar = (axad) createBuilder.instance;
                    axadVar.b |= 1;
                    axadVar.c = l;
                    build = createBuilder.build();
                }
                return ammxVar.a(epochMilli, l2, y, optional, n, empty, build);
            }
        }, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public GetOrCreateConversationAction(cqoh cqohVar, ffbr<ammx> ffbrVar, ffbr<aqvh> ffbrVar2, errl errlVar, Optional<aqux> optional, List<ParticipantsTable.BindData> list, boolean z, String str, axad axadVar) {
        super(eogt.GET_OR_CREATE_CONVERSATION_ACTION);
        this.a = cqohVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
        if (list != null) {
            this.t.u("participants_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        this.t.p("is_rcs_group_conversation", z);
        if (str != null) {
            this.t.v("conversation_name", str);
        }
        if (axadVar != null) {
            this.t.v("trace_id", axadVar.c);
        }
        optional.map(new Function() { // from class: bafl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aqux) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: bafm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GetOrCreateConversationAction.this.t.v("self_identity", ((SelfIdentityId) obj).c());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
