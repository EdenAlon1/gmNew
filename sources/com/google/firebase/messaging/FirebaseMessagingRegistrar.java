package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.detv;
import defpackage.eumr;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupo;
import defpackage.eupr;
import defpackage.euqd;
import defpackage.eusu;
import defpackage.eutf;
import defpackage.euuf;
import defpackage.euuo;
import defpackage.euyt;
import defpackage.euyu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(eupo eupoVar) {
        return new FirebaseMessaging((eumr) eupoVar.e(eumr.class), (euuf) eupoVar.e(euuf.class), eupoVar.b(euyu.class), eupoVar.b(eutf.class), (euuo) eupoVar.e(euuo.class), (detv) eupoVar.e(detv.class), (eusu) eupoVar.e(eusu.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eupm<?>> getComponents() {
        eupl b = eupm.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.b(new euqd(eumr.class, 1, 0));
        b.b(new euqd(euuf.class, 0, 0));
        b.b(new euqd(euyu.class, 0, 1));
        b.b(new euqd(eutf.class, 0, 1));
        b.b(new euqd(detv.class, 0, 0));
        b.b(new euqd(euuo.class, 1, 0));
        b.b(new euqd(eusu.class, 1, 0));
        b.c = new eupr() { // from class: euwt
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(eupoVar);
            }
        };
        b.c();
        return Arrays.asList(b.a(), euyt.a(LIBRARY_NAME, "23.3.2_1p"));
    }
}
