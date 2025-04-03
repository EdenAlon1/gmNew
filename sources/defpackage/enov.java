package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enov extends engw {
    final /* synthetic */ enow a;

    public enov(enow enowVar) {
        this.a = enowVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        emxf.v(i, this.a.c);
        enow enowVar = this.a;
        Object[] objArr = enowVar.a;
        int i2 = i + i;
        int i3 = enowVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.engw, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
