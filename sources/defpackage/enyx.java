package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyx {
    public static int a(enyr enyrVar, enyr enyrVar2) {
        double a = enyrVar.a(enyrVar2);
        if (a > 4.057643110400022E-16d) {
            return 1;
        }
        return a < -4.057643110400022E-16d ? -1 : 0;
    }

    public static int b(enyr enyrVar, enyr enyrVar2, enyr enyrVar3) {
        double d;
        double sqrt;
        enyr enyrVar4 = enyrVar;
        enyr enyrVar5 = enyrVar3;
        int i = 0;
        if (!enyrVar.p(enyrVar2) && !enyrVar2.p(enyrVar3) && !enyrVar5.p(enyrVar4)) {
            enyr n = enyr.n(enyrVar2, enyrVar4);
            enyr n2 = enyr.n(enyrVar5, enyrVar2);
            enyr n3 = enyr.n(enyrVar4, enyrVar5);
            double e = n.e();
            double e2 = n2.e();
            double e3 = n3.e();
            if (e >= e2 && e >= e3) {
                d = -enyr.f(enyrVar5, n3, n2);
                sqrt = Math.sqrt(e3 * e2);
            } else if (e2 >= e3) {
                d = -enyr.f(enyrVar4, n, n3);
                sqrt = Math.sqrt(e * e3);
            } else {
                d = -enyr.f(enyrVar2, n2, n);
                sqrt = Math.sqrt(e2 * e);
            }
            double d2 = sqrt * 7.176703675781937E-16d;
            int i2 = enyy.a;
            int i3 = 1;
            if (d > d2) {
                i = 1;
            } else if (d < (-d2)) {
                i = -1;
            }
            if (i == 0) {
                int a = enxm.a(enyrVar, enyrVar2, enyrVar3);
                if (a != 0) {
                    return a;
                }
                int compareTo = enyrVar.compareTo(enyrVar2);
                int i4 = compareTo <= 0 ? 1 : -1;
                enyr enyrVar6 = compareTo > 0 ? enyrVar4 : enyrVar2;
                if (compareTo > 0) {
                    enyrVar4 = enyrVar2;
                }
                if (enyrVar6.compareTo(enyrVar5) > 0) {
                    i4 = -i4;
                } else {
                    enyr enyrVar7 = enyrVar6;
                    enyrVar6 = enyrVar5;
                    enyrVar5 = enyrVar7;
                }
                if (enyrVar4.compareTo(enyrVar5) > 0) {
                    i4 = -i4;
                    enyr enyrVar8 = enyrVar5;
                    enyrVar5 = enyrVar4;
                    enyrVar4 = enyrVar8;
                }
                if (!enyrVar4.p(enyrVar4) || !enyrVar5.p(enyrVar5) || !enyrVar6.p(enyrVar6)) {
                    return -i4;
                }
                enxh enxhVar = new enxh(enyrVar4);
                enxh enxhVar2 = new enxh(enyrVar5);
                enxh enxhVar3 = new enxh(enyrVar6);
                enxh a2 = enxhVar2.a(enxhVar3);
                int signum = a2.a.multiply(enxhVar.a).add(a2.b.multiply(enxhVar.b)).add(a2.c.multiply(enxhVar.c)).signum();
                if (signum != 0) {
                    return i4 * signum;
                }
                int signum2 = a2.c.signum();
                if (signum2 == 0 && (signum2 = a2.b.signum()) == 0) {
                    int signum3 = a2.a.signum();
                    if (signum3 == 0) {
                        signum3 = enxhVar3.a.multiply(enxhVar.b).subtract(enxhVar3.b.multiply(enxhVar.a)).signum();
                        if (signum3 == 0 && (signum3 = enxhVar3.a.signum()) == 0 && (signum3 = -enxhVar3.b.signum()) == 0) {
                            signum3 = enxhVar3.c.multiply(enxhVar.a).subtract(enxhVar3.a.multiply(enxhVar.c)).signum();
                            if (signum3 == 0) {
                                int signum4 = enxhVar3.c.signum();
                                if (signum4 == 0) {
                                    signum4 = enxhVar.a.multiply(enxhVar2.b).subtract(enxhVar.b.multiply(enxhVar2.a)).signum();
                                    if (signum4 == 0 && (signum4 = -enxhVar2.a.signum()) == 0) {
                                        int signum5 = enxhVar2.b.signum();
                                        if (signum5 != 0 || (signum5 = enxhVar.a.signum()) != 0) {
                                            i3 = signum5;
                                        }
                                    }
                                }
                                i3 = signum4;
                            }
                        }
                    }
                    i3 = signum3;
                } else {
                    i3 = signum2;
                }
                return i4 * i3;
            }
        }
        return i;
    }
}
