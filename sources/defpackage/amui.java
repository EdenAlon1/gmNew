package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amui implements amuc {
    public static final /* synthetic */ int d = 0;
    private static final entd e = entd.c("Bugle");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final errl f;
    private final errl g;
    private final ffbr h;

    public amui(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.f = errlVar;
        this.g = errlVar2;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.h = ffbrVar3;
        this.c = ffbrVar4;
    }

    @Override // defpackage.amuc
    public final elfl a(engw engwVar, int i) {
        ((ensz) ((ensz) e.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/markunread/MarkAsUnreadManagerImpl", "markConversationsAsRead", 82, "MarkAsUnreadManagerImpl.java")).q("beginning MarkAsUnreadManager#markConversationsAsRead");
        emxf.b(Collection.EL.stream(engwVar).allMatch(new Predicate() { // from class: amug
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
                int i2 = amui.d;
                return ((ConversationId) obj) instanceof BugleConversationId;
            }
        }), "Only BugleConversationIds are supported.");
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: amuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = amui.d;
                return ((BugleConversationId) ((ConversationId) obj)).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        ((bbfd) this.h.b()).g((ConversationIdType[]) ((engw) map.collect(endq.a)).toArray(new ConversationIdType[0]), bdhb.a).t();
        ((amub) this.c.b()).a(2, i, engwVar.size());
        return elfo.e(null);
    }

    @Override // defpackage.amuc
    public final elfl b(final engw engwVar, final int i) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: amud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = amui.d;
                return bdgq.b(((ConversationId) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        final engw engwVar2 = (engw) map.collect(endq.a);
        return axnw.a(elfo.f(new Runnable() { // from class: amue
            @Override // java.lang.Runnable
            public final void run() {
                amui amuiVar = amui.this;
                cesm.k((bczy) amuiVar.a.b(), (cbgf) amuiVar.b.b(), engwVar2, true);
            }
        }, this.f)).h(new emwl() { // from class: amuf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((amub) amui.this.c.b()).a(3, i, engwVar.size());
                return null;
            }
        }, this.g);
    }
}
