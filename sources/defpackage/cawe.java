package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawe implements cavm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin");
    public final fazb c;
    public final fazb d;
    public final AtomicInteger e = new AtomicInteger(0);
    private final fazb f;
    private final asnj g;
    private final ffbr h;
    private final atjy i;

    public cawe(fazb fazbVar, fazb fazbVar2, asnj asnjVar, fazb fazbVar3, ffbr ffbrVar, atjy atjyVar) {
        this.c = fazbVar;
        this.f = fazbVar2;
        this.g = asnjVar;
        this.d = fazbVar3;
        this.h = ffbrVar;
        this.i = atjyVar;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    final Map f() {
        HashMap hashMap = new HashMap();
        Instant f = ((cqoh) this.f.b()).f();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/thread-self/io")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    List i = emye.b(' ').i(readLine);
                    hashMap.put(((String) i.get(0)).substring(0, ((String) i.get(0)).length() - 1), Integer.valueOf((String) i.get(1)));
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin", "readIoCounts", (char) 179, "LoggingPlugin.java")).q("got io exception reading /proc/thread-self/io");
        }
        hashMap.put("cost_millis", Integer.valueOf((int) Duration.between(f, ((cqoh) this.f.b()).f()).toMillis()));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    @Override // defpackage.cavm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Closeable l(final defpackage.dtwd r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cawe.l(dtwd):java.io.Closeable");
    }

    @Override // defpackage.cavm
    public final boolean n() {
        Boolean bool = true;
        bool.getClass();
        long longValue = ((Long) this.h.b()).longValue();
        return longValue > 0 && ((double) ThreadLocalRandom.current().nextLong(longValue)) == eobe.a;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
