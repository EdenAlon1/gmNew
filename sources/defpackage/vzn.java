package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzn {
    public final boolean A;
    public final boolean B;
    public final ayhd C;
    public final ffbr H;
    public final a I;
    private final ffbr K;
    public bcuj c;
    public vzw d;
    public vzt e;
    public String g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final fazb l;
    public final ffbr m;
    public final ffbr n;
    public final fazb o;
    public final fazb p;
    public final fazb q;
    public final fazb r;
    public final ffbr s;
    public final fazb t;
    public final fazb u;
    public final ffbr v;
    public final ffbr w;
    public final vzg x;
    public final ConversationIdType y;
    public final ConversationId z;
    public static final cskc a = cskc.g("Bugle", "ConversationSettingsFragment");
    public static final entd b = entd.c("BugleNotifications");
    private static final entd J = entd.c("BugleNotifications");
    public Optional f = Optional.empty();
    public final ejwd D = new ejwd<Optional<String>>() { // from class: vzn.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            vzn.a.r("Error getting group name data for conversation settings, conversationId: ".concat(String.valueOf(String.valueOf(vzn.this.y))));
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                vzt vztVar = vzn.this.e;
                vztVar.a = (String) optional.get();
                vztVar.q(0);
            }
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    };
    public final ejlr E = new ejlr<Void, Boolean>() { // from class: vzn.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (((Boolean) obj2).booleanValue()) {
                return;
            }
            vzn.a.r("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(vzn.this.y))));
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vzn.a.r("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(vzn.this.y))));
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr F = new ejlr<ParticipantsTable.BindData, Void>() { // from class: vzn.3
        @Override // defpackage.ejlr
        public final /* synthetic */ void c(Object obj, Object obj2) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            sxp sxpVar = (sxp) vzn.this.s.b();
            sxn g = sxo.g();
            String P = bindData.P();
            P.getClass();
            ((sxj) g).a = P;
            g.g(bindData.Y(), false);
            g.h(bindData.ab(), false);
            sxpVar.b(g.f());
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vzn.a.r("Error unblocking destination");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr G = new ejlr<Void, eyjv<ajkn>>() { // from class: vzn.4
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            vzn vznVar = vzn.this;
            vzg vzgVar = vznVar.x;
            vzgVar.getClass();
            Context z = vzgVar.z();
            ffbr ffbrVar = vznVar.j;
            ffbrVar.getClass();
            eldl.p(z, ((ajjp) ((Optional) ffbrVar.b()).orElseThrow()).a(z, (ajkn) ((eyjv) obj2).a(ajkn.a, eyfc.a())));
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((ensz) ((ensz) ((ensz) vzn.b.j()).g(th)).h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer$4", "onFailure", (char) 287, "ConversationSettingsBaseFragmentPeer.java")).q("Missing self identity, can't show security key");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public vzn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, fazb fazbVar, ffbr ffbrVar6, ffbr ffbrVar7, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5, ffbr ffbrVar8, fazb fazbVar6, fazb fazbVar7, ffbr ffbrVar9, vzg vzgVar, ffbr ffbrVar10, ffbr ffbrVar11, vzi vziVar) {
        this.H = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = fazbVar;
        this.m = ffbrVar6;
        this.n = ffbrVar7;
        this.o = fazbVar2;
        this.p = fazbVar3;
        this.q = fazbVar4;
        this.r = fazbVar5;
        this.s = ffbrVar8;
        this.t = fazbVar6;
        this.u = fazbVar7;
        this.v = ffbrVar9;
        this.K = ffbrVar10;
        this.w = ffbrVar11;
        this.x = vzgVar;
        ConversationIdType b2 = bdgq.b(vziVar.b);
        this.y = b2;
        this.z = new BugleConversationId(b2);
        this.B = vziVar.d;
        this.A = vziVar.c;
        ayhd b3 = ayhd.b(vziVar.f);
        this.C = b3 == null ? ayhd.UNRECOGNIZED : b3;
        this.I = new a();
    }

    public final void a(String str) {
        Intent b2 = ((cjam) this.K.b()).b(str, ((csll) this.n.b()).f(this.y), this.y);
        if (b2 != null) {
            this.x.startActivityForResult(b2, 1001);
            return;
        }
        ensz enszVar = (ensz) J.j();
        enszVar.Y(csux.o, this.y.a());
        enszVar.Y(cird.t, ((csll) this.n.b()).f(this.y));
        ((ensz) enszVar.h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer", "createAndOpenNotificationChannel", 696, "ConversationSettingsBaseFragmentPeer.java")).q("intent is null, unable to open notification channel settings");
    }

    /* compiled from: PG */
    final class b implements ejwd<bcum> {
        private final Consumer a;
        private final Consumer b;

        public b(Consumer consumer, Consumer consumer2) {
            this.a = consumer;
            this.b = consumer2;
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            this.b.o(th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            this.a.o((bcum) obj);
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Void, Boolean> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (!((Boolean) obj2).booleanValue()) {
                vzn.a.r("Error creating shortcut, can't open notification settings");
                return;
            }
            vzn vznVar = vzn.this;
            vzt vztVar = vznVar.e;
            vztVar.getClass();
            vznVar.a(vztVar.a);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            vzn.a.r("Error creating shortcut, can't open notification settings");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
