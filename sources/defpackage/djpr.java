package defpackage;

import android.os.Message;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djpr extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpr(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    private final String j(djtr djtrVar) {
        String o = djtrVar.o();
        dkty.d(this.b.m, "Using URI format: %s", o);
        return o;
    }

    @Override // defpackage.diya, defpackage.dixy
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: djpq
            @Override // java.lang.Runnable
            public final void run() {
                djpr djprVar = djpr.this;
                djqf djqfVar = djprVar.b;
                if (djqfVar.x == null) {
                    dkty.h(djqfVar.m, "SIP transport is not available", new Object[0]);
                    djqf djqfVar2 = djprVar.b;
                    djqfVar2.w(djqfVar2.Y);
                } else {
                    if (!djqfVar.t.a.v()) {
                        djprVar.b.q(1);
                        return;
                    }
                    dkty.h(djprVar.b.m, "SipStack is not available", new Object[0]);
                    djqf djqfVar3 = djprVar.b;
                    djqfVar3.w(djqfVar3.Y);
                }
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void c() {
        super.c();
        this.b.E = 0;
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        String str;
        int h;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    dkty.h(this.b.m, "Registration timeout.", new Object[0]);
                    djqf djqfVar = this.b;
                    djqfVar.w(djqfVar.ak);
                    return true;
                }
                if (i == 8) {
                    dkty.d(this.b.m, "Cancel registration.", new Object[0]);
                    this.b.N(message.obj);
                    djqf djqfVar2 = this.b;
                    djqfVar2.w(djqfVar2.ag);
                    return true;
                }
                if (i == 17) {
                    this.b.N(dilc.SIM_REMOVED);
                    djqf djqfVar3 = this.b;
                    djqfVar3.w(djqfVar3.ag);
                    return true;
                }
                if (i != 21) {
                    return super.e(message);
                }
                dkty.r(this.b.m, "Network is lost.", new Object[0]);
                this.b.O();
                djqf djqfVar4 = this.b;
                djqfVar4.w(djqfVar4.ag);
                return true;
            }
            if (message.obj instanceof eenl) {
                try {
                    eenl eenlVar = (eenl) message.obj;
                    dkty.d(this.b.m, "Got response: %s", eenlVar);
                    eehr eehrVar = this.b.v;
                    if (Objects.isNull(eehrVar)) {
                        throw new eejg("Null SipDialogPath.");
                    }
                    String str2 = eehrVar.a;
                    if (eenlVar.y() == 200) {
                        dkty.d(this.b.m, "Registered.", new Object[0]);
                        h(eenlVar);
                    } else {
                        if (eenlVar.y() == 401) {
                            dkty.d(this.b.m, "Authentication requested.", new Object[0]);
                            this.b.s(1, eenlVar);
                        } else if (eenlVar.y() == 403) {
                            dkty.d(this.b.m, "Forbidden. Reconfiguration Required.", new Object[0]);
                            this.b.I();
                            this.b.D(dilc.RECONFIGURATION_REQUIRED);
                            djqf djqfVar5 = this.b;
                            djqfVar5.w(djqfVar5.ai);
                            this.b.E();
                            if (!((Boolean) djqf.e.a()).booleanValue()) {
                                this.b.R.execute(new Runnable() { // from class: djpo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        djpr.this.b.Q.onForbidden(true);
                                    }
                                });
                            }
                        } else if (eenlVar.y() == 404) {
                            dkty.d(this.b.m, "User Not Found. Reconfiguration Required.", new Object[0]);
                            this.b.I();
                            this.b.D(dilc.RECONFIGURATION_REQUIRED);
                            djqf djqfVar6 = this.b;
                            djqfVar6.w(djqfVar6.ai);
                            this.b.E();
                            if (!((Boolean) djqf.e.a()).booleanValue()) {
                                this.b.R.execute(new Runnable() { // from class: djpp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        djpr.this.b.Q.onForbidden(false);
                                    }
                                });
                            }
                        } else if (eenlVar.y() != 423) {
                            dkty.d(this.b.m, "Received an registration error response %d %s.", Integer.valueOf(eenlVar.y()), eenlVar.A());
                            eeku d = eenlVar.z().d("Retry-After");
                            if (d == null) {
                                h = 0;
                            } else {
                                h = d.h(0);
                                if (h > 0) {
                                    dkty.d(this.b.m, "server requested retry in %ds", Integer.valueOf(h));
                                }
                            }
                            djqf djqfVar7 = this.b;
                            djqfVar7.G.a = h;
                            djqfVar7.w(djqfVar7.ak);
                            this.b.D(dilc.ERROR_RESPONSE);
                        } else {
                            int a = dkut.a(eenlVar);
                            if (a == -1) {
                                dkty.h(this.b.m, "Can't read the Min-Expires value", new Object[0]);
                                this.b.I();
                                this.b.D(dilc.ERROR_RESPONSE);
                                djqf djqfVar8 = this.b;
                                djqfVar8.w(djqfVar8.ak);
                            } else {
                                djqf djqfVar9 = this.b;
                                djqfVar9.E = a;
                                dkty.l(djqfVar9.m, "Send new REGISTER", new Object[0]);
                                this.b.q(1);
                            }
                        }
                        if (str2 != null) {
                            final djqf djqfVar10 = this.b;
                            dkty.d(djqfVar10.m, "Notify SipError. CallId=%s sipError=%d(%s)", str2, Integer.valueOf(eenlVar.y()), eenlVar.A());
                            djqfVar10.R.execute(new Runnable() { // from class: djnz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Collection.EL.stream(djqf.this.P).forEach(new Consumer() { // from class: djnx
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj) {
                                            diyy diyyVar = djqf.d;
                                            ((djjv) obj).n();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            });
                        }
                    }
                } catch (eejg unused) {
                    this.b.D(dilc.ERROR_RESPONSE);
                    djqf djqfVar11 = this.b;
                    djqfVar11.w(djqfVar11.ak);
                }
            } else {
                dkty.j((eejg) message.obj, this.b.m, "Registration failed", new Object[0]);
                this.b.D(dilc.ERROR_RESPONSE);
                djqf djqfVar12 = this.b;
                djqfVar12.w(djqfVar12.ak);
            }
        } else if (message.obj == null) {
            try {
                this.b.M();
            } catch (djkg | eejg e) {
                dkty.j(e, this.b.m, "Registration failure.", new Object[0]);
                djqf djqfVar13 = this.b;
                djqfVar13.w(djqfVar13.ak);
            }
            if (!Objects.isNull(this.b.v)) {
                final djqf djqfVar14 = this.b;
                final String b = emxe.b(djqfVar14.v.a);
                dkty.d(djqfVar14.m, "Notify Registering. CallId=%s", b);
                djqfVar14.R.execute(new Runnable() { // from class: djnu
                    @Override // java.lang.Runnable
                    public final void run() {
                        Stream stream = Collection.EL.stream(djqf.this.P);
                        final String str3 = b;
                        stream.forEach(new Consumer() { // from class: djoi
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                diyy diyyVar = djqf.d;
                                ((djjv) obj).k(str3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
            }
        } else {
            eenl eenlVar2 = (eenl) message.obj;
            if (((Boolean) dinu.a.a()).booleanValue()) {
                eehy eehyVar = this.b.t.a;
                if (Objects.isNull(eehyVar)) {
                    dkty.g("Null SipStack. Can't register.", new Object[0]);
                    djqf djqfVar15 = this.b;
                    djqfVar15.w(djqfVar15.ak);
                } else {
                    List p = eenlVar2.p();
                    if (!p.isEmpty()) {
                        eelo eeloVar = (eelo) enjk.j(p);
                        if (eeloVar.l("rport") && (str = (String) eeloVar.e.b("rport")) != null && !str.isEmpty()) {
                            try {
                                dkty.p(this.b.m, "Updating local port to %s", str);
                                eehyVar.m().m(Integer.parseInt(str));
                            } catch (NumberFormatException unused2) {
                                dkty.r(this.b.m, "Invalid RPORT value - %s ignoring, continuing with normal registration flow", str);
                            }
                        }
                    }
                }
            }
            try {
                this.b.K.b(eenlVar2);
                dkty.d(this.b.m, "Send second REGISTER", new Object[0]);
                try {
                    this.b.M();
                } catch (djkg | eejg e2) {
                    dkty.j(e2, this.b.m, "Registration failure.", new Object[0]);
                    this.b.N(dilc.UNKNOWN);
                    djqf djqfVar16 = this.b;
                    djqfVar16.w(djqfVar16.ak);
                }
            } catch (djkg e3) {
                dkty.j(e3, this.b.m, "Failed to write SecurityHeader.", new Object[0]);
                djqf djqfVar17 = this.b;
                djqfVar17.w(djqfVar17.ak);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r0 = r8.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r3 = java.lang.Integer.parseInt(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int g(defpackage.eenj r12) {
        /*
            r11 = this;
            djqf r0 = r11.b
            eehz r0 = r0.t
            eehy r0 = r0.a
            boolean r1 = r0.v()
            r2 = 600000(0x927c0, float:8.40779E-40)
            if (r1 == 0) goto L10
            return r2
        L10:
            java.lang.String r0 = r0.n()
            eelv r12 = r12.a
            eehk r1 = defpackage.dkut.a
            eekl r1 = r12.c()
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L80
            r6 = r4
        L22:
            int r7 = r1.b()
            r8 = 0
            if (r6 >= r7) goto L73
            eeku r7 = r1.e(r6)
            eekk r7 = (defpackage.eekk) r7
            eeio r9 = r7.a
            eeit r9 = r9.b
            boolean r10 = r9 instanceof defpackage.eeiq
            if (r10 == 0) goto L6b
            eeiq r9 = (defpackage.eeiq) r9
            eeiz r9 = r9.a()
            if (r9 != 0) goto L41
            r9 = r8
            goto L43
        L41:
            eeix r9 = r9.a
        L43:
            if (r9 != 0) goto L46
            goto L73
        L46:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.eeix.a(r8)
            if (r8 == 0) goto L5e
            java.lang.String r8 = r9.a
            int r9 = r8.length()
            int r9 = r9 + r3
            java.lang.String r8 = r8.substring(r5, r9)
            boolean r8 = defpackage.emxb.a(r8, r0)
            goto L64
        L5e:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.emxb.a(r8, r0)
        L64:
            if (r8 == 0) goto L68
            r8 = r7
            goto L73
        L68:
            int r6 = r6 + 1
            goto L22
        L6b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "address is not a SipURI"
            r12.<init>(r0)
            throw r12
        L73:
            if (r8 == 0) goto L80
            java.lang.String r0 = r8.e()
            if (r0 == 0) goto L80
            int r3 = java.lang.Integer.parseInt(r0)
            goto L8e
        L80:
            java.lang.String r0 = "Expires"
            eeku r12 = r12.d(r0)
            eekr r12 = (defpackage.eekr) r12
            if (r12 == 0) goto L8e
            int r3 = r12.b()
        L8e:
            if (r3 >= 0) goto La2
            djqf r12 = r11.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            dktn r12 = r12.m
            java.lang.String r0 = "No expires value found in response to REGISTER! Using a default period of %d seconds!"
            defpackage.dkty.h(r12, r0, r1)
            return r2
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djpr.g(eenj):int");
    }

    protected void h(eenl eenlVar) {
        Optional optional;
        eehy eehyVar = this.b.t.a;
        if (Objects.isNull(eehyVar)) {
            throw new eejg("Null SipStack");
        }
        this.b.F = g(eenlVar);
        i(eehyVar, eenlVar);
        eehyVar.c = null;
        eekl c = eenlVar.z().c();
        for (int i = 0; i < c.b(); i++) {
            eekk eekkVar = (eekk) c.e(i);
            String i2 = eekkVar.i("+sip.instance");
            if (i2 != null && i2.contains(this.b.C)) {
                eehyVar.c = eekkVar.i("pub-gruu");
            }
        }
        String j = j(this.b.I);
        eekv e = eenlVar.a.e("P-Associated-Uri");
        String w = this.b.I.w();
        if (e.b() == 0) {
            djqf djqfVar = this.b;
            dkty.d(djqfVar.m, "Generating associated URI from config", new Object[0]);
            djtr djtrVar = djqfVar.I;
            String j2 = j(djtrVar);
            String w2 = djtrVar.w();
            if (w2.startsWith(j2)) {
                w = w2;
            } else {
                String k = dkut.k(w2, this.b.M);
                if (Objects.isNull(k)) {
                    dkty.q("expected non null user name from address", new Object[0]);
                    w = "";
                } else if ("sip".equals(j2)) {
                    w = "sip:" + k + "@" + djtrVar.n();
                } else {
                    w = "tel:".concat(!dizg.w() ? String.valueOf(this.b.M.x(k)) : String.valueOf(k));
                }
            }
        } else {
            dkty.d(this.b.m, "Extracting associated URIs from headers", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < e.b(); i3++) {
                Iterator it = emye.b(',').g(e.e(i3).a()).iterator();
                while (it.hasNext()) {
                    String trim = ((String) it.next()).trim();
                    if (trim.startsWith("<")) {
                        trim = trim.substring(1, trim.length() - 1);
                    }
                    if (trim.startsWith(j)) {
                        arrayList.add(trim);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                w = (String) arrayList.get(0);
                this.b.z = arrayList;
            }
        }
        if (!dktk.d(w)) {
            djqf djqfVar2 = this.b;
            djqfVar2.y = w;
            dkty.d(djqfVar2.m, "Set associated uri: %s using URI format: %s", dkty.a(w), j);
        }
        eelo f = eenlVar.a.f();
        if (f == null) {
            optional = Optional.empty();
        } else {
            String i4 = f.i("keep");
            if (i4 == null) {
                optional = Optional.empty();
            } else {
                dkty.d(this.b.m, "Server has requested a keep-alive period of: %ss", i4);
                Optional empty = Optional.empty();
                try {
                    optional = Optional.of(Integer.valueOf(Integer.parseInt(i4)));
                } catch (NumberFormatException e2) {
                    dkty.j(e2, this.b.m, "Unable to parse keep alive value. Using default client value.", new Object[0]);
                    optional = empty;
                }
            }
        }
        if (!optional.isPresent() || ((Integer) optional.get()).intValue() <= 0) {
            djqr djqrVar = this.b.L;
            djqrVar.c();
            dkty.l(djqrVar.b, "Disabled keep-alives", new Object[0]);
        } else {
            djqf djqfVar3 = this.b;
            djjt djjtVar = djqfVar3.w;
            djkr djkrVar = djqfVar3.B;
            if (((djjtVar != null && djjtVar.c() == 1) || (djkrVar != null && djkrVar.f())) && djao.n() > 0 && ((Integer) optional.get()).intValue() > djao.n()) {
                optional = Optional.of(Integer.valueOf((int) djao.n()));
            }
            djqf djqfVar4 = this.b;
            int intValue = ((Integer) optional.get()).intValue();
            djqr djqrVar2 = djqfVar4.L;
            if (djqrVar2.k()) {
                dkty.d(djqrVar2.b, "Just processed a REGISTER. Next keep-alive ping can wait a bit longer", new Object[0]);
                djqrVar2.h();
            } else {
                dkty.c("Enabling keep-alives", new Object[0]);
                djjt a = djqrVar2.a();
                if (a == null) {
                    dkty.r(djqrVar2.b, "Network interface is null", new Object[0]);
                }
                if (intValue <= 0 && a != null) {
                    intValue = 120;
                }
                djqrVar2.e = intValue;
                djqrVar2.d(intValue);
            }
        }
        djqf djqfVar5 = this.b;
        djqfVar5.w(djqfVar5.ab);
    }

    protected final void i(eehy eehyVar, eenl eenlVar) {
        ArrayList arrayList = new ArrayList();
        List j = eenlVar.z().j("Service-Route");
        if (eehyVar != eeib.f) {
            try {
                String o = eehyVar.o();
                int j2 = eehyVar.j();
                String str = eehyVar.d().d;
                eehk eehkVar = dkut.a;
                arrayList.add(new eelg(eehk.a(eehk.c(o, j2, str))));
            } catch (eeje e) {
                dkty.j(e, this.b.m, "Failed to create RouteHeader", new Object[0]);
                return;
            }
        }
        if (!j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                String str2 = ((eeks) ((eeku) it.next())).d;
                List<String> i = emye.b(',').i(emxe.b(str2));
                dkty.d(this.b.m, "service route headers %s", str2);
                for (String str3 : i) {
                    try {
                        eeku g = eene.g("Route", str3);
                        dkty.d(this.b.m, "service route headers are %s", str3);
                        arrayList.add((eelg) g);
                    } catch (eeje e2) {
                        dkty.j(e2, this.b.m, "Invalid ServiceRoute header: %s", str3);
                    }
                }
            }
        }
        eehyVar.t(arrayList);
    }
}
