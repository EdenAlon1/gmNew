package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxa {
    public static final entd a = entd.c("Bugle");
    public final akzt b;
    public final aqgi c;
    public final ffbr d;
    public final ffbr e;
    public long f = 0;
    public long g = 0;
    private final errl h;
    private final errl i;
    private final wpk j;

    public uxa(errl errlVar, errl errlVar2, akzt akztVar, aqgi aqgiVar, wpk wpkVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.h = errlVar;
        this.i = errlVar2;
        this.b = akztVar;
        this.c = aqgiVar;
        this.j = wpkVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    public final elfl a(final bcse bcseVar, final int i, final Consumer consumer) {
        final boolean q = bdjs.q(bcseVar.f());
        final ConversationIdType t = bcseVar.t();
        final elfl g = elfo.g(new Callable() { // from class: uwx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(uxa.this.c.d(t));
            }
        }, this.h);
        final elfl h = ((tzj) this.j.a(tzj.class)).a().b().h(new emwl() { // from class: uwu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                entd entdVar = uxa.a;
                boolean z = false;
                if (optional.isPresent() && byyr.b(((bejf) optional.get()).f())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.i);
        return elfo.k(g, h).a(new Callable() { // from class: uww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = uxa.a;
                if (!((Boolean) erqt.q(elfl.this)).booleanValue()) {
                    return null;
                }
                consumer.o(new uwt(bcseVar, i, !((Boolean) erqt.q(h)).booleanValue(), q));
                return null;
            }
        }, this.i);
    }
}
