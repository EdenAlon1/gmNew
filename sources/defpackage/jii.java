package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jii {
    public static final String a(int i, hfd hfdVar) {
        return ((Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final String b(int i, Object[] objArr, hfd hfdVar) {
        return ((Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
