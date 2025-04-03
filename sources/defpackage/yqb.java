package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqb implements ypb, xie, dtbg {
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final cftn E;
    private final boolean F;
    private final aleq G;
    private final ffxx H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffxx P;
    private final fgcq Q;
    private final fgcm R;
    private dtbv S;
    private final ffxx T;
    private final fgdj U;
    private final ffji V;
    private dtbf W;
    private final ffxx X;
    private final fgdj Y;
    private final fgdj Z;
    private final fgdj aa;
    private final ffxx ab;
    private final aklh ac;
    public final ffsk c;
    public final ffbr d;
    public final Context e;
    public final xgw f;
    public final ConversationId g;
    public final asvn h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final dqza o;
    public final dqls p;
    public fgcm q;
    public ffss r;
    public ffss s;
    public AtomicBoolean t;
    public final ablq u;
    private final dqmn w;
    private final ffbr x;
    private final ffbr y;
    private final Optional z;
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl");
    private static final ffji v = new ffji() { // from class: ype
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            enru enruVar = yqb.a;
            ((Context) obj).getClass();
            return 0;
        }
    };
    public static final ffbz b = ffca.a(new ffix() { // from class: ypf
        @Override // defpackage.ffix
        public final Object invoke() {
            enru enruVar = yqb.a;
            return fffi.d(dszr.h, dszr.g);
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:51:0x035f, code lost:
    
        if (r5 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yqb(defpackage.ffsk r17, defpackage.dqmn r18, defpackage.dqlx r19, defpackage.ffbr r20, defpackage.ffbr r21, defpackage.ffbr r22, j$.util.Optional r23, defpackage.yvz r24, defpackage.yqq r25, defpackage.ffbr r26, defpackage.llv r27, @defpackage.asgu defpackage.ffbr r28, @defpackage.ares defpackage.ffbr r29, defpackage.ffbr r30, defpackage.ffbr r31, j$.util.Optional r32, defpackage.cftn r33, boolean r34, defpackage.aleq r35, defpackage.ffxx r36, defpackage.ffbr r37, defpackage.ffbr r38, android.content.Context r39, defpackage.ablq r40, defpackage.xgw r41, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r42, defpackage.asvn r43, defpackage.ffbr r44, defpackage.ffbr r45, defpackage.ffbr r46, defpackage.ffbr r47, defpackage.aklh r48, defpackage.ffbr r49, defpackage.ffbr r50, defpackage.ffbr r51, defpackage.ffbr r52, defpackage.ffbr r53, defpackage.ffbr r54, defpackage.ffbr r55, defpackage.ffxx r56, defpackage.ffbr r57, defpackage.fgcq r58) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqb.<init>(ffsk, dqmn, dqlx, ffbr, ffbr, ffbr, j$.util.Optional, yvz, yqq, ffbr, llv, ffbr, ffbr, ffbr, ffbr, j$.util.Optional, cftn, boolean, aleq, ffxx, ffbr, ffbr, android.content.Context, ablq, xgw, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, asvn, ffbr, ffbr, ffbr, ffbr, aklh, ffbr, ffbr, ffbr, ffbr, ffbr, ffbr, ffbr, ffxx, ffbr, fgcq):void");
    }

    private final dmnc k(dszr dszrVar) {
        switch (dszrVar.ordinal()) {
            case 0:
                return dmnc.c;
            case 1:
            case 2:
            case 5:
            case 8:
                return dmnc.d;
            case 3:
            default:
                return null;
            case 4:
                return dmnc.e;
            case 6:
                return dmnc.f;
            case 7:
                return ((drja) ((dris) this.z.get()).a.c()).p + (-1) != 0 ? dmnc.a : dmnc.b;
        }
    }

    private final dmne l(dtbu dtbuVar) {
        if (dtbuVar instanceof dtbp) {
            return dmnd.a;
        }
        if (dtbuVar instanceof dtbn) {
            return dmnc.e;
        }
        if (dtbuVar instanceof dtbr) {
            return k(((dtbr) dtbuVar).a.a);
        }
        if (dtbuVar instanceof dtbt) {
            return k(((dtbt) dtbuVar).b);
        }
        throw new ffcd();
    }

    @Override // defpackage.xie
    public final dtbv a() {
        return (dtbv) this.q.c();
    }

    @Override // defpackage.xie
    public final ffxx b() {
        return this.ab;
    }

    @Override // defpackage.xie
    public final void c(xid xidVar) {
        if (this.t.get()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 594, "InputsUiAdapterImpl.kt")).q("Ignoring selectInput as we are still processing a prior input change.");
            return;
        }
        this.t.set(true);
        if (ffkj.e(xidVar, xhx.a)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 600, "InputsUiAdapterImpl.kt")).q("AI input selected");
        } else if (ffkj.e(xidVar, xhy.a)) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleComposeRow2");
            ((enrr) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 601, "InputsUiAdapterImpl.kt")).q("Audio input selected");
        } else if (xidVar instanceof xhz) {
            xhw xhwVar = ((xhz) xidVar).a;
            dszr dszrVar = dszr.a;
            int ordinal = xhwVar.ordinal();
            if (ordinal == 0) {
                ensk e2 = a.e();
                e2.Y(ente.a, "BugleComposeRow2");
                ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 605, "InputsUiAdapterImpl.kt")).q("Emotive input selected with emoji screen");
            } else if (ordinal == 1) {
                ensk e3 = a.e();
                e3.Y(ente.a, "BugleComposeRow2");
                ((enrr) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 607, "InputsUiAdapterImpl.kt")).q("Emotive input selected with GIF screen");
            } else if (ordinal == 2) {
                ensk e4 = a.e();
                e4.Y(ente.a, "BugleComposeRow2");
                ((enrr) e4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 609, "InputsUiAdapterImpl.kt")).q("Emotive input selected with Stickers screen");
            } else {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                ensk e5 = a.e();
                e5.Y(ente.a, "BugleComposeRow2");
                ((enrr) e5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 611, "InputsUiAdapterImpl.kt")).q("Emotive input selected with custom sticker screen");
            }
        } else if (ffkj.e(xidVar, xia.a)) {
            ensk e6 = a.e();
            e6.Y(ente.a, "BugleComposeRow2");
            ((enrr) e6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 613, "InputsUiAdapterImpl.kt")).q("Gallery input selected");
        } else if (xidVar instanceof xic) {
            yrz yrzVar = ((xic) xidVar).a;
            if (yrzVar != null) {
                ensk e7 = a.e();
                e7.Y(ente.a, "BugleComposeRow2");
                ((enrr) e7.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 618, "InputsUiAdapterImpl.kt")).t("Shortcut %s selected.", yrzVar);
            } else {
                ensk e8 = a.e();
                e8.Y(ente.a, "BugleComposeRow2");
                ((enrr) e8.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 621, "InputsUiAdapterImpl.kt")).q("Shortcuts input selected");
            }
        } else if (ffkj.e(xidVar, xib.a)) {
            ensk e9 = a.e();
            e9.Y(ente.a, "BugleComposeRow2");
            ((enrr) e9.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 625, "InputsUiAdapterImpl.kt")).q("Opening keyboard programmatically");
        } else {
            if (xidVar != null) {
                throw new ffcd();
            }
            ensk e10 = a.e();
            e10.Y(ente.a, "BugleComposeRow2");
            ((enrr) e10.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 626, "InputsUiAdapterImpl.kt")).q("Closing all inputs");
        }
        axol.k(this.c, null, new ypt(this, xidVar, null), 3);
    }

    @Override // defpackage.ypb
    public final fgdj d() {
        return this.aa;
    }

    public final dtbl e(dszr dszrVar) {
        return new dtbl(dszrVar, i(dszrVar), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r7 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ypo
            if (r0 == 0) goto L13
            r0 = r7
            ypo r0 = (defpackage.ypo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ypo r0 = new ypo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r7)
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            yqb r2 = r0.d
            defpackage.ffci.b(r7)
            goto L56
        L39:
            defpackage.ffci.b(r7)
            boolean r7 = defpackage.ctjd.d()
            if (r7 == 0) goto L7c
            boolean r7 = r6.F
            if (r7 == 0) goto L7c
            dqza r7 = r6.o
            if (r7 == 0) goto L60
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L55
            goto L7b
        L55:
            r2 = r6
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != r5) goto L61
            r3 = r5
            goto L61
        L60:
            r2 = r6
        L61:
            if (r3 == 0) goto L7c
            cftn r7 = r2.E
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L7b
        L70:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7c
            xhw r7 = defpackage.xhw.d
            return r7
        L7b:
            return r1
        L7c:
            xhw r7 = defpackage.xif.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqb.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.xid r6, defpackage.ffgu r7) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqb.g(xid, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dmne r7, defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqb.h(dmne, ffgu):java.lang.Object");
    }

    public final ffji i(dszr dszrVar) {
        dszrVar.getClass();
        return ((Set) b.a()).contains(dszrVar) ? v : this.V;
    }

    public final void j(dmnc dmncVar) {
        if (this.t.get()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 448, "InputsUiAdapterImpl.kt")).q("Ignoring onClick as we are still processing a prior input change.");
            return;
        }
        if (((cnpk) this.Y.c()).b() && !((atte) this.N.b()).a() && !((attd) this.O.b()).a()) {
            dszr dszrVar = dszr.a;
            int ordinal = dmncVar.ordinal();
            if (ordinal == 2 || ordinal == 5) {
                axol.k(this.c, null, new ypr(this, null), 3);
                return;
            }
        }
        this.t.set(true);
        dmne dmneVar = this.R.c() != dmncVar ? dmncVar : dmnd.a;
        if (ffkj.e(dmneVar, dmnd.a)) {
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 483, "InputsUiAdapterImpl.kt")).q("Closing input in Compose Row and opening keyboard.");
        } else {
            ensk e3 = a.e();
            e3.Y(ente.a, "BugleComposeRow2");
            ((enrr) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 485, "InputsUiAdapterImpl.kt")).t("%s input clicked", dmneVar);
        }
        if (((Boolean) this.B.b()).booleanValue() && dmneVar == dmnc.c) {
            ((adsd) this.I.b()).a(33);
        }
        if (!((atbo) this.K.b()).a() || !((atbq) this.L.b()).a() || dmneVar != dmnc.c) {
            if (((Boolean) this.C.b()).booleanValue() || dmneVar != dmnc.f) {
                axol.k(this.c, null, new yps(this, dmneVar, dmncVar, null), 3);
                return;
            } else {
                this.t.set(false);
                return;
            }
        }
        xpi a2 = this.ac.a(eptm.CAMERA_GALLERY_BUTTON, new ffix() { // from class: ypc
            @Override // defpackage.ffix
            public final Object invoke() {
                yqb.this.t.set(false);
                return ffcu.a;
            }
        });
        if (a2.h()) {
            ((dsqt) this.M.b()).b(a2);
        } else {
            a2.g();
            this.t.set(false);
        }
    }

    @Override // defpackage.dtbg
    public final Object m(dtbf dtbfVar) {
        if (ffkj.e(dtbfVar, dtaw.a)) {
            if (!ffkj.e(dtbfVar, this.W)) {
                ensk e = a.e();
                e.Y(ente.a, "BugleComposeRow2");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 649, "InputsUiAdapterImpl.kt")).q("Compose Row input state is now closed");
            }
            this.R.f(null);
            this.q.f(dtbi.a);
        } else if (dtbfVar instanceof dtax) {
            dtax dtaxVar = (dtax) dtbfVar;
            dmne l = l(dtaxVar.a);
            dtbf dtbfVar2 = this.W;
            dtax dtaxVar2 = dtbfVar2 instanceof dtax ? (dtax) dtbfVar2 : null;
            if (!ffkj.e(dtaxVar2 != null ? l(dtaxVar2.a) : null, l)) {
                ensk e2 = a.e();
                e2.Y(ente.a, "BugleComposeRow2");
                ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 660, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s without keyboard", l);
            }
            this.R.f(l);
            this.q.f(dtaxVar.a);
        } else if (dtbfVar instanceof dtay) {
            dtay dtayVar = (dtay) dtbfVar;
            dmne l2 = l(dtayVar.a);
            dtbf dtbfVar3 = this.W;
            dtay dtayVar2 = dtbfVar3 instanceof dtay ? (dtay) dtbfVar3 : null;
            if (!ffkj.e(dtayVar2 != null ? l(dtayVar2.a) : null, l2)) {
                ensk e3 = a.e();
                e3.Y(ente.a, "BugleComposeRow2");
                ((enrr) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 671, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s over keyboard", l2);
            }
            this.R.f(l2);
            this.q.f(dtayVar.a);
        } else {
            if (!(dtbfVar instanceof dtbe)) {
                throw new ffcd();
            }
            dtbf dtbfVar4 = this.W;
            dtbe dtbeVar = dtbfVar4 instanceof dtbe ? (dtbe) dtbfVar4 : null;
            dsos dsosVar = dtbeVar != null ? dtbeVar.a : null;
            if (((dtbe) dtbfVar).a instanceof dsop) {
                if (dsosVar == null || !(dsosVar instanceof dsop)) {
                    ensk e4 = a.e();
                    e4.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 681, "InputsUiAdapterImpl.kt")).q("Compose Row keyboard is closing");
                }
                this.R.f(null);
                this.q.f(dtbi.a);
            } else {
                if (dsosVar == null || (dsosVar instanceof dsop)) {
                    this.G.a(197874, null);
                    ensk e5 = a.e();
                    e5.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 689, "InputsUiAdapterImpl.kt")).q("Compose Row now showing keyboard without input");
                }
                this.R.f(dmnd.a);
                this.q.f(new dtbp(dqmo.a(this.w)));
            }
        }
        this.W = dtbfVar;
        this.t.set(false);
        return ffcu.a;
    }
}
