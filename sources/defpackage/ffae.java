package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffae implements febq {
    private static final ThreadLocal b = new ThreadLocal();
    public final eyhs a;
    private final eyhz c;

    public ffae(eyhs eyhsVar) {
        eyhsVar.getClass();
        this.a = eyhsVar;
        this.c = eyhsVar.getParserForType();
    }

    @Override // defpackage.febq
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new ffad((eyhs) obj, this.c);
    }

    @Override // defpackage.febq
    public final /* synthetic */ Object b(InputStream inputStream) {
        byte[] bArr;
        if (inputStream instanceof ffad) {
            ffad ffadVar = (ffad) inputStream;
            if (ffadVar.b == this.c) {
                try {
                    eyhs eyhsVar = ffadVar.a;
                    if (eyhsVar != null) {
                        return eyhsVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            eyel eyelVar = null;
            if (inputStream instanceof feac) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal threadLocal = b;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = available;
                    while (i > 0) {
                        int read = inputStream.read(bArr, available - i, i);
                        if (read == -1) {
                            break;
                        }
                        i -= read;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                    }
                    eyelVar = eyel.R(bArr, 0, available);
                } else if (available == 0) {
                    return this.a;
                }
            }
            if (eyelVar == null) {
                eyelVar = eyel.K(inputStream);
            }
            eyelVar.e = Alert.DURATION_SHOW_INDEFINITELY;
            try {
                Object j = this.c.j(eyelVar, ffag.a);
                try {
                    eyelVar.z(0);
                    return j;
                } catch (eygu e) {
                    throw e;
                }
            } catch (eygu e2) {
                throw new fedn(Status.o.withDescription("Invalid protobuf byte sequence").d(e2));
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
