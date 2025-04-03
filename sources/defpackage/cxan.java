package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxan {
    public static final /* synthetic */ int d = 0;
    public final ejvb a;
    public final comc b;
    final String c;
    private final ejvp e;

    static {
        cfvl.i(cfvl.b, "enable_per_subscription_settings_migration_to_settings_store", true);
    }

    public cxan(comy comyVar, ejvb ejvbVar, ctwb ctwbVar, ejvp ejvpVar, int i) {
        this.a = ejvbVar;
        this.e = ejvpVar;
        int a = ctwbVar.h(i).a();
        comu c = comv.c();
        c.d(comb.PER_SUBSCRIPTION_SETTINGS);
        c.g(String.valueOf(a));
        c.f(cwzz.a);
        c.c(new Supplier() { // from class: cxag
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cxam();
            }
        });
        this.b = comyVar.a(c.a());
        this.c = String.valueOf(String.valueOf(comb.PER_SUBSCRIPTION_SETTINGS)).concat(String.valueOf(String.valueOf(a)));
    }

    final cwzz a() {
        try {
            return (cwzz) this.b.l();
        } catch (eygu e) {
            throw new IllegalStateException("InvalidProtocolBufferException while getting per subscription settings data", e);
        }
    }

    public final elfl b(Optional optional) {
        final String str = (String) optional.map(new Function() { // from class: cxac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cxan.d;
                return ((aoku) obj).l();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (str == null) {
            elfl j = this.b.j(new emwl() { // from class: cxah
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cwzz cwzzVar = (cwzz) obj;
                    int i = cxan.d;
                    cwzzVar.getClass();
                    cwzy builder = cwzzVar.toBuilder();
                    builder.copyOnWrite();
                    cwzz cwzzVar2 = (cwzz) builder.instance;
                    cwzzVar2.b &= -33;
                    cwzzVar2.h = cwzz.a.h;
                    return builder.build();
                }
            });
            j(j);
            return j;
        }
        elfl j2 = this.b.j(new emwl() { // from class: cxad
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cwzz cwzzVar = (cwzz) obj;
                int i = cxan.d;
                cwzzVar.getClass();
                cwzy builder = cwzzVar.toBuilder();
                builder.copyOnWrite();
                cwzz cwzzVar2 = (cwzz) builder.instance;
                cwzzVar2.b |= 32;
                cwzzVar2.h = str;
                return builder.build();
            }
        });
        j(j2);
        return j2;
    }

    public final Optional c() {
        cwzz a = a();
        return (a.b & 1) != 0 ? Optional.of(Boolean.valueOf(a.c)) : Optional.empty();
    }

    public final Optional d() {
        cwzz a = a();
        return (a.b & 2) != 0 ? Optional.of(Boolean.valueOf(a.d)) : Optional.empty();
    }

    public final Optional e() {
        cwzz a = a();
        return (a.b & 64) != 0 ? Optional.of(Boolean.valueOf(a.i)) : Optional.empty();
    }

    public final Optional f() {
        cwzz a = a();
        return (a.b & 8) != 0 ? Optional.of(Boolean.valueOf(a.f)) : Optional.empty();
    }

    public final Optional g() {
        cwzz a = a();
        return (a.b & 16) != 0 ? Optional.of(Boolean.valueOf(a.g)) : Optional.empty();
    }

    public final Optional h() {
        cwzz a = a();
        return (a.b & 32) != 0 ? Optional.of(a.h) : Optional.empty();
    }

    public final Optional i() {
        cwzz a = a();
        return (a.b & 4) != 0 ? Optional.of(Boolean.valueOf(a.e)) : Optional.empty();
    }

    public final void j(elfl elflVar) {
        this.e.a(elflVar, this.c);
    }
}
