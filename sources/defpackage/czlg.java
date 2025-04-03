package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.conversation.message.MessageDetails;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czlg {
    private final ctwb a;
    private final csrv b;
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final cuxh f;
    private final csrh g;
    private final ffbr h;
    private final czlb i;
    private final aolr j;
    private final fazb k;
    private final chco l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final bzyb q;

    public czlg(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cuxh cuxhVar, ctwb ctwbVar, bzyb bzybVar, csrv csrvVar, csrh csrhVar, ffbr ffbrVar5, czlb czlbVar, aolr aolrVar, fazb fazbVar, chco chcoVar, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.c = context;
        this.p = ffbrVar;
        this.m = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = cuxhVar;
        this.a = ctwbVar;
        this.q = bzybVar;
        this.b = csrvVar;
        this.g = csrhVar;
        this.h = ffbrVar5;
        this.i = czlbVar;
        this.j = aolrVar;
        this.k = fazbVar;
        this.l = chcoVar;
        this.n = ffbrVar6;
        this.o = ffbrVar7;
    }

    private final List b(bctw bctwVar, String str, boolean z, SelfIdentityId selfIdentityId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ParticipantsTable.BindData> it = bctwVar.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData next = it.next();
            if (!TextUtils.equals(next.S(), str) && (!bdtd.m(next) || (next.S().equals(aquz.b(selfIdentityId)) && z))) {
                String p = this.j.q(next).p(true);
                if (!TextUtils.isEmpty(p)) {
                    arrayList.add(p);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(czla czlaVar, final bcse bcseVar, bctw bctwVar, long j, aztg aztgVar) {
        coux couxVar;
        List list;
        efbd.b();
        czlaVar.c("\n\n");
        czlaVar.c("DEBUG");
        czlaVar.a('\n');
        czlaVar.c("Message id: ");
        czlaVar.c(bcseVar.u().b());
        czlaVar.a('\n');
        czlaVar.c("Rcs Message id: ");
        czlaVar.c(bcseVar.w().b);
        czlaVar.a('\n');
        czlaVar.c("Xms Transport: ");
        czlaVar.c(bcseVar.c.L().toString());
        czlaVar.a('\n');
        czlaVar.c("Web id: ");
        czlaVar.c(bcseVar.X());
        czlaVar.a('\n');
        czlaVar.c("Cms id: ");
        czlaVar.c(bcseVar.c.R());
        czlaVar.a('\n');
        czlaVar.c("CMS lifecycle: ");
        czlaVar.c(bcseVar.c.M().toString());
        for (MessagePartCoreData messagePartCoreData : bcseVar.g) {
            czlaVar.a('\n');
            czlaVar.c("CMS Full size blob ID: ");
            czlaVar.c(messagePartCoreData.S());
            czlaVar.a('\n');
            czlaVar.c("CMS Compressed blob ID: ");
            czlaVar.c(messagePartCoreData.R());
        }
        czlaVar.a('\n');
        czlaVar.c("Status: ");
        czlaVar.c(axuh.a(bcseVar.f()));
        czlaVar.c(" (");
        czlaVar.b(bcseVar.f());
        czlaVar.c(")");
        czlaVar.a('\n');
        czlaVar.c("Result code: ");
        czlaVar.b(bcseVar.c.o());
        czlaVar.a('\n');
        czlaVar.c("Error code: ");
        czlaVar.b(bcseVar.e());
        czlaVar.a('\n');
        czlaVar.c("Content type: ");
        czlaVar.c((String) Collection.EL.stream(bcseVar.g).map(new Function() { // from class: czlf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String V = ((MessagePartCoreData) obj).V();
                return V == null ? "" : V;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
        int d = bcseVar.d();
        czlaVar.a('\n');
        czlaVar.c("Status code: ");
        czlaVar.b(d);
        String G = bcseVar.G();
        if (!TextUtils.isEmpty(G)) {
            czlaVar.a('\n');
            czlaVar.c("Error: ");
            czlaVar.c(G);
        }
        String U = bcseVar.U();
        czlaVar.a('\n');
        czlaVar.c("Telephony uri: ");
        czlaVar.c(U);
        ConversationIdType t = bcseVar.t();
        if (t.b()) {
            return;
        }
        czlaVar.a('\n');
        czlaVar.c("Conversation id: ");
        czlaVar.c(t.a());
        czlaVar.a('\n');
        czlaVar.c("Conversation participants: [");
        Iterator<ParticipantsTable.BindData> it = bctwVar.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData next = it.next();
            if (!bdtd.m(next)) {
                czlaVar.a(' ');
                czlaVar.c(this.j.t(next).p(true));
            }
        }
        czlaVar.c(" ]");
        czlaVar.a('\n');
        czlaVar.c("RCS Session id: ");
        czlaVar.b(j);
        czlaVar.a('\n');
        czlaVar.a('\n');
        if (((atrd) this.p.b()).a()) {
            czlaVar.c("RCS MSISDNs: [");
            Stream map = Collection.EL.stream(((crgh) this.m.b()).e()).map(new Function() { // from class: czle
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((awui) obj).d;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            czlaVar.c(czld.a(", ", (engw) map.collect(endq.a)));
            czlaVar.c("]");
        } else {
            czlaVar.c("RCS Msisdn: ");
            czlaVar.c(this.l.f());
        }
        czlaVar.a('\n');
        czlaVar.a('\n');
        czlaVar.c("RCS Group Id: ");
        czlaVar.c(emxe.b(bcseVar.M()));
        czlaVar.a('\n');
        czlaVar.a('\n');
        czlaVar.c("Self participant number: ");
        bvvn e = ParticipantsTable.e();
        e.z("getSelfParticipantSendDestination");
        e.h(new Function() { // from class: bcsa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.k(emxe.b(aquz.b(bcse.this.s())));
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvti bvtiVar = (bvti) e.b().p(ParticipantsTable.c.g);
        try {
            engw n = bvtiVar.n();
            bvtiVar.close();
            czlaVar.c(((enou) n).c != 1 ? "" : (String) n.get(0));
            czlaVar.a('\n');
            cpxu a = ((cbek) this.d.b()).a(t);
            czlaVar.a('\n');
            czlaVar.c("BCM: ".concat(String.valueOf(String.valueOf(ayhv.a.e()))));
            czlaVar.a('\n');
            czlaVar.c("Conversation telephony thread id: ");
            czlaVar.c(a.toString());
            if (!bcseVar.aC()) {
                couxVar = null;
            } else {
                if (U == null || (couxVar = ((coxk) this.e.b()).u(Uri.parse(U))) == null) {
                    return;
                }
                long j2 = couxVar.i;
                czlaVar.a('\n');
                czlaVar.c("Telephony thread id: ");
                czlaVar.b(j2);
                String str = couxVar.n;
                czlaVar.a('\n');
                czlaVar.c("Content location URL: ");
                czlaVar.c(str);
            }
            String I = ((coxk) this.e.b()).I(a);
            if (I != null) {
                czlaVar.a('\n');
                czlaVar.c("Thread recipient ids: ");
                czlaVar.c(I);
                czlaVar.a('\n');
                czlaVar.c("Group canonical address: ");
                czlaVar.c(bcseVar.M() != null ? emxe.b(((cuwz) this.n.b()).c(emxe.b(((coxk) this.e.b()).E(Long.parseLong(I))))) : "");
            }
            String U2 = couxVar != null ? couxVar.a : bcseVar.U();
            if (U2 != null) {
                cpbd z = ((coxk) this.e.b()).z(coto.a, a, U2);
                czlaVar.a('\n');
                czlaVar.c("Thread recipients: ");
                czlaVar.c(z.b.toString());
                if (couxVar != null) {
                    String F = ((coxk) this.e.b()).F(z, U2);
                    if (true == TextUtils.isEmpty(F)) {
                        F = "ʼUNKNOWN_SENDER!ʼ";
                    }
                    czlaVar.a('\n');
                    czlaVar.c("Sender: ");
                    czlaVar.d(F);
                }
                czlaVar.a('\n');
                czlaVar.c("Logging id: ");
                czlaVar.b(bcseVar.n());
            }
            if (bcseVar.az()) {
                Map b = ((bdnf) this.o.b()).b(bcseVar.u());
                if (!b.keySet().isEmpty()) {
                    czlaVar.a('\n');
                    czlaVar.a('\n');
                    czlaVar.c("-- Received Message Info --");
                    czlaVar.a('\n');
                }
                for (byzb byzbVar : byzb.values()) {
                    if (b.containsKey(byzbVar) && (list = (List) b.get(byzbVar)) != null && !list.isEmpty() && !((String) list.get(0)).isEmpty()) {
                        czlaVar.c(byzbVar.name());
                        czlaVar.c(": ");
                        czlaVar.c(czld.a(",", list));
                        czlaVar.a('\n');
                    }
                }
                engw a2 = ((bdnf) this.o.b()).a(bcseVar.u());
                if (a2.isEmpty()) {
                    return;
                }
                bdnd bdndVar = (bdnd) a2.get(0);
                czlaVar.c("TRANSPORT_PROTOCOL: ");
                czlaVar.c(bdndVar.a().name());
                czlaVar.a('\n');
                String s = this.a.h(aztgVar.e()).s();
                enqu listIterator = bdndVar.b().keySet().listIterator();
                while (listIterator.hasNext()) {
                    String str2 = (String) listIterator.next();
                    String str3 = (String) bdndVar.b().get(str2);
                    if (str3 != null && !str3.isEmpty() && !emuz.e(s, str3) && !emuz.e("auto", str3)) {
                        czlaVar.c(String.valueOf(str2).concat(": "));
                        czlaVar.c((String) bdndVar.b().get(str2));
                        czlaVar.a('\n');
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (r8 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(android.content.res.Resources r20, defpackage.czla r21, defpackage.bcse r22, defpackage.bctw r23) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czlg.d(android.content.res.Resources, czla, bcse, bctw):void");
    }

    private final void e(Resources resources, aztg aztgVar, czla czlaVar) {
        if (this.a.a() < 2) {
            return;
        }
        czlaVar.a('\n');
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.sim_label));
        String h = aztgVar.h();
        if (TextUtils.isEmpty(h)) {
            sb.append(resources.getString(R.string.sim_slot_identifier, Integer.valueOf(aztgVar.c())));
        } else {
            sb.append(h);
        }
        cuxh cuxhVar = this.f;
        String sb2 = sb.toString();
        ksg ksgVar = ksk.b;
        if (cuxhVar.d() && !TextUtils.isEmpty(sb2)) {
            kse a = kse.a();
            if (sb2.contains(":")) {
                String[] split = sb2.split(":");
                for (int i = 0; i < split.length; i++) {
                    split[i] = a.c(split[i], ksgVar);
                }
                sb2 = new emww(":").f(split);
            } else {
                sb2 = a.c(sb2, ksgVar);
            }
        }
        czlaVar.c(sb2);
    }

    private final void f(Resources resources, czla czlaVar, int i, long j) {
        if (j != 0) {
            czlaVar.a('\n');
            czlaVar.c(resources.getString(i));
            czlaVar.c(this.g.b(j).toString());
        }
    }

    /* JADX WARN: Type inference failed for: r9v19, types: [aoku, java.lang.Object] */
    public final MessageDetails a(bcse bcseVar, bctw bctwVar, aztg aztgVar, long j) {
        czla a;
        czla czlaVar;
        int i = 0;
        if (bcseVar.aX()) {
            Context context = this.c;
            czlb czlbVar = this.i;
            Resources resources = context.getResources();
            a = czlbVar.a(bcseVar.u());
            a.c(resources.getString(R.string.message_type_label));
            a.c(resources.getString(R.string.text_message));
            String p = bcseVar.az() ? bcseVar.r().p(true) : aztgVar.b().isPresent() ? aztgVar.b().get().G().a : null;
            if (!TextUtils.isEmpty(p)) {
                a.a('\n');
                a.c(resources.getString(R.string.from_label));
                a.d(p);
            }
            List b = b(bctwVar, bcseVar.I(), bcseVar.az(), bcseVar.s());
            if (!b.isEmpty()) {
                a.a('\n');
                a.c(resources.getString(R.string.to_address_label));
                while (i < b.size()) {
                    if (i > 0) {
                        a.c(", ");
                    }
                    a.d((String) b.get(i));
                    i++;
                }
            }
            e(resources, aztgVar, a);
            d(resources, a, bcseVar, bctwVar);
            if (this.b.q()) {
                czlaVar = a;
                c(czlaVar, bcseVar, bctwVar, -1L, aztgVar);
            }
            czlaVar = a;
        } else {
            Context context2 = this.c;
            czlb czlbVar2 = this.i;
            Resources resources2 = context2.getResources();
            a = czlbVar2.a(bcseVar.u());
            a.c(resources2.getString(R.string.message_type_label));
            if (bcseVar.aM()) {
                bzyb bzybVar = this.q;
                boolean av = bcseVar.av();
                String string = resources2.getString(R.string.rcs_message);
                if (av && bzwd.f()) {
                    string = bzybVar.a.getString(R.string.encrypted_rcs_message);
                }
                a.c(string);
            } else {
                a.c(resources2.getString(R.string.multimedia_message));
            }
            String p2 = bcseVar.r().p(true);
            a.a('\n');
            a.c(resources2.getString(R.string.from_label));
            if (TextUtils.isEmpty(p2)) {
                a.c(resources2.getString(R.string.hidden_sender_address));
            } else {
                a.d(p2);
            }
            List b2 = b(bctwVar, bcseVar.I(), bcseVar.az(), bcseVar.s());
            if (!b2.isEmpty()) {
                a.a('\n');
                a.c(resources2.getString(R.string.to_address_label));
                while (i < b2.size()) {
                    if (i > 0) {
                        a.c(", ");
                    }
                    a.d((String) b2.get(i));
                    i++;
                }
            }
            if (bcseVar.aC()) {
                a.a('\n');
                a.c(resources2.getString(R.string.subject_label));
                if (!TextUtils.isEmpty(((cpdg) this.k.b()).c(resources2, bcseVar.H()))) {
                    a.c(bcseVar.H());
                }
            }
            a.a('\n');
            a.c(resources2.getString(R.string.priority_label));
            int r = bcseVar.c.r();
            a.c(r != 128 ? r != 130 ? resources2.getString(R.string.priority_normal) : resources2.getString(R.string.priority_high) : resources2.getString(R.string.priority_low));
            if (bcseVar.l() > 0 && !bcseVar.aG()) {
                a.a('\n');
                a.c(resources2.getString(R.string.message_size_label));
                a.c(Formatter.formatFileSize(context2, bcseVar.l()));
            }
            e(resources2, aztgVar, a);
            d(resources2, a, bcseVar, bctwVar);
            if (this.b.q() || ((Boolean) czhm.b.e()).booleanValue()) {
                czlaVar = a;
                c(czlaVar, bcseVar, bctwVar, j, aztgVar);
            }
            czlaVar = a;
        }
        czla czlaVar2 = czlaVar;
        return new MessageDetails(czlaVar2.a, czlaVar2.b.toString(), czlaVar2.c);
    }
}
