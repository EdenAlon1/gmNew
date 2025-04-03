package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eur implements eum {
    @Override // defpackage.eum
    public final int a(KeyEvent keyEvent) {
        int i;
        int i2;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long b = iiz.b(keyEvent);
            if (iiw.a(b, evo.i)) {
                i = 41;
            } else if (iiw.a(b, evo.j)) {
                i = 42;
            } else if (iiw.a(b, evo.k)) {
                i = 33;
            } else {
                if (iiw.a(b, evo.l)) {
                    i = 34;
                }
                i = 0;
            }
        } else {
            if (keyEvent.isAltPressed()) {
                long b2 = iiz.b(keyEvent);
                if (iiw.a(b2, evo.i)) {
                    i = 9;
                } else if (iiw.a(b2, evo.j)) {
                    i = 10;
                } else if (iiw.a(b2, evo.k)) {
                    i = 15;
                } else if (iiw.a(b2, evo.l)) {
                    i = 16;
                }
            }
            i = 0;
        }
        if (i != 0) {
            return i;
        }
        eum eumVar = euq.a;
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long b3 = iiz.b(keyEvent);
            if (iiw.a(b3, evo.i)) {
                i2 = 35;
            } else if (iiw.a(b3, evo.j)) {
                i2 = 36;
            } else if (iiw.a(b3, evo.k)) {
                i2 = 38;
            } else {
                if (iiw.a(b3, evo.l)) {
                    i2 = 37;
                }
                i2 = 0;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long b4 = iiz.b(keyEvent);
            if (iiw.a(b4, evo.i)) {
                i2 = 4;
            } else if (iiw.a(b4, evo.j)) {
                i2 = 3;
            } else if (iiw.a(b4, evo.k)) {
                i2 = 6;
            } else if (iiw.a(b4, evo.l)) {
                i2 = 5;
            } else if (iiw.a(b4, evo.c)) {
                i2 = 20;
            } else if (iiw.a(b4, evo.u)) {
                i2 = 23;
            } else if (iiw.a(b4, evo.t)) {
                i2 = 22;
            } else {
                if (iiw.a(b4, evo.h)) {
                    i2 = 43;
                }
                i2 = 0;
            }
        } else if (keyEvent.isShiftPressed()) {
            long b5 = iiz.b(keyEvent);
            if (iiw.a(b5, evo.o)) {
                i2 = 39;
            } else {
                if (iiw.a(b5, evo.p)) {
                    i2 = 40;
                }
                i2 = 0;
            }
        } else {
            if (keyEvent.isAltPressed()) {
                long b6 = iiz.b(keyEvent);
                if (iiw.a(b6, evo.t)) {
                    i2 = 24;
                } else if (iiw.a(b6, evo.u)) {
                    i2 = 25;
                }
            }
            i2 = 0;
        }
        if (i2 != 0) {
            return i2;
        }
        eun eunVar = (eun) ((eup) eumVar).a;
        if (((Boolean) ((ffku) eunVar.a).a(new iix(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
            return iiw.a(iiz.b(keyEvent), evo.g) ? 47 : 0;
        }
        if (((Boolean) ((ffku) eunVar.a).a(new iix(keyEvent))).booleanValue()) {
            long b7 = iiz.b(keyEvent);
            if (iiw.a(b7, evo.b) || iiw.a(b7, evo.q)) {
                return 17;
            }
            if (iiw.a(b7, evo.d)) {
                return 18;
            }
            if (iiw.a(b7, evo.f)) {
                return 19;
            }
            if (iiw.a(b7, evo.a)) {
                return 26;
            }
            if (iiw.a(b7, evo.e)) {
                return 47;
            }
            return iiw.a(b7, evo.g) ? 46 : 0;
        }
        if (keyEvent.isCtrlPressed()) {
            return 0;
        }
        if (keyEvent.isShiftPressed()) {
            long b8 = iiz.b(keyEvent);
            if (iiw.a(b8, evo.i)) {
                return 27;
            }
            if (iiw.a(b8, evo.j)) {
                return 28;
            }
            if (iiw.a(b8, evo.k)) {
                return 29;
            }
            if (iiw.a(b8, evo.l)) {
                return 30;
            }
            if (iiw.a(b8, evo.m)) {
                return 31;
            }
            if (iiw.a(b8, evo.n)) {
                return 32;
            }
            if (iiw.a(b8, evo.o)) {
                return 39;
            }
            if (iiw.a(b8, evo.p)) {
                return 40;
            }
            return iiw.a(b8, evo.q) ? 18 : 0;
        }
        long b9 = iiz.b(keyEvent);
        if (iiw.a(b9, evo.i)) {
            return 1;
        }
        if (iiw.a(b9, evo.j)) {
            return 2;
        }
        if (iiw.a(b9, evo.k)) {
            return 11;
        }
        if (iiw.a(b9, evo.l)) {
            return 12;
        }
        if (iiw.a(b9, evo.m)) {
            return 13;
        }
        if (iiw.a(b9, evo.n)) {
            return 14;
        }
        if (iiw.a(b9, evo.o)) {
            return 7;
        }
        if (iiw.a(b9, evo.p)) {
            return 8;
        }
        if (iiw.a(b9, evo.r) || iiw.a(b9, evo.s)) {
            return 44;
        }
        if (iiw.a(b9, evo.t)) {
            return 20;
        }
        if (iiw.a(b9, evo.u)) {
            return 21;
        }
        if (iiw.a(b9, evo.v)) {
            return 18;
        }
        if (iiw.a(b9, evo.w)) {
            return 19;
        }
        if (iiw.a(b9, evo.x)) {
            return 17;
        }
        return iiw.a(b9, evo.y) ? 45 : 0;
    }
}
