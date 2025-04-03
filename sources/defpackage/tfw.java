package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfw {
    public static final cfup a = cfvl.f(cfvl.b, "fi_phone_number_fresh_period_ms", 86400000);
    public static final emyl b = cfvl.w("get_fi_user_standing_single_call");
    public final chje c;
    public final ejvb d;
    public final axkm e;
    public final cqoh f;
    public final errl g;
    public final errl h;
    public final ctvb i;
    public final aolr j;
    public final ffbr k;
    public ejlc l;

    public tfw(chje chjeVar, ejvb ejvbVar, axkm axkmVar, cqoh cqohVar, errl errlVar, errl errlVar2, ctvb ctvbVar, aolr aolrVar, ffbr ffbrVar) {
        this.c = chjeVar;
        this.d = ejvbVar;
        this.e = axkmVar;
        this.f = cqohVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.i = ctvbVar;
        this.j = aolrVar;
        this.k = ffbrVar;
    }

    private final elfl d() {
        return this.c.a().i(new eroh() { // from class: tfv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = ((fbew) obj).c;
                boolean booleanValue = ((Boolean) ((cfup) csgj.V.get()).e()).booleanValue();
                tfw tfwVar = tfw.this;
                if (booleanValue) {
                    str = tfwVar.i.x(str);
                }
                axkm axkmVar = tfwVar.e;
                axeh axehVar = (axeh) axei.a.createBuilder();
                axehVar.copyOnWrite();
                axei axeiVar = (axei) axehVar.instance;
                str.getClass();
                axeiVar.b |= 1;
                axeiVar.c = str;
                long epochMilli = axkmVar.d.f().toEpochMilli();
                axehVar.copyOnWrite();
                axei axeiVar2 = (axei) axehVar.instance;
                axeiVar2.b |= 2;
                axeiVar2.d = epochMilli;
                final axei axeiVar3 = (axei) axehVar.build();
                return axkmVar.A(new Function() { // from class: axfr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        axep axepVar = (axep) obj2;
                        cskc cskcVar = axkm.a;
                        axepVar.copyOnWrite();
                        axez axezVar = (axez) axepVar.instance;
                        axez axezVar2 = axez.a;
                        axei axeiVar4 = axei.this;
                        axeiVar4.getClass();
                        axezVar.u = axeiVar4;
                        axezVar.b |= 131072;
                        return axepVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.h).i(new eroh() { // from class: tfl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tfw.this.e.g();
            }
        }, this.h).h(new emwl() { // from class: tfm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((axei) obj).c;
            }
        }, this.g);
    }

    private final synchronized elfl e() {
        ejlc ejlcVar = this.l;
        if (ejlcVar != null) {
            return elfl.g(ejlcVar.c());
        }
        final elfl h = d().h(new emwl() { // from class: tfs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                tfw tfwVar = tfw.this;
                String str = (String) obj;
                synchronized (tfwVar) {
                    tfwVar.l = null;
                }
                return str;
            }
        }, this.g);
        this.l = new ejlc(new erog() { // from class: tft
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cfup cfupVar = tfw.a;
                return elfl.this;
            }
        }, this.g);
        return h;
    }

    public final aoku a(fbew fbewVar) {
        aoku n = this.j.n(fbewVar.c);
        return ((Boolean) ((cfup) csgj.V.get()).e()).booleanValue() ? this.j.k(n) : n;
    }

    public final elfl b() {
        return ((Boolean) ((cfup) b.get()).e()).booleanValue() ? e() : d();
    }

    public final elfl c() {
        final elfl h = b().h(new emwl() { // from class: tfq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((djrv) tfw.this.k.b()).w((String) obj));
            }
        }, this.g);
        final elfl h2 = this.c.a().h(new emwl() { // from class: tfk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbew fbewVar = (fbew) obj;
                cfva cfvaVar = aoqm.a;
                boolean booleanValue = ((Boolean) new aoqa().get()).booleanValue();
                tfw tfwVar = tfw.this;
                boolean contains = booleanValue ? tfwVar.i.d().contains(tfwVar.a(fbewVar)) : tfwVar.i.C().contains(fbewVar.c);
                boolean z = false;
                if (contains && fbewVar.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.h);
        return elfo.k(h2, h).a(new Callable() { // from class: tfr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cfup cfupVar = tfw.a;
                tie createBuilder = tif.a.createBuilder();
                boolean booleanValue = ((Boolean) erqt.q(elfl.this)).booleanValue();
                createBuilder.copyOnWrite();
                tif tifVar = (tif) createBuilder.instance;
                tifVar.b |= 1;
                tifVar.c = booleanValue;
                boolean booleanValue2 = ((Boolean) erqt.q(h)).booleanValue();
                createBuilder.copyOnWrite();
                tif tifVar2 = (tif) createBuilder.instance;
                tifVar2.b |= 2;
                tifVar2.d = booleanValue2;
                return createBuilder.build();
            }
        }, this.h);
    }
}
