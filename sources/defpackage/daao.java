package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daao implements aemi {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("Bugle");
    private final Context c;
    private final ffbr d;
    private MenuItem e;

    public daao(Context context, ffbr ffbrVar) {
        this.c = context;
        this.d = ffbrVar;
    }

    @Override // defpackage.aemi
    public final int a() {
        return R.id.action_mark_as_unread;
    }

    @Override // defpackage.aemi
    public final void b(Menu menu) {
        MenuItem add = menu.add(0, R.id.action_mark_as_unread, 65, this.c.getString(R.string.action_mark_as_unread));
        this.e = add;
        add.setShowAsAction(4);
        this.e.setIcon(R.drawable.messages_unread_chat_icon);
    }

    @Override // defpackage.aemi
    public final void c(Collection collection) {
        entd entdVar = b;
        ((ensz) entdVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 61, "MarkAsUnreadMenuExtension.java")).r("%d conversations selected for mark as (un)read", collection.size());
        if (collection.isEmpty()) {
            ((ensz) entdVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 63, "MarkAsUnreadMenuExtension.java")).q("No conversations to mark as (un)read.");
            return;
        }
        final boolean anyMatch = Collection.EL.stream(collection).anyMatch(new Predicate() { // from class: daal
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
                int i = daao.a;
                return ((SelectedConversation) obj).r;
            }
        });
        ((ensz) entdVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 68, "MarkAsUnreadMenuExtension.java")).t("shouldMarkUnread is %b", Boolean.valueOf(anyMatch));
        Stream map = Collection.EL.stream(collection).filter(new Predicate() { // from class: daam
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
                int i = daao.a;
                return ((SelectedConversation) obj).r == anyMatch;
            }
        }).map(new Function() { // from class: daan
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = daao.a;
                return new BugleConversationId(((SelectedConversation) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        if (anyMatch) {
            axnw.h(((alxl) this.d.b()).F(engwVar, 2));
        } else {
            axnw.h(((alxl) this.d.b()).E(engwVar, 2));
        }
    }

    @Override // defpackage.aemi
    public final void f(java.util.Collection collection) {
        if (collection.isEmpty()) {
            this.e.setVisible(false);
            return;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            SelectedConversation selectedConversation = (SelectedConversation) it.next();
            if (selectedConversation.f.d()) {
                this.e.setVisible(false);
                return;
            }
            z |= selectedConversation.r;
        }
        this.e.setIcon(z ? R.drawable.messages_unread_chat_icon : R.drawable.messages_chat_icon);
        this.e.setTitle(z ? this.c.getString(R.string.action_mark_as_unread) : this.c.getString(R.string.action_mark_as_read));
        this.e.setVisible(true);
    }

    @Override // defpackage.aemi
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.aemi
    public final /* synthetic */ void d(ea eaVar) {
    }
}
