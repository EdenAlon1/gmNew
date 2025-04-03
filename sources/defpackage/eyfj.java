package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfj {
    public static final eyfj a = new eyfj(null);
    public final eyiq b = new eyim();
    public boolean c;
    public boolean d;

    private eyfj() {
    }

    static int a(eyjr eyjrVar, int i, Object obj) {
        int U = eyer.U(i);
        if (eyjrVar == eyjr.GROUP) {
            eygs.f((eyhs) obj);
            U += U;
        }
        return U + b(eyjrVar, obj);
    }

    static int b(eyjr eyjrVar, Object obj) {
        eyjr eyjrVar2 = eyjr.DOUBLE;
        eyjs eyjsVar = eyjs.INT;
        switch (eyjrVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                boolean z = eyer.e;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                boolean z2 = eyer.e;
                return 4;
            case INT64:
                return eyer.Y(((Long) obj).longValue());
            case UINT64:
                return eyer.Y(((Long) obj).longValue());
            case INT32:
                return eyer.G(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                boolean z3 = eyer.e;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                boolean z4 = eyer.e;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                boolean z5 = eyer.e;
                return 1;
            case STRING:
                return obj instanceof eyee ? eyer.C((eyee) obj) : eyer.T((String) obj);
            case GROUP:
                boolean z6 = eyer.e;
                return ((eyhs) obj).getSerializedSize();
            case MESSAGE:
                return obj instanceof eygz ? eyer.J((eygz) obj) : eyer.L((eyhs) obj);
            case BYTES:
                if (obj instanceof eyee) {
                    return eyer.C((eyee) obj);
                }
                boolean z7 = eyer.e;
                return eyer.K(((byte[]) obj).length);
            case UINT32:
                return eyer.W(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof eyge ? eyer.G(((eyge) obj).a()) : eyer.G(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                boolean z8 = eyer.e;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                boolean z9 = eyer.e;
                return 8;
            case SINT32:
                return eyer.P(((Integer) obj).intValue());
            case SINT64:
                return eyer.R(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void h(eyer eyerVar, eyjr eyjrVar, int i, Object obj) {
        if (eyjrVar == eyjr.GROUP) {
            eyhs eyhsVar = (eyhs) obj;
            eygs.f(eyhsVar);
            eyerVar.u(i, 3);
            eyerVar.ai(eyhsVar);
            eyerVar.u(i, 4);
            return;
        }
        eyerVar.u(i, eyjrVar.t);
        eyjs eyjsVar = eyjs.INT;
        switch (eyjrVar) {
            case DOUBLE:
                eyerVar.af(((Double) obj).doubleValue());
                break;
            case FLOAT:
                eyerVar.ah(((Float) obj).floatValue());
                break;
            case INT64:
                eyerVar.y(((Long) obj).longValue());
                break;
            case UINT64:
                eyerVar.y(((Long) obj).longValue());
                break;
            case INT32:
                eyerVar.n(((Integer) obj).intValue());
                break;
            case FIXED64:
                eyerVar.l(((Long) obj).longValue());
                break;
            case FIXED32:
                eyerVar.j(((Integer) obj).intValue());
                break;
            case BOOL:
                eyerVar.ax(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof eyee)) {
                    eyerVar.t((String) obj);
                    break;
                } else {
                    eyerVar.aA((eyee) obj);
                    break;
                }
            case GROUP:
                eyerVar.ai((eyhs) obj);
                break;
            case MESSAGE:
                eyerVar.p((eyhs) obj);
                break;
            case BYTES:
                if (!(obj instanceof eyee)) {
                    byte[] bArr = (byte[]) obj;
                    eyerVar.z(bArr, bArr.length);
                    break;
                } else {
                    eyerVar.aA((eyee) obj);
                    break;
                }
            case UINT32:
                eyerVar.w(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof eyge)) {
                    eyerVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    eyerVar.n(((eyge) obj).a());
                    break;
                }
            case SFIXED32:
                eyerVar.j(((Integer) obj).intValue());
                break;
            case SFIXED64:
                eyerVar.l(((Long) obj).longValue());
                break;
            case SINT32:
                eyerVar.ak(((Integer) obj).intValue());
                break;
            case SINT64:
                eyerVar.am(((Long) obj).longValue());
                break;
        }
    }

    public static int k(eyfv eyfvVar, Object obj) {
        eyjr eyjrVar = eyfvVar.c;
        int i = eyfvVar.b;
        if (!eyfvVar.d) {
            return a(eyjrVar, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!eyfvVar.e) {
            int i3 = 0;
            while (i2 < size) {
                i3 += a(eyjrVar, i, list.get(i2));
                i2++;
            }
            return i3;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i4 = 0;
        while (i2 < size) {
            i4 += b(eyjrVar, list.get(i2));
            i2++;
        }
        return eyer.U(i) + i4 + eyer.W(i4);
    }

    private static Object p(Object obj) {
        if (obj instanceof eyhx) {
            return ((eyhx) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean q(Map.Entry entry) {
        eyfv eyfvVar = (eyfv) entry.getKey();
        if (eyfvVar.a() != eyjs.MESSAGE) {
            return true;
        }
        if (!eyfvVar.d) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!r(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof eyht) {
            return ((eyht) obj).isInitialized();
        }
        if (obj instanceof eygz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void s(defpackage.eyfv r4, java.lang.Object r5) {
        /*
            defpackage.eygs.d(r5)
            eyjr r0 = defpackage.eyjr.DOUBLE
            eyjs r0 = defpackage.eyjs.INT
            eyjr r0 = r4.c
            eyjs r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r0 = r5 instanceof defpackage.eyhs
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.eygz
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.eyge
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof defpackage.eyee
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            int r0 = r4.b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            eyjr r4 = r4.c
            eyjs r4 = r4.s
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyfj.s(eyfv, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int V;
        int U;
        eyfv eyfvVar = (eyfv) entry.getKey();
        Object value = entry.getValue();
        if (eyfvVar.a() != eyjs.MESSAGE || eyfvVar.d || eyfvVar.e) {
            return k(eyfvVar, value);
        }
        if (value instanceof eygz) {
            int i = ((eyfv) entry.getKey()).b;
            int U2 = eyer.U(1);
            V = U2 + U2 + eyer.V(2, i);
            U = eyer.I(3, (eygz) value);
        } else {
            int i2 = ((eyfv) entry.getKey()).b;
            int U3 = eyer.U(1);
            V = U3 + U3 + eyer.V(2, i2);
            U = eyer.U(3) + eyer.L((eyhs) value);
        }
        return V + U;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eyfj clone() {
        eyfj eyfjVar = new eyfj();
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            eyin eyinVar = (eyin) this.b.d(i2);
            eyfjVar.n((eyfv) eyinVar.a, eyinVar.b);
        }
        for (Map.Entry entry : this.b.a()) {
            eyfjVar.n((eyfv) entry.getKey(), entry.getValue());
        }
        eyfjVar.d = this.d;
        return eyfjVar;
    }

    public final Iterator e() {
        return i() ? Collections.emptyIterator() : this.d ? new eygy(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eyfj) {
            return this.b.equals(((eyfj) obj).b);
        }
        return false;
    }

    public final void f() {
        if (this.c) {
            return;
        }
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((eyin) this.b.d(i2)).b;
            if (obj instanceof eyfy) {
                ((eyfy) obj).makeImmutable();
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof eyfy) {
                ((eyfy) value).makeImmutable();
            }
        }
        eyiq eyiqVar = this.b;
        if (!eyiqVar.d) {
            for (int i3 = 0; i3 < eyiqVar.b; i3++) {
                Map.Entry d = eyiqVar.d(i3);
                eyin eyinVar = (eyin) d;
                if (((eyfv) eyinVar.a).d) {
                    d.setValue(DesugarCollections.unmodifiableList((List) eyinVar.b));
                }
            }
            for (Map.Entry entry : eyiqVar.a()) {
                if (((eyfv) entry.getKey()).d) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!eyiqVar.d) {
            eyiqVar.c = eyiqVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(eyiqVar.c);
            eyiqVar.e = eyiqVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(eyiqVar.e);
            eyiqVar.d = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        eyfv eyfvVar = (eyfv) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof eygz;
        if (eyfvVar.d) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object l = l(eyfvVar);
            List list = (List) value;
            int size = list.size();
            if (l == null) {
                l = new ArrayList(size);
            }
            List list2 = (List) l;
            for (int i = 0; i < size; i++) {
                list2.add(p(list.get(i)));
            }
            this.b.put(eyfvVar, l);
            return;
        }
        if (eyfvVar.a() != eyjs.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(eyfvVar, p(value));
            return;
        }
        Object l2 = l(eyfvVar);
        if (l2 == null) {
            this.b.put(eyfvVar, p(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (l2 instanceof eyhx) {
            throw new UnsupportedOperationException();
        }
        this.b.put(eyfvVar, ((eyfq) ((eyhs) l2).toBuilder()).mergeFrom((eyfq) ((eyhs) value)).build());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.b.d(i2))) {
                return false;
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object l(eyfv eyfvVar) {
        Object obj = this.b.get(eyfvVar);
        if (!(obj instanceof eygz)) {
            return obj;
        }
        throw null;
    }

    public final void m(eyfv eyfvVar, Object obj) {
        List list;
        if (!eyfvVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        s(eyfvVar, obj);
        Object l = l(eyfvVar);
        if (l == null) {
            list = new ArrayList();
            this.b.put(eyfvVar, list);
        } else {
            list = (List) l;
        }
        list.add(obj);
    }

    public final void n(eyfv eyfvVar, Object obj) {
        if (!eyfvVar.d) {
            s(eyfvVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                s(eyfvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof eygz) {
            this.d = true;
        }
        this.b.put(eyfvVar, obj);
    }

    public final boolean o(eyfv eyfvVar) {
        if (eyfvVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(eyfvVar) != null;
    }

    private eyfj(byte[] bArr) {
        f();
        f();
    }
}
