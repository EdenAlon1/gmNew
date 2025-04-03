package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxj extends kxi {
    public kxj(Window window, kur kurVar) {
        super(window, kurVar);
    }

    @Override // defpackage.kxo
    public final void g(boolean z) {
        if (!z) {
            b(8192);
            return;
        }
        c(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        d();
        a(8192);
    }

    @Override // defpackage.kxo
    public final boolean h() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
