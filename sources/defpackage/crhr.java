package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crhr extends cslh {
    public final String a;
    public ContactIconView b;
    private final altk c;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final Optional n;
    private final eorw o;

    public crhr(altk altkVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, String str, ContactIconView contactIconView, eorw eorwVar) {
        super("Bugle.Async.ContactIconView.onClick.Duration", null);
        this.c = altkVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = optional;
        this.a = str;
        this.b = contactIconView;
        this.o = eorwVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        Optional of;
        if (((bdrr) this.m.b()).c(this.a) == null) {
            of = Optional.empty();
        } else {
            Object obj = this.o;
            eorw eorwVar = eorw.UNKNOWN_BIZINFO_EVENT_SOURCE;
            if (eorwVar == obj || (eorwVar != null && obj != null && eorwVar.equals(obj))) {
                csix.o(a.E(obj, eorwVar, "Expected anything but ", " but got "));
            }
            this.c.aH(2, this.o, this.a);
            ConversationIdType a = ((bdga) this.l.b()).a(this.a);
            of = Optional.of(new crhm(a, a.b() ? 0 : ((bczy) this.k.b()).a(a), true));
        }
        if (of.isPresent()) {
            return of;
        }
        ParticipantsTable.BindData d = ((bdrr) this.m.b()).d(this.a);
        Optional empty = (d == null || !d.D().a()) ? Optional.empty() : Optional.of(new crhm(((bdga) this.l.b()).a(this.a), 0, false));
        return empty.isPresent() ? empty : Optional.empty();
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        final Optional optional = (Optional) obj;
        final ContactIconView contactIconView = this.b;
        if (contactIconView == null) {
            return;
        }
        if (optional.isEmpty()) {
            if (contactIconView.isAttachedToWindow()) {
                contactIconView.k();
                return;
            }
            return;
        }
        final ConversationIdType b = ((crhp) optional.get()).b();
        if (b.b()) {
            ensk j = ContactIconView.h.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/ui/ContactIconView$OpenConversationSettingsTask", "doPostExecute", 409, "ContactIconView.java")).q("Can't launch Info & Options page. RBM bot conversation ID is empty");
        } else if (contactIconView.isAttachedToWindow()) {
            this.n.ifPresent(new Consumer() { // from class: crhq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    Optional optional2 = optional;
                    vzx vzxVar = (vzx) obj2;
                    boolean c = ((crhp) optional2.get()).c();
                    ContactIconView contactIconView2 = contactIconView;
                    ConversationIdType conversationIdType = b;
                    if (!c) {
                        vzxVar.d(contactIconView2.getContext(), conversationIdType, false, ((crhp) optional2.get()).a(), false, false, 0, 0);
                    } else {
                        vzx.e(contactIconView2.getContext(), conversationIdType, crhr.this.a);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
