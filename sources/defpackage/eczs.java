package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eczs {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final eull b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public eczs(Context context, eczu eczuVar) {
        this.a = eczuVar.c ? ecvd.c(context, eczuVar.b) : eczuVar.b;
        eull b = eull.b(eczuVar.d);
        this.b = b == null ? eull.UNKNOWN : b;
        this.c = eczuVar.g;
        this.d = eczuVar.e;
        this.e = eczuVar.f;
    }

    public static Map a(Context context) {
        Map map;
        Map map2 = g;
        if (map2 != null) {
            return map2;
        }
        synchronized (f) {
            map = g;
            if (map == null) {
                enhd enhdVar = new enhd();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream open = context.getAssets().open(a.t(str, "phenotype/"));
                                    try {
                                        eyfc eyfcVar = eyfc.a;
                                        eyib eyibVar = eyib.a;
                                        eczs eczsVar = new eczs(context, (eczu) eyfy.parseFrom(eczu.a, open, eyfc.a));
                                        enhdVar.k(eczsVar.a, eczsVar);
                                        if (open != null) {
                                            open.close();
                                        }
                                    } catch (Throwable th) {
                                        if (open != null) {
                                            try {
                                                open.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (eygu e) {
                                    Log.e("PackageInfo", a.t(str, "Unable to read Phenotype PackageMetadata for "), e);
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                map = enhdVar.c();
                g = map;
            }
        }
        return map;
    }
}
