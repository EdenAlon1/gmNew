package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qci {
    public Map b;
    public Map c;
    public Map d;
    public List e;
    public cpo f;
    public cno g;
    public List h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public final qdm a = new qdm();
    private final HashSet o = new HashSet();
    public int n = 0;

    public final float a() {
        return (long) ((b() / this.l) * 1000.0f);
    }

    public final float b() {
        return this.k - this.j;
    }

    public final qht c(String str) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            qht qhtVar = (qht) this.e.get(i);
            if (!qhtVar.a.equalsIgnoreCase(str)) {
                if (qhtVar.a.endsWith("\r")) {
                    if (!qhtVar.a.substring(0, r4.length() - 1).equalsIgnoreCase(str)) {
                    }
                }
            }
            return qhtVar;
        }
        return null;
    }

    public final qji d(long j) {
        return (qji) this.g.d(j);
    }

    public final void e(String str) {
        qlp.a(str);
        this.o.add(str);
    }

    public final void f(int i) {
        this.n += i;
    }

    public final void g() {
        this.m = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((qji) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
