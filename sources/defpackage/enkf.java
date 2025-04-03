package defpackage;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkf extends encm implements Serializable, enkg {
    private static final long serialVersionUID = 0;
    public transient enkc a;
    public transient enkc b;
    public transient Map c;
    public transient int d;
    public transient int e;

    public enkf() {
        this(12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new eneh();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            t(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Map.Entry entry : u()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean A() {
        return this.a == null;
    }

    public final enkc a(Object obj, Object obj2, enkc enkcVar) {
        enkc enkcVar2 = new enkc(obj, obj2);
        if (this.a == null) {
            this.b = enkcVar2;
            this.a = enkcVar2;
            this.c.put(obj, new enkb(enkcVar2));
            this.e++;
        } else if (enkcVar == null) {
            enkc enkcVar3 = this.b;
            enkcVar3.getClass();
            enkcVar3.c = enkcVar2;
            enkcVar2.d = enkcVar3;
            this.b = enkcVar2;
            enkb enkbVar = (enkb) this.c.get(obj);
            if (enkbVar == null) {
                this.c.put(obj, new enkb(enkcVar2));
                this.e++;
            } else {
                enkbVar.c++;
                enkc enkcVar4 = enkbVar.b;
                enkcVar4.e = enkcVar2;
                enkcVar2.f = enkcVar4;
                enkbVar.b = enkcVar2;
            }
        } else {
            enkb enkbVar2 = (enkb) this.c.get(obj);
            enkbVar2.getClass();
            enkbVar2.c++;
            enkcVar2.d = enkcVar.d;
            enkcVar2.f = enkcVar.f;
            enkcVar2.c = enkcVar;
            enkcVar2.e = enkcVar;
            enkc enkcVar5 = enkcVar.f;
            if (enkcVar5 == null) {
                enkbVar2.a = enkcVar2;
            } else {
                enkcVar5.e = enkcVar2;
            }
            enkc enkcVar6 = enkcVar.d;
            if (enkcVar6 == null) {
                this.a = enkcVar2;
            } else {
                enkcVar6.c = enkcVar2;
            }
            enkcVar.d = enkcVar2;
            enkcVar.f = enkcVar2;
        }
        this.d++;
        return enkcVar2;
    }

    @Override // defpackage.encm, defpackage.ennd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List u() {
        return (List) super.u();
    }

    @Override // defpackage.ennd
    public final /* synthetic */ Collection c(Object obj) {
        return new enjv(this, obj);
    }

    public final void e(Object obj) {
        enju.k(new enke(this, obj));
    }

    public final void f(enkc enkcVar) {
        enkc enkcVar2 = enkcVar.d;
        if (enkcVar2 != null) {
            enkcVar2.c = enkcVar.c;
        } else {
            this.a = enkcVar.c;
        }
        enkc enkcVar3 = enkcVar.c;
        if (enkcVar3 != null) {
            enkcVar3.d = enkcVar2;
        } else {
            this.b = enkcVar2;
        }
        if (enkcVar.f == null && enkcVar.e == null) {
            enkb enkbVar = (enkb) this.c.remove(enkcVar.a);
            enkbVar.getClass();
            enkbVar.c = 0;
            this.e++;
        } else {
            enkb enkbVar2 = (enkb) this.c.get(enkcVar.a);
            enkbVar2.getClass();
            enkbVar2.c--;
            enkc enkcVar4 = enkcVar.f;
            if (enkcVar4 == null) {
                enkc enkcVar5 = enkcVar.e;
                enkcVar5.getClass();
                enkbVar2.a = enkcVar5;
            } else {
                enkcVar4.e = enkcVar.e;
            }
            enkc enkcVar6 = enkcVar.e;
            if (enkcVar6 == null) {
                enkcVar4.getClass();
                enkbVar2.b = enkcVar4;
            } else {
                enkcVar6.f = enkcVar4;
            }
        }
        this.d--;
    }

    @Override // defpackage.enkg
    /* renamed from: g */
    public final List c(Object obj) {
        return new enjv(this, obj);
    }

    @Override // defpackage.ennd
    /* renamed from: h */
    public final List d(Object obj) {
        List unmodifiableList = DesugarCollections.unmodifiableList(enkr.b(new enke(this, obj)));
        e(obj);
        return unmodifiableList;
    }

    @Override // defpackage.ennd
    public final int i() {
        return this.d;
    }

    @Override // defpackage.encm
    public final /* synthetic */ Collection j() {
        return new enjw(this);
    }

    @Override // defpackage.encm
    public final /* synthetic */ Collection k() {
        return new enjz(this);
    }

    @Override // defpackage.encm
    public final Iterator l() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.encm
    public final Map o() {
        return new ennn(this);
    }

    @Override // defpackage.encm
    public final Set p() {
        return new enjx(this);
    }

    @Override // defpackage.ennd
    public final void q() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        this.e++;
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final /* bridge */ /* synthetic */ Collection v() {
        throw null;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean z(Object obj) {
        throw null;
    }

    public enkf(int i) {
        this.c = new ened(i);
    }

    public enkf(ennd enndVar) {
        this(enndVar.x().size());
        C(enndVar);
    }
}
