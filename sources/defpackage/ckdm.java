package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.net.URLDecoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdm implements ckch {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ckdh F = new ckdh(this);
    private final ckdl G = new ckdl(this);
    private final aslp H;
    public final Context b;
    public final ffbr c;
    public final csum d;
    public final errl e;
    public final dtuu f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final Optional m;
    public final ckeq n;
    public final ffbr o;
    public final ffbr p;
    public final errl q;
    public final asmj r;
    public final ffbr s;
    public final atxd t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final Optional y;
    private final ffbr z;

    public ckdm(Context context, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, csum csumVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Optional optional, Optional optional2, errl errlVar, ffbr ffbrVar12, ckeq ckeqVar, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, errl errlVar2, aslp aslpVar, asmj asmjVar, ffbr ffbrVar20, atxd atxdVar) {
        this.b = context;
        this.e = errlVar;
        this.f = dtuuVar;
        this.c = ffbrVar;
        this.u = ffbrVar2;
        this.d = csumVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.v = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.w = ffbrVar10;
        this.x = ffbrVar11;
        this.m = optional;
        this.y = optional2;
        this.z = ffbrVar12;
        this.n = ckeqVar;
        this.A = ffbrVar13;
        this.B = ffbrVar14;
        this.C = ffbrVar15;
        this.D = ffbrVar16;
        this.E = ffbrVar17;
        this.o = ffbrVar18;
        this.p = ffbrVar19;
        this.q = errlVar2;
        this.H = aslpVar;
        this.r = asmjVar;
        this.s = ffbrVar20;
        this.t = atxdVar;
    }

    @Deprecated
    private final elfl A(final MessageCoreData messageCoreData, final Uri uri, final String str, final int i) {
        return z(messageCoreData).h(new emwl() { // from class: ckcl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final ckdm ckdmVar = ckdm.this;
                final MessageCoreData messageCoreData2 = messageCoreData;
                final Uri uri2 = uri;
                if (!booleanValue || ((atwp) ckdmVar.p.b()).a()) {
                    return csuu.i(ckdmVar.b, uri2, new File(ckdmVar.b.getFilesDir(), "rcs_attachments"), messageCoreData2.al(), null, ckdmVar.d);
                }
                final int i2 = i;
                final String str2 = str;
                emxf.a(!ckdmVar.f.i());
                return ckdmVar.n.a(new emyl() { // from class: ckco
                    @Override // defpackage.emyl
                    public final Object get() {
                        return ckdm.this.u(messageCoreData2, uri2, str2, i2);
                    }
                });
            }
        }, this.e);
    }

    private final elfl x(final MessageCoreData messageCoreData, final Uri uri, final String str, final ckdi ckdiVar) {
        return !((atwp) this.p.b()).a() ? elfo.e(null) : z(messageCoreData).h(new emwl() { // from class: ckcm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                ckdi ckdiVar2 = ckdiVar;
                String str2 = str;
                Uri uri2 = uri;
                ckdm.this.n(messageCoreData, uri2, str2, ckdiVar2);
                return null;
            }
        }, this.e);
    }

    private final elfl y(final MessageCoreData messageCoreData, final Uri uri, final String str, final ckdi ckdiVar) {
        return z(messageCoreData).h(new emwl() { // from class: ckcu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ckdm ckdmVar = ckdm.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                Uri uri2 = uri;
                if (!booleanValue || ((atwp) ckdmVar.p.b()).a()) {
                    return ckdmVar.o(messageCoreData2, uri2, null);
                }
                return ckdmVar.n(messageCoreData2, uri2, str, ckdiVar);
            }
        }, this.e);
    }

    private final elfl z(MessageCoreData messageCoreData) {
        return ((bzqi) this.w.b()).c(messageCoreData.cB());
    }

    @Override // defpackage.ckch
    public final long a(long j) {
        return w(j, null);
    }

    @Override // defpackage.ckch
    public final Uri b(MessageCoreData messageCoreData, cgtf cgtfVar, List list, long j, String str, int i) {
        efbd.b();
        emxf.a(messageCoreData.u() == null);
        byte[] bytes = str != null ? str.getBytes() : null;
        if (((Boolean) ayhv.b.e()).booleanValue()) {
            bytes = cker.c(messageCoreData, str, bsom.c(messageCoreData.z()));
        }
        Uri m = ((coxk) this.k.b()).m(this.b, list, messageCoreData, cgtfVar, j, i, p(true, messageCoreData), messageCoreData.o(), bytes);
        if (m != null) {
            messageCoreData.bD(m);
        }
        return m;
    }

    @Override // defpackage.ckch
    public final cpbd c(cpxu cpxuVar, String str, String str2) {
        String str3;
        String str4;
        String b;
        String a2;
        efbd.b();
        if (str != null && ((ckdn) this.u.b()).f(str)) {
            String b2 = emxe.b(((cuwz) this.A.b()).c(str));
            int length = b2.length();
            int i = length - 15;
            int i2 = length - 16;
            int lastIndexOf = b2.lastIndexOf(31, i2);
            int lastIndexOf2 = b2.lastIndexOf(31, lastIndexOf - 1);
            if (lastIndexOf == -1) {
                lastIndexOf = b2.lastIndexOf(45, i2);
                lastIndexOf2 = b2.lastIndexOf(45, lastIndexOf - 1);
            }
            return cpbd.a(cpxuVar, ((coxk) this.k.b()).L(str2), URLDecoder.decode(b2.substring(0, lastIndexOf2)), b2.substring(lastIndexOf2 + 1, lastIndexOf), b2.substring(lastIndexOf + 1, i));
        }
        if (str == null || !((ckdn) this.u.b()).e(str)) {
            return ((coxk) this.k.b()).x(cpxuVar, str2);
        }
        List L = ((coxk) this.k.b()).L(str2);
        cpay a3 = ((ckdn) this.u.b()).a(str);
        if (a3 != null) {
            b = TextUtils.isEmpty(a3.b) ? ((ckby) this.B.b()).b() : a3.b;
            a2 = TextUtils.isEmpty(a3.c) ? bcyu.a() : a3.c;
            str4 = a3.a;
        } else {
            String c = ((cuwz) this.A.b()).c(str);
            String format = String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", cskt.b(str), cskt.b(c));
            ensk j = a.j();
            j.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getRbmBotThreadData", 1155, "RcsTelephonyAccessImpl.java")).t("%s", format);
            Iterator it = L.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = null;
                    break;
                }
                aoku aokuVar = (aoku) it.next();
                if (aokuVar.u()) {
                    cfva cfvaVar = aoqm.a;
                    str3 = aokuVar.k(((Boolean) new aoqj().get()).booleanValue());
                    break;
                }
            }
            if (str3 != null) {
                str = str3;
            } else if (true != TextUtils.isEmpty(c)) {
                str = c;
            }
            str4 = str;
            b = ((ckby) this.B.b()).b();
            a2 = bcyu.a();
        }
        cpay cpayVar = new cpay(str4, b, a2);
        str4.getClass();
        return cpbd.b(cpxuVar, Collections.singletonList(((aolr) this.C.b()).n(str4)), cpayVar);
    }

    @Override // defpackage.ckch
    public final cpxu d(long j, GroupInfo groupInfo) {
        return cpxu.b(w(j, groupInfo));
    }

    @Override // defpackage.ckch
    public final cpxu e(cpay cpayVar) {
        if (cpayVar == null) {
            return new cpxu();
        }
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleTelephony");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getOrCreateRbmBotThreadId", 1202, "RcsTelephonyAccessImpl.java")).t("Building encoded RBM telephony address for threadInfo: %s", String.format("id = %s, name = %s, color = %s", cpayVar.a, cpayVar.b, cpayVar.c));
        long f = ((covs) this.D.b()).f(coto.a, ((ckdn) this.u.b()).b(cpayVar));
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleTelephony");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getOrCreateRbmBotThreadId", 1213, "RcsTelephonyAccessImpl.java")).s("RcsUtils.getOrCreateRbmBotThreadId returned thread id %d", f);
        return cpxu.b(f);
    }

    @Override // defpackage.ckch
    public final elfl f(final MessageCoreData messageCoreData, final cgtf cgtfVar, List list, final long j, final String str, final int i) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: ckcp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String p = ((aoku) obj).p(true);
                p.getClass();
                return p;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        final engw engwVar = (engw) map.collect(endq.a);
        return z(messageCoreData).h(new emwl() { // from class: ckcq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ckdm ckdmVar = ckdm.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                long j2 = j;
                if (booleanValue) {
                    int i3 = i;
                    String str2 = str;
                    return ckdmVar.b(messageCoreData2, cgtfVar, engwVar, j2, str2, i3);
                }
                for (MessagePartCoreData messagePartCoreData : messageCoreData2.ab()) {
                    Uri t = messagePartCoreData.t();
                    if (t != null) {
                        ((bdpt) ckdmVar.h.b()).e(messageCoreData2, messagePartCoreData, t, csuu.i(ckdmVar.b, t, new File(ckdmVar.b.getFilesDir(), "rcs_attachments"), messagePartCoreData.V(), null, ckdmVar.d));
                    }
                }
                ((bdfl) ckdmVar.i.b()).b(messageCoreData2.z(), false, byyt.UNARCHIVED);
                ckdmVar.q(messageCoreData2, j2);
                return null;
            }
        }, this.e);
    }

    @Override // defpackage.ckch
    public final elfl g(MessageCoreData messageCoreData, Uri uri, String str) {
        return x(messageCoreData, uri, str, this.F);
    }

    @Override // defpackage.ckch
    public final elfl h(MessageCoreData messageCoreData, Uri uri, String str) {
        return x(messageCoreData, uri, str, this.G);
    }

    @Override // defpackage.ckch
    public final elfl i(final MessageCoreData messageCoreData, final Uri uri, final String str) {
        return this.H.a() ? elfo.g(new Callable() { // from class: ckcj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ckdm.this.o(messageCoreData, uri, str);
            }
        }, this.e) : elfo.g(new Callable() { // from class: ckck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ckdm ckdmVar = ckdm.this;
                return csuu.i(ckdmVar.b, uri, new File(ckdmVar.b.getFilesDir(), "rcs_attachments"), messageCoreData.al(), str, ckdmVar.d);
            }
        }, this.e);
    }

    @Override // defpackage.ckch
    public final elfl j(MessageCoreData messageCoreData, Uri uri, String str) {
        return this.H.a() ? y(messageCoreData, uri, str, this.F) : A(messageCoreData, uri, str, 1);
    }

    @Override // defpackage.ckch
    public final elfl k(MessageCoreData messageCoreData, Uri uri, String str) {
        return this.H.a() ? y(messageCoreData, uri, str, this.G) : A(messageCoreData, uri, str, 2);
    }

    @Override // defpackage.ckch
    public final elfl l(final MessageCoreData messageCoreData, final long j, final aoku aokuVar, final String str, final int i) {
        return z(messageCoreData).h(new emwl() { // from class: ckdc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ckdm ckdmVar = ckdm.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                long j2 = j;
                aoku aokuVar2 = aokuVar;
                int i2 = i;
                if (!booleanValue) {
                    ckdmVar.q(messageCoreData2, j2);
                    return null;
                }
                efbd.b();
                ArrayList a2 = ((bdfw) ckdmVar.j.b()).a(messageCoreData2.z(), true);
                String[] strArr = (String[]) a2.toArray(new String[a2.size()]);
                try {
                    Uri u = messageCoreData2.u();
                    ln g = ((ckds) ckdmVar.c.b()).g(messageCoreData2);
                    long o = messageCoreData2.o() / 1000;
                    lx lxVar = new lx();
                    String p = aokuVar2.p(true);
                    p.getClass();
                    lxVar.b(new lg(p));
                    lxVar.g(new lg(""));
                    lxVar.b = g;
                    lxVar.f(o);
                    lxVar.e();
                    String al = messageCoreData2.al();
                    if (al != null) {
                        lxVar.a.j(cgtc.f(al), 132);
                    }
                    lxVar.a.h(messageCoreData2.s(), 142);
                    lg[] f = lg.f(strArr);
                    if (f != null) {
                        lxVar.a.n(f);
                    }
                    String str2 = str;
                    if (str2 != null) {
                        lxVar.i(str2.getBytes(StandardCharsets.UTF_8));
                    }
                    if (((Boolean) ayhv.b.e()).booleanValue()) {
                        lxVar.i(cker.c(messageCoreData2, str2, bsom.c(messageCoreData2.z())));
                    }
                    MessagePartCoreData G = messageCoreData2.G();
                    Uri ab = ((coxk) ckdmVar.k.b()).ab(ckdmVar.b, lxVar, i2, ckdmVar.p(((asqq) ckdmVar.o.b()).a(), messageCoreData2), j2, o, messageCoreData2.E().b, (G == null || messageCoreData2.cE()) ? 1 : ckdmVar.v(G));
                    if (ab == null) {
                        return null;
                    }
                    Uri withAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(ab));
                    messageCoreData2.bD(withAppendedId);
                    ckdmVar.s(messageCoreData2.z(), messageCoreData2.B(), withAppendedId);
                    ckdmVar.r(withAppendedId, messageCoreData2.k());
                    if (u != null) {
                        akzw b = ((albq) ckdmVar.l.b()).b("Bugle.Telephony.Delete.Rcs.Latency");
                        cgsx.a(ckdmVar.b.getContentResolver(), u, null, null);
                        b.c();
                    }
                    return withAppendedId;
                } catch (li e) {
                    ensk i3 = ckdm.a.i();
                    i3.Y(ente.a, "BugleTelephony");
                    ((enrr) ((enrr) ((enrr) i3).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "updateIncomingRcsInTelephony", (char) 1042, "RcsTelephonyAccessImpl.java")).q("updateIncomingRcsInTelephony: failed to create PDU");
                    return null;
                }
            }
        }, this.e);
    }

    @Override // defpackage.ckch
    public final elfl m(final MessageCoreData messageCoreData, final Uri uri, final String str, final int i) {
        return !((atwp) this.p.b()).a() ? elfo.e(null) : z(messageCoreData).h(new emwl() { // from class: ckcz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String path;
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                final int i2 = i;
                final String str2 = str;
                final Uri uri2 = uri;
                final MessageCoreData messageCoreData2 = messageCoreData;
                final ckdm ckdmVar = ckdm.this;
                emxf.a(!ckdmVar.f.i());
                Uri a2 = ckdmVar.n.a(new emyl() { // from class: ckcn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return ckdm.this.u(messageCoreData2, uri2, str2, i2);
                    }
                });
                if (i2 == 1) {
                    ckdmVar.r(messageCoreData2.u(), 100);
                }
                if (!((ersq) ((atwf) ckdmVar.t).a.b()).a("bugle.switch_to_telefoni_uri_after_persisting") || i2 != 1 || a2 == null || !a2.toString().startsWith(Telephony.Mms.CONTENT_URI.toString())) {
                    return null;
                }
                MessagePartCoreData G = messageCoreData2.G();
                G.getClass();
                G.au(a2);
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("createMessagePartUpdateBuilder");
                bwdiVar.z(a2);
                ((bdpt) ckdmVar.h.b()).f(messageCoreData2.z(), messageCoreData2.B(), G.aa(), bwdiVar);
                ensk h = ckdm.a.h();
                h.Y(ente.a, "BugleTelephony");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "updateAttachmentInTelephonyDb", 353, "RcsTelephonyAccessImpl.java")).t("<><><><> Updated content URI in Bugle DB to %s", a2);
                String scheme = uri2.getScheme();
                if (scheme == null || !scheme.equals("file") || (path = uri2.getPath()) == null) {
                    return null;
                }
                new File(path).delete();
                ensk h2 = ckdm.a.h();
                h2.Y(ente.a, "BugleTelephony");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "updateAttachmentInTelephonyDb", 362, "RcsTelephonyAccessImpl.java")).t("<><><><> Deleted temporary file %s", path);
                return null;
            }
        }, this.e);
    }

    public final Uri n(final MessageCoreData messageCoreData, final Uri uri, final String str, final ckdi ckdiVar) {
        emxf.a(!this.f.i());
        return this.n.a(new emyl() { // from class: ckcs
            @Override // defpackage.emyl
            public final Object get() {
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                Uri u = messageCoreData2.u();
                u.getClass();
                Uri uri2 = uri;
                ckdi ckdiVar2 = ckdiVar;
                MessagePartCoreData G = messageCoreData2.G();
                String str2 = str;
                if (G == null) {
                    ensk i = ckdm.a.i();
                    i.Y(ente.a, "BugleTelephony");
                    enrr enrrVar = (enrr) i;
                    enrrVar.Y(csux.f, messageCoreData2.E());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "doStoreAttachmentInTelephonyDb", 566, "RcsTelephonyAccessImpl.java")).q("Missing message part, returning local directory copies");
                } else {
                    try {
                        return ckdiVar2.a(u, uri2, G, str2, messageCoreData2.aI());
                    } catch (lj e) {
                        ensk i2 = ckdm.a.i();
                        i2.Y(ente.a, "BugleTelephony");
                        ((enrr) ((enrr) ((enrr) i2).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "doStoreAttachmentInTelephonyDb", (char) 575, "RcsTelephonyAccessImpl.java")).q("IncomingRcs: persist attachment message failure");
                    }
                }
                return uri2;
            }
        });
    }

    public final Uri o(MessageCoreData messageCoreData, Uri uri, String str) {
        File file = new File(this.b.getFilesDir(), "rcs_attachments");
        csum csumVar = this.d;
        return csuu.i(this.b, uri, file, messageCoreData.al(), str, csumVar);
    }

    public final String p(boolean z, MessageCoreData messageCoreData) {
        if (messageCoreData.da()) {
            return null;
        }
        return z ? messageCoreData.w().d : ((ckds) this.c.b()).s();
    }

    public final void q(MessageCoreData messageCoreData, long j) {
        ConversationIdType z = messageCoreData.z();
        cskc cskcVar = bdmq.a;
        ekzz f = eleg.f("MessageDatabaseOperations#getCountOfMessagesInBothConversationAndInTelephony");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(z);
            buxzVar.ad();
            int d = bdmq.d(new buxs(buxzVar));
            f.close();
            if (d > 0) {
                return;
            }
            MessageCoreData g = ((byzp) this.x.b()).g(z, messageCoreData.v(), " ", null, false);
            g.bx(true);
            g.bV(1);
            ((bdjr) this.z.b()).a(g);
            ArrayList a2 = ((bdfw) this.j.b()).a(z, true);
            String p = p(true, messageCoreData);
            long o = g.o();
            cgtf cgtfVar = new cgtf();
            cgtfVar.b = ((ckds) this.c.b()).g(g);
            cgtfVar.a = 1L;
            Uri m = ((coxk) this.k.b()).m(this.b, a2, g, cgtfVar, j, -1, p, o, null);
            if (m != null) {
                g.bD(m);
                s(g.z(), g.B(), m);
            }
        } finally {
        }
    }

    public final void r(final Uri uri, final int i) {
        this.y.ifPresent(new Consumer() { // from class: ckcr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((akni) obj).a(uri, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void s(ConversationIdType conversationIdType, MessageIdType messageIdType, Uri uri) {
        if (uri != null) {
            bdmq bdmqVar = (bdmq) this.v.b();
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("updateMessageUri");
            buxrVar.S(uri);
            bdmqVar.U(conversationIdType, messageIdType, buxrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:3:0x0010, B:8:0x003d, B:28:0x0039, B:27:0x0036, B:22:0x0030, B:15:0x0026), top: B:2:0x0010, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r10) {
        /*
            r9 = this;
            ffbr r0 = r9.g
            java.lang.Object r0 = r0.b()
            cgtc r0 = (defpackage.cgtc) r0
            java.lang.String r1 = "PduPersister.isAttachmentNotSavedYet"
            ekzz r1 = defpackage.eleg.f(r1)
            java.lang.String r2 = "<file_transfer_original>"
            android.net.Uri r4 = defpackage.cgtc.a(r10)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "cid=?"
            java.lang.String[] r7 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r3 = r0.h     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r8 = 0
            android.database.Cursor r10 = defpackage.cgsx.c(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            r11 = 1
            r0 = 0
            if (r10 == 0) goto L3a
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L3a
            r2 = r11
            goto L3b
        L2e:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch: java.lang.Throwable -> L34
            goto L39
        L34:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.lang.Throwable -> L47
        L39:
            throw r11     // Catch: java.lang.Throwable -> L47
        L3a:
            r2 = r0
        L3b:
            if (r10 == 0) goto L40
            r10.close()     // Catch: java.lang.Throwable -> L47
        L40:
            r1.close()
            if (r2 != 0) goto L46
            return r11
        L46:
            return r0
        L47:
            r0 = move-exception
            r10 = r0
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L52:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdm.t(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (t(r4) != false) goto L19;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri u(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11, android.net.Uri r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdm.u(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, android.net.Uri, java.lang.String, int):android.net.Uri");
    }

    public final int v(MessagePartCoreData messagePartCoreData) {
        return ((csug) this.E.b()).a(messagePartCoreData.p()).c() ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[Catch: circ -> 0x018c, ehxg -> 0x018e, circ | ehxg | SecurityException -> 0x0190, TryCatch #4 {circ | ehxg | SecurityException -> 0x0190, blocks: (B:25:0x0117, B:27:0x0133, B:29:0x0137, B:31:0x0149, B:32:0x0163), top: B:24:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long w(long r19, com.google.android.ims.rcsservice.group.GroupInfo r21) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdm.w(long, com.google.android.ims.rcsservice.group.GroupInfo):long");
    }
}
