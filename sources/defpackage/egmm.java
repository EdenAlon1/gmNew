package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmm extends egmj {
    public egrf b;
    public dvyc c;
    public egjk d;
    public egbi e;
    public dvxy f;

    public egmm(Context context) {
        super(context);
        setOrientation(1);
        if (!this.a) {
            while (!(context instanceof fazf) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            ((fazf) context).ab().a(this);
        }
        inflate(context, R.layout.photo_picker_me_photos_section, this);
        this.f.b(this, this.c.a(89748));
    }
}
