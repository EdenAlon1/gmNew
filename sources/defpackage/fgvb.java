package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvb extends fgux {
    private static final fgva c;
    private static final fgva d;
    private static final fgva e;
    private static final fgva f;
    private static final fgva g;
    private static final long serialVersionUID = -6407231357919440387L;
    public fgza a;
    private fgyz h;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(fhew.a);
        simpleDateFormat.setLenient(false);
        c = new fgva(simpleDateFormat);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        simpleDateFormat2.setLenient(false);
        d = new fgva(simpleDateFormat2);
        e = new fgva(new SimpleDateFormat("yyyyMMdd'T'HHmmss"));
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat3.setLenient(true);
        f = new fgva(simpleDateFormat3);
        g = new fgva(new SimpleDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'Z'"));
    }

    public fgvb() {
        super(TimeZone.getDefault());
        this.h = new fgyz(getTime(), this.b.getTimeZone());
    }

    private final void d() {
        this.b.setTimeZone(fgza.getDefault());
    }

    private final void e(String str, DateFormat dateFormat, TimeZone timeZone) {
        if (timeZone != null) {
            dateFormat.setTimeZone(timeZone);
        }
        setTime(dateFormat.parse(str).getTime());
    }

    public final void a(fgza fgzaVar) {
        this.a = fgzaVar;
        if (fgzaVar != null) {
            this.b.setTimeZone(fgzaVar);
        } else {
            d();
        }
        this.h = new fgyz(this.h, this.b.getTimeZone(), false);
    }

    public final void b(boolean z) {
        this.a = null;
        if (z) {
            this.b.setTimeZone(fhew.a);
        } else {
            d();
        }
        this.h = new fgyz(this.h, this.b.getTimeZone(), z);
    }

    public final boolean c() {
        return this.h.a;
    }

    @Override // java.util.Date
    public final boolean equals(Object obj) {
        if (!(obj instanceof fgvb)) {
            return super.equals(obj);
        }
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.h, ((fgvb) obj).h);
        return fhozVar.a;
    }

    @Override // defpackage.fgvf, java.util.Date
    public final void setTime(long j) {
        super.setTime(j);
        fgyz fgyzVar = this.h;
        if (fgyzVar != null) {
            fgyzVar.setTime(j);
        }
    }

    @Override // defpackage.fgvf, java.util.Date
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        stringBuffer.append('T');
        stringBuffer.append(this.h.toString());
        return stringBuffer.toString();
    }

    public fgvb(long j) {
        super(j, 0, TimeZone.getDefault());
        this.h = new fgyz(j, this.b.getTimeZone());
    }

    public fgvb(String str) {
        this(str, null);
    }

    public fgvb(String str, fgza fgzaVar) {
        super(0L, 0, fgzaVar != null ? fgzaVar : TimeZone.getDefault());
        this.h = new fgyz(getTime(), this.b.getTimeZone());
        try {
            if (str.endsWith("Z")) {
                e(str, c.a(), null);
                b(true);
            } else {
                if (fgzaVar != null) {
                    e(str, d.a(), fgzaVar);
                } else {
                    e(str, e.a(), this.b.getTimeZone());
                }
                a(fgzaVar);
            }
        } catch (ParseException e2) {
            if (fhel.b("ical4j.compatibility.vcard")) {
                try {
                    e(str, g.a(), fgzaVar);
                    a(fgzaVar);
                    return;
                } catch (ParseException unused) {
                    if (fhel.b("ical4j.parsing.relaxed") && str.indexOf("-") == -1) {
                        e(str, f.a(), fgzaVar);
                        a(fgzaVar);
                        return;
                    }
                    return;
                }
            }
            if (fhel.b("ical4j.parsing.relaxed") && str.indexOf("-") == -1) {
                e(str, f.a(), fgzaVar);
                a(fgzaVar);
                return;
            }
            throw e2;
        }
    }

    public fgvb(Date date) {
        super(date.getTime(), 0, TimeZone.getDefault());
        this.h = new fgyz(date.getTime(), this.b.getTimeZone());
        if (date instanceof fgvb) {
            fgvb fgvbVar = (fgvb) date;
            if (fgvbVar.c()) {
                b(true);
            } else {
                a(fgvbVar.a);
            }
        }
    }

    public fgvb(byte[] bArr) {
        this();
        b(true);
    }
}
