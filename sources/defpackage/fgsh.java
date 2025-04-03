package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsh implements fgsd {
    @Override // defpackage.fgsd
    public final List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // defpackage.fgsd
    public final void b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (!fgsw.a(context, intent)) {
            throw new fgse("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
