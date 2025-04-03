package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfp implements eivn, eivo {
    private static final Duration a = Duration.ofDays(1);
    private final ejfr b;
    private final boolean c;

    public ejfp(ejfr ejfrVar, emxc emxcVar) {
        this.b = ejfrVar;
        this.c = ((Boolean) emxcVar.e(false)).booleanValue();
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        if (this.c) {
            ejfr ejfrVar = this.b;
            Duration duration = a;
            ekzz f = eleg.f("AutoSelect Account New");
            try {
                ListenableFuture f2 = erny.f(ejfrVar.c.d(duration), eldl.a(new emwl() { // from class: ejfq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (eixn eixnVar : (List) obj) {
                            if (eixnVar.c() != 3 && !Objects.equals(eixnVar.b().k, "pseudonymous") && !Objects.equals(eixnVar.b().k, "incognito")) {
                                arrayList.add(eixnVar);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return ((eixn) arrayList.get(0)).a();
                        }
                        return null;
                    }
                }), erpp.a);
                f.b(f2);
                f.close();
                return f2;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ejfr ejfrVar2 = this.b;
        ejwa ejwaVar = ejwa.SAME_DAY;
        ekzz f3 = eleg.f("AutoSelect Account Legacy");
        try {
            ListenableFuture f4 = erny.f(ejfrVar2.a.b(ejfrVar2.c.b(), ejwaVar), eldl.a(new emwl() { // from class: ejfq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ArrayList arrayList = new ArrayList();
                    for (eixn eixnVar : (List) obj) {
                        if (eixnVar.c() != 3 && !Objects.equals(eixnVar.b().k, "pseudonymous") && !Objects.equals(eixnVar.b().k, "incognito")) {
                            arrayList.add(eixnVar);
                        }
                    }
                    if (arrayList.size() == 1) {
                        return ((eixn) arrayList.get(0)).a();
                    }
                    return null;
                }
            }), erpp.a);
            f3.b(f4);
            f3.close();
            return f4;
        } catch (Throwable th3) {
            try {
                f3.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        return this.b.b.a(eisxVar);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
