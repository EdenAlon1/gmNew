package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhb {
    final /* synthetic */ nhd a;

    public nhb(nhd nhdVar) {
        this.a = nhdVar;
    }

    public final void a(int i, long j) {
        nhd nhdVar = this.a;
        if (i == 20529) {
            if (j != 0) {
                throw new lrg(a.y(j, "ContentEncodingOrder ", " not supported"), null, true, 1);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw new lrg(a.y(j, "ContentEncodingScope ", " not supported"), null, true, 1);
            }
            return;
        }
        switch (i) {
            case 131:
                nhdVar.i(i).e = (int) j;
                return;
            case 136:
                nhdVar.i(i).X = j == 1;
                return;
            case 155:
                nhdVar.u = nhdVar.h(j);
                return;
            case 159:
                nhdVar.i(i).Q = (int) j;
                return;
            case 176:
                nhdVar.i(i).n = (int) j;
                return;
            case 179:
                nhdVar.j(i);
                nhdVar.r.b(nhdVar.h(j));
                return;
            case 186:
                nhdVar.i(i).o = (int) j;
                return;
            case 215:
                nhdVar.i(i).d = (int) j;
                return;
            case 231:
                nhdVar.q = nhdVar.h(j);
                return;
            case 238:
                nhdVar.v = (int) j;
                return;
            case 241:
                if (nhdVar.t) {
                    return;
                }
                nhdVar.j(i);
                nhdVar.s.b(j);
                nhdVar.t = true;
                return;
            case 251:
                nhdVar.w = true;
                return;
            case 16871:
                nhdVar.i(i).h = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw new lrg(a.y(j, "ContentCompAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw new lrg(a.y(j, "DocTypeReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw new lrg(a.y(j, "EBMLReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw new lrg(a.y(j, "ContentEncAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw new lrg(a.y(j, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                }
                return;
            case 21420:
                nhdVar.n = j + nhdVar.f;
                return;
            case 21432:
                int i2 = (int) j;
                nhdVar.k(i);
                if (i2 == 0) {
                    nhdVar.k.y = 0;
                    return;
                }
                if (i2 == 1) {
                    nhdVar.k.y = 2;
                    return;
                } else if (i2 == 3) {
                    nhdVar.k.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    nhdVar.k.y = 3;
                    return;
                }
            case 21680:
                nhdVar.i(i).q = (int) j;
                return;
            case 21682:
                nhdVar.i(i).s = (int) j;
                return;
            case 21690:
                nhdVar.i(i).r = (int) j;
                return;
            case 21930:
                nhdVar.i(i).W = j == 1;
                return;
            case 21938:
                nhdVar.k(i);
                nhc nhcVar = nhdVar.k;
                nhcVar.z = true;
                nhcVar.p = (int) j;
                return;
            case 21998:
                nhdVar.i(i).g = (int) j;
                return;
            case 22186:
                nhdVar.i(i).T = j;
                return;
            case 22203:
                nhdVar.i(i).U = j;
                return;
            case 25188:
                nhdVar.i(i).R = (int) j;
                return;
            case 30114:
                nhdVar.x = j;
                return;
            case 30321:
                int i3 = (int) j;
                nhdVar.k(i);
                if (i3 == 0) {
                    nhdVar.k.t = 0;
                    return;
                }
                if (i3 == 1) {
                    nhdVar.k.t = 1;
                    return;
                } else if (i3 == 2) {
                    nhdVar.k.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    nhdVar.k.t = 3;
                    return;
                }
            case 2352003:
                nhdVar.i(i).f = (int) j;
                return;
            case 2807729:
                nhdVar.g = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        nhdVar.k(i);
                        if (i4 == 1) {
                            nhdVar.k.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            nhdVar.k.C = 1;
                            return;
                        }
                    case 21946:
                        nhdVar.k(i);
                        int b = lpo.b((int) j);
                        if (b != -1) {
                            nhdVar.k.B = b;
                            return;
                        }
                        return;
                    case 21947:
                        nhdVar.k(i);
                        nhdVar.k.z = true;
                        int a = lpo.a((int) j);
                        if (a != -1) {
                            nhdVar.k.A = a;
                            return;
                        }
                        return;
                    case 21948:
                        nhdVar.i(i).D = (int) j;
                        return;
                    case 21949:
                        nhdVar.i(i).E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void b(int i, long j, long j2) {
        nhd nhdVar = this.a;
        nhdVar.l();
        if (i == 160) {
            nhdVar.w = false;
            nhdVar.x = 0L;
            return;
        }
        if (i == 174) {
            nhdVar.k = new nhc();
            nhdVar.k.a = nhdVar.j;
            return;
        }
        if (i == 187) {
            nhdVar.t = false;
            return;
        }
        if (i == 19899) {
            nhdVar.m = -1;
            nhdVar.n = -1L;
            return;
        }
        if (i == 20533) {
            nhdVar.i(i).i = true;
            return;
        }
        if (i == 21968) {
            nhdVar.i(i).z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = nhdVar.f;
            if (j3 != -1 && j3 != j) {
                throw new lrg("Multiple Segment elements not supported", null, true, 1);
            }
            nhdVar.f = j;
            nhdVar.e = j2;
            return;
        }
        if (i == 475249515) {
            nhdVar.r = new luk();
            nhdVar.s = new luk();
        } else if (i == 524531317 && !nhdVar.l) {
            if (nhdVar.d && nhdVar.p != -1) {
                nhdVar.o = true;
            } else {
                nhdVar.y.w(new ndm(nhdVar.i));
                nhdVar.l = true;
            }
        }
    }
}
