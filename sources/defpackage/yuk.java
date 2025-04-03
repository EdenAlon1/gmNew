package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yuk implements ysi {
    private final ffbr b;
    private final dsaq c;

    public yuk(ffbr ffbrVar, ysb ysbVar) {
        this.b = ffbrVar;
        this.c = new dsaq(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new dsap(ysbVar.a(R.color.stickers_shortcut_background), new dszo(R.color.stickers_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return R.string.stickers_shortcut_title;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.c;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        ((xie) this.b.b()).c(new xhz(xhw.c, 2));
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return ((Boolean) uky.c.e()).booleanValue() && uky.d();
    }
}
