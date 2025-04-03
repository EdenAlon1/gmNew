package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvj implements zup {
    private final asnk A;
    public final Context a;
    public final aaeg b;
    public final aigz c;
    public final ffbr d;
    public final Optional e;
    public final askx f;
    public final Optional g;
    public final zvv h;
    public final askk i;
    public final askd j;
    public final athk k;
    public final athq l;
    public final auol m;
    public final boolean n;
    private final eisx o;
    private final csrh p;
    private final cuxh q;
    private final crps r;
    private final ffbr s;
    private final Optional t;
    private final ffbr u;
    private final Conversation v;
    private final asnh w;
    private final ffbr x;
    private final ausa y;
    private final athm z;

    public zvj(eisx eisxVar, csrh csrhVar, Context context, cuxh cuxhVar, crps crpsVar, aaeg aaegVar, aigz aigzVar, ffbr ffbrVar, ffbr ffbrVar2, Optional optional, askx askxVar, Optional optional2, Optional optional3, zvv zvvVar, ffbr ffbrVar3, askk askkVar, Conversation conversation, askd askdVar, asnh asnhVar, ffbr ffbrVar4, ausa ausaVar, athk athkVar, athq athqVar, athm athmVar, asnk asnkVar, auol auolVar) {
        eisxVar.getClass();
        csrhVar.getClass();
        context.getClass();
        cuxhVar.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        askxVar.getClass();
        zvvVar.getClass();
        ffbrVar3.getClass();
        conversation.getClass();
        askdVar.getClass();
        ffbrVar4.getClass();
        ausaVar.getClass();
        auolVar.getClass();
        this.o = eisxVar;
        this.p = csrhVar;
        this.a = context;
        this.q = cuxhVar;
        this.r = crpsVar;
        this.b = aaegVar;
        this.c = aigzVar;
        this.d = ffbrVar;
        this.s = ffbrVar2;
        this.e = optional;
        this.f = askxVar;
        this.t = optional2;
        this.g = optional3;
        this.h = zvvVar;
        this.u = ffbrVar3;
        this.i = askkVar;
        this.v = conversation;
        this.j = askdVar;
        this.w = asnhVar;
        this.x = ffbrVar4;
        this.y = ausaVar;
        this.k = athkVar;
        this.l = athqVar;
        this.z = athmVar;
        this.A = asnkVar;
        this.m = auolVar;
        boolean z = false;
        if (asnhVar.a() && (!crnx.j(context) || !((ersq) ((arrx) asnkVar).a.b()).a("bugle.enable_timestamps_for_talkback"))) {
            z = true;
        }
        this.n = z;
    }

    public static final boolean k(ffbz ffbzVar) {
        return ((Boolean) ffbzVar.a()).booleanValue();
    }

    static /* synthetic */ void m(zvj zvjVar, List list, alxr alxrVar, boolean z) {
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && (z || (((Boolean) ((cfup) ctjd.aF.get()).e()).booleanValue() && alxrVar.w()))) {
            dmzz dmzzVar = dmzz.dD;
            aqcm j = alxrVar.j();
            list.add(new dnso(dmzzVar, j != null ? zvjVar.p(j, alxrVar) : null, 2));
        } else if (alxrVar.v()) {
            dmzz dmzzVar2 = dmzz.bZ;
            aqcm j2 = alxrVar.j();
            list.add(new dnso(dmzzVar2, j2 != null ? zvjVar.p(j2, alxrVar) : null, 2));
        } else {
            if (!zvjVar.f.a() || alxrVar.v()) {
                return;
            }
            dmzz dmzzVar3 = dmzz.ca;
            aqcm j3 = alxrVar.j();
            list.add(new dnso(dmzzVar3, j3 != null ? zvjVar.p(j3, alxrVar) : null, 2));
        }
    }

    public static final dmzz n(alxo alxoVar) {
        int ordinal = alxoVar.ordinal();
        if (ordinal == 0) {
            return dmzz.dP;
        }
        if (ordinal == 1) {
            return dmzz.dQ;
        }
        if (ordinal == 2) {
            return dmzz.dJ;
        }
        if (ordinal != 3) {
            return null;
        }
        return dmzz.dO;
    }

    public static final dmzz o(alxr alxrVar) {
        if (!(alxrVar.d() instanceof alyn)) {
            return null;
        }
        alya d = alxrVar.d();
        d.getClass();
        alxo a = ((alyo) d).a();
        a.getClass();
        return n(a);
    }

    private final String p(aqcm aqcmVar, alxr alxrVar) {
        if (aqcmVar.b() == 2) {
            return "error";
        }
        if (s() && zsr.u(alxrVar)) {
            return "error";
        }
        return null;
    }

    private final String q(String str, alxr alxrVar, boolean z) {
        return z ? this.a.getString(R.string.message_status_not_sent_satellite_group) : !(alxrVar.g() instanceof appw) ? this.a.getString(R.string.message_status_not_sent_satellite_media) : str;
    }

    private final void r(List list, alxr alxrVar, aqcm aqcmVar) {
        list.add(new dnso(dmzz.aV, p(aqcmVar, alxrVar), 2));
    }

    private final boolean s() {
        return this.y.a() && ((cnpk) ((cnpd) this.u.b()).h().c()).c();
    }

    @Override // defpackage.zup
    public final dnto a(alxr alxrVar, dnry dnryVar, boolean z) {
        alxrVar.getClass();
        dnryVar.getClass();
        alya d = alxrVar.d();
        if (!(d instanceof alxp) || !z || (dnryVar != dnry.b && dnryVar != dnry.a)) {
            return new dnsl(null, 0, null, null, null, 63);
        }
        final boolean z2 = ((cyvs) fflm.b(this.t)) != null;
        final ResolvedRecipient a = ((alxp) d).a();
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(c(a));
        fffsVar.addAll(h(a));
        return new dnsl(ffdx.a(fffsVar), 1, new dntn(false, z2, this.z.a(), 1), new ffji() { // from class: zuq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                boolean z3 = z2;
                zvj zvjVar = this;
                ResolvedRecipient resolvedRecipient = a;
                kaa kaaVar = (kaa) obj;
                if (!z3 || kaaVar == null) {
                    zvjVar.c.h(new aino(resolvedRecipient));
                } else {
                    cyvq cyvqVar = (cyvq) fflm.b(zvjVar.g);
                    if (cyvqVar != null) {
                        cyvqVar.a(resolvedRecipient, kaaVar.a, 3);
                    }
                }
                return ffcu.a;
            }
        }, new ffji() { // from class: zut
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cyvq cyvqVar;
                kaa kaaVar = (kaa) obj;
                if (z2 && kaaVar != null && (cyvqVar = (cyvq) fflm.b(this.g)) != null) {
                    cyvqVar.d.f(kaaVar);
                }
                return ffcu.a;
            }
        }, 32);
    }

    @Override // defpackage.zup
    public final axrc b(final zvp zvpVar, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        final alya d = zvpVar.a().d();
        boolean z5 = d instanceof aoyh;
        if ((!z5 || ((aoyh) d).a().b()) && !(this.e.isPresent() && ((aafi) this.e.get()).b(zvpVar))) {
            return new axqd(new ffix() { // from class: zus
                @Override // defpackage.ffix
                public final Object invoke() {
                    return zvj.this.d(zvpVar, z, z2, z3, z4, ffel.a);
                }
            });
        }
        axrc a = this.e.isPresent() ? ((aafi) this.e.get()).a(zvpVar) : new axqd(new ffix() { // from class: zur
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffel.a;
            }
        });
        aoyh aoyhVar = z5 ? (aoyh) d : null;
        return axrg.b(new zvf(new fgch(aoyhVar != null ? new ffxn(new zvn(aoyhVar, null)) : new axqd(new ffix() { // from class: zvk
            @Override // defpackage.ffix
            public final Object invoke() {
                return alya.this;
            }
        }), a, new zvg(null)), this, zvpVar, z, z2, z3, z4), d(zvpVar, z, z2, z3, z4, (List) a.b()));
    }

    public final dntg c(ResolvedRecipient resolvedRecipient) {
        return new dntg(new dnyo(((crpw) this.s.b()).c(resolvedRecipient), null, 0, null, 0.0f, null, 62), new dntf((int) ((Number) this.x.b()).longValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (((defpackage.alyo) r13).a() == defpackage.alxo.ERROR) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dnto d(defpackage.zvp r12, final boolean r13, final boolean r14, final boolean r15, boolean r16, final java.util.List r17) {
        /*
            r11 = this;
            alxr r1 = r12.a()
            askx r0 = r11.f
            boolean r0 = r0.a()
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L12
            if (r16 == 0) goto L12
            r4 = r10
            goto L13
        L12:
            r4 = r9
        L13:
            boolean r0 = r11.n
            if (r0 == 0) goto L4c
            if (r4 != 0) goto L4c
            boolean r0 = defpackage.zsr.v(r1)
            if (r0 != 0) goto L4c
            boolean r0 = defpackage.zsr.k(r1)
            if (r0 != 0) goto L4c
            boolean r0 = defpackage.zsr.r(r1)
            if (r0 == 0) goto L43
            boolean r0 = defpackage.zsr.s(r1)
            if (r0 == 0) goto L43
            if (r13 == 0) goto L43
            askd r0 = r11.j
            boolean r0 = r0.a()
            if (r0 == 0) goto L4c
            dmzz r0 = o(r1)
            dmzz r2 = defpackage.dmzz.dO
            if (r0 == r2) goto L4c
        L43:
            boolean r0 = defpackage.zsr.x(r1)
            if (r0 == 0) goto L4a
            goto L4c
        L4a:
            r7 = r9
            goto L4d
        L4c:
            r7 = r10
        L4d:
            zuu r0 = new zuu
            r2 = r11
            r3 = r13
            r6 = r14
            r5 = r15
            r8 = r17
            r0.<init>()
            if (r4 == 0) goto L5c
        L5a:
            r12 = r10
            goto L91
        L5c:
            r1.getClass()
            boolean r13 = r1 instanceof defpackage.alyv
            if (r13 != 0) goto L7b
            boolean r13 = defpackage.zsr.r(r1)
            if (r13 == 0) goto L7b
            alya r13 = r1.d()
            r13.getClass()
            alyo r13 = (defpackage.alyo) r13
            alxo r13 = r13.a()
            alxo r14 = defpackage.alxo.ERROR
            if (r13 != r14) goto L7b
            goto L5a
        L7b:
            boolean r13 = defpackage.zsr.u(r1)
            if (r13 != 0) goto L5a
            boolean r13 = defpackage.zsr.j(r1)
            if (r13 == 0) goto L88
            goto L5a
        L88:
            boolean r12 = r12.e()
            if (r12 == 0) goto L90
            r12 = 2
            goto L91
        L90:
            r12 = 3
        L91:
            dnsm r13 = new dnsm
            dntn r14 = new dntn
            r15 = 6
            r14.<init>(r10, r9, r9, r15)
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            r13.<init>(r0, r12, r14, r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj.d(zvp, boolean, boolean, boolean, boolean, java.util.List):dnto");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aqux r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.zvi
            if (r0 == 0) goto L13
            r0 = r12
            zvi r0 = (defpackage.zvi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zvi r0 = new zvi
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.a
            zvj r0 = r0.e
            defpackage.ffci.b(r12)
            goto L51
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.ffci.b(r12)
            ffbr r12 = r10.s
            java.lang.Object r12 = r12.b()
            crpw r12 = (defpackage.crpw) r12
            eisx r2 = r10.o
            j$.util.Optional r2 = j$.util.Optional.of(r2)
            r0.e = r10
            r0.a = r11
            r0.d = r3
            java.lang.Object r12 = r12.d(r2, r11, r3, r0)
            if (r12 == r1) goto L90
            r0 = r10
        L51:
            dnwn r12 = (defpackage.dnwn) r12
            if (r12 != 0) goto L6b
            dnwn r1 = new dnwn
            android.net.Uri r2 = r11.c()
            crps r11 = r0.r
            java.lang.String r4 = defpackage.crps.b(r11)
            r6 = 0
            r7 = 26
            r3 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = r1
            goto L6c
        L6b:
            r3 = r12
        L6c:
            dntg r11 = new dntg
            dnyo r2 = new dnyo
            r8 = 0
            r9 = 62
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            dntf r12 = new dntf
            ffbr r0 = r0.x
            java.lang.Object r0 = r0.b()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = (int) r0
            r12.<init>(r0)
            r11.<init>(r2, r12)
            return r11
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj.e(aqux, ffgu):java.lang.Object");
    }

    public final String f(String str) {
        return aswb.a() ? cuxh.a(str) : this.q.c(str);
    }

    public final String g(alxr alxrVar) {
        Instant n;
        if (zsr.u(alxrVar)) {
            return null;
        }
        if (((Boolean) this.d.b()).booleanValue()) {
            n = zsr.c(alxrVar);
            if (n == null) {
                n = alxrVar.n();
            }
        } else {
            n = alxrVar.n();
        }
        return this.p.e(n.toEpochMilli()).toString();
    }

    public final List h(ResolvedRecipient resolvedRecipient) {
        String x = resolvedRecipient.x(true);
        x.getClass();
        String f = f(x);
        f.getClass();
        List i = ffdx.i(new dntl(f, null, null, false, zvc.a(resolvedRecipient), null, true, false, 174));
        String y = resolvedRecipient.y();
        if (y != null) {
            String f2 = f(y);
            f2.getClass();
            i.add(new dntl(cjze.a(f2), null, null, false, zvc.a(resolvedRecipient), null, true, this.z.a(), 38));
        }
        return i;
    }

    public final void i(List list, alxr alxrVar, boolean z, boolean z2) {
        aqux b;
        if (z) {
            alya d = alxrVar.d();
            if (d instanceof alyn) {
                b = ((alyn) d).c();
            } else if (!(d instanceof alxp)) {
                return;
            } else {
                b = ((alxp) d).b();
            }
            String o = b.o();
            int a = b.a();
            int color = a == 0 ? this.a.getColor(R.color.sim_icon_text_color) : doxi.a(this.a, a);
            if (z2) {
                list.add(new dnsn(null));
            }
            list.add(new dntl(o, null, null, false, null, Integer.valueOf(color), false, false, 222));
        }
    }

    public final void j(List list, final alxr alxrVar, boolean z, boolean z2) {
        String q;
        aqcm j = alxrVar.j();
        if (j != null) {
            String a = j.a();
            if (s()) {
                if (!zsr.u(alxrVar) || z2 || !(alxrVar.g() instanceof appw)) {
                    if (zsr.u(alxrVar)) {
                        r(list, alxrVar, j);
                        q = q(a, alxrVar, z2);
                    } else if (a == null) {
                        a = null;
                    } else if (zsr.k(alxrVar)) {
                        r(list, alxrVar, j);
                        q = q(a, alxrVar, z2);
                    } else if (z) {
                        list.add(new dnsn(null));
                    }
                    a = q;
                }
                if (a == null) {
                    return;
                }
            } else {
                if (a == null) {
                    return;
                }
                if (zsr.k(alxrVar)) {
                    r(list, alxrVar, j);
                } else if (z) {
                    list.add(new dnsn(null));
                }
            }
            String str = a;
            if (zsr.i(alxrVar)) {
                String string = this.a.getResources().getString(R.string.message_metatext_premium_sms_options);
                string.getClass();
                list.add(new dntl(string, null, null, false, p(j, alxrVar), null, false, false, 238));
            } else {
                list.add(new dntl(str, null, null, false, p(j, alxrVar), null, false, false, 238));
            }
            if (zsr.h(alxrVar)) {
                String string2 = this.a.getResources().getString(R.string.message_metatext_resend);
                string2.getClass();
                list.add(new dntl(string2, new ffix() { // from class: zuy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zvj.this.b.a(alxrVar);
                        return ffcu.a;
                    }
                }, null, false, p(j, alxrVar), null, false, false, 236));
                return;
            }
            if (l() || !zsr.j(alxrVar) || (alxrVar.g() instanceof apmq)) {
                return;
            }
            String string3 = this.a.getResources().getString(R.string.message_metatext_check_options);
            string3.getClass();
            list.add(new dntl(string3, new ffix() { // from class: zuz
                @Override // defpackage.ffix
                public final Object invoke() {
                    zvj.this.b.a(alxrVar);
                    return ffcu.a;
                }
            }, null, false, p(j, alxrVar), null, false, false, 236));
        }
    }

    public final boolean l() {
        return this.v.d() instanceof EmergencySosConversationId;
    }
}
