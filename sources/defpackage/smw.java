package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smw {
    public final int a;
    public final Resources b;
    private final Context c;

    public smw(Context context) {
        this.c = context;
        this.b = context.getResources();
        this.a = (int) context.getResources().getDimension(R.dimen.audio_attachment_seekbar_thumb_size);
    }
}
