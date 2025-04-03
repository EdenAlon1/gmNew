package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.Registrar;
import defpackage.eumr;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupo;
import defpackage.eupr;
import defpackage.euqd;
import defpackage.eutf;
import defpackage.eutj;
import defpackage.eutt;
import defpackage.eutx;
import defpackage.euuf;
import defpackage.euuo;
import defpackage.euyt;
import defpackage.euyu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(eupo eupoVar) {
        eumr eumrVar = (eumr) eupoVar.e(eumr.class);
        return new FirebaseInstanceId(eumrVar, new eutt(eumrVar.a()), eutj.a(), eutj.a(), eupoVar.b(euyu.class), eupoVar.b(eutf.class), (euuo) eupoVar.e(euuo.class));
    }

    public static /* synthetic */ euuf lambda$getComponents$1(eupo eupoVar) {
        return new eutx((FirebaseInstanceId) eupoVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl b = eupm.b(FirebaseInstanceId.class);
        b.b(new euqd(eumr.class, 1, 0));
        b.b(new euqd(euyu.class, 0, 1));
        b.b(new euqd(eutf.class, 0, 1));
        b.b(new euqd(euuo.class, 1, 0));
        b.c = new eupr() { // from class: eutu
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return Registrar.lambda$getComponents$0(eupoVar);
            }
        };
        b.c();
        eupm a = b.a();
        eupl b2 = eupm.b(euuf.class);
        b2.b(new euqd(FirebaseInstanceId.class, 1, 0));
        b2.c = new eupr() { // from class: eutv
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return Registrar.lambda$getComponents$1(eupoVar);
            }
        };
        return Arrays.asList(a, b2.a(), euyt.a("fire-iid", "21.1.1"));
    }
}
