package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.EnumMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdv {
    public final Context c;
    public final ffbr d;
    public effy e;
    public String f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    private final efgc j;
    private final dikr k;
    private final errl l;
    private final ffbr m;
    private static final ListenableFuture h = erre.a;
    private static final ListenableFuture i = erqt.i(ezcn.NOT_SET);
    public static final enhk a = ennc.c(new EnumMap(enhk.n(csod.UNKNOWN, ezcp.SMS_CONNECTION_AVAILABILITY_UNKNOWN, csod.AVAILABLE, ezcp.SMS_CONNECTION_AVAILABLE, csod.UNAVAILABLE, ezcp.SMS_CONNECTION_UNAVAILABLE)));
    public static final entd b = entd.c(dktl.a);

    public dkdv(Context context, efgc efgcVar, dikr dikrVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = context;
        this.j = efgcVar;
        this.k = dikrVar;
        this.l = errlVar;
        this.m = ffbrVar;
        this.d = ffbrVar2;
    }

    static ezdn b(ezdn ezdnVar, ezcz ezczVar) {
        int a2 = djai.a();
        if (a2 == 0) {
            return ezdnVar;
        }
        ezde ezdeVar = ezdnVar.e;
        if (ezdeVar == null) {
            ezdeVar = ezde.a;
        }
        ezcv ezcvVar = (ezcv) ezdeVar.toBuilder();
        if (a2 > 0) {
            ezde ezdeVar2 = ezdnVar.e;
            if (ezdeVar2 == null) {
                ezdeVar2 = ezde.a;
            }
            if (ezdeVar2.d.size() >= a2) {
                ezcvVar.copyOnWrite();
                ezde ezdeVar3 = (ezde) ezcvVar.instance;
                ezdeVar3.a();
                ezdeVar3.d.remove(0);
                Integer valueOf = Integer.valueOf(djai.a());
                ezde ezdeVar4 = ezdnVar.e;
                if (ezdeVar4 == null) {
                    ezdeVar4 = ezde.a;
                }
                dkty.q("ProvisioningEvent exceeds max number %d, current size %d", valueOf, Integer.valueOf(ezdeVar4.d.size()));
            }
        }
        ezcvVar.copyOnWrite();
        ezde ezdeVar5 = (ezde) ezcvVar.instance;
        ezczVar.getClass();
        ezdeVar5.a();
        ezdeVar5.d.add(ezczVar);
        ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
        ezde ezdeVar6 = (ezde) ezcvVar.build();
        ezdmVar.copyOnWrite();
        ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
        ezdeVar6.getClass();
        ezdnVar2.e = ezdeVar6;
        ezdnVar2.b |= 4;
        return (ezdn) ezdmVar.build();
    }

    public static boolean i() {
        if (djai.H()) {
            return (djai.K() || djai.D()) ? false : true;
        }
        return true;
    }

    private final boolean t(String str) {
        return ((dkdw) this.m.b()).J(str);
    }

    public final ListenableFuture a() {
        effy effyVar = this.e;
        return effyVar != null ? effyVar.a() : erqt.h(new NullPointerException());
    }

    public final ezdn c(ezdn ezdnVar) {
        if ((ezdnVar.b & 4) == 0) {
            return ezdnVar;
        }
        ezde ezdeVar = ezdnVar.e;
        if (ezdeVar == null) {
            ezdeVar = ezde.a;
        }
        ezdc b2 = ezdc.b(ezdeVar.c);
        if (b2 == null) {
            b2 = ezdc.UNKNOWN_PROVISIONING_STAGE;
        }
        dkty.c("finishProvisioningStageInternal, append %s", b2);
        if (djai.L()) {
            dikr dikrVar = this.k;
            Context context = this.c;
            ezct ezctVar = (ezct) ezcu.a.createBuilder();
            ezde ezdeVar2 = ezdnVar.e;
            if (ezdeVar2 == null) {
                ezdeVar2 = ezde.a;
            }
            ezctVar.copyOnWrite();
            ezcu ezcuVar = (ezcu) ezctVar.instance;
            ezdeVar2.getClass();
            ezcuVar.c = ezdeVar2;
            ezcuVar.b |= 1;
            ezcq ezcqVar = ezdnVar.f;
            if (ezcqVar == null) {
                ezcqVar = ezcq.a;
            }
            ezch ezchVar = (ezch) ezcqVar.toBuilder();
            ezchVar.copyOnWrite();
            ezcq ezcqVar2 = (ezcq) ezchVar.instance;
            ezcqVar2.b &= -65537;
            ezcqVar2.t = 0L;
            ezchVar.copyOnWrite();
            ezcq ezcqVar3 = (ezcq) ezchVar.instance;
            ezcqVar3.b &= -32769;
            ezcqVar3.s = 0L;
            ezcq ezcqVar4 = (ezcq) ezchVar.build();
            ezctVar.copyOnWrite();
            ezcu ezcuVar2 = (ezcu) ezctVar.instance;
            ezcqVar4.getClass();
            ezcuVar2.d = ezcqVar4;
            ezcuVar2.b |= 2;
            dikrVar.e(context, (ezcu) ezctVar.build());
        }
        ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
        Integer num = (Integer) djai.t().a.J.a();
        int intValue = num.intValue();
        if (intValue != 0) {
            ezcg ezcgVar = ((ezdn) ezdmVar.instance).d;
            if (ezcgVar == null) {
                ezcgVar = ezcg.a;
            }
            ezce ezceVar = (ezce) ezcgVar.toBuilder();
            if (intValue > 0) {
                ezcg ezcgVar2 = ((ezdn) ezdmVar.instance).d;
                if (ezcgVar2 == null) {
                    ezcgVar2 = ezcg.a;
                }
                if (ezcgVar2.c.size() >= intValue) {
                    ezceVar.copyOnWrite();
                    ezcg ezcgVar3 = (ezcg) ezceVar.instance;
                    ezcgVar3.a();
                    ezcgVar3.c.remove(0);
                    ezcg ezcgVar4 = ((ezdn) ezdmVar.instance).d;
                    if (ezcgVar4 == null) {
                        ezcgVar4 = ezcg.a;
                    }
                    dkty.q("ProvisioningStage exceeds max number %d, current stage count %d ", num, Integer.valueOf(ezcgVar4.c.size()));
                }
            }
            ezceVar.a(ezdeVar);
            ezcg ezcgVar5 = (ezcg) ezceVar.build();
            ezdmVar.copyOnWrite();
            ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
            ezcgVar5.getClass();
            ezdnVar2.d = ezcgVar5;
            ezdnVar2.b |= 2;
        }
        ezdmVar.copyOnWrite();
        ezdn ezdnVar3 = (ezdn) ezdmVar.instance;
        ezdnVar3.e = null;
        ezdnVar3.b &= -5;
        return (ezdn) ezdmVar.build();
    }

    public final ezdn d(ezdn ezdnVar, String str, Optional optional) {
        boolean t = t((String) optional.orElse(this.f));
        ezch ezchVar = (ezch) ezcq.a.createBuilder();
        ezcn ezcnVar = t ? ezcn.TRUE : ezcn.FALSE;
        ezchVar.copyOnWrite();
        ezcq ezcqVar = (ezcq) ezchVar.instance;
        ezcqVar.c = ezcnVar.d;
        ezcqVar.b |= 1;
        ezchVar.copyOnWrite();
        ezcq ezcqVar2 = (ezcq) ezchVar.instance;
        ezcqVar2.h = 3;
        ezcqVar2.b |= 32;
        String str2 = dikk.c;
        ezchVar.copyOnWrite();
        ezcq ezcqVar3 = (ezcq) ezchVar.instance;
        str2.getClass();
        ezcqVar3.b |= 2;
        ezcqVar3.d = str2;
        optional.isPresent();
        eqpc b2 = ((dijt) this.d.b()).b(new djro((String) optional.get()));
        ezchVar.copyOnWrite();
        ezcq ezcqVar4 = (ezcq) ezchVar.instance;
        b2.getClass();
        ezcqVar4.z = b2;
        ezcqVar4.b |= 4194304;
        if (str != null) {
            ezchVar.copyOnWrite();
            ezcq ezcqVar5 = (ezcq) ezchVar.instance;
            ezcqVar5.b |= 1048576;
            ezcqVar5.x = str;
        }
        ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
        ezcq ezcqVar6 = (ezcq) ezchVar.build();
        ezdmVar.copyOnWrite();
        ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
        ezcqVar6.getClass();
        ezdnVar2.f = ezcqVar6;
        ezdnVar2.b |= 8;
        return (ezdn) ezdmVar.build();
    }

    public final String e(Optional optional) {
        return (String) optional.orElse(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Context context, ezez ezezVar, dikl diklVar, String str, djrm djrmVar) {
        try {
            effy effyVar = (effy) this.g.get(djrn.a(djrmVar).a);
            diklVar.g(context, ezezVar, ((ezcn) (effyVar == null ? i : erny.f(erqc.o(erny.f(effyVar.a(), new emwl() { // from class: dkcz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ezcq ezcqVar = ((ezdn) obj).f;
                    return ezcqVar == null ? ezcq.a : ezcqVar;
                }
            }, erpp.a)), new emwl() { // from class: dkda
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ezcn b2 = ezcn.b(((ezcq) obj).g);
                    return b2 == null ? ezcn.NOT_SET : b2;
                }
            }, erpp.a)).get(1L, TimeUnit.SECONDS)) != ezcn.FALSE, str, djrmVar);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            dkty.q("Timeout when reading RcsProvisioningProtoDataStorage", new Object[0]);
        }
    }

    public final void g(String str) {
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(this.c);
        efbrVar.f("provisioningmetrics");
        efbrVar.g(String.format("%s.pb", str));
        Uri a2 = efbrVar.a();
        effz h2 = efga.h();
        h2.f(a2);
        h2.e(ezdn.a);
        this.e = this.j.a(h2.a());
        dkty.k("Created new RcsProvisioningProtoDataStorage for sim %s", dktx.SIM_ID.c(str));
        this.f = str;
        this.g.put(str, this.e);
    }

    public final boolean h(String str) {
        return ((dkdw) this.m.b()).I(str);
    }

    public final boolean j(String str) {
        if (djai.H()) {
            return !(djai.K() || djai.L() || djai.D()) || h(str);
        }
        return true;
    }

    public final void k(ezdc ezdcVar, final String str, final Boolean bool, final String str2) {
        dkty.c("enterProvisioningStage, provisioningSessionId=%s, provisioningStage=%s, simId=%s", str, ezdcVar.name(), dktx.SIM_ID.c(str2));
        if (j(str2)) {
            return;
        }
        m(ezdcVar, str2);
        o(2);
        r(new dkdu() { // from class: dkcr
            /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0059  */
            @Override // defpackage.dkdu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.ezch r8) {
                /*
                    r7 = this;
                    dkdv r0 = defpackage.dkdv.this
                    android.content.Context r1 = r0.c
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                    android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
                    boolean r2 = j$.util.Objects.isNull(r1)
                    r3 = 1
                    if (r2 == 0) goto L19
                L17:
                    r1 = r3
                    goto L28
                L19:
                    int r2 = r1.getType()
                    if (r2 != r3) goto L21
                    r1 = 2
                    goto L28
                L21:
                    int r1 = r1.getType()
                    if (r1 != 0) goto L17
                    r1 = 3
                L28:
                    java.lang.Boolean r2 = r3
                    java.lang.String r4 = r2
                    r8.copyOnWrite()
                    MessageType extends eyfy<MessageType, BuilderType> r5 = r8.instance
                    ezcq r5 = (defpackage.ezcq) r5
                    ezcq r6 = defpackage.ezcq.a
                    int r1 = r1 + (-1)
                    r5.e = r1
                    int r1 = r5.b
                    r1 = r1 | 4
                    r5.b = r1
                    r8.copyOnWrite()
                    MessageType extends eyfy<MessageType, BuilderType> r1 = r8.instance
                    ezcq r1 = (defpackage.ezcq) r1
                    int r5 = r1.b
                    r6 = 1048576(0x100000, float:1.469368E-39)
                    r5 = r5 | r6
                    r1.b = r5
                    java.lang.String r4 = defpackage.emxe.b(r4)
                    r1.x = r4
                    boolean r1 = r2.booleanValue()
                    if (r1 == 0) goto L5c
                    ezcn r1 = defpackage.ezcn.TRUE
                    goto L5e
                L5c:
                    ezcn r1 = defpackage.ezcn.FALSE
                L5e:
                    java.lang.String r2 = r4
                    r8.copyOnWrite()
                    MessageType extends eyfy<MessageType, BuilderType> r4 = r8.instance
                    ezcq r4 = (defpackage.ezcq) r4
                    int r1 = r1.d
                    r4.c = r1
                    int r1 = r4.b
                    r1 = r1 | r3
                    r4.b = r1
                    ffbr r0 = r0.d
                    java.lang.Object r0 = r0.b()
                    dijt r0 = (defpackage.dijt) r0
                    djro r1 = new djro
                    r1.<init>(r2)
                    eqpc r0 = r0.b(r1)
                    r8.copyOnWrite()
                    MessageType extends eyfy<MessageType, BuilderType> r8 = r8.instance
                    ezcq r8 = (defpackage.ezcq) r8
                    r0.getClass()
                    r8.z = r0
                    int r0 = r8.b
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 | r1
                    r8.b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dkcr.a(ezch):void");
            }
        }, str2);
    }

    public final void l(final djtc djtcVar, Optional optional) {
        if (j(e(optional))) {
            return;
        }
        r(new dkdu() { // from class: dkcw
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                djtc djtcVar2 = djtc.this;
                ezcqVar.j = djtcVar2.a.N;
                ezcqVar.b |= 128;
                ezcn ezcnVar = djtcVar2.e() ? ezcn.TRUE : ezcn.FALSE;
                ezchVar.copyOnWrite();
                ezcq ezcqVar3 = (ezcq) ezchVar.instance;
                ezcqVar3.k = ezcnVar.d;
                ezcqVar3.b |= 256;
            }
        }, e(optional));
    }

    public final void m(final ezdc ezdcVar, String str) {
        dkty.c("startProvisioningStage, provisioningStageType=%s", ezdcVar);
        if (j(str)) {
            return;
        }
        s(new emwl() { // from class: dkde
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ezdn ezdnVar = (ezdn) obj;
                if ((ezdnVar.b & 4) != 0) {
                    ezdnVar = dkdv.this.c(ezdnVar);
                }
                ezdc ezdcVar2 = ezdcVar;
                ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
                ezcv ezcvVar = (ezcv) ezde.a.createBuilder();
                ezcvVar.copyOnWrite();
                ezde ezdeVar = (ezde) ezcvVar.instance;
                ezdeVar.c = ezdcVar2.z;
                ezdeVar.b |= 1;
                ezde ezdeVar2 = (ezde) ezcvVar.build();
                ezdmVar.copyOnWrite();
                ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
                ezdeVar2.getClass();
                ezdnVar2.e = ezdeVar2;
                ezdnVar2.b |= 4;
                return (ezdn) ezdmVar.build();
            }
        }, Optional.of(str));
    }

    public final ezdn n(ezdn ezdnVar, int i2, String str) {
        if ((ezdnVar.b & 2) == 0) {
            return ezdnVar;
        }
        ezdn c = c(ezdnVar);
        ezcg ezcgVar = c.d;
        if (ezcgVar == null) {
            ezcgVar = ezcg.a;
        }
        ezce ezceVar = (ezce) ezcgVar.toBuilder();
        ezcq ezcqVar = c.f;
        if (ezcqVar == null) {
            ezcqVar = ezcq.a;
        }
        ezcq ezcqVar2 = (ezcq) ((ezch) ezcqVar.toBuilder()).build();
        ezceVar.copyOnWrite();
        ezcg ezcgVar2 = (ezcg) ezceVar.instance;
        ezcqVar2.getClass();
        ezcgVar2.d = ezcqVar2;
        ezcgVar2.b |= 1;
        ezceVar.copyOnWrite();
        ezcg ezcgVar3 = (ezcg) ezceVar.instance;
        ezcgVar3.g = i2 - 1;
        ezcgVar3.b |= 8;
        eyja d = eykm.d(dkvj.a().longValue());
        ezceVar.copyOnWrite();
        ezcg ezcgVar4 = (ezcg) ezceVar.instance;
        d.getClass();
        ezcgVar4.f = d;
        ezcgVar4.b |= 4;
        ezcg ezcgVar5 = (ezcg) ezceVar.build();
        if (djai.K()) {
            this.k.d(this.c, ezcgVar5);
        }
        ezdm ezdmVar = (ezdm) c.toBuilder();
        if (djai.D()) {
            ezcq ezcqVar3 = c.f;
            if (ezcqVar3 == null) {
                ezcqVar3 = ezcq.a;
            }
            String e = e(Optional.of(str));
            if (djai.Q() && ezcqVar3.t < 8 && !t(e)) {
                ezdmVar.copyOnWrite();
                ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
                ezcgVar5.getClass();
                ezdnVar2.c = ezcgVar5;
                ezdnVar2.b |= 1;
            }
            ezdmVar.copyOnWrite();
            ezdn ezdnVar3 = (ezdn) ezdmVar.instance;
            ezcgVar5.getClass();
            ezdnVar3.d = ezcgVar5;
            ezdnVar3.b |= 2;
        } else {
            ezdmVar.copyOnWrite();
            ezdn ezdnVar4 = (ezdn) ezdmVar.instance;
            ezdnVar4.d = null;
            ezdnVar4.b &= -3;
            ezdmVar.copyOnWrite();
            ezdn ezdnVar5 = (ezdn) ezdmVar.instance;
            ezdnVar5.f = null;
            ezdnVar5.b &= -9;
        }
        return (ezdn) ezdmVar.build();
    }

    public final void o(int i2) {
        q(i2, -1, Optional.empty());
    }

    public final void p(int i2, String str) {
        q(i2, -1, Optional.of(str));
    }

    public final void q(int i2, int i3, Optional optional) {
        if (j(this.f)) {
            return;
        }
        long longValue = dkvj.a().longValue();
        final ezcw ezcwVar = (ezcw) ezcz.a.createBuilder();
        ezcwVar.copyOnWrite();
        ezcz ezczVar = (ezcz) ezcwVar.instance;
        ezczVar.c = i2 - 1;
        ezczVar.b |= 1;
        ezcwVar.copyOnWrite();
        ezcz ezczVar2 = (ezcz) ezcwVar.instance;
        ezczVar2.b |= 2;
        ezczVar2.d = longValue;
        if (i3 >= 0) {
            ezcwVar.copyOnWrite();
            ezcz ezczVar3 = (ezcz) ezcwVar.instance;
            ezczVar3.b |= 4;
            ezczVar3.e = i3;
        }
        s(new emwl() { // from class: dkdb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enhk enhkVar = dkdv.a;
                return dkdv.b((ezdn) obj, (ezcz) ezcw.this.build());
            }
        }, optional);
    }

    public final void r(final dkdu dkduVar, String str) {
        s(new emwl() { // from class: dkdn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ezdn ezdnVar = (ezdn) obj;
                enhk enhkVar = dkdv.a;
                ezcq ezcqVar = ezdnVar.f;
                if (ezcqVar == null) {
                    ezcqVar = ezcq.a;
                }
                dkdu dkduVar2 = dkdu.this;
                ezch ezchVar = (ezch) ezcqVar.toBuilder();
                dkduVar2.a(ezchVar);
                ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
                ezcq ezcqVar2 = (ezcq) ezchVar.build();
                ezdmVar.copyOnWrite();
                ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
                ezcqVar2.getClass();
                ezdnVar2.f = ezcqVar2;
                ezdnVar2.b |= 8;
                return (ezdn) ezdmVar.build();
            }
        }, Optional.of(str));
    }

    public final void s(final emwl emwlVar, Optional optional) {
        if (((Boolean) optional.map(new Function() { // from class: dkcy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(!dkdv.this.g.containsKey((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(Boolean.valueOf(this.e == null))).booleanValue()) {
            if (!optional.isPresent()) {
                throw new IllegalStateException("updateStorage called before ProvisioningEngineMetricsStorage fully initialized");
            }
            g((String) optional.get());
        }
        effy effyVar = optional.isPresent() ? (effy) this.g.get(optional.get()) : this.e;
        if (effyVar == null) {
            return;
        }
        erqt.r(effyVar.b(new emwl() { // from class: dkdo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ezdn ezdnVar = (ezdn) obj;
                if (ezdnVar != null) {
                    return (ezdn) emwlVar.apply(ezdnVar);
                }
                dkty.g("Failed to read RcsProvisioningProtoDataStorage for sim %s", dktx.SIM_ID.c(dkdv.this.f));
                return null;
            }
        }, this.l), new dkdt(), erpp.a);
    }
}
