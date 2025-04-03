package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhb implements Closeable {
    public final fhgv a;
    public final fhgt b;
    public final String c;
    public final int d;
    public final fhge e;
    public final fhgh f;
    public final fhhe g;
    public final fhhb h;
    public final fhhb i;
    public final fhhb j;
    public final long k;
    public final long l;
    public final fhhy m;

    public fhhb(fhgv fhgvVar, fhgt fhgtVar, String str, int i, fhge fhgeVar, fhgh fhghVar, fhhe fhheVar, fhhb fhhbVar, fhhb fhhbVar2, fhhb fhhbVar3, long j, long j2, fhhy fhhyVar) {
        this.a = fhgvVar;
        this.b = fhgtVar;
        this.c = str;
        this.d = i;
        this.e = fhgeVar;
        this.f = fhghVar;
        this.g = fhheVar;
        this.h = fhhbVar;
        this.i = fhhbVar2;
        this.j = fhhbVar3;
        this.k = j;
        this.l = j2;
        this.m = fhhyVar;
    }

    public static /* synthetic */ String b(fhhb fhhbVar, String str) {
        String b = fhhbVar.f.b(str);
        if (b == null) {
            return null;
        }
        return b;
    }

    public final boolean a() {
        int i = this.d;
        return i >= 200 && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fhhe fhheVar = this.g;
        if (fhheVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        fhheVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
