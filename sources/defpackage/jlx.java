package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlx extends ffkk implements ffji {
    final /* synthetic */ long a;
    final /* synthetic */ float[] b;
    final /* synthetic */ ffkz c;
    final /* synthetic */ ffky d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlx(long j, float[] fArr, ffkz ffkzVar, ffky ffkyVar) {
        super(1);
        this.a = j;
        this.b = fArr;
        this.c = ffkzVar;
        this.d = ffkyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        float c;
        float d;
        jmg jmgVar = (jmg) obj;
        int i = jmgVar.b;
        long j2 = this.a;
        int d2 = i > jpm.d(j2) ? jmgVar.b : jpm.d(j2);
        int c2 = jmgVar.c < jpm.c(j2) ? jmgVar.c : jpm.c(j2);
        ffkz ffkzVar = this.c;
        long a = jpn.a(jmgVar.e(d2), jmgVar.e(c2));
        jmf jmfVar = jmgVar.a;
        int i2 = ffkzVar.a;
        int d3 = jpm.d(a);
        int c3 = jpm.c(a);
        jqh jqhVar = ((jlf) jmfVar).b;
        int length = jqhVar.r().length();
        if (d3 < 0) {
            jwo.b("startOffset must be > 0");
        }
        if (d3 >= length) {
            jwo.b("startOffset must be less than text length");
        }
        if (c3 <= d3) {
            jwo.b("endOffset must be greater than startOffset");
        }
        if (c3 > length) {
            jwo.b("endOffset must be smaller or equal to text length");
        }
        float[] fArr = this.b;
        if (fArr.length - i2 < (c3 - d3) * 4) {
            jwo.b("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int l = jqhVar.l(d3);
        int l2 = jqhVar.l(c3 - 1);
        jpv jpvVar = new jpv(jqhVar);
        if (l <= l2) {
            while (true) {
                int n = jqhVar.n(l);
                int k = jqhVar.k(l);
                int max = Math.max(d3, n);
                int min = Math.min(c3, k);
                float e = jqhVar.e(l);
                float c4 = jqhVar.c(l);
                j = a;
                boolean z = jqhVar.o(l) == 1;
                while (max < min) {
                    int i3 = max + 1;
                    boolean s = jqhVar.s(max);
                    if (z && !s) {
                        c = jpvVar.a(max);
                        d = jpvVar.b(i3);
                    } else if (z) {
                        d = jpvVar.c(max);
                        c = jpvVar.d(i3);
                    } else if (s) {
                        d = jpvVar.a(max);
                        c = jpvVar.b(i3);
                    } else {
                        c = jpvVar.c(max);
                        d = jpvVar.d(i3);
                    }
                    fArr[i2] = c;
                    fArr[i2 + 1] = e;
                    fArr[i2 + 2] = d;
                    fArr[i2 + 3] = c4;
                    i2 += 4;
                    max = i3;
                }
                if (l == l2) {
                    break;
                }
                l++;
                a = j;
            }
        } else {
            j = a;
        }
        int b = ffkzVar.a + (jpm.b(j) * 4);
        int i4 = ffkzVar.a;
        while (true) {
            ffky ffkyVar = this.d;
            if (i4 >= b) {
                ffkzVar.a = b;
                ffkyVar.a += jmgVar.a.b();
                return ffcu.a;
            }
            int i5 = i4 + 1;
            float f = fArr[i5];
            float f2 = ffkyVar.a;
            fArr[i5] = f + f2;
            int i6 = i4 + 3;
            fArr[i6] = fArr[i6] + f2;
            i4 += 4;
        }
    }
}
