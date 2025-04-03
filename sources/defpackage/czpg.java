package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpg extends riv {
    final /* synthetic */ Uri a;
    final /* synthetic */ RichCardMediaAttachmentView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czpg(RichCardMediaAttachmentView richCardMediaAttachmentView, int i, int i2, Uri uri) {
        super(i, i2);
        this.a = uri;
        this.b = richCardMediaAttachmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        this.b.b.setImageDrawable(drawable);
        this.b.i = this.a;
    }
}
