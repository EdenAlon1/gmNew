package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@ffbs
/* loaded from: classes2.dex */
public final class aahw implements aagq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl");
    public MessageId A;
    public final zqv B;
    public final adak C;
    public final apxx D;
    public final apxx E;
    private final ffsk F;
    private final Map G;
    private final abak H;
    private final ffbr I;
    private final List J;
    private final List K;
    private final cslr L;
    public final Context b;
    public final ffsk c;
    public final ffxx d;
    public final aawu e;
    public final abcf f;
    public final ajjd g;
    public final ajjc h;
    public final abbv i;
    public final ffbr j;
    public final ffxx k;
    public final ffbr l;
    public final auqo m;
    public final llv n;
    public final ffbr o;
    public final ffbr p;
    public final auuu q;
    public final dqza r;
    public final dqze s;
    public final drau t;
    public final ffxx u;
    public final ffxx v;
    public final AtomicReference w;
    public final fgcm x;
    public boolean y;
    public aawt z;

    public aahw(Context context, ffsk ffskVar, ffsk ffskVar2, ffxx ffxxVar, zqv zqvVar, aawu aawuVar, abcf abcfVar, Map map, ajjd ajjdVar, ajjc ajjcVar, abbv abbvVar, abak abakVar, ffbr ffbrVar, cslr cslrVar, ffbr ffbrVar2, ffxx ffxxVar2, ffbr ffbrVar3, auqo auqoVar, llv llvVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, ffbr ffbrVar4, ffbr ffbrVar5, auuu auuuVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        zqvVar.getClass();
        aawuVar.getClass();
        abcfVar.getClass();
        ajjdVar.getClass();
        ajjcVar.getClass();
        abbvVar.getClass();
        abakVar.getClass();
        cslrVar.getClass();
        ffxxVar2.getClass();
        ffbrVar3.getClass();
        auqoVar.getClass();
        llvVar.getClass();
        optional.getClass();
        optional2.getClass();
        optional4.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = context;
        this.c = ffskVar;
        this.F = ffskVar2;
        this.d = ffxxVar;
        this.B = zqvVar;
        this.e = aawuVar;
        this.f = abcfVar;
        this.G = map;
        this.g = ajjdVar;
        this.h = ajjcVar;
        this.i = abbvVar;
        this.H = abakVar;
        this.j = ffbrVar;
        this.L = cslrVar;
        this.I = ffbrVar2;
        this.k = ffxxVar2;
        this.l = ffbrVar3;
        this.m = auqoVar;
        this.n = llvVar;
        this.o = ffbrVar4;
        this.p = ffbrVar5;
        this.q = auuuVar;
        dqza dqzaVar = (dqza) fflm.b(optional3);
        this.r = dqzaVar;
        dqze dqzeVar = (dqze) fflm.b(optional4);
        this.s = dqzeVar;
        this.C = (adak) fflm.b(optional);
        this.t = (drau) fflm.b(optional2);
        fgcp fgcpVar = new fgcp(new aahb(this, null));
        this.u = fgcpVar;
        this.v = (!ctjd.d() || dqzeVar == null || dqzaVar == null) ? new fgcp(new aahm(null)) : fgau.a(new fgch(fgcpVar, ffxxVar2, new aahj(null)), new aahl(this, null));
        this.w = new AtomicReference(null);
        this.x = fgdm.a(false);
        apxx a2 = apzb.a("👍");
        this.D = a2;
        apxx a3 = apzb.a("👎");
        this.E = a3;
        this.J = ffdx.i(a2, apzb.a("❤️"), apzb.a("😂"), apzb.a("😮"), apzb.a("😢"), apzb.a("😡"), a3);
        this.K = ffdx.i(a2, a3, apzb.a("❤️"), apzb.a("😂"), apzb.a("😮"), apzb.a("😢"), apzb.a("😡"));
        if (ctjd.d() && dqzeVar != null && ffkj.e(llvVar.b("has_pending_emotify_result"), true)) {
            axol.k(ffskVar, null, new aagz(this, null), 3);
        }
    }

    private final String l(String str, boolean z) {
        String string = this.b.getString(true != z ? R.string.reaction_selection_content_description : R.string.selected_reaction_selection_content_description, str);
        string.getClass();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(fgcm fgcmVar, MessageId messageId, Long l, apza apzaVar, apyv apyvVar, boolean z, boolean z2, boolean z3) {
        apyv apyvVar2 = apzaVar != null ? apzaVar.a : null;
        cmrm cmrmVar = apyvVar2 == null ? cmrm.ADD_REACTION : ffkj.e(apyvVar2, apyvVar) ? cmrm.REMOVE_REACTION : cmrm.REPLACE_REACTION;
        cmrx cmrxVar = z2 ? cmrx.CUSTOM_REACTION_PICKER : cmrx.REACTION_BAR;
        fjay a2 = cslr.a();
        if (fffi.d(cmrm.ADD_REACTION, cmrm.REPLACE_REACTION).contains(cmrmVar)) {
            abak abakVar = this.H;
            a2.getClass();
            abakVar.a(a2);
        }
        this.i.d(cmrmVar, cmrxVar, l);
        if (z3) {
            g();
        } else {
            f(fgcmVar, false, l);
            this.e.b();
        }
        a2.getClass();
        n(cmrmVar, messageId, apyvVar, cmrxVar, a2, apzaVar != null ? apzaVar.b : null, z);
    }

    private final void n(cmrm cmrmVar, MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar, boolean z) {
        axol.k(this.F, null, new aahu(cmrmVar, (alye) this.I.b(), messageId, apyvVar, cmrxVar, fjayVar, apxzVar, this, null), 3);
        if (cmrmVar != cmrm.REMOVE_REACTION) {
            axol.k(this.c, null, new aahv(z, apyvVar, this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [doec] */
    public final dnve a(final aagp aagpVar, final fgcm fgcmVar, final Long l, final apza apzaVar, Integer num, int i, boolean z, final boolean z2, final boolean z3) {
        doee doeeVar;
        final aahw aahwVar = this;
        Context context = aahwVar.b;
        final alxr alxrVar = aagpVar.a;
        final MessageId b = alxrVar.b();
        List e = aahwVar.e(alxrVar);
        boolean z4 = false;
        if (context.getResources().getBoolean(R.bool.use_smaller_reactions_bar)) {
            e = e.subList(0, e.size() - 1);
        }
        ArrayList arrayList = new ArrayList(ffdx.n(e, 10));
        Iterator it = e.iterator();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                doff doffVar = new doff(ctjd.d() && z && !z2);
                ffix ffixVar = new ffix() { // from class: aagu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aagp aagpVar2 = aagpVar;
                        final MessageId b2 = aagpVar2.a.b();
                        boolean z5 = false;
                        if (ctjd.d() && !z2) {
                            z5 = true;
                        }
                        final boolean z6 = z5;
                        final boolean z7 = z3;
                        final apza apzaVar2 = apzaVar;
                        final Long l2 = l;
                        final fgcm fgcmVar2 = fgcmVar;
                        final aahw aahwVar2 = aahw.this;
                        final boolean b3 = zro.b(aagpVar2.a);
                        aahwVar2.i.b(l2);
                        aahwVar2.h.e(new ffji() { // from class: aagt
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ajiy ajiyVar = (ajiy) obj;
                                ajiyVar.getClass();
                                return new abgs(new hpw(1106880446, true, new aahr(aahw.this, fgcmVar2, b2, l2, apzaVar2, b3, z7, ajiyVar, z6)));
                            }
                        });
                        return ffcu.a;
                    }
                };
                ffix ffixVar2 = new ffix() { // from class: aagv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final MessageId b2 = aagpVar.a.b();
                        final aahw aahwVar2 = aahw.this;
                        adak adakVar = aahwVar2.C;
                        if (adakVar != null) {
                            adakVar.a(drav.a);
                        }
                        final boolean z5 = z3;
                        final fgcm fgcmVar2 = fgcmVar;
                        final Long l2 = l;
                        aahwVar2.h.e(new ffji() { // from class: aagx
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ajiy ajiyVar = (ajiy) obj;
                                ajiyVar.getClass();
                                return new abgs(new hpw(-590531645, true, new aahf(ajiyVar, aahw.this, l2, b2, fgcmVar2, z5)));
                            }
                        });
                        return ffcu.a;
                    }
                };
                int i4 = huo.a;
                dofg dofgVar = new dofg(arrayList, num, ffixVar, hum.e, doffVar, ffixVar2);
                aaxg aaxgVar = aagpVar.c.c;
                int i5 = aaxgVar != null ? aaxgVar.a : 0;
                int ordinal = aagpVar.b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i3 = 2;
                        if (ordinal != 2) {
                            throw new ffcd();
                        }
                    } else {
                        i3 = 3;
                    }
                }
                return new dnve(dofgVar, new dnvd(i5, i, i3), new ffix() { // from class: aagw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        boolean z5 = z3;
                        aahw aahwVar2 = this;
                        if (z5) {
                            aahwVar2.g();
                        } else {
                            aahwVar2.f(fgcmVar, true, l);
                        }
                        return ffcu.a;
                    }
                });
            }
            Object next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                ffdx.l();
            }
            final apyv apyvVar = (apyv) next;
            boolean z5 = (num == null || num.intValue() != i2) ? z4 : true;
            if (apyvVar instanceof apxx) {
                Object obj = aahwVar.G.get(((apxx) apyvVar).a);
                obj.getClass();
                aagm aagmVar = (aagm) obj;
                qgw qgwVar = aagmVar.a;
                String string = aahwVar.b.getString(aagmVar.b);
                string.getClass();
                doeeVar = new doec(qgwVar, aahwVar.l(string, z5), new ffix() { // from class: aagr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aahw.this.m(fgcmVar, b, l, apzaVar, apyvVar, zro.b(alxrVar), false, z3);
                        return ffcu.a;
                    }
                });
            } else {
                if (!(apyvVar instanceof apyb)) {
                    throw new ffcd();
                }
                apyb apybVar = (apyb) apyvVar;
                doeeVar = new doee(apybVar.b(), aahwVar.l(apybVar.b(), z5), new ffix() { // from class: aags
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aahw.this.m(fgcmVar, b, l, apzaVar, apyvVar, zro.b(alxrVar), false, z3);
                        return ffcu.a;
                    }
                });
            }
            arrayList.add(doeeVar);
            z4 = false;
            aahwVar = this;
            i2 = i6;
        }
    }

    public final Integer b(apyv apyvVar, alxr alxrVar) {
        int D = ffdx.D(e(alxrVar), apyvVar);
        if (D == -1) {
            return null;
        }
        return Integer.valueOf(D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aagp r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aahh
            if (r0 == 0) goto L13
            r0 = r8
            aahh r0 = (defpackage.aahh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aahh r0 = new aahh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            aagp r7 = r0.d
            defpackage.ffci.b(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            aagp r7 = r0.d
            defpackage.ffci.b(r8)
            goto L53
        L3b:
            defpackage.ffci.b(r8)
            auqo r8 = r6.m
            boolean r8 = r8.a()
            if (r8 == 0) goto L61
            ffxx r8 = r6.d
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fgbj.a(r8, r0)
            if (r8 != r1) goto L53
            goto L6d
        L53:
            aqux r8 = (defpackage.aqux) r8
            if (r8 == 0) goto L60
            apyd r7 = r7.d
            if (r7 == 0) goto L60
            apza r7 = r7.c(r8)
            return r7
        L60:
            return r5
        L61:
            ffxx r8 = r6.d
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fgbj.a(r8, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            aqux r8 = (defpackage.aqux) r8
            if (r8 == 0) goto L7b
            apyd r7 = r7.d
            if (r7 == 0) goto L7b
            apyv r7 = r7.b(r8)
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            return r5
        L7f:
            apza r8 = new apza
            r8.<init>(r7, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahw.c(aagp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ade r10, com.google.android.apps.messaging.shared.api.messaging.MessageId r11, defpackage.ffix r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahw.d(ade, com.google.android.apps.messaging.shared.api.messaging.MessageId, ffix, ffgu):java.lang.Object");
    }

    public final List e(alxr alxrVar) {
        return (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && zro.b(alxrVar)) ? this.K : this.J;
    }

    public final void f(fgcm fgcmVar, boolean z, Long l) {
        if (z) {
            this.i.e(3, 2, l);
        }
        fgcmVar.f(true);
        this.y = true;
    }

    public final void g() {
        this.x.f(true);
    }

    public final boolean h(aagp aagpVar, boolean z, boolean z2, doau doauVar, fgcm fgcmVar, boolean z3) {
        String str = true != z3 ? "displayed on select" : "auto revealed";
        MessageId b = aagpVar.a.b();
        if (z) {
            ensk e = a.e();
            e.Y(ente.a, "BugleReactions");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.c, b);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 442, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because it is in a dismissed state", str);
            return false;
        }
        if (doauVar == null || (doauVar instanceof abgs)) {
            if (z2) {
                return true;
            }
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleReactions");
            enrr enrrVar2 = (enrr) e2;
            enrrVar2.Y(csux.c, b);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 467, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because reacting to the selected message is not allowed", str);
            return false;
        }
        if (!z3) {
            f(fgcmVar, false, aagpVar.a.p());
            ensk e3 = a.e();
            e3.Y(ente.a, "BugleReactions");
            ((enrr) e3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 453, "ReactionsBarPopupUiAdapterImpl.kt")).q("Reaction bar not displayed because another popup is open");
        }
        ensk e4 = a.e();
        e4.Y(ente.a, "BugleReactions");
        enrr enrrVar3 = (enrr) e4;
        enrrVar3.Y(csux.c, b);
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 458, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because another popup is open", str);
        return false;
    }
}
