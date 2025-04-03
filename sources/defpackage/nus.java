package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nus extends vk {
    final /* synthetic */ nva a;
    private final String[] d;
    private final String[] e = new String[2];
    private final Drawable[] f;

    public nus(nva nvaVar, String[] strArr, Drawable[] drawableArr) {
        this.a = nvaVar;
        this.d = strArr;
        this.f = drawableArr;
    }

    public final boolean F(int i) {
        lro lroVar = this.a.D;
        if (lroVar == null) {
            return false;
        }
        if (i == 0) {
            return lroVar.n(13);
        }
        if (i != 1) {
            return true;
        }
        return lroVar.n(30) && this.a.D.n(29);
    }

    @Override // defpackage.vk
    public final int a() {
        return 2;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new nur(this.a, LayoutInflater.from(this.a.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        nur nurVar = (nur) wrVar;
        if (F(i)) {
            nurVar.a.setLayoutParams(new vy(-1, -2));
        } else {
            nurVar.a.setLayoutParams(new vy(0, 0));
        }
        nurVar.s.setText(this.d[i]);
        String str = this.e[i];
        if (str == null) {
            nurVar.t.setVisibility(8);
        } else {
            nurVar.t.setText(str);
        }
        Drawable drawable = this.f[i];
        if (drawable == null) {
            nurVar.u.setVisibility(8);
        } else {
            nurVar.u.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return i;
    }

    public final void m(int i, String str) {
        this.e[i] = str;
    }
}
