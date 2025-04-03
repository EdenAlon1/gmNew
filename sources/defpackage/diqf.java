package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqf extends fhpq {
    private long a;

    public diqf(InputStream inputStream, String str, String str2) {
        super(inputStream, str, str2);
        try {
            long available = inputStream.available();
            this.a = available;
            if (available < 0) {
                throw new IllegalArgumentException("Invalid input stream!");
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("Input stream not ready!");
        }
    }

    @Override // defpackage.fhpq, defpackage.fhpo
    public final long a() {
        return this.a;
    }
}
