package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjj {
    final Set a;
    final Set b;
    final Set c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    cjn k;

    public cjj() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = cjn.b;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public cjj(cjk cjkVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = cjn.b;
        cjkVar.getClass();
        this.d = cjkVar.c;
        this.e = cjkVar.d;
        this.f = cjkVar.e;
        this.k = cjkVar.j;
        hashSet.addAll(cjkVar.k);
        hashSet2.addAll(cjkVar.l);
        hashSet3.addAll(cjkVar.m);
        this.g = cjkVar.f;
        this.h = cjkVar.g;
        this.i = cjkVar.h;
        this.j = cjkVar.i;
    }
}
