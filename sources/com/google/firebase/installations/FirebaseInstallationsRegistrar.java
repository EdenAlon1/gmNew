package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import defpackage.eumr;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupo;
import defpackage.eupr;
import defpackage.euqd;
import defpackage.eutb;
import defpackage.eutc;
import defpackage.eutd;
import defpackage.euun;
import defpackage.euuo;
import defpackage.euyt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ euuo lambda$getComponents$0(eupo eupoVar) {
        return new euun((eumr) eupoVar.e(eumr.class), eupoVar.b(eutd.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl b = eupm.b(euuo.class);
        b.b(new euqd(eumr.class, 1, 0));
        b.b(new euqd(eutd.class, 0, 1));
        b.c = new eupr() { // from class: euuq
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eupoVar);
            }
        };
        return Arrays.asList(b.a(), eupm.d(new eutc(), eutb.class), euyt.a("fire-installations", "17.0.2_1p"));
    }
}
