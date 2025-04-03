package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqx extends rip {
    final /* synthetic */ SuggestionData b;
    final /* synthetic */ ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czqx(ImageView imageView, SuggestionData suggestionData, ImageView imageView2) {
        super(imageView);
        this.b = suggestionData;
        this.c = imageView2;
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
        czqy.k.n("Suggestion icon failed to load for suggestion: ".concat(String.valueOf(cskt.b(this.b.toString()))));
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        this.c.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.rip
    protected final void b(Drawable drawable) {
    }
}
