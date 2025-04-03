package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeju implements aema {
    crly a;
    private final Context b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public aeju(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        aelyVar.ah();
        if (aelyVar.F() != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.a.b();
            if (appCompatImageView != null) {
                this.a.g(0);
                appCompatImageView.setImageDrawable(this.b.getDrawable(R.drawable.message_status_error));
                return;
            }
            return;
        }
        if (aelyVar.x() == null) {
            this.a.g(8);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.a.b();
        if (appCompatImageView2 != null) {
            if (((askd) this.d.b()).a() && (layoutParams = appCompatImageView2.getLayoutParams()) != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.a.g(0);
            Context context = this.b;
            Integer x = aelyVar.x();
            x.getClass();
            appCompatImageView2.setImageDrawable(context.getDrawable(x.intValue()));
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        new crly(view, R.id.conversation_status, R.id.conversation_status);
        this.a = new crly(view, R.id.conversation_status_icon, R.id.conversation_status_icon);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        amny t = aelyVar.k().t();
        amny t2 = aelyVar2.k().t();
        boolean ah = aelyVar.k().ah();
        boolean ah2 = aelyVar2.k().ah();
        aelyVar2.ah();
        aelyVar.ah();
        return (TextUtils.equals(null, null) && Objects.equals(aelyVar.x(), aelyVar2.x()) && t == t2 && ah == ah2 && Objects.equals(aelyVar2.F(), aelyVar.F())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        int i;
        int i2;
        Integer num = null;
        if (!aekiVar.ah()) {
            ((aelu) aelxVar).d = Integer.valueOf(R.attr.colorOnSurface);
            int i3 = aekiVar.i();
            amny t = aekiVar.t();
            boolean g = ((crjx) this.c.b()).g();
            boolean a = ((askd) this.d.b()).a();
            long longValue = ((Long) this.e.b()).longValue();
            boolean a2 = ((auzz) this.f.b()).a();
            enip enipVar = aejc.a;
            if (t == amny.c) {
                num = Integer.valueOf(R.drawable.unapproved_conversation_icon);
            } else if (bdjs.p(i3)) {
                if (a2) {
                    i2 = g ? R.drawable.home_screen_read_icon_v3_dark_mode : R.drawable.home_screen_read_icon_v3_light_mode;
                } else if (longValue == 2) {
                    i2 = g ? R.drawable.home_screen_read_icon_v2_dark_mode : R.drawable.home_screen_read_icon_v2_light_mode;
                } else {
                    i2 = R.drawable.home_screen_read_icon;
                    if (!a && longValue != 1) {
                        i2 = R.drawable.double_check_filled_scalable_v2;
                    }
                }
                num = Integer.valueOf(i2);
            } else if (bdjs.n(i3)) {
                if (a2) {
                    i = g ? R.drawable.home_screen_delivered_icon_v3_dark_mode : R.drawable.home_screen_delivered_icon_v3_light_mode;
                } else if (longValue == 2) {
                    i = g ? R.drawable.home_screen_delivered_icon_v2_dark_mode : R.drawable.home_screen_delivered_icon_v2_light_mode;
                } else {
                    i = R.drawable.home_screen_delivered_icon;
                    if (!a && longValue != 1) {
                        i = R.drawable.double_check_outlined_scalable_v2;
                    }
                }
                num = Integer.valueOf(i);
            } else if (aejc.a.contains(Integer.valueOf(i3))) {
                num = Integer.valueOf(R.drawable.message_status_error);
            }
        }
        ((aelu) aelxVar).H = num;
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
