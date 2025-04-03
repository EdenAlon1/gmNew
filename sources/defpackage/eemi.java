package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemi extends eemm {
    @Override // defpackage.eemm
    public final eeku b() {
        d(2080);
        while (this.a.o(0) != ',') {
            this.a.q(1);
        }
        this.a.a(44);
        this.a.a(32);
        try {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"));
            int parseInt = Integer.parseInt(this.a.d());
            if (parseInt <= 0 || parseInt > 31) {
                throw f("Bad day ");
            }
            calendar.set(5, parseInt);
            this.a.a(32);
            String lowerCase = this.a.f().toLowerCase(Locale.US);
            if (lowerCase.equals("jan")) {
                calendar.set(2, 0);
            } else if (lowerCase.equals("feb")) {
                calendar.set(2, 1);
            } else if (lowerCase.equals("mar")) {
                calendar.set(2, 2);
            } else if (lowerCase.equals("apr")) {
                calendar.set(2, 3);
            } else if (lowerCase.equals("may")) {
                calendar.set(2, 4);
            } else if (lowerCase.equals("jun")) {
                calendar.set(2, 5);
            } else if (lowerCase.equals("jul")) {
                calendar.set(2, 6);
            } else if (lowerCase.equals("aug")) {
                calendar.set(2, 7);
            } else if (lowerCase.equals("sep")) {
                calendar.set(2, 8);
            } else if (lowerCase.equals("oct")) {
                calendar.set(2, 9);
            } else if (lowerCase.equals("nov")) {
                calendar.set(2, 10);
            } else if (lowerCase.equals("dec")) {
                calendar.set(2, 11);
            }
            this.a.a(32);
            calendar.set(1, Integer.parseInt(this.a.d()));
            this.a.a(32);
            try {
                calendar.set(11, Integer.parseInt(this.a.d()));
                this.a.a(58);
                calendar.set(12, Integer.parseInt(this.a.d()));
                this.a.a(58);
                calendar.set(13, Integer.parseInt(this.a.d()));
                this.a.a(32);
                String lowerCase2 = this.a.f().toLowerCase(Locale.US);
                if (!"gmt".equals(lowerCase2)) {
                    throw f("Bad Time Zone ".concat(String.valueOf(lowerCase2)));
                }
                eekp eekpVar = new eekp();
                eekpVar.a = calendar;
                return eekpVar;
            } catch (Exception unused) {
                throw f("error processing time ");
            }
        } catch (Exception unused2) {
            throw f("bad date field");
        }
    }
}
