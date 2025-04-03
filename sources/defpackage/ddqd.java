package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqd implements ddqs {
    private static final cskc e = cskc.g("BugleSearch", "LocationCardPresenterImpl");
    public final ctyz a;
    public final llg b;
    public final llg c;
    public final llg d;
    private final cbni f;
    private final errl g;
    private final ddwg h;
    private final cqoh i;
    private final ames j;
    private elfl k;
    private elfl l;
    private final llg m;

    public ddqd(Context context, errl errlVar, ddwg ddwgVar, ctyz ctyzVar, cqoh cqohVar, ames amesVar, cbni cbniVar) {
        this.g = errlVar;
        context.getResources();
        this.h = ddwgVar;
        this.a = ctyzVar;
        this.i = cqohVar;
        this.j = amesVar;
        this.b = new llg();
        this.c = new llg();
        this.m = new llg();
        this.d = new llg();
        this.f = cbniVar;
    }

    private final elfl p() {
        return !TextUtils.isEmpty(j(g().u())) ? elfo.e(Optional.empty()) : elfo.e(Optional.empty());
    }

    @Override // defpackage.ddqs
    public final lld a() {
        return this.c;
    }

    @Override // defpackage.ddqs
    public final lld b() {
        return this.d;
    }

    @Override // defpackage.ddqs
    public final lld c() {
        return this.m;
    }

    @Override // defpackage.ddqs
    public final lld d() {
        return this.b;
    }

    @Override // defpackage.ddqs
    public final ConversationId e() {
        cbni cbniVar = this.f;
        return this.j.a(cbniVar.c(), cbniVar.p(), cbniVar.q());
    }

    @Override // defpackage.ddqs
    public final MessageIdType f() {
        return this.f.d();
    }

    public final cbni g() {
        elfl elflVar = this.k;
        if (elflVar != null && elflVar.isDone() && !this.k.isCancelled()) {
            try {
                cbni cbniVar = (cbni) erqt.q(this.k);
                if (cbniVar != null) {
                    return cbniVar;
                }
            } catch (Exception e2) {
                csjb e3 = e.e();
                e3.v("Failed to get fetch place data.");
                e3.s(e2);
            }
        }
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[Catch: IllegalArgumentException -> 0x0136, TryCatch #3 {IllegalArgumentException -> 0x0136, blocks: (B:28:0x004f, B:30:0x0053, B:31:0x0055, B:45:0x00f5, B:47:0x00fa, B:49:0x00fe, B:50:0x0100, B:52:0x0106, B:53:0x0108, B:34:0x00c4, B:36:0x00ca, B:37:0x00d2, B:40:0x00da, B:42:0x00e0, B:55:0x0121, B:56:0x0126, B:57:0x0127, B:58:0x012c, B:61:0x012e, B:62:0x0135), top: B:27:0x004f, inners: #2 }] */
    @Override // defpackage.ddqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddqd.h():java.lang.String");
    }

    public final String i() {
        fbrx s = g().s();
        if (s == null) {
            return "";
        }
        int i = s.b;
        if ((i & 1) == 0) {
            if ((i & 8) == 0) {
                return "";
            }
            fbxs fbxsVar = s.f;
            if (fbxsVar == null) {
                fbxsVar = fbxs.a;
            }
            return fbxsVar.b;
        }
        fbvn fbvnVar = s.c;
        if (fbvnVar == null) {
            fbvnVar = fbvn.a;
        }
        emww emwwVar = new emww(", ");
        emwt emwtVar = new emwt(emwwVar, emwwVar);
        String a = emxe.a(fbvnVar.e);
        String a2 = emxe.a(fbvnVar.f);
        emww emwwVar2 = new emww(" ");
        return emwtVar.f(new String[]{a, a2, emxe.a(new emwt(emwwVar2, emwwVar2).f(new String[]{emxe.a(fbvnVar.g), emxe.a(fbvnVar.h)}))});
    }

    public final String j(fbug fbugVar) {
        if (fbugVar == null || fbugVar.d.isEmpty() || fbugVar.e <= this.i.f().toEpochMilli()) {
            return null;
        }
        return fbugVar.d;
    }

    @Override // defpackage.ddqs
    public final String k() {
        String l = l();
        String i = i();
        String h = h();
        emww emwwVar = new emww("\n");
        String g = new emwt(emwwVar, emwwVar).g(emxe.a(l), emxe.a(i), new Object[0]);
        return (TextUtils.isEmpty(h) || h.equals(l)) ? g : a.w(h, g, "\n\n");
    }

    public final String l() {
        cbni g = g();
        fbrx s = g.s();
        if (s != null && (s.b & 2) != 0) {
            fbvj fbvjVar = s.d;
            if (fbvjVar == null) {
                fbvjVar = fbvj.a;
            }
            if (!fbvjVar.d.isEmpty()) {
                fbvj fbvjVar2 = s.d;
                if (fbvjVar2 == null) {
                    fbvjVar2 = fbvj.a;
                }
                return fbvjVar2.d;
            }
        }
        fbug u = g.u();
        if (u != null && !u.b.isEmpty()) {
            return u.b;
        }
        if (s != null && (s.b & 1) != 0) {
            fbvn fbvnVar = s.c;
            if (fbvnVar == null) {
                fbvnVar = fbvn.a;
            }
            emww emwwVar = new emww(", ");
            String f = new emwt(emwwVar, emwwVar).f(new String[]{emxe.a(fbvnVar.b), emxe.a(fbvnVar.c), emxe.a(fbvnVar.d)});
            if (!TextUtils.isEmpty(f)) {
                return f;
            }
        }
        return emxe.b(h());
    }

    @Override // defpackage.ddqs
    public final void m() {
        elfl elflVar = this.k;
        if (elflVar != null && !elflVar.isDone()) {
            this.k.cancel(false);
            this.k = null;
        }
        elfl elflVar2 = this.l;
        if (elflVar2 == null || elflVar2.isDone()) {
            return;
        }
        this.l.cancel(false);
        this.l = null;
    }

    @Override // defpackage.ddqs
    public final void n() {
        boolean z;
        efbd.c();
        elfl elflVar = this.k;
        if (elflVar == null || elflVar.isCancelled()) {
            this.k = elfo.e(this.f);
            this.l = p();
            z = false;
        } else {
            z = true;
        }
        elfl elflVar2 = this.l;
        if (elflVar2 == null || elflVar2.isCancelled()) {
            this.l = p();
        } else if (z) {
            return;
        }
        this.b.m(l());
        this.c.m(i());
        llg llgVar = this.m;
        ddwg ddwgVar = this.h;
        cbni cbniVar = this.f;
        llgVar.m(ddwgVar.d(cbniVar.a(), cbniVar.o(), cbniVar.g(), cbniVar.b()));
        this.l.b(new Runnable() { // from class: ddqb
            @Override // java.lang.Runnable
            public final void run() {
                ddqd ddqdVar = ddqd.this;
                if (ddqdVar.a.g()) {
                    String j = ddqdVar.j(ddqdVar.g().u());
                    if (TextUtils.isEmpty(j)) {
                        return;
                    }
                    ddqdVar.d.j(new ddqr(j));
                }
            }
        }, this.g);
        this.k.k(axnw.c(new Consumer() { // from class: ddqc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ddqd ddqdVar = ddqd.this;
                ddqdVar.b.j(ddqdVar.l());
                ddqdVar.c.j(ddqdVar.i());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.g);
    }

    @Override // defpackage.ddqs
    public final boolean o() {
        return this.f.r();
    }
}
