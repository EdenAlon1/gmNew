package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evop extends evlf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        char c;
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        evplVar.m();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (evplVar.t() != 4) {
            String h = evplVar.h();
            int c2 = evplVar.c();
            switch (h.hashCode()) {
                case -1181204563:
                    if (h.equals("dayOfMonth")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1074026988:
                    if (h.equals("minute")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -906279820:
                    if (h.equals("second")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3704893:
                    if (h.equals("year")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104080000:
                    if (h.equals("month")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 985252545:
                    if (h.equals("hourOfDay")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i = c2;
            } else if (c == 1) {
                i2 = c2;
            } else if (c == 2) {
                i3 = c2;
            } else if (c == 3) {
                i4 = c2;
            } else if (c == 4) {
                i5 = c2;
            } else if (c == 5) {
                i6 = c2;
            }
        }
        evplVar.o();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        if (((Calendar) obj) == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("year");
        evpnVar.k(r4.get(1));
        evpnVar.i("month");
        evpnVar.k(r4.get(2));
        evpnVar.i("dayOfMonth");
        evpnVar.k(r4.get(5));
        evpnVar.i("hourOfDay");
        evpnVar.k(r4.get(11));
        evpnVar.i("minute");
        evpnVar.k(r4.get(12));
        evpnVar.i("second");
        evpnVar.k(r4.get(13));
        evpnVar.h();
    }
}
