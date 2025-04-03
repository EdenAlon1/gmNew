package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpz extends lml implements ddqq {
    public final cqoh a;
    public final bdwr b;
    public final errl c;
    public final cbpl d;
    public UrlSearchResult f;
    private final ddwg g;
    private final ctyz h;
    private final ahor i;
    private final llg j;
    private final llg k;
    private final llg l;
    private final llg m;
    private ListenableFuture n = null;
    public volatile Long e = null;

    public ddpz(cqoh cqohVar, bdwr bdwrVar, errl errlVar, cbpl cbplVar, ddwg ddwgVar, ctyz ctyzVar, ahor ahorVar, avei aveiVar, UrlSearchResult urlSearchResult) {
        this.a = cqohVar;
        this.b = bdwrVar;
        this.c = errlVar;
        this.d = cbplVar;
        this.g = ddwgVar;
        this.h = ctyzVar;
        this.i = ahorVar;
        this.f = urlSearchResult;
        llg llgVar = new llg();
        this.j = llgVar;
        llg llgVar2 = new llg();
        this.k = llgVar2;
        llg llgVar3 = new llg();
        this.l = llgVar3;
        llg llgVar4 = new llg();
        this.m = llgVar4;
        if (!aveiVar.a()) {
            n(urlSearchResult);
            return;
        }
        llgVar.m(r(urlSearchResult));
        llgVar2.m(q(urlSearchResult));
        llgVar3.m(ddwgVar.c(urlSearchResult));
        llgVar4.m(p(ctyzVar, cqohVar, urlSearchResult));
    }

    private static Uri p(ctyz ctyzVar, cqoh cqohVar, UrlSearchResult urlSearchResult) {
        if (!ctyzVar.g()) {
            return null;
        }
        fbuk l = urlSearchResult.l();
        fbue fbueVar = l.c == 8 ? (fbue) l.d : fbue.a;
        if ((fbueVar.b & 2) != 0) {
            fbug fbugVar = fbueVar.e;
            if (fbugVar == null) {
                fbugVar = fbug.a;
            }
            if (!fbugVar.d.isEmpty()) {
                fbug fbugVar2 = fbueVar.e;
                if (fbugVar2 == null) {
                    fbugVar2 = fbug.a;
                }
                if (fbugVar2.e > cqohVar.f().toEpochMilli()) {
                    fbug fbugVar3 = fbueVar.e;
                    if (fbugVar3 == null) {
                        fbugVar3 = fbug.a;
                    }
                    return Uri.parse(fbugVar3.d);
                }
            }
        }
        if (TextUtils.isEmpty(urlSearchResult.p()) || urlSearchResult.g() <= cqohVar.f().toEpochMilli()) {
            return null;
        }
        return Uri.parse(urlSearchResult.p());
    }

    private static String q(UrlSearchResult urlSearchResult) {
        String str;
        fbuk l = urlSearchResult.l();
        fbue fbueVar = l.c == 8 ? (fbue) l.d : fbue.a;
        if ((fbueVar.b & 2) != 0) {
            fbug fbugVar = fbueVar.e;
            if (fbugVar == null) {
                fbugVar = fbug.a;
            }
            str = fbugVar.f;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            urlSearchResult.az(14, "link_domain");
            str = urlSearchResult.o;
        }
        if (TextUtils.isEmpty(str)) {
            String host = Uri.parse(s(urlSearchResult)).getHost();
            if (!TextUtils.isEmpty(host)) {
                String[] split = host.split("\\.", -1);
                int length = split.length;
                emxf.a(length > 0);
                return length == 1 ? split[0] : String.format("%s.%s", split[length - 2], split[length - 1]);
            }
        }
        return str;
    }

    private static String r(UrlSearchResult urlSearchResult) {
        String str;
        fbuk l = urlSearchResult.l();
        fbue fbueVar = l.c == 8 ? (fbue) l.d : fbue.a;
        if ((fbueVar.b & 2) != 0) {
            fbug fbugVar = fbueVar.e;
            if (fbugVar == null) {
                fbugVar = fbug.a;
            }
            str = fbugVar.b;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = urlSearchResult.q();
        }
        if (TextUtils.isEmpty(str)) {
            str = s(urlSearchResult);
        }
        emxf.a(!TextUtils.isEmpty(str));
        return str;
    }

    private static String s(UrlSearchResult urlSearchResult) {
        String str;
        fbuk l = urlSearchResult.l();
        fbue fbueVar = l.c == 8 ? (fbue) l.d : fbue.a;
        if ((fbueVar.b & 2) != 0) {
            fbug fbugVar = fbueVar.e;
            if (fbugVar == null) {
                fbugVar = fbug.a;
            }
            str = fbugVar.c;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = urlSearchResult.o();
        }
        if (TextUtils.isEmpty(str)) {
            str = fbueVar.c;
            if (Uri.parse(str).getScheme() == null) {
                str = "http://".concat(String.valueOf(str));
            }
        }
        emxf.a(!TextUtils.isEmpty(str));
        return str;
    }

    @Override // defpackage.ddqq
    public final lld a() {
        return this.k;
    }

    @Override // defpackage.ddqq
    public final lld b() {
        return this.m;
    }

    @Override // defpackage.ddqq
    public final lld c() {
        return this.l;
    }

    @Override // defpackage.ddqq
    public final lld e() {
        return this.j;
    }

    @Override // defpackage.ddqq
    public final UrlSearchResult f() {
        return this.f;
    }

    @Override // defpackage.ddqq
    public final String k() {
        return this.f.n();
    }

    @Override // defpackage.ddqq
    public final String l() {
        return s(this.f);
    }

    @Override // defpackage.ddqq
    public final void m() {
        efbd.c();
        ahor ahorVar = this.i;
        if (ahorVar.a.g() && ahorVar.g() && ahorVar.f()) {
            ListenableFuture listenableFuture = this.n;
            if (listenableFuture == null || listenableFuture.isCancelled() || this.n.isDone()) {
                fbuk l = this.f.l();
                fbue fbueVar = l.c == 8 ? (fbue) l.d : fbue.a;
                if ((fbueVar.b & 2) != 0) {
                    fbug fbugVar = fbueVar.e;
                    if (fbugVar == null) {
                        fbugVar = fbug.a;
                    }
                    if (fbugVar.e >= this.a.f().toEpochMilli()) {
                        return;
                    }
                }
                this.n = elfo.h(new erog() { // from class: ddpy
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final ddpz ddpzVar = ddpz.this;
                        if (ddpzVar.e != null && ddpzVar.e.longValue() > ddpzVar.a.f().toEpochMilli() - 60000) {
                            return elfo.e(null);
                        }
                        final bdwr bdwrVar = ddpzVar.b;
                        fbuk l2 = ddpzVar.f.l();
                        final fbue fbueVar2 = l2.c == 8 ? (fbue) l2.d : fbue.a;
                        final MessageIdType k = ddpzVar.f.k();
                        return elfo.h(new erog() { // from class: bdwj
                            /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
                            
                                if (defpackage.bdqu.p(r4) != false) goto L27;
                             */
                            @Override // defpackage.erog
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.google.common.util.concurrent.ListenableFuture a() {
                                /*
                                    Method dump skipped, instructions count: 293
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.bdwj.a():com.google.common.util.concurrent.ListenableFuture");
                            }
                        }, bdwrVar.q).h(new emwl() { // from class: ddpx
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                fbuk l3;
                                fbue fbueVar3 = (fbue) obj;
                                ddpz ddpzVar2 = ddpz.this;
                                ddpzVar2.e = Long.valueOf(ddpzVar2.a.f().toEpochMilli());
                                fbueVar3.getClass();
                                if ((fbueVar3.b & 2) != 0 && (l3 = ddpzVar2.f.l()) != null) {
                                    fbuj fbujVar = (fbuj) l3.toBuilder();
                                    fbujVar.copyOnWrite();
                                    fbuk fbukVar = (fbuk) fbujVar.instance;
                                    fbukVar.d = fbueVar3;
                                    fbukVar.c = 8;
                                    fbuk fbukVar2 = (fbuk) fbujVar.build();
                                    ddpzVar2.d.p(ddpzVar2.f.n(), fbukVar2);
                                    String[] strArr = UrlSearchQuery.a;
                                    dtrr dtrrVar = new dtrr(UrlSearchQuery.d());
                                    ConversationIdType conversationIdType = bdgq.a;
                                    MessageIdType k2 = ddpzVar2.f.k();
                                    int i = dtrrVar.aB;
                                    if (i < 20040) {
                                        dtub.w("message_id", i);
                                    }
                                    dtrrVar.aE(1);
                                    ConversationIdType j = ddpzVar2.f.j();
                                    dtrrVar.aE(3);
                                    dtrrVar.aE(2);
                                    String m = ddpzVar2.f.m();
                                    dtrrVar.aE(7);
                                    if (!dtrrVar.aC) {
                                        m = cuxs.a(m);
                                    }
                                    long i2 = ddpzVar2.f.i();
                                    dtrrVar.aE(4);
                                    int f = ddpzVar2.f.f();
                                    dtrrVar.aE(5);
                                    String r = ddpzVar2.f.r();
                                    dtrrVar.aE(6);
                                    if (!dtrrVar.aC) {
                                        r = cuxd.a(r);
                                    }
                                    String n = ddpzVar2.f.n();
                                    dtrrVar.aE(0);
                                    UrlSearchResult urlSearchResult = new UrlSearchResult();
                                    urlSearchResult.aC(dtrrVar.aB());
                                    urlSearchResult.a = n;
                                    urlSearchResult.b = k2;
                                    urlSearchResult.c = fbukVar2;
                                    urlSearchResult.d = j;
                                    urlSearchResult.e = i2;
                                    urlSearchResult.f = f;
                                    urlSearchResult.g = r;
                                    urlSearchResult.h = m;
                                    urlSearchResult.i = 0L;
                                    urlSearchResult.j = null;
                                    urlSearchResult.k = 0L;
                                    urlSearchResult.l = null;
                                    urlSearchResult.m = null;
                                    urlSearchResult.n = null;
                                    urlSearchResult.o = null;
                                    urlSearchResult.p = null;
                                    urlSearchResult.q = false;
                                    urlSearchResult.r = false;
                                    urlSearchResult.s = 0L;
                                    urlSearchResult.t = conversationIdType;
                                    urlSearchResult.u = null;
                                    urlSearchResult.v = false;
                                    urlSearchResult.cK = dtrrVar.aC();
                                    ddpzVar2.f = urlSearchResult;
                                    ddpzVar2.n(ddpzVar2.f);
                                }
                                return null;
                            }
                        }, ddpzVar.c);
                    }
                }, this.c);
            }
        }
    }

    public final void n(UrlSearchResult urlSearchResult) {
        this.j.j(r(urlSearchResult));
        this.k.j(q(urlSearchResult));
        this.l.j(this.g.c(urlSearchResult));
        this.m.j(p(this.h, this.a, urlSearchResult));
    }

    @Override // defpackage.ddqq
    public final boolean o() {
        return this.f.h() > 0;
    }
}
