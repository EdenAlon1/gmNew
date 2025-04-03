package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvi {
    public static final enip a = enip.r(cmau.OTP_TIMEOUT, cmau.OTP_THROTTLED);
    public final dkcp b;
    public final dlpw c;

    public djvi(dkcp dkcpVar, dlpw dlpwVar) {
        this.b = dkcpVar;
        this.c = dlpwVar;
    }

    public final boolean a(String str, String str2, int i) {
        Optional h = this.b.h(str, ezck.SIM);
        return h.isPresent() && ((cmay) h.get()).c.equals(str2) && Collection.EL.stream(((cmay) h.get()).d).filter(new Predicate() { // from class: djvg
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cmax cmaxVar = (cmax) obj;
                enip enipVar = djvi.a;
                if ((cmaxVar.b & 2) == 0) {
                    return false;
                }
                enip enipVar2 = djvi.a;
                cmav cmavVar = cmaxVar.d;
                if (cmavVar == null) {
                    cmavVar = cmav.a;
                }
                cmau b = cmau.b(cmavVar.e);
                if (b == null) {
                    b = cmau.UNRECOGNIZED;
                }
                return enipVar2.contains(b);
            }
        }).count() >= ((long) i);
    }

    public final void b(final String str, final ezck ezckVar, String str2, cmau cmauVar) {
        Optional of;
        int b;
        Optional empty;
        Optional h = this.b.h(str, ezckVar);
        if (h.isEmpty()) {
            return;
        }
        Object obj = h.get();
        Optional empty2 = Optional.empty();
        if (str2 == null) {
            empty = Optional.empty();
        } else {
            cmay cmayVar = (cmay) obj;
            ArrayList a2 = enkr.a(cmayVar.d);
            if (cmayVar.d.isEmpty()) {
                of = Optional.empty();
            } else {
                cmax cmaxVar = (cmax) enjk.j(cmayVar.d);
                cmas cmasVar = cmaxVar.c;
                if (cmasVar == null) {
                    cmasVar = cmas.a;
                }
                of = (cmasVar.d.equals(str2) && (b = cmaw.b(cmaxVar.e)) != 0 && b == 3) ? Optional.of(cmaxVar) : Optional.empty();
            }
            if (!of.isEmpty()) {
                cmas cmasVar2 = ((cmax) of.get()).c;
                if (cmasVar2 == null) {
                    cmasVar2 = cmas.a;
                }
                if (cmasVar2.d.equals(str2)) {
                    cmat cmatVar = (cmat) cmav.a.createBuilder();
                    cmatVar.copyOnWrite();
                    cmav cmavVar = (cmav) cmatVar.instance;
                    cmavVar.e = cmauVar.a();
                    cmavVar.b |= 4;
                    eyja d = eykm.d(this.c.f().toEpochMilli());
                    cmatVar.copyOnWrite();
                    cmav cmavVar2 = (cmav) cmatVar.instance;
                    d.getClass();
                    cmavVar2.c = d;
                    cmavVar2.b |= 1;
                    empty2.isPresent();
                    cmaq cmaqVar = (cmaq) cmax.a.createBuilder((eyfy) of.get());
                    cmav cmavVar3 = (cmav) cmatVar.build();
                    cmaqVar.copyOnWrite();
                    cmax cmaxVar2 = (cmax) cmaqVar.instance;
                    cmavVar3.getClass();
                    cmaxVar2.d = cmavVar3;
                    cmaxVar2.b |= 2;
                    a2.set(a2.size() - 1, (cmax) cmaqVar.build());
                    cmap createBuilder = cmay.a.createBuilder((eyfy) obj);
                    createBuilder.copyOnWrite();
                    ((cmay) createBuilder.instance).d = cmay.emptyProtobufList();
                    createBuilder.a(a2);
                    empty = Optional.of(createBuilder.build());
                }
            }
            empty = Optional.empty();
        }
        empty.ifPresent(new Consumer() { // from class: djvh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                djvi.this.b.r(str, ezckVar, (cmay) obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
