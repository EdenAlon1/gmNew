package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lry {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public engw i;
    public engw j;
    public engw k;
    public int l;
    public int m;
    public engw n;
    public lrx o;
    public engw p;
    public boolean q;
    public int r;
    public boolean s;
    public HashMap t;
    public HashSet u;

    public lry() {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.b = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        this.f = Alert.DURATION_SHOW_INDEFINITELY;
        this.g = true;
        this.h = true;
        int i = engw.d;
        engw engwVar = enou.a;
        this.i = engwVar;
        this.j = engwVar;
        this.k = engwVar;
        this.l = Alert.DURATION_SHOW_INDEFINITELY;
        this.m = Alert.DURATION_SHOW_INDEFINITELY;
        this.n = engwVar;
        this.o = lrx.a;
        this.p = enou.a;
        this.q = true;
        this.r = 0;
        this.s = false;
        this.t = new HashMap();
        this.u = new HashSet();
    }

    public final void a(lrz lrzVar) {
        this.a = lrzVar.a;
        this.b = lrzVar.b;
        this.c = lrzVar.c;
        this.d = lrzVar.d;
        int i = lrzVar.e;
        int i2 = lrzVar.f;
        int i3 = lrzVar.g;
        int i4 = lrzVar.h;
        this.e = lrzVar.i;
        this.f = lrzVar.j;
        this.g = lrzVar.k;
        this.h = lrzVar.l;
        this.i = lrzVar.m;
        this.j = lrzVar.n;
        int i5 = lrzVar.o;
        this.k = lrzVar.p;
        int i6 = lrzVar.q;
        this.l = lrzVar.r;
        this.m = lrzVar.s;
        this.n = lrzVar.t;
        this.o = lrzVar.u;
        this.p = lrzVar.v;
        int i7 = lrzVar.w;
        this.q = lrzVar.x;
        this.r = lrzVar.y;
        boolean z = lrzVar.z;
        boolean z2 = lrzVar.A;
        boolean z3 = lrzVar.B;
        this.s = lrzVar.C;
        this.u = new HashSet(lrzVar.E);
        this.t = new HashMap(lrzVar.D);
    }

    public final void b(int i) {
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            if (((lrw) it.next()).a() == i) {
                it.remove();
            }
        }
    }

    public void c(int i) {
        throw null;
    }

    protected lry(lrz lrzVar) {
        a(lrzVar);
    }
}
