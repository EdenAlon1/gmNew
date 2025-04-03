package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewq extends ffkk implements ffji {
    final /* synthetic */ ewr a;
    final /* synthetic */ ffkx b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewq(int i, ewr ewrVar, ffkx ffkxVar) {
        super(1);
        this.c = i;
        this.a = ewrVar;
        this.b = ffkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        eyn eynVar;
        fgq fgqVar = (fgq) obj;
        jvu jvuVar = null;
        switch (this.c - 1) {
            case 0:
                fhy fhyVar = fgqVar.b;
                ewi ewiVar = ewi.a;
                fhyVar.a();
                if (fgqVar.g().length() > 0) {
                    if (!jpm.i(fgqVar.c)) {
                        if (!fgqVar.i()) {
                            int c = jpm.c(fgqVar.c);
                            fgqVar.h(c, c);
                            break;
                        } else {
                            int d = jpm.d(fgqVar.c);
                            fgqVar.h(d, d);
                            break;
                        }
                    } else {
                        ewiVar.invoke(fgqVar);
                        break;
                    }
                }
                break;
            case 1:
                fhy fhyVar2 = fgqVar.b;
                ewj ewjVar = ewj.a;
                fhyVar2.a();
                if (fgqVar.g().length() > 0) {
                    if (!jpm.i(fgqVar.c)) {
                        if (!fgqVar.i()) {
                            int d2 = jpm.d(fgqVar.c);
                            fgqVar.h(d2, d2);
                            break;
                        } else {
                            int c2 = jpm.c(fgqVar.c);
                            fgqVar.h(c2, c2);
                            break;
                        }
                    } else {
                        ewjVar.invoke(fgqVar);
                        break;
                    }
                }
                break;
            case 2:
                fgqVar.q();
                break;
            case 3:
                fgqVar.m();
                break;
            case 4:
                fgqVar.n();
                break;
            case 5:
                fgqVar.o();
                break;
            case 6:
                fgqVar.w();
                break;
            case 7:
                fgqVar.t();
                break;
            case 8:
                fgqVar.u();
                break;
            case 9:
                fgqVar.v();
                break;
            case 10:
                fgqVar.x();
                break;
            case 11:
                fgqVar.k();
                break;
            case 12:
                fgqVar.B();
                break;
            case 13:
                fgqVar.A();
                break;
            case 14:
                fgqVar.s();
                break;
            case 15:
                fgqVar.r();
                break;
            case 16:
                this.a.b.B(false);
                break;
            case 17:
                this.a.b.z();
                break;
            case 18:
                this.a.b.w();
                break;
            case 19:
                List z = fgqVar.z(ewk.a);
                if (z != null) {
                    this.a.b(z);
                    break;
                }
                break;
            case 20:
                List z2 = fgqVar.z(ewl.a);
                if (z2 != null) {
                    this.a.b(z2);
                    break;
                }
                break;
            case 21:
                List z3 = fgqVar.z(ewm.a);
                if (z3 != null) {
                    this.a.b(z3);
                    break;
                }
                break;
            case 22:
                List z4 = fgqVar.z(ewn.a);
                if (z4 != null) {
                    this.a.b(z4);
                    break;
                }
                break;
            case 23:
                List z5 = fgqVar.z(ewo.a);
                if (z5 != null) {
                    this.a.b(z5);
                    break;
                }
                break;
            case 24:
                List z6 = fgqVar.z(ewp.a);
                if (z6 != null) {
                    this.a.b(z6);
                    break;
                }
                break;
            case 25:
                fgqVar.b.a();
                if (fgqVar.g().length() > 0) {
                    fgqVar.h(0, fgqVar.g().length());
                    break;
                }
                break;
            case 26:
                fgqVar.l();
                fgqVar.j();
                break;
            case 27:
                fgqVar.p();
                fgqVar.j();
                break;
            case 28:
                fgqVar.x();
                fgqVar.j();
                break;
            case 29:
                fgqVar.k();
                fgqVar.j();
                break;
            case 30:
                fgqVar.B();
                fgqVar.j();
                break;
            case 31:
                fgqVar.A();
                fgqVar.j();
                break;
            case 32:
                fgqVar.s();
                fgqVar.j();
                break;
            case 33:
                fgqVar.r();
                fgqVar.j();
                break;
            case 34:
                fgqVar.m();
                fgqVar.j();
                break;
            case 35:
                fgqVar.q();
                fgqVar.j();
                break;
            case 36:
                fgqVar.n();
                fgqVar.j();
                break;
            case 37:
                fgqVar.o();
                fgqVar.j();
                break;
            case 38:
                fgqVar.w();
                fgqVar.j();
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                fgqVar.t();
                fgqVar.j();
                break;
            case 40:
                fgqVar.u();
                fgqVar.j();
                break;
            case 41:
                fgqVar.v();
                fgqVar.j();
                break;
            case 42:
                fgqVar.b.a();
                if (fgqVar.g().length() > 0) {
                    int a = jpm.a(fgqVar.c);
                    fgqVar.h(a, a);
                    break;
                }
                break;
            case 43:
                ewr ewrVar = this.a;
                if (!ewrVar.d) {
                    ewrVar.a(new juc("\n", 1));
                    break;
                } else {
                    ewrVar.a.q.invoke(new juu(ewrVar.k));
                    break;
                }
            case 44:
                ewr ewrVar2 = this.a;
                if (!ewrVar2.d) {
                    ewrVar2.a(new juc("\t", 1));
                    break;
                } else {
                    this.b.a = false;
                    break;
                }
            case 45:
                eyo eyoVar = this.a.g;
                if (eyoVar != null) {
                    eyoVar.b(fgqVar.y());
                }
                eyo eyoVar2 = this.a.g;
                if (eyoVar2 != null) {
                    eyn eynVar2 = eyoVar2.a;
                    if (eynVar2 != null && (eynVar = eynVar2.a) != null) {
                        eyoVar2.a = eynVar;
                        eyoVar2.c -= eynVar2.b.a().length();
                        eyoVar2.b = new eyn(eyoVar2.b, eynVar2.b);
                        jvuVar = eynVar.b;
                    }
                    if (jvuVar != null) {
                        this.a.j.invoke(jvuVar);
                        break;
                    }
                }
                break;
            default:
                eyo eyoVar3 = this.a.g;
                if (eyoVar3 != null) {
                    eyn eynVar3 = eyoVar3.b;
                    if (eynVar3 != null) {
                        eyoVar3.b = eynVar3.a;
                        jvu jvuVar2 = eynVar3.b;
                        eyoVar3.a = new eyn(eyoVar3.a, jvuVar2);
                        eyoVar3.c += jvuVar2.a().length();
                        jvuVar = eynVar3.b;
                    }
                    if (jvuVar != null) {
                        this.a.j.invoke(jvuVar);
                        break;
                    }
                }
                break;
        }
        return ffcu.a;
    }
}
