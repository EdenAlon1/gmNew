package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class q extends k {
    static final LocalDate h = LocalDate.of(2000, 1, 1);
    private final LocalDate g;

    /* synthetic */ q(TemporalField temporalField, LocalDate localDate, int i) {
        this(temporalField, 2, 2, localDate, i);
    }

    @Override // j$.time.format.k
    final long b(y yVar, long j) {
        long abs = Math.abs(j);
        LocalDate localDate = this.g;
        long j2 = localDate != null ? Chronology.CC.a(yVar.d()).r(localDate).get(this.a) : 0;
        long[] jArr = k.f;
        if (j >= j2) {
            long j3 = jArr[this.b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.c];
    }

    @Override // j$.time.format.k
    final boolean c(w wVar) {
        if (wVar.l()) {
            return super.c(wVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.format.p] */
    @Override // j$.time.format.k
    final int d(w wVar, long j, int i, int i2) {
        q qVar;
        w wVar2;
        final long j2;
        final int i3;
        final int i4;
        int i5;
        long j3;
        LocalDate localDate = this.g;
        if (localDate != null) {
            i5 = wVar.h().r(localDate).get(this.a);
            qVar = this;
            final w wVar3 = wVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            wVar3.a(new Consumer() { // from class: j$.time.format.p
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    q.this.d(wVar3, j2, i3, i4);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            wVar2 = wVar3;
        } else {
            qVar = this;
            wVar2 = wVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
        int i6 = i4 - i3;
        int i7 = qVar.b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = k.f[i7];
            long j5 = i5;
            long j6 = j5 - (j5 % j4);
            long j7 = i5 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return wVar2.o(qVar.a, j3, i3, i4);
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.e == -1) {
            return this;
        }
        return new q(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.k
    final k f(int i) {
        int i2 = this.e + i;
        return new q(this.a, this.b, this.c, this.g, i2);
    }

    @Override // j$.time.format.k
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.a) + "," + this.b + "," + this.c + "," + String.valueOf(Objects.requireNonNullElse(this.g, 0)) + ")";
    }

    q(TemporalField temporalField, LocalDate localDate) {
        this(temporalField, 2, 2, localDate, 0);
        if (localDate == null) {
            long j = 0;
            if (!temporalField.o().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + k.f[2] > 2147483647L) {
                throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private q(TemporalField temporalField, int i, int i2, LocalDate localDate, int i3) {
        super(temporalField, i, i2, E.NOT_NEGATIVE, i3);
        this.g = localDate;
    }
}
