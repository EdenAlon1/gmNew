package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abh {
    private static final int a = Color.argb(230, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
    private static final int b = Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void a(abe abeVar) {
        ace aceVar = ace.a;
        acf acfVar = new acf(0, 0, aceVar);
        acf acfVar2 = new acf(a, b, aceVar);
        View decorView = abeVar.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) acfVar.a.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) acfVar2.a.invoke(resources2)).booleanValue();
        abm ablVar = Build.VERSION.SDK_INT >= 30 ? new abl() : Build.VERSION.SDK_INT >= 29 ? new abk() : Build.VERSION.SDK_INT >= 28 ? new abj() : new abi();
        Window window = abeVar.getWindow();
        window.getClass();
        ablVar.a(acfVar, acfVar2, window, decorView, booleanValue, booleanValue2);
        Window window2 = abeVar.getWindow();
        window2.getClass();
        ablVar.b(window2);
    }
}
