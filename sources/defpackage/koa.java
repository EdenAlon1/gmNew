package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class koa {
    public static int c(Context context, String str) {
        ksq.b(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new kno(context).h() ? 0 : -1;
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        kpj kpjVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        WeakHashMap weakHashMap = kpp.a;
        kpk kpkVar = new kpk(resources, theme2);
        synchronized (kpp.b) {
            SparseArray sparseArray = (SparseArray) kpp.a.get(kpkVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (kpjVar = (kpj) sparseArray.get(i)) != null) {
                if (!kpjVar.b.equals(kpkVar.a.getConfiguration()) || (!((theme = kpkVar.b) == null && kpjVar.c == 0) && (theme == null || kpjVar.c != theme.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList2 = kpjVar.a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        TypedValue c = kpp.c();
        resources.getValue(i, c, true);
        if (c.type < 28 || c.type > 31) {
            try {
                colorStateList = kpa.a(resources, resources.getXml(i), theme2);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme2);
        }
        synchronized (kpp.b) {
            SparseArray sparseArray2 = (SparseArray) kpp.a.get(kpkVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                kpp.a.put(kpkVar, sparseArray2);
            }
            sparseArray2.append(i, new kpj(colorStateList, kpkVar.a.getConfiguration(), theme2));
        }
        return colorStateList;
    }

    public static Executor e(Context context) {
        Executor mainExecutor;
        if (Build.VERSION.SDK_INT < 28) {
            return new kqu(new Handler(context.getMainLooper()));
        }
        mainExecutor = context.getMainExecutor();
        return mainExecutor;
    }

    @Deprecated
    public static File[] f(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return h(context, broadcastReceiver, intentFilter, null);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        Intent registerReceiver;
        Intent registerReceiver2;
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver2 = context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2);
            return registerReceiver2;
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
        return registerReceiver;
    }
}
