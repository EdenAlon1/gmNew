package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.android.material.snackbar.Snackbar;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucd implements uav {
    private static final entd Z = entd.c("BugleHqms");
    public static final entd a = entd.c("BugleDraft");
    public bcpw A;
    public tys B;
    public bctw C;
    public EditText D;
    public final udz E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final bcvr I;
    public EditText J;
    public a K;
    public uaw L;
    public EditText M;
    public final ucj N;
    public ephg O;
    public bcxr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public ajth Y;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final adgn ad;
    private final ffbr ae;
    private final ffbr af;
    private final adgn ag;
    private final ffbr ah;
    private final ffbr ai;
    private Optional aj = Optional.empty();
    private final ffbr ak;
    public final eisx b;
    public final alcb c;
    public final ffbr d;
    public final ffbr e;
    public final wgc f;
    public final BugleConversationId g;
    public final bcrs h;
    public final wpk i;
    public final ffbr j;
    public final ffbr k;
    public final ea l;
    public final ejlq m;
    public final InputMethodManager n;
    public final bcxm o;
    public final tyk p;
    public final bdtd q;
    public final ffbr r;
    public final cvmd s;
    public final ffbr t;
    public final ejwl u;
    public final ejxn v;
    public final elbx w;
    public final aepz x;
    public AttachmentsContainer y;
    public ComposeMessageView z;

    public ucd(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, alcb alcbVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, wgc wgcVar, ffbr ffbrVar9, wpk wpkVar, uea ueaVar, ffbr ffbrVar10, bcvs bcvsVar, ffbr ffbrVar11, ea eaVar, ejlq ejlqVar, adgn adgnVar, InputMethodManager inputMethodManager, bcxm bcxmVar, tyk tykVar, ffbr ffbrVar12, ffbr ffbrVar13, cvmd cvmdVar, ffbr ffbrVar14, ejwl ejwlVar, ejxn ejxnVar, elbx elbxVar, aepz aepzVar, ffbr ffbrVar15, adgn adgnVar2, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, String str, eisx eisxVar, ffbr ffbrVar24, ffbr ffbrVar25) {
        this.V = ffbrVar;
        this.W = ffbrVar2;
        this.X = ffbrVar3;
        this.c = alcbVar;
        this.d = ffbrVar4;
        this.aa = ffbrVar5;
        this.ab = ffbrVar6;
        this.ac = ffbrVar7;
        this.e = ffbrVar8;
        this.f = wgcVar;
        this.h = (bcrs) ffbrVar9.b();
        this.i = wpkVar;
        this.j = ffbrVar17;
        this.E = ueaVar.a(bdgq.b(str));
        bcvr a2 = bcvsVar.a(bdgq.b(str), false);
        this.I = a2;
        this.k = ffbrVar11;
        this.l = eaVar;
        this.m = ejlqVar;
        this.ad = adgnVar;
        this.n = inputMethodManager;
        this.o = bcxmVar;
        this.p = tykVar;
        this.q = (bdtd) ffbrVar12.b();
        this.r = ffbrVar13;
        this.s = cvmdVar;
        this.t = ffbrVar14;
        this.u = ejwlVar;
        this.v = ejxnVar;
        this.w = elbxVar;
        this.x = aepzVar;
        this.af = ffbrVar15;
        this.ag = adgnVar2;
        this.ah = ffbrVar16;
        this.ai = ffbrVar18;
        this.g = new BugleConversationId(bdgq.b(str));
        this.b = eisxVar;
        this.ae = ffbrVar19;
        this.R = ffbrVar20;
        this.S = ffbrVar21;
        this.ak = ffbrVar22;
        this.T = ffbrVar23;
        this.U = ffbrVar24;
        this.Q = ffbrVar25;
        akgj akgjVar = (akgj) ffbrVar10.b();
        akgn akgnVar = akgjVar.a;
        this.N = new ucj(a2, akgnVar.c.A, (azbq) akgnVar.a.a.AO.b(), (aolr) akgjVar.a.a.a.Z.b());
    }

    private final void B(String str) {
        t(str).ifPresent(new Consumer() { // from class: ubl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((Snackbar) obj).i();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(MessageCoreData messageCoreData, boolean z, boolean z2) {
        this.E.c(messageCoreData, z, z2);
    }

    private final boolean D() {
        ucj ucjVar = this.N;
        boolean z = false;
        if (ucjVar.c.ae() && ucjVar.g) {
            z = true;
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "updateDraftMessageType", 1336, "DraftEditorFragmentPeer.java")).t("isRcsSendingEnabled in compose view: %s", Boolean.valueOf(z));
        boolean ai = this.I.ai(z);
        if (ai) {
            this.z.H().c.R();
            this.z.H().c.U();
        }
        return ai;
    }

    @Override // defpackage.uav
    public final int a(MessagePartCoreData messagePartCoreData) {
        if (this.I.U(Collections.singletonList(messagePartCoreData), this.z.H().s().b())) {
            if (messagePartCoreData instanceof PendingAttachmentData) {
                f(false);
            } else {
                ((upg) this.ak.b()).a();
            }
            if (((Boolean) cjja.a.e()).booleanValue() && messagePartCoreData.bm() && messagePartCoreData.t() != null) {
                Uri t = messagePartCoreData.t();
                t.getClass();
                engw r = engw.r(t.toString());
                boolean isPresent = this.ad.a().isPresent();
                if (r.isEmpty()) {
                    if (isPresent) {
                        ((ensz) Z.n().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "requestMediaUploadStates", 763, "DraftEditorFragmentPeer.java")).I("Conditions not met to request upload states, attachmentUrisEmpty=%s, isLocalAccountIdDefined=%s.", r.isEmpty(), this.b != null);
                    }
                } else if (isPresent) {
                    ((ensz) Z.n().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "requestMediaUploadStates", 770, "DraftEditorFragmentPeer.java")).q("Requesting upload states from Google Photos Api Client.");
                    this.m.g(new ejlp(((cjhi) this.ad.a().get()).a(this.b, r)), this.x);
                }
            }
            u();
        } else if (((Boolean) uky.g.e()).booleanValue()) {
            return -1;
        }
        return this.I.k() - 1;
    }

    @Override // defpackage.uav
    public final ea b() {
        return this.l;
    }

    @Override // defpackage.uav
    public final EditText c() {
        return this.M;
    }

    @Override // defpackage.uav
    public final bcvr d() {
        return this.I;
    }

    @Override // defpackage.uav
    @Deprecated
    public final ComposeMessageView e() {
        return this.z;
    }

    @Override // defpackage.uav
    public final void f(boolean z) {
        this.D.setShowSoftInputOnFocus(z);
        if (this.D.requestFocus()) {
            this.M = this.D;
            if (z) {
                this.L.T(new Consumer() { // from class: ubh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        entd entdVar = ucd.a;
                        ((ugg) obj).r(ugo.IME, true, false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, null);
            }
        }
        this.D.setShowSoftInputOnFocus(true);
    }

    @Override // defpackage.uav
    public final void g(ajuh ajuhVar) {
        if (this.z.H().V()) {
            t(this.l.Y(R.string.error_text_scheduled_send_with_draft_reply)).ifPresent(new Consumer() { // from class: ubn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Snackbar snackbar = (Snackbar) obj;
                    entd entdVar = ucd.a;
                    snackbar.w(android.R.string.ok, new View.OnClickListener() { // from class: ubb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            entd entdVar2 = ucd.a;
                        }
                    });
                    snackbar.i();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ajth ajthVar = this.Y;
        if (ajthVar != null) {
            ejlq ejlqVar = this.m;
            ajuhVar.getClass();
            ejlqVar.getClass();
            ffhe ffheVar = ffhe.a;
            ffsm ffsmVar = ffsm.a;
            ejlqVar.i(new ejlp(axol.a(ffra.b(ajthVar.a, ekxi.a(ffheVar), ffsmVar, new ajtg(null, ajthVar, ajuhVar)))), new ejlm(ajuhVar.a), ajthVar.d);
        }
    }

    @Override // defpackage.uav
    public final void h() {
        this.z.H().C();
    }

    @Override // defpackage.uav
    public final void i(long j, long j2) {
        y(new akzo(j, j2), 1, false, null);
    }

    @Override // defpackage.uav
    public final void j(boolean z, boolean z2, boolean z3) {
        z(new akzo(((cqoh) this.e.b()).f().toEpochMilli(), ((cqoh) this.e.b()).a()), z, z2, z3, 1);
    }

    @Override // defpackage.uav
    public final void k(bcpw bcpwVar) {
        this.A = bcpwVar;
        ComposeMessageView composeMessageView = this.z;
        if (composeMessageView != null) {
            composeMessageView.H().K(bcpwVar);
        }
    }

    @Override // defpackage.uav
    public final void l(uaw uawVar) {
        this.L = uawVar;
        ComposeMessageView composeMessageView = this.z;
        if (composeMessageView != null) {
            composeMessageView.H().w(uawVar);
        }
    }

    @Override // defpackage.uav
    public final void m(MessageCoreData messageCoreData) {
        n(messageCoreData, false);
    }

    @Override // defpackage.uav
    public final void n(MessageCoreData messageCoreData, boolean z) {
        o(messageCoreData, z, false);
    }

    @Override // defpackage.uav
    public final void o(final MessageCoreData messageCoreData, boolean z, boolean z2) {
        if (((Boolean) dedt.a.e()).booleanValue() && messageCoreData.c() == 1 && ((MessagePartCoreData) messageCoreData.ab().get(0)).bD()) {
            Context z3 = this.l.z();
            z3.getClass();
            if (dedn.a(z3.getPackageManager())) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) messageCoreData.ab().get(0);
                if (messagePartCoreData.bD()) {
                    final Uri t = messagePartCoreData.t();
                    t.getClass();
                    this.K.a = z;
                    this.ag.a().ifPresent(new Consumer() { // from class: ube
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ucd ucdVar = ucd.this;
                            Context z4 = ucdVar.l.z();
                            z4.getClass();
                            ucdVar.m.i(new ejlp(((dedv) obj).a(z4, t)), new ejlm(messageCoreData), ucdVar.K);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return;
                }
                return;
            }
        }
        C(messageCoreData, z, z2);
    }

    @Override // defpackage.uav
    public final void p(MessageCoreData messageCoreData) {
        o(messageCoreData, true, true);
    }

    @Override // defpackage.uav, defpackage.cxra
    public final boolean q() {
        return this.z.H().W();
    }

    @Override // defpackage.uav
    public final boolean r(MessagePartCoreData messagePartCoreData) {
        boolean z = this.I.x(messagePartCoreData) != null;
        if (z) {
            u();
        }
        return z;
    }

    public final int s(SelfIdentityId selfIdentityId) {
        bdtd bdtdVar = this.q;
        if (bdtdVar == null) {
            if (!((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                return -1;
            }
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1380, "DraftEditorFragmentPeer.java")).t("DraftEditorFragmentPeer#getConversationSelfSubId selfParticipantsData not loaded yet. Returning -1 for selfId=%s", selfIdentityId);
            return -1;
        }
        aztg d = bdtdVar.d(selfIdentityId);
        if (d != null) {
            if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1364, "DraftEditorFragmentPeer.java")).w("DraftEditorFragmentPeer#getConversationSelfSubId returning subId=%s for selfId=%s", d.e(), selfIdentityId);
            }
            return d.e();
        }
        if (!((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
            return -1;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1372, "DraftEditorFragmentPeer.java")).t("DraftEditorFragmentPeer#getConversationSelfSubId no subscription found for selfId=%s", selfIdentityId);
        return -1;
    }

    public final Optional t(final String str) {
        return Optional.ofNullable(this.l.Q).map(new Function() { // from class: ubk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = ucd.a;
                return Snackbar.r((View) obj, str, 0);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void u() {
        if (this.H) {
            return;
        }
        this.F = true;
    }

    public final void v() {
        uaw uawVar;
        if (this.B == null || this.O == null || (uawVar = this.L) == null) {
            return;
        }
        uawVar.aj();
    }

    public final void w(int i) {
        B(this.l.B().getString(i));
    }

    public final void x(String str) {
        if (D()) {
            return;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "updateDraftMessageTypeWithFailureLogging", 1326, "DraftEditorFragmentPeer.java")).t("%s: couldn't convert draft: keeping as prior type", str);
    }

    public final void y(akzo akzoVar, int i, boolean z, fjay fjayVar) {
        fjay fjayVar2;
        if (fjayVar == null) {
            ffbr ffbrVar = this.j;
            fjayVar2 = cslr.a();
            ((cpev) ffbrVar.b()).e(cpeu.SEND_BUTTON_ACCURATE, fjayVar2.b);
            ((cpev) this.j.b()).e(cpeu.NOTIFICATION, fjayVar2.b);
        } else {
            fjayVar2 = fjayVar;
        }
        final long j = akzoVar.a;
        long j2 = akzoVar.b;
        this.y.H();
        int o = cxnk.o(this.I);
        this.y.H();
        int p = cxnk.p(this.I);
        try {
            this.L.T(new Consumer() { // from class: uax
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ugg) obj).j();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, null);
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.i()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendCheckedDraftMessage", (char) 1662, "DraftEditorFragmentPeer.java")).q("An error occurred while marking the draft as ready to send");
        }
        MessageCoreData w = this.I.w(j, false);
        if (!w.co()) {
            return;
        }
        w.bW(fjayVar2);
        ((altk) this.af.b()).ae(eooi.CONVERSATION_ACTIVITY, fjayVar2, akzoVar);
        Optional map = this.I.p.map(new Function() { // from class: ubi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = ucd.a;
                return Long.valueOf(Duration.between((Instant) obj, Instant.ofEpochMilli(j)).toMillis());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekzz f = eleg.f("DraftEditorFragmentPeer::setGooglePhotosSharingState");
        try {
            if (((Boolean) cjja.a.e()).booleanValue() && !w.aH().isEmpty()) {
                if (this.b == null) {
                    throw new IllegalStateException("Sign-in is required for Google Photos usage");
                }
                cjhq cjhqVar = (cjhq) cjia.a.createBuilder();
                cjhx cjhxVar = (cjhx) cjhy.a.createBuilder();
                int a2 = this.b.a();
                cjhxVar.copyOnWrite();
                cjhy cjhyVar = (cjhy) cjhxVar.instance;
                cjhyVar.b |= 1;
                cjhyVar.c = a2;
                cjhy cjhyVar2 = (cjhy) cjhxVar.build();
                cjhqVar.copyOnWrite();
                cjia cjiaVar = (cjia) cjhqVar.instance;
                cjhyVar2.getClass();
                cjiaVar.c = cjhyVar2;
                cjiaVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                ((MessageData) w).q = (cjia) cjhqVar.build();
            }
            f.close();
            if (i - 1 == 0) {
                altk altkVar = (altk) this.af.b();
                this.I.y();
                altkVar.aM();
                this.L.aw(w, j, j2, z, map, Optional.of(Boolean.valueOf(this.I.q)));
            } else {
                if (this.aj.isEmpty()) {
                    throw new IllegalStateException("Cannot schedule message with empty scheduled time.");
                }
                if (!this.z.H().c.ae()) {
                    throw new IllegalStateException("Scheduled send not enabled.");
                }
                this.L.as(w, (Instant) this.aj.get());
                this.aj = Optional.empty();
                this.z.H().y();
            }
            this.I.H(true);
            this.z.H().C();
            this.z.H().c.y();
            this.z.H().E();
            f(false);
            if (!((ctyx) this.ab.b()).q("save_original_media_toast_msg_showed", false)) {
                eg G = this.l.G();
                if (G != null && o + p > 0) {
                    Resources resources = G.getResources();
                    String string = resources.getString(R.string.app_name);
                    B((o <= 0 || p <= 0) ? o > 0 ? resources.getQuantityString(R.plurals.original_images_only_saved_info, o, Integer.valueOf(o), string) : resources.getQuantityString(R.plurals.original_videos_only_saved_info, p, Integer.valueOf(p), string) : resources.getString(R.string.original_media_saved_info, resources.getQuantityString(R.plurals.original_image_plural_info, o, Integer.valueOf(o)), resources.getQuantityString(R.plurals.original_video_plural_info, p, Integer.valueOf(p)), string));
                }
                ((ctyx) this.ab.b()).h("save_original_media_toast_msg_showed", true);
            }
            if (D()) {
                return;
            }
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendCheckedDraftMessage", 1750, "DraftEditorFragmentPeer.java")).q("cannot set draft RCS status");
        } finally {
        }
    }

    public final void z(final akzo akzoVar, final boolean z, boolean z2, final boolean z3, final int i) {
        ParticipantsTable.BindData a2;
        ParticipantsTable.BindData a3;
        aoku q;
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendDraftMessage", 1416, "DraftEditorFragmentPeer.java")).t("Initiated outgoing message processing in conversation %s", this.g);
        if (this.I.aa()) {
            ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendDraftMessage", 1419, "DraftEditorFragmentPeer.java")).q("Message can't be sent or scheduled: still checking draft");
            return;
        }
        if (this.L == null || this.C == null || this.B == null) {
            w(R.string.cant_send_message_while_loading_conversation);
            return;
        }
        ekzz f = eleg.f("DraftEditorFragmentPeer::sendDraftMessage");
        try {
            if (!this.L.bj()) {
                ((deaj) this.ac.b()).a();
            }
            final fjay a4 = cslr.a();
            if (i - 1 != 0) {
                this.aj = this.z.H().c.k();
            } else {
                ((altk) this.af.b()).ah(this.I.o());
                ((cpev) this.j.b()).e(cpeu.SEND_BUTTON_ACCURATE, a4.b);
                ((cpev) this.j.b()).e(cpeu.NOTIFICATION, a4.b);
            }
            ekzz f2 = eleg.f("DraftEditorFragmentPeer::hideSimPicker");
            try {
                this.z.H().c.x();
                f2.close();
                ekzz f3 = eleg.f("DraftEditorFragmentPeer::setHasEmergencyRecipient");
                try {
                    cfva cfvaVar = aoqm.a;
                    boolean z4 = false;
                    if (((Boolean) new aopg().get()).booleanValue()) {
                        bctw bctwVar = this.C;
                        if (bctwVar != null && (a3 = bctwVar.a()) != null) {
                            q = ((aolr) this.ae.b()).q(a3);
                            bcvr bcvrVar = this.I;
                            if (q != null && q.v()) {
                                z4 = true;
                            }
                            bcvrVar.k = z4;
                        }
                        q = null;
                        bcvr bcvrVar2 = this.I;
                        if (q != null) {
                            z4 = true;
                        }
                        bcvrVar2.k = z4;
                    } else {
                        bctw bctwVar2 = this.C;
                        String U = (bctwVar2 == null || (a2 = bctwVar2.a()) == null) ? null : a2.U();
                        bcvr bcvrVar3 = this.I;
                        if (!TextUtils.isEmpty(U)) {
                            ctvb ctvbVar = (ctvb) this.aa.b();
                            U.getClass();
                            if (ctvbVar.H(U)) {
                                z4 = true;
                            }
                        }
                        bcvrVar3.k = z4;
                    }
                    f3.close();
                    f3 = eleg.f("DraftEditorFragmentPeer::logXsl");
                    try {
                        ((bbbr) this.ah.b()).c(a4, null, 36, Optional.of(fgjz.BUGLE_SENDING_INTERNAL_STATUS_VERIFYING_MESSAGE));
                        f3.close();
                        bcvr bcvrVar4 = this.I;
                        bcvrVar4.F(z, z2, s(bcvrVar4.t()), new bcvk() { // from class: ubj
                            @Override // defpackage.bcvk
                            public final void a(bcvr bcvrVar5, bcvq bcvqVar) {
                                ucd ucdVar = ucd.this;
                                if (bcvrVar5 != ucdVar.I) {
                                    return;
                                }
                                boolean z5 = z;
                                switch (bcvqVar) {
                                    case PASSED:
                                        ucdVar.y(akzoVar, i, z3, a4);
                                        break;
                                    case HAS_PENDING_ATTACHMENTS:
                                        ucdVar.w(R.string.cant_send_message_while_loading_attachments);
                                        break;
                                    case NO_SELF_PHONE_NUMBER_IN_GROUP_MMS:
                                        ucdVar.L.ap(true);
                                        break;
                                    case MESSAGE_OVER_LIMIT:
                                        emxf.a(z5);
                                        ucdVar.L.aT(bcvrVar5, true, false);
                                        break;
                                    case VIDEO_ATTACHMENT_LIMIT_EXCEEDED:
                                        emxf.a(z5);
                                        ucdVar.L.aT(bcvrVar5, true, true);
                                        break;
                                    case SIM_NOT_READY:
                                        ucdVar.w(R.string.cant_send_message_without_active_subscription);
                                        break;
                                    case NEED_TO_CONFIRM_SMS_ENCODING:
                                        ucdVar.L.R();
                                        break;
                                    case RCS_DISABLED:
                                        ucdVar.w(R.string.cant_send_rcs_message_when_rcs_disabled_v2);
                                        break;
                                    case MMS_WHEN_MASS_SMS:
                                        ucdVar.w(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
                                        break;
                                    case SIM_CANT_SEND_MMS:
                                        eg G = ucdVar.l.G();
                                        if (G != null) {
                                            int b = ((ctwb) ucdVar.t.b()).b();
                                            int q2 = ucdVar.I.q();
                                            emxf.a(b != q2);
                                            ddxs.b(G, ((ctwb) ucdVar.t.b()).h(q2).r(), ((ctwb) ucdVar.t.b()).h(b).r(), true);
                                            break;
                                        }
                                        break;
                                    case MMS_DISABLED:
                                        ucdVar.w(R.string.mms_failure_outgoing_disabled);
                                        break;
                                    case EXCEEDS_SMS_MESSAGE_LENGTH_TO_EMERGENCY_NUMBER:
                                        ucdVar.L.aU();
                                        break;
                                    case IS_REPLY_WITHOUT_RCS:
                                        ucdVar.t(ucdVar.l.Y(R.string.error_text_draft_is_reply_without_rcs_v2)).ifPresent(new Consumer() { // from class: ubc
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj) {
                                                Snackbar snackbar = (Snackbar) obj;
                                                entd entdVar2 = ucd.a;
                                                snackbar.w(android.R.string.ok, new View.OnClickListener() { // from class: ubo
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        entd entdVar3 = ucd.a;
                                                    }
                                                });
                                                snackbar.i();
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        break;
                                    case IS_REPLY_TO_MISSING_MESSAGE:
                                        ucdVar.t(ucdVar.l.Y(R.string.error_text_draft_is_reply_to_missing_message)).ifPresent(new Consumer() { // from class: ubd
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj) {
                                                Snackbar snackbar = (Snackbar) obj;
                                                entd entdVar2 = ucd.a;
                                                snackbar.w(android.R.string.ok, new View.OnClickListener() { // from class: ubq
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        entd entdVar3 = ucd.a;
                                                    }
                                                });
                                                snackbar.i();
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        break;
                                }
                            }
                        }, this.z.H().s());
                        emxf.a(!this.D.getText().toString().equals("assert-on-send"));
                        f.close();
                    } finally {
                    }
                } finally {
                }
            } finally {
                try {
                    f2.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<MessageCoreData, FileInfoResult> {
        boolean a = true;

        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            MessageCoreData messageCoreData = (MessageCoreData) obj;
            FileInfoResult fileInfoResult = (FileInfoResult) obj2;
            messageCoreData.getClass();
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) messageCoreData.ab().get(0);
            ComposeMessageView composeMessageView = ucd.this.z;
            composeMessageView.getClass();
            int n = composeMessageView.H().n();
            int b = messagePartCoreData.b();
            int c = messagePartCoreData.c();
            if (fileInfoResult != null) {
                if (dedn.b(messagePartCoreData.V(), fileInfoResult.b, n)) {
                    ellj.f(new dedi(Uri.parse(fileInfoResult.a), n / 1024, c, b), ucd.this.l);
                    return;
                }
            }
            ucd.this.C(messageCoreData, this.a, false);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((cfyt) ucd.this.r.b()).b(th);
            ucd.this.C((MessageCoreData) obj, this.a, false);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
