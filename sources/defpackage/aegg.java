package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegg implements aefs {
    public static final /* synthetic */ int m = 0;
    public final errl a;
    public final errl b;
    public final bzac c;
    public final ffbr d;
    public final ffbr e;
    public final ejvb f;
    public final ffbr g;
    public final ffbr h;
    public final List j = new ArrayList();
    public final List k = new ArrayList();
    public final AtomicBoolean i = new AtomicBoolean(false);
    private boolean n = false;
    public boolean l = false;

    static {
        new ejtz("TOUCH_EXPLORATION_ENABLED_DATASOURCE_KEY");
    }

    public aegg(errl errlVar, errl errlVar2, bzac bzacVar, ffbr ffbrVar, ffbr ffbrVar2, ejvb ejvbVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = errlVar;
        this.b = errlVar2;
        this.c = bzacVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ejvbVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
    }

    @Override // defpackage.aefs
    public final elfl a(final engw engwVar, final byyt byytVar, final eoko eokoVar, final eisx eisxVar) {
        return elfo.g(new Callable() { // from class: aegc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                croc crocVar = (croc) aegg.this.e.b();
                eisx eisxVar2 = eisxVar;
                engw n = engw.n(engwVar);
                Optional.of(eisxVar2);
                return (List) Collection.EL.stream(crocVar.c(n, byytVar, eokoVar)).map(new Function() { // from class: aefz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = aegg.m;
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: aega
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
            }
        }, this.a);
    }

    @Override // defpackage.aefs
    public final void b() {
        efbd.c();
        this.n = true;
        c();
    }

    public final void c() {
        if (this.l && this.n) {
            ((ejvp) this.h.b()).a(elfo.e(null), "POPUP_KEY");
        }
    }
}
