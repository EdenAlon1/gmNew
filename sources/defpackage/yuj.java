package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yuj implements ysi {
    public final ffbr b;
    private final ffbz c;
    private final int d;
    private final dsaq e;

    public yuj(@asgu ffbr ffbrVar, final ffbr ffbrVar2, ysb ysbVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
        this.c = ffca.a(new ffix() { // from class: yui
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional;
                Object b = this.b.b();
                b.getClass();
                ffbr ffbrVar3 = true != ((Boolean) b).booleanValue() ? null : ffbr.this;
                if (ffbrVar3 == null || (optional = (Optional) ffbrVar3.b()) == null) {
                    return null;
                }
                return (yqv) fflm.b(optional);
            }
        });
        this.d = R.string.selfie_gif_shortcut_title;
        this.e = new dsaq(R.drawable.ic_selfie_gif, new dsap(ysbVar.a(R.color.selfie_gif_shortcut_background), new dszo(R.color.selfie_gif_shortcut_icon_tint)));
    }

    private final yqv f() {
        return (yqv) this.c.a();
    }

    @Override // defpackage.ysi
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.e;
    }

    @Override // defpackage.ysi
    public final List c() {
        return ffdx.b(dqlf.a);
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        yqv f = f();
        if (f != null) {
            f.a(2);
        }
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return f() != null;
    }
}
