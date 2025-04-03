package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class engf extends enhk implements Map, encw {
    private static final long serialVersionUID = 912559;

    public static engf c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        return new enot(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, 4);
    }

    public static engf d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        endr.a(obj9, obj10);
        endr.a(obj11, obj12);
        return new enot(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, 6);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.encw
    public final /* bridge */ /* synthetic */ encw a() {
        throw null;
    }

    public abstract engf b();

    @Override // defpackage.enhk
    public final /* bridge */ /* synthetic */ engi e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.enhk, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final enip values() {
        return b().keySet();
    }

    @Override // defpackage.enhk
    public Object writeReplace() {
        return new enge(this);
    }
}
