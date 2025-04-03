package defpackage;

import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feqz implements femu {
    public fevx b;
    public int c;
    public final fevy g;
    public final fevo h;
    public boolean i;
    public int j;
    public long l;
    private final feqy m;
    public int a = -1;
    public fdxy d = fdxw.a;
    public final feqx e = new feqx(this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public feqz(feqy feqyVar, fevy fevyVar, fevo fevoVar) {
        this.m = feqyVar;
        this.g = fevyVar;
        this.h = fevoVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        ffad ffadVar = (ffad) inputStream;
        eyhs eyhsVar = ffadVar.a;
        if (eyhsVar != null) {
            int serializedSize = eyhsVar.getSerializedSize();
            ffadVar.a.writeTo(outputStream);
            ffadVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = ffadVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        eyfc eyfcVar = ffag.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                ffadVar.c = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public final void b(boolean z, boolean z2) {
        fevx fevxVar = this.b;
        this.b = null;
        this.m.v(fevxVar, z, z2, this.j);
        this.j = 0;
    }

    public final void c(feqw feqwVar, boolean z) {
        Iterator it = feqwVar.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((fevx) it.next()).a();
        }
        int i2 = this.a;
        if (i2 >= 0 && i > i2) {
            throw new fedn(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.a))));
        }
        this.f.clear();
        this.f.put(z ? (byte) 1 : (byte) 0).putInt(i);
        fevy fevyVar = this.g;
        ByteBuffer byteBuffer = this.f;
        fevx a = fevyVar.a(5);
        a.d(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.b = a;
            return;
        }
        this.m.v(a, false, false, this.j - 1);
        this.j = 1;
        List list = feqwVar.a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.m.v((fevx) list.get(i3), false, false, 0);
        }
        this.b = (fevx) list.get(list.size() - 1);
        this.l = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            fevx fevxVar = this.b;
            if (fevxVar != null && fevxVar.b() == 0) {
                b(false, false);
            }
            if (this.b == null) {
                emxf.m(this.c > 0, "knownLengthPendingAllocation reached 0");
                fevx a = this.g.a(this.c);
                this.b = a;
                int i3 = this.c;
                this.c = i3 - Math.min(i3, a.b());
            }
            int min = Math.min(i2, this.b.b());
            this.b.d(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
