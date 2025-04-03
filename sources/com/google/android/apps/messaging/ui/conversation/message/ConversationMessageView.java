package com.google.android.apps.messaging.ui.conversation.message;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import defpackage.adsd;
import defpackage.aewg;
import defpackage.afah;
import defpackage.ahor;
import defpackage.albq;
import defpackage.alrr;
import defpackage.altk;
import defpackage.axnw;
import defpackage.azzw;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.bcwd;
import defpackage.bdjs;
import defpackage.byyr;
import defpackage.bzqa;
import defpackage.cbvv;
import defpackage.cful;
import defpackage.cfup;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cnvu;
import defpackage.cpdg;
import defpackage.cqoh;
import defpackage.cqpu;
import defpackage.crij;
import defpackage.crik;
import defpackage.criy;
import defpackage.crji;
import defpackage.crjx;
import defpackage.crlx;
import defpackage.crly;
import defpackage.crnx;
import defpackage.csix;
import defpackage.csmj;
import defpackage.cstx;
import defpackage.cuye;
import defpackage.cxqh;
import defpackage.cynb;
import defpackage.czhj;
import defpackage.czhk;
import defpackage.czia;
import defpackage.czic;
import defpackage.czid;
import defpackage.czjd;
import defpackage.czje;
import defpackage.czjf;
import defpackage.czko;
import defpackage.czkv;
import defpackage.czlq;
import defpackage.czlu;
import defpackage.czlw;
import defpackage.czur;
import defpackage.ddjr;
import defpackage.ddko;
import defpackage.ddxs;
import defpackage.ddzb;
import defpackage.deao;
import defpackage.ekmz;
import defpackage.elfl;
import defpackage.ellq;
import defpackage.emyl;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ensz;
import defpackage.entd;
import defpackage.ente;
import defpackage.eorw;
import defpackage.errl;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.ffkj;
import defpackage.shw;
import defpackage.vx;
import defpackage.vyw;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageView extends czkv implements View.OnClickListener, View.OnLongClickListener, czid, criy, crik, cynb, czjf {
    public csmj A;
    public crjx B;
    public crji C;
    public cuye D;
    public czje E;
    public adsd F;
    public ddxs G;
    public cxqh H;
    public bcsf I;
    public vyw J;
    public cqoh K;
    public ffbr L;
    public ellq M;
    public Optional N;
    public fazb O;
    public ffbr P;
    public ffbr Q;
    public czko R;
    public czhk S;
    public engw T;
    public deao U;
    public ffbr V;
    public ffbr W;
    private View.OnClickListener aA;
    private View.OnLongClickListener aB;
    public fazb aa;
    public ffbr ab;
    public fazb ac;
    public ffbr ad;
    public ffbr ae;
    public ffbr af;
    public ffbr ag;
    public ffbr ah;
    public czlu ai;
    private crly ak;
    private ContactIconView al;
    private crly am;
    private crly an;
    private ViewGroup ao;
    private crly ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private final List at;
    private boolean au;
    private czlq av;
    private elfl aw;
    private boolean ax;
    private int ay;
    private MessageIdType az;
    public bcse e;
    public crly f;
    public ConversationMessageBubbleView g;
    public TextView h;
    public TextView i;
    public crly j;
    public crly k;
    public Optional l;
    public czjd m;
    public crly n;
    public boolean o;
    public Optional p;
    public boolean q;
    public final int r;
    public boolean s;
    public czic t;
    public String u;
    public czlw v;
    public engw w;
    public final AtomicReference x;
    public czhj y;
    public albq z;
    private static final entd aj = entd.c("BugleMessageView");
    public static final cfva a = cfvl.q(143245445);
    public static final cfva b = cfvl.n(cfvl.b, "use_default_sender_color_in_group", false);
    public static final emyl c = cfvl.x(204810985, "skip_chat_api_flag_check_on_get_progress");
    public static final cfva d = cfvl.n(cfvl.b, "log_message_view_measure_and_layout_results", false);

    public ConversationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.at = new ArrayList();
        this.p = Optional.empty();
        this.r = (int) getResources().getDimension(R.dimen.message_margin_default);
        this.x = new AtomicReference();
        this.ay = 0;
        setWillNotDraw(false);
        this.ax = false;
    }

    private final void K() {
        ((Optional) this.P.b()).ifPresent(new Consumer() { // from class: czkc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cyne) obj).a(ConversationMessageView.this.h, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.P.b()).ifPresent(new Consumer() { // from class: czke
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cyne) obj).a(ConversationMessageView.this.i, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void L(View view) {
        view.setTag(R.id.conversation_message_view_clickable_tag, this);
        view.setOnClickListener(this.aA);
        view.setOnLongClickListener(this.aB);
    }

    private final boolean M() {
        return bcwd.a(this.e);
    }

    private final boolean N() {
        return byyr.b(this.e.b());
    }

    private final boolean O() {
        return this.e.aQ();
    }

    public static void x(View view, View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator p = csmj.p(view, 8);
        Animator p2 = csmj.p(view2, 0);
        p2.setInterpolator(ddzb.a);
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        view.clearAnimation();
        view2.clearAnimation();
        animatorSet.playSequentially(p, p2);
        animatorSet.start();
    }

    protected final void A(int i, int i2) {
        crly crlyVar = this.an;
        if (crlyVar == null || !crlyVar.i()) {
            return;
        }
        ((ComposeView) crlyVar.b()).measure(i, i2);
    }

    public final void B(float f) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    public final boolean C() {
        return this.e.af();
    }

    public final boolean D() {
        return this.e.ag();
    }

    protected final boolean E() {
        return this.ak.i() && ((MessageAttachmentsView) this.ak.b()).c.getChildCount() > 0;
    }

    protected final boolean F() {
        return this.e.az();
    }

    public final boolean G() {
        if (this.p.isPresent()) {
            return ((Boolean) this.p.get()).booleanValue();
        }
        if ((((Boolean) cnvu.a.e()).booleanValue() && O()) || cbvv.h(this.e.f())) {
            return false;
        }
        if (!this.e.as() && !this.e.aU()) {
            return true;
        }
        if ((this.au && this.e.aM() && bdjs.m(this.e.f())) || this.e.aF()) {
            return true;
        }
        return this.q;
    }

    public final boolean H() {
        if (!this.e.ar() && TextUtils.isEmpty(((cpdg) this.aa.b()).c(getResources(), this.e.H()))) {
            return this.e.bb();
        }
        return true;
    }

    @Override // defpackage.czkr
    public final void b() {
        czjd czjdVar = (czjd) this.av;
        czjdVar.w = null;
        crly crlyVar = czjdVar.z;
        AppCompatImageView appCompatImageView = crlyVar == null ? null : (AppCompatImageView) crlyVar.b();
        if (appCompatImageView != null) {
            ((ekmz) czjdVar.y.b()).h().k(appCompatImageView);
        }
        crly crlyVar2 = czjdVar.z;
        if (crlyVar2 != null) {
            crlyVar2.e();
            czjdVar.z = null;
        }
        elfl elflVar = czjdVar.A;
        if (elflVar != null) {
            elflVar.cancel(false);
        }
        this.u = null;
        final czlu czluVar = this.ai;
        czluVar.b.d(new Consumer() { // from class: czlt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                crii criiVar;
                MessageAttachmentContainer messageAttachmentContainer = ((MessageAttachmentsView) czlu.this.b.b()).c;
                for (cric cricVar : messageAttachmentContainer.d) {
                    if (cricVar != null && (criiVar = cricVar.a) != null) {
                        criiVar.c();
                    }
                }
                messageAttachmentContainer.removeAllViews();
                messageAttachmentContainer.d.clear();
                messageAttachmentContainer.a.clear();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (this.ap.i()) {
            ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) this.ap.b();
            conversationMessageLinkPreviewView.setVisibility(8);
            conversationMessageLinkPreviewView.n.setVisibility(8);
            conversationMessageLinkPreviewView.l.setVisibility(8);
            conversationMessageLinkPreviewView.m.setVisibility(8);
            conversationMessageLinkPreviewView.a();
            conversationMessageLinkPreviewView.k.setVisibility(8);
            conversationMessageLinkPreviewView.i.setImageDrawable(null);
            conversationMessageLinkPreviewView.j.setImageDrawable(null);
            conversationMessageLinkPreviewView.o = false;
            ViewGroup.LayoutParams layoutParams = conversationMessageLinkPreviewView.l.getLayoutParams();
            layoutParams.height = -2;
            conversationMessageLinkPreviewView.l.setLayoutParams(layoutParams);
        }
        if (this.j.i()) {
            ((SuggestionShortcutView) this.j.b()).H().b();
        }
        crly crlyVar3 = this.an;
        if (crlyVar3 != null && crlyVar3.i()) {
            crlyVar3.e();
        }
        ConversationMessageBubbleView conversationMessageBubbleView = this.g;
        conversationMessageBubbleView.d(false);
        conversationMessageBubbleView.c(false, true);
    }

    @Override // defpackage.czid
    public final bcse c() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:362:0x033b, code lost:
    
        if (r14.a.aL() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01d9, code lost:
    
        if (r2.e(r3, r0) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0410 A[Catch: all -> 0x0bf4, TryCatch #0 {all -> 0x0bf4, blocks: (B:113:0x0408, B:115:0x0410, B:346:0x041b), top: B:112:0x0408 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bf3 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x041b A[Catch: all -> 0x0bf4, TRY_LEAVE, TryCatch #0 {all -> 0x0bf4, blocks: (B:113:0x0408, B:115:0x0410, B:346:0x041b), top: B:112:0x0408 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d  */
    @Override // defpackage.czid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.bcse r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 3074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView.d(bcse, java.lang.String, boolean, boolean):void");
    }

    @Override // defpackage.czid
    public final void e(final Object obj) {
        if (obj instanceof cqpu) {
            this.ak.d(new Consumer() { // from class: czkj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    cfva cfvaVar = ConversationMessageView.a;
                    ((MessageAttachmentsView) obj2).d.b(Optional.of((cqpu) obj));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (obj instanceof SuperSortLabel) {
            this.e.t = (SuperSortLabel) obj;
            ((Optional) this.V.b()).ifPresent(new Consumer() { // from class: czkk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ConversationMessageView conversationMessageView = ConversationMessageView.this;
                    ((ahkv) obj2).a(conversationMessageView.n, conversationMessageView.e);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            if (!(obj instanceof afah)) {
                throw new IllegalStateException("ConversationMessageView.bindPayload() does not support ".concat(String.valueOf(String.valueOf(obj))));
            }
            if (aewg.i()) {
                bcse bcseVar = this.e;
                String str = ((afah) obj).a;
                bcseVar.bi();
                ((Optional) this.V.b()).ifPresent(new Consumer() { // from class: czkl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ConversationMessageView conversationMessageView = ConversationMessageView.this;
                        ((ahkv) obj2).a(conversationMessageView.n, conversationMessageView.e);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.czid
    public final void f(czic czicVar) {
        this.t = czicVar;
    }

    @Override // defpackage.crik
    public final boolean g(crij crijVar) {
        return onLongClick((View) ((AudioAttachmentView) crijVar).getParent());
    }

    @Override // defpackage.cynb
    public final void gl() {
        K();
    }

    @Override // defpackage.crik
    public final int h() {
        return 1;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (((Boolean) cful.an.e()).booleanValue()) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    @Override // defpackage.criy
    public final boolean i(MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        if (messagePartCoreData != null) {
            return this.t.H(this, messagePartCoreData, rect, z);
        }
        TextView textView = ((czjd) this.av).k;
        if (textView == null) {
            return false;
        }
        if (z) {
            onLongClick(textView);
            return false;
        }
        onClick(textView);
        return false;
    }

    protected final int j() {
        if (this.am.i() && M()) {
            return ((BadgesRecyclerView) this.am.b()).getMeasuredHeight();
        }
        return 0;
    }

    protected final int k() {
        if (this.am.i()) {
            return ((BadgesRecyclerView) this.am.b()).getMeasuredWidth();
        }
        return 0;
    }

    protected final int l() {
        return this.g.getMeasuredHeight();
    }

    protected final int m() {
        View childAt = E() ? ((MessageAttachmentsView) this.ak.b()).c.getChildAt(0) : null;
        if (childAt != null) {
            return childAt.getMeasuredWidth();
        }
        return 0;
    }

    protected final int n() {
        return this.al.getMeasuredHeight();
    }

    protected final int o() {
        return this.al.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final czjd czjdVar = (czjd) this.av;
        czjdVar.x = new cynb() { // from class: cziq
            @Override // defpackage.cynb
            public final void gl() {
                czjd czjdVar2 = czjd.this;
                czjdVar2.f();
                czjdVar2.d();
                czjdVar2.g();
            }
        };
        ((Optional) czjdVar.f.b()).ifPresent(new Consumer() { // from class: czir
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).h(czjd.this.x);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.O.b()).ifPresent(new Consumer() { // from class: czkm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).h(ConversationMessageView.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        if (this.av.l(view) && (onClickListener = this.aA) != null) {
            onClickListener.onClick(view);
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof MessagePartData) {
            i((MessagePartCoreData) tag, this.A.g(view), false);
        } else {
            callOnClick();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        final czjd czjdVar = (czjd) this.av;
        ((Optional) czjdVar.f.b()).ifPresent(new Consumer() { // from class: czil
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).k(czjd.this.x);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.O.b()).ifPresent(new Consumer() { // from class: czjv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).k(ConversationMessageView.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        if (this.ax) {
            if (this.e.az()) {
                this.e.w().g(new Consumer() { // from class: czjo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ConversationMessageView conversationMessageView = ConversationMessageView.this;
                        cpev cpevVar = (cpev) conversationMessageView.ab.b();
                        String f = ((bdhg) obj).f();
                        fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                        int c2 = conversationMessageView.e.c();
                        conversationMessageView.e.ap();
                        cpevVar.j(f, a2, c2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.e.aJ()) {
                this.e.C().ifPresent(new Consumer() { // from class: czjp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ConversationMessageView conversationMessageView = ConversationMessageView.this;
                        cpev cpevVar = (cpev) conversationMessageView.ab.b();
                        fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                        int c2 = conversationMessageView.e.c();
                        conversationMessageView.e.ap();
                        cpevVar.m((String) obj, a2, c2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (!this.e.u().c()) {
                    this.e.C().ifPresent(new Consumer() { // from class: czjq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ConversationMessageView conversationMessageView = ConversationMessageView.this;
                            cpev cpevVar = (cpev) conversationMessageView.ab.b();
                            fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                            int c2 = conversationMessageView.e.c();
                            conversationMessageView.e.ap();
                            cpevVar.n((String) obj, a2, c2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            if (this.e.aU()) {
                int c2 = this.e.c();
                if (c2 == 0) {
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                } else if (c2 == 1) {
                    str = this.e.ap() ? "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment" : "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text";
                } else if (c2 == 3) {
                    str = this.e.ap() ? "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment" : "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text";
                } else if (c2 != 4) {
                    if (c2 != 7) {
                        csix.c("Unknown protocol " + this.e.c());
                    }
                    this.e.C().ifPresent(new Consumer() { // from class: czjr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ConversationMessageView conversationMessageView = ConversationMessageView.this;
                            cpev cpevVar = (cpev) conversationMessageView.ab.b();
                            fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                            int c3 = conversationMessageView.e.c();
                            conversationMessageView.e.ap();
                            cpevVar.l((String) obj, a2, c3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Cloud.Sync";
                }
                this.z.p(str, this.e.u().b());
                this.e.C().ifPresent(new Consumer() { // from class: czjr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ConversationMessageView conversationMessageView = ConversationMessageView.this;
                        cpev cpevVar = (cpev) conversationMessageView.ab.b();
                        fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                        int c3 = conversationMessageView.e.c();
                        conversationMessageView.e.ap();
                        cpevVar.l((String) obj, a2, c3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (bdjs.o(this.e.f())) {
                this.e.C().ifPresent(new Consumer() { // from class: czjt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ConversationMessageView conversationMessageView = ConversationMessageView.this;
                        cpev cpevVar = (cpev) conversationMessageView.ab.b();
                        fgmh a2 = ((alry) conversationMessageView.ag.b()).a(conversationMessageView.e);
                        int c3 = conversationMessageView.e.c();
                        conversationMessageView.e.ap();
                        cpevVar.k((String) obj, a2, c3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.e.f() == 1 && this.ay != 1) {
                alrr alrrVar = (alrr) this.af.b();
                MessageIdType u = this.e.u();
                u.getClass();
                axnw.h(alrrVar.a(u, 30));
            } else if (this.e.f() == 2 && this.ay != 2) {
                alrr alrrVar2 = (alrr) this.af.b();
                MessageIdType u2 = this.e.u();
                u2.getClass();
                axnw.h(alrrVar2.a(u2, 31));
            }
            this.ay = this.e.f();
            this.ax = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [fazb, java.lang.Object] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Optional optional = (Optional) this.S.a.b();
        optional.getClass();
        this.y = new czhj(optional, this);
        this.e = this.I.a();
        ContactIconView contactIconView = (ContactIconView) findViewById(R.id.contact_icon);
        this.al = contactIconView;
        contactIconView.setOnLongClickListener(new View.OnLongClickListener() { // from class: czji
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ConversationMessageView.this.performLongClick();
                return true;
            }
        });
        this.al.p = eorw.BIZINFO_SOURCE_CONVERSATION_AVATAR;
        this.g = (ConversationMessageBubbleView) findViewById(R.id.message_content);
        this.ak = new crly(this.g, R.id.message_attachments_view_stub, R.id.message_attachments, new crlx() { // from class: czjj
            @Override // defpackage.crlx
            public final void a(Object obj) {
                MessageAttachmentsView messageAttachmentsView = (MessageAttachmentsView) obj;
                ConversationMessageView conversationMessageView = ConversationMessageView.this;
                messageAttachmentsView.c(conversationMessageView.e);
                messageAttachmentsView.b = conversationMessageView;
                MessageAttachmentContainer messageAttachmentContainer = messageAttachmentsView.c;
                messageAttachmentContainer.b = conversationMessageView;
                for (int i = 0; i < messageAttachmentContainer.getChildCount(); i++) {
                    csix.k(messageAttachmentContainer.getChildAt(i) instanceof ViewGroup);
                    ViewGroup viewGroup = (ViewGroup) messageAttachmentContainer.getChildAt(i);
                    if (viewGroup.getChildAt(0) instanceof crij) {
                        ((crij) viewGroup.getChildAt(0)).b(conversationMessageView);
                    }
                }
                ConversationMessageTransferView conversationMessageTransferView = messageAttachmentsView.d;
                conversationMessageTransferView.b = conversationMessageView;
                conversationMessageTransferView.a(messageAttachmentsView.a);
            }
        });
        this.ai = new czlu(this.ak, this);
        this.ao = (ViewGroup) findViewById(R.id.message_text_and_info);
        this.i = (TextView) findViewById(R.id.message_sender_name);
        czia cziaVar = (czia) this.ac.b();
        cziaVar.a = (ConversationMessageMetadataView) findViewById(R.id.message_metadata);
        ConversationMessageMetadataView conversationMessageMetadataView = cziaVar.a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.setVisibility(0);
        this.h = (TextView) findViewById(R.id.message_separator);
        this.am = new crly(this, R.id.message_badges, R.id.message_badges_inflated, new crlx() { // from class: czjk
            @Override // defpackage.crlx
            public final void a(Object obj) {
                tvn H = ((BadgesRecyclerView) obj).H();
                final ConversationMessageView conversationMessageView = ConversationMessageView.this;
                Stream flatMap = Collection.EL.stream(conversationMessageView.T).flatMap(new Function() { // from class: czkn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Collection.EL.stream(((tuy) obj2).a(ConversationMessageView.this.e));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                H.a((engw) flatMap.collect(endq.a), conversationMessageView.y.a);
            }
        });
        this.j = new crly(this, R.id.suggestion_shortcut, R.id.suggestion_shortcut_inflated, new crlx() { // from class: czjl
            @Override // defpackage.crlx
            public final void a(Object obj) {
                ConversationMessageView conversationMessageView = ConversationMessageView.this;
                SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) obj;
                engw engwVar = conversationMessageView.w;
                if (engwVar == null || engwVar.isEmpty()) {
                    return;
                }
                suggestionShortcutView.H().a(conversationMessageView.w, conversationMessageView.t, conversationMessageView.e.u());
            }
        });
        this.aq = this.D.c();
        this.ap = new crly(this.g, R.id.message_link_preview_view_stub, R.id.message_link_preview_view, new crlx() { // from class: czjm
            @Override // defpackage.crlx
            public final void a(Object obj) {
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) obj;
                ConversationMessageView conversationMessageView = ConversationMessageView.this;
                conversationMessageLinkPreviewView.p = conversationMessageView;
                conversationMessageLinkPreviewView.q = conversationMessageView.g;
            }
        });
        this.an = new crly(this, R.id.reply_snippet, R.id.reply_snippet_bubble_inflated);
        czje czjeVar = this.E;
        ffbr ffbrVar = czjeVar.a;
        ViewGroup viewGroup = this.ao;
        crly crlyVar = this.ap;
        crly crlyVar2 = this.an;
        bcse bcseVar = this.e;
        Context context = (Context) ffbrVar.b();
        context.getClass();
        Optional optional2 = (Optional) czjeVar.b.b();
        optional2.getClass();
        cstx cstxVar = (cstx) czjeVar.c.b();
        cstxVar.getClass();
        Optional optional3 = (Optional) czjeVar.d.b();
        optional3.getClass();
        cuye cuyeVar = (cuye) czjeVar.e.b();
        cuyeVar.getClass();
        ddxs ddxsVar = (ddxs) czjeVar.f.b();
        ddxsVar.getClass();
        azzw azzwVar = (azzw) czjeVar.g.b();
        azzwVar.getClass();
        errl errlVar = (errl) czjeVar.h.b();
        errlVar.getClass();
        cxqh cxqhVar = (cxqh) czjeVar.i.b();
        cxqhVar.getClass();
        vyw vywVar = (vyw) czjeVar.j.b();
        vywVar.getClass();
        altk altkVar = (altk) czjeVar.k.b();
        altkVar.getClass();
        cpdg cpdgVar = (cpdg) czjeVar.l.b();
        cpdgVar.getClass();
        bzqa bzqaVar = (bzqa) czjeVar.m.b();
        bzqaVar.getClass();
        ?? b2 = czjeVar.n.b();
        b2.getClass();
        ffbr ffbrVar2 = czjeVar.o;
        ((ahor) czjeVar.p.b()).getClass();
        ffbr ffbrVar3 = czjeVar.q;
        ffbr ffbrVar4 = czjeVar.r;
        ffbr ffbrVar5 = czjeVar.s;
        Optional optional4 = (Optional) czjeVar.t.b();
        optional4.getClass();
        cqoh cqohVar = (cqoh) czjeVar.u.b();
        cqohVar.getClass();
        Optional optional5 = (Optional) czjeVar.v.b();
        optional5.getClass();
        viewGroup.getClass();
        crlyVar.getClass();
        bcseVar.getClass();
        czjd czjdVar = new czjd(context, optional2, cstxVar, optional3, cuyeVar, ddxsVar, azzwVar, errlVar, cxqhVar, vywVar, altkVar, cpdgVar, bzqaVar, b2, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, optional4, cqohVar, optional5, this, viewGroup, crlyVar, crlyVar2, bcseVar);
        this.m = czjdVar;
        this.av = czjdVar;
        if (ddjr.a()) {
            this.N.isPresent();
            Object obj = this.N.get();
            boolean z = this.e.aq() && this.e.j < this.K.f().toEpochMilli();
            crly crlyVar3 = new crly(this, R.id.reminder_icon, R.id.reminder_icon_inflated, R.layout.reminder_icon_view);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) crlyVar3.b();
            String a2 = ((ddko) obj).a(z);
            lottieAnimationView.g(a2);
            ensk e = ddko.a.e();
            e.Y(ente.a, "ReminderAnimation");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/reminder/animation/ReminderAnimatedViewPresenterImpl", "setupAnimatedReminderView", 42, "ReminderAnimatedViewPresenterImpl.java")).t("Setting up animation view %s", a2);
            this.f = crlyVar3;
        } else {
            this.f = new crly(this, R.id.reminder_icon, R.id.reminder_icon_inflated);
        }
        this.n = new crly(this, R.id.change_category_view_stub, R.id.change_category_view);
        K();
        this.k = new crly(this, R.id.reply_button, R.id.reply_button_inflated);
        this.l = ((Optional) this.Q.b()).map(new Function() { // from class: czjn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                crly crlyVar4 = ConversationMessageView.this.k;
                crlyVar4.getClass();
                elew elewVar = (elew) ((ajtw) obj2).a.b();
                elewVar.getClass();
                return new ajua(elewVar, crlyVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        crly crlyVar4 = this.k;
        crlyVar4.getClass();
        if (crlyVar4.i()) {
            crlyVar4.getClass();
            ((ComposeView) crlyVar4.b()).setVisibility(8);
        }
        if (((Boolean) ((cfup) shw.a.get()).e()).booleanValue()) {
            ddzb.i(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e.aI()) {
            enru enruVar = crnx.a;
            if (crnx.j(getContext()) && motionEvent.getAction() == 0) {
                float abs = Math.abs((getMeasuredWidth() / 2) - motionEvent.getX());
                int min = Math.min(getBottom(), ((View) getParent()).getHeight()) - Math.max(getTop(), 0);
                float abs2 = Math.abs(((min / 2) + (r1 - getTop())) - motionEvent.getY());
                if (abs <= 1.0f && abs2 <= 1.0f) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int dimensionPixelSize;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        final boolean z2;
        final int i42;
        final int i43;
        int i44;
        final int i45;
        int i46;
        int i47;
        int i48;
        int p;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int dimensionPixelSize2;
        int i64;
        int i65;
        int i66;
        int i67;
        czko czkoVar = this.R;
        int measuredWidth = this.g.getMeasuredWidth();
        int l = l();
        int o = o();
        int n = n();
        int measuredWidth2 = this.h.getMeasuredWidth();
        int u = u();
        int measuredWidth3 = this.f.i() ? ((ImageView) this.f.b()).getMeasuredWidth() : 0;
        int measuredHeight = this.f.i() ? ((ImageView) this.f.b()).getMeasuredHeight() : 0;
        ConversationMessageMetadataView conversationMessageMetadataView = ((czia) this.ac.b()).a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        int measuredWidth4 = conversationMessageMetadataView.getMeasuredWidth();
        int s = s();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i68 = this.r;
        crly crlyVar = this.k;
        if (crlyVar == null || !crlyVar.i()) {
            i5 = measuredWidth;
            i6 = 0;
        } else {
            i6 = ((ComposeView) crlyVar.b()).getMeasuredWidth();
            i5 = measuredWidth;
        }
        crly crlyVar2 = this.k;
        int measuredHeight2 = (crlyVar2 == null || !crlyVar2.i()) ? 0 : ((ComposeView) crlyVar2.b()).getMeasuredHeight();
        final int i69 = i3 - i;
        int t = t();
        int paddingTop = getPaddingTop();
        Resources resources = getResources();
        czkoVar.a.isPresent();
        czkoVar.a.get();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_message);
        czkoVar.a.isPresent();
        czkoVar.a.get();
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_bottom);
        if (r() == 0) {
            int i70 = i69 / 2;
            int i71 = measuredWidth2 / 2;
            i8 = u + paddingTop;
            int i72 = i70 + i71;
            i10 = i70 - i71;
            i7 = dimensionPixelSize4;
            i9 = i72;
        } else {
            i7 = dimensionPixelSize4;
            i8 = paddingTop;
            i9 = 0;
            i10 = 0;
        }
        int i73 = measuredWidth3;
        int i74 = i8 + l;
        int i75 = i6;
        int i76 = i74 - i7;
        int i77 = i76 - measuredHeight;
        if (F()) {
            if (C() || this.s) {
                if (!this.s) {
                    paddingStart = paddingStart + o + i68;
                }
                i48 = paddingStart + i5;
                p = E() ? p() + paddingStart + dimensionPixelSize3 : i48 + dimensionPixelSize3;
                i49 = p + i73;
                i50 = paddingStart;
                i51 = 0;
                paddingStart = 0;
                i52 = 0;
                i53 = 0;
            } else {
                i52 = paddingStart + o;
                i50 = i68 + i52;
                i48 = i50 + i5;
                i51 = i74 - n;
                if (i51 < i8) {
                    i53 = i8 + n;
                    i51 = i8;
                } else {
                    i53 = i74;
                }
                p = E() ? i50 + p() + dimensionPixelSize3 : i48 + dimensionPixelSize3;
                i49 = p + i73;
            }
            if (C() || j() == 0) {
                i54 = i51;
                i55 = s;
                i56 = paddingStart;
                i57 = i52;
                i58 = 0;
                i59 = 0;
                i60 = 0;
                i61 = 0;
            } else {
                i54 = i51;
                vx vxVar = ((RecyclerView) this.am.b()).o;
                vxVar.getClass();
                i55 = s;
                int q = q();
                i56 = paddingStart;
                i57 = i52;
                int i78 = 0;
                int i79 = 0;
                while (i78 < vxVar.at()) {
                    View aH = vxVar.aH(i78);
                    aH.getClass();
                    int bt = i79 + vx.bt(aH);
                    if (bt > q) {
                        break;
                    }
                    i78++;
                    i79 = bt;
                }
                if (i79 == 0) {
                    if (k() != 0) {
                        i59 = i50;
                        i58 = k() + i59;
                        i60 = i74 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                        i61 = j() + i60;
                    } else {
                        i79 = 0;
                    }
                }
                i59 = (q + i50) - i79;
                i58 = k() + i59;
                i60 = i74 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                i61 = j() + i60;
            }
            int i80 = i50 + measuredWidth4;
            int i81 = i61 != 0 ? i61 : i74;
            int i82 = i81 + i55;
            int q2 = q();
            int a2 = czko.a(this, i8, i74, measuredHeight2, t);
            int i83 = measuredHeight2 + a2;
            if (E()) {
                int m = i50 + m();
                i62 = i83;
                i63 = R.dimen.reply_button_horizontal_margin;
                dimensionPixelSize2 = m + resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i62 = i83;
                i63 = R.dimen.reply_button_horizontal_margin;
                dimensionPixelSize2 = i50 + q2 + resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            int i84 = dimensionPixelSize2 + i75;
            if (v() != 0) {
                i66 = i50 + q2 + resources.getDimensionPixelSize(i63);
                i64 = i66 + w();
                i65 = i74 - v();
                i67 = i74;
            } else {
                i64 = 0;
                i65 = 0;
                i66 = 0;
                i67 = 0;
            }
            int i85 = i53;
            i41 = i65;
            i26 = p;
            i36 = i58;
            i39 = i85;
            i23 = i48;
            i18 = i84;
            i27 = i82;
            i28 = i81;
            i33 = i66;
            i29 = dimensionPixelSize2;
            i34 = i67;
            i32 = i64;
            i37 = i59;
            i20 = i60;
            i22 = i50;
            i38 = i22;
            i25 = i49;
            i31 = i56;
            i40 = i54;
            i35 = i62;
            i19 = a2;
            i30 = i57;
            i24 = i80;
            i21 = i61;
        } else {
            int i86 = i69 - paddingEnd;
            int i87 = i86 - i5;
            if (j() != 0) {
                int k = i86 - k();
                int dimensionPixelSize5 = i74 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                i14 = j() + dimensionPixelSize5;
                i13 = dimensionPixelSize5;
                i12 = k;
                i11 = i86;
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            int i88 = i86 - measuredWidth4;
            int i89 = i14 != 0 ? i14 : i74;
            int i90 = i89 + s;
            if (E()) {
                int p2 = ((i86 - p()) - i73) - dimensionPixelSize3;
                i16 = (i86 - p()) - dimensionPixelSize3;
                i15 = p2;
            } else {
                i15 = (i87 - i73) - dimensionPixelSize3;
                i16 = i87 - dimensionPixelSize3;
            }
            int a3 = czko.a(this, i8, i74, measuredHeight2, t);
            int i91 = measuredHeight2 + a3;
            if (E()) {
                i17 = i91;
                dimensionPixelSize = (i86 - m()) - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i17 = i91;
                dimensionPixelSize = i87 - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            int i92 = dimensionPixelSize - i75;
            if (v() != 0) {
                int i93 = dimensionPixelSize;
                int m2 = (E() ? i86 - m() : i87) - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
                i18 = i93;
                i19 = a3;
                i34 = i74;
                i20 = i13;
                i21 = i14;
                i23 = i86;
                i24 = i23;
                i25 = i16;
                i27 = i90;
                i28 = i89;
                i33 = m2 - w();
                i29 = i92;
                i30 = 0;
                i35 = i17;
                i32 = m2;
                i37 = i12;
                i22 = i87;
                i38 = i88;
                i40 = 0;
                i31 = 0;
                i41 = i74 - v();
                i26 = i15;
                i36 = i11;
                i39 = 0;
            } else {
                i18 = dimensionPixelSize;
                i19 = a3;
                i20 = i13;
                i21 = i14;
                i22 = i87;
                i23 = i86;
                i24 = i23;
                i25 = i16;
                i26 = i15;
                i27 = i90;
                i28 = i89;
                i29 = i92;
                i30 = 0;
                i31 = 0;
                i32 = 0;
                i33 = 0;
                i34 = 0;
                i35 = i17;
                i36 = i11;
                i37 = i12;
                i38 = i88;
                i39 = 0;
                i40 = 0;
                i41 = 0;
            }
        }
        Rect rect = new Rect(i10, paddingTop, i9, i8);
        Rect rect2 = new Rect(i31, i40, i30, i39);
        Rect rect3 = new Rect(i22, i8, i23, i74);
        Rect rect4 = new Rect(i26, i77, i25, i76);
        Rect rect5 = new Rect(i38, i28, i24, i27);
        Rect rect6 = new Rect(i37, i20, i36, i21);
        final Rect rect7 = new Rect(i29, i19, i18, i35);
        Rect rect8 = new Rect(i33, i41, i32, i34);
        if (!this.s) {
            ContactIconView contactIconView = this.al;
            int i94 = 8;
            if (rect2.top != rect2.bottom && rect2.left != rect2.right) {
                i94 = 0;
            }
            contactIconView.setVisibility(i94);
        }
        int i95 = rect.left;
        int i96 = rect.right;
        int i97 = rect.top;
        int i98 = rect.bottom;
        int i99 = rect2.left;
        int i100 = rect2.right;
        int i101 = rect2.top;
        int i102 = rect2.bottom;
        int i103 = rect3.left;
        int i104 = i69 - i103;
        int i105 = rect3.right;
        int i106 = i69 - i105;
        int i107 = rect3.top;
        int i108 = rect3.bottom;
        int i109 = rect5.left;
        int i110 = rect5.right;
        int i111 = rect5.top;
        int i112 = rect5.bottom;
        int i113 = rect6.left;
        int i114 = rect6.right;
        int i115 = rect6.top;
        int i116 = rect6.bottom;
        int i117 = rect8.left;
        int i118 = rect8.right;
        int i119 = rect8.top;
        int i120 = rect8.bottom;
        boolean z3 = getLayoutDirection() == 1;
        if (z3) {
            if (!this.s) {
                this.al.layout(i69 - i100, i101, i69 - i99, i102);
            }
            this.g.layout(i106, i107, i104, i108);
            ((czia) this.ac.b()).a(i69 - i110, i111, i69 - i109, i112);
        } else {
            if (!this.s) {
                this.al.layout(i99, i101, i100, i102);
            }
            this.g.layout(i103, i107, i105, i108);
            ((czia) this.ac.b()).a(i109, i111, i110, i112);
        }
        BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) this.am.b();
        badgesRecyclerView.setClipToOutline(true);
        badgesRecyclerView.H().a.setOnTouchListener(new View.OnTouchListener() { // from class: tvh
            /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
            
                if (r5 != 3) goto L12;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                /*
                    r3 = this;
                    int r5 = r5.getAction()
                    r0 = 0
                    r1 = 1
                    if (r5 == 0) goto L19
                    if (r5 == r1) goto L11
                    r2 = 2
                    if (r5 == r2) goto L19
                    r1 = 3
                    if (r5 == r1) goto L11
                    goto L20
                L11:
                    android.view.ViewParent r4 = r4.getParent()
                    r4.requestDisallowInterceptTouchEvent(r0)
                    goto L20
                L19:
                    android.view.ViewParent r4 = r4.getParent()
                    r4.requestDisallowInterceptTouchEvent(r1)
                L20:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tvh.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        int max = Math.max(getPaddingStart(), i113);
        int min = Math.min(i69 - getPaddingEnd(), i114);
        if (z3) {
            int i121 = min - max;
            int i122 = i69 - max;
            int i123 = i122 - i121;
            min = i122;
            max = i123;
        }
        badgesRecyclerView.layout(max, i115, min, i116);
        if (((Boolean) ((cfup) czur.a.get()).e()).booleanValue() && this.j.i()) {
            SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) this.j.b();
            if (z3) {
                i47 = i69 - i117;
                i46 = i47 - (i118 - i117);
            } else {
                i46 = i117;
                i47 = i118;
            }
            suggestionShortcutView.layout(i46, i119, i47, i120);
        }
        final int i124 = rect4.left;
        final int i125 = rect4.right;
        final int i126 = rect4.top;
        final int i127 = rect4.bottom;
        this.N.isPresent();
        Resources resources2 = getResources();
        this.N.get();
        int dimensionPixelSize6 = resources2.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_message);
        if (E() && H()) {
            int measuredWidth5 = this.g.d.getMeasuredWidth();
            int abs = Math.abs(i125 - i124);
            if (z3) {
                int abs2 = Math.abs(i106 - i104);
                if (F()) {
                    i43 = (i106 + (abs2 - measuredWidth5)) - dimensionPixelSize6;
                    i45 = i43 - abs;
                } else {
                    i44 = i106 + measuredWidth5 + dimensionPixelSize6;
                    i43 = i44 + abs;
                    i45 = i44;
                }
            } else if (F()) {
                i44 = measuredWidth5 + i103 + dimensionPixelSize6;
                i43 = i44 + abs;
                i45 = i44;
            } else {
                i43 = (i105 - measuredWidth5) - dimensionPixelSize6;
                i45 = i43 - abs;
            }
            this.f.d(new Consumer() { // from class: czkf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfva cfvaVar = ConversationMessageView.a;
                    ((ImageView) obj).layout(i45, i126, i43, i127);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            z2 = z3;
            i42 = i69;
        } else {
            crly crlyVar3 = this.f;
            final boolean z4 = z3;
            Consumer consumer = new Consumer() { // from class: czkg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ImageView imageView = (ImageView) obj;
                    cfva cfvaVar = ConversationMessageView.a;
                    int i128 = i69;
                    int i129 = i125;
                    int i130 = i124;
                    boolean z5 = z4;
                    int i131 = z5 ? i128 - i129 : i130;
                    if (z5) {
                        i129 = i128 - i130;
                    }
                    imageView.layout(i131, i126, i129, i127);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            z2 = z4;
            i42 = i69;
            crlyVar3.d(consumer);
        }
        this.h.layout(i95, i97, i96, i98);
        crly crlyVar4 = this.k;
        if (crlyVar4 != null) {
            crlyVar4.d(new Consumer() { // from class: czka
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ComposeView composeView = (ComposeView) obj;
                    cfva cfvaVar = ConversationMessageView.a;
                    int i128 = i42;
                    Rect rect9 = rect7;
                    boolean z5 = z2;
                    composeView.layout(z5 ? i128 - rect9.right : rect9.left, rect9.top, z5 ? i128 - rect9.left : rect9.right, rect9.bottom);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }
        if (((Boolean) d.e()).booleanValue()) {
            ((ensz) ((ensz) aj.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onLayout", 804, "ConversationMessageView.java")).L("ConversationMessageView{%s}.onLayout: contentStart=%s, contentEnd=%s, contentTop=%s, contentBottom=%s", this.e.u(), Integer.valueOf(i103), Integer.valueOf(i105), Integer.valueOf(i107), Integer.valueOf(i108));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.av.l(view)) {
            View.OnLongClickListener onLongClickListener = this.aB;
            return onLongClickListener != null ? onLongClickListener.onLongClick(view) : performLongClick();
        }
        Object tag = view.getTag();
        if (tag instanceof MessagePartData) {
            return i((MessagePartCoreData) tag, this.A.g(view), true);
        }
        if (((Boolean) a.e()).booleanValue()) {
            return performLongClick();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        czko czkoVar = this.R;
        int size = View.MeasureSpec.getSize(i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_message_contact_icon_size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        czkoVar.a.isPresent();
        czkoVar.a.get();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.reminder_icon_size), 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        y(makeMeasureSpec2, makeMeasureSpec2);
        if (this.e.aq()) {
            z(makeMeasureSpec3, makeMeasureSpec3);
        } else {
            z(makeMeasureSpec4, makeMeasureSpec4);
        }
        boolean z = this.s;
        int min = Math.min((((size - ((int) (o() * (true != z ? 2.0f : 0.75f)))) - (z ? 0 : getResources().getDimensionPixelSize(R.dimen.message_margin_default))) - getPaddingStart()) - getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.message_bubble_max_width));
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        this.g.measure(makeMeasureSpec5, makeMeasureSpec);
        this.h.measure(makeMeasureSpec, makeMeasureSpec);
        ConversationMessageMetadataView conversationMessageMetadataView = ((czia) this.ac.b()).a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.measure(makeMeasureSpec5, makeMeasureSpec);
        if (this.am.i()) {
            ((BadgesRecyclerView) this.am.b()).measure(makeMeasureSpec, makeMeasureSpec);
        }
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.suggestion_shortcut_size), 1073741824);
        if (this.j.i()) {
            ((SuggestionShortcutView) this.j.b()).measure(makeMeasureSpec6, makeMeasureSpec6);
        }
        crly crlyVar = this.k;
        if (crlyVar != null && crlyVar.i()) {
            ((ComposeView) crlyVar.b()).measure(makeMeasureSpec, makeMeasureSpec);
        }
        bcse bcseVar = this.e;
        if (bcseVar != null && bcseVar.x != null) {
            if (bcseVar.ap()) {
                A(View.MeasureSpec.makeMeasureSpec(m(), 1073741824), makeMeasureSpec);
            } else {
                crly crlyVar2 = this.an;
                int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.max((crlyVar2 == null || !crlyVar2.i()) ? 0 : ((ComposeView) crlyVar2.b()).getMeasuredWidth(), q()), min), 1073741824);
                ConversationMessageBubbleView conversationMessageBubbleView = this.g;
                if (conversationMessageBubbleView != null && (viewGroup = conversationMessageBubbleView.d) != null) {
                    viewGroup.measure(makeMeasureSpec7, makeMeasureSpec);
                }
                A(makeMeasureSpec7, makeMeasureSpec);
            }
        }
        crly crlyVar3 = this.ak;
        if (crlyVar3 != null && crlyVar3.i()) {
            int paddingStart = (min - ((MessageAttachmentsView) crlyVar3.b()).getPaddingStart()) - ((MessageAttachmentsView) this.ak.b()).getPaddingEnd();
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(paddingStart, 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.audio_attachment_view_playback_height), 1073741824));
            }
        }
        int paddingTop = getPaddingTop() + Math.max(n(), l() + s() + j()) + (r() == 0 ? u() : 0) + getPaddingBottom();
        setMeasuredDimension(size, paddingTop);
        if (((Boolean) d.e()).booleanValue()) {
            ((ensz) ((ensz) aj.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onMeasure", 417, "ConversationMessageView.java")).J("ConversationMessageView{%s}.onMeasure: %s x %s", this.e.u(), Integer.valueOf(size), Integer.valueOf(paddingTop));
        }
    }

    protected final int p() {
        if (!E()) {
            return 0;
        }
        return ((MessageAttachmentsView) this.ak.b()).c.getChildAt(r0.getChildCount() - 1).getMeasuredWidth();
    }

    protected final int q() {
        int measuredWidth = this.g.d.getMeasuredWidth();
        return ((measuredWidth == 0 || this.g.d.getVisibility() != 0) && E()) ? ((MessageAttachmentsView) this.ak.b()).c.getMeasuredWidth() : measuredWidth;
    }

    protected final int r() {
        return this.h.getVisibility();
    }

    protected final int s() {
        ConversationMessageMetadataView conversationMessageMetadataView = ((czia) this.ac.b()).a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        if (conversationMessageMetadataView.j != null) {
            return conversationMessageMetadataView.getMeasuredHeight();
        }
        if (!((Boolean) ConversationMessageMetadataView.a.e()).booleanValue()) {
            return conversationMessageMetadataView.getLayoutParams().height;
        }
        if (conversationMessageMetadataView.k) {
            return conversationMessageMetadataView.getMeasuredHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.aA = onClickListener;
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.aB = onLongClickListener;
    }

    public final int t() {
        if (this.i.isShown()) {
            return this.i.getMeasuredHeight();
        }
        return 0;
    }

    protected final int u() {
        return this.h.getMeasuredHeight();
    }

    protected final int v() {
        if (this.j.i()) {
            return ((SuggestionShortcutView) this.j.b()).getMeasuredHeight();
        }
        return 0;
    }

    protected final int w() {
        if (this.j.i()) {
            return ((SuggestionShortcutView) this.j.b()).getMeasuredWidth();
        }
        return 0;
    }

    protected final void y(int i, int i2) {
        this.al.measure(i, i2);
    }

    protected final void z(int i, int i2) {
        if (this.f.i()) {
            ((ImageView) this.f.b()).measure(i, i2);
        }
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
