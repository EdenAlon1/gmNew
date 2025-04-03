package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaez {
    public static final String a = "eaez";
    private static final emxs d = new eaep();
    private static final emxs e = new eaeq();
    private static final emxs f = new eaer();
    public final eaeu b;
    protected final List c;
    private final Context g;
    private final Executor h;
    private final eafa i;
    private final ConnectivityManager j;
    private final Map k;
    private final Map l;
    private final Queue m;
    private boolean n;
    private final BroadcastReceiver o;

    public eaez(eafa eafaVar, Context context, Executor executor) {
        eaeu eaeuVar = new eaeu();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.n = false;
        this.o = new eaes(this);
        this.g = context;
        this.i = eafaVar;
        this.h = executor;
        this.b = eaeuVar;
        this.j = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        return file.getAbsolutePath() + "/" + str;
    }

    public static void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    public static eael m(int i) {
        return new eael(eaek.INVALID_REQUEST, -1, "DataUri error type: ".concat(eaei.a(i)), null, null);
    }

    private static boolean p(Context context, String str) {
        return koa.c(context, str) == 0;
    }

    private static final void q(List list, emxs emxsVar) {
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            emxsVar.a((eaew) it.next());
        }
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection a2;
        this.i.e();
        if (!p(this.g, "android.permission.INTERNET")) {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        emxf.l(!((eaeo) this.k.get(str)).e());
        a2 = this.i.a(str2);
        String str3 = this.b.b;
        this.l.put(str, a2);
        return a2;
    }

    protected final synchronized List c() {
        engr engrVar;
        int i = engw.d;
        engrVar = new engr();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            eaew eaewVar = (eaew) ((WeakReference) it.next()).get();
            if (eaewVar == null) {
                it.remove();
            } else {
                engrVar.h(eaewVar);
            }
        }
        return engrVar.g();
    }

    public final synchronized void d(File file, String str) {
        Map map = this.k;
        String a2 = a(file, str);
        eaeo eaeoVar = (eaeo) map.get(a2);
        if (eaeoVar != null) {
            eaeoVar.d();
        } else {
            Log.v(a, "Attempted to setCanceled unknown request: ".concat(a2));
        }
        j((HttpURLConnection) this.l.get(a2));
        if (eaeoVar != null) {
            g();
        }
    }

    public final synchronized void e() {
        this.i.b();
        this.i.c();
    }

    public final void f(eaeo eaeoVar) {
        List c;
        eaeoVar.c();
        synchronized (this) {
            boolean isEmpty = this.m.isEmpty();
            this.m.add(eaeoVar);
            if (isEmpty) {
                this.g.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.n = true;
                g();
            }
            c = this.m.containsAll(this.k.values()) ? c() : null;
        }
        if (c != null) {
            q(c, d);
        }
    }

    public final synchronized void g() {
        Queue queue = this.m;
        Log.d(a, "Running " + queue.size() + " requests pending connectivity");
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            eaeo eaeoVar = (eaeo) it.next();
            if (eaeoVar.e() || k(eaeoVar.a())) {
                it.remove();
                eaeoVar.b();
                i(eaeoVar);
            }
        }
        if (this.m.isEmpty() && this.n) {
            this.g.unregisterReceiver(this.o);
            this.n = false;
        }
    }

    public final synchronized void h(eaew eaewVar) {
        this.c.add(new WeakReference(eaewVar));
    }

    public final void i(eaeo eaeoVar) {
        q(c(), e);
        this.h.execute(new eaet(this, eaeoVar));
    }

    public final synchronized boolean k(eaen eaenVar) {
        if (eaenVar == eaen.NONE) {
            return true;
        }
        if (!p(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        NetworkInfo activeNetworkInfo = this.j.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            this.i.e();
            if (!activeNetworkInfo.isConnected()) {
                Log.d(a, "Network disconnected, connectivity cannot be satisfied.");
                return false;
            }
            int ordinal = eaenVar.ordinal();
            if (ordinal == 0) {
                return !this.j.isActiveNetworkMetered() || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17;
            }
            if (ordinal == 1) {
                return activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 16 || activeNetworkInfo.getType() == 17;
            }
            Log.e(a, "Unknown connectivity type checked: ".concat(String.valueOf(eaenVar.name())));
            return true;
        }
        Log.d(a, "No current network, connectivity cannot be satisfied.");
        return false;
    }

    public final synchronized boolean l(eaeo eaeoVar) {
        File file = eaeoVar.b;
        String str = eaeoVar.c;
        Map map = this.k;
        String a2 = a(file, str);
        if (map.containsKey(a2)) {
            Log.i(a, "Request is already being executed for key: ".concat(a2));
            return false;
        }
        this.k.put(a2, eaeoVar);
        i(eaeoVar);
        return true;
    }

    public final void n(File file, String str, dxbf dxbfVar, eael eaelVar, File file2) {
        List list;
        List list2;
        dwqm dwqmVar;
        String a2 = a(file, str);
        synchronized (this) {
            this.k.remove(a2);
            this.l.remove(a2);
            if (this.k.isEmpty()) {
                list = c();
                list2 = null;
            } else if (this.m.containsAll(this.k.values())) {
                list2 = c();
                list = null;
            } else {
                list = null;
                list2 = null;
            }
        }
        if (eaelVar == null) {
            dxth.c("%s: Downloaded file %s", "DownloadCompleteHandler", file2.getName());
            dxbfVar.a.b(null);
        } else {
            Object[] objArr = {"DownloadCompleteHandler", file2.getName(), eaelVar.a};
            Throwable th = eaelVar.e;
            dxth.e(th, "%s: Failed to download file %s due to %s", objArr);
            eaek eaekVar = eaelVar.a;
            dwql a3 = dwqn.a();
            switch (eaekVar) {
                case UNKNOWN:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case CANCELED:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case INVALID_REQUEST:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case HTTP_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case REQUEST_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case RESPONSE_OPEN_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case RESPONSE_CLOSE_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case NETWORK_IO_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case DISK_IO_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case FILE_SYSTEM_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case UNKNOWN_IO_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                case OAUTH_ERROR:
                    dwqmVar = dwqm.ANDROID_DOWNLOADER_OAUTH_ERROR;
                    break;
                default:
                    dwqmVar = dwqm.UNKNOWN_ERROR;
                    break;
            }
            a3.a = dwqmVar;
            String str2 = "ANDROID_DOWNLOADER_" + eaelVar.a.name() + "; ";
            int i = eaelVar.b;
            if (i >= 0) {
                str2 = str2 + "HttpCode: " + i + "; ";
            }
            String str3 = eaelVar.c;
            if (str3 != null) {
                str2 = str2 + "Message: " + str3 + "; ";
            }
            a3.b = str2;
            if (th != null) {
                a3.c = th;
            }
            dxbfVar.a.c(a3.a());
        }
        if (list != null) {
            q(list, f);
        } else if (list2 != null) {
            q(list2, d);
        }
    }

    public final synchronized void o(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            this.i.d(httpURLConnection, i);
        }
    }
}
