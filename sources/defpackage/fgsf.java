package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsf {
    public static fgsd a;
    public static ComponentName b;
    private static final List c;
    private static volatile Boolean d;
    private static final Object e;

    static {
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        e = new Object();
        linkedList.add(fgsg.class);
        linkedList.add(fgsh.class);
        linkedList.add(fgsl.class);
        linkedList.add(fgsm.class);
        linkedList.add(fgsq.class);
        linkedList.add(fgst.class);
        linkedList.add(fgsi.class);
        linkedList.add(fgsk.class);
        linkedList.add(fgsn.class);
        linkedList.add(fgso.class);
        linkedList.add(fgsv.class);
        linkedList.add(fgss.class);
        linkedList.add(fgsu.class);
        linkedList.add(fgsr.class);
    }

    public static boolean a(Context context) {
        fgsd fgsdVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package ".concat(String.valueOf(context.getPackageName())));
            return false;
        }
        b = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                fgsdVar = (fgsd) ((Class) it.next()).newInstance();
            } catch (Exception unused) {
                fgsdVar = null;
            }
            if (fgsdVar != null && fgsdVar.a().contains(str)) {
                a = fgsdVar;
                break;
            }
        }
        if (a != null) {
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            a = new fgst();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
            a = new fgsv();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            a = new fgsn();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.MANUFACTURER.equalsIgnoreCase("JOVI")) {
            a = new fgss();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("ZTE") || Build.MANUFACTURER.equalsIgnoreCase("NUBIA")) {
            a = new fgsu();
            return true;
        }
        a = (Build.MANUFACTURER.equalsIgnoreCase("TECNO") || Build.MANUFACTURER.equalsIgnoreCase("INFINIX") || Build.MANUFACTURER.equalsIgnoreCase("ITEL") || Build.MANUFACTURER.equalsIgnoreCase("TECNO MOBILE")) ? new fgsr() : new fgsj();
        return true;
    }

    public static boolean b(Context context) {
        int i;
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    String str = null;
                    int i2 = 0;
                    while (i2 < 3) {
                        try {
                            i = i2 + 1;
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i), 3));
                        } catch (Exception e2) {
                            str = e2.getMessage();
                            i2++;
                        }
                        if (a(context)) {
                            a.b(context, b, 0);
                            d = true;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                        i2 = i;
                    }
                    if (d == null) {
                        Log.w("ShortcutBadger", a.t(str, "Badge counter seems not supported in this platform: "));
                        d = false;
                    }
                }
            }
        }
        return d.booleanValue();
    }
}
