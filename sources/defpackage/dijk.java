package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijk implements diil, ditx, djtm {
    static final diyy a = dizd.a(153260444);
    static final diyy b;
    static final diyy c;
    public static final dktn d;
    private final eeft A;
    private final diod B;
    private final dkur C;
    private final dkjx D;
    private final ditw E;
    private final ditw F;
    private final dkjz G;
    protected final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Map f = new HashMap();
    public final dips g;
    public final Context h;
    public final dkjq i;
    public final dkrp j;
    public final dkkw k;
    public final dkhx l;
    public final dipa m;
    public final ctvb n;
    final ditw o;
    public final djtt p;
    public final ditv q;
    final ditw r;
    final ditw s;
    final dkkx t;
    private final ffbr u;
    private final ChatSessionEngine v;
    private final dkkq w;
    private final dkux x;
    private final dlpw y;
    private final dikx z;

    static {
        dizd.a(141314033);
        b = dizd.a(157085528);
        c = dizd.a(179153382);
        dizd.a(162601747);
        d = new dktn("ImsChatSessionProvider");
    }

    public dijk(Context context, ffbr ffbrVar, dkkq dkkqVar, dkjq dkjqVar, dkrp dkrpVar, ChatSessionEngine chatSessionEngine, dkhx dkhxVar, dips dipsVar, dipa dipaVar, ctvb ctvbVar, eeft eeftVar, djtt djttVar, diod diodVar, dkur dkurVar, dlpw dlpwVar, dikx dikxVar) {
        dija dijaVar = new dija(this);
        this.o = dijaVar;
        ditv ditvVar = new ditv();
        this.q = ditvVar;
        dijb dijbVar = new dijb(this);
        this.r = dijbVar;
        dijc dijcVar = new dijc(this);
        this.s = dijcVar;
        dijd dijdVar = new dijd(this);
        this.E = dijdVar;
        dije dijeVar = new dije(this);
        this.F = dijeVar;
        dijf dijfVar = new dijf(this);
        this.t = dijfVar;
        dijg dijgVar = new dijg();
        this.G = dijgVar;
        this.v = chatSessionEngine;
        this.h = context;
        this.u = ffbrVar;
        this.w = dkkqVar;
        this.i = dkjqVar;
        this.j = dkrpVar;
        this.g = dipsVar;
        dkkw dkkwVar = new dkkw();
        this.k = dkkwVar;
        dkkwVar.b = dijfVar;
        dkkqVar.t(dijgVar);
        this.l = dkhxVar;
        this.m = dipaVar;
        this.n = ctvbVar;
        this.x = new dkux(ctvbVar);
        this.A = eeftVar;
        this.p = djttVar;
        this.B = diodVar;
        this.C = dkurVar;
        this.D = dkkqVar.u;
        this.y = dlpwVar;
        this.z = dikxVar;
        ditvVar.w("text/plain", dijaVar);
        ditvVar.w(RbmSpecificMessage.CONTENT_TYPE, dijbVar);
        ditvVar.w("application/im-iscomposing+xml", dijeVar);
        ditvVar.w("application/vnd.gsma.botsuggestion.v1.0+json", dijcVar);
        ditvVar.w("video/aliasing", dijdVar);
        ditvVar.w(djbb.c, dijdVar);
        ditvVar.w("video/key-frame-request", dijdVar);
        ditvVar.w(djbb.e, dijdVar);
        ditvVar.w(GroupManagementContentType.CONTENT_TYPE, new ditu(dipsVar));
    }

    private final Optional A() {
        return this.p.a().map(new diim());
    }

    private final List B(String str) {
        ArrayList arrayList = new ArrayList(1);
        for (dkkj dkkjVar : this.e.values()) {
            if (!dkkjVar.E && dkut.A(dkkjVar.y(), str)) {
                arrayList.add(dkkjVar);
            }
        }
        return arrayList;
    }

    private final Map.Entry C(String str) {
        ArrayList<Map.Entry> arrayList = new ArrayList(1);
        for (Map.Entry entry : this.e.entrySet()) {
            dkkj dkkjVar = (dkkj) entry.getValue();
            if (!dkkjVar.E && dkkjVar.z().equals(str)) {
                arrayList.add(entry);
            }
        }
        for (Map.Entry entry2 : arrayList) {
            dkkj dkkjVar2 = (dkkj) entry2.getValue();
            if ((dkkjVar2 instanceof dklp) || (dkkjVar2 instanceof dkli)) {
                return entry2;
            }
        }
        return null;
    }

    private static void D(dkkj dkkjVar) {
        dkkjVar.j();
        dkkjVar.aT(dkkh.USER_BLOCKED);
    }

    private final void E(dkkj dkkjVar, dklp dklpVar) {
        dkty.c("Follow up session one2one chat session, declining previous session: %s", dkkjVar.k);
        long m = m(dkkjVar);
        this.e.put(Long.valueOf(m), dklpVar);
        if (dkkjVar instanceof dklp) {
            dklpVar.af.addAll(((dklp) dkkjVar).af);
        }
        dklpVar.aF(new dijj(this, dklpVar, m));
        dkkjVar.af(2, 57);
        if (!((Boolean) b.a()).booleanValue()) {
            String z = dklpVar.z();
            if (dion.a(this.h, z)) {
                dkty.c("Follow up One2One chat session will be rejected because contact is blocked. UserId: %s", z);
                D(dklpVar);
                return;
            }
        }
        F(dklpVar, m(dklpVar));
        dklpVar.j();
        if (J(dklpVar)) {
            dkty.c("Automatically accepting chat session %s", dklpVar.k);
            dklpVar.C();
        }
    }

    private final void F(dklp dklpVar, long j) {
        dkjt dkjtVar = dklpVar.N;
        dkty.c("Notifying message filters of initial message: %s", dkjtVar == null ? "null" : dkjtVar.k);
        try {
            this.q.a(dkjtVar, j, dklpVar.z());
        } catch (IOException e) {
            dkty.i(e, "Unable to notify message filters: %s", e.getMessage());
        }
    }

    private final void G(dklp dklpVar) {
        dkty.c("Initial chat session...", new Object[0]);
        if (L(dklpVar)) {
            dkty.q("Received invalid group chat invitation, will decline session: %s", dklpVar.toString());
            dklpVar.j();
            dklpVar.an();
            return;
        }
        long registerSession = this.v.registerSession((diil) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String z = dklpVar.z();
            if (!((dkkj) dklpVar).E && dion.a(this.h, z)) {
                dkty.c("New One2One chat session will be rejected because contact is blocked. %s", dktx.USER_ID.c(z));
                D(dklpVar);
                return;
            }
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(registerSession);
        concurrentHashMap.put(valueOf, dklpVar);
        dklpVar.aF(new dijj(this, dklpVar, registerSession));
        if (((dkkj) dklpVar).E) {
            dkty.c("Register group session: %d", valueOf);
            Optional a2 = this.j.a(registerSession);
            if (a2.isPresent()) {
                dkty.q("Group session with ID %d, already exists! Cannot register.", valueOf);
            } else {
                String w = dklpVar.w();
                dkrp dkrpVar = this.j;
                String str = dklpVar.q;
                String str2 = ((dkkj) dklpVar).I;
                dkty.c("Registering group session %d, group ID %s, subject %s, conference URI %s", valueOf, w, dktx.MESSAGE_CONTENT.c(str), dktx.URI_SIP.c(str2));
                if (w == null) {
                    dkty.g("Could not register group session. Invalid parameters.", new Object[0]);
                    a2 = Optional.empty();
                } else {
                    synchronized (dkrpVar.b) {
                        dkrn dkrnVar = (dkrn) dkrpVar.b.get(valueOf);
                        if (dkrnVar == null) {
                            dkty.c("Creating group session data.", new Object[0]);
                            dkrnVar = new dkrn(registerSession, w, str, str2);
                            dkrpVar.b.put(valueOf, dkrnVar);
                        }
                        try {
                            dkrpVar.d();
                        } catch (IOException unused) {
                            dkty.g("Error while storing group data", new Object[0]);
                        }
                        a2 = Optional.of(dkrnVar);
                    }
                }
            }
            if (!a2.isPresent()) {
                dkty.g("Unable to register group session for an incoming conference invitation", new Object[0]);
            }
        }
        F(dklpVar, registerSession);
        dklpVar.j();
        if (J(dklpVar)) {
            dkty.c("Automatically accepting chat session %d", Long.valueOf(registerSession));
            dklpVar.C();
        }
        if (((dkkj) dklpVar).E) {
            Bundle bundle = new Bundle();
            boolean z2 = ((dkkj) dklpVar).E;
            String x = dklpVar.x();
            String z3 = dklpVar.z();
            bundle.putString(RcsIntents.EXTRA_USER_ID, z3);
            bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, x);
            bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z2);
            bundle.putLong("rcs.intent.extra.sessionid", registerSession);
            bundle.putString(RcsIntents.EXTRA_SUBJECT, dklpVar.q);
            diox h = this.m.h(z3);
            if (!Objects.isNull(h)) {
                dits.a(h.a, h.b, bundle);
            }
            List<String> aE = dklpVar.aE();
            GroupInfo groupInfo = new GroupInfo();
            ArrayList arrayList = new ArrayList();
            for (String str3 : aE) {
                int indexOf = str3.indexOf(59);
                if (indexOf >= 0) {
                    str3 = str3.substring(0, indexOf);
                }
                UserInfo p = p(str3);
                if (!arrayList.contains(p)) {
                    arrayList.add(p);
                }
            }
            groupInfo.b = arrayList;
            groupInfo.a = dklpVar.q;
            groupInfo.a(dklpVar.w());
            groupInfo.d = ((dkkj) dklpVar).I;
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, groupInfo);
            String str4 = ((dkkj) dklpVar).H;
            if (str4 != null) {
                bundle.putString(RcsIntents.EXTRA_REFERRER, str4);
            }
            dkuk.c(this.h, RcsIntents.ACTION_INCOMING_GROUP_CHAT, bundle, dkuj.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    private final void H(dkkj dkkjVar) {
        dkkjVar.Q = ((Boolean) this.p.a().map(new Function() { // from class: diiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                return Boolean.valueOf(((djtp) obj).r().mGeoLocPushAuth);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private static void I(dkjt dkjtVar, String str, String str2, byte[] bArr) {
        dkjtVar.n = "Type: " + str2 + "\r\nRCS message ID: " + str + "\r\nContent length: " + (bArr == null ? "0" : Integer.valueOf(bArr.length)).toString();
    }

    private final boolean J(dkkj dkkjVar) {
        Optional map = this.p.a().map(new diim());
        if (!((Boolean) c.a()).booleanValue() || !map.isEmpty()) {
            return dkkjVar.E ? ((InstantMessageConfiguration) map.get()).mAutoAcceptGroupChat : ((InstantMessageConfiguration) map.get()).mAutoAccept;
        }
        dkty.q("Unable to check if auto accept is required from Configuration", new Object[0]);
        return true;
    }

    private final boolean K() {
        return ((Boolean) this.p.a().map(new Function() { // from class: diiq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                InstantMessageConfiguration o = ((djtp) obj).o();
                eehk eehkVar = dkut.a;
                return Boolean.valueOf(o.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private final boolean L(dklp dklpVar) {
        if (!((dkkj) dklpVar).E) {
            return false;
        }
        if (!TextUtils.isEmpty(dklpVar.w())) {
            return dklpVar.aE().isEmpty();
        }
        dkty.g("Group invitation does not contain a %s", true != K() ? "Contribution-ID" : "Conversation-ID");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String[] M(dkrn dkrnVar) {
        if (!dkrnVar.b.isPresent()) {
            dkty.q("No ConferenceInfo available for session %d", Long.valueOf(dkrnVar.a));
            return new String[0];
        }
        dkty.c("Creating participant list from GroupSessionData", new Object[0]);
        Object obj = dkrnVar.b.get();
        ArrayList arrayList = new ArrayList();
        dimh dimhVar = ((dilk) obj).d;
        if (dimhVar != null) {
            int size = dimhVar.size();
            for (int i = 0; i < size; i++) {
                dimg dimgVar = (dimg) dimhVar.get(i);
                if (!dimgVar.i && dimgVar.g()) {
                    arrayList.add(dimgVar.g);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String r(dkjt dkjtVar) {
        String str = dkjtVar.k;
        if (str != null) {
            return str;
        }
        dkty.c("Message ID was null, generating a new one!", new Object[0]);
        return dktj.a().f();
    }

    private final ChatSessionServiceResult z(long j, String str, dkjt dkjtVar) {
        int i;
        long j2;
        dkty.c("startSession with instant message %s", dkjtVar);
        if (!this.w.l()) {
            dkty.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        Optional A = A();
        if (A.isEmpty()) {
            dkty.k("instantMessageConfiguration is not present", new Object[0]);
            return new ChatSessionServiceResult(j, 2, "Not configured");
        }
        try {
            try {
                try {
                    try {
                        i = 0;
                    } catch (eefw e) {
                        e = e;
                        j2 = j;
                        i = 0;
                    }
                } catch (eefw e2) {
                    e = e2;
                    j2 = j;
                    i = 0;
                }
                try {
                    dkli dkliVar = new dkli(this.h, this.w, this.u, str, this.A, this.j, this.B, this.C, (InstantMessageConfiguration) A.get(), 1, this.z);
                    H(dkliVar);
                    String str2 = dkjtVar.k;
                    dkliVar.N = dkjtVar;
                    boolean c2 = dktk.c(str);
                    dkty.k("Starting session for: %s", c2 ? dktx.USER_ID_BOT.c(str) : dktx.USER_ID.c(str));
                    if (c2) {
                        dkliVar.bl();
                    }
                    dkliVar.aF(new dijj(this, dkliVar, j));
                    this.e.put(Long.valueOf(j), dkliVar);
                    dkliVar.j();
                    return new ChatSessionServiceResult(j, str2, 0);
                } catch (eefw e3) {
                    e = e3;
                    j2 = j;
                    dkty.i(e, "MsrpException while creating OriginatingChatSession", new Object[i]);
                    return new ChatSessionServiceResult(j2, 17, e.getMessage());
                }
            } catch (eefw e4) {
                e = e4;
                j2 = j;
                i = 0;
            }
        } catch (eefw e5) {
            e = e5;
            i = 0;
            j2 = j;
        }
    }

    @Override // defpackage.diil
    public final long a(String str) {
        if (C(str) == null) {
            return this.v.registerSession((diil) this);
        }
        return -1L;
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult b(long j) {
        boolean containsKey;
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar = (dkkj) concurrentHashMap.get(valueOf);
        int i = 0;
        dkty.c("Ending chat session ...", new Object[0]);
        if (dkkjVar == null) {
            dkrp dkrpVar = this.j;
            synchronized (dkrpVar.b) {
                containsKey = dkrpVar.b.containsKey(valueOf);
            }
            if (!containsKey) {
                i = 9;
            }
        } else {
            if (dkkjVar.E) {
                dkkjVar.bb(dkhm.DISCONNECT);
            } else {
                dkkjVar.bb(dkhm.LEAVE);
            }
            if (dkkjVar.p) {
                dkkjVar.l();
            } else {
                dkkjVar.af(5, 29);
            }
        }
        return new ChatSessionServiceResult(j, i);
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult c(long j) {
        if (!this.w.l()) {
            dkty.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar = (dkkj) concurrentHashMap.get(valueOf);
        if (dkkjVar != null) {
            dkkjVar.C();
            return new ChatSessionServiceResult(j, 0);
        }
        Optional a2 = this.j.a(j);
        if (!a2.isEmpty()) {
            return (ChatSessionServiceResult) n(dkjj.CONFERENCE_URI, (dkrn) a2.get()).first;
        }
        dkty.c("Session %d not found!", valueOf);
        return new ChatSessionServiceResult(j, 9);
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult d(long j, String str, String str2, byte[] bArr) {
        fayv fayvVar = fayv.a;
        Long valueOf = Long.valueOf(j);
        dkty.c("sendMessage {Session: %d, Message Id: %s", valueOf, str);
        if (!this.w.l()) {
            dkty.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        dkkj dkkjVar = (dkkj) this.e.get(valueOf);
        if (dkkjVar == null) {
            dkty.c("session is not found. Reconnecting... Session: %d, Message Id: %s", valueOf, str);
            return y(j, str, str2, bArr, fayvVar);
        }
        if (dkkjVar.bg() && !(dkkjVar instanceof dklm)) {
            dkty.c("Sending message along existing session: %d [Session ID: %s]", valueOf, dkkjVar.k);
            try {
                dkjt a2 = dijm.a(dkkjVar, str, str2, bArr, fayvVar);
                I(a2, str, str2, bArr);
                dkkjVar.aV(a2);
                dkty.c("Successfully queued message!", new Object[0]);
                return new ChatSessionServiceResult(j, str, 0);
            } catch (dkjy e) {
                dkty.i(e, "Error while sending message: %s", e.getMessage());
                return new ChatSessionServiceResult(j, str, 1);
            }
        }
        if (dkkjVar.a == dkho.STOPPED) {
            dkty.q("Cleaning up unexpected stale session %d in state STOPPED:\n%s", valueOf, dkkjVar.B());
            this.w.i(dkkjVar);
        }
        if (dkkjVar.E) {
            return y(j, str, str2, bArr, fayvVar);
        }
        dkty.c("Sending message along new created session - session not established: %d", valueOf);
        String z = dkkjVar.z();
        this.w.a();
        dkjt c2 = dijm.c(str, str2, bArr, fayvVar, K());
        I(c2, str, str2, bArr);
        return z(j, z, c2);
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult e(String str, byte[] bArr, String str2, String str3) {
        return f(str, -1L, bArr, str2, str3);
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult f(String str, long j, byte[] bArr, String str2, String str3) {
        fayv fayvVar = fayv.a;
        dkty.c("Send message with content type %s to %s, message ID is %s", str2, dktx.USER_ID.c(str), str3);
        Map.Entry C = C(str);
        if (C != null) {
            dkty.c("Sending message via session %s", ((Long) C.getKey()).toString());
            return d(((Long) C.getKey()).longValue(), str3, str2, bArr);
        }
        dkty.c("Creating new session to send message", new Object[0]);
        this.w.s(str);
        if (j == -1) {
            j = this.v.registerSession((diil) this);
        }
        this.w.a();
        dkjt c2 = dijm.c(str3, str2, bArr, fayvVar, K());
        I(c2, str3, str2, bArr);
        return z(j, str, c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.diil
    public final GroupInfo g(long j) {
        dimh dimhVar;
        Optional q = q(j);
        if (q.isEmpty()) {
            return null;
        }
        dkty.c("Creating group info from group session data for session %d", Long.valueOf(((dkrn) q.get()).a));
        dkrn dkrnVar = (dkrn) q.get();
        final GroupInfo groupInfo = new GroupInfo();
        groupInfo.a = (String) dkrnVar.f.orElse(null);
        groupInfo.a(dkrnVar.d);
        dkrnVar.e.ifPresent(new Consumer() { // from class: diir
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                GroupInfo.this.d = (String) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optional = dkrnVar.b;
        if (!optional.isEmpty() && (dimhVar = ((dilk) optional.get()).d) != null && dimhVar.size() != 0) {
            int size = dimhVar.size();
            for (int i = 0; i < size; i++) {
                dimg dimgVar = (dimg) dimhVar.get(i);
                if (dimgVar.g()) {
                    UserInfo o = o(dimgVar);
                    int indexOf = groupInfo.b.indexOf(o);
                    if (indexOf < 0) {
                        groupInfo.b.add(o);
                    } else {
                        dkty.c("Replacing user in group info: %s", o.a);
                        groupInfo.b.set(indexOf, o);
                    }
                }
            }
        }
        return groupInfo;
    }

    @Override // defpackage.diil
    public final String h(long j) {
        dkkj dkkjVar = (dkkj) this.e.get(Long.valueOf(j));
        if (dkkjVar != null && !dkkjVar.E) {
            return dkkjVar.o;
        }
        String str = (String) this.j.a(j).map(new Function() { // from class: diiz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                return ((dkrn) obj).e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: diin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                return (String) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (Objects.isNull(str)) {
            return null;
        }
        return this.x.a(str);
    }

    @Override // defpackage.diil
    public final boolean i() {
        return this.w.l();
    }

    @Override // defpackage.diil
    public final long[] j() {
        return dkta.b(this.e.keySet());
    }

    @Override // defpackage.diil
    public final String[] k(long j) {
        dkkj dkkjVar = (dkkj) this.e.get(Long.valueOf(j));
        if (dkkjVar == null || !dkkjVar.E) {
            return new String[0];
        }
        dkux dkuxVar = this.x;
        List aE = dkkjVar.aE();
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = aE.iterator();
        while (it.hasNext()) {
            engrVar.h(dkuxVar.a((String) it.next()));
        }
        return (String[]) engrVar.g().toArray(new String[0]);
    }

    @Override // defpackage.diil
    public final ChatSessionServiceResult l(long j) {
        if (this.w.l()) {
            return new ChatSessionServiceResult(j, 1, "Not implemented");
        }
        dkty.c("Not registered!", new Object[0]);
        return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
    }

    public final long m(dkkj dkkjVar) {
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() == dkkjVar) {
                return ((Long) entry.getKey()).longValue();
            }
        }
        return 0L;
    }

    final Pair n(dkjj dkjjVar, dkrn dkrnVar) {
        long j;
        String[] M;
        dkli dkliVar;
        int i = 0;
        dkty.c("Reconnecting with method %s to %s", dkjjVar, dkrnVar);
        if (dkjjVar == dkjj.CONFERENCE_FACTORY_URI) {
            dkty.q("Unable to reconnect using method %s", dkjjVar.toString());
            return Pair.create(new ChatSessionServiceResult(12), null);
        }
        Optional A = A();
        if (A.isEmpty()) {
            dkty.k("instantMessageConfiguration is not present", new Object[0]);
            return Pair.create(new ChatSessionServiceResult(2), null);
        }
        try {
            j = dkrnVar.a;
            M = M(dkrnVar);
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        try {
            if (dkjjVar == dkjj.CONFERENCE_URI) {
                Context context = this.h;
                dkkq dkkqVar = this.w;
                ffbr ffbrVar = this.u;
                eeft eeftVar = this.A;
                dkrp dkrpVar = this.j;
                diod diodVar = this.B;
                dkur dkurVar = this.C;
                InstantMessageConfiguration instantMessageConfiguration = (InstantMessageConfiguration) A.get();
                dikx dikxVar = this.z;
                int i2 = dkli.Z;
                dkty.c("Creating a chat conference session as originating, reconnecting via conference URI", new Object[0]);
                String str = (String) dkrnVar.e.orElse(null);
                if (emxe.c(str)) {
                    throw new eejg("ConferenceUri is empty.");
                }
                dkliVar = new dkli(context, dkkqVar, ffbrVar, str, eeftVar, dkrpVar, diodVar, dkurVar, instantMessageConfiguration, 1, dikxVar);
                dkliVar.bn(dkrnVar, M);
                ((dkkj) dkliVar).I = str;
                dkliVar.Y = true;
                dkliVar.O = dkjj.CONFERENCE_URI;
                H(dkliVar);
            } else {
                if (dkjjVar != dkjj.GROUP_ID) {
                    dkty.g("Unknown reconnect method %s", dkjjVar.toString());
                    return Pair.create(new ChatSessionServiceResult(j, 1), null);
                }
                if (M.length == 0) {
                    dkty.q("No participants in group.", new Object[0]);
                    return Pair.create(new ChatSessionServiceResult(107), null);
                }
                Context context2 = this.h;
                dkkq dkkqVar2 = this.w;
                ffbr ffbrVar2 = this.u;
                eeft eeftVar2 = this.A;
                dkrp dkrpVar2 = this.j;
                diod diodVar2 = this.B;
                dkur dkurVar2 = this.C;
                InstantMessageConfiguration instantMessageConfiguration2 = (InstantMessageConfiguration) A.get();
                dikx dikxVar2 = this.z;
                int i3 = dkli.Z;
                dkty.c("Creating a chat conference session as originating, reconnecting via Group-ID: %s", dkrnVar.d);
                dkty.c("Creating a new chat conference session as originating", new Object[0]);
                dkli dkliVar2 = new dkli(context2, dkkqVar2, ffbrVar2, dkkqVar2.a.d().mConferenceFactoryUri, eeftVar2, dkrpVar2, diodVar2, dkurVar2, instantMessageConfiguration2, 1, dikxVar2);
                dkliVar2.bm();
                dkliVar2.ba(M);
                dkliVar2.O = dkjj.CONFERENCE_FACTORY_URI;
                dkliVar2.bn(dkrnVar, M);
                dkliVar2.O = dkjj.GROUP_ID;
                H(dkliVar2);
                dkliVar = dkliVar2;
            }
            dkliVar.aF(new dijj(this, dkliVar, j));
            this.e.put(Long.valueOf(j), dkliVar);
            dkliVar.j();
            dkty.k("Successfully reconnected to conference.", new Object[0]);
            return Pair.create(new ChatSessionServiceResult(j, 0), dkliVar);
        } catch (Exception e2) {
            e = e2;
            dkty.i(e, "Unable to reconnect to conference!", new Object[i]);
            return Pair.create(new ChatSessionServiceResult(1), null);
        }
    }

    public final UserInfo o(dimg dimgVar) {
        UserInfo userInfo = new UserInfo(this.x.a(dimgVar.g));
        userInfo.b = dimgVar.a;
        userInfo.a(dimgVar.g);
        userInfo.d = dimgVar.i;
        userInfo.e = dimgVar.j;
        userInfo.c = dimgVar.a().l;
        return userInfo;
    }

    public final UserInfo p(String str) {
        String a2 = this.x.a(str);
        UserInfo userInfo = new UserInfo(a2);
        userInfo.b = null;
        userInfo.a(str);
        String a3 = this.x.a(this.w.r());
        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a2) && a2.equals(a3)) {
            userInfo.d = true;
        }
        return userInfo;
    }

    public final Optional q(long j) {
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar = (dkkj) concurrentHashMap.get(valueOf);
        if (dkkjVar != null && !dkkjVar.E) {
            dkty.k("Session %d is a one-to-one session, not a group session.", valueOf);
            return Optional.empty();
        }
        Optional a2 = this.j.a(j);
        if (!a2.isEmpty()) {
            return a2;
        }
        dkty.q("Session %d not registered in ImsChatSessionProvider or ConferenceInformationStorage. It may not be a group session.", valueOf);
        return Optional.empty();
    }

    public final void s(dkjt dkjtVar, long j, String str, dkkj dkkjVar) {
        GroupInfo g;
        dkty.k("Broadcasting new incoming chat message - remoteUserId:%s messageId:%s session:%d", dktx.USER_ID.c(str), dkjtVar.k, Long.valueOf(j));
        boolean z = dkjtVar.p;
        boolean z2 = dkkjVar.E;
        String str2 = dkjtVar.h;
        byte[] bArr = dkjtVar.f;
        String r = r(dkjtVar);
        String x = dkkjVar.x();
        String a2 = dkjtVar.a();
        long j2 = dkjtVar.j;
        Bundle bundle = new Bundle();
        bundle.putString(RcsIntents.EXTRA_USER_ID, str);
        bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, x);
        bundle.putBoolean(RcsIntents.EXTRA_IS_SYSTEM_MESSAGE, z);
        bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z2);
        bundle.putString("rcs.intent.extra.contentType", str2);
        bundle.putByteArray(RcsIntents.EXTRA_CONTENT, bArr);
        bundle.putString(RcsIntents.EXTRA_TEXT, a2);
        bundle.putLong(RcsIntents.EXTRA_TIMESTAMP, j2);
        bundle.putLong("rcs.intent.extra.sessionid", j);
        bdhg.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, bdhg.a(r));
        bundle.putBoolean(RcsIntents.EXTRA_IS_BOT, dkkjVar.J);
        if (dkjtVar.l > 0) {
            bundle.putInt(RcsIntents.EXTRA_SPAM_VERDICT, 1);
        }
        if (z2 && (g = g(j)) != null && !g.b()) {
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, g);
        }
        String str3 = dkjtVar.d;
        TextUtils.isEmpty(null);
        bundle.putString(RcsIntents.EXTRA_SIP_ALIAS, null);
        fayv fayvVar = dkjtVar.i;
        if (fayvVar != null) {
            bundle.putByteArray(RcsIntents.EXTRA_CUSTOM_HEADERS, fayvVar.toByteArray());
        }
        diox h = this.m.h(str);
        if (!Objects.isNull(h)) {
            dits.a(h.a, h.b, bundle);
        }
        String str4 = dkjtVar.b;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(RcsIntents.EXTRA_SELF_USER_ID, str4);
        }
        dkuk.c(this.h, RcsIntents.ACTION_INCOMING_CHAT_MESSAGE, bundle, dkuj.IMS_CHAT_SESSION_PROVIDER);
        if (dkkjVar instanceof dklm) {
            dksy.d("Bugle.RcsEngine.Chat.IncomingDeferredMessage");
        }
    }

    public final void t(dklm dklmVar) {
        String y = dklmVar.y();
        dkty.c("Incoming deferred messaging session for %s", y);
        for (dkkj dkkjVar : B(y)) {
            if (dkkjVar instanceof dklm) {
                dklm dklmVar2 = (dklm) dkkjVar;
                dkty.c("Follow up deferred messaging session, declining previous session: %s", dklmVar2.k);
                long m = m(dklmVar2);
                this.e.put(Long.valueOf(m), dklmVar);
                dklmVar.aF(new dijj(this, dklmVar, m));
                dklmVar2.af(2, 57);
                String z = dklmVar.z();
                if (!((Boolean) b.a()).booleanValue() && dion.a(this.h, z)) {
                    dkty.c("Follow up deferred One2One chat session will be rejected because contact is blocked. %s", dktx.USER_ID.c(z));
                    D(dklmVar);
                    dklmVar.j();
                    dklmVar.aT(dkkh.USER_BLOCKED);
                    return;
                }
                F(dklmVar, m(dklmVar));
                dklmVar.j();
                if (dklmVar.Y || J(dklmVar)) {
                    dklmVar.C();
                    return;
                }
                return;
            }
        }
        dkty.c("Initial deferred messaging session...", new Object[0]);
        long registerSession = this.v.registerSession((diil) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String z2 = dklmVar.z();
            if (dion.a(this.h, z2)) {
                dkty.c("New deferred chat session will be rejected because contact is blocked. UserId: %s", z2);
                D(dklmVar);
                return;
            }
        }
        this.e.put(Long.valueOf(registerSession), dklmVar);
        F(dklmVar, registerSession);
        dklmVar.j();
        dklmVar.aF(new dijj(this, dklmVar, registerSession));
        if (dklmVar.Y || J(dklmVar)) {
            dklmVar.C();
        }
    }

    public final void v(dklp dklpVar) {
        Optional empty;
        H(dklpVar);
        if (!((dkkj) dklpVar).E) {
            String y = dklpVar.y();
            dkty.c("Incoming 1-1 invitation from %s", dktx.USER_ID.c(y));
            for (dkkj dkkjVar : B(y)) {
                if (dkkjVar instanceof dklp) {
                    E(dkkjVar, dklpVar);
                    return;
                }
                if (dkkjVar instanceof dkli) {
                    if (dkkjVar.l.m) {
                        E(dkkjVar, dklpVar);
                        return;
                    }
                    dkty.c("Parallel incoming session, rejecting", new Object[0]);
                    F(dklpVar, m((dkli) dkkjVar));
                    dklpVar.j();
                    dklpVar.af(2, 57);
                    return;
                }
            }
            G(dklpVar);
            return;
        }
        dkty.c("Incoming conference invitation with Group-ID: %s", dklpVar.w());
        if (!((Boolean) this.p.a().map(new Function() { // from class: diix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                return Boolean.valueOf(((djtp) obj).r().mGroupChatAuth);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            dkty.q("Group chat disabled. Rejecting session.", new Object[0]);
            dklpVar.j();
            dklpVar.aT(dkkh.SERVICE_DISABLED);
            return;
        }
        dkrp dkrpVar = this.j;
        String w = dklpVar.w();
        synchronized (dkrpVar.b) {
            Iterator it = dkrpVar.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                dkrn dkrnVar = (dkrn) it.next();
                if (dkrnVar.d.equals(w)) {
                    empty = Optional.of(dkrnVar);
                    break;
                }
            }
        }
        if (!empty.isPresent()) {
            G(dklpVar);
            return;
        }
        dkrn dkrnVar2 = (dkrn) empty.get();
        dkty.c("Incoming conference reconnect for: %s", dkrnVar2.toString());
        long j = dkrnVar2.a;
        if (L(dklpVar)) {
            dkty.q("Received invalid group chat reconnect, will send 488 NOT ACCEPTABLE for session ID %d: %s", Long.valueOf(j), dklpVar.toString());
            dklpVar.j();
            dklpVar.aT(dkkh.INVALID_PARAMETERS);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar2 = (dkkj) concurrentHashMap.remove(valueOf);
        if (dkkjVar2 != null) {
            dkkjVar2.ao();
        }
        dijj dijjVar = new dijj(this, dklpVar, j);
        this.e.put(valueOf, dklpVar);
        F(dklpVar, j);
        dklpVar.j();
        dklpVar.aF(dijjVar);
        dklpVar.C();
    }

    @Override // defpackage.ditx
    public final void w(String str, ditw ditwVar) {
        this.q.w(str, ditwVar);
    }

    public final void x(long j, dkkj dkkjVar, dkjt dkjtVar) {
        dkty.c("Sending message to group, session ID %d, message ID %s", Long.valueOf(j), dkjtVar.k);
        try {
            dkkjVar.aV(dkjtVar);
        } catch (dkjy e) {
            dkty.i(e, "Unable to send message to group: %s", e.getMessage());
            String str = dkjtVar.k;
            dkty.c("Firing group message failed event for sessiond ID %d, message ID %s", Long.valueOf(j), str);
            if (TextUtils.isEmpty(str)) {
                dkty.q("Unable to fire group message failed event, no message ID", new Object[0]);
            } else {
                this.g.c(new ChatSessionMessageEvent(j, 53L, str, this.y.f().toEpochMilli(), 50031, null, true), dkuj.IMS_CHAT_SESSION_PROVIDER);
            }
        }
    }

    final ChatSessionServiceResult y(long j, String str, String str2, byte[] bArr, fayv fayvVar) {
        Optional a2 = this.j.a(j);
        if (a2.isEmpty()) {
            dkty.g("Could not find data for group %d", Long.valueOf(j));
            return new ChatSessionServiceResult(j, String.valueOf(str), 9);
        }
        dkty.c("Reconnecting to chat conference id: %d, %s", Long.valueOf(j), a2);
        if (M((dkrn) a2.get()).length == 0) {
            dkty.q("No participants in group - will not send any message!", new Object[0]);
            return new ChatSessionServiceResult(j, 107);
        }
        Pair n = n((dkjj) ((dkrn) a2.get()).e.map(new Function() { // from class: diio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dijk.d;
                return dkjj.CONFERENCE_URI;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: diip
            @Override // java.util.function.Supplier
            public final Object get() {
                dktn dktnVar = dijk.d;
                dkty.q("Trying to connect to conference with null uri", new Object[0]);
                return dkjj.GROUP_ID;
            }
        }), (dkrn) a2.get());
        ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) n.first;
        dkkj dkkjVar = (dkkj) n.second;
        if (Objects.isNull(dkkjVar)) {
            dkty.q("Failed to reconnect to conference", new Object[0]);
            return new ChatSessionServiceResult(j, 1);
        }
        if (chatSessionServiceResult.succeeded()) {
            dkjt a3 = dijm.a(dkkjVar, str, str2, bArr, fayvVar);
            I(a3, str, str2, bArr);
            x(j, dkkjVar, a3);
        }
        return chatSessionServiceResult;
    }

    @Override // defpackage.djtm
    public final /* synthetic */ void u(djtp djtpVar) {
    }
}
