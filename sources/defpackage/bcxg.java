package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcxg extends bcpr implements lon {
    private static final cskc c = cskc.g("Bugle", "PairedDesktopsData");
    public loo a;
    public final List b = new ArrayList();
    private final azwc d;
    private final Context e;
    private bcxf f;

    public bcxg(azwc azwcVar, Context context, bcxf bcxfVar) {
        this.d = azwcVar;
        this.e = context;
        this.f = bcxfVar;
    }

    @Override // defpackage.lon
    public final lox a(int i, Bundle bundle) {
        String string = bundle.getString("bindingId");
        if (!j(string)) {
            c.r("Creating desktops loader after unbinding.");
            return null;
        }
        cskc cskcVar = bzgd.a;
        bsuz a = bsve.a();
        a.z("DittoDesktops#getDesktopsPairedViaQrQuery");
        a.f(new Function() { // from class: bzel
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar2 = bzgd.a;
                bsvdVar.d(byzd.ANONYMOUS);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.d(new bsuw(bsve.c.c));
        final bsux b = a.b();
        azwc azwcVar = this.d;
        Context context = this.e;
        return azwcVar.a(string, context, bcqc.l(context), new ksz() { // from class: bcxd
            @Override // defpackage.ksz
            public final Object a() {
                return bsux.this;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lon
    public final /* bridge */ /* synthetic */ void b(lox loxVar, Object obj) {
        bstt bsttVar = (bstt) obj;
        if (!j(((bcqe) loxVar).t())) {
            c.r("Self loader finished after unbinding.");
            return;
        }
        bsttVar.dh();
        d(bsttVar);
        bcxf bcxfVar = this.f;
        if (bcxfVar != null) {
            dbqv dbqvVar = (dbqv) bcxfVar;
            dbqvVar.b.d();
            List list = this.b;
            dbri dbriVar = dbqvVar.c;
            dbriVar.i = list;
            dbriVar.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lon
    public final void c(lox loxVar) {
        if (j(((bcqe) loxVar).t())) {
            d(null);
        } else {
            c.r("Self loader reset after unbinding.");
        }
    }

    public final void d(bstt bsttVar) {
        this.b.clear();
        if (bsttVar != null) {
            if (bsttVar.moveToFirst()) {
                this.b.add(new bcxe(bsttVar));
            }
            while (bsttVar.moveToNext()) {
                this.b.add(new bcxe(bsttVar));
            }
        }
    }

    @Override // defpackage.bcpr
    protected final void h() {
        this.f = null;
        loo looVar = this.a;
        if (looVar != null) {
            looVar.b(1);
            this.a = null;
        }
    }
}
