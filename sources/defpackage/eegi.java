package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eegi implements Iterator {
    final ByteBuffer a;
    long b = 0;
    final InputStream c;
    final long d;
    final boolean e;
    boolean f;
    final /* synthetic */ eegc g;
    final /* synthetic */ eegj h;

    public eegi(eegj eegjVar, eegc eegcVar) {
        this.g = eegcVar;
        this.h = eegjVar;
        this.a = ByteBuffer.wrap(new byte[eegjVar.b + 4000]);
        this.c = eegcVar.c.d();
        long j = eegcVar.c.j();
        this.d = j;
        this.e = j > 0;
        this.f = true;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ByteBuffer next() {
        long j;
        long j2;
        try {
            boolean z = this.g.m;
            int min = (int) Math.min(this.d - this.b, this.h.b);
            byte[] bArr = new byte[8];
            this.h.a.nextBytes(bArr);
            StringBuilder sb = new StringBuilder();
            boolean z2 = false;
            for (int i = 0; i < 8; i++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
            }
            String sb2 = sb.toString();
            this.g.d.add(sb2);
            this.a.rewind();
            ByteBuffer byteBuffer = this.a;
            int i2 = this.g.r;
            String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REPORT" : "SEND" : "UNKNOWN";
            if (i2 == 0) {
                throw null;
            }
            eegj.c(byteBuffer, sb2, str);
            eefm eefmVar = this.g.g;
            ByteBuffer byteBuffer2 = this.a;
            for (Map.Entry entry : eefmVar.a.entrySet()) {
                byteBuffer2.put(((String) entry.getKey()).getBytes());
                byteBuffer2.put(eefu.e);
                byteBuffer2.put(((String) entry.getValue()).getBytes());
                byteBuffer2.put(eefu.b);
            }
            eegc eegcVar = this.g;
            if (eegcVar.r == 3) {
                j = eegcVar.f;
                j2 = j;
            } else {
                j = this.b + min;
                j2 = this.d;
            }
            eegj.b(this.a, eefu.f, (Long.toString(this.b + 1) + "-" + j + "/" + j2).getBytes());
            if (this.e) {
                String str2 = this.g.h;
                if (str2 == null) {
                    throw new IllegalStateException("expected non-null contents");
                }
                eegj.b(this.a, eefu.h, str2.getBytes());
                this.a.put(eefu.b);
                int i3 = min;
                while (i3 > 0) {
                    int read = this.c.read(this.a.array(), this.a.arrayOffset() + this.a.position(), i3);
                    i3 -= read;
                    ByteBuffer byteBuffer3 = this.a;
                    byteBuffer3.position(byteBuffer3.position() + read);
                }
                this.a.put(eefu.b);
            }
            if (this.g.r == 3) {
                eegj.b(this.a, eefu.g, eefu.k);
            }
            long j3 = this.b + min;
            this.b = j3;
            boolean z3 = j3 < this.d;
            eegj.a(this.a, sb2, z ? 35 : z3 ? 43 : 36);
            if (z3 && !z) {
                z2 = true;
            }
            this.f = z2;
            return this.a;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }
}
