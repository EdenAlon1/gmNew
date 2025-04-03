package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nej implements nec {
    public final engw a;
    public final int b;

    private nej(int i, engw engwVar) {
        this.b = i;
        this.a = engwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static nej c(int i, luv luvVar) {
        nec nekVar;
        String str;
        engr engrVar = new engr();
        int i2 = luvVar.c;
        int i3 = -2;
        while (luvVar.b() > 8) {
            int f = luvVar.f();
            int f2 = luvVar.b + luvVar.f();
            luvVar.J(f2);
            if (f != 1414744396) {
                switch (f) {
                    case 1718776947:
                        if (i3 == 2) {
                            luvVar.L(4);
                            int f3 = luvVar.f();
                            int f4 = luvVar.f();
                            luvVar.L(4);
                            int f5 = luvVar.f();
                            switch (f5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                lqb lqbVar = new lqb();
                                lqbVar.t = f3;
                                lqbVar.u = f4;
                                lqbVar.c(str);
                                nekVar = new nek(new lqc(lqbVar));
                                break;
                            } else {
                                luj.f("StreamFormatChunk", a.h(f5, "Ignoring track with unsupported compression "));
                                nekVar = null;
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int h = luvVar.h();
                                String str2 = h != 1 ? h != 85 ? h != 255 ? h != 8192 ? h != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int h2 = luvVar.h();
                                    int f6 = luvVar.f();
                                    luvVar.L(6);
                                    int m = lvf.m(luvVar.h());
                                    int h3 = luvVar.b() > 0 ? luvVar.h() : 0;
                                    lqb lqbVar2 = new lqb();
                                    lqbVar2.c(str2);
                                    lqbVar2.C = h2;
                                    lqbVar2.D = f6;
                                    if (str2.equals("audio/raw") && m != 0) {
                                        lqbVar2.E = m;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && h3 > 0) {
                                        byte[] bArr = new byte[h3];
                                        luvVar.F(bArr, 0, h3);
                                        lqbVar2.p = engw.r(bArr);
                                    }
                                    nekVar = new nek(new lqc(lqbVar2));
                                    break;
                                } else {
                                    luj.f("StreamFormatChunk", a.h(h, "Ignoring track with unsupported format tag "));
                                }
                            } else {
                                luj.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(lvf.L(i3)));
                            }
                            nekVar = null;
                        }
                    case 1751742049:
                        int f7 = luvVar.f();
                        luvVar.L(8);
                        int f8 = luvVar.f();
                        int f9 = luvVar.f();
                        luvVar.L(4);
                        luvVar.f();
                        luvVar.L(12);
                        nekVar = new neg(f7, f8, f9);
                        break;
                    case 1752331379:
                        int f10 = luvVar.f();
                        luvVar.L(12);
                        luvVar.f();
                        int f11 = luvVar.f();
                        int f12 = luvVar.f();
                        luvVar.L(4);
                        int f13 = luvVar.f();
                        int f14 = luvVar.f();
                        luvVar.L(4);
                        nekVar = new neh(f10, f11, f12, f13, f14, luvVar.f());
                        break;
                    case 1852994675:
                        nekVar = new nel(luvVar.y(luvVar.b()));
                        break;
                    default:
                        nekVar = null;
                        break;
                }
            } else {
                nekVar = c(luvVar.f(), luvVar);
            }
            if (nekVar != null) {
                if (nekVar.a() == 1752331379) {
                    i3 = ((neh) nekVar).b();
                }
                engrVar.h(nekVar);
            }
            luvVar.K(f2);
            luvVar.J(i2);
        }
        return new nej(i, engrVar.g());
    }

    @Override // defpackage.nec
    public final int a() {
        return this.b;
    }

    public final nec b(Class cls) {
        nec necVar;
        int i = 0;
        do {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return null;
            }
            necVar = (nec) engwVar.get(i);
            i++;
        } while (necVar.getClass() != cls);
        return necVar;
    }
}
