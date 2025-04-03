package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeug implements TextView.OnEditorActionListener {
    final /* synthetic */ StickerSearchView a;

    public eeug(StickerSearchView stickerSearchView) {
        this.a = stickerSearchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Editable text = this.a.a.getText();
        if (TextUtils.isEmpty(text)) {
            return true;
        }
        eeuh eeuhVar = this.a.d;
        if (eeuhVar != null) {
            final eetn eetnVar = (eetn) eeuhVar;
            eetnVar.f = text.toString();
            eetnVar.c.removeCallbacks(eetnVar.e);
            eetnVar.e = new Runnable() { // from class: eetj
                @Override // java.lang.Runnable
                public final void run() {
                    eetn.this.b(eumg.EXPLICIT_SEARCH_TEXT);
                }
            };
            eetnVar.c.post(eetnVar.e);
        }
        this.a.a();
        return true;
    }
}
