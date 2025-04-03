package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bzox;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzox extends ceut {
    public final Context a;
    public final ffbr b;
    public final bzpk c;
    public final akzt d;
    private final bzgd e;
    private final errl f;
    private final errl g;
    private final ffbr h;

    /* compiled from: PG */
    interface a {
        bzox aN();
    }

    public bzox(Context context, ffbr ffbrVar, bzpk bzpkVar, bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, ffbr ffbrVar2) {
        this.a = context;
        this.b = ffbrVar;
        this.c = bzpkVar;
        this.e = bzgdVar;
        this.d = akztVar;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = ffbrVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(5);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ProcessUserAlertWorker");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return bzoz.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final bzoz bzozVar = (bzoz) eyhsVar;
        return ((cgcu) this.h.b()).a() ? this.e.h().h(new emwl() { // from class: bzov
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                bzox bzoxVar = bzox.this;
                return isPresent ? ((bzox.a) ekhv.a(bzoxVar.a, bzox.a.class, (eisx) optional.get())).aN() : bzoxVar;
            }
        }, this.f).i(new eroh() { // from class: bzow
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((bzox) obj).k(bzoz.this);
            }
        }, this.f) : k(bzozVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0006, B:5:0x000e, B:9:0x001f, B:11:0x0027, B:12:0x0029, B:14:0x002e, B:19:0x0038, B:21:0x0041, B:23:0x0072, B:24:0x00a4, B:27:0x00aa, B:28:0x00b9, B:30:0x00bd, B:31:0x00cd, B:33:0x00d1, B:34:0x00da, B:36:0x00ea, B:38:0x00ee, B:39:0x00f1, B:41:0x00f5, B:42:0x00f8, B:44:0x0077, B:45:0x007a, B:47:0x0088, B:49:0x0096, B:50:0x0099, B:53:0x009f, B:54:0x00a2, B:55:0x0107, B:57:0x010b, B:58:0x0114), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0006, B:5:0x000e, B:9:0x001f, B:11:0x0027, B:12:0x0029, B:14:0x002e, B:19:0x0038, B:21:0x0041, B:23:0x0072, B:24:0x00a4, B:27:0x00aa, B:28:0x00b9, B:30:0x00bd, B:31:0x00cd, B:33:0x00d1, B:34:0x00da, B:36:0x00ea, B:38:0x00ee, B:39:0x00f1, B:41:0x00f5, B:42:0x00f8, B:44:0x0077, B:45:0x007a, B:47:0x0088, B:49:0x0096, B:50:0x0099, B:53:0x009f, B:54:0x00a2, B:55:0x0107, B:57:0x010b, B:58:0x0114), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0006, B:5:0x000e, B:9:0x001f, B:11:0x0027, B:12:0x0029, B:14:0x002e, B:19:0x0038, B:21:0x0041, B:23:0x0072, B:24:0x00a4, B:27:0x00aa, B:28:0x00b9, B:30:0x00bd, B:31:0x00cd, B:33:0x00d1, B:34:0x00da, B:36:0x00ea, B:38:0x00ee, B:39:0x00f1, B:41:0x00f5, B:42:0x00f8, B:44:0x0077, B:45:0x007a, B:47:0x0088, B:49:0x0096, B:50:0x0099, B:53:0x009f, B:54:0x00a2, B:55:0x0107, B:57:0x010b, B:58:0x0114), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114 A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0006, B:5:0x000e, B:9:0x001f, B:11:0x0027, B:12:0x0029, B:14:0x002e, B:19:0x0038, B:21:0x0041, B:23:0x0072, B:24:0x00a4, B:27:0x00aa, B:28:0x00b9, B:30:0x00bd, B:31:0x00cd, B:33:0x00d1, B:34:0x00da, B:36:0x00ea, B:38:0x00ee, B:39:0x00f1, B:41:0x00f5, B:42:0x00f8, B:44:0x0077, B:45:0x007a, B:47:0x0088, B:49:0x0096, B:50:0x0099, B:53:0x009f, B:54:0x00a2, B:55:0x0107, B:57:0x010b, B:58:0x0114), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl k(defpackage.bzoz r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzox.k(bzoz):elfl");
    }
}
