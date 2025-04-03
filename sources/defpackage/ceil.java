package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceiw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceil(ffgu ffguVar, ceiw ceiwVar) {
        super(2, ffguVar);
        this.b = ceiwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl k = this.b.c.k();
            this.a = 1;
            obj = fgfz.c(k, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final String str = ((axez) obj).j;
        str.getClass();
        ceiw ceiwVar = this.b;
        efbd.b();
        final AtomicReference atomicReference = new AtomicReference("");
        ceiwVar.c.e.get().m(new emwl() { // from class: axfe
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj2).toBuilder();
                String str2 = ((axez) builder.instance).O;
                atomicReference.set(str2);
                String str3 = str;
                if (!Objects.equals(str2, str3)) {
                    builder.copyOnWrite();
                    axez axezVar = (axez) builder.instance;
                    axezVar.c |= 512;
                    axezVar.O = str3;
                }
                return builder.build();
            }
        });
        if (!ffkj.e(str, (String) atomicReference.get())) {
            return null;
        }
        ceiw.b.k().t("Duplicate session id=%s detected, silently aborting.", str);
        epep epepVar = (epep) epeq.a.createBuilder();
        epfx epfxVar = epfx.RESTORE;
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeqVar.c = epfxVar.s;
        epeqVar.b |= 1;
        epepVar.copyOnWrite();
        epeq epeqVar2 = (epeq) epepVar.instance;
        epeqVar2.d = 3;
        epeqVar2.b |= 2;
        epeg epegVar = epeg.STARTED_SIMULTANEOUS_RESTORES;
        epepVar.copyOnWrite();
        epeq epeqVar3 = (epeq) epepVar.instance;
        epeqVar3.e = epegVar.bs;
        epeqVar3.b |= 4;
        epepVar.a(this.b.e.b());
        this.b.e.m((epeq) epepVar.build());
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceil ceilVar = new ceil(ffguVar, this.b);
        ceilVar.c = obj;
        return ceilVar;
    }
}
