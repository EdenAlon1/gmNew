package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjr implements Iterable, htx, fflg {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public cnw j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(hen henVar) {
        if (this.f) {
            hfp.j("Use active SlotWriter to determine anchor location instead");
        }
        if (!henVar.a()) {
            hih.a("Anchor refers to a group that was removed");
        }
        return henVar.a;
    }

    public final hgw b(int i) {
        int i2;
        HashMap hashMap = this.i;
        if (hashMap != null) {
            if (this.f) {
                hfp.j("use active SlotWriter to crate an anchor for location instead");
            }
            hen f = (i < 0 || i >= (i2 = this.b)) ? null : hjt.f(this.h, i, i2);
            if (f != null) {
                return (hgw) hashMap.get(f);
            }
        }
        return null;
    }

    public final hjq c() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new hjq(this);
    }

    public final hjv d() {
        if (this.f) {
            hfp.j("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            hfp.j("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new hjv(this);
    }

    public final void e() {
        this.j = new cnw((byte[]) null);
    }

    public final void f() {
        this.i = new HashMap();
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap hashMap, cnw cnwVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = hashMap;
        this.j = cnwVar;
    }

    public final boolean h(hen henVar) {
        int d;
        return henVar.a() && (d = hjt.d(this.h, henVar.a, this.b)) >= 0 && ffkj.e(this.h.get(d), henVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hgv(this, 0, this.b);
    }
}
