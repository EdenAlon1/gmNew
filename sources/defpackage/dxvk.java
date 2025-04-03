package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvk {
    public static long a(dwso dwsoVar) {
        if (dwsoVar.m == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(dwsoVar.m);
    }

    public static Uri b(Uri uri, dwsi dwsiVar) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (dwsiVar.p.isEmpty()) {
            String str = dwsiVar.d;
            buildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : dwsiVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    buildUpon.appendPath(str2);
                }
            }
        }
        return buildUpon.build();
    }

    public static Uri c(Context context, emxc emxcVar, dwso dwsoVar) {
        String str = !dwsoVar.x.isEmpty() ? dwsoVar.x : dwsoVar.d;
        int a = dwsm.a(dwsoVar.k);
        if (a == 0) {
            a = 1;
        }
        return dxvb.b(context, emxcVar).buildUpon().appendPath(dxvb.f(a)).build().buildUpon().appendPath(str).build();
    }

    public static dwso d(dwso dwsoVar, long j) {
        dwsk dwskVar = dwsoVar.c;
        if (dwskVar == null) {
            dwskVar = dwsk.a;
        }
        dwsj dwsjVar = (dwsj) dwskVar.toBuilder();
        dwsjVar.copyOnWrite();
        dwsk dwskVar2 = (dwsk) dwsjVar.instance;
        dwskVar2.b |= 1;
        dwskVar2.c = j;
        dwsk dwskVar3 = (dwsk) dwsjVar.build();
        dwsn dwsnVar = (dwsn) dwsoVar.toBuilder();
        dwsnVar.copyOnWrite();
        dwso dwsoVar2 = (dwso) dwsnVar.instance;
        dwskVar3.getClass();
        dwsoVar2.c = dwskVar3;
        dwsoVar2.b |= 1;
        return (dwso) dwsnVar.build();
    }

    public static String e(dwsi dwsiVar) {
        return g(dwsiVar) ? dwsiVar.i : dwsiVar.g;
    }

    public static void f(Context context, emxc emxcVar, dwso dwsoVar, efbm efbmVar) {
        Uri c = c(context, emxcVar, dwsoVar);
        if (efbmVar.h(c)) {
            efdz efdzVar = new efdz();
            efdzVar.a = true;
        }
    }

    public static boolean g(dwsi dwsiVar) {
        if ((dwsiVar.b & 32) == 0) {
            return false;
        }
        fasl faslVar = dwsiVar.h;
        if (faslVar == null) {
            faslVar = fasl.a;
        }
        Iterator<E> it = faslVar.b.iterator();
        while (it.hasNext()) {
            if (((fasj) it.next()).b == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str, enip enipVar) {
        if (str.isEmpty()) {
            return false;
        }
        int indexOf = str.indexOf(58);
        emxf.p(indexOf >= 0, "Invalid url: %s", str);
        String substring = str.substring(0, indexOf);
        enqu listIterator = enipVar.listIterator();
        while (listIterator.hasNext()) {
            if (emuz.e(substring, (String) listIterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(dwsi dwsiVar) {
        return h(dwsiVar.d, new enpx("inlinefile"));
    }

    public static boolean j(dwso dwsoVar) {
        if (!dwsoVar.o) {
            return false;
        }
        Iterator<E> it = dwsoVar.p.iterator();
        while (it.hasNext()) {
            int a = dwse.a(((dwsi) it.next()).m);
            if (a != 0 && a == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(dwsi dwsiVar) {
        return h(dwsiVar.d, enip.r("file", "asset"));
    }

    public static boolean l(long j, dxbv dxbvVar) {
        return j <= dxbvVar.a();
    }
}
