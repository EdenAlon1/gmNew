package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qd extends DataSetObservable {
    static final String a = "qd";
    private static final Object k = new Object();
    private static final Map l = new HashMap();
    final Context e;
    final String f;
    public Intent g;
    public qb j;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    private final pz p = new pz();
    private final int m = 50;
    boolean h = true;
    private boolean n = false;
    private boolean o = true;
    public boolean i = false;

    private qd(Context context, String str) {
        this.e = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f = str;
        } else {
            this.f = String.valueOf(str).concat(".xml");
        }
    }

    public static qd e(Context context, String str) {
        qd qdVar;
        synchronized (k) {
            Map map = l;
            qdVar = (qd) map.get(str);
            if (qdVar == null) {
                qdVar = new qd(context, str);
                map.put(str, qdVar);
            }
        }
        return qdVar;
    }

    private final void h() {
        int size = this.d.size() - this.m;
        if (size <= 0) {
            return;
        }
        this.o = true;
        for (int i = 0; i < size; i++) {
        }
    }

    private final void i() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.e.openFileInput(this.f);
            try {
                try {
                    newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e(a, "Error reading historical recrod file: " + this.f, e);
            } catch (XmlPullParserException e2) {
                Log.e(a, "Error reading historical recrod file: " + this.f, e2);
            }
            if (!"historical-records".equals(newPullParser.getName())) {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            List list = this.d;
            list.clear();
            while (true) {
                int next = newPullParser.next();
                if (next == 1) {
                    break;
                }
                if (next != 3 && next != 4) {
                    if (!"historical-record".equals(newPullParser.getName())) {
                        throw new XmlPullParserException("Share records file not well-formed.");
                    }
                    list.add(new qa(ComponentName.unflattenFromString(newPullParser.getAttributeValue(null, "activity")), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                }
            }
            if (openFileInput != null) {
                openFileInput.close();
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    private final void j() {
        if (this.p == null || this.g == null || this.c.isEmpty() || this.d.isEmpty()) {
            return;
        }
        pz pzVar = this.p;
        List list = this.c;
        List list2 = this.d;
        Map map = pzVar.a;
        List unmodifiableList = DesugarCollections.unmodifiableList(list2);
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            py pyVar = (py) list.get(i);
            pyVar.b = 0.0f;
            map.put(new ComponentName(pyVar.a.activityInfo.packageName, pyVar.a.activityInfo.name), pyVar);
        }
        float f = 1.0f;
        for (int size2 = unmodifiableList.size() - 1; size2 >= 0; size2--) {
            qa qaVar = (qa) unmodifiableList.get(size2);
            py pyVar2 = (py) map.get(qaVar.a);
            if (pyVar2 != null) {
                pyVar2.b += qaVar.c * f;
                f *= 0.95f;
            }
        }
        Collections.sort(list);
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            f();
            size = this.c.size();
        }
        return size;
    }

    public final Intent b(int i) {
        synchronized (this.b) {
            if (this.g == null) {
                return null;
            }
            f();
            py pyVar = (py) this.c.get(i);
            ComponentName componentName = new ComponentName(pyVar.a.activityInfo.packageName, pyVar.a.activityInfo.name);
            Intent intent = new Intent(this.g);
            intent.setComponent(componentName);
            if (this.j != null) {
                new Intent(intent);
                this.j.a();
            }
            g(new qa(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo c(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            f();
            resolveInfo = ((py) this.c.get(i)).a;
        }
        return resolveInfo;
    }

    public final ResolveInfo d() {
        synchronized (this.b) {
            f();
            if (this.c.isEmpty()) {
                return null;
            }
            return ((py) this.c.get(0)).a;
        }
    }

    public final void f() {
        boolean z;
        boolean z2 = true;
        if (!this.i || this.g == null) {
            z = false;
        } else {
            this.i = false;
            this.c.clear();
            List<ResolveInfo> queryIntentActivities = this.e.getPackageManager().queryIntentActivities(this.g, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.c.add(new py(queryIntentActivities.get(i)));
            }
            z = true;
        }
        if (this.h && this.o && !TextUtils.isEmpty(this.f)) {
            this.h = false;
            this.n = true;
            i();
        } else {
            z2 = false;
        }
        boolean z3 = z | z2;
        h();
        if (z3) {
            j();
            notifyChanged();
        }
    }

    public final void g(qa qaVar) {
        if (this.d.add(qaVar)) {
            this.o = true;
            h();
            if (!this.n) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.o) {
                this.o = false;
                if (!TextUtils.isEmpty(this.f)) {
                    new qc(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.d), this.f);
                }
            }
            j();
            notifyChanged();
        }
    }
}
