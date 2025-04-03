package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiuj implements aitz {
    public static final cskc a = cskc.g("BugleSuperSort", "OtpDeletionDataServiceImpl");
    public final ejvp b;
    public final aucp c;
    private final errl d;
    private final errl e;
    private final effy f;
    private final ejvb g;
    private final ffbr h;

    public aiuj(errl errlVar, errl errlVar2, effy effyVar, ejvb ejvbVar, ejvp ejvpVar, ffbr ffbrVar, aucp aucpVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.f = effyVar;
        this.g = ejvbVar;
        this.b = ejvpVar;
        this.h = ffbrVar;
        this.c = aucpVar;
    }

    @Override // defpackage.aitz
    public final ejuh a() {
        return new ejuy(this.g, new eros() { // from class: aiui
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(aiuj.this.c());
            }
        }, "otp_deletion_preference_data_source_key");
    }

    @Override // defpackage.aitz
    public final elfl b() {
        return !((Boolean) aitk.a.e()).booleanValue() ? elfo.e(false) : elfl.g(this.f.a()).h(new emwl() { // from class: aiua
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aiul aiulVar = (aiul) obj;
                boolean z = aiulVar.d;
                aiuj aiujVar = aiuj.this;
                if (z) {
                    if (aiujVar.c.a()) {
                        aiuj.a.h().q("OTP auto-delete banner is not eligible since it has been dismissed.");
                    } else {
                        csjb d = aiuj.a.d();
                        d.v("OTP auto-delete banner is not eligible since it has been dismissed.");
                        d.r();
                    }
                    return false;
                }
                if (aiulVar.b >= ((Integer) aitk.c.e()).intValue()) {
                    if (aiujVar.c.a()) {
                        aiuj.a.h().q("OTP auto-delete banner is not eligible since the impression count reaches the maximum.");
                    } else {
                        csjb d2 = aiuj.a.d();
                        d2.v("OTP auto-delete banner is not eligible since the impression ");
                        d2.v("count reaches the maximum.");
                        d2.r();
                    }
                    return false;
                }
                btta b = bttf.b();
                b.z("hasOtpMessage");
                b.d(new Function() { // from class: aiuc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((btsl) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                b.z("hasOtpMessage3");
                b.f(new Function() { // from class: aiud
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        btte btteVar = (btte) obj2;
                        btteVar.b(1);
                        return btteVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (!b.b().T()) {
                    if (aiujVar.c.a()) {
                        aiuj.a.h().q("OTP auto-delete banner is not eligible since no OTP message found.");
                    } else {
                        csjb d3 = aiuj.a.d();
                        d3.v("OTP auto-delete banner is not eligible since no OTP message found.");
                        d3.r();
                    }
                    return false;
                }
                if (!aiulVar.c) {
                    if (aiujVar.c.a()) {
                        aiuj.a.h().q("OTP auto-delete banner is eligible to show.");
                    } else {
                        csjb d4 = aiuj.a.d();
                        d4.v("OTP auto-delete banner is eligible to show.");
                        d4.r();
                    }
                    return true;
                }
                if (aiujVar.c.a()) {
                    aiuj.a.h().q("OTP auto-delete banner is not eligible since OTP auto-delete is already enabled.");
                } else {
                    csjb d5 = aiuj.a.d();
                    d5.v("OTP auto-delete banner is not eligible since OTP auto-delete ");
                    d5.v("is already enabled.");
                    d5.r();
                }
                return false;
            }
        }, this.e);
    }

    @Override // defpackage.aitz
    public final elfl c() {
        return elfl.g(this.f.a()).h(new emwl() { // from class: aiue
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aiul) obj).c);
            }
        }, this.d);
    }

    @Override // defpackage.aitz
    public final elfl d(final boolean z) {
        elfl h = elfl.g(this.f.b(new emwl() { // from class: aiuf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aiuk aiukVar = (aiuk) ((aiul) obj).toBuilder();
                aiukVar.copyOnWrite();
                ((aiul) aiukVar.instance).c = z;
                return (aiul) aiukVar.build();
            }
        }, this.d)).h(new emwl() { // from class: aiug
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aiuj.this.b.a(elfo.e(null), "otp_deletion_preference_data_source_key");
                return null;
            }
        }, this.d);
        ((aiuv) this.h.b()).b(new Supplier() { // from class: aiuu
            @Override // java.util.function.Supplier
            public final Object get() {
                eqjf eqjfVar = (eqjf) eqjr.a.createBuilder();
                eqjo eqjoVar = (eqjo) eqjq.a.createBuilder();
                eqjoVar.copyOnWrite();
                eqjq eqjqVar = (eqjq) eqjoVar.instance;
                eqjqVar.c = (true != z ? 3 : 2) - 1;
                eqjqVar.b |= 1;
                eqjfVar.copyOnWrite();
                eqjr eqjrVar = (eqjr) eqjfVar.instance;
                eqjq eqjqVar2 = (eqjq) eqjoVar.build();
                eqjqVar2.getClass();
                eqjrVar.c = eqjqVar2;
                eqjrVar.b = 3;
                return (eqjr) eqjfVar.build();
            }
        });
        return h;
    }

    @Override // defpackage.aitz
    public final void e() {
        axnw.h(this.f.b(new emwl() { // from class: aiuh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aiuk aiukVar = (aiuk) ((aiul) obj).toBuilder();
                int i = ((aiul) aiukVar.instance).b + 1;
                aiukVar.copyOnWrite();
                ((aiul) aiukVar.instance).b = i;
                return (aiul) aiukVar.build();
            }
        }, this.d));
    }

    @Override // defpackage.aitz
    public final elfl f() {
        return elfl.g(this.f.b(new emwl() { // from class: aiub
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aiuk aiukVar = (aiuk) ((aiul) obj).toBuilder();
                aiukVar.copyOnWrite();
                ((aiul) aiukVar.instance).d = true;
                return (aiul) aiukVar.build();
            }
        }, this.d));
    }
}
