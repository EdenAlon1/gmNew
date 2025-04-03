package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjt {
    public static final String a(Context context, String str) {
        String concat = str != null ? ":".concat(str) : "";
        return context.getPackageName() + ":reminder" + concat;
    }
}
