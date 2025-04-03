package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yug implements ysi {
    private final Context b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final int j;
    private final dsaq k;

    public yug(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ysb ysbVar) {
        context.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = true != ((aujj) ffbrVar4.b()).a() ? R.string.rewrite_shortcut_title : R.string.magic_compose_shortcut_title;
        this.k = new dsaq(R.drawable.gs_pen_spark_vd_theme_24, new dsap(ysbVar.a(R.color.rewrite_shortcut_background), new dszo(R.color.rewrite_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return this.j;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.k;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        if (((dqmn) this.f.b()).a().length() != 0) {
            ((whk) this.d.b()).b();
            ((xie) this.c.b()).c(xhx.a);
            return;
        }
        if (((auji) this.e.b()).a() && (((Boolean) ctjd.bg.e()).booleanValue() || !((asuf) this.i.b()).a())) {
            ((whk) this.d.b()).c();
            ((xie) this.c.b()).c(xhx.a);
            return;
        }
        ajjc ajjcVar = (ajjc) this.g.b();
        String string = this.b.getString(R.string.magic_compose_magic_rewrite_without_draft_error_message);
        string.getClass();
        String string2 = this.b.getString(R.string.rewrite_shortcut_no_message_text_confirm);
        string2.getClass();
        ajjcVar.c(new dmve(string, null, null, null, false, false, new doas(string2, new ffix() { // from class: yuf
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, null, 446), true);
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return ((Boolean) ctjd.aO.e()).booleanValue() && ((ctyz) this.h.b()).k();
    }
}
