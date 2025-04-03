package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcmb implements ffix {
    final /* synthetic */ bcmc a;
    final /* synthetic */ File b;
    final /* synthetic */ bckh c;

    public bcmb(bcmc bcmcVar, File file, bckh bckhVar) {
        this.a = bcmcVar;
        this.b = file;
        this.c = bckhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        bckh bckhVar = this.c;
        bcmc bcmcVar = this.a;
        bcma bcmaVar = new bcma(bckhVar, bcmcVar);
        final File file = this.b;
        file.getClass();
        ksw.b(file.exists(), new ffix() { // from class: bbie
            @Override // defpackage.ffix
            public final Object invoke() {
                return "File " + file.getPath() + " does not exist";
            }
        });
        bbii bbiiVar = bcmcVar.c;
        String parent = bbiiVar.c().getAbsoluteFile().getCanonicalFile().getParent();
        final String parent2 = file.getCanonicalFile().getParent();
        ksw.b(ffkj.e(parent, parent2), new ffix() { // from class: bbif
            @Override // defpackage.ffix
            public final Object invoke() {
                return String.valueOf(parent2).concat(" is not located in the app database directory");
            }
        });
        try {
            dtub.s(true);
            ((dttm) bbiiVar.b.b()).c(file.getName());
            bcmaVar.invoke();
            ((dttm) bbiiVar.b.b()).b();
            dtub.s(false);
            ((dttm) bbiiVar.b.b()).a();
            return ffcu.a;
        } catch (Throwable th) {
            ((dttm) bbiiVar.b.b()).b();
            dtub.s(false);
            ((dttm) bbiiVar.b.b()).a();
            throw th;
        }
    }
}
