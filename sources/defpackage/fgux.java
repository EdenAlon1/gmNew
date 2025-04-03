package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgux extends fgvf {
    private static final long serialVersionUID = 7136072363141363141L;

    public fgux() {
        super(1, fhew.a());
    }

    protected fgux(TimeZone timeZone) {
        super(0, timeZone);
    }

    public fgux(long j, int i, TimeZone timeZone) {
        super(j, "yyyyMMdd", i, timeZone);
    }

    public fgux(String str) {
        super(1, fhew.a());
        try {
            setTime(this.b.parse(str).getTime());
        } catch (ParseException e) {
            if (fhel.b("ical4j.compatibility.vcard")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy'-'MM'-'dd");
                simpleDateFormat.setTimeZone(fhew.a());
                setTime(simpleDateFormat.parse(str).getTime());
                return;
            }
            throw e;
        }
    }
}
