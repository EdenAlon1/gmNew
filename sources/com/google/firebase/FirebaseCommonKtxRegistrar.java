package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.eums;
import defpackage.eumt;
import defpackage.eumu;
import defpackage.eumv;
import defpackage.eunf;
import defpackage.eung;
import defpackage.eunh;
import defpackage.euni;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.euqd;
import defpackage.euqq;
import defpackage.ffdx;
import defpackage.ffsd;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl a = eupm.a(new euqq(eunf.class, ffsd.class));
        a.b(new euqd(new euqq(eunf.class, Executor.class), 1, 0));
        a.c = eums.a;
        eupl a2 = eupm.a(new euqq(eunh.class, ffsd.class));
        a2.b(new euqd(new euqq(eunh.class, Executor.class), 1, 0));
        a2.c = eumt.a;
        eupl a3 = eupm.a(new euqq(eung.class, ffsd.class));
        a3.b(new euqd(new euqq(eung.class, Executor.class), 1, 0));
        a3.c = eumu.a;
        eupl a4 = eupm.a(new euqq(euni.class, ffsd.class));
        a4.b(new euqd(new euqq(euni.class, Executor.class), 1, 0));
        a4.c = eumv.a;
        return ffdx.g(a.a(), a2.a(), a3.a(), a4.a());
    }
}
