package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.rcs.client.messaging.GroupMember;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dijj implements dkju, dkhe {
    final /* synthetic */ dijk a;
    private final long b;
    private final dkkj c;

    public dijj(dijk dijkVar, dkkj dkkjVar, long j) {
        this.a = dijkVar;
        this.c = dkkjVar;
        this.b = j;
    }

    private final void A() {
        if (this.c.E) {
            dkty.c("Unregistering group session %d", Long.valueOf(this.b));
            this.a.j.c(this.b);
        }
    }

    private final GroupChatSessionEvent B(long j, long j2) {
        dkmq dkmqVar = new dkmq(50003, j, j2);
        GroupInfo g = this.a.g(this.b);
        if (g == null) {
            dkty.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(this.b));
        } else {
            dkmqVar.a(g);
        }
        return new GroupChatSessionEvent(dkmqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GroupChatSessionEvent C(int i, long j) {
        Optional of;
        dkmq dkmqVar = new dkmq(i, j, 0L);
        GroupInfo g = this.a.g(this.b);
        if (g == null) {
            dkty.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(this.b));
        } else {
            dkmqVar.a(g);
        }
        if (((Boolean) dijk.a.a()).booleanValue()) {
            long j2 = this.b;
            Optional q = this.a.q(j2);
            if (q.isEmpty()) {
                of = Optional.empty();
            } else {
                dkty.c("Creating group information from group session data for session %d", Long.valueOf(j2));
                dkrn dkrnVar = (dkrn) q.get();
                final ehyr ehyrVar = new ehyr();
                ehyrVar.a = dkrnVar.d;
                ehyrVar.c((String) dkrnVar.f.orElse(this.c.q));
                ehyrVar.b((String) dkrnVar.e.orElse(this.c.I));
                enip aA = this.c.aA();
                ehyu ehyuVar = new ehyu();
                ehyuVar.b(aA.contains(GroupManagementContentType.CONTENT_TYPE));
                ehyrVar.d = Optional.of(ehyuVar.a());
                Optional optional = dkrnVar.b;
                if (optional.isEmpty()) {
                    of = Optional.of(ehyrVar.a());
                } else {
                    ((dilk) optional.get()).a.ifPresent(new Consumer() { // from class: diji
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            Optional optional2 = ((dilf) obj).c;
                            final eiav eiavVar = eiav.this;
                            optional2.ifPresent(new Consumer() { // from class: dijh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    dimc dimcVar = (dimc) obj2;
                                    final ehzo ehzoVar = new ehzo();
                                    try {
                                        ehzoVar.a = Optional.of(eica.c(dimcVar.a));
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    eiav eiavVar2 = eiav.this;
                                    dimcVar.b.ifPresent(new Consumer() { // from class: eicr
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj3) {
                                            ((ehzo) eics.this).b = Optional.of(Instant.ofEpochMilli(((dktc) obj3).a));
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ((ehyr) eiavVar2).e = Optional.of(ehzoVar.a());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    dimh dimhVar = ((dilk) optional.get()).d;
                    if (dimhVar == null || dimhVar.isEmpty()) {
                        of = Optional.of(ehyrVar.a());
                    } else {
                        int size = dimhVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dimg dimgVar = (dimg) dimhVar.get(i2);
                            if (dimgVar.g()) {
                                eiay e = GroupMember.e();
                                ehys ehysVar = (ehys) e;
                                ehysVar.a = eica.c(dimgVar.g);
                                e.b(TextUtils.isEmpty(dimgVar.a) ? dimgVar.g : dimgVar.a);
                                e.c(dimgVar.i);
                                Optional flatMap = dimgVar.b().flatMap(new Function() { // from class: diiw
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((dils) obj).b;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (flatMap.isPresent()) {
                                    String str = ((dilu) flatMap.get()).d;
                                    if (!TextUtils.isEmpty(str)) {
                                        ehysVar.b = Optional.of(eica.c(str));
                                    }
                                }
                                GroupMember a = e.a();
                                if (ehyrVar.b == null) {
                                    if (ehyrVar.c == null) {
                                        int i3 = engw.d;
                                        ehyrVar.b = new engr();
                                    } else {
                                        int i4 = engw.d;
                                        ehyrVar.b = new engr();
                                        ehyrVar.b.j(ehyrVar.c);
                                        ehyrVar.c = null;
                                    }
                                }
                                ehyrVar.b.h(a);
                            }
                        }
                        of = Optional.of(ehyrVar.a());
                    }
                }
            }
            if (of.isEmpty()) {
                dkty.q("Null GroupInformation for group session. RCS session id: %s", Long.valueOf(this.b));
            } else {
                dkmqVar.i = Optional.of(of.get());
            }
        }
        return new GroupChatSessionEvent(dkmqVar);
    }

    private static final int D(int i) {
        if (i == 4) {
            return 12;
        }
        if (i == 5) {
            return 52;
        }
        if (i == 51) {
            return 56;
        }
        if (i == 408) {
            return 3;
        }
        if (i == 477 || i == 480) {
            return 2;
        }
        if (i == 486) {
            return 4;
        }
        if (i == 603) {
            return 3;
        }
        if (i == 403) {
            return 9;
        }
        if (i == 404) {
            return 1;
        }
        switch (i) {
            case 7:
                return 16;
            case 8:
                return 14;
            case 9:
                return 17;
            case 10:
                return 18;
            case 11:
                return 13;
            default:
                return i;
        }
    }

    private final void v(long j) {
        dkkj dkkjVar = (dkkj) this.a.e.get(Long.valueOf(this.b));
        if (dkkjVar != this.c) {
            return;
        }
        y();
        if (!dkkjVar.E) {
            this.a.g.c(new ChatSessionEvent(50005, this.b, j), dkuj.IMS_CHAT_SESSION_PROVIDER);
            z();
        } else if (dkkjVar.aw() != dkhm.DISCONNECT) {
            this.a.g.c(new GroupChatSessionEvent(new dkmq(50005, this.b, 0L)), dkuj.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    private final void w() {
        dkty.c("Group chat has been terminated by the server and is no longer available! \n  Session ID: %d,\n  Group-ID: %s", Long.valueOf(this.b), this.c.w());
        y();
        A();
        this.a.f.remove(Long.valueOf(this.b));
        this.a.g.c(new GroupChatSessionEvent(new dkmq(50005, this.b, 6L)), dkuj.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void x(long j) {
        this.a.g.c(this.c.E ? B(this.b, j) : new ChatSessionEvent(50003, this.b, j), dkuj.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void y() {
        dkty.c("Releasing session %d", Long.valueOf(this.b));
        this.a.e.remove(Long.valueOf(this.b));
        this.c.aW(this.b, null);
    }

    private final void z() {
        dkhx dkhxVar;
        dkkj dkkjVar = this.c;
        if (dkkjVar.E || (dkhxVar = this.a.l) == null) {
            return;
        }
        dkhxVar.a(dkkjVar.z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // defpackage.dkjz
    public final void a(dkjt dkjtVar, int i) {
        ChatSessionMessageEvent chatSessionMessageEvent;
        ?? r3;
        if (dkjtVar != null) {
            dkty.g("message transfer failed for message %s, type %s", dkjtVar.k, dkjtVar.a.toString());
            dkjs dkjsVar = dkjtVar.a;
            if (dkjsVar == dkjs.IS_COMPOSING_INDICATOR || dkjtVar.k == null) {
                return;
            }
            if (dkjsVar == dkjs.DISPOSITION_NOTIFICATION) {
                throw null;
            }
            long j = i;
            dkjw dkjwVar = this.c.S;
            String str = dkjtVar.c;
            String h = str == null ? this.a.h(this.b) : dkut.k(str, this.a.n);
            dkkj dkkjVar = this.c;
            boolean z = dkkjVar.E;
            boolean z2 = z && dkut.A(str, dkkjVar.I);
            dkkj dkkjVar2 = this.c;
            int i2 = dijm.a;
            String x = dkkjVar2.x();
            String str2 = dkjtVar.k;
            if (str2 == null) {
                str2 = dktj.a().f();
            }
            String str3 = str2;
            Duration duration = ((dkjc) dkjwVar).b;
            if ("message/cpim".equalsIgnoreCase(dkjtVar.h)) {
                try {
                    edzi b = edzi.b(dkjtVar.f);
                    chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str3, z2, dkjtVar.j, h, x, b.e(), b.c, z, duration);
                    String g = b.g("urn:ietf:params:imdn", "Disposition-Notification");
                    if (g == null) {
                        r3 = 0;
                    } else {
                        boolean contains = g.contains("positive-delivery");
                        boolean z3 = contains;
                        if (g.contains("negative-delivery")) {
                            z3 = (contains ? 1 : 0) | 2;
                        }
                        boolean z4 = z3;
                        if (g.contains("display")) {
                            z4 = (z3 ? 1 : 0) | '\b';
                        }
                        r3 = z4;
                        if (g.contains("processing")) {
                            r3 = (z4 ? 1 : 0) | 4;
                        }
                    }
                    dkty.c("Requested reports: %d", Integer.valueOf((int) r3));
                    chatSessionMessageEvent.e = r3;
                } catch (Exception e) {
                    dkty.i(e, "Error while reading message: %s", e.getMessage());
                    chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str3, z2, dkjtVar.j, h, x, null, null, z, duration);
                }
            } else {
                chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str3, z2, dkjtVar.j, h, x, dkjtVar.h, dkjtVar.f, z, duration);
            }
            chatSessionMessageEvent.b = dkjtVar.j;
            this.a.g.c(chatSessionMessageEvent, dkuj.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    @Override // defpackage.dkjz
    public final void b(dkjt dkjtVar) {
        dkty.c("Message transferred successfully, ID %s, type %s", dkjtVar.k, dkjtVar.a.toString());
        dkkj dkkjVar = this.c;
        boolean z = dkkjVar.E;
        dkjs dkjsVar = dkjtVar.a;
        if (dkjsVar == dkjs.IS_COMPOSING_INDICATOR) {
            return;
        }
        if (dkjsVar != dkjs.DISPOSITION_NOTIFICATION) {
            this.a.g.c(new ChatSessionMessageEvent(this.b, dkjtVar.k, dkjtVar.j, 50030, z ? dkkjVar.I : dkkjVar.o, z), dkuj.IMS_CHAT_SESSION_PROVIDER);
        } else {
            throw null;
        }
    }

    @Override // defpackage.dkjz
    public final void c(dkjt dkjtVar) {
        dijk dijkVar = this.a;
        dkkj dkkjVar = this.c;
        String str = dkjtVar.c;
        String k = str == null ? dkkjVar.E ? dkut.k(dkkjVar.I, dijkVar.n) : dkkjVar.o : dkkjVar.E ? dkut.k(str, dijkVar.n) : dkkjVar.o;
        long j = this.b;
        if (k == null) {
            dkty.g("Unable to retrieve sender userId for message %s, session %d", dkjtVar.toString(), Long.valueOf(j));
            return;
        }
        try {
            dijkVar.q.a(dkjtVar, j, k);
        } catch (Exception e) {
            dkty.i(e, "Error while processing message: %s", dkjtVar);
        }
    }

    @Override // defpackage.dkju
    public final void d() {
        dkty.c("Received conference NOTIFY. Notifying updated group state", new Object[0]);
        Optional a = this.a.j.a(this.b);
        if (a.isPresent()) {
            Optional optional = ((dkrn) a.get()).b;
            if (optional.isPresent() && ((dilk) optional.get()).a.isPresent() && ((dilf) ((dilk) optional.get()).a.get()).b.isPresent()) {
                Object obj = ((dilf) ((dilk) optional.get()).a.get()).b.get();
                this.c.q = (String) obj;
                dijk dijkVar = this.a;
                long j = this.b;
                dkrp dkrpVar = dijkVar.j;
                synchronized (dkrpVar.b) {
                    Long valueOf = Long.valueOf(j);
                    dkty.c("Updating subject for session %d to %s", valueOf, dktx.MESSAGE_CONTENT.c(obj));
                    dkrn dkrnVar = (dkrn) dkrpVar.b.get(valueOf);
                    if (dkrnVar == null) {
                        dkty.g("No group found for ID %d. Cannot update subject.", valueOf);
                    } else {
                        dkrnVar.f = Optional.of(obj);
                        try {
                            dkrpVar.d();
                        } catch (IOException e) {
                            dkty.i(e, "Error while saving groups: %s", e.getMessage());
                        }
                    }
                }
            }
        }
        this.a.g.c(C(50046, this.b), dkuj.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dkhd
    public final void e() {
        dkkj dkkjVar = (dkkj) this.a.e.get(Long.valueOf(this.b));
        if (dkkjVar != this.c) {
            return;
        }
        y();
        if (dkkjVar.p) {
            x(5L);
        } else {
            x(4L);
        }
    }

    @Override // defpackage.dkhd
    public final void f() {
        dkkj dkkjVar = (dkkj) this.a.e.get(Long.valueOf(this.b));
        if (dkkjVar != this.c) {
            return;
        }
        y();
        if (dkkjVar.p) {
            x(4L);
        } else {
            x(5L);
        }
    }

    @Override // defpackage.dkhd
    public final void g(dkqs dkqsVar) {
        dkty.k("Session start failed with exception: %d for session %d", Integer.valueOf(dkqsVar.a), Long.valueOf(this.b));
        y();
        x(D(dkqsVar.a));
    }

    @Override // defpackage.dkhd
    public final void h(int i, String str) {
        dkty.k("Session start failed: %d %s for session %d", Integer.valueOf(i), str, Long.valueOf(this.b));
        dkkj dkkjVar = (dkkj) this.a.e.get(Long.valueOf(this.b));
        if (dkkjVar != this.c) {
            return;
        }
        y();
        if (!dkkjVar.E) {
            int D = D(i);
            z();
            this.a.g.c(new ChatSessionEvent(50003, this.b, D), dkuj.IMS_CHAT_SESSION_PROVIDER);
            return;
        }
        dkjj dkjjVar = this.c.O;
        dkty.g("Group session start failed with connecting method %s", dkjjVar.toString());
        if (i == 488) {
            w();
            return;
        }
        if (dkjjVar == dkjj.CONFERENCE_FACTORY_URI) {
            A();
        }
        if (i == 404) {
            if (dkjjVar == dkjj.CONFERENCE_URI) {
                Optional a = this.a.j.a(this.b);
                if (a.isEmpty()) {
                    dkty.q("Unable to reconnect to conference without valid group session data!", new Object[0]);
                    return;
                }
                Pair n = this.a.n(dkjj.GROUP_ID, (dkrn) a.get());
                dkkj dkkjVar2 = (dkkj) n.second;
                if (((ChatSessionServiceResult) n.first).succeeded() && !Objects.isNull(dkkjVar2)) {
                    dijk dijkVar = this.a;
                    long j = this.b;
                    dkty.c("Transferring queued messages from %s to %s", dkkjVar.toString(), dkkjVar2.toString());
                    if (!dkkjVar.K.isEmpty()) {
                        ArrayList arrayList = new ArrayList(dkkjVar.K.size());
                        dkkjVar.K.drainTo(arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dijkVar.x(j, dkkjVar2, (dkjt) it.next());
                        }
                    }
                }
            }
            i = 404;
        }
        this.a.f.remove(Long.valueOf(this.b));
        this.a.g.c(B(this.b, D(i)), dkuj.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dkhd
    public final void i() {
        if (this.c.E) {
            Optional a = this.a.j.a(this.b);
            if (a.isPresent()) {
                dkty.c("Subscribe to group session: %d", Long.valueOf(this.b));
                String str = this.c.I;
                if (str == null) {
                    dkty.g("No conference uri. Cannot subscribe.", new Object[0]);
                } else {
                    dijk dijkVar = this.a;
                    long j = this.b;
                    dkrp dkrpVar = dijkVar.j;
                    synchronized (dkrpVar.b) {
                        Long valueOf = Long.valueOf(j);
                        dkty.c("Updating conference URI for session %d to %s", valueOf, str);
                        dkrn dkrnVar = (dkrn) dkrpVar.b.get(valueOf);
                        if (dkrnVar == null) {
                            dkty.g("No group found for ID %d. Cannot update conference URI.", valueOf);
                        } else {
                            dkrnVar.e = Optional.of(str);
                            try {
                                dkrpVar.d();
                            } catch (IOException e) {
                                dkty.i(e, "Error while saving groups: %s", e.getMessage());
                            }
                        }
                    }
                    this.a.i.p(this.b);
                    this.c.aW(this.b, (dkhi) ((dkrn) a.get()).c.orElse(null));
                }
            } else {
                dkty.g("Group not known. Cannot subscribe to session: %s", Long.valueOf(this.b));
            }
        }
        this.a.g.c(this.c.E ? C(50002, this.b) : new ChatSessionEvent(50002, this.b, 0L), dkuj.IMS_CHAT_SESSION_PROVIDER);
        dijl dijlVar = (dijl) this.a.f.remove(Long.valueOf(this.b));
        if (dijlVar != null) {
            dkty.c("Performing session started action: %s", dijlVar.toString());
            try {
                dijlVar.a();
            } catch (Exception e2) {
                dkty.s(e2, "Unable to execute session started action %s", dijlVar.toString());
            }
        }
    }

    @Override // defpackage.dkhd
    public final void j() {
        dkty.c("Session %d starting", Long.valueOf(this.b));
    }

    @Override // defpackage.dkhd
    public final void k() {
        v(0L);
    }

    @Override // defpackage.dkhd
    public final void l(dkqs dkqsVar) {
        v(dkqsVar.a);
    }

    @Override // defpackage.dkhd
    public final void m() {
        if (((dkkj) this.a.e.get(Long.valueOf(this.b))) != this.c) {
            return;
        }
        y();
        dkkj dkkjVar = this.c;
        if (dkkjVar.E) {
            if (dkkjVar.aw() == dkhm.GONE) {
                w();
            }
        } else {
            this.a.g.c(new ChatSessionEvent(50005, this.b, 0L), dkuj.IMS_CHAT_SESSION_PROVIDER);
            z();
        }
    }

    @Override // defpackage.dkju
    public final void q(String str, dkjy dkjyVar) {
        long j = this.b;
        UserInfo p = this.a.p(str);
        dkmq dkmqVar = new dkmq(50072, j, dkjyVar.a);
        dkmqVar.b(p);
        this.a.g.c(new GroupChatSessionEvent(dkmqVar), dkuj.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dkhe
    public final void r(eelx eelxVar) {
        eekg eekgVar = eelxVar.g;
        if (eekgVar == null) {
            dkty.g("cSeqHeader is null", new Object[0]);
            return;
        }
        dkty.c("Received response for session: %d method: %s status: %d", Long.valueOf(this.b), eekgVar.e(), Integer.valueOf(eelxVar.w()));
        if ("BYE".equals(eekgVar.e())) {
            if (eelxVar.w() == 200 && this.c.aw() == dkhm.LEAVE) {
                this.a.j.c(this.b);
            }
            this.c.aU(this);
        }
    }

    @Override // defpackage.dkhd
    public final void n() {
    }

    @Override // defpackage.dkhd
    public final void o() {
    }

    @Override // defpackage.dkhd
    public final void p() {
    }

    @Override // defpackage.dkhd
    public final void s() {
    }

    @Override // defpackage.dkhe
    public final void t() {
    }

    @Override // defpackage.dkhe
    public final void u() {
    }
}
