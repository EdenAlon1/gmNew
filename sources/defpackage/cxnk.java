package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnk implements cxmd, crik {
    private Animator C;
    private final int D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    public cylv a;
    public final LinearLayout b;
    public final LayoutTransition c;
    public final cxmi d;
    public final int e;
    public int f;
    public cylx g;
    public ImageView h;
    public LinearLayout i;
    public final String k;
    public final String l;
    public final String m;
    public ddym r;
    public final AttachmentsContainer s;
    public final Context t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public final ffbr z;
    public int A = 1;
    public boolean j = false;
    public final Map n = new HashMap();
    public int o = 0;
    public int p = 0;
    public List q = new ArrayList();
    public int B = 1;

    public cxnk(AttachmentsContainer attachmentsContainer, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.s = attachmentsContainer;
        Context context = (Context) ffbrVar12.b();
        this.t = context;
        this.E = ffbrVar;
        this.F = ffbrVar2;
        this.G = ffbrVar3;
        this.u = ffbrVar4;
        this.v = ffbrVar5;
        this.w = ffbrVar6;
        this.H = ffbrVar7;
        this.I = ffbrVar8;
        this.x = ffbrVar9;
        this.y = ffbrVar10;
        this.z = ffbrVar11;
        this.d = new cxmi();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        LayoutTransition layoutTransition = new LayoutTransition();
        this.c = layoutTransition;
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.compose_attachment_container_height);
        this.D = Math.round(context.getResources().getDimension(R.dimen.compress_info_image_view_hide_threshold));
        this.k = context.getResources().getString(R.string.media_compress_info);
        this.l = context.getResources().getString(R.string.video_compress_info);
        this.m = context.getResources().getString(R.string.image_compress_info);
        attachmentsContainer.addView(linearLayout);
    }

    public static final Map n(bcvr bcvrVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MessagePartCoreData messagePartCoreData : bcvrVar.s) {
            Uri v = messagePartCoreData.v();
            Uri t = messagePartCoreData.t();
            if (v != null) {
                linkedHashMap.put(v, messagePartCoreData);
            } else if (t != null) {
                linkedHashMap.put(t, messagePartCoreData);
            }
        }
        for (MessagePartCoreData messagePartCoreData2 : bcvrVar.u) {
            Uri v2 = messagePartCoreData2.v();
            Uri t2 = messagePartCoreData2.t();
            if (v2 != null) {
                linkedHashMap.put(v2, messagePartCoreData2);
            } else if (t2 != null) {
                linkedHashMap.put(t2, messagePartCoreData2);
            }
        }
        return linkedHashMap;
    }

    public static final int o(bcvr bcvrVar) {
        int i = 0;
        for (MessagePartCoreData messagePartCoreData : n(bcvrVar).values()) {
            if (messagePartCoreData.N() == eohh.CAMERA || messagePartCoreData.N() == eohh.MINI_CAMERA || messagePartCoreData.N() == eohh.FULLSCREEN_CAMERA) {
                if (messagePartCoreData.bo()) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final int p(bcvr bcvrVar) {
        int i = 0;
        for (MessagePartCoreData messagePartCoreData : n(bcvrVar).values()) {
            if (messagePartCoreData.N() == eohh.CAMERA || messagePartCoreData.N() == eohh.MINI_CAMERA || messagePartCoreData.N() == eohh.FULLSCREEN_CAMERA) {
                if (messagePartCoreData.bD()) {
                    i++;
                }
            }
        }
        return i;
    }

    private final void q(int i, int i2) {
        Animator animator = this.C;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "animatedHeight", i, i2);
        this.C = ofInt;
        ofInt.setDuration(this.t.getResources().getInteger(R.integer.attachment_container_animation_duration));
        this.C.setInterpolator(csmj.a);
        this.C.setStartDelay(this.p);
        this.C.addListener(new cxnj(this, i2, i));
        this.C.start();
        this.A = i2 == 0 ? 4 : 2;
    }

    public final void a() {
        if (this.r == null || this.B == 3) {
            return;
        }
        b();
        this.h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable() { // from class: cxnb
            @Override // java.lang.Runnable
            public final void run() {
                cxnk.this.B = 3;
            }
        }).withEndAction(new Runnable() { // from class: cxnc
            @Override // java.lang.Runnable
            public final void run() {
                cxnk cxnkVar = cxnk.this;
                cxnkVar.h.setVisibility(8);
                cxnkVar.B = 1;
            }
        });
    }

    public final void b() {
        ddym ddymVar = this.r;
        if (ddymVar != null) {
            ddymVar.a();
        }
    }

    public final void c(View view) {
        view.post(new Runnable() { // from class: cxna
            @Override // java.lang.Runnable
            public final void run() {
                cxnk cxnkVar = cxnk.this;
                cxnkVar.b.addOnLayoutChangeListener(new cxni(cxnkVar));
            }
        });
    }

    public final void d(final View view) {
        this.q.add(view);
        view.animate().scaleX(0.7f).scaleY(0.7f).alpha(0.0f).setDuration(this.t.getResources().getInteger(R.integer.selected_media_animation_duration)).setInterpolator(new ljm()).withEndAction(new Runnable() { // from class: cxmp
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                view2.setVisibility(8);
                cxnk cxnkVar = cxnk.this;
                cxnkVar.b.removeView(view2);
                cxnkVar.q.remove(view2);
            }
        });
    }

    final void e() {
        if (this.B != 2) {
            this.h.setVisibility(0);
            this.h.post(new Runnable() { // from class: cxmz
                @Override // java.lang.Runnable
                public final void run() {
                    final cxnk cxnkVar = cxnk.this;
                    cxnkVar.k();
                    cxnkVar.h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable() { // from class: cxmx
                        @Override // java.lang.Runnable
                        public final void run() {
                            cxnk.this.B = 2;
                        }
                    }).withEndAction(new Runnable() { // from class: cxmy
                        @Override // java.lang.Runnable
                        public final void run() {
                            cxnk.this.B = 1;
                        }
                    });
                }
            });
        }
    }

    public final void f() {
        int i;
        if (this.s.getVisibility() == 8 || (i = this.A) == 4 || i == 5) {
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(8);
            b();
        }
        q(this.e, 0);
    }

    @Override // defpackage.crik
    public final boolean g(crij crijVar) {
        return false;
    }

    @Override // defpackage.crik
    public final int h() {
        return 3;
    }

    @Override // defpackage.criy
    public final boolean i(MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        Uri t = messagePartCoreData.t();
        if (t == null) {
            csjy.n("Bugle", "Cannot click attachment with null uri");
            return false;
        }
        if (!(messagePartCoreData instanceof PendingAttachmentData)) {
            if (messagePartCoreData.bo()) {
                cylx cylxVar = ((cxtc) this.a).c.j;
                if (((Boolean) dcut.e.e()).booleanValue() || ((Boolean) dcut.f.e()).booleanValue()) {
                    vvn vvnVar = (vvn) cylxVar;
                    vvn.bu(vvnVar.an, t, true, vvnVar.M, vvnVar.N);
                } else {
                    vvn vvnVar2 = (vvn) cylxVar;
                    vvn.bt(vvnVar2.an, t, true, vvnVar2.M, vvnVar2.p());
                }
                ((altk) this.E.b()).T(3);
                return true;
            }
            if (messagePartCoreData.bD()) {
                ((akvg) this.H.b()).E(this.t, t, messagePartCoreData.V());
                ((altk) this.E.b()).ad(3);
                return true;
            }
            if (messagePartCoreData.bd()) {
                final Uri b = cbgl.b(this.t, t, messagePartCoreData.Y(), messagePartCoreData.V(), messagePartCoreData.p());
                ((altk) this.E.b()).av(bdhb.a.b(), 2);
                if (messagePartCoreData.bn()) {
                    ((akvg) this.H.b()).C(this.t, b, messagePartCoreData.V());
                } else {
                    ((Optional) this.I.b()).ifPresent(new Consumer() { // from class: cxmo
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((tap) obj).b(cxnk.this.t, b);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                return true;
            }
            if (messagePartCoreData.bz()) {
                String V = messagePartCoreData.bB() ? "text/plain" : messagePartCoreData.V();
                Uri b2 = cbgl.b(this.t, t, messagePartCoreData.Y(), V, messagePartCoreData.p());
                ((altk) this.E.b()).aA(messagePartCoreData.bP(), bdhb.a.b(), 2);
                ((akvg) this.H.b()).C(this.t, b2, V);
                return true;
            }
        }
        return false;
    }

    public final void j() {
        int i;
        if (this.s.getVisibility() == 0 && ((i = this.A) == 2 || i == 3)) {
            return;
        }
        this.s.setVisibility(0);
        if (this.j) {
            e();
        }
        q(0, this.e);
    }

    public final void k() {
        this.h.setTranslationY(((-this.e) - this.i.getMeasuredHeight()) + this.h.getMeasuredHeight());
    }

    public final void l(int i) {
        if (this.g.aY() && !this.g.fu() && this.j) {
            int width = this.b.getWidth() - i;
            AttachmentsContainer attachmentsContainer = this.s;
            if (width > attachmentsContainer.getWidth() - this.D) {
                a();
            } else {
                e();
            }
        }
    }

    public final void m(final engw engwVar) {
        elfr.l(((errl) this.F.b()).submit(eldl.m(new Callable() { // from class: cxnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cxnk cxnkVar;
                Iterator<E> it = engwVar.iterator();
                long j = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    cxnkVar = cxnk.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    Uri v = messagePartCoreData.v() != null ? messagePartCoreData.v() : messagePartCoreData.t();
                    if (v != null) {
                        if (!cxnkVar.n.containsKey(v)) {
                            cxnkVar.n.put(v, Long.valueOf(messagePartCoreData.bQ()));
                        }
                        Long l = (Long) cxnkVar.n.get(v);
                        j += l == null ? 0L : l.longValue();
                    }
                    z |= messagePartCoreData.bD();
                    z2 |= messagePartCoreData.bo();
                }
                if (((Float) cbib.d.e()).floatValue() * j > cxnkVar.o) {
                    cxnkVar.j = true;
                    return z ? z2 ? cxnkVar.k : cxnkVar.l : cxnkVar.m;
                }
                cxnkVar.j = false;
                return "";
            }
        })), new cxng(this), (Executor) this.G.b());
    }

    public void setAnimatedHeight(int i) {
        if (this.f != i) {
            this.f = i;
            this.s.requestLayout();
        }
    }
}
