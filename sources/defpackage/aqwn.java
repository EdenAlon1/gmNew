package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqwn implements aqge, ctbj {
    public static final entd a = entd.c("BugleSelfIdentity");
    public final ctbl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final int f;
    public final String g;
    private final fazb h;
    private ctbx i;

    public aqwn(ffbr ffbrVar, ctbk ctbkVar, errl errlVar, ffbr ffbrVar2, fazb fazbVar, ctwi ctwiVar) {
        this.e = ffbrVar;
        this.b = ctbkVar.a(this);
        this.c = errlVar;
        this.d = ffbrVar2;
        this.h = fazbVar;
        int a2 = ctwiVar.a();
        this.f = a2;
        djrp.a(a2);
        this.g = ctwiVar.r();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.b.a(new ctbf() { // from class: aqwi
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                entd entdVar = aqwn.a;
                return aqgd.this.a();
            }
        }, "EtouffeeEncryptionStateSupplier::register", "EtouffeeEncryptionStateSupplier::callback", "EtouffeeEncryptionStateSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return elfo.h(new erog() { // from class: aqwg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final aqwn aqwnVar = aqwn.this;
                return ((ckac) aqwnVar.e.b()).e(aqwnVar.f).i(new eroh() { // from class: aqwl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        aqwn aqwnVar2 = aqwn.this;
                        awui awuiVar = (awui) obj;
                        if (awuiVar != null) {
                            return ((bzqc) aqwnVar2.d.b()).e(awuiVar.d);
                        }
                        ensz enszVar = (ensz) aqwn.a.j();
                        enszVar.Y(csux.t, Integer.valueOf(aqwnVar2.f));
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "getEtouffeeEnabled", 110, "EtouffeeEncryptionStateSupplier.java")).q("Can not get e2ee status for convo2, identity is missing");
                        return elfo.e(false);
                    }
                }, aqwnVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ctbj
    public final void fN() {
        aqwf aqwfVar = (aqwf) this.h.b();
        this.i = aqwfVar.a.a(new ctbf() { // from class: aqwm
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                final aoku aokuVar = (aoku) obj;
                final aqwn aqwnVar = aqwn.this;
                return elfo.f(new Runnable() { // from class: aqwk
                    @Override // java.lang.Runnable
                    public final void run() {
                        aqwn aqwnVar2 = aqwn.this;
                        final awui a2 = ((ckac) aqwnVar2.e.b()).a(aqwnVar2.f);
                        if (a2 == null) {
                            return;
                        }
                        aoku aokuVar2 = aokuVar;
                        if (((Boolean) aokuVar2.e().map(new Function() { // from class: aqwh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                entd entdVar = aqwn.a;
                                return Boolean.valueOf(((awui) obj2).equals(awui.this));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(false)).booleanValue()) {
                            ensz enszVar = (ensz) aqwn.a.h();
                            enszVar.Y(csux.t, Integer.valueOf(aqwnVar2.f));
                            enszVar.Y(csux.M, aqwnVar2.g);
                            enszVar.Y(csux.E, ((awui) aokuVar2.e().get()).d);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "notifyUpdate", 139, "EtouffeeEncryptionStateSupplier.java")).q("SelfIdentity encryption state changed.");
                            aqwnVar2.b.c(new Supplier() { // from class: aqwj
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    entd entdVar = aqwn.a;
                                    return null;
                                }
                            }, "EtouffeeEncryptionStateSupplier::Notify");
                        }
                    }
                }, aqwnVar.c);
            }
        }, "EtouffeeEncryptionStateListener::register", "EtouffeeEncryptionStateListener::callback", "EtouffeeEncryptionStateListener::unregister");
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.i;
        if (ctbxVar != null) {
            ctbxVar.a();
            this.i = null;
        }
    }
}
