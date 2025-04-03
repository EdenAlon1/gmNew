package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhe {
    public static final entd a = entd.c("BugleReactions");
    private final ejwl A;
    private final ddzb B;
    private final cuxh C;
    private final boolean D;
    private final vhn E;
    public final Context b;
    public final crjx c;
    public final vgt d;
    public final vfq e;
    public final cmqs f;
    public final cmsl g;
    public final ddwu h;
    public final ejlq i;
    public final elbx j;
    public final ejlr k;
    public final Optional l;
    public final MessageIdType m;
    public final String n;
    public final ConversationIdType o;
    public final SelfIdentityId p;
    public final boolean q;
    public final boolean r;
    public final cmqo s;
    public ViewTreeObserver.OnGlobalLayoutListener t;
    public View u;
    public View v;
    public Runnable w;
    private final Activity x;
    private final tam y;
    private final bdtd z;

    public vhe(Context context, crjx crjxVar, Activity activity, final vgt vgtVar, vfq vfqVar, vhn vhnVar, cmqt cmqtVar, cmsl cmslVar, ddwu ddwuVar, bdtd bdtdVar, ejwl ejwlVar, ejlq ejlqVar, elbx elbxVar, ddzb ddzbVar, cuxh cuxhVar, tam tamVar, vgv vgvVar, cmqo cmqoVar) {
        Optional empty;
        this.b = context;
        this.c = crjxVar;
        this.x = activity;
        this.d = vgtVar;
        this.e = vfqVar;
        this.E = vhnVar;
        this.y = tamVar;
        this.f = cmqtVar.a(eptu.COLLAPSED, eptm.MESSAGE_LONG_PRESS, bdhb.b(vgvVar.d));
        this.g = cmslVar;
        this.h = ddwuVar;
        this.z = bdtdVar;
        this.A = ejwlVar;
        this.i = ejlqVar;
        this.j = elbxVar;
        this.B = ddzbVar;
        this.C = cuxhVar;
        this.k = new vfv(vgtVar, new Runnable() { // from class: vgw
            @Override // java.lang.Runnable
            public final void run() {
                vgt.this.hw();
            }
        });
        if ((vgvVar.b & 1) != 0) {
            cmrl cmrlVar = vgvVar.c;
            empty = Optional.of(cmrlVar == null ? cmrl.a : cmrlVar);
        } else {
            empty = Optional.empty();
        }
        this.l = empty;
        this.m = bdhb.b(vgvVar.d);
        this.n = vgvVar.e;
        this.o = bdgq.b(vgvVar.f);
        this.p = aqvf.b(vgvVar.g);
        this.q = vgvVar.h;
        this.r = vgvVar.i;
        this.D = vgvVar.j;
        this.s = cmqoVar;
    }

    public final void a() {
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.u;
        horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new vhd(this, horizontalScrollView));
    }

    public final void b(final cmrl cmrlVar, final cmrm cmrmVar, final eprt eprtVar) {
        aztg d = this.z.d(this.p);
        final int e = d == null ? -1 : d.e();
        ejwl ejwlVar = this.A;
        final vhn vhnVar = this.E;
        vgt vgtVar = this.d;
        MessageIdType messageIdType = this.m;
        lkv lkvVar = vgtVar.ag;
        ejwlVar.b(!vhnVar.f.a() ? vhnVar.a.a(vhnVar.d.b(messageIdType), new byzu() { // from class: vhi
            @Override // defpackage.byzu
            public final elfl a(Object obj) {
                final bjjg bjjgVar = (bjjg) obj;
                final vhn vhnVar2 = vhn.this;
                return elfo.g(new Callable() { // from class: vhj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Optional ofNullable = Optional.ofNullable((bigm) ((bjjd) bjjgVar.o()).cS());
                        final vhn vhnVar3 = vhn.this;
                        return ofNullable.map(new Function() { // from class: vhm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return cmtc.a(vhn.this.c.d((bigm) obj2).g);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, vhnVar2.b);
            }
        }, vgs.a(messageIdType.b()), lkvVar) : vhnVar.a.a(vhnVar.e.a(messageIdType), new byzu() { // from class: vhh
            @Override // defpackage.byzu
            public final elfl a(Object obj) {
                final bifx bifxVar = (bifx) obj;
                final vhn vhnVar2 = vhn.this;
                return elfo.g(new Callable() { // from class: vhk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bgmp bgmpVar = (bgmp) ((bifu) bifxVar.o()).cS();
                        if (bgmpVar != null && bgmpVar.cI.ad()) {
                            return Optional.empty();
                        }
                        final vhn vhnVar3 = vhn.this;
                        return Optional.ofNullable(bgmpVar).map(new Function() { // from class: vhl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return cmtc.a(vhn.this.c.b((bgmp) obj2).g);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, vhnVar2.b);
            }
        }, vgs.a(messageIdType.b()), lkvVar), new ejwd<Optional<cmtb>>(this) { // from class: vhe.1
            final /* synthetic */ vhe e;

            {
                this.e = this;
            }

            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                ensz enszVar = (ensz) vhe.a.a(Level.WARNING).g(th);
                enszVar.Y(cmsm.d, this.e.m.b());
                ((ensz) enszVar.h("com/google/android/apps/messaging/conversation/reactions/ui/selection/ReactionsSelectionDialogFragmentPeer$2", "onError", 426, "ReactionsSelectionDialogFragmentPeer.java")).q("Unable to select reaction as data service threw an error");
                this.e.d.hw();
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ensz a2 = vhe.a.a(Level.WARNING);
                    a2.Y(cmsm.d, this.e.m.b());
                    ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/selection/ReactionsSelectionDialogFragmentPeer$2", "onNewData", 393, "ReactionsSelectionDialogFragmentPeer.java")).q("Unable to select reaction as message content could not be generated");
                    this.e.d.hw();
                    return;
                }
                vhe vheVar = this.e;
                cmsw cmswVar = new cmsw(vheVar.m, bdhg.a(vheVar.n), (cmtb) optional.get());
                cmrl cmrlVar2 = cmrlVar;
                eprt eprtVar2 = eprtVar;
                cmrm cmrmVar2 = cmrmVar;
                vhe vheVar2 = this.e;
                int i = e;
                SelfIdentityId selfIdentityId = vheVar2.p;
                boolean z = vheVar2.q;
                Runnable runnable = vheVar2.w;
                vheVar.e.c(cmswVar, cmrlVar2, eprtVar2, cmrmVar2, z, vheVar2.r, vheVar2.o, i, selfIdentityId, runnable, vheVar2.i, vheVar2.k);
                cmrv b = cmrv.b(cmrlVar.e);
                if (b == null) {
                    b = cmrv.UNRECOGNIZED;
                }
                if (b == cmrv.CUSTOM) {
                    vhe vheVar3 = this.e;
                    vheVar3.s.a(cmrmVar, eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER, vheVar3.m.b());
                }
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }

    public final void c() {
        View view = this.v;
        if (view == null || this.t == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.t;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        this.t = null;
    }

    public final void d() {
        Window window;
        int width;
        WindowInsets rootWindowInsets;
        Dialog dialog = this.d.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        vgt vgtVar = this.d;
        WindowManager.LayoutParams attributes = window.getAttributes();
        Point b = ddzd.b(vgtVar.z());
        Resources resources = this.b.getResources();
        int[] iArr = new int[2];
        View view = this.v;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_background_width);
        if (resources.getBoolean(R.bool.should_remove_reaction)) {
            dimensionPixelSize -= resources.getDimensionPixelSize(R.dimen.reaction_selection_item_size);
        }
        int dimensionPixelSize2 = dimensionPixelSize + resources.getDimensionPixelSize(R.dimen.reaction_selection_item_size);
        if (this.B.n() || ahpj.a(this.x, this.y.a)) {
            boolean z = this.D;
            boolean d = this.C.d();
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_background_padding);
            if (z != d) {
                width = iArr[0] - dimensionPixelSize3;
            } else {
                int i = iArr[0];
                View view2 = this.v;
                width = ((i + (view2 != null ? view2.getWidth() : 0)) - dimensionPixelSize2) + dimensionPixelSize3;
            }
        } else {
            width = (b.x - dimensionPixelSize2) / 2;
        }
        attributes.x = width;
        View view3 = this.v;
        attributes.y = (((view3 == null || (rootWindowInsets = view3.getRootWindowInsets()) == null) ? iArr[1] : iArr[1] - rootWindowInsets.getSystemWindowInsetTop()) + resources.getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_clearance)) - resources.getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_height);
        window.setAttributes(attributes);
    }
}
