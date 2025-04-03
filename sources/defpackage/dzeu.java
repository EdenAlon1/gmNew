package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzeu {
    public static dzrw a(final dzja dzjaVar, final Context context, fbnn fbnnVar, final String str, final dzhn dzhnVar) {
        dzir dzirVar = new dzir();
        dzirVar.b(dyhx.c(fbnnVar.b, new emwl() { // from class: dzeq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbnf fbnfVar = (fbnf) obj;
                dzit dzitVar = new dzit();
                dzitVar.e(fbnfVar.c);
                dzitVar.f(fbnfVar.g);
                int i = fbnfVar.b & 1;
                final dzja dzjaVar2 = dzja.this;
                final String str2 = str;
                final dzhn dzhnVar2 = dzhnVar;
                if (i != 0) {
                    fbnr fbnrVar = fbnfVar.d;
                    if (fbnrVar == null) {
                        fbnrVar = fbnr.a;
                    }
                    dzrq a = dzrq.a(fbnrVar.b);
                    if (a.equals(dzrq.UNKNOWN)) {
                        dzhl r = dzhm.r();
                        r.g(24);
                        r.n(dzjaVar2.c().f());
                        r.o(dzjaVar2.d().E());
                        r.p(str2);
                        r.f(114);
                        dzhnVar2.b(r.a());
                    }
                    dzitVar.d(a);
                }
                if (fbnfVar.e.size() != 0) {
                    dzitVar.c(dyhx.c(fbnfVar.e, new emwl() { // from class: dzej
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fbnp fbnpVar = (fbnp) obj2;
                            int i2 = fbnpVar.d;
                            int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 4 : 3 : 2;
                            if (i3 == 0) {
                                i3 = 1;
                            }
                            int i4 = i3 - 2;
                            if (i4 == 1) {
                                return new dzlf((fbnpVar.b == 2 ? (fbnl) fbnpVar.c : fbnl.a).b);
                            }
                            if (i4 == 2) {
                                return dzle.a;
                            }
                            dzhn dzhnVar3 = dzhnVar2;
                            String str3 = str2;
                            dzja dzjaVar3 = dzja.this;
                            dzhl r2 = dzhm.r();
                            r2.g(24);
                            r2.n(dzjaVar3.c().f());
                            r2.o(dzjaVar3.d().E());
                            r2.p(str3);
                            r2.f(115);
                            dzhnVar3.b(r2.a());
                            return dzlg.a;
                        }
                    }));
                }
                if (fbnfVar.f.size() != 0) {
                    dzitVar.b(dyhx.c(fbnfVar.f, new emwl() { // from class: dzek
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fbnh fbnhVar = (fbnh) obj2;
                            dziv dzivVar = new dziv();
                            dzivVar.c(fbnhVar.b);
                            dzivVar.b(fbnhVar.c);
                            eygr eygrVar = fbnhVar.d;
                            final dzja dzjaVar3 = dzja.this;
                            final String str3 = str2;
                            final dzhn dzhnVar3 = dzhnVar2;
                            dzivVar.d(dyhx.c(eygrVar, new emwl() { // from class: dzei
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    int i2;
                                    int i3;
                                    fbnt fbntVar = (fbnt) obj3;
                                    switch (fbntVar.d) {
                                        case 0:
                                            i2 = 2;
                                            break;
                                        case 1:
                                            i2 = 3;
                                            break;
                                        case 2:
                                            i2 = 4;
                                            break;
                                        case 3:
                                            i2 = 5;
                                            break;
                                        case 4:
                                            i2 = 6;
                                            break;
                                        case 5:
                                            i2 = 7;
                                            break;
                                        case 6:
                                            i2 = 8;
                                            break;
                                        case 7:
                                            i2 = 9;
                                            break;
                                        case 8:
                                            i2 = 10;
                                            break;
                                        case 9:
                                            i2 = 11;
                                            break;
                                        case 10:
                                            i2 = 12;
                                            break;
                                        case 11:
                                            i2 = 13;
                                            break;
                                        case 12:
                                            i2 = 14;
                                            break;
                                        case 13:
                                            i2 = 15;
                                            break;
                                        default:
                                            i2 = 0;
                                            break;
                                    }
                                    if (i2 == 0) {
                                        i2 = 1;
                                    }
                                    final dzhn dzhnVar4 = dzhnVar3;
                                    final String str4 = str3;
                                    final dzja dzjaVar4 = dzja.this;
                                    switch (i2 - 2) {
                                        case 1:
                                            return new dzlj();
                                        case 2:
                                            return new dzln();
                                        case 3:
                                            return new dzlt();
                                        case 4:
                                            return new dzlp();
                                        case 5:
                                            return new dzlr();
                                        case 6:
                                            return new dzlq();
                                        case 7:
                                            return new dzlk(dzds.a(fbntVar.b == 8 ? (faul) fbntVar.c : faul.a));
                                        case 8:
                                            return new dzli(dzds.a(fbntVar.b == 9 ? (faul) fbntVar.c : faul.a));
                                        case 9:
                                            return new dzlo(fbntVar.b == 10 ? ((Integer) fbntVar.c).intValue() : 0);
                                        case 10:
                                            return dzlw.a(dyhx.c((fbntVar.b == 11 ? (fbnv) fbntVar.c : fbnv.a).b, new emwl() { // from class: dzes
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    dzrv a2 = dzrv.a(((fbnx) obj4).b);
                                                    if (a2.equals(dzrv.UNKNOWN)) {
                                                        dzhn dzhnVar5 = dzhnVar4;
                                                        String str5 = str4;
                                                        dzja dzjaVar5 = dzja.this;
                                                        dzhl r2 = dzhm.r();
                                                        r2.g(24);
                                                        r2.n(dzjaVar5.c().f());
                                                        r2.o(dzjaVar5.d().E());
                                                        r2.p(str5);
                                                        r2.f(113);
                                                        dzhnVar5.b(r2.a());
                                                    }
                                                    return a2;
                                                }
                                            }));
                                        case 11:
                                            if (fbntVar.b == 12) {
                                                int intValue = ((Integer) fbntVar.c).intValue();
                                                i3 = intValue != 0 ? intValue != 1 ? intValue != 2 ? 0 : 4 : 3 : 2;
                                                if (i3 == 0) {
                                                    i3 = 1;
                                                }
                                            } else {
                                                i3 = 2;
                                            }
                                            int i4 = i3 - 2;
                                            if (i4 == 1) {
                                                r11 = 1;
                                            } else if (i4 == 2) {
                                                r11 = 2;
                                            }
                                            return new dzll(r11);
                                        case 12:
                                            fbnj fbnjVar = fbntVar.b == 13 ? (fbnj) fbntVar.c : fbnj.a;
                                            dzoe dzoeVar = new dzoe();
                                            dzoeVar.b(fbnjVar.b);
                                            return new dzlm(dzoeVar.a());
                                        default:
                                            dzhl r2 = dzhm.r();
                                            r2.g(24);
                                            r2.n(dzjaVar4.c().f());
                                            r2.o(dzjaVar4.d().E());
                                            r2.p(str4);
                                            r2.f(116);
                                            dzhnVar4.b(r2.a());
                                            return new dzlu();
                                    }
                                }
                            }));
                            return dzivVar.a();
                        }
                    }));
                }
                return dzitVar.a();
            }
        }));
        return dzirVar.a();
    }

    public static fbnn b(dzrw dzrwVar) {
        fbnm fbnmVar = (fbnm) fbnn.a.createBuilder();
        engw c = dyhx.c(dzrwVar.a(), new emwl() { // from class: dzep
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final dzrh dzrhVar = (dzrh) obj;
                final fbne fbneVar = (fbne) fbnf.a.createBuilder();
                String e = dzrhVar.e();
                fbneVar.copyOnWrite();
                ((fbnf) fbneVar.instance).c = e;
                dyht.b(dzrhVar.d(), new ksp() { // from class: dzel
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        boolean booleanValue = ((Boolean) dzrhVar.d().c()).booleanValue();
                        fbne fbneVar2 = fbne.this;
                        fbneVar2.copyOnWrite();
                        fbnf fbnfVar = (fbnf) fbneVar2.instance;
                        fbnf fbnfVar2 = fbnf.a;
                        fbnfVar.g = booleanValue;
                    }
                });
                dyht.b(dzrhVar.c(), new ksp() { // from class: dzem
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int i = ((dzrq) obj2).g;
                        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 7 : 6 : 5 : 4 : 3 : 2;
                        fbne fbneVar2 = fbne.this;
                        fbnq fbnqVar = (fbnq) fbnr.a.createBuilder();
                        fbnqVar.copyOnWrite();
                        ((fbnr) fbnqVar.instance).b = i2 - 2;
                        fbnr fbnrVar = (fbnr) fbnqVar.build();
                        fbneVar2.copyOnWrite();
                        fbnf fbnfVar = (fbnf) fbneVar2.instance;
                        fbnf fbnfVar2 = fbnf.a;
                        fbnrVar.getClass();
                        fbnfVar.d = fbnrVar;
                        fbnfVar.b |= 1;
                    }
                });
                emxc b = dzrhVar.b();
                int i = engw.d;
                engw engwVar = (engw) b.e(enou.a);
                if (!engwVar.isEmpty()) {
                    engw c2 = dyhx.c(engwVar, new emwl() { // from class: dzen
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dzrm dzrmVar = (dzrm) obj2;
                            int ordinal = dzrmVar.a().ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    dyhr.f("RichTextProtoConvUtils", "Unable to convert rich text line style to proto: ".concat(String.valueOf(String.valueOf(dzrmVar.a()))));
                                    return fbnp.a;
                                }
                                fbno fbnoVar = (fbno) fbnp.a.createBuilder();
                                fbnoVar.copyOnWrite();
                                ((fbnp) fbnoVar.instance).d = fbkb.a(4);
                                fbnd fbndVar = fbnd.a;
                                fbnoVar.copyOnWrite();
                                fbnp fbnpVar = (fbnp) fbnoVar.instance;
                                fbndVar.getClass();
                                fbnpVar.c = fbndVar;
                                fbnpVar.b = 3;
                                return (fbnp) fbnoVar.build();
                            }
                            fbno fbnoVar2 = (fbno) fbnp.a.createBuilder();
                            fbnoVar2.copyOnWrite();
                            ((fbnp) fbnoVar2.instance).d = fbkb.a(3);
                            fbnk fbnkVar = (fbnk) fbnl.a.createBuilder();
                            int b2 = dzrmVar.b();
                            fbnkVar.copyOnWrite();
                            ((fbnl) fbnkVar.instance).b = b2;
                            fbnoVar2.copyOnWrite();
                            fbnp fbnpVar2 = (fbnp) fbnoVar2.instance;
                            fbnl fbnlVar = (fbnl) fbnkVar.build();
                            fbnlVar.getClass();
                            fbnpVar2.c = fbnlVar;
                            fbnpVar2.b = 2;
                            return (fbnp) fbnoVar2.build();
                        }
                    });
                    fbneVar.copyOnWrite();
                    fbnf fbnfVar = (fbnf) fbneVar.instance;
                    eygr eygrVar = fbnfVar.e;
                    if (!eygrVar.c()) {
                        fbnfVar.e = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(c2, fbnfVar.e);
                }
                engw engwVar2 = (engw) dzrhVar.a().e(enou.a);
                if (!engwVar2.isEmpty()) {
                    engw c3 = dyhx.c(engwVar2, new emwl() { // from class: dzeo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dzrj dzrjVar = (dzrj) obj2;
                            fbng fbngVar = (fbng) fbnh.a.createBuilder();
                            int b2 = dzrjVar.b();
                            fbngVar.copyOnWrite();
                            ((fbnh) fbngVar.instance).b = b2;
                            int a = dzrjVar.a();
                            fbngVar.copyOnWrite();
                            ((fbnh) fbngVar.instance).c = a;
                            engw c4 = dyhx.c(dzrjVar.c(), new emwl() { // from class: dzet
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    dzrr dzrrVar = (dzrr) obj3;
                                    int i2 = 4;
                                    switch (dzrrVar.b().ordinal()) {
                                        case 1:
                                            fbns fbnsVar = (fbns) fbnt.a.createBuilder();
                                            fbnsVar.copyOnWrite();
                                            ((fbnt) fbnsVar.instance).d = fbkc.a(3);
                                            fbnsVar.copyOnWrite();
                                            fbnt fbntVar = (fbnt) fbnsVar.instance;
                                            fbntVar.b = 2;
                                            fbntVar.c = true;
                                            return (fbnt) fbnsVar.build();
                                        case 2:
                                            fbns fbnsVar2 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar2.copyOnWrite();
                                            ((fbnt) fbnsVar2.instance).d = fbkc.a(4);
                                            fbnsVar2.copyOnWrite();
                                            fbnt fbntVar2 = (fbnt) fbnsVar2.instance;
                                            fbntVar2.b = 3;
                                            fbntVar2.c = true;
                                            return (fbnt) fbnsVar2.build();
                                        case 3:
                                            fbns fbnsVar3 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar3.copyOnWrite();
                                            ((fbnt) fbnsVar3.instance).d = fbkc.a(5);
                                            fbnsVar3.copyOnWrite();
                                            fbnt fbntVar3 = (fbnt) fbnsVar3.instance;
                                            fbntVar3.b = 4;
                                            fbntVar3.c = true;
                                            return (fbnt) fbnsVar3.build();
                                        case 4:
                                            fbns fbnsVar4 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar4.copyOnWrite();
                                            ((fbnt) fbnsVar4.instance).d = fbkc.a(6);
                                            fbnsVar4.copyOnWrite();
                                            fbnt fbntVar4 = (fbnt) fbnsVar4.instance;
                                            fbntVar4.b = 5;
                                            fbntVar4.c = true;
                                            return (fbnt) fbnsVar4.build();
                                        case 5:
                                            fbns fbnsVar5 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar5.copyOnWrite();
                                            ((fbnt) fbnsVar5.instance).d = fbkc.a(7);
                                            fbnsVar5.copyOnWrite();
                                            fbnt fbntVar5 = (fbnt) fbnsVar5.instance;
                                            fbntVar5.b = 6;
                                            fbntVar5.c = true;
                                            return (fbnt) fbnsVar5.build();
                                        case 6:
                                            fbns fbnsVar6 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar6.copyOnWrite();
                                            ((fbnt) fbnsVar6.instance).d = fbkc.a(8);
                                            fbnsVar6.copyOnWrite();
                                            fbnt fbntVar6 = (fbnt) fbnsVar6.instance;
                                            fbntVar6.b = 7;
                                            fbntVar6.c = true;
                                            return (fbnt) fbnsVar6.build();
                                        case 7:
                                            fbns fbnsVar7 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar7.copyOnWrite();
                                            ((fbnt) fbnsVar7.instance).d = fbkc.a(9);
                                            faul b3 = dzds.b(dzrrVar.d());
                                            fbnsVar7.copyOnWrite();
                                            fbnt fbntVar7 = (fbnt) fbnsVar7.instance;
                                            b3.getClass();
                                            fbntVar7.c = b3;
                                            fbntVar7.b = 8;
                                            return (fbnt) fbnsVar7.build();
                                        case 8:
                                            fbns fbnsVar8 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar8.copyOnWrite();
                                            ((fbnt) fbnsVar8.instance).d = fbkc.a(10);
                                            faul b4 = dzds.b(dzrrVar.a());
                                            fbnsVar8.copyOnWrite();
                                            fbnt fbntVar8 = (fbnt) fbnsVar8.instance;
                                            b4.getClass();
                                            fbntVar8.c = b4;
                                            fbntVar8.b = 9;
                                            return (fbnt) fbnsVar8.build();
                                        case 9:
                                            fbns fbnsVar9 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar9.copyOnWrite();
                                            ((fbnt) fbnsVar9.instance).d = fbkc.a(11);
                                            int h = dzrrVar.h();
                                            fbnsVar9.copyOnWrite();
                                            fbnt fbntVar9 = (fbnt) fbnsVar9.instance;
                                            fbntVar9.b = 10;
                                            fbntVar9.c = Integer.valueOf(h);
                                            return (fbnt) fbnsVar9.build();
                                        case 10:
                                            fbns fbnsVar10 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar10.copyOnWrite();
                                            ((fbnt) fbnsVar10.instance).d = fbkc.a(12);
                                            fbnu fbnuVar = (fbnu) fbnv.a.createBuilder();
                                            engw c5 = dyhx.c(dzrrVar.l(), new emwl() { // from class: dzer
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    int i3;
                                                    dzrv dzrvVar = (dzrv) obj4;
                                                    switch (dzrvVar.j) {
                                                        case 0:
                                                            i3 = 2;
                                                            break;
                                                        case 1:
                                                            i3 = 3;
                                                            break;
                                                        case 2:
                                                            i3 = 4;
                                                            break;
                                                        case 3:
                                                            i3 = 5;
                                                            break;
                                                        case 4:
                                                            i3 = 6;
                                                            break;
                                                        case 5:
                                                            i3 = 7;
                                                            break;
                                                        case 6:
                                                            i3 = 8;
                                                            break;
                                                        case 7:
                                                            i3 = 9;
                                                            break;
                                                        default:
                                                            i3 = 0;
                                                            break;
                                                    }
                                                    if (i3 == 0) {
                                                        dyhr.f("RichTextProtoConvUtils", "Unrecognized typeface with weight type: ".concat(String.valueOf(String.valueOf(dzrvVar))));
                                                        return fbnx.a;
                                                    }
                                                    fbnw fbnwVar = (fbnw) fbnx.a.createBuilder();
                                                    fbnwVar.copyOnWrite();
                                                    ((fbnx) fbnwVar.instance).b = i3 - 2;
                                                    return (fbnx) fbnwVar.build();
                                                }
                                            });
                                            fbnuVar.copyOnWrite();
                                            fbnv fbnvVar = (fbnv) fbnuVar.instance;
                                            eygr eygrVar2 = fbnvVar.b;
                                            if (!eygrVar2.c()) {
                                                fbnvVar.b = eyfy.mutableCopy(eygrVar2);
                                            }
                                            eydl.addAll(c5, fbnvVar.b);
                                            fbnsVar10.copyOnWrite();
                                            fbnt fbntVar10 = (fbnt) fbnsVar10.instance;
                                            fbnv fbnvVar2 = (fbnv) fbnuVar.build();
                                            fbnvVar2.getClass();
                                            fbntVar10.c = fbnvVar2;
                                            fbntVar10.b = 11;
                                            return (fbnt) fbnsVar10.build();
                                        case 11:
                                            fbns fbnsVar11 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar11.copyOnWrite();
                                            ((fbnt) fbnsVar11.instance).d = fbkc.a(13);
                                            int e2 = dzrrVar.e();
                                            if (e2 == 1) {
                                                i2 = 3;
                                            } else if (e2 != 2) {
                                                i2 = 2;
                                            }
                                            fbnsVar11.copyOnWrite();
                                            fbnt fbntVar11 = (fbnt) fbnsVar11.instance;
                                            fbntVar11.c = Integer.valueOf(i2 - 2);
                                            fbntVar11.b = 12;
                                            return (fbnt) fbnsVar11.build();
                                        case 12:
                                            fbns fbnsVar12 = (fbns) fbnt.a.createBuilder();
                                            fbnsVar12.copyOnWrite();
                                            ((fbnt) fbnsVar12.instance).d = fbkc.a(14);
                                            String str = ((dzof) dzrrVar.f()).a;
                                            fbni fbniVar = (fbni) fbnj.a.createBuilder();
                                            fbniVar.copyOnWrite();
                                            ((fbnj) fbniVar.instance).b = str;
                                            fbnj fbnjVar = (fbnj) fbniVar.build();
                                            fbnsVar12.copyOnWrite();
                                            fbnt fbntVar12 = (fbnt) fbnsVar12.instance;
                                            fbnjVar.getClass();
                                            fbntVar12.c = fbnjVar;
                                            fbntVar12.b = 13;
                                            return (fbnt) fbnsVar12.build();
                                        default:
                                            dyhr.f("RichTextProtoConvUtils", "Unable to convert rich text style to proto: ".concat(String.valueOf(String.valueOf(dzrrVar.b()))));
                                            return fbnt.a;
                                    }
                                }
                            });
                            fbngVar.copyOnWrite();
                            fbnh fbnhVar = (fbnh) fbngVar.instance;
                            eygr eygrVar2 = fbnhVar.d;
                            if (!eygrVar2.c()) {
                                fbnhVar.d = eyfy.mutableCopy(eygrVar2);
                            }
                            eydl.addAll(c4, fbnhVar.d);
                            return (fbnh) fbngVar.build();
                        }
                    });
                    fbneVar.copyOnWrite();
                    fbnf fbnfVar2 = (fbnf) fbneVar.instance;
                    eygr eygrVar2 = fbnfVar2.f;
                    if (!eygrVar2.c()) {
                        fbnfVar2.f = eyfy.mutableCopy(eygrVar2);
                    }
                    eydl.addAll(c3, fbnfVar2.f);
                }
                return (fbnf) fbneVar.build();
            }
        });
        fbnmVar.copyOnWrite();
        fbnn fbnnVar = (fbnn) fbnmVar.instance;
        eygr eygrVar = fbnnVar.b;
        if (!eygrVar.c()) {
            fbnnVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(c, fbnnVar.b);
        return (fbnn) fbnmVar.build();
    }
}
