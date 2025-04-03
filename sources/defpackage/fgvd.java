package defpackage;

import androidx.car.app.model.Alert;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvd implements Comparable, Serializable {
    private static final long serialVersionUID = 5013232281547134583L;
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public fgvd(int i) {
        this.b = 0;
        this.c = Math.abs(i);
        this.d = Math.abs(0);
        this.e = Math.abs(0);
        this.f = Math.abs(0);
        this.a = false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final int a(fgvd fgvdVar) {
        boolean z = this.a;
        if (z != fgvdVar.a) {
            if (z) {
                return Integer.MIN_VALUE;
            }
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        int i = this.b;
        int i2 = fgvdVar.b;
        int i3 = (i == i2 && (i = this.c) == (i2 = fgvdVar.c) && (i = this.d) == (i2 = fgvdVar.d) && (i = this.e) == (i2 = fgvdVar.e)) ? this.f - fgvdVar.f : i - i2;
        return z ? -i3 : i3;
    }

    public final Date b(Date date) {
        Calendar c = date instanceof fgux ? fheo.c((fgux) date) : Calendar.getInstance();
        c.setTime(date);
        if (this.a) {
            c.add(3, -this.b);
            c.add(7, -this.c);
            c.add(11, -this.d);
            c.add(12, -this.e);
            c.add(13, -this.f);
        } else {
            c.add(3, this.b);
            c.add(7, this.c);
            c.add(11, this.d);
            c.add(12, this.e);
            c.add(13, this.f);
        }
        return c.getTime();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a((fgvd) obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof fgvd ? ((fgvd) obj).a(this) == 0 : super.equals(obj);
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.a(this.b);
        fhpaVar.a(this.c);
        fhpaVar.a(this.d);
        fhpaVar.a(this.e);
        fhpaVar.a(this.f);
        fhpaVar.d(this.a);
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a) {
            stringBuffer.append('-');
        }
        stringBuffer.append('P');
        int i = this.b;
        if (i > 0) {
            stringBuffer.append(i);
            stringBuffer.append('W');
        } else {
            int i2 = this.c;
            if (i2 > 0) {
                stringBuffer.append(i2);
                stringBuffer.append('D');
            }
            if (this.d > 0 || this.e > 0 || this.f > 0) {
                stringBuffer.append('T');
                int i3 = this.d;
                if (i3 > 0) {
                    stringBuffer.append(i3);
                    stringBuffer.append('H');
                }
                int i4 = this.e;
                if (i4 > 0) {
                    stringBuffer.append(i4);
                    stringBuffer.append('M');
                }
                int i5 = this.f;
                if (i5 > 0) {
                    stringBuffer.append(i5);
                    stringBuffer.append('S');
                }
            }
            if (this.d + this.e + this.f + this.c + this.b == 0) {
                stringBuffer.append("T0S");
            }
        }
        return stringBuffer.toString();
    }

    public fgvd(String str) {
        this.a = false;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "+-PWDTHMS", true);
        String str2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if ("+".equals(nextToken)) {
                this.a = false;
            } else if ("-".equals(nextToken)) {
                this.a = true;
            } else if (!"P".equals(nextToken)) {
                if ("W".equals(nextToken)) {
                    this.b = Integer.parseInt(str2);
                } else if ("D".equals(nextToken)) {
                    this.c = Integer.parseInt(str2);
                } else if (!"T".equals(nextToken)) {
                    if ("H".equals(nextToken)) {
                        this.d = Integer.parseInt(str2);
                    } else if ("M".equals(nextToken)) {
                        this.e = Integer.parseInt(str2);
                    } else if ("S".equals(nextToken)) {
                        this.f = Integer.parseInt(str2);
                    }
                }
            }
            str2 = nextToken;
        }
    }

    public fgvd(Date date, Date date2) {
        int compareTo = date.compareTo(date2);
        this.a = compareTo > 0;
        Date date3 = compareTo > 0 ? date2 : date;
        Calendar c = fheo.c((fgux) date3);
        c.setTime(date3);
        Calendar calendar = Calendar.getInstance(c.getTimeZone());
        calendar.setTime(compareTo <= 0 ? date2 : date);
        int i = 0;
        for (int i2 = calendar.get(1) - c.get(1); i2 > 0; i2 = calendar.get(1) - c.get(1)) {
            int i3 = i2 * 365;
            c.add(5, i3);
            i += i3;
        }
        int i4 = ((((((i + (calendar.get(6) - c.get(6))) * 24) + (calendar.get(11) - c.get(11))) * 60) + (calendar.get(12) - c.get(12))) * 60) + (calendar.get(13) - c.get(13));
        int i5 = i4 % 60;
        this.f = i5;
        int i6 = i4 / 60;
        int i7 = i6 % 60;
        this.e = i7;
        int i8 = i6 / 60;
        int i9 = i8 % 24;
        this.d = i9;
        int i10 = i8 / 24;
        this.c = i10;
        this.b = 0;
        if (i5 == 0 && i7 == 0 && i9 == 0 && i10 % 7 == 0) {
            this.b = i10 / 7;
            this.c = 0;
        }
    }
}
