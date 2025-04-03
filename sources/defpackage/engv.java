package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engv extends engw {
    final transient int a;
    final transient int b;
    final /* synthetic */ engw c;

    public engv(engw engwVar, int i, int i2) {
        this.c = engwVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.engw
    /* renamed from: b */
    public final engw subList(int i, int i2) {
        emxf.k(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.engi
    public final int e() {
        return this.c.f() + this.a + this.b;
    }

    @Override // defpackage.engi
    public final int f() {
        return this.c.f() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        emxf.v(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // defpackage.engi
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.engw, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.engw, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
