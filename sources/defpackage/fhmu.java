package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fhmu extends WritableByteChannel, fhnt {
    void K(fhmx fhmxVar);

    void M(byte[] bArr, int i, int i2);

    void P(int i);

    void R(int i);

    void S(int i);

    void Y(byte[] bArr);

    void aa(String str);

    @Override // defpackage.fhnt, java.io.Flushable
    void flush();

    @ffbs
    fhmt q();

    fhmt r();

    fhmu s(long j);
}
