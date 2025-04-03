package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes9.dex */
final class m implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public m() {
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.q0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.d0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.q0(objectInput));
            case 6:
                return ZonedDateTime.f0(objectInput);
            case 7:
                int i = s.d;
                return ZoneId.a0(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.i0(objectInput);
            case 9:
                return l.b0(objectInput);
            case 10:
                return OffsetDateTime.c0(objectInput);
            case 11:
                int i2 = o.b;
                return o.Z(objectInput.readInt());
            case 12:
                int i3 = q.c;
                return q.a0(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i4 = MonthDay.d;
                return MonthDay.Z(objectInput.readByte(), objectInput.readByte());
            case 14:
                return Period.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).d0(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).v0(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).y0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).q0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).i0(objectOutput);
                return;
            case 7:
                ((s) obj).e0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).j0(objectOutput);
                return;
            case 9:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((o) obj).d0(objectOutput);
                return;
            case 12:
                ((q) obj).g0(objectOutput);
                return;
            case 13:
                ((MonthDay) obj).a0(objectOutput);
                return;
            case 14:
                ((Period) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    m(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
