package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxu {
    public static final ecxu a = new ecxu(ecxq.a, ecxm.a);
    public final ecxq b;
    public final ecxm c;

    private ecxu(ecxq ecxqVar, ecxm ecxmVar) {
        ecxqVar.getClass();
        this.b = ecxqVar;
        this.c = ecxmVar;
    }

    public static ecxu c(eyel eyelVar) {
        long j;
        String str;
        ecxp ecxpVar;
        int k = eyelVar.k();
        if (k > 1) {
            throw new eygu(a.f(k, "Unsupported version: ", ". Current version is: 1"));
        }
        eyelVar.k();
        int e = eyelVar.e(eyelVar.n());
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        ecxm ecxmVar = (ecxm) eyfy.parseFrom(ecxm.a, eyelVar, eyfc.a);
        eyelVar.A(e);
        byte[] F = eyelVar.F();
        ecxo ecxoVar = new ecxo();
        try {
            ecxoVar.a.setInput(F);
            try {
                eyel K = eyel.K(new ecxn(ecxoVar));
                ecxq ecxqVar = ecxq.a;
                int j2 = K.j();
                if (j2 < 0) {
                    throw new eygu("Negative number of flags");
                }
                enja enjaVar = new enja(enoe.a);
                long j3 = 0;
                for (int i = 0; i < j2; i++) {
                    long r = K.r();
                    int i2 = (int) r;
                    long j4 = r >>> 3;
                    if (j4 == 0) {
                        j = 0;
                        str = K.x();
                    } else {
                        long j5 = j4 + j3;
                        if (j5 > 2305843009213693951L) {
                            throw new eygu("Flag name larger than max size");
                        }
                        j = j5;
                        str = null;
                    }
                    int i3 = i2 & 7;
                    if (i3 == 0 || i3 == 1) {
                        ecxpVar = new ecxp(j, str, i3, 0L, null);
                    } else if (i3 == 2) {
                        ecxpVar = new ecxp(j, str, i3, K.r(), null);
                    } else if (i3 == 3) {
                        ecxpVar = new ecxp(j, str, i3, Double.doubleToRawLongBits(K.b()), null);
                    } else if (i3 == 4) {
                        ecxpVar = new ecxp(j, str, i3, 0L, K.x());
                    } else {
                        if (i3 != 5) {
                            throw new eygu("Unrecognized flag type " + i3);
                        }
                        ecxpVar = new ecxp(j, str, i3, 0L, K.F());
                    }
                    ecxp ecxpVar2 = ecxpVar;
                    long j6 = ecxpVar2.a;
                    if (j6 != 0) {
                        j3 = j6;
                    }
                    enjaVar.m(ecxpVar2);
                }
                ecxq ecxqVar2 = new ecxq(enjaVar.g());
                ecxoVar.close();
                return new ecxu(ecxqVar2, ecxmVar);
            } finally {
                ecxoVar.a.reset();
            }
        } finally {
        }
    }

    public final long a() {
        return this.c.e;
    }

    public final ecxq b() {
        enhk b;
        long j;
        if (this.c.f.size() <= 0) {
            return this.b;
        }
        ecxq ecxqVar = this.b;
        Collection<ecxb> values = DesugarCollections.unmodifiableMap(this.c.f).values();
        int i = 0;
        if (values == null) {
            b = enoz.a;
        } else {
            enhd enhdVar = new enhd();
            for (ecxb ecxbVar : values) {
                int i2 = ecxbVar.c;
                int a2 = ecxa.a(i2);
                if (a2 == 0) {
                    throw null;
                }
                int i3 = a2 - 1;
                if (i3 == 0) {
                    enhdVar.k(ecxbVar.e, Long.valueOf(i2 == 1 ? ((Long) ecxbVar.d).longValue() : 0L));
                } else if (i3 == 1) {
                    enhdVar.k(ecxbVar.e, Boolean.valueOf(i2 == 2 ? ((Boolean) ecxbVar.d).booleanValue() : false));
                } else if (i3 == 2) {
                    enhdVar.k(ecxbVar.e, Double.valueOf(i2 == 3 ? ((Double) ecxbVar.d).doubleValue() : eobe.a));
                } else if (i3 == 3) {
                    enhdVar.k(ecxbVar.e, i2 == 4 ? (String) ecxbVar.d : "");
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(ecxbVar.e)));
                    }
                    enhdVar.k(ecxbVar.e, (i2 == 5 ? (eyee) ecxbVar.d : eyee.b).I());
                }
            }
            b = enhdVar.b();
        }
        if (b.isEmpty()) {
            return ecxqVar;
        }
        HashMap hashMap = new HashMap(b);
        enja enjaVar = new enja(enoe.a);
        enqu listIterator = ecxqVar.b.listIterator();
        while (listIterator.hasNext()) {
            ecxp ecxpVar = (ecxp) listIterator.next();
            Object remove = hashMap.remove(ecxpVar.c());
            if (remove == null) {
                enjaVar.m(ecxpVar);
            } else if (remove instanceof String) {
                enjaVar.m(new ecxp(ecxpVar.a, ecxpVar.b, 4, 0L, remove));
            } else if (remove instanceof byte[]) {
                enjaVar.m(new ecxp(ecxpVar.a, ecxpVar.b, 5, 0L, remove));
            } else if (remove instanceof Boolean) {
                enjaVar.m(new ecxp(ecxpVar.a, ecxpVar.b, ((Boolean) remove).booleanValue() ? 1 : 0, 0L, null));
            } else if (remove instanceof Long) {
                enjaVar.m(new ecxp(ecxpVar.a, ecxpVar.b, 2, ((Long) remove).longValue(), null));
            } else {
                if (!(remove instanceof Double)) {
                    throw new IllegalStateException("Cannot serialize override for existing flag " + ecxpVar.c() + ": " + remove.toString());
                }
                enjaVar.m(new ecxp(ecxpVar.a, ecxpVar.b, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), null));
            }
        }
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            int length = str.length();
            if (length <= 19 && length != 0) {
                long charAt = str.charAt(i) - '0';
                if (charAt >= 1 && charAt <= 9) {
                    int i4 = 1;
                    while (true) {
                        if (i4 < length) {
                            int charAt2 = str.charAt(i4) - '0';
                            if (((charAt2 < 0 ? 1 : i) | (charAt2 > 9 ? 1 : 0)) != 0) {
                                break;
                            }
                            charAt = (charAt * 10) + charAt2;
                            i4++;
                            i = 0;
                        } else if (charAt >= 0 && charAt <= 2305843009213693951L) {
                            j = charAt;
                        }
                    }
                }
            }
            j = 0;
            String str2 = j == 0 ? str : null;
            if (obj instanceof String) {
                enjaVar.m(new ecxp(j, str2, 4, 0L, obj));
            } else if (obj instanceof byte[]) {
                enjaVar.m(new ecxp(j, str2, 5, 0L, obj));
            } else if (obj instanceof Boolean) {
                enjaVar.m(new ecxp(j, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
            } else if (obj instanceof Long) {
                enjaVar.m(new ecxp(j, str2, 2, ((Long) obj).longValue(), null));
            } else {
                if (!(obj instanceof Double)) {
                    throw new IllegalStateException("Cannot serialize override " + str + ": " + String.valueOf(obj));
                }
                enjaVar.m(new ecxp(j, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
            }
            i = 0;
        }
        return new ecxq(enjaVar.g());
    }

    public final eyee d() {
        return this.c.c;
    }

    public final String e() {
        return this.c.d;
    }

    public final String f() {
        return this.c.b;
    }

    public final Map g() {
        if (this.c.f.size() == 0) {
            return null;
        }
        return DesugarCollections.unmodifiableMap(this.c.f);
    }
}
