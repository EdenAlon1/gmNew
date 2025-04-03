package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvr extends fhvw {
    public final int b;
    public fhvs c;
    private final boolean d;
    private final List e;
    private final List f;
    private final long g;
    private long h;

    private fhvr(int i, List list, List list2, long j, long j2, boolean z) {
        super(true);
        this.h = 0L;
        this.b = i;
        this.e = DesugarCollections.unmodifiableList(list);
        this.f = DesugarCollections.unmodifiableList(list2);
        this.h = j;
        this.g = j2;
        this.d = z;
    }

    public static fhvr a(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof fhvr) {
            return (fhvr) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int readInt = dataInputStream2.readInt();
            long readLong = dataInputStream2.readLong();
            long readLong2 = dataInputStream2.readLong();
            boolean readBoolean = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                arrayList.add(fhvy.a(obj));
            }
            for (int i2 = 0; i2 < readInt - 1; i2++) {
                arrayList2.add(fhwa.a(obj));
            }
            return new fhvr(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(fidk.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                fhvr a = a(dataInputStream);
                dataInputStream.close();
                return a;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
        }
    }

    public final synchronized fhvs b() {
        return new fhvs(this.b, ((fhvy) this.e.get(0)).b());
    }

    protected final Object clone() {
        try {
            return a(s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fhvr fhvrVar = (fhvr) obj;
        if (this.b == fhvrVar.b && this.d == fhvrVar.d && this.g == fhvrVar.g && this.h == fhvrVar.h && this.e.equals(fhvrVar.e)) {
            return this.f.equals(fhvrVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.b * 31) + (this.d ? 1 : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        long j = this.h;
        long j2 = j ^ (j >>> 32);
        long j3 = this.g;
        return (((hashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) j2);
    }

    @Override // defpackage.fhvw, defpackage.ficu
    public final synchronized byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(0, byteArrayOutputStream);
        fhvo.d(this.b, byteArrayOutputStream);
        fhvo.e(this.h, byteArrayOutputStream);
        fhvo.e(this.g, byteArrayOutputStream);
        byteArrayOutputStream.write(this.d ? 1 : 0);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            fhvo.a((fhvy) it.next(), byteArrayOutputStream);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            fhvo.a((fhwa) it2.next(), byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
