package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeh {
    public final errl a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final bbeq e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public adeh(errl errlVar, bbeq bbeqVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.a = errlVar;
        this.e = bbeqVar;
        this.f = ffbrVar;
        this.b = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.c = ffbrVar6;
        this.d = ffbrVar7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl a(engw engwVar) {
        int i = 0;
        if (((auea) this.f.b()).a()) {
            if (engwVar.isEmpty()) {
                throw new IllegalArgumentException("No destinations specified for conversation creation");
            }
            HashSet hashSet = new HashSet(engwVar.size());
            final engr engrVar = new engr();
            int size = engwVar.size();
            while (i < size) {
                String str = (String) engwVar.get(i);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Empty destination");
                }
                final aoku n = ((aolr) this.i.b()).n(str);
                String l = n.l();
                if (n.x() || TextUtils.isEmpty(l)) {
                    throw new IllegalArgumentException("Invalid normalized destination");
                }
                if (!hashSet.add(n)) {
                    throw new IllegalArgumentException("Duplicate destinations: " + ((aoku) Collection.EL.stream(hashSet).filter(new Predicate() { // from class: adef
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
                            return ((aoku) obj).equals(aoku.this);
                        }
                    }).findFirst().orElseThrow()).n() + " and " + str);
                }
                engrVar.h(((aqkp) this.h.b()).f(n));
                i++;
            }
            return ((aqvh) this.g.b()).e().i(new eroh() { // from class: adeg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final adeh adehVar = adeh.this;
                    return ((alxl) adehVar.b.b()).m((Optional) obj, engrVar.g(), null).i(new eroh() { // from class: adeb
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final Conversation conversation = (Conversation) obj2;
                            elfl b = conversation.h().b();
                            final adeh adehVar2 = adeh.this;
                            return b.h(new emwl() { // from class: adee
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    boolean u = ((alxj) obj3).u();
                                    Conversation conversation2 = conversation;
                                    if (u) {
                                        throw new fedn(Status.l.withDescription("Null conversation for conversationId: ".concat(String.valueOf(conversation2.d().b()))));
                                    }
                                    cpxu a = ((ayfi) adeh.this.d.b()).a(bdgq.b(conversation2.d().b()));
                                    if (a.d()) {
                                        throw new fedn(Status.l.withDescription("Invalid threadId for conversationId: ".concat(String.valueOf(conversation2.d().b()))));
                                    }
                                    adbc adbcVar = (adbc) adbd.a.createBuilder();
                                    long a2 = a.a();
                                    adbcVar.copyOnWrite();
                                    ((adbd) adbcVar.instance).b = a2;
                                    return (adbd) adbcVar.build();
                                }
                            }, adehVar2.a);
                        }
                    }, adehVar.a).f(Exception.class, new eroh() { // from class: adec
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            throw new fedn(Status.l.withDescription("Failed to create conversation: ".concat(String.valueOf(((Exception) obj2).getMessage()))));
                        }
                    }, adehVar.a);
                }
            }, this.a);
        }
        HashMap hashMap = new HashMap();
        int size2 = engwVar.size();
        while (i < size2) {
            String str2 = (String) engwVar.get(i);
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("Empty destination");
            }
            ParticipantsTable.BindData b = bdqu.b(str2);
            String U = b.U();
            if (TextUtils.isEmpty(U)) {
                throw new IllegalArgumentException("Invalid normalized destination");
            }
            if (hashMap.containsKey(U)) {
                throw new IllegalArgumentException("Duplicate destinations: " + ((ParticipantsTable.BindData) hashMap.get(U)).W() + " and " + b.W());
            }
            hashMap.put(U, b);
            i++;
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("No destinations specified for conversation creation");
        }
        return elfl.g(this.e.a(Optional.empty(), arrayList, false, null, null).s()).h(new emwl() { // from class: aded
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                adbc adbcVar = (adbc) adbd.a.createBuilder();
                if (conversationIdType.b()) {
                    throw new fedn(Status.l.withDescription("Null conversationId after getOrCreateConversationForService"));
                }
                adeh adehVar = adeh.this;
                if (((bczy) adehVar.c.b()).r(conversationIdType) == null) {
                    throw new fedn(Status.l.withDescription("Null conversation for conversationId: ".concat(String.valueOf(String.valueOf(conversationIdType)))));
                }
                cpxu a = ((ayfi) adehVar.d.b()).a(conversationIdType);
                if (a.d()) {
                    throw new fedn(Status.l.withDescription("Invalid threadId for conversationId: ".concat(String.valueOf(String.valueOf(conversationIdType)))));
                }
                long a2 = a.a();
                adbcVar.copyOnWrite();
                ((adbd) adbcVar.instance).b = a2;
                return (adbd) adbcVar.build();
            }
        }, this.a);
    }
}
