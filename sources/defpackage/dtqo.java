package defpackage;

import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqo {
    public static int a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
