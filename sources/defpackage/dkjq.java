package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkjq extends dkgm {
    public final dkrp g;
    private final ffbr h;
    private final ctvb i;
    private final InstantMessageConfiguration j;

    public dkjq(djjr djjrVar, dkhc dkhcVar, ffbr ffbrVar, ctvb ctvbVar, dkur dkurVar, dkrp dkrpVar) {
        super(djjrVar, dkhcVar, dkurVar);
        this.h = ffbrVar;
        this.i = ctvbVar;
        this.j = djjrVar.d();
        this.g = dkrpVar;
    }

    @Override // defpackage.dkgm
    protected final void e() {
        if (((Boolean) dkrp.a.a()).booleanValue()) {
            return;
        }
        this.g.b();
    }

    @Override // defpackage.dkgm
    protected final void g(dilc dilcVar) {
        ArrayList arrayList;
        if (dilcVar.b()) {
            dkty.c("Skipping call to unsubscribe to groups due to %s", dilcVar);
            return;
        }
        dkrp dkrpVar = this.g;
        synchronized (dkrpVar.b) {
            arrayList = new ArrayList(dkrpVar.b.values());
        }
        Collection.EL.stream(arrayList).map(new Function() { // from class: dkjl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dkrn) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).forEach(new Consumer() { // from class: dkjm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((Optional) obj).ifPresent(new Consumer() { // from class: dkjk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ((dkhi) obj2).n();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void p(long j) {
        Long valueOf = Long.valueOf(j);
        dkty.c("Updating subscription for session %d", valueOf);
        Optional a = this.g.a(j);
        if (a.isEmpty()) {
            dkty.g("No group found for session %d. Cannot update subscription", valueOf);
            return;
        }
        dkrn dkrnVar = (dkrn) a.get();
        if (!dkrnVar.e.isPresent()) {
            dkty.g("Group with ID %d has no valid conference URI. Cannot update subscription", valueOf);
            return;
        }
        String str = (String) dkrnVar.e.get();
        if (dkrnVar.c.isPresent()) {
            dkhi dkhiVar = (dkhi) dkrnVar.c.get();
            dkhiVar.l(false);
            dkhiVar.i = str;
            try {
                dkhiVar.e = dkhiVar.b(dkhiVar.c);
                dkhiVar.m();
                return;
            } catch (eejg e) {
                dkty.i(e, "Error calling createOriginatingDialogPath(): %s", e.getMessage());
                dkhiVar.g(new dkqt("Error calling createOriginatingDialogPath(): ".concat(String.valueOf(e.getMessage())), e));
                return;
            }
        }
        dkjp dkjpVar = new dkjp(this, dkrnVar.a);
        try {
            dkhi dkhiVar2 = new dkhi(this.a, this.h, dkut.l(str, this.a.c(), this.i), "conference", this.d, this.e, this.f);
            dkhiVar2.f = "application/conference-info+xml";
            dkhiVar2.j = dizg.E() ? (String[]) Collection.EL.toArray(new dkjd(this.j.mMessageTech, 1).d(), new IntFunction() { // from class: dkjn
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return new String[i];
                }
            }) : dkut.C(this.j.a());
            dkhiVar2.d(dkjpVar);
            dkrnVar.c = Optional.of(dkhiVar2);
            dkhiVar2.m();
        } catch (eejg e2) {
            dkty.g("Error subscribing to conference: %s", e2.getMessage());
        }
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
