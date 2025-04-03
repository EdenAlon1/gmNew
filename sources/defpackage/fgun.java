package defpackage;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgun extends DateFormat {
    private static final TimeZone c = TimeZone.getDefault();
    private static final long serialVersionUID = -4191402739860280205L;
    public boolean a = true;
    public TimeZone b = c;
    private final String d;

    public fgun(String str) {
        this.d = str;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        fgun fgunVar = (fgun) fgur.a(this.d);
        fgunVar.b = this.b;
        fgunVar.a = this.a;
        return fgunVar;
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        fgun fgunVar = (fgun) obj;
        return this.a == fgunVar.a && this.d.equals(fgunVar.d) && this.b.equals(fgunVar.b);
    }

    @Override // java.text.DateFormat
    public final Calendar getCalendar() {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.DateFormat
    public final NumberFormat getNumberFormat() {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.b;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return (((((super.hashCode() * 31) + this.d.hashCode()) * 31) + (this.a ? 1 : 0)) * 31) + this.b.hashCode();
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        return this.a;
    }

    @Override // java.text.DateFormat
    public final void setCalendar(Calendar calendar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        this.a = z;
    }

    @Override // java.text.DateFormat
    public final void setNumberFormat(NumberFormat numberFormat) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        this.b = timeZone;
    }
}
