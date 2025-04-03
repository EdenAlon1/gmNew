package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkz extends evkt {
    public final Object a;

    public evkz(Object obj) {
        this.a = obj;
    }

    private static boolean j(evkz evkzVar) {
        Object obj = evkzVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.evkt
    public final String a() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (i()) {
            return e().toString();
        }
        if (h()) {
            return ((Boolean) this.a).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(this.a.getClass()))));
    }

    public final double d() {
        return i() ? e().doubleValue() : Double.parseDouble(a());
    }

    public final Number e() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new evmm((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        evkz evkzVar = (evkz) obj;
        if (j(this) && j(evkzVar)) {
            return ((this.a instanceof BigInteger) || (evkzVar.a instanceof BigInteger)) ? g().equals(evkzVar.g()) : e().longValue() == evkzVar.e().longValue();
        }
        Object obj2 = this.a;
        if (obj2 instanceof Number) {
            Object obj3 = evkzVar.a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return f().compareTo(evkzVar.f()) == 0;
                }
                double d = d();
                double d2 = evkzVar.d();
                if (d != d2) {
                    return Double.isNaN(d) && Double.isNaN(d2);
                }
                return true;
            }
        }
        return obj2.equals(evkzVar.a);
    }

    public final BigDecimal f() {
        Object obj = this.a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : evmv.a(a());
    }

    public final BigInteger g() {
        Object obj = this.a;
        return obj instanceof BigInteger ? (BigInteger) obj : j(this) ? BigInteger.valueOf(e().longValue()) : evmv.b(a());
    }

    public final boolean h() {
        return this.a instanceof Boolean;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (j(this)) {
            doubleToLongBits = e().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(e().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean i() {
        return this.a instanceof Number;
    }

    public evkz(String str) {
        str.getClass();
        this.a = str;
    }
}
