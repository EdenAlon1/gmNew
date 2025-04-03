package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguu {
    public static final fguu a = new fguu();

    private fguu() {
    }

    public static final fgut a(String str) {
        fgyw fgywVar = new fgyw();
        if ("VALARM".equals(str)) {
            return new fgzq(fgywVar);
        }
        if ("VEVENT".equals(str)) {
            return new fhaa(fgywVar);
        }
        if ("VFREEBUSY".equals(str)) {
            return new fhae(fgywVar);
        }
        if ("VJOURNAL".equals(str)) {
            return new fhai(fgywVar);
        }
        if ("VTODO".equals(str)) {
            return new fhas(fgywVar);
        }
        if ("STANDARD".equals(str)) {
            return new fgzl(fgywVar);
        }
        if ("DAYLIGHT".equals(str)) {
            return new fgzj(fgywVar);
        }
        if ("VTIMEZONE".equals(str)) {
            return new fhaj(fgywVar);
        }
        if ("VVENUE".equals(str)) {
            return new fhat(fgywVar);
        }
        if ("VAVAILABILITY".equals(str)) {
            return new fgzr(fgywVar);
        }
        if ("AVAILABLE".equals(str)) {
            return new fgzh(fgywVar);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new fhau(str, fgywVar);
        }
        if (fhel.b("ical4j.parsing.relaxed")) {
            return new fhau(str, fgywVar);
        }
        throw new IllegalArgumentException(a.a(str, "Illegal component [", "]"));
    }
}
