package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcb {
    public static final String a(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        format.getClass();
        return format;
    }

    public static final String b(int i, hfd hfdVar) {
        hfdVar.e(AndroidCompositionLocals_androidKt.a);
        return ((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }
}
