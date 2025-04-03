package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etga {
    public final etzt a;
    public final List b;
    private final etrt c;

    public etga(etzt etztVar, List list, etrt etrtVar) {
        this.a = etztVar;
        this.b = list;
        this.c = etrtVar;
    }

    public static final etga b(etzt etztVar) {
        g(etztVar);
        return new etga(etztVar, k(etztVar));
    }

    @Deprecated
    public static final etga d(byte[] bArr) {
        try {
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            etzt etztVar = (etzt) eyfy.parseFrom(etzt.a, bArr, eyfc.a);
            h(etztVar);
            return b(etztVar);
        } catch (eygu unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static etzs e(etfs etfsVar, etfu etfuVar, int i) {
        int i2;
        ettd ettdVar = (ettd) etsh.a.c(etfsVar, ettd.class, etgk.a);
        Integer num = ettdVar.e;
        if (num != null && num.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (etfu.a.equals(etfuVar)) {
            i2 = 3;
        } else if (etfu.b.equals(etfuVar)) {
            i2 = 4;
        } else {
            if (!etfu.c.equals(etfuVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            i2 = 5;
        }
        etzr etzrVar = (etzr) etzs.a.createBuilder();
        etzk etzkVar = (etzk) etzm.a.createBuilder();
        String str = ettdVar.a;
        etzkVar.copyOnWrite();
        etzm etzmVar = (etzm) etzkVar.instance;
        str.getClass();
        etzmVar.b = str;
        eyee eyeeVar = ettdVar.c;
        etzkVar.copyOnWrite();
        etzm etzmVar2 = (etzm) etzkVar.instance;
        eyeeVar.getClass();
        etzmVar2.c = eyeeVar;
        int i3 = ettdVar.f;
        etzkVar.copyOnWrite();
        ((etzm) etzkVar.instance).d = etzl.a(i3);
        etzrVar.copyOnWrite();
        etzs etzsVar = (etzs) etzrVar.instance;
        etzm etzmVar3 = (etzm) etzkVar.build();
        etzmVar3.getClass();
        etzsVar.c = etzmVar3;
        etzsVar.b |= 1;
        etzrVar.copyOnWrite();
        ((etzs) etzrVar.instance).d = etzn.a(i2);
        etzrVar.copyOnWrite();
        ((etzs) etzrVar.instance).e = i;
        euag euagVar = ettdVar.d;
        etzrVar.copyOnWrite();
        ((etzs) etzrVar.instance).f = euagVar.a();
        return (etzs) etzrVar.build();
    }

    public static void g(etzt etztVar) {
        if (etztVar == null || etztVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(defpackage.etzt r6) {
        /*
            eygr r6 = r6.c
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            etzs r0 = (defpackage.etzs) r0
            etzm r1 = r0.c
            if (r1 != 0) goto L18
            etzm r1 = defpackage.etzm.a
        L18:
            int r1 = r1.d
            int r1 = defpackage.etzl.b(r1)
            r2 = 4
            r3 = 3
            r4 = 2
            if (r1 != 0) goto L24
            goto L26
        L24:
            if (r1 == r4) goto L47
        L26:
            etzm r1 = r0.c
            if (r1 != 0) goto L2d
            etzm r5 = defpackage.etzm.a
            goto L2e
        L2d:
            r5 = r1
        L2e:
            int r5 = r5.d
            int r5 = defpackage.etzl.b(r5)
            if (r5 != 0) goto L37
            goto L39
        L37:
            if (r5 == r3) goto L47
        L39:
            if (r1 != 0) goto L3d
            etzm r1 = defpackage.etzm.a
        L3d:
            int r1 = r1.d
            int r1 = defpackage.etzl.b(r1)
            if (r1 == 0) goto L6
            if (r1 != r2) goto L6
        L47:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            etzm r0 = r0.c
            if (r0 != 0) goto L50
            etzm r1 = defpackage.etzm.a
            goto L51
        L50:
            r1 = r0
        L51:
            int r1 = r1.d
            int r1 = defpackage.etzl.b(r1)
            if (r1 != 0) goto L5a
            goto L66
        L5a:
            if (r1 == r4) goto L75
            if (r1 == r3) goto L72
            if (r1 == r2) goto L6f
            r2 = 5
            if (r1 == r2) goto L6c
            r2 = 6
            if (r1 == r2) goto L69
        L66:
            java.lang.String r1 = "UNRECOGNIZED"
            goto L77
        L69:
            java.lang.String r1 = "REMOTE"
            goto L77
        L6c:
            java.lang.String r1 = "ASYMMETRIC_PUBLIC"
            goto L77
        L6f:
            java.lang.String r1 = "ASYMMETRIC_PRIVATE"
            goto L77
        L72:
            java.lang.String r1 = "SYMMETRIC"
            goto L77
        L75:
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
        L77:
            if (r0 != 0) goto L7b
            etzm r0 = defpackage.etzm.a
        L7b:
            java.lang.String r0 = r0.b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r6.<init>(r0)
            throw r6
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etga.h(etzt):void");
    }

    private static etfs i(etzs etzsVar) {
        int i = etzsVar.e;
        euag b = euag.b(etzsVar.f);
        if (b == null) {
            b = euag.UNRECOGNIZED;
        }
        Integer valueOf = b == euag.RAW ? null : Integer.valueOf(i);
        etzm etzmVar = etzsVar.c;
        if (etzmVar == null) {
            etzmVar = etzm.a;
        }
        String str = etzmVar.b;
        etzm etzmVar2 = etzsVar.c;
        eyee eyeeVar = (etzmVar2 == null ? etzm.a : etzmVar2).c;
        if (etzmVar2 == null) {
            etzmVar2 = etzm.a;
        }
        int b2 = etzl.b(etzmVar2.d);
        if (b2 == 0) {
            b2 = 1;
        }
        euag b3 = euag.b(etzsVar.f);
        if (b3 == null) {
            b3 = euag.UNRECOGNIZED;
        }
        ettd a = ettd.a(str, eyeeVar, b2, b3, valueOf);
        etsh etshVar = etsh.a;
        return !((ettm) etshVar.b.get()).b.containsKey(new ettk(a.getClass(), a.b)) ? new etrr(a) : etshVar.a(a, etgk.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(etrh etrhVar, Class cls, Class cls2) {
        int i = etgn.a;
        etzt etztVar = this.a;
        int i2 = etztVar.b;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (etzs etzsVar : etztVar.c) {
            int i4 = etzsVar.d;
            int b = etzn.b(i4);
            if (b != 0 && b == 3) {
                if ((etzsVar.b & 1) == 0) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(etzsVar.e)));
                }
                euag b2 = euag.b(etzsVar.f);
                if (b2 == null) {
                    b2 = euag.UNRECOGNIZED;
                }
                if (b2 == euag.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(etzsVar.e)));
                }
                int b3 = etzn.b(i4);
                if (b3 != 0 && b3 == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(etzsVar.e)));
                }
                if (etzsVar.e == i2) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                etzm etzmVar = etzsVar.c;
                if (etzmVar == null) {
                    etzmVar = etzm.a;
                }
                int b4 = etzl.b(etzmVar.d);
                z2 &= b4 != 0 && b4 == 5;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        etsz etszVar = new etsz(cls2);
        etrt etrtVar = this.c;
        if (etszVar.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        etszVar.e = etrtVar;
        for (int i5 = 0; i5 < a(); i5++) {
            etzs etzsVar2 = (etzs) this.a.c.get(i5);
            int b5 = etzn.b(etzsVar2.d);
            if (b5 != 0 && b5 == 3) {
                etfz etfzVar = (etfz) this.b.get(i5);
                if (etfzVar == null) {
                    etzm etzmVar2 = etzsVar2.c;
                    if (etzmVar2 == null) {
                        etzmVar2 = etzm.a;
                    }
                    throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + etzmVar2.b + " failed, unable to get primitive");
                }
                etfs etfsVar = etfzVar.a;
                try {
                    Object b6 = etrhVar.b(etfsVar, cls2);
                    if (etzsVar2.e == this.a.b) {
                        etszVar.a(b6, etfsVar, etzsVar2, true);
                    } else {
                        etszVar.a(b6, etfsVar, etzsVar2, false);
                    }
                } catch (GeneralSecurityException e) {
                    String obj = cls2.toString();
                    etzm etzmVar3 = etzsVar2.c;
                    if (etzmVar3 == null) {
                        etzmVar3 = etzm.a;
                    }
                    throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + etzmVar3.b + ", see https://developers.google.com/tink/faq/registration_errors", e);
                }
            }
        }
        Map map = etszVar.b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        ettb ettbVar = new ettb(map, etszVar.c, etszVar.d, etszVar.e, etszVar.a);
        etszVar.b = null;
        return etrhVar.c(ettbVar, cls);
    }

    private static List k(etzt etztVar) {
        ArrayList arrayList = new ArrayList(etztVar.c.size());
        for (etzs etzsVar : etztVar.c) {
            int i = etzsVar.e;
            try {
                etfs i2 = i(etzsVar);
                int b = etzn.b(etzsVar.d);
                boolean z = true;
                if (b == 0) {
                    b = 1;
                }
                etfu l = l(b);
                if (i != etztVar.b) {
                    z = false;
                }
                arrayList.add(new etfz(i2, l, i, z));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static etfu l(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return etfu.a;
        }
        if (i2 == 2) {
            return etfu.b;
        }
        if (i2 == 3) {
            return etfu.c;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public final int a() {
        return this.b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final etga c() {
        etzs etzsVar;
        etfz etfzVar;
        if (this.a == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        etzq etzqVar = (etzq) etzt.a.createBuilder();
        ArrayList arrayList = new ArrayList(this.b.size());
        int i = 0;
        for (etfz etfzVar2 : this.b) {
            if (etfzVar2 != null) {
                Object obj = etfzVar2.a;
                if (obj instanceof etgg) {
                    etfs b = ((etgg) obj).b();
                    etfzVar = new etfz(b, etfzVar2.b, etfzVar2.c, etfzVar2.d);
                    etzsVar = e(b, etfzVar2.b, etfzVar2.c);
                    etzqVar.a(etzsVar);
                    arrayList.add(etfzVar);
                    i++;
                }
            }
            etzs etzsVar2 = (etzs) this.a.c.get(i);
            etzm etzmVar = etzsVar2.c;
            if (etzmVar == null) {
                etzmVar = etzm.a;
            }
            int b2 = etzl.b(etzmVar.d);
            if (b2 == 0 || b2 != 4) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            String str = etzmVar.b;
            eyee eyeeVar = etzmVar.c;
            int i2 = etgj.a;
            etft a = etri.a.a(str);
            if (!(a instanceof etrp)) {
                throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
            }
            etzm e = ((etrp) a).e(eyeeVar);
            etzr etzrVar = (etzr) etzsVar2.toBuilder();
            etzrVar.copyOnWrite();
            etzs etzsVar3 = (etzs) etzrVar.instance;
            e.getClass();
            etzsVar3.c = e;
            boolean z = true;
            etzsVar3.b |= 1;
            etzsVar = (etzs) etzrVar.build();
            try {
                etfs i3 = i(etzsVar);
                int i4 = etzsVar.e;
                int b3 = etzn.b(etzsVar.d);
                if (b3 == 0) {
                    b3 = 1;
                }
                etfu l = l(b3);
                if (i4 != this.a.b) {
                    z = false;
                }
                etfzVar = new etfz(i3, l, i4, z);
            } catch (GeneralSecurityException unused) {
                etfzVar = null;
            }
            etzqVar.a(etzsVar);
            arrayList.add(etfzVar);
            i++;
        }
        int i5 = this.a.b;
        etzqVar.copyOnWrite();
        ((etzt) etzqVar.instance).b = i5;
        return new etga((etzt) etzqVar.build(), arrayList, this.c);
    }

    public final Object f(etfn etfnVar, Class cls) {
        if (!(etfnVar instanceof etrh)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        etrh etrhVar = (etrh) etfnVar;
        Class a = etrhVar.a(cls);
        if (a != null) {
            return j(etrhVar, cls, a);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return etgn.a(this.a).toString();
    }

    private etga(etzt etztVar, List list) {
        this.a = etztVar;
        this.b = list;
        this.c = etrt.a;
    }
}
