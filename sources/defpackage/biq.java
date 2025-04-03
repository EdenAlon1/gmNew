package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class biq extends llf {
    public final afd a;
    private final Object h;
    private lld i;

    public biq(Object obj, afd afdVar) {
        this.h = obj;
        this.a = afdVar;
    }

    public static final void c(biq biqVar, lld lldVar) {
        final bip bipVar = new bip(biqVar);
        super.p(lldVar, new llh() { // from class: bin
            @Override // defpackage.llh
            public final void a(Object obj) {
                ffji.this.invoke(obj);
            }
        });
    }

    @Override // defpackage.lld
    public final Object a() {
        lld lldVar = this.i;
        return lldVar == null ? this.h : this.a.a(lldVar.a());
    }

    public final void b(final lld lldVar) {
        lldVar.getClass();
        lld lldVar2 = this.i;
        if (lldVar2 != null) {
            super.q(lldVar2);
        }
        this.i = lldVar;
        biw.c(new Runnable() { // from class: bio
            @Override // java.lang.Runnable
            public final void run() {
                biq.c(biq.this, lldVar);
            }
        });
    }
}
