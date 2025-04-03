package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kxk extends kxj {
    public kxk(Window window, kur kurVar) {
        super(window, kurVar);
    }

    @Override // defpackage.kxo
    public final void i(boolean z) {
        if (!z) {
            b(16);
            return;
        }
        c(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        d();
        a(16);
    }

    @Override // defpackage.kxo
    public final boolean j() {
        return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }
}
