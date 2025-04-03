package defpackage;

import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntr {
    public final npn a;
    public final lqc b;
    public final List c;
    public final nsl d;
    public final nrj e;
    public final String f;
    public final int g;
    public lrq h;
    public volatile npo i;
    public volatile int j;
    public volatile boolean k;

    public ntr(npn npnVar, lqc lqcVar, List list, nsl nslVar, nrj nrjVar) {
        int i = 0;
        lti.a(lqcVar.C != null);
        this.a = npnVar;
        this.b = lqcVar;
        this.c = list;
        this.d = nslVar;
        this.e = nrjVar;
        String str = lqcVar.o;
        lti.f(str);
        String str2 = nslVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (lre.j(str)) {
            str = "video/hevc";
        }
        int i2 = nslVar.d;
        lpo lpoVar = lqcVar.C;
        if (i2 == 0) {
            if (lpo.i(lpoVar) && nqt.g(str, lpoVar).isEmpty()) {
                if (nqt.g("video/hevc", lpoVar).isEmpty()) {
                    i = 2;
                }
            }
            str3 = str;
        } else {
            str3 = str;
            i = i2;
        }
        Pair create = Pair.create(str3, Integer.valueOf(i));
        this.f = (String) create.first;
        this.g = ((Integer) create.second).intValue();
    }
}
