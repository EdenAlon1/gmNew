package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfr {
    private static final edkq a = new edkq();
    private static volatile edko b;

    public static synchronized edsg a(Context context) {
        edsg b2;
        synchronized (edfr.class) {
            try {
                context.getClass();
                String packageName = context.getPackageName();
                int i = 0;
                try {
                    i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageName == null) {
                    throw new NullPointerException("Null packageName");
                }
                edtf edtfVar = new edtf(packageName, i);
                emxf.b(!edtfVar.a.isEmpty(), "Package name must not be empty.");
                b2 = b(context, edtfVar);
            } catch (Error | RuntimeException e) {
                edti.b(e);
                throw e;
            }
        }
        return b2;
    }

    public static synchronized edsg b(Context context, edtg edtgVar) {
        edhf edhfVar;
        synchronized (edfr.class) {
            try {
                emxf.m(c(), "Places must be initialized first.");
                edkj edkjVar = new edkj(context, a, edtgVar);
                edkq edkqVar = edkjVar.a;
                edto edtoVar = new edto(edkjVar.b);
                edgh edghVar = new edgh(edkjVar.b(), new edjp());
                edgm edgmVar = new edgm(edkjVar.b());
                edga c = edkjVar.c();
                dlpw dlpwVar = (dlpw) edkjVar.e.b();
                int i = edjz.a;
                edjy edjyVar = new edjy(edkqVar, edtoVar, edghVar, edgmVar, c, dlpwVar);
                Context a2 = edkjVar.a();
                Context a3 = edkjVar.a();
                int i2 = dgyx.a;
                edfv edfvVar = new edfv(a2, new dgzr(a3), new edki());
                edfz edfzVar = new edfz(edkjVar.a(), (dlpw) edkjVar.e.b());
                edga c2 = edkjVar.c();
                dlpw dlpwVar2 = (dlpw) edkjVar.e.b();
                edkq edkqVar2 = edkjVar.a;
                feau feauVar = (feau) edkjVar.f.b();
                edga c3 = edkjVar.c();
                dlpw dlpwVar3 = (dlpw) edkjVar.e.b();
                Object b2 = edkjVar.i.b();
                Object b3 = edkjVar.j.b();
                Object b4 = edkjVar.k.b();
                Object b5 = edkjVar.l.b();
                Object b6 = edkjVar.m.b();
                Object b7 = edkjVar.o.b();
                Object b8 = edkjVar.p.b();
                Object b9 = edkjVar.q.b();
                edik d = edkjVar.d();
                Object b10 = edkjVar.t.b();
                edkjVar.a();
                feau feauVar2 = (feau) edkjVar.s.b();
                edkjVar.d();
                ezjq.a(feauVar2);
                edhfVar = new edhf(edkqVar, edjyVar, edfvVar, edfzVar, c2, dlpwVar2, new edij(edkqVar2, feauVar, c3, dlpwVar3, (edjc) b3, (edip) b7, d, evez.a(edkjVar.w)), new dwdq((feau) edkjVar.x.b(), (dwdl) edkjVar.d.b(), dwdf.a()));
            } catch (Error | RuntimeException e) {
                edti.b(e);
                throw e;
            }
        }
        return edhfVar;
    }

    public static synchronized boolean c() {
        boolean c;
        synchronized (edfr.class) {
            try {
                c = a.c();
            } catch (Error | RuntimeException e) {
                edti.b(e);
                throw e;
            }
        }
        return c;
    }

    public static synchronized void d(Context context) {
        synchronized (edfr.class) {
            try {
                context.getClass();
                emxf.b(true, "API Key must not be empty.");
                edti.a(context.getApplicationContext());
                a.e();
            } catch (Error | RuntimeException e) {
                edti.b(e);
                throw e;
            }
        }
    }

    public static void e(Context context) {
        try {
            d(context);
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }
}
