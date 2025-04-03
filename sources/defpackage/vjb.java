package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjb extends PopupWindow {
    public static final entd a = entd.c("BugleReactions");
    public final LayoutInflater b;
    public final ddwu c;
    public final cmqs d;
    public final cmsl e;
    public final vgb f;
    public final elbx g;
    public View h;
    private final cmqx i;

    public vjb(ddwu ddwuVar, cmqt cmqtVar, cmqy cmqyVar, cmsl cmslVar, elbx elbxVar, Context context, vgb vgbVar) {
        super(context);
        this.b = LayoutInflater.from(context);
        this.c = ddwuVar;
        this.f = vgbVar;
        cmqs a2 = cmqtVar.a(eptu.EXPANDED, eptm.MESSAGE_BADGE_CLICK, ((cmsw) ((vfw) vgbVar).a).a);
        this.d = a2;
        elbx elbxVar2 = (elbx) cmqyVar.a.b();
        elbxVar2.getClass();
        a2.getClass();
        this.i = new cmqx(elbxVar2, a2);
        this.e = cmslVar;
        this.g = elbxVar;
    }

    public final View a() {
        Object parent = getContentView().getParent();
        return parent instanceof View ? (View) parent : getContentView();
    }

    public final void b() {
        super.setOnDismissListener(null);
        if (this.e.b()) {
            ensz a2 = a.a(this.e.a());
            a2.Y(cmsm.d, ((cmsw) ((vfw) this.f).a).a.toString());
            a2.Y(cmsm.f, ((cmsw) ((vfw) this.f).a).b.f());
            ((ensz) a2.h("com/google/android/apps/messaging/conversation/reactions/ui/summary/ReactionsSummaryPopupWindow", "dismissNotTraced", 152, "ReactionsSummaryPopupWindow.java")).q("Reactions summary view was dismissed.");
        }
        dismiss();
        this.i.a();
    }

    public final /* synthetic */ void c() {
        View a2 = a();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) a2.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = kpp.a(a2.getResources(), R.dimen.reaction_summary_background_dim_amount);
        WindowManager windowManager = (WindowManager) a2.getContext().getSystemService("window");
        windowManager.getClass();
        windowManager.updateViewLayout(a2, layoutParams);
        this.d.c();
        super.setOnDismissListener(this.i);
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        throw new UnsupportedOperationException("This class does not support setting OnDismissListener directly.");
    }
}
