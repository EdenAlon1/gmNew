package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes9.dex */
final class D implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public D() {
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object y;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                int i = AbstractC0022a.d;
                y = AbstractC0022a.y(objectInput.readUTF());
                break;
            case 2:
                y = ((ChronoLocalDate) objectInput.readObject()).B((LocalTime) objectInput.readObject());
                break;
            case 3:
                y = ((ChronoLocalDateTime) objectInput.readObject()).q((ZoneOffset) objectInput.readObject()).k((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                u.e.getClass();
                y = new w(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                x xVar = x.d;
                y = x.p(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                nVar.getClass();
                y = p.f0(nVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                z.e.getClass();
                y = new B(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                F.e.getClass();
                y = new H(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i2 = C0027f.e;
                y = new C0027f(AbstractC0022a.y(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = y;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0022a) obj).n());
                return;
            case 2:
                ((C0026e) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((k) obj).writeExternal(objectOutput);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(wVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(wVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(wVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                ((x) obj).w(objectOutput);
                return;
            case 6:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 7:
                B b2 = (B) obj;
                b2.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(b2, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(b2, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(b2, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                H h = (H) obj;
                h.getClass();
                objectOutput.writeInt(j$.time.temporal.j.a(h, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(h, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.j.a(h, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                ((C0027f) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    D(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
