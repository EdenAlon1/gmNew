package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuf implements TextWatcher {
    final /* synthetic */ StickerSearchView a;

    public eeuf(StickerSearchView stickerSearchView) {
        this.a = stickerSearchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 4);
        StickerSearchView stickerSearchView = this.a;
        if (stickerSearchView.d != null && !TextUtils.equals(charSequence, stickerSearchView.c)) {
            final eetn eetnVar = (eetn) this.a.d;
            eetnVar.f = charSequence.toString();
            eetnVar.c.removeCallbacks(eetnVar.e);
            eetnVar.e = new Runnable() { // from class: eetk
                @Override // java.lang.Runnable
                public final void run() {
                    eetn.this.b(eumg.IMPLICIT_SEARCH_TEXT);
                }
            };
            eetnVar.c.postDelayed(eetnVar.e, 500L);
        }
        this.a.c = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
