package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtq {
    public static final void a(Context context) {
        try {
            afg afgVar = new afg();
            afgVar.f(Color.parseColor("#eeeeee"));
            afgVar.a().a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new edtp();
        }
    }
}
