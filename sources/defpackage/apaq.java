package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apaq implements aoyy, coxh, azzx {
    public final ffbr a;
    public final List b;
    public final Object c;
    private final aorv d;

    public apaq(aorv aorvVar, ffbr ffbrVar) {
        aorvVar.getClass();
        ffbrVar.getClass();
        this.d = aorvVar;
        this.a = ffbrVar;
        this.b = new ArrayList();
        Object obj = new Object();
        this.c = obj;
        synchronized (obj) {
            ((apuj) ffbrVar.b()).c(new apao(this));
        }
    }

    @Override // defpackage.coxh
    public final void b(boolean z) {
        this.d.e();
    }

    @Override // defpackage.aoyy
    public final ctbx c(final alyd alydVar) {
        synchronized (this.c) {
            this.b.add(alydVar);
        }
        final ctbx c = this.d.c(alydVar);
        return new ctbx() { // from class: apan
            @Override // defpackage.ctbx
            public final void a() {
                alyd alydVar2 = alydVar;
                ctbx ctbxVar = c;
                apaq apaqVar = apaq.this;
                synchronized (apaqVar.c) {
                    apaqVar.b.remove(alydVar2);
                    if (apaqVar.b.isEmpty()) {
                        ((apuj) apaqVar.a.b()).b();
                    }
                    ctbxVar.a();
                }
            }

            @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                ctbw.a(this);
            }
        };
    }

    @Override // defpackage.azzx
    public final void d(String str, String str2, long j) {
        this.d.d(str, str2, j);
    }

    @Override // defpackage.coxh
    public final void fE(boolean z) {
        this.d.fE(z);
    }
}
