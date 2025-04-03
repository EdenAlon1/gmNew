package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtc extends cxvz implements cxtb {
    public final ffbr b;
    public final cxvv c;

    /* JADX WARN: Type inference failed for: r33v0, types: [fazb, java.lang.Object] */
    public cxtc(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        cxvw cxvwVar = (cxvw) ffbrVar2.b();
        ComposeMessageView composeMessageView = (ComposeMessageView) cxvwVar.a.b();
        composeMessageView.getClass();
        ffbr ffbrVar3 = cxvwVar.b;
        ffbr ffbrVar4 = cxvwVar.c;
        ffbr ffbrVar5 = cxvwVar.d;
        ffbr ffbrVar6 = cxvwVar.e;
        ffbr ffbrVar7 = cxvwVar.f;
        ffbr ffbrVar8 = cxvwVar.g;
        ffbr ffbrVar9 = cxvwVar.h;
        ffbr ffbrVar10 = cxvwVar.i;
        ffbr ffbrVar11 = cxvwVar.j;
        ffbr ffbrVar12 = cxvwVar.k;
        ffbr ffbrVar13 = cxvwVar.l;
        ffbr ffbrVar14 = cxvwVar.m;
        ffbr ffbrVar15 = cxvwVar.n;
        ffbr ffbrVar16 = cxvwVar.o;
        ffbr ffbrVar17 = cxvwVar.p;
        ffbr ffbrVar18 = cxvwVar.q;
        ffbr ffbrVar19 = cxvwVar.r;
        ffbr ffbrVar20 = cxvwVar.s;
        ffbr ffbrVar21 = cxvwVar.t;
        ffbr ffbrVar22 = cxvwVar.u;
        ffbr ffbrVar23 = cxvwVar.v;
        ffbr ffbrVar24 = cxvwVar.w;
        ffbr ffbrVar25 = cxvwVar.x;
        ffbr ffbrVar26 = cxvwVar.y;
        ffbr ffbrVar27 = cxvwVar.z;
        ffbr ffbrVar28 = cxvwVar.A;
        ffbr ffbrVar29 = cxvwVar.B;
        Context context = (Context) cxvwVar.C.b();
        context.getClass();
        ffbr ffbrVar30 = cxvwVar.D;
        ?? b = cxvwVar.E.b();
        b.getClass();
        ffbr ffbrVar31 = cxvwVar.F;
        ffbr ffbrVar32 = cxvwVar.G;
        ffbr ffbrVar33 = cxvwVar.H;
        ffbr ffbrVar34 = cxvwVar.I;
        ffbr ffbrVar35 = cxvwVar.J;
        ffbr ffbrVar36 = cxvwVar.K;
        ffbr ffbrVar37 = cxvwVar.L;
        ffbr ffbrVar38 = cxvwVar.M;
        ffbr ffbrVar39 = cxvwVar.N;
        ffbr ffbrVar40 = cxvwVar.O;
        ffbr ffbrVar41 = cxvwVar.P;
        azbq azbqVar = (azbq) cxvwVar.Q.b();
        azbqVar.getClass();
        final cxvv cxvvVar = new cxvv(composeMessageView, ffbrVar3, ffbrVar4, ffbrVar5, ffbrVar6, ffbrVar7, ffbrVar8, ffbrVar9, ffbrVar10, ffbrVar11, ffbrVar12, ffbrVar13, ffbrVar14, ffbrVar15, ffbrVar16, ffbrVar17, ffbrVar18, ffbrVar19, ffbrVar20, ffbrVar21, ffbrVar22, ffbrVar23, ffbrVar24, ffbrVar25, ffbrVar26, ffbrVar27, ffbrVar28, ffbrVar29, context, ffbrVar30, b, ffbrVar31, ffbrVar32, ffbrVar33, ffbrVar34, ffbrVar35, ffbrVar36, ffbrVar37, ffbrVar38, ffbrVar39, ffbrVar40, ffbrVar41, azbqVar, cxvwVar.R, cxvwVar.S, cxvwVar.T, cxvwVar.U);
        this.c = cxvvVar;
        if (cxvvVar.an.isInEditMode()) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) cxvvVar.an.findViewById(R.id.compose_message_container);
        linearLayout.removeView(cxvvVar.an.findViewById(R.id.send_message_button_container));
        LayoutInflater.from(cxvvVar.k).inflate(R.layout.send_button, (ViewGroup) linearLayout, true);
        cxsz cxszVar = (cxsz) cxvvVar.O.b();
        cxtc j = cxvvVar.j();
        dede dedeVar = (dede) cxszVar.a.b();
        dedeVar.getClass();
        cxsw cxswVar = (cxsw) cxszVar.b.b();
        cxswVar.getClass();
        cqoh cqohVar = (cqoh) cxszVar.c.b();
        cqohVar.getClass();
        cxxv cxxvVar = (cxxv) cxszVar.d.b();
        cxxvVar.getClass();
        cfyt cfytVar = (cfyt) cxszVar.e.b();
        cfytVar.getClass();
        Optional optional = (Optional) cxszVar.f.b();
        optional.getClass();
        cxvvVar.l = new cxsy(dedeVar, cxswVar, cqohVar, cxxvVar, cfytVar, j, optional, cxszVar.g);
        cxvvVar.m = (PlainTextEditText) cxvvVar.an.findViewById(R.id.compose_message_text);
        cxvvVar.K();
        cxvvVar.m.setMaxLines(1);
        cxvvVar.m.setEllipsize(TextUtils.TruncateAt.END);
        if (!cxvvVar.ad()) {
            cxvvVar.m.setShowSoftInputOnFocus(false);
        }
        if (!cxvvVar.ad()) {
            cxvvVar.m.setOnEditorActionListener(new elbm((elbx) cxvvVar.Y.b(), cxvvVar.j(), "ComposeMessageViewPeer composeEditText onEditorAction"));
        }
        cxvvVar.m.addTextChangedListener(new elbq((elbx) cxvvVar.Y.b(), cxvvVar.j(), "ComposeMessageViewPeer composeEditText textWatcher"));
        if (!cxvvVar.ad()) {
            cxvvVar.m.setOnFocusChangeListener(new elax((elbx) cxvvVar.Y.b(), new View.OnFocusChangeListener() { // from class: cxtk
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    cxvv cxvvVar2 = cxvv.this;
                    PlainTextEditText plainTextEditText = cxvvVar2.m;
                    if (view == plainTextEditText && z) {
                        cxvvVar2.o = plainTextEditText;
                        cylx cylxVar = cxvvVar2.j;
                        if (cylxVar != null) {
                            cylxVar.ah();
                        }
                    }
                }
            }, "ComposeMessageViewPeer composeEditText onFocusChange"));
        }
        cxvvVar.m.setOnClickListener(new elay((elbx) cxvvVar.Y.b(), "ComposeMessageViewPeer composeEditText onClick", new View.OnClickListener() { // from class: cxtl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxvv cxvvVar2 = cxvv.this;
                cxvvVar2.C(false);
                final vvn vvnVar = (vvn) cxvvVar2.j;
                vvnVar.T(null, new Consumer() { // from class: vtc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn.this.bc.b();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                vvnVar.cx.k();
                vvnVar.l();
                cxvvVar2.E();
            }
        }));
        cxvvVar.m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((cpbs) cxvvVar.P.b()).a(-1).f())});
        cxvvVar.o = cxvvVar.m;
        boolean ad = cxvvVar.ad();
        bcpt bcptVar = cxvvVar.x;
        PlainTextEditText plainTextEditText = cxvvVar.m;
        cxvp cxvpVar = new cxvp(cxvvVar, bcptVar, plainTextEditText);
        if (!ad) {
            plainTextEditText.d(cxvpVar, cxtb.sC);
        }
        cxvvVar.n = (PlainTextEditText) cxvvVar.an.findViewById(R.id.compose_subject_text);
        cxvvVar.n.addTextChangedListener(new elbq((elbx) cxvvVar.Y.b(), cxvvVar.j(), "ComposeMessageViewPeer composeSubject textWatcher"));
        cxvvVar.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((cpbs) cxvvVar.P.b()).a(-1).e())});
        if (!cxvvVar.ad()) {
            cxvvVar.n.setOnFocusChangeListener(new elax((elbx) cxvvVar.Y.b(), new View.OnFocusChangeListener() { // from class: cxtm
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    cxvv cxvvVar2 = cxvv.this;
                    PlainTextEditText plainTextEditText2 = cxvvVar2.n;
                    if (view == plainTextEditText2 && z) {
                        cxvvVar2.o = plainTextEditText2;
                        cylx cylxVar = cxvvVar2.j;
                        if (cylxVar != null) {
                            cylxVar.T(new Consumer() { // from class: cxum
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    cskc cskcVar = cxvv.a;
                                    ((ugg) obj).r(ugo.IME, true, false);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, new Consumer() { // from class: cxun
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    czgj czgjVar = (czgj) obj;
                                    cskc cskcVar = cxvv.a;
                                    if (czgjVar != null) {
                                        czgjVar.A(2);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    }
                }
            }, "ComposeMessageViewPeer composeSubjectText onFocusChange"));
        }
        if (!ad) {
            cxvvVar.n.d(cxvpVar, cxtb.sC);
        }
        cxvvVar.v = (ImageButton) cxvvVar.an.findViewById(R.id.delete_subject_button);
        cxvvVar.v.setOnClickListener(new elay((elbx) cxvvVar.Y.b(), "ComposeMessageViewPeer deleteSubjectButton onClick", new View.OnClickListener() { // from class: cxtn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxvv cxvvVar2 = cxvv.this;
                bcvr bcvrVar = (bcvr) cxvvVar2.x.a();
                bcvrVar.R(null);
                bcvrVar.n = false;
                cxvvVar2.n.setText((CharSequence) null);
                cxvvVar2.N(false);
                cxvvVar2.A();
                cxvvVar2.D = false;
            }
        }));
        cxvvVar.u = cxvvVar.an.findViewById(R.id.subject_view);
        int b2 = ehdr.b(cxvvVar.n, R.attr.colorOnSurfaceVariant);
        cxvvVar.n.setHintTextColor(b2);
        cxvvVar.v.getDrawable().setTint(b2);
        cxvvVar.m.setHintTextColor(b2);
        cxvvVar.t = (AsyncImageView) cxvvVar.an.findViewById(R.id.send_message_button_icon);
        cxvvVar.s = cxvvVar.an.findViewById(R.id.send_message_button_container);
        elbv elbvVar = new elbv((elbx) cxvvVar.Y.b(), "Send Message Long Click", new View.OnLongClickListener() { // from class: cxtp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                cskc cskcVar = cxvv.a;
                ellj.g(new ucm(), view);
                return true;
            }
        });
        cxvs cxvsVar = new cxvs(cxvvVar);
        if (cxvvVar.i().r() || cxvvVar.J) {
            cxxt cxxtVar = (cxxt) cxvvVar.V.b();
            ComposeMessageView composeMessageView2 = cxvvVar.an;
            bcpt bcptVar2 = cxvvVar.x;
            cxxp cxxpVar = (cxxp) cxxtVar.a.b();
            cxxpVar.getClass();
            Context context2 = (Context) cxxtVar.b.b();
            context2.getClass();
            Vibrator vibrator = (Vibrator) cxxtVar.c.b();
            vibrator.getClass();
            cuxh cuxhVar = (cuxh) cxxtVar.d.b();
            cuxhVar.getClass();
            ffbr ffbrVar42 = cxxtVar.e;
            ffbr ffbrVar43 = cxxtVar.f;
            composeMessageView2.getClass();
            bcptVar2.getClass();
            cxvvVar.f = new cxxs(cxxpVar, context2, vibrator, cuxhVar, ffbrVar42, ffbrVar43, composeMessageView2, bcptVar2);
            cxvvVar.E = true;
        }
        cxvvVar.e = (AttachmentsContainer) cxvvVar.an.findViewById(R.id.attachments_container);
        final cxnk H = cxvvVar.e.H();
        cxtc j2 = cxvvVar.j();
        H.a = j2;
        ImageView imageView = (ImageView) j2.o(R.id.compress_info_image_view);
        imageView.getClass();
        H.h = imageView;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(H.t).inflate(R.layout.mms_compress_tooltip_content, (ViewGroup) null);
        H.r = new ddym(frameLayout, 1, H.h, 3);
        H.h.getDrawingRect(new Rect());
        H.r.a.setTranslationY(frameLayout.getResources().getDimension(R.dimen.compress_info_tooltip_y_offset));
        H.r.a.i = (int) H.t.getResources().getDimension(R.dimen.tooltip_max_width);
        LinearLayout linearLayout2 = (LinearLayout) j2.o(R.id.compose_message_container);
        linearLayout2.getClass();
        H.i = linearLayout2;
        H.i.addOnLayoutChangeListener(new cxnf(H));
        if (((crjx) H.u.b()).g()) {
            H.h.setColorFilter(H.t.getColor(R.color.white));
        } else {
            H.h.setColorFilter(H.t.getColor(R.color.google_grey600));
        }
        H.h.setOnClickListener(new View.OnClickListener() { // from class: cxmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxnk cxnkVar = cxnk.this;
                if (cxnkVar.r.d()) {
                    return;
                }
                cxnkVar.r.c();
            }
        });
        H.h.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cxmv
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                cxnk cxnkVar = cxnk.this;
                if (cxnkVar.r.d()) {
                    ddym ddymVar = cxnkVar.r;
                    ImageView imageView2 = cxnkVar.h;
                    ddyl ddylVar = ddymVar.a;
                    ddylVar.g = imageView2;
                    ddylVar.d();
                    ddylVar.e();
                }
            }
        });
        cxvvVar.q = (TextView) cxvvVar.an.findViewById(R.id.char_counter);
        cxvvVar.r = (TextView) cxvvVar.an.findViewById(R.id.message_indicator);
        cxvvVar.h = (ConstraintLayout) cxvvVar.an.findViewById(R.id.message_compose_view_container_with_c2o);
        cxvvVar.i = (ViewGroup) cxvvVar.an.findViewById(R.id.compose_message_box_linear_layout);
        ellq ellqVar = (ellq) cxvvVar.ai.b();
        ellq.e(cxvvVar.t, "Send Button");
        ellqVar.b(cxvvVar.t, new ucl());
        cxvvVar.t.setOnLongClickListener(elbvVar);
        cxvvVar.t.setAccessibilityDelegate(cxvsVar);
        if (((asoi) cxvvVar.am.b()).a()) {
            cxvvVar.t.setBackground(null);
        }
        cxss cxssVar = (cxss) cxvvVar.ab.b();
        ComposeMessageView composeMessageView3 = cxvvVar.an;
        Context context3 = (Context) cxssVar.a.b();
        context3.getClass();
        elbx elbxVar = (elbx) cxssVar.b.b();
        elbxVar.getClass();
        Optional optional2 = (Optional) cxssVar.c.b();
        optional2.getClass();
        ffbr ffbrVar44 = cxssVar.d;
        ffbr ffbrVar45 = cxssVar.e;
        composeMessageView3.getClass();
        cxvvVar.g = new cxsr(context3, elbxVar, optional2, ffbrVar44, ffbrVar45, composeMessageView3, cxssVar.f, cxssVar.g);
        if (ctjd.c()) {
            cxvvVar.v();
        }
        cxvvVar.p = ((Optional) cxvvVar.ac.b()).map(new Function() { // from class: cxtq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cxvv cxvvVar2 = cxvv.this;
                akte akteVar = (akte) obj;
                ViewStub viewStub = (ViewStub) cxvvVar2.an.findViewById(R.id.scheduled_send_compose_label_stub);
                AsyncImageView asyncImageView = cxvvVar2.t;
                viewStub.getClass();
                asyncImageView.getClass();
                ffbr ffbrVar46 = akteVar.g;
                ffbr ffbrVar47 = akteVar.f;
                ffbr ffbrVar48 = akteVar.e;
                ffbr ffbrVar49 = akteVar.d;
                ffbr ffbrVar50 = akteVar.c;
                return new aktg(akteVar.a, akteVar.b, ffbrVar50, ffbrVar49, ffbrVar48, ffbrVar47, ffbrVar46, viewStub, asyncImageView);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cxvvVar.L(cxry.a(cxvvVar.h, 10));
        cxvvVar.H();
        cxvvVar.b = (CheckBox) cxvvVar.an.findViewById(R.id.priority_checkbox);
        cxvvVar.c = (TextView) cxvvVar.an.findViewById(R.id.priority_text);
        cxvvVar.d = (LinearLayout) cxvvVar.an.findViewById(R.id.priority_checkbox_container);
        cxvvVar.d.setOnClickListener(new View.OnClickListener() { // from class: cxtr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxvv.this.b.toggle();
            }
        });
        cxvvVar.b.setClickable(false);
        cxvvVar.b.setOnCheckedChangeListener(cxvvVar.j());
        cxvvVar.w = new crly(cxvvVar.an, R.id.reply_snippet_stub, R.id.reply_snippet_inflated);
        cxvvVar.A = ((Optional) cxvvVar.ak.b()).map(new Function() { // from class: cxts
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajur) obj).a(cxvv.this.w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void A(int i) {
        cxvv cxvvVar = this.c;
        if (((bzqa) cxvvVar.aj.b()).i()) {
            cxvvVar.T(Integer.valueOf(i));
        }
        cxvvVar.U();
    }

    public final void B() {
        cxvv cxvvVar = this.c;
        cxvvVar.F = true;
        cxvvVar.m.setOnEditorActionListener(null);
        cxvvVar.m.removeTextChangedListener(null);
        cxvvVar.n.setOnEditorActionListener(null);
        cxvvVar.n.removeTextChangedListener(null);
        cxvvVar.an.removeView(cxvvVar.m);
        cxvvVar.an.removeView(cxvvVar.n);
        cxvvVar.p.ifPresent(new Consumer() { // from class: cxua
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((aktd) obj).d();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void C() {
        this.c.F();
    }

    public final void D() {
        this.c.H();
    }

    public final void E() {
        this.c.I();
    }

    @Deprecated
    public final void F() {
        this.c.J();
    }

    @Override // defpackage.czha
    public final void G(final boolean z) {
        cxvv cxvvVar = this.c;
        if (cxvvVar.C.g()) {
            cxvvVar.V();
            cxvvVar.C(false);
            cxvvVar.J();
            cylx cylxVar = cxvvVar.j;
            if (cylxVar != null) {
                cylxVar.T(new Consumer() { // from class: cxti
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ugg uggVar = (ugg) obj;
                        cskc cskcVar = cxvv.a;
                        if (z) {
                            uggVar.r(ugo.IME, true, false);
                        } else {
                            uggVar.h(false);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: cxtj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        czgj czgjVar = (czgj) obj;
                        cskc cskcVar = cxvv.a;
                        if (czgjVar != null) {
                            if (!z) {
                                czgjVar.c.a(true);
                            } else {
                                czgjVar.A(1);
                                czgjVar.b.S();
                            }
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    public final void H(final Bundle bundle) {
        cylx cylxVar = this.c.j;
        if (cylxVar != null) {
            cylxVar.T(null, new Consumer() { // from class: cxuw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    cskc cskcVar = cxvv.a;
                    if (czgjVar == null) {
                        return;
                    }
                    czgd[] czgdVarArr = czgjVar.f;
                    int length = czgdVarArr.length;
                    int i = 0;
                    while (true) {
                        Bundle bundle2 = bundle;
                        if (i >= 2) {
                            czfj czfjVar = czgjVar.c;
                            bundle2.putBoolean("is_ime_visible_before_pause", czfjVar.j);
                            bundle2.putBoolean("is_c2o_visible_before_pause", czfjVar.k);
                            czfg czfgVar = (czfg) czfjVar;
                            bundle2.putBoolean("is_c2o_hidden_behind_ime", czfgVar.f);
                            bundle2.putBoolean("is_emoji_picker_hidden_behind_ime", czfgVar.e);
                            bundle2.putBoolean("is_emoji_picker_visible_before_pause", czfgVar.d);
                            return;
                        }
                        czgdVarArr[i].x(bundle2);
                        i++;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void I(bcxq bcxqVar) {
        cxvv cxvvVar = this.c;
        SelfIdentityId f = cxvvVar.f();
        SelfIdentityId e = bcxqVar.e();
        if (f == null || TextUtils.equals(f.b(), e.b())) {
            return;
        }
        ((akzt) cxvvVar.T.b()).c("Bugle.UI.Conversations.SimSwap.Click");
        csjb c = cxvv.a.c();
        c.I("Click select SIM: ");
        c.I(e);
        c.r();
        cxvvVar.P(e, bcxqVar.b());
    }

    public final void J(eisx eisxVar) {
        this.c.K = eisxVar;
    }

    public final void K(bcpw bcpwVar) {
        this.c.C = bcpwVar;
    }

    public final void L(ConversationIdType conversationIdType) {
        cxvv cxvvVar = this.c;
        PlainTextEditText plainTextEditText = cxvvVar.m;
        StringBuilder sb = new StringBuilder();
        if (!conversationIdType.b()) {
            cxwg cxwgVar = (cxwg) cxvvVar.N.b();
            String packageName = cxvvVar.k.getPackageName();
            if (cxwgVar.a == null) {
                cxwgVar.a = cxwgVar.c.f("gboard_conversation_id_prefix", null);
                if (cxwgVar.a == null) {
                    cxwgVar.a = cuxt.a(new Random().nextInt(10));
                    cxwgVar.c.l("gboard_conversation_id_prefix", cxwgVar.a);
                }
            }
            String str = cxwgVar.a;
            String obj = conversationIdType.toString();
            if (cxwgVar.b == null) {
                cxwgVar.b = cxwgVar.c.f("gboard_conversation_id_postfix", null);
                if (cxwgVar.b == null) {
                    cxwgVar.b = cuxt.a(new Random().nextInt(10));
                    cxwgVar.c.l("gboard_conversation_id_postfix", cxwgVar.b);
                }
            }
            sb.append(packageName + ".conv_id=" + csty.a(str + obj + cxwgVar.b));
        }
        plainTextEditText.setPrivateImeOptions(sb.toString());
    }

    @Override // defpackage.czha
    public final void M(int i) {
        this.c.an.setImportantForAccessibility(i);
    }

    public final void N(final Instant instant) {
        final cxvv cxvvVar = this.c;
        cxvvVar.t(new Consumer() { // from class: cxvj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((aktd) obj).f(instant);
                cxvv.this.U();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void O() {
        final cxvv cxvvVar = this.c;
        cylx cylxVar = cxvvVar.j;
        if (cylxVar != null) {
            cylxVar.T(new Consumer() { // from class: cxvb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ugo ugoVar = ugo.C2O;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("open_location_chooser", true);
                    ((ugg) obj).s(ugoVar, true, false, bundle);
                    cxvv.this.C(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: cxvc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    if (czgjVar != null) {
                        if (czgjVar.k.j()) {
                            czfx czfxVar = czgjVar.h;
                            if (!czfxVar.b) {
                                czfxVar.u(false, true);
                            }
                            Compose2oFragment n = czfxVar.n();
                            if (n != null) {
                                n.H().m(eptm.EXPAND, ((bcvr) czfxVar.o.a()).n());
                            } else {
                                csjy.f("Bugle", "Could not find compose2o fragment to show location");
                                czfxVar.m.k(R.string.conversation_suggestion_share_location_action_failure);
                            }
                        } else {
                            csjy.f("Bugle", "Share location action invoked with c20 enabled but no location permission.");
                            czgjVar.d.k(R.string.enable_location_permissions);
                        }
                        cxvv.this.C(czgjVar.h.q);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void P(final RepliedToDataAdapter repliedToDataAdapter) {
        final cxvv cxvvVar = this.c;
        cxvvVar.A.ifPresentOrElse(new Consumer() { // from class: cxtv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ComposeView) cxvv.this.w.b()).setVisibility(0);
                ((ajuq) obj).b(repliedToDataAdapter, true, null);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: cxtw
            @Override // java.lang.Runnable
            public final void run() {
                ((ComposeView) cxvv.this.w.b()).setVisibility(8);
            }
        });
    }

    public final void Q() {
        this.c.p.ifPresent(new Consumer() { // from class: cxtf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((aktd) obj).e();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void R() {
        cxvv cxvvVar = this.c;
        efbd.f(cxvvVar.at);
        cxvvVar.x.f();
        cylx cylxVar = cxvvVar.j;
        if (cylxVar != null) {
            cylxVar.T(null, new Consumer() { // from class: cxvi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    cskc cskcVar = cxvv.a;
                    if (czgjVar != null) {
                        czgjVar.j.h(czgjVar.q);
                        czgjVar.j.g(czgjVar.r);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cxvvVar.j = null;
        }
        cxsy cxsyVar = cxvvVar.l;
        cxsyVar.a.h(cxsyVar.d);
    }

    @Override // defpackage.czha
    public final void S() {
        this.c.S();
    }

    public final void T() {
        this.c.V();
    }

    public final boolean U() {
        return this.c.W();
    }

    public final boolean V() {
        return this.c.aa();
    }

    public final boolean W() {
        final cxvv cxvvVar = this.c;
        cylx cylxVar = cxvvVar.j;
        if (cylxVar != null) {
            return ((Boolean) cylxVar.J(new Function() { // from class: cxud
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = cxvv.a;
                    return false;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: cxue
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    if (czgjVar == null) {
                        return false;
                    }
                    cxvv cxvvVar2 = cxvv.this;
                    boolean x = czgjVar.x();
                    boolean y = czgjVar.y();
                    if (x && !y) {
                        cxvvVar2.C(false);
                        ((vvn) cxvvVar2.j).bo();
                    }
                    cxvvVar2.S();
                    return Boolean.valueOf(x);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // defpackage.czha
    public final void X() {
        ConstraintLayout constraintLayout = this.c.h;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    public final void Y() {
        this.c.O(true);
    }

    @Override // defpackage.ugj
    public final void a(ugo ugoVar) {
        this.c.a(ugoVar);
    }

    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        ekzz f = eleg.f("ComposeMessageViewPeer::onDraftChanged");
        try {
            this.c.b(bcvrVar, i);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxtb
    public final cxrx e() {
        return this.c.g.i;
    }

    @Override // defpackage.cxtb
    public final CharSequence f() {
        return this.c.l();
    }

    @Override // defpackage.bcvm
    public final void fs() {
        this.c.fs();
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
        this.c.fv(bcvrVar);
    }

    @Override // defpackage.cxtb
    public final String g() {
        bcxq h = this.c.h();
        if (h != null) {
            return cuxh.b(h.g());
        }
        return null;
    }

    @Override // defpackage.ugj
    public final void gk(ugo ugoVar) {
        this.c.gk(ugoVar);
    }

    @Override // defpackage.cxtb
    public final void h(String str) {
        this.c.m.setHint(str);
    }

    @Override // defpackage.cxtb
    public final void i(boolean z) {
        this.c.B = z;
    }

    @Override // defpackage.cxtb
    public final void j(boolean z) {
        cxvv cxvvVar = this.c;
        if (!z) {
            cxvvVar.e.H().a();
        }
        cxvvVar.r.setVisibility(true != z ? 8 : 0);
        int dimensionPixelSize = cxvvVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_bottom);
        int dimensionPixelSize2 = cxvvVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_top);
        int dimensionPixelSize3 = cxvvVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_without_indicator_padding);
        AsyncImageView asyncImageView = cxvvVar.t;
        int paddingStart = asyncImageView.getPaddingStart();
        if (true != z) {
            dimensionPixelSize2 = dimensionPixelSize3;
        }
        int paddingEnd = cxvvVar.t.getPaddingEnd();
        if (true != z) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        asyncImageView.setPaddingRelative(paddingStart, dimensionPixelSize2, paddingEnd, dimensionPixelSize);
    }

    @Override // defpackage.cxtb
    public final boolean k() {
        cxvv cxvvVar = this.c;
        if (cxvvVar.x.g()) {
            return !TextUtils.isEmpty(cxvvVar.l()) || cxvvVar.ab() || cxvvVar.Z();
        }
        return false;
    }

    @Override // defpackage.cxtb
    public final boolean l() {
        return this.c.B;
    }

    @Override // defpackage.cxtb
    public final boolean m() {
        return this.c.af();
    }

    public final int n() {
        cxvv cxvvVar = this.c;
        if (cxvvVar.j == null) {
            return 307200;
        }
        csuk csukVar = (csuk) cxvvVar.X.b();
        cylx cylxVar = cxvvVar.j;
        cylxVar.getClass();
        int a = cylxVar.a();
        cylx cylxVar2 = cxvvVar.j;
        cylxVar2.getClass();
        return csukVar.a(a, cylxVar2.fu());
    }

    @Override // defpackage.cylv
    public final View o(int i) {
        return this.c.an.findViewById(i);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c.onCheckedChanged(compoundButton, z);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.c.onEditorAction(textView, i, keyEvent);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // defpackage.czha
    public final View p() {
        return ((vvn) this.c.j).cS;
    }

    @Override // defpackage.czha
    public final View q() {
        return ((vvn) this.c.j).cS.a;
    }

    public final SelfIdentityId r() {
        return this.c.f();
    }

    public final bcpw s() {
        return this.c.g();
    }

    public final bcvr t() {
        cxvv cxvvVar = this.c;
        bcvr bcvrVar = (bcvr) cxvvVar.x.a();
        bcvrVar.S(cxvvVar.l().toString());
        bcvrVar.R(cxvvVar.m().toString());
        bcvrVar.n = cxvvVar.Y();
        return bcvrVar;
    }

    @Override // defpackage.czha
    public final MessagePartCoreData u(MessagePartCoreData messagePartCoreData) {
        return ((bcvr) this.c.x.a()).x(messagePartCoreData);
    }

    public final PlainTextEditText v() {
        return this.c.m;
    }

    public final void w(cylx cylxVar) {
        this.c.r(cylxVar);
    }

    public final void x(bcvr bcvrVar, cylx cylxVar) {
        cxvv cxvvVar = this.c;
        cxvvVar.n(bcvrVar);
        cxvvVar.r(cylxVar);
        if (cxvvVar.ad()) {
            return;
        }
        bcvrVar.g = cylxVar;
    }

    public final void y() {
        this.c.s();
    }

    @Override // defpackage.czha
    public final void z(final boolean z) {
        final cxvv cxvvVar = this.c;
        cylx cylxVar = cxvvVar.j;
        if (cylxVar != null) {
            cylxVar.T(null, new Consumer() { // from class: cxto
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    if (czgjVar != null) {
                        boolean z2 = z;
                        cxvv cxvvVar2 = cxvv.this;
                        czgjVar.n(z2);
                        cxvvVar2.C(false);
                        cxvvVar2.S();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
