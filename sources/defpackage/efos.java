package defpackage;

import android.content.Context;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efos {
    private static efos b;
    public efnf a;
    private final String c;

    private efos() {
        long nextLong = new SecureRandom().nextLong();
        this.c = System.currentTimeMillis() + "_" + (nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong));
    }

    public static efos a() {
        if (b == null) {
            b = new efos();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.fabn r9, defpackage.eyja r10, defpackage.eyev r11, android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efos.e(fabn, eyja, eyev, android.content.Context, java.lang.String):void");
    }

    public final void b(ezyx ezyxVar, eyja eyjaVar, eyev eyevVar, Context context, String str) {
        fabn fabnVar = (fabn) fabo.a.createBuilder();
        fabnVar.copyOnWrite();
        fabo faboVar = (fabo) fabnVar.instance;
        ezyxVar.getClass();
        faboVar.e = ezyxVar;
        faboVar.b |= 2;
        e(fabnVar, eyjaVar, eyevVar, context, str);
    }

    public final void c(ezzn ezznVar, eyja eyjaVar, eyev eyevVar, Context context, String str) {
        fabn fabnVar = (fabn) fabo.a.createBuilder();
        fabnVar.copyOnWrite();
        fabo faboVar = (fabo) fabnVar.instance;
        ezznVar.getClass();
        faboVar.g = ezznVar;
        faboVar.b |= 8;
        e(fabnVar, eyjaVar, eyevVar, context, str);
    }

    public final void d(fabm fabmVar, eyja eyjaVar, eyev eyevVar, Context context, String str) {
        fabn fabnVar = (fabn) fabo.a.createBuilder();
        fabnVar.copyOnWrite();
        fabo faboVar = (fabo) fabnVar.instance;
        fabmVar.getClass();
        faboVar.f = fabmVar;
        faboVar.b |= 4;
        e(fabnVar, eyjaVar, eyevVar, context, str);
    }
}
