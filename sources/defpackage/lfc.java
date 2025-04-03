package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfc implements Runnable {
    final /* synthetic */ lev a;
    final /* synthetic */ lfd b;

    public lfc(lfd lfdVar, lev levVar) {
        this.b = lfdVar;
        this.a = levVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i;
        lfd lfdVar = this.b;
        lfdVar.d = this.a;
        try {
            if (lfdVar.d == null) {
                return;
            }
            try {
                krs c = krv.c(lfdVar.a, lfdVar.b);
                if (c.a != 0) {
                    throw new RuntimeException("fetchFonts failed (" + c.a + ")");
                }
                krt[] a = c.a();
                if (a == null || a.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                krt krtVar = a[0];
                int i2 = krtVar.e;
                if (i2 == 2) {
                    synchronized (lfdVar.c) {
                    }
                    i2 = 2;
                }
                if (i2 != 0) {
                    throw new RuntimeException(a.f(i2, "fetchFonts result is not OK. (", ")"));
                }
                Typeface b = krv.b(lfdVar.a, new krt[]{krtVar});
                ByteBuffer e = kqi.e(lfdVar.a, krtVar.a);
                if (e == null) {
                    throw new RuntimeException("Unable to open file.");
                }
                lev levVar = lfdVar.d;
                ByteBuffer duplicate = e.duplicate();
                duplicate.order(ByteOrder.BIG_ENDIAN);
                lff.b(4, duplicate);
                char c2 = (char) duplicate.getShort();
                if (c2 > 'd') {
                    throw new IOException("Cannot read metadata.");
                }
                lff.b(6, duplicate);
                int i3 = 0;
                while (true) {
                    if (i3 >= c2) {
                        j = -1;
                        break;
                    }
                    int i4 = duplicate.getInt();
                    lff.b(4, duplicate);
                    j = lff.a(duplicate);
                    lff.b(4, duplicate);
                    if (i4 == 1835365473) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (j != -1) {
                    lff.b((int) (j - duplicate.position()), duplicate);
                    lff.b(12, duplicate);
                    long a2 = lff.a(duplicate);
                    while (i < a2) {
                        int i5 = duplicate.getInt();
                        long a3 = lff.a(duplicate);
                        lff.a(duplicate);
                        i = (i5 == 1164798569 || i5 == 1701669481) ? 0 : i + 1;
                        duplicate.position((int) (a3 + j));
                        ozc ozcVar = new ozc();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        ozcVar.e(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                        lfh lfhVar = new lfh(b, ozcVar);
                        lep lepVar = ((leo) levVar).a;
                        lepVar.b = lfhVar;
                        lfh lfhVar2 = lepVar.b;
                        lew lewVar = lepVar.c;
                        lepVar.a = new lfa(lfhVar2, lewVar.j, lewVar.h, lewVar.i);
                        lew lewVar2 = lepVar.c;
                        ArrayList arrayList = new ArrayList();
                        lewVar2.a.writeLock().lock();
                        try {
                            lewVar2.c = 1;
                            arrayList.addAll(lewVar2.b);
                            lewVar2.b.clear();
                            lewVar2.a.writeLock().unlock();
                            lewVar2.d.post(new let(arrayList, lewVar2.c, null));
                            lfdVar.b();
                            return;
                        } catch (Throwable th) {
                            lewVar2.a.writeLock().unlock();
                            throw th;
                        }
                    }
                }
                throw new IOException("Cannot read metadata.");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        } catch (Throwable th2) {
            lfdVar.d.a(th2);
            lfdVar.b();
        }
    }
}
