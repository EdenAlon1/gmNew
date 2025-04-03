package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytk implements ysi {
    private final ffbr b;
    private final dsaq c;

    public ytk(ffbr ffbrVar, ysb ysbVar) {
        this.b = ffbrVar;
        this.c = new dsaq(R.drawable.gifs_shortcut_icon, new dsap(ysbVar.a(R.color.gifs_shortcut_background), new dszo(R.color.gifs_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return R.string.gifs_shortcut_title;
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
        ((xie) this.b.b()).c(new xhz(xhw.b, 2));
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return ((Boolean) uky.c.e()).booleanValue() && uky.c();
    }
}
