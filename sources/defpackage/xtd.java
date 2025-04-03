package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtd {
    private final Context a;

    public xtd(Context context) {
        context.getClass();
        this.a = context;
    }

    public final String a(doyc doycVar) {
        String string = this.a.getResources().getString(doycVar.b().b.a());
        string.getClass();
        String string2 = this.a.getString(R.string.local_attachment_content_description_format, string, dqkr.a(doycVar.c()));
        string2.getClass();
        return string2;
    }
}
