package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkw {
    public static final float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
