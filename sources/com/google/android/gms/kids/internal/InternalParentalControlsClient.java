package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.internal.AbstractKidsCallbacks;
import com.google.android.gms.kids.internal.IParentalControlsListener;
import com.google.android.gms.kids.internal.IParentalControlsService;
import com.google.android.gms.kids.internal.InternalParentalControlsClient;
import com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1;
import defpackage.dfqp;
import defpackage.dfqs;
import defpackage.dfqt;
import defpackage.dfqz;
import defpackage.dfra;
import defpackage.dfup;
import defpackage.dfwj;
import defpackage.dgsp;
import defpackage.dgsq;
import defpackage.dgtk;
import defpackage.dgtl;
import defpackage.dhqh;
import defpackage.dhrd;
import defpackage.dhre;
import defpackage.dhrt;
import defpackage.ffdx;
import defpackage.ffem;
import defpackage.ffew;
import defpackage.fffi;
import defpackage.ffix;
import defpackage.koa;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient extends dfra implements dgsq {
    public static final dfwj a;
    private static final dfqs o;
    private static final dgtk p;
    private static final dfqt q;
    public final Set b;
    public boolean m;
    public final boolean n;

    static {
        dfqs dfqsVar = new dfqs();
        o = dfqsVar;
        dgtk dgtkVar = new dgtk();
        p = dgtkVar;
        q = new dfqt("ParentalControls.API", dgtkVar, dfqsVar);
        a = new dfwj("ParentalControlsClient");
    }

    public InternalParentalControlsClient(Context context) {
        super(context, q, dfqp.q, dfqz.a);
        this.b = new LinkedHashSet();
        this.n = true;
        koa.g(this.c, new dgtl(this), new IntentFilter("android.app.action.PROFILE_OWNER_CHANGED"));
    }

    @Override // defpackage.dgsq
    public final dhre a(final Set set) {
        return set.isEmpty() ? dhrt.c(ffem.a) : e(new ffix() { // from class: dgsu
            @Override // defpackage.ffix
            public final Object invoke() {
                dfun dfunVar = new dfun();
                dfunVar.b = new Feature[]{dgsk.a};
                dfunVar.b();
                dfunVar.c = 14106;
                final Set set2 = set;
                dfunVar.a = new dfuf() { // from class: dgth
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dfwj dfwjVar = InternalParentalControlsClient.a;
                        final List<Uri> ak = ffdx.ak(set2);
                        final dhri dhriVar = (dhri) obj2;
                        ((IParentalControlsService) ((dgtm) obj).w()).areAllowed(ak, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$areAllowed$1$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onBooleanList(Status status, List<Boolean> list) {
                                status.getClass();
                                list.getClass();
                                dfup.b(status, ffew.k(ffdx.an(ak, list)), dhriVar);
                            }
                        });
                    }
                };
                return InternalParentalControlsClient.this.i(dfunVar.a());
            }
        }, new ffix() { // from class: dgtd
            @Override // defpackage.ffix
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Shortcutting call to areAllowed");
                Set set2 = set;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(set2, 10)), 16));
                for (Object obj : set2) {
                    linkedHashMap.put(obj, true);
                }
                return linkedHashMap;
            }
        });
    }

    @Override // defpackage.dgsq
    public final /* synthetic */ dhre b(final Uri uri) {
        return a(fffi.b(uri)).f(new dhrd() { // from class: dgso
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                return dhrt.c(((Map) obj).get(uri));
            }
        });
    }

    @Override // defpackage.dgsq
    public final dhre c(final dgsp dgspVar) {
        dgspVar.getClass();
        this.b.add(dgspVar);
        return e(new ffix() { // from class: dgtb
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1] */
            @Override // defpackage.ffix
            public final Object invoke() {
                final dgsp dgspVar2 = dgsp.this;
                final ?? r0 = new IParentalControlsListener.Stub() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1
                    @Override // com.google.android.gms.kids.internal.IParentalControlsListener
                    public void onParentalControlsChange(boolean z, int i) {
                        dgsp.this.a(z ? null : Integer.valueOf(i));
                    }
                };
                InternalParentalControlsClient internalParentalControlsClient = this;
                dftp b = dftq.b(dgspVar2, internalParentalControlsClient.i, "ParentalControlsListener");
                dfud dfudVar = new dfud();
                dfudVar.c = b;
                dfudVar.d = new Feature[]{dgsk.a};
                dfudVar.b();
                dfudVar.e = 14107;
                dfudVar.a = new dfuf() { // from class: dgti
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dfwj dfwjVar = InternalParentalControlsClient.a;
                        final dhri dhriVar = (dhri) obj2;
                        ((IParentalControlsService) ((dgtm) obj).w()).registerParentalControlsListener(InternalParentalControlsClient$registerParentalControlsListener$1$callback$1.this, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onStatus(Status status) {
                                status.getClass();
                                dfup.a(status, dhriVar);
                            }
                        });
                    }
                };
                dfudVar.b = new dfuf() { // from class: dgtj
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dfwj dfwjVar = InternalParentalControlsClient.a;
                        final dhri dhriVar = (dhri) obj2;
                        ((IParentalControlsService) ((dgtm) obj).w()).unregisterParentalControlsListener(InternalParentalControlsClient$registerParentalControlsListener$1$callback$1.this, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$2$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onBoolean(Status status, boolean z) {
                                status.getClass();
                                onStatus(status);
                            }

                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onStatus(Status status) {
                                status.getClass();
                                dfup.b(status, true, dhriVar);
                            }
                        });
                    }
                };
                return internalParentalControlsClient.j(dfudVar.a());
            }
        }, new ffix() { // from class: dgtc
            @Override // defpackage.ffix
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Ignoring call to register listener");
                dgsp.this.a(null);
                return null;
            }
        });
    }

    @Override // defpackage.dgsq
    public final dhre d(final TrustedContactsRequest trustedContactsRequest) {
        return e(new ffix() { // from class: dgsw
            @Override // defpackage.ffix
            public final Object invoke() {
                dfun dfunVar = new dfun();
                dfunVar.b = new Feature[]{dgsk.a};
                dfunVar.b();
                dfunVar.c = 14110;
                final TrustedContactsRequest trustedContactsRequest2 = trustedContactsRequest;
                dfunVar.a = new dfuf() { // from class: dgsv
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dfwj dfwjVar = InternalParentalControlsClient.a;
                        final dhri dhriVar = (dhri) obj2;
                        ((IParentalControlsService) ((dgtm) obj).w()).requestTrustedContactsPendingIntent(TrustedContactsRequest.this, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$requestTrustedContactsPendingIntent$1$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                                status.getClass();
                                dfup.b(status, pendingIntent, dhriVar);
                            }
                        });
                    }
                };
                return InternalParentalControlsClient.this.i(dfunVar.a());
            }
        }, new ffix() { // from class: dgsx
            @Override // defpackage.ffix
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Shortcutting call to requestTrustedContactsPendingIntent");
                return null;
            }
        });
    }

    public final dhre e(ffix ffixVar, final ffix ffixVar2) {
        return this.m ? dhrt.c(ffixVar2.invoke()) : ((dhre) ffixVar.invoke()).b(new dhqh() { // from class: dgtg
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                Exception h = dhreVar.h();
                dfqu dfquVar = h instanceof dfqu ? (dfqu) h : null;
                if ((dfquVar == null || dfquVar.a() != 17) && !(dhreVar.h() instanceof dfrq)) {
                    return dhreVar.i();
                }
                dfwj dfwjVar = InternalParentalControlsClient.a;
                Exception h2 = dhreVar.h();
                if (dfwjVar.a(2)) {
                    Log.v("ParentalControlsClient", "Failed to connect to ParentalControlsClient. Not a child account.", h2);
                }
                ffix ffixVar3 = ffixVar2;
                InternalParentalControlsClient.this.m = true;
                return ffixVar3.invoke();
            }
        });
    }
}
