package defpackage;

import java.util.Random;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ectc extends ecte {
    private final Random b;
    private final long c;
    private final ecsp d;
    private final ernh e;

    public ectc(fgpf fgpfVar, Random random, ecsp ecspVar, ernh ernhVar) {
        super(fgpfVar);
        this.b = random;
        this.c = fgpfVar.c;
        this.d = ecspVar;
        this.e = ernhVar;
    }

    @Override // defpackage.ecte
    public final long a(String str) {
        long sqrt;
        if (emxe.c(str)) {
            sqrt = this.c;
        } else {
            ecsp ecspVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - ecspVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long min = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = ecspVar.a;
                    int i2 = (int) min;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = ecspVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                ecspVar.d += j * 14400000;
            }
            int hashCode = str.hashCode() * ecspVar.c;
            char charAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = hashCode >>> 24;
            int length = (hashCode >>> 16) + str.length();
            short[] sArr3 = ecspVar.a;
            short[] sArr4 = ecspVar.b;
            int i4 = (i3 + charAt) & PrivateKeyType.INVALID;
            short s = sArr3[i4];
            int i5 = length & PrivateKeyType.INVALID;
            int min2 = Math.min((int) s, (int) sArr4[i5]);
            int i6 = min2 + 1;
            short min3 = (short) Math.min(32767, i6);
            short[] sArr5 = ecspVar.a;
            if (sArr5[i4] == min2) {
                sArr5[i4] = min3;
            }
            short[] sArr6 = ecspVar.b;
            if (sArr6[i5] == min2) {
                sArr6[i5] = min3;
            }
            sqrt = (int) (this.c / (i6 < 50 ? Math.sqrt(i6) : i6));
        }
        if (this.b.nextDouble() * 1000.0d < sqrt) {
            return sqrt;
        }
        return -1L;
    }

    @Override // defpackage.ecte
    public final fgpf b(Long l) {
        if (l != null) {
            if (l.longValue() != this.a.c) {
                fgpc createBuilder = fgpf.a.createBuilder();
                int a = fgpe.a(this.a.d);
                if (a == 0) {
                    a = 1;
                }
                createBuilder.copyOnWrite();
                fgpf fgpfVar = (fgpf) createBuilder.instance;
                fgpfVar.d = a - 1;
                fgpfVar.b |= 4;
                long longValue = l.longValue();
                createBuilder.copyOnWrite();
                fgpf fgpfVar2 = (fgpf) createBuilder.instance;
                fgpfVar2.b |= 2;
                fgpfVar2.c = longValue;
                return createBuilder.build();
            }
        }
        return this.a;
    }

    @Override // defpackage.ecte
    public final fgpf c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.ecte
    public final boolean d() {
        return this.c > 0;
    }
}
