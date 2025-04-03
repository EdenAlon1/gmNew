package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apgy implements apga {
    public static final entd a = entd.c("BugleConversation");
    private final csxu A;
    private final ffbr B;
    public final ctbl d;
    public final errl e;
    public final errl f;
    public final fazb g;
    public final aphs h;
    public final BugleConversationId i;
    public final aqge j;
    public final aqge k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final aued s;
    public final auee t;
    public ctbx u;
    public aqge w;
    public ctbx x;
    public ctbx y;
    public aqux z;
    public final Object b = new Object();
    public final Object c = new Object();
    public boolean v = false;

    public apgy(ctbk ctbkVar, errl errlVar, errl errlVar2, ffbr ffbrVar, csxu csxuVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, fazb fazbVar, ffbr ffbrVar6, ffbr ffbrVar7, aued auedVar, ffbr ffbrVar8, auee aueeVar, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aphs aphsVar) {
        this.d = ctbkVar.a(new apgw(this));
        this.e = errlVar;
        this.f = errlVar2;
        this.l = ffbrVar;
        this.A = csxuVar;
        this.n = ffbrVar3;
        this.B = ffbrVar4;
        this.g = fazbVar;
        this.h = aphsVar;
        this.i = bugleConversationId;
        this.j = aqgeVar;
        this.k = aqgeVar2;
        this.m = ffbrVar2;
        this.o = ffbrVar5;
        this.r = ffbrVar7;
        this.q = ffbrVar6;
        this.s = auedVar;
        this.p = ffbrVar8;
        this.t = aueeVar;
    }

    public static boolean j(amfx amfxVar, engw engwVar) {
        return ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && amfxVar.b() == alxi.ONE_ON_ONE && ((ResolvedRecipient) engwVar.get(0)).g().A();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: apgg
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                entd entdVar = apgy.a;
                return aqgd.this.a();
            }
        }, "ComposeConstraints::register", "ComposeConstraints::callback", "ComposeConstraints::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return f(false);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.apga
    public final elfl d() {
        return f(true);
    }

    public final aqge e(engw engwVar) {
        aqge y;
        synchronized (this.b) {
            if (this.v && this.w == null) {
                aqkp aqkpVar = (aqkp) this.B.b();
                Stream stream = Collection.EL.stream(engwVar);
                int i = engw.d;
                this.w = aqkpVar.y((engw) stream.collect(endq.a), 2);
                ensz enszVar = (ensz) a.h();
                enszVar.Y(csux.q, this.i);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsCapabilitiesSubscription", 898, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Listening to RCS Capabilities For All Recipients.");
                emxf.l(this.x == null);
                aqge aqgeVar = this.w;
                aqgeVar.getClass();
                this.x = aqgeVar.a(new aqgd() { // from class: apgk
                    @Override // defpackage.aqgd
                    public final elfl a() {
                        return apgy.this.g("Recipient Rcs Capabilities");
                    }
                });
            }
            if (this.v) {
                y = this.w;
                y.getClass();
            } else {
                aqkp aqkpVar2 = (aqkp) this.B.b();
                Stream stream2 = Collection.EL.stream(engwVar);
                int i2 = engw.d;
                y = aqkpVar2.y((engw) stream2.collect(endq.a), 2);
            }
        }
        return y;
    }

    public final elfl f(final boolean z) {
        aqge aqgeVar = this.k;
        final elfl b = this.j.b();
        final elfl b2 = aqgeVar.b();
        final errl errlVar = Build.VERSION.SDK_INT <= 26 ? this.f : this.e;
        return elfo.k(b, b2).b(new erog() { // from class: apgf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final amfx amfxVar = (amfx) erqt.q(b);
                final engw engwVar = (engw) erqt.q(b2);
                final apgy apgyVar = apgy.this;
                elfl a2 = apgyVar.h.a(amfxVar, engwVar);
                final boolean z2 = z;
                return a2.i(new eroh() { // from class: apgp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final apgy apgyVar2 = apgy.this;
                        final amfx amfxVar2 = amfxVar;
                        alxh alxhVar = (alxh) obj;
                        final aqux f = amfxVar2.f();
                        apgyVar2.h(f);
                        final apfw apfwVar = new apfw();
                        apfwVar.g(alxi.ONE_ON_ONE);
                        apfwVar.n(false);
                        int i = engw.d;
                        apfwVar.l(enou.a);
                        apfwVar.c = null;
                        apfwVar.e = 2;
                        apfwVar.j(false);
                        apfwVar.k(Long.MAX_VALUE);
                        apfwVar.d(0);
                        apfwVar.m(Alert.DURATION_SHOW_INDEFINITELY);
                        apfwVar.d = new amtc(amtd.HIDDEN, null);
                        apfwVar.f = 1;
                        apfwVar.h((eoxo) ((eoxk) eoxo.a.createBuilder()).build());
                        apfwVar.i(azcr.a);
                        apfwVar.b = f;
                        BugleConversationId bugleConversationId = apgyVar2.i;
                        if (bugleConversationId == null) {
                            throw new NullPointerException("Null conversationId");
                        }
                        final engw engwVar2 = engwVar;
                        apfwVar.a = bugleConversationId;
                        apfwVar.g(amfxVar2.b());
                        apfwVar.n(amfxVar2.L());
                        apfwVar.e(alyx.NONE);
                        apfwVar.l(engwVar2);
                        apfwVar.f(alxhVar);
                        apfwVar.d = amfxVar2.z();
                        if (((atly) apgyVar2.q.b()).a()) {
                            apfwVar.i(amfxVar2.B());
                        } else {
                            apfwVar.i(azcr.a);
                        }
                        if (amfxVar2.u()) {
                            ensz enszVar = (ensz) apgy.a.e();
                            enszVar.Y(csux.q, apgyVar2.i);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 316, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected deleted conversation.");
                            alxhVar = alxh.CONVERSATION_UNKNOWN;
                            apfwVar.f(alxhVar);
                        }
                        if (f == null && alxhVar == alxh.NONE) {
                            ensz enszVar2 = (ensz) apgy.a.e();
                            enszVar2.Y(csux.q, apgyVar2.i);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 329, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected with null Self Identity.");
                            alxhVar = alxh.SELFIDENTITY_UNAVAILABLE;
                            apfwVar.f(alxhVar);
                        }
                        if (alxhVar != alxh.NONE) {
                            ensz enszVar3 = (ensz) apgy.a.j();
                            enszVar3.Y(csux.q, apgyVar2.i);
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 339, "DefaultBugleComposeConstraintsSupplier.java")).t("Compose Constraints: Compose Disabled: %s.", alxhVar);
                            return elfo.e(apfwVar.o());
                        }
                        apfwVar.e = 1;
                        apfwVar.j(true);
                        elfl b3 = f != null ? f.e().b() : elfo.e(aqys.b);
                        elfl b4 = f != null ? f.f().b() : elfo.e(false);
                        final elfl b5 = apgyVar2.e(engwVar2).b();
                        elfl e = (f == null || !apgyVar2.t.a()) ? elfo.e(null) : f.j();
                        final boolean z3 = z2;
                        ListenableFuture[] listenableFutureArr = {b3, b4, b5, e};
                        final elfl elflVar = b4;
                        final elfl elflVar2 = e;
                        final elfl elflVar3 = b3;
                        return elfo.k(listenableFutureArr).b(new erog() { // from class: apgh
                            /* JADX WARN: Removed duplicated region for block: B:113:0x0316  */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x038b A[ADDED_TO_REGION] */
                            /* JADX WARN: Removed duplicated region for block: B:125:0x03c1  */
                            /* JADX WARN: Removed duplicated region for block: B:128:0x03c9  */
                            /* JADX WARN: Removed duplicated region for block: B:133:0x03f8  */
                            /* JADX WARN: Removed duplicated region for block: B:136:0x0401  */
                            /* JADX WARN: Removed duplicated region for block: B:140:0x03fb  */
                            /* JADX WARN: Removed duplicated region for block: B:141:0x03c3  */
                            /* JADX WARN: Removed duplicated region for block: B:142:0x0383  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x0494  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x04bf  */
                            @Override // defpackage.erog
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.google.common.util.concurrent.ListenableFuture a() {
                                /*
                                    Method dump skipped, instructions count: 1533
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.apgh.a():com.google.common.util.concurrent.ListenableFuture");
                            }
                        }, apgyVar2.e);
                    }
                }, errlVar);
            }
        }, errlVar);
    }

    public final elfl g(String str) {
        ensz enszVar = (ensz) a.e();
        enszVar.Y(csux.q, this.i);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "notifyUpdate", 959, "DefaultBugleComposeConstraintsSupplier.java")).t("Compose Constraints: Update notification from %s.", str);
        return elfo.f(new Runnable() { // from class: apgm
            @Override // java.lang.Runnable
            public final void run() {
                apgy.this.d.c(new Supplier() { // from class: apgo
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        entd entdVar = apgy.a;
                        return null;
                    }
                }, "ComposeConstraints::Notify");
            }
        }, this.e);
    }

    public final void h(aqux aquxVar) {
        synchronized (this.c) {
            if (Objects.equals(this.z, aquxVar)) {
                return;
            }
            ctbx ctbxVar = this.y;
            if (ctbxVar != null) {
                ctbxVar.a();
                this.y = null;
            }
            this.z = aquxVar;
            if (aquxVar != null) {
                ensz enszVar = (ensz) a.h();
                enszVar.Y(csux.q, this.i);
                ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 933, "DefaultBugleComposeConstraintsSupplier.java");
                aqux aquxVar2 = this.z;
                aquxVar2.getClass();
                enszVar2.t("Compose Constraints: Switching RCS Availability listener to SelfIdentity %s.", aquxVar2);
                aqux aquxVar3 = this.z;
                aquxVar3.getClass();
                aqux aquxVar4 = this.z;
                aquxVar4.getClass();
                this.y = ctbt.b(aquxVar3.e().a(new aqgd() { // from class: apgq
                    @Override // defpackage.aqgd
                    public final elfl a() {
                        return apgy.this.g("SelfIdentity Rcs");
                    }
                }), aquxVar4.f().a(new aqgd() { // from class: apgr
                    @Override // defpackage.aqgd
                    public final elfl a() {
                        return apgy.this.g("SelfIdentity Encryption");
                    }
                }));
            } else {
                ensz enszVar3 = (ensz) a.j();
                enszVar3.Y(csux.q, this.i);
                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 948, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Cleared RCS Availability listener. No activeSelfIdentity.");
            }
        }
    }

    public final void i(alyx alyxVar, apfy apfyVar) {
        if (apfyVar.c() != 2) {
            apfyVar.d(alyxVar != alyx.NONE ? alyxVar.g ? this.A.b("bugle_rcs_attachment_limit", 10) : this.A.b("bugle_mms_attachment_limit", 10) : 0);
        } else {
            apfyVar.d(0);
        }
    }
}
