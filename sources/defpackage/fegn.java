package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import io.grpc.Status;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegn {
    private static final febi a = new fegm(null, true);

    private fegn() {
    }

    public static febo a(Parcel parcel, fdxd fdxdVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new febo();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            int i4 = i + 4;
            byte[] c = c(parcel, readInt2, i4);
            int i5 = i4 + readInt2;
            int i6 = i3 + i3;
            objArr[i6] = c;
            int readInt3 = parcel.readInt();
            i = i5 + 4;
            if (readInt3 == -1) {
                feeq feeqVar = (feeq) fdxdVar.a(fefu.h);
                if (!feeqVar.b) {
                    throw Status.i.withDescription("Parcelable metadata values not allowed").asException();
                }
                int dataPosition = parcel.dataPosition();
                try {
                    Parcelable readParcelable = parcel.readParcelable(fegn.class.getClassLoader());
                    if (readParcelable == null) {
                        throw Status.o.withDescription("Read null parcelable in metadata").asException();
                    }
                    febi febiVar = a;
                    Charset charset = fdzx.a;
                    objArr[i6 + 1] = new febl(febiVar, readParcelable);
                    i2 += parcel.dataPosition() - dataPosition;
                    int i7 = feeqVar.c;
                    if (i2 > 32768) {
                        throw Status.k.withDescription("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)").asException();
                    }
                } catch (AndroidRuntimeException e) {
                    throw Status.o.d(e).withDescription("Failure reading parcelable in metadata").asException();
                }
            } else {
                if (readInt3 < 0) {
                    throw Status.o.withDescription("Unrecognized metadata sentinel").asException();
                }
                byte[] c2 = c(parcel, readInt3, i);
                i += readInt3;
                objArr[i6 + 1] = c2;
            }
        }
        Charset charset2 = fdzx.a;
        return new febo(readInt, objArr);
    }

    public static void b(Parcel parcel, febo feboVar) {
        int i;
        int length;
        int read;
        if (feboVar != null) {
            Charset charset = fdzx.a;
            i = feboVar.f;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = fdzx.a;
        Object[] objArr = new Object[feboVar.a()];
        for (int i2 = 0; i2 < feboVar.f; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = feboVar.j(i2);
            int i4 = i3 + 1;
            Object c = feboVar.c(i2);
            if (!(c instanceof byte[])) {
                c = ((febl) c).b();
            }
            objArr[i4] = c;
        }
        parcel.writeInt(i);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 + i5;
            byte[] bArr = (byte[]) objArr[i6];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i6 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof fegz) {
                parcel.writeInt(-1);
                ((fegz) obj).a(parcel);
            } else {
                byte[] b = fegc.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i7 = 0;
                    while (true) {
                        length = b.length;
                        if (i7 >= length || (read = inputStream.read(b, i7, length - i7)) == -1) {
                            break;
                        } else {
                            i7 += read;
                        }
                    }
                    if (i7 == length) {
                        throw Status.k.withDescription("Metadata value too large").asException();
                    }
                    parcel.writeInt(i7);
                    if (i7 > 0) {
                        parcel.writeByteArray(b, 0, i7);
                    }
                } finally {
                    fegc.a(b);
                }
            }
        }
    }

    private static byte[] c(Parcel parcel, int i, int i2) {
        if (i2 + i > 8192) {
            throw Status.k.withDescription("Metadata too large").asException();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
