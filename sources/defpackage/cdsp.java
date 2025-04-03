package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsp implements cdsm {
    @Override // defpackage.cdsm
    public final Optional a(bqvj bqvjVar) {
        String o = bqvjVar.o();
        o.getClass();
        bqwn a = bqws.a();
        a.z("cms.queryOnCmsId");
        a.q();
        bqwr bqwrVar = new bqwr();
        int intValue = bqws.c().intValue();
        if (intValue < 35020) {
            dtub.w("cms_id", intValue);
        }
        bqwrVar.aq(new dtrt("cms.cms_id", 1, o));
        a.d(bqwrVar);
        Optional ofNullable = Optional.ofNullable((bqvj) dtub.c(a.b()));
        if (ofNullable.isPresent()) {
            return ofNullable;
        }
        final int k = bqvjVar.k();
        final int l = bqvjVar.l();
        byte[] q = bqvjVar.q();
        bqwn a2 = bqws.a();
        a2.z("findDuplicationWithKeyProperties");
        a2.e(new Function() { // from class: cdsn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqwr bqwrVar2 = (bqwr) obj;
                bqwrVar2.c(k);
                bqwrVar2.e(l);
                return bqwrVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqvz bqvzVar = (bqvz) a2.b().o();
        try {
            if (!bqvzVar.moveToFirst()) {
                bqvzVar.close();
                return Optional.empty();
            }
            if (Arrays.equals(q, bqvzVar.e())) {
                Optional of = Optional.of((bqvj) bqvzVar.cO());
                bqvzVar.close();
                return of;
            }
            Optional empty = Optional.empty();
            bqvzVar.close();
            return empty;
        } catch (Throwable th) {
            try {
                bqvzVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cdsm
    public final void b(bqvj bqvjVar, final int i, final int i2) {
        String o = bqvjVar.o();
        o.getClass();
        String[] strArr = bqws.a;
        bqwp bqwpVar = new bqwp();
        bqwpVar.ap("overwriteWithCmsKeyObject");
        bqwpVar.e(new Function() { // from class: cdso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqwr bqwrVar = (bqwr) obj;
                bqwrVar.e(i2);
                bqwrVar.c(i);
                return bqwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqwpVar.d(o);
        bqwpVar.b().e();
    }
}
