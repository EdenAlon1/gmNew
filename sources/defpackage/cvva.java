package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvva extends okl {
    private static final cskc a = cskc.g("BugleContacts", "ContactListPagingSource");
    private final ecrj b;
    private final amav c;
    private final amau d;

    public cvva(ecrj ecrjVar, amav amavVar) {
        this.b = ecrjVar;
        this.c = amavVar;
        amau a2 = amavVar.a();
        a2.getClass();
        this.d = a2;
    }

    private final csjb a(oke okeVar) {
        csjb c = a.c();
        c.A("pagingKey", okeVar.a());
        c.y("size", okeVar.b);
        return c;
    }

    @Override // defpackage.okl
    public final /* bridge */ /* synthetic */ Object b(okm okmVar) {
        Integer num = okmVar.b;
        amat a2 = num != null ? this.d.a(num) : null;
        csjb c = a.c();
        Objects.toString(a2);
        c.I("Refreshing from key ".concat(String.valueOf(a2)));
        c.r();
        return a2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:3|(17:5|6|7|(2:86|(1:(1:(4:90|91|92|68)(2:93|94))(4:95|96|97|62))(4:98|99|100|19))(7:9|10|11|13|14|(2:16|(2:18|19))(2:57|(2:59|(2:61|62))(2:63|(2:65|(2:67|68))(2:69|70)))|56)|20|21|(1:23)(1:52)|24|(1:26)(1:51)|27|(7:30|(1:32)|33|34|35|36|28)|45|46|47|48|41|42))|7|(0)(0)|20|21|(0)(0)|24|(0)(0)|27|(1:28)|45|46|47|48|41|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:3|(17:5|6|7|(2:86|(1:(1:(4:90|91|92|68)(2:93|94))(4:95|96|97|62))(4:98|99|100|19))(7:9|10|11|13|14|(2:16|(2:18|19))(2:57|(2:59|(2:61|62))(2:63|(2:65|(2:67|68))(2:69|70)))|56)|20|21|(1:23)(1:52)|24|(1:26)(1:51)|27|(7:30|(1:32)|33|34|35|36|28)|45|46|47|48|41|42))|108|6|7|(0)(0)|20|21|(0)(0)|24|(0)(0)|27|(1:28)|45|46|47|48|41|42|(2:(0)|(1:82))) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0202, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0203, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012c A[Catch: all -> 0x00b6, Exception -> 0x0202, TryCatch #4 {all -> 0x00b6, blocks: (B:68:0x011f, B:21:0x0124, B:23:0x012c, B:24:0x0142, B:26:0x0148, B:27:0x0157, B:28:0x01ba, B:30:0x01c0, B:32:0x01c8, B:33:0x01cb, B:36:0x01d0, B:39:0x0219, B:46:0x01e5, B:62:0x00eb, B:19:0x00af), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148 A[Catch: all -> 0x00b6, Exception -> 0x0202, TryCatch #4 {all -> 0x00b6, blocks: (B:68:0x011f, B:21:0x0124, B:23:0x012c, B:24:0x0142, B:26:0x0148, B:27:0x0157, B:28:0x01ba, B:30:0x01c0, B:32:0x01c8, B:33:0x01cb, B:36:0x01d0, B:39:0x0219, B:46:0x01e5, B:62:0x00eb, B:19:0x00af), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c0 A[Catch: all -> 0x00b6, Exception -> 0x0202, TryCatch #4 {all -> 0x00b6, blocks: (B:68:0x011f, B:21:0x0124, B:23:0x012c, B:24:0x0142, B:26:0x0148, B:27:0x0157, B:28:0x01ba, B:30:0x01c0, B:32:0x01c8, B:33:0x01cb, B:36:0x01d0, B:39:0x0219, B:46:0x01e5, B:62:0x00eb, B:19:0x00af), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /* JADX WARN: Type inference failed for: r1v3, types: [ecrj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oke] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ecri] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v14, types: [cvva] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [cvuz, ffgu] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [cvva] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [cvva] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v24, types: [ekzz] */
    @Override // defpackage.okl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.oke r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvva.c(oke, ffgu):java.lang.Object");
    }

    @Override // defpackage.okl
    public final boolean d() {
        return true;
    }
}
