package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpd implements dozo {
    public static final Duration a;
    public static final Size b;
    private static final enru d;
    public final drpz c;
    private final ernh e;
    private final ffbr f;
    private final ffbz g;

    static {
        Duration duration = Duration.ZERO;
        duration.getClass();
        a = duration;
        b = new Size(0, 0);
        d = enru.c("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver");
    }

    public drpd(drpz drpzVar, ernh ernhVar, ffbr ffbrVar, final ffbr ffbrVar2) {
        drpzVar.getClass();
        ernhVar.getClass();
        ffbrVar2.getClass();
        this.c = drpzVar;
        this.e = ernhVar;
        this.f = ffbrVar;
        this.g = ffca.a(new ffix() { // from class: drov
            @Override // defpackage.ffix
            public final Object invoke() {
                Duration duration = drpd.a;
                Object b2 = ffbr.this.b();
                b2.getClass();
                Optional optional = (Optional) b2;
                return (dozj) (optional.isPresent() ? optional.get() : new dozj(null));
            }
        });
    }

    public static /* synthetic */ Object d(drpd drpdVar, dozs dozsVar, Uri uri, drlx drlxVar, doxr doxrVar, boolean z, ffgu ffguVar) {
        drlx drlxVar2;
        if (drlxVar == null) {
            String e = dozsVar.e();
            drlxVar2 = e != null ? drlo.a(e) : null;
        } else {
            drlxVar2 = drlxVar;
        }
        if (drlxVar2 != null) {
            drka a2 = drjz.a(drlxVar2, drpdVar.f().d);
            if (a2 == null) {
                ((enrr) d.i().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "fromCursor$suspendImpl", 70, "LocalMediaResolver.kt")).D("Cannot resolve format from %s (parameter) and %s (cursor), falling back to image", drlxVar, dozsVar.e());
                a2 = drld.b;
            }
            return drpdVar.c(a2, uri, dozsVar.d(), dozsVar.c(), doxrVar, new drox(drpdVar, dozsVar, uri, z, null), new droy(drpdVar, dozsVar, uri, z, null), new droz(drpdVar, dozsVar, uri, z, null), ffguVar);
        }
        throw new IllegalArgumentException("Media type was unspecified and not found in Cursor metadata (" + dozsVar.e() + ")");
    }

    public static /* synthetic */ Object e(drpd drpdVar, drka drkaVar, Uri uri, Long l, Instant instant, doxr doxrVar, ffgu ffguVar) {
        return drpdVar.c(drkaVar, uri, l, instant, doxrVar, new drpa(drpdVar, uri, null), new drpb(drpdVar, uri, null), new drpc(drpdVar, uri, null), ffguVar);
    }

    private final dozj f() {
        return (dozj) this.g.a();
    }

    private final Object g(Uri uri, ffgu ffguVar) {
        ((enrr) d.j().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "getSizeBytesWhenMissing", 290, "LocalMediaResolver.kt")).t("Missing size bytes, falling back to input stream %b", Boolean.valueOf(f().b));
        return f().b ? ((dqgo) this.f.b()).a(uri, ffguVar) : new Long(0L);
    }

    @Override // defpackage.dozo
    public final Object a(dozs dozsVar, Uri uri, drlx drlxVar, doxr doxrVar, boolean z, ffgu ffguVar) {
        return d(this, dozsVar, uri, drlxVar, doxrVar, z, ffguVar);
    }

    @Override // defpackage.dozo
    public final Object b(drka drkaVar, Uri uri, doxr doxrVar, ffgu ffguVar) {
        return e(this, drkaVar, uri, null, null, doxrVar, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.drka r27, android.net.Uri r28, java.lang.Long r29, j$.time.Instant r30, defpackage.doxr r31, defpackage.ffji r32, defpackage.ffji r33, defpackage.ffji r34, defpackage.ffgu r35) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drpd.c(drka, android.net.Uri, java.lang.Long, j$.time.Instant, doxr, ffji, ffji, ffji, ffgu):java.lang.Object");
    }
}
