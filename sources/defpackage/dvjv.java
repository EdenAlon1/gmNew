package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvjv implements emwl {
    public abstract void a(eyaj eyajVar, evxn evxnVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyaj eyajVar = (eyaj) obj;
        evxn evxnVar = (evxn) evxu.a.createBuilder();
        if ((eyajVar.b & 2) != 0) {
            d(eyajVar, evxnVar);
        }
        if ((eyajVar.b & 4) != 0) {
            c(eyajVar, evxnVar);
        }
        if ((eyajVar.b & 8) != 0) {
            emwd emwdVar = dvlp.d;
            eyae b = eyae.b(eyajVar.h);
            if (b == null) {
                b = eyae.FONT_SIZE_UNSPECIFIED;
            }
            evxt evxtVar = (evxt) emwdVar.fP(b);
            evxnVar.copyOnWrite();
            evxu evxuVar = (evxu) evxnVar.instance;
            evxuVar.g = evxtVar.d;
            evxuVar.b |= 4;
        }
        h(eyajVar, evxnVar);
        b(eyajVar, evxnVar);
        a(eyajVar, evxnVar);
        g(eyajVar, evxnVar);
        e(eyajVar, evxnVar);
        f(eyajVar, evxnVar);
        return (evxu) evxnVar.build();
    }

    public abstract void b(eyaj eyajVar, evxn evxnVar);

    public abstract void c(eyaj eyajVar, evxn evxnVar);

    public abstract void d(eyaj eyajVar, evxn evxnVar);

    public abstract void e(eyaj eyajVar, evxn evxnVar);

    public abstract void f(eyaj eyajVar, evxn evxnVar);

    public abstract void g(eyaj eyajVar, evxn evxnVar);

    public abstract void h(eyaj eyajVar, evxn evxnVar);
}
