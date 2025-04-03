package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class je {
    static final jc a = new jc(new jd());
    public static int b = -100;
    public static kqx c = null;
    public static kqx d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final cmj f = new cmj();
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void i(je jeVar) {
        synchronized (g) {
            cmi cmiVar = new cmi(f);
            while (cmiVar.hasNext()) {
                je jeVar2 = (je) ((WeakReference) cmiVar.next()).get();
                if (jeVar2 == jeVar || jeVar2 == null) {
                    cmiVar.remove();
                }
            }
        }
    }

    static boolean o(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ke.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract im b();

    public abstract View c(int i2);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(int i2);

    public abstract void n(CharSequence charSequence);

    public abstract void p();

    public abstract void q();

    public abstract void r(int i2);
}
