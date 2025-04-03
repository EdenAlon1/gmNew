package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngq extends nfj {
    private final luv a = new luv();
    private final luu b = new luu();
    private lvc c;

    @Override // defpackage.nfj
    protected final lrb b(nfi nfiVar, ByteBuffer byteBuffer) {
        lra ngtVar;
        long j;
        lvc lvcVar = this.c;
        if (lvcVar == null || nfiVar.h != lvcVar.f()) {
            lvc lvcVar2 = new lvc(nfiVar.f);
            this.c = lvcVar2;
            lvcVar2.a(nfiVar.f - nfiVar.h);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.I(array, limit);
        this.b.k(array, limit);
        this.b.n(39);
        long d = this.b.d(1);
        long d2 = this.b.d(32);
        this.b.n(20);
        luu luuVar = this.b;
        luv luvVar = this.a;
        int d3 = luuVar.d(12);
        int d4 = luuVar.d(8);
        luvVar.L(14);
        long j2 = (d << 32) | d2;
        if (d4 == 0) {
            ngtVar = new ngt();
        } else if (d4 == 255) {
            luv luvVar2 = this.a;
            int i = d3 - 4;
            long r = luvVar2.r();
            luvVar2.F(new byte[i], 0, i);
            ngtVar = new ngo(r, j2);
        } else if (d4 == 4) {
            luv luvVar3 = this.a;
            int j3 = luvVar3.j();
            ArrayList arrayList = new ArrayList(j3);
            for (int i2 = 0; i2 < j3; i2++) {
                luvVar3.r();
                int j4 = luvVar3.j() & 128;
                ArrayList arrayList2 = new ArrayList();
                if (j4 == 0) {
                    int j5 = luvVar3.j();
                    int i3 = j5 & 64;
                    int i4 = j5 & 32;
                    if (i3 != 0) {
                        luvVar3.r();
                    } else {
                        int j6 = luvVar3.j();
                        ArrayList arrayList3 = new ArrayList(j6);
                        for (int i5 = 0; i5 < j6; i5++) {
                            luvVar3.j();
                            luvVar3.r();
                            arrayList3.add(new ngu());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (i4 != 0) {
                        luvVar3.j();
                        luvVar3.r();
                    }
                    luvVar3.n();
                    luvVar3.j();
                    luvVar3.j();
                }
                arrayList.add(new ngv(arrayList2));
            }
            ngtVar = new ngw(arrayList);
        } else if (d4 == 5) {
            luv luvVar4 = this.a;
            lvc lvcVar3 = this.c;
            luvVar4.r();
            int j7 = luvVar4.j() & 128;
            List list = Collections.EMPTY_LIST;
            if (j7 == 0) {
                int j8 = luvVar4.j();
                boolean z = (j8 & 64) != 0;
                int i6 = j8 & 32;
                boolean z2 = (j8 & 16) != 0;
                long d5 = (!z || z2) ? -9223372036854775807L : ngx.d(luvVar4, j2);
                if (!z) {
                    int j9 = luvVar4.j();
                    ArrayList arrayList4 = new ArrayList(j9);
                    for (int i7 = 0; i7 < j9; i7++) {
                        luvVar4.j();
                        lvcVar3.b(!z2 ? ngx.d(luvVar4, j2) : -9223372036854775807L);
                        arrayList4.add(new ngr());
                    }
                    list = arrayList4;
                }
                if (i6 != 0) {
                    luvVar4.j();
                    luvVar4.r();
                }
                luvVar4.n();
                luvVar4.j();
                luvVar4.j();
                j = d5;
            } else {
                j = -9223372036854775807L;
            }
            ngtVar = new ngs(j, lvcVar3.b(j), list);
        } else if (d4 != 6) {
            ngtVar = null;
        } else {
            luv luvVar5 = this.a;
            lvc lvcVar4 = this.c;
            long d6 = ngx.d(luvVar5, j2);
            ngtVar = new ngx(d6, lvcVar4.b(d6));
        }
        return ngtVar == null ? new lrb(new lra[0]) : new lrb(ngtVar);
    }
}
