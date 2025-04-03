package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkb implements nco {
    private final nkj c;
    private ndu f;
    private int g;
    private byte[] e = lvf.c;
    private final luv d = new luv();
    public final List a = new ArrayList();
    private int h = 0;
    private long[] i = lvf.d;
    public long b = -9223372036854775807L;

    public nkb(nkj nkjVar) {
        this.c = nkjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r23.g != r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r2 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        r5 = r23.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        if (r5 == r15) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
    
        r2 = new defpackage.nki(r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
    
        r23.c.b(r23.e, 0, r23.g, r2, new defpackage.njz(r23));
        java.util.Collections.sort(r23.a);
        r23.i = new long[r23.a.size()];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        if (r2 >= r23.a.size()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        r23.i[r2] = ((defpackage.nka) r23.a.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        r23.e = defpackage.lvf.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r23.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        r2 = defpackage.nki.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        throw new defpackage.lrg("SubtitleParser failed.", r0, true, 1);
     */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r24, defpackage.ndk r25) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkb.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        lti.c(this.h == 0);
        this.f = ncrVar.p(0, 3);
        this.h = 1;
    }

    @Override // defpackage.nco
    public final void d() {
        if (this.h == 5) {
            return;
        }
        this.c.c();
        this.h = 5;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        int i = this.h;
        boolean z = false;
        if (i != 0 && i != 5) {
            z = true;
        }
        lti.c(z);
        this.b = j2;
        int i2 = this.h;
        if (i2 == 2) {
            this.h = 1;
        } else if (i2 == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        return true;
    }

    public final void h(nka nkaVar) {
        lti.g(this.f);
        byte[] bArr = nkaVar.b;
        int length = bArr.length;
        this.d.H(bArr);
        this.f.m(this.d, length);
        this.f.o(nkaVar.a, 1, length, 0, null);
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
