package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayyi implements ayzk {
    public final ffbr a;
    public final Supplier b;
    public final errl c;
    public volatile Integer d = null;
    private final erqa e = new erqa();

    public ayyi(ffbr ffbrVar, errl errlVar, final ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.c = errlVar;
        this.b = new Supplier() { // from class: ayyg
            @Override // java.util.function.Supplier
            public final Object get() {
                comy comyVar = (comy) ffbr.this.b();
                comu c = comv.c();
                c.d(comb.PHONE_NUMBER_MIN_MATCH_GUESS);
                c.f(ayzg.a);
                return comyVar.a(c.a());
            }
        };
    }

    @Override // defpackage.ayzk
    public final elfl a() {
        return this.d != null ? elfo.e(Optional.of(this.d)) : elfl.g(this.e.b(eldl.c(new erog() { // from class: ayyf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                Object obj;
                final ayyi ayyiVar = ayyi.this;
                if (ayyiVar.d != null) {
                    return elfo.e(Optional.of(ayyiVar.d));
                }
                obj = ayyiVar.b.get();
                return ((comc) obj).h().i(new eroh() { // from class: ayyh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ayzg ayzgVar = (ayzg) obj2;
                        if ((ayzgVar.b & 1) != 0) {
                            return elfo.e(Optional.of(Integer.valueOf(ayzgVar.c)));
                        }
                        final ayyi ayyiVar2 = ayyi.this;
                        return ((ayzk) ayyiVar2.a.b()).a().i(new eroh() { // from class: ayyd
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                Object obj4;
                                final Optional optional = (Optional) obj3;
                                if (!optional.isPresent() || ((Integer) optional.get()).intValue() < 6) {
                                    return elfo.e(optional);
                                }
                                ayyi ayyiVar3 = ayyi.this;
                                ayyiVar3.d = (Integer) optional.get();
                                obj4 = ayyiVar3.b.get();
                                return ((comc) obj4).j(new emwl() { // from class: ayyb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj5) {
                                        ayzf ayzfVar = (ayzf) ((ayzg) obj5).toBuilder();
                                        int intValue = ((Integer) Optional.this.get()).intValue();
                                        ayzfVar.copyOnWrite();
                                        ayzg ayzgVar2 = (ayzg) ayzfVar.instance;
                                        ayzgVar2.b |= 1;
                                        ayzgVar2.c = intValue;
                                        return (ayzg) ayzfVar.build();
                                    }
                                }).h(new emwl() { // from class: ayyc
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj5) {
                                        return Optional.this;
                                    }
                                }, erpp.a);
                            }
                        }, ayyiVar2.c);
                    }
                }, ayyiVar.c);
            }
        }), this.c));
    }

    @Override // defpackage.ayzk
    public final Optional b() {
        Object obj;
        Object obj2;
        emxf.l(!efbd.g());
        if (this.d != null) {
            return Optional.of(this.d);
        }
        try {
            obj = this.b.get();
            ayzg ayzgVar = (ayzg) ((comc) obj).l();
            if ((ayzgVar.b & 1) != 0) {
                return Optional.of(Integer.valueOf(ayzgVar.c));
            }
            final Optional b = ((ayzk) this.a.b()).b();
            if (b.isPresent() && ((Integer) b.get()).intValue() >= 6) {
                obj2 = this.b.get();
                ((comc) obj2).m(new emwl() { // from class: ayye
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        ayzf ayzfVar = (ayzf) ((ayzg) obj3).toBuilder();
                        int intValue = ((Integer) Optional.this.get()).intValue();
                        ayzfVar.copyOnWrite();
                        ayzg ayzgVar2 = (ayzg) ayzfVar.instance;
                        ayzgVar2.b |= 1;
                        ayzgVar2.c = intValue;
                        return (ayzg) ayzfVar.build();
                    }
                });
            }
            return b;
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }
}
