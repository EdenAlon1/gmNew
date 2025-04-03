package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import defpackage.detv;
import defpackage.detz;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupo;
import defpackage.eupr;
import defpackage.euqd;
import defpackage.euqq;
import defpackage.euru;
import defpackage.eurv;
import defpackage.euyt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ detv lambda$getComponents$0(eupo eupoVar) {
        detz.b((Context) eupoVar.e(Context.class));
        return detz.a().c();
    }

    public static /* synthetic */ detv lambda$getComponents$1(eupo eupoVar) {
        detz.b((Context) eupoVar.e(Context.class));
        return detz.a().c();
    }

    public static /* synthetic */ detv lambda$getComponents$2(eupo eupoVar) {
        detz.b((Context) eupoVar.e(Context.class));
        return detz.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl b = eupm.b(detv.class);
        b.a = LIBRARY_NAME;
        b.b(new euqd(Context.class, 1, 0));
        b.c = new eupr() { // from class: eurw
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return TransportRegistrar.lambda$getComponents$0(eupoVar);
            }
        };
        eupl a = eupm.a(new euqq(euru.class, detv.class));
        a.b(new euqd(Context.class, 1, 0));
        a.c = new eupr() { // from class: eurx
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return TransportRegistrar.lambda$getComponents$1(eupoVar);
            }
        };
        eupl a2 = eupm.a(new euqq(eurv.class, detv.class));
        a2.b(new euqd(Context.class, 1, 0));
        a2.c = new eupr() { // from class: eury
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return TransportRegistrar.lambda$getComponents$2(eupoVar);
            }
        };
        return Arrays.asList(b.a(), a.a(), a2.a(), euyt.a(LIBRARY_NAME, "19.0.0_1p"));
    }
}
