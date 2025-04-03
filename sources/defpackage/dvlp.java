package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvlp extends dvjv {
    static final emwd a = new dvlm();
    static final emwd b = new dvli();
    static final emwd c = new dvlb();
    static final emwd d = new dvlv();
    static final emwd e = new dvlc();
    static final emwl f = new dvlo();
    static final emwd g = new dvla();

    @Override // defpackage.dvjv
    public final void a(eyaj eyajVar, evxn evxnVar) {
        emwd emwdVar = c;
        eyac eyacVar = eyajVar.k;
        if (eyacVar == null) {
            eyacVar = eyac.a;
        }
        eyaa b2 = eyaa.b(eyacVar.e);
        if (b2 == null) {
            b2 = eyaa.ALIGNMENT_UNSPECIFIED;
        }
        evxk evxkVar = (evxk) emwdVar.fP(b2);
        evxnVar.copyOnWrite();
        evxu evxuVar = (evxu) evxnVar.instance;
        evxu evxuVar2 = evxu.a;
        evxuVar.j = evxkVar.d;
        evxuVar.b |= 16;
    }

    @Override // defpackage.dvjv
    public final void b(eyaj eyajVar, evxn evxnVar) {
        emwd emwdVar = b;
        eyac eyacVar = eyajVar.k;
        if (eyacVar == null) {
            eyacVar = eyac.a;
        }
        exzy exzyVar = eyacVar.d;
        if (exzyVar == null) {
            exzyVar = exzy.a;
        }
        exzv b2 = exzv.b(exzyVar.g);
        if (b2 == null) {
            b2 = exzv.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        evxm evxmVar = (evxm) emwdVar.fP(b2);
        evxnVar.copyOnWrite();
        evxu evxuVar = (evxu) evxnVar.instance;
        evxu evxuVar2 = evxu.a;
        evxuVar.i = evxmVar.d;
        evxuVar.b |= 8;
    }

    @Override // defpackage.dvjv
    public final void c(eyaj eyajVar, evxn evxnVar) {
        fauw fauwVar = eyajVar.g;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evxnVar.copyOnWrite();
        evxu evxuVar = (evxu) evxnVar.instance;
        evxu evxuVar2 = evxu.a;
        str.getClass();
        evxuVar.b |= 2;
        evxuVar.f = str;
    }

    @Override // defpackage.dvjv
    public final void d(eyaj eyajVar, evxn evxnVar) {
        fauw fauwVar = eyajVar.f;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evxnVar.copyOnWrite();
        evxu evxuVar = (evxu) evxnVar.instance;
        evxu evxuVar2 = evxu.a;
        str.getClass();
        evxuVar.b |= 1;
        evxuVar.e = str;
    }

    @Override // defpackage.dvjv
    public final void e(eyaj eyajVar, evxn evxnVar) {
        int i = eyajVar.c;
        if (i == 8) {
            evxnVar.copyOnWrite();
            evxu evxuVar = (evxu) evxnVar.instance;
            evxu evxuVar2 = evxu.a;
            evxuVar.l = 1;
            evxuVar.b |= 128;
            return;
        }
        if (i == 9) {
            evxnVar.copyOnWrite();
            evxu evxuVar3 = (evxu) evxnVar.instance;
            evxu evxuVar4 = evxu.a;
            evxuVar3.l = 2;
            evxuVar3.b |= 128;
            return;
        }
        evxnVar.copyOnWrite();
        evxu evxuVar5 = (evxu) evxnVar.instance;
        evxu evxuVar6 = evxu.a;
        evxuVar5.l = 0;
        evxuVar5.b |= 128;
    }

    @Override // defpackage.dvjv
    public final void f(eyaj eyajVar, evxn evxnVar) {
        int a2 = eyai.a(eyajVar.e);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            evxnVar.copyOnWrite();
            evxu evxuVar = (evxu) evxnVar.instance;
            evxu evxuVar2 = evxu.a;
            evxuVar.m = 6;
            evxuVar.b |= 256;
            return;
        }
        if (i != 2) {
            evxnVar.copyOnWrite();
            evxu evxuVar3 = (evxu) evxnVar.instance;
            evxu evxuVar4 = evxu.a;
            evxuVar3.m = 0;
            evxuVar3.b |= 256;
            return;
        }
        evxnVar.copyOnWrite();
        evxu evxuVar5 = (evxu) evxnVar.instance;
        evxu evxuVar6 = evxu.a;
        evxuVar5.m = 4;
        evxuVar5.b |= 256;
    }

    @Override // defpackage.dvjv
    public final void g(eyaj eyajVar, evxn evxnVar) {
        if ((eyajVar.b & 16) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            emwd emwdVar = a;
            exzp exzpVar = eyajVar.i;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            evwv evwvVar = (evwv) emwdVar.fP(exzpVar);
            evzkVar.copyOnWrite();
            evzn evznVar = (evzn) evzkVar.instance;
            evwvVar.getClass();
            evznVar.d = evwvVar;
            evznVar.b |= 2;
            evzm evzmVar = evzm.LIGHT;
            evzkVar.copyOnWrite();
            evzn evznVar2 = (evzn) evzkVar.instance;
            evznVar2.c = evzmVar.d;
            evznVar2.b |= 1;
            if (eyajVar.c == 9) {
                evxx evxxVar = (evxx) evxy.a.createBuilder();
                String str = (eyajVar.c == 9 ? (eyag) eyajVar.d : eyag.a).b;
                evxxVar.copyOnWrite();
                evxy evxyVar = (evxy) evxxVar.instance;
                str.getClass();
                evxyVar.b = 1;
                evxyVar.c = str;
                evzkVar.copyOnWrite();
                evzn evznVar3 = (evzn) evzkVar.instance;
                evxy evxyVar2 = (evxy) evxxVar.build();
                evxyVar2.getClass();
                evznVar3.e = evxyVar2;
                evznVar3.b |= 4;
            }
            if (eyajVar.c == 8) {
                evxx evxxVar2 = (evxx) evxy.a.createBuilder();
                String str2 = (eyajVar.c == 8 ? (eyag) eyajVar.d : eyag.a).b;
                evxxVar2.copyOnWrite();
                evxy evxyVar3 = (evxy) evxxVar2.instance;
                str2.getClass();
                evxyVar3.b = 1;
                evxyVar3.c = str2;
                evzkVar.copyOnWrite();
                evzn evznVar4 = (evzn) evzkVar.instance;
                evxy evxyVar4 = (evxy) evxxVar2.build();
                evxyVar4.getClass();
                evznVar4.e = evxyVar4;
                evznVar4.b |= 4;
            }
            evxnVar.a(evzkVar);
        }
        if ((eyajVar.b & 32) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            emwd emwdVar2 = a;
            exzp exzpVar2 = eyajVar.j;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            evwv evwvVar2 = (evwv) emwdVar2.fP(exzpVar2);
            evzkVar2.copyOnWrite();
            evzn evznVar5 = (evzn) evzkVar2.instance;
            evwvVar2.getClass();
            evznVar5.d = evwvVar2;
            evznVar5.b |= 2;
            evzm evzmVar2 = evzm.DARK;
            evzkVar2.copyOnWrite();
            evzn evznVar6 = (evzn) evzkVar2.instance;
            evznVar6.c = evzmVar2.d;
            evznVar6.b |= 1;
            if (eyajVar.c == 9) {
                evxx evxxVar3 = (evxx) evxy.a.createBuilder();
                String str3 = (eyajVar.c == 9 ? (eyag) eyajVar.d : eyag.a).c;
                evxxVar3.copyOnWrite();
                evxy evxyVar5 = (evxy) evxxVar3.instance;
                str3.getClass();
                evxyVar5.b = 1;
                evxyVar5.c = str3;
                evzkVar2.copyOnWrite();
                evzn evznVar7 = (evzn) evzkVar2.instance;
                evxy evxyVar6 = (evxy) evxxVar3.build();
                evxyVar6.getClass();
                evznVar7.e = evxyVar6;
                evznVar7.b |= 4;
            }
            if (eyajVar.c == 8) {
                evxx evxxVar4 = (evxx) evxy.a.createBuilder();
                String str4 = (eyajVar.c == 8 ? (eyag) eyajVar.d : eyag.a).c;
                evxxVar4.copyOnWrite();
                evxy evxyVar7 = (evxy) evxxVar4.instance;
                str4.getClass();
                evxyVar7.b = 1;
                evxyVar7.c = str4;
                evzkVar2.copyOnWrite();
                evzn evznVar8 = (evzn) evzkVar2.instance;
                evxy evxyVar8 = (evxy) evxxVar4.build();
                evxyVar8.getClass();
                evznVar8.e = evxyVar8;
                evznVar8.b |= 4;
            }
            evxnVar.a(evzkVar2);
        }
    }

    @Override // defpackage.dvjv
    public final void h(eyaj eyajVar, evxn evxnVar) {
        int a2;
        eyac eyacVar = eyajVar.k;
        if (eyacVar == null) {
            eyacVar = eyac.a;
        }
        exzs exzsVar = eyacVar.c;
        if (exzsVar == null) {
            exzsVar = exzs.a;
        }
        evxh evxhVar = (evxh) evxi.a.createBuilder();
        emwd emwdVar = g;
        exzn b2 = exzn.b(exzsVar.g);
        if (b2 == null) {
            b2 = exzn.USER_ACTION_UNSPECIFIED;
        }
        evxg evxgVar = (evxg) emwdVar.fP(b2);
        evxhVar.copyOnWrite();
        evxi evxiVar = (evxi) evxhVar.instance;
        evxiVar.e = evxgVar.f;
        evxiVar.b |= 1;
        fauw fauwVar = exzsVar.c;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evxhVar.copyOnWrite();
        evxi evxiVar2 = (evxi) evxhVar.instance;
        str.getClass();
        evxiVar2.b |= 2;
        evxiVar2.f = str;
        int i = true != exzsVar.d ? 1 : 2;
        evxhVar.copyOnWrite();
        evxi evxiVar3 = (evxi) evxhVar.instance;
        evxiVar3.j = i - 1;
        evxiVar3.b |= 16;
        if ((exzsVar.b & 4) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            evzm evzmVar = evzm.LIGHT;
            evzkVar.copyOnWrite();
            evzn evznVar = (evzn) evzkVar.instance;
            evznVar.c = evzmVar.d;
            evznVar.b |= 1;
            emwd emwdVar2 = a;
            exzp exzpVar = exzsVar.e;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            evwv evwvVar = (evwv) emwdVar2.fP(exzpVar);
            evzkVar.copyOnWrite();
            evzn evznVar2 = (evzn) evzkVar.instance;
            evwvVar.getClass();
            evznVar2.d = evwvVar;
            evznVar2.b |= 2;
            evxhVar.a(evzkVar);
        }
        if ((exzsVar.b & 8) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            evzm evzmVar2 = evzm.DARK;
            evzkVar2.copyOnWrite();
            evzn evznVar3 = (evzn) evzkVar2.instance;
            evznVar3.c = evzmVar2.d;
            evznVar3.b |= 1;
            emwd emwdVar3 = a;
            exzp exzpVar2 = exzsVar.f;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            evwv evwvVar2 = (evwv) emwdVar3.fP(exzpVar2);
            evzkVar2.copyOnWrite();
            evzn evznVar4 = (evzn) evzkVar2.instance;
            evwvVar2.getClass();
            evznVar4.d = evwvVar2;
            evznVar4.b |= 2;
            evxhVar.a(evzkVar2);
        }
        evxnVar.b((evxi) evxhVar.build());
        eyac eyacVar2 = eyajVar.k;
        if (((eyacVar2 == null ? eyac.a : eyacVar2).b & 2) != 0) {
            if (eyacVar2 == null) {
                eyacVar2 = eyac.a;
            }
            exzy exzyVar = eyacVar2.d;
            if (exzyVar == null) {
                exzyVar = exzy.a;
            }
            evxh evxhVar2 = (evxh) evxi.a.createBuilder();
            exzn b3 = exzn.b(exzyVar.j);
            if (b3 == null) {
                b3 = exzn.USER_ACTION_UNSPECIFIED;
            }
            evxg evxgVar2 = (evxg) emwdVar.fP(b3);
            evxhVar2.copyOnWrite();
            evxi evxiVar4 = (evxi) evxhVar2.instance;
            evxiVar4.e = evxgVar2.f;
            evxiVar4.b |= 1;
            fauw fauwVar2 = exzyVar.e;
            if (fauwVar2 == null) {
                fauwVar2 = fauw.a;
            }
            String str2 = fauwVar2.b;
            evxhVar2.copyOnWrite();
            evxi evxiVar5 = (evxi) evxhVar2.instance;
            str2.getClass();
            evxiVar5.b |= 2;
            evxiVar5.f = str2;
            int i2 = true != exzyVar.f ? 1 : 2;
            evxhVar2.copyOnWrite();
            evxi evxiVar6 = (evxi) evxhVar2.instance;
            evxiVar6.j = i2 - 1;
            evxiVar6.b |= 16;
            if ((exzyVar.b & 8) != 0) {
                evzk evzkVar3 = (evzk) evzn.a.createBuilder();
                evzm evzmVar3 = evzm.LIGHT;
                evzkVar3.copyOnWrite();
                evzn evznVar5 = (evzn) evzkVar3.instance;
                evznVar5.c = evzmVar3.d;
                evznVar5.b |= 1;
                emwd emwdVar4 = a;
                exzp exzpVar3 = exzyVar.h;
                if (exzpVar3 == null) {
                    exzpVar3 = exzp.a;
                }
                evwv evwvVar3 = (evwv) emwdVar4.fP(exzpVar3);
                evzkVar3.copyOnWrite();
                evzn evznVar6 = (evzn) evzkVar3.instance;
                evwvVar3.getClass();
                evznVar6.d = evwvVar3;
                evznVar6.b |= 2;
                evxhVar2.a(evzkVar3);
            }
            if ((exzyVar.b & 16) != 0) {
                evzk evzkVar4 = (evzk) evzn.a.createBuilder();
                evzm evzmVar4 = evzm.DARK;
                evzkVar4.copyOnWrite();
                evzn evznVar7 = (evzn) evzkVar4.instance;
                evznVar7.c = evzmVar4.d;
                evznVar7.b |= 1;
                emwd emwdVar5 = a;
                exzp exzpVar4 = exzyVar.i;
                if (exzpVar4 == null) {
                    exzpVar4 = exzp.a;
                }
                evwv evwvVar4 = (evwv) emwdVar5.fP(exzpVar4);
                evzkVar4.copyOnWrite();
                evzn evznVar8 = (evzn) evzkVar4.instance;
                evwvVar4.getClass();
                evznVar8.d = evwvVar4;
                evznVar8.b |= 2;
                evxhVar2.a(evzkVar4);
            }
            if (exzyVar.c == 3) {
                evvx evvxVar = (evvx) e.fP((eybq) exzyVar.d);
                evxhVar2.copyOnWrite();
                evxi evxiVar7 = (evxi) evxhVar2.instance;
                evvxVar.getClass();
                evxiVar7.d = evvxVar;
                evxiVar7.c = 8;
            }
            if (exzyVar.c == 14) {
                Object apply = f.apply((eyby) exzyVar.d);
                evxhVar2.copyOnWrite();
                evxi evxiVar8 = (evxi) evxhVar2.instance;
                apply.getClass();
                evxiVar8.d = apply;
                evxiVar8.c = 14;
            }
            evxi evxiVar9 = (evxi) evxhVar2.build();
            int i3 = exzyVar.k;
            int a3 = exzx.a(i3);
            if ((a3 == 0 || a3 != 2) && (a2 = exzx.a(i3)) != 0 && a2 != 1) {
                evxnVar.b(evxiVar9);
                return;
            }
            evxnVar.copyOnWrite();
            evxu evxuVar = (evxu) evxnVar.instance;
            evxu evxuVar2 = evxu.a;
            evxiVar9.getClass();
            evxuVar.a();
            evxuVar.h.add(0, evxiVar9);
        }
    }
}
