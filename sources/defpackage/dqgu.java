package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgu extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ dqgw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgu(ffji ffjiVar, dqgw dqgwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjiVar;
        this.c = dqgwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long j;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            obj = ffjiVar.invoke(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            final InputStream inputStream = (InputStream) closeable;
            try {
                j = ((Number) this.c.c.e("InputStreamSizeCalculator.sizeBytes", new ffix() { // from class: dqgt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        long skip;
                        enrr enrrVar = (enrr) dqgw.a.g().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 38, "InputStreamSizeCalculator.kt");
                        InputStream inputStream2 = inputStream;
                        enrrVar.B("%s.available(): %d", inputStream2.getClass(), inputStream2.available());
                        int i2 = 0;
                        long j2 = 0;
                        do {
                            skip = inputStream2.skip(inputStream2.available());
                            j2 += skip;
                            i2++;
                        } while (skip > 0);
                        if (inputStream2.available() > 0) {
                            ((enrr) dqgw.a.i().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 50, "InputStreamSizeCalculator.kt")).t("%s skipped 0 bytes but still has bytes available", inputStream2.getClass());
                        } else if (inputStream2.read() != -1) {
                            ((enrr) dqgw.a.i().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 54, "InputStreamSizeCalculator.kt")).t("%s reported 0 available but read() has not reached end of stream", inputStream2.getClass());
                        }
                        ((enrr) dqgw.a.g().h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator", "sizeBytes$lambda$0", 57, "InputStreamSizeCalculator.kt")).r("InputStream.sizeBytes() skipCount: %d", i2);
                        return Long.valueOf(j2);
                    }
                })).longValue();
            } catch (IOException e) {
                ((enrr) ((enrr) dqgw.a.i()).g(e).h("com/google/android/libraries/compose/core/data/content/InputStreamSizeCalculator$getSizeBytes$2$1", "invokeSuspend", 29, "InputStreamSizeCalculator.kt")).t("sizeBytes failed on %s, returning 0", inputStream.getClass());
                j = 0;
            }
            Long l = new Long(j);
            ffig.a(closeable, null);
            return l;
        } finally {
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqgu(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
