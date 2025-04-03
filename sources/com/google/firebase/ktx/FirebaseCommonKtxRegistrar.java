package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.eunf;
import defpackage.eung;
import defpackage.eunh;
import defpackage.euni;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.euqd;
import defpackage.euqq;
import defpackage.euvq;
import defpackage.euvr;
import defpackage.euvs;
import defpackage.euvt;
import defpackage.ffbs;
import defpackage.ffdx;
import defpackage.ffsd;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@ffbs
/* loaded from: classes5.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl a = eupm.a(new euqq(eunf.class, ffsd.class));
        a.b(new euqd(new euqq(eunf.class, Executor.class), 1, 0));
        a.c = euvq.a;
        eupl a2 = eupm.a(new euqq(eunh.class, ffsd.class));
        a2.b(new euqd(new euqq(eunh.class, Executor.class), 1, 0));
        a2.c = euvr.a;
        eupl a3 = eupm.a(new euqq(eung.class, ffsd.class));
        a3.b(new euqd(new euqq(eung.class, Executor.class), 1, 0));
        a3.c = euvs.a;
        eupl a4 = eupm.a(new euqq(euni.class, ffsd.class));
        a4.b(new euqd(new euqq(euni.class, Executor.class), 1, 0));
        a4.c = euvt.a;
        return ffdx.g(a.a(), a2.a(), a3.a(), a4.a());
    }
}
