package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityService;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.DuoKitContainerActivity;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.SetupDuoResponse;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartCallResponse;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowResponse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgff implements dgea {
    public final emyl a;
    private final dgep b;
    private final Context c;
    private final emyl d;
    private final emyl e;
    private final emyl f;

    public dgff(final Context context, final emxc emxcVar) {
        emyl a = emys.a(new emyl() { // from class: dgfa
            @Override // defpackage.emyl
            public final Object get() {
                return ((emxn) emxc.this).a;
            }
        });
        this.d = a;
        this.b = new dgep(context, a);
        this.a = emys.a(new emyl() { // from class: dgfb
            @Override // defpackage.emyl
            public final Object get() {
                return dgec.a(context);
            }
        });
        this.c = context;
        emys.a(new emyl() { // from class: dgfc
            @Override // defpackage.emyl
            public final Object get() {
                return new dgfh(context);
            }
        });
        this.e = emys.a(new emyl() { // from class: dgfd
            @Override // defpackage.emyl
            public final Object get() {
                return new dgfo(context, (dgec) dgff.this.a.get());
            }
        });
        this.f = emys.a(new emyl() { // from class: dgfe
            @Override // defpackage.emyl
            public final Object get() {
                return new dgew(context, (dgec) dgff.this.a.get());
            }
        });
        int i = dgee.a;
        emys.a(new dged(context));
    }

    @Override // defpackage.dgea
    public final dhre a(final GenerateInviteLinkRequest generateInviteLinkRequest) {
        String str;
        ((dgec) this.a.get()).g(15, emxc.i(generateInviteLinkRequest.b));
        final dgew dgewVar = (dgew) this.f.get();
        dhre a = this.b.a();
        DuoId duoId = generateInviteLinkRequest.a;
        if (duoId == null || (str = duoId.b) == null || str.length() == 0) {
            dgewVar.b.c(false);
            return dhrt.c(new GenerateInviteLinkResponse());
        }
        a.t(new dhqv() { // from class: dges
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgew.this.b.f(15);
            }
        });
        return a.f(new dhrd() { // from class: dget
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                final dgeg dgegVar = (dgeg) obj;
                boolean b = dgegVar.b();
                final dgew dgewVar2 = dgew.this;
                if (!b) {
                    dgewVar2.b.f(15);
                    return dhrt.b(new IllegalStateException("Neither Duo nor Meet API provider is available"));
                }
                final GenerateInviteLinkRequest generateInviteLinkRequest2 = generateInviteLinkRequest;
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dgeu
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        IBinder b2 = ((dftv) obj2).b();
                        dfwv.n(b2);
                        ((dhri) obj3).b(IReachabilityService.Stub.asInterface(b2));
                    }
                };
                dfunVar.c = 12302;
                dhre i = dgewVar2.i(dfunVar.a());
                i.t(new dhqv() { // from class: dgeq
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        dgew.this.b.f(15);
                    }
                });
                return i.f(new dhrd() { // from class: dger
                    @Override // defpackage.dhrd
                    public final dhre a(Object obj2) {
                        IReachabilityService iReachabilityService = (IReachabilityService) obj2;
                        dhri dhriVar = new dhri();
                        dgew dgewVar3 = dgew.this;
                        GenerateInviteLinkRequest generateInviteLinkRequest3 = generateInviteLinkRequest2;
                        boolean c = dgegVar.c();
                        try {
                            if (c) {
                                iReachabilityService.generateMeetingInviteLink(engw.r(generateInviteLinkRequest3.a.b), new dgev(dgewVar3, dhriVar, true));
                            } else {
                                iReachabilityService.generateInviteLink(engw.r(generateInviteLinkRequest3.a.b), new dgev(dgewVar3, dhriVar, false));
                            }
                        } catch (RemoteException unused) {
                            dgewVar3.b.f(true != c ? 15 : 16);
                            dhriVar.a(new IllegalStateException("Failed to query Meet reachability service"));
                        }
                        return dhriVar.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.dgea
    public final dhre b(final LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest) {
        String str;
        ((dgec) this.a.get()).g(14, emxc.i(lookupSingleRemoteReachabilityRequest.b));
        final dgfo dgfoVar = (dgfo) this.e.get();
        dhre a = this.b.a();
        DuoId duoId = lookupSingleRemoteReachabilityRequest.a;
        if (duoId == null || (str = duoId.b) == null || str.isEmpty()) {
            dgfoVar.a.d(faty.a);
            return dhrt.c(new LookupSingleRemoteReachabilityResponse());
        }
        a.t(new dhqv() { // from class: dgfl
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgfo.this.a.f(14);
            }
        });
        return a.f(new dhrd() { // from class: dgfm
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                boolean b = ((dgeg) obj).b();
                final dgfo dgfoVar2 = dgfo.this;
                if (!b) {
                    dgfoVar2.a.f(14);
                    return dhrt.b(new IllegalStateException("API provider not available"));
                }
                final LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest2 = lookupSingleRemoteReachabilityRequest;
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dgfi
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        IBinder b2 = ((dftv) obj2).b();
                        dfwv.n(b2);
                        ((dhri) obj3).b(IReachabilityService.Stub.asInterface(b2));
                    }
                };
                dfunVar.c = 12302;
                dhre i = dgfoVar2.i(dfunVar.a());
                i.t(new dhqv() { // from class: dgfj
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        dgfo.this.a.f(14);
                    }
                });
                return i.f(new dhrd() { // from class: dgfk
                    @Override // defpackage.dhrd
                    public final dhre a(Object obj2) {
                        IReachabilityService iReachabilityService = (IReachabilityService) obj2;
                        dhri dhriVar = new dhri();
                        dgfo dgfoVar3 = dgfo.this;
                        LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest3 = lookupSingleRemoteReachabilityRequest2;
                        try {
                            iReachabilityService.queryReachabilityNoCache(engw.r(lookupSingleRemoteReachabilityRequest3.a.b), new dgfn(dgfoVar3, lookupSingleRemoteReachabilityRequest3, dhriVar));
                        } catch (RemoteException unused) {
                            dgfoVar3.a.f(14);
                            dhriVar.a(new IllegalStateException("Failed to query Duo reachability service"));
                        }
                        return dhriVar.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.dgea
    public final dhre c(final SetupDuoRequest setupDuoRequest) {
        ((dgec) this.a.get()).g(7, emux.a);
        final dgec dgecVar = (dgec) this.a.get();
        dhre a = this.b.a();
        final dhri dhriVar = new dhri();
        final SetupDuoResponse setupDuoResponse = new SetupDuoResponse();
        final Context context = this.c;
        a.a(new dhqy() { // from class: dgfs
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                dgeg dgegVar = (dgeg) obj;
                boolean b = dgegVar.b();
                Context context2 = context;
                dgec dgecVar2 = dgecVar;
                if (b) {
                    DuoKitContainerActivity.a(context2, false, new ArrayList());
                    dgecVar2.i(6);
                } else if (dgegVar.a() == 2) {
                    SetupDuoRequest setupDuoRequest2 = setupDuoRequest;
                    ArrayList arrayList = new ArrayList();
                    if (setupDuoRequest2.a != null) {
                        enin eninVar = new enin();
                        for (DuoId duoId : setupDuoRequest2.a) {
                            if (duoId.a == 1) {
                                eninVar.c(duoId.b);
                            }
                        }
                        arrayList.addAll(eninVar.g());
                    }
                    DuoKitContainerActivity.a(context2, true, arrayList);
                    dgecVar2.i(3);
                } else {
                    dgfu.b(context2, dgecVar2, emux.a);
                }
                dhriVar.b(setupDuoResponse);
            }
        });
        a.t(new dhqv() { // from class: dgft
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgfu.b(context, dgecVar, emux.a);
                dhriVar.b(setupDuoResponse);
            }
        });
        return dhriVar.a;
    }

    @Override // defpackage.dgea
    public final dhre d(final StartCallRequest startCallRequest) {
        ((dgec) this.a.get()).g(5, emxc.i(startCallRequest.d));
        final dgec dgecVar = (dgec) this.a.get();
        dhre a = this.b.a();
        final dhri dhriVar = new dhri();
        final Context context = this.c;
        a.a(new dhqy() { // from class: dgfx
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                dhri dhriVar2 = dhri.this;
                StartCallRequest startCallRequest2 = startCallRequest;
                dgeg dgegVar = (dgeg) obj;
                try {
                    StartCallResponse startCallResponse = new StartCallResponse();
                    DuoId duoId = startCallRequest2.a;
                    int i = duoId.a;
                    dgec dgecVar2 = dgecVar;
                    if (i != 1) {
                        Log.w("DuoKitStartCall", "Only call to phone numbers is supported");
                        dgecVar2.f(5);
                        throw new dgeb("Only phone number calling is supported.");
                    }
                    int i2 = startCallRequest2.b;
                    boolean z = i2 == 1;
                    emxc j = TextUtils.isEmpty(startCallRequest2.d) ? emux.a : emxc.j(startCallRequest2.d);
                    boolean b = dgegVar.b();
                    Context context2 = context;
                    if (b) {
                        Intent addFlags = new Intent("com.google.android.gms.duokit.action.DUO_CALL").setData(Uri.parse(String.format("%s:%s", "tel", duoId.b))).setClassName(context2, DuoKitContainerActivity.class.getName()).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", z).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        if (j.g()) {
                            addFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) j.c());
                        }
                        context2.startActivity(addFlags);
                        fatn fatnVar = (fatn) fato.a.createBuilder();
                        int i3 = i2 == 1 ? 5 : 4;
                        fatnVar.copyOnWrite();
                        ((fato) fatnVar.instance).b = i3 - 2;
                        fato fatoVar = (fato) fatnVar.build();
                        fatm fatmVar = (fatm) faud.a.createBuilder();
                        fatmVar.copyOnWrite();
                        ((faud) fatmVar.instance).d = fgtd.a(5);
                        String str = dgecVar2.a;
                        fatmVar.copyOnWrite();
                        faud faudVar = (faud) fatmVar.instance;
                        str.getClass();
                        faudVar.e = str;
                        fatmVar.copyOnWrite();
                        ((faud) fatmVar.instance).f = fgtc.a(4);
                        fatmVar.copyOnWrite();
                        faud faudVar2 = (faud) fatmVar.instance;
                        fatoVar.getClass();
                        faudVar2.c = fatoVar;
                        faudVar2.b = 3;
                        dgecVar2.b((faud) fatmVar.build());
                    } else {
                        if (!startCallRequest2.c || dgef.a(context2)) {
                            Log.w("DuoKitStartCall", "Duo installed but can't handle the API");
                            dgecVar2.f(5);
                            throw new dgeb("Failed to handle the API call");
                        }
                        dgecVar2.e(5, 7);
                        dgfu.b(context2, dgecVar2, j);
                    }
                    dhriVar2.b(startCallResponse);
                } catch (dgeb e) {
                    dhriVar2.a(e);
                }
            }
        });
        a.t(new dhqv() { // from class: dgfy
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgec.this.f(5);
                dhriVar.a(new IllegalStateException("Failed to get Duo state."));
            }
        });
        return dhriVar.a;
    }

    @Override // defpackage.dgea
    public final dhre e(final StartGroupCreationFlowRequest startGroupCreationFlowRequest) {
        ((dgec) this.a.get()).g(12, emxc.i(startGroupCreationFlowRequest.b));
        final dgec dgecVar = (dgec) this.a.get();
        dhre a = this.b.a();
        final dhri dhriVar = new dhri();
        final Context context = this.c;
        a.a(new dhqy() { // from class: dggb
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                enip g;
                dhri dhriVar2 = dhri.this;
                StartGroupCreationFlowRequest startGroupCreationFlowRequest2 = startGroupCreationFlowRequest;
                dgeg dgegVar = (dgeg) obj;
                try {
                    StartGroupCreationFlowResponse startGroupCreationFlowResponse = new StartGroupCreationFlowResponse();
                    boolean z = false;
                    if (startGroupCreationFlowRequest2.a == null) {
                        g = enpd.a;
                    } else {
                        enin eninVar = new enin();
                        for (DuoId duoId : startGroupCreationFlowRequest2.a) {
                            int i = duoId.a;
                            if (i == 1) {
                                eninVar.c(duoId.b);
                            } else {
                                Log.w("DuoKitStrtGrpCrtnFlw", a.h(i, "Ignoring id type: "));
                            }
                        }
                        g = eninVar.g();
                    }
                    emxc j = TextUtils.isEmpty(startGroupCreationFlowRequest2.b) ? emux.a : emxc.j(startGroupCreationFlowRequest2.b);
                    boolean b = dgegVar.b();
                    dgec dgecVar2 = dgecVar;
                    Context context2 = context;
                    if (b) {
                        if (new Intent("com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS").setPackage("com.google.android.apps.tachyon").resolveActivity(context2.getPackageManager()) != null) {
                            Intent addFlags = new Intent("com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW").setClassName(context2, DuoKitContainerActivity.class.getName()).putStringArrayListExtra("members", new ArrayList<>(g)).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (j.g()) {
                                addFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) j.c());
                            }
                            context2.startActivity(addFlags);
                            z = true;
                        } else {
                            Log.w("DuoKitContainerActivity", "Duo can't handle group flow intent, fallback to Duo home screen");
                            Intent addFlags2 = new Intent("com.google.android.gms.duokit.action.LAUNCH_DUO").setClassName(context2, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (j.g()) {
                                addFlags2.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) j.c());
                            }
                            context2.startActivity(addFlags2);
                        }
                        fatt fattVar = (fatt) fatu.a.createBuilder();
                        int size = g.size();
                        fattVar.copyOnWrite();
                        ((fatu) fattVar.instance).b = size;
                        int i2 = true != z ? 4 : 3;
                        fattVar.copyOnWrite();
                        ((fatu) fattVar.instance).c = i2 - 2;
                        fatu fatuVar = (fatu) fattVar.build();
                        fatm fatmVar = (fatm) faud.a.createBuilder();
                        fatmVar.copyOnWrite();
                        ((faud) fatmVar.instance).d = fgtd.a(12);
                        String str = dgecVar2.a;
                        fatmVar.copyOnWrite();
                        faud faudVar = (faud) fatmVar.instance;
                        str.getClass();
                        faudVar.e = str;
                        fatmVar.copyOnWrite();
                        ((faud) fatmVar.instance).f = fgtc.a(4);
                        fatmVar.copyOnWrite();
                        faud faudVar2 = (faud) fatmVar.instance;
                        fatuVar.getClass();
                        faudVar2.c = fatuVar;
                        faudVar2.b = 12;
                        dgecVar2.b((faud) fatmVar.build());
                    } else {
                        if (dgef.a(context2) || !startGroupCreationFlowRequest2.c) {
                            Log.w("DuoKitStrtGrpCrtnFlw", "Duo installed but can't handle the API");
                            dgecVar2.f(12);
                            throw new dgeb("Failed to handle the API call");
                        }
                        fatt fattVar2 = (fatt) fatu.a.createBuilder();
                        int size2 = g.size();
                        fattVar2.copyOnWrite();
                        ((fatu) fattVar2.instance).b = size2;
                        fatu fatuVar2 = (fatu) fattVar2.build();
                        fatm fatmVar2 = (fatm) faud.a.createBuilder();
                        fatmVar2.copyOnWrite();
                        ((faud) fatmVar2.instance).d = fgtd.a(12);
                        String str2 = dgecVar2.a;
                        fatmVar2.copyOnWrite();
                        faud faudVar3 = (faud) fatmVar2.instance;
                        str2.getClass();
                        faudVar3.e = str2;
                        fatmVar2.copyOnWrite();
                        ((faud) fatmVar2.instance).f = fgtc.a(7);
                        fatmVar2.copyOnWrite();
                        faud faudVar4 = (faud) fatmVar2.instance;
                        fatuVar2.getClass();
                        faudVar4.c = fatuVar2;
                        faudVar4.b = 12;
                        dgecVar2.b((faud) fatmVar2.build());
                        dgfu.b(context2, dgecVar2, j);
                    }
                    dhriVar2.b(startGroupCreationFlowResponse);
                } catch (dgeb e) {
                    dhriVar2.a(e);
                }
            }
        });
        a.t(new dhqv() { // from class: dggc
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgec.this.f(12);
                dhriVar.a(new IllegalStateException("Failed to get Duo state."));
            }
        });
        return dhriVar.a;
    }

    @Override // defpackage.dgea
    public final dhre f() {
        ((dgec) this.a.get()).g(8, emux.a);
        final dgec dgecVar = (dgec) this.a.get();
        dhre a = this.b.a();
        int i = dgdt.b;
        final dhri dhriVar = new dhri();
        final Context context = this.c;
        a.a(new dhqy() { // from class: dgdr
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                BroadcastOptions makeBasic;
                BroadcastOptions shareIdentityEnabled;
                Bundle bundle;
                dgeg dgegVar = (dgeg) obj;
                int i2 = dgdt.b;
                Intent flags = new Intent("com.google.android.apps.tachyon.intent.INSTALL").setPackage("com.google.android.apps.tachyon").setFlags(32);
                if (!dgdt.a.get()) {
                    Context context2 = context;
                    if (Build.VERSION.SDK_INT < 34) {
                        context2.sendBroadcast(flags);
                    } else {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context2.sendBroadcast(flags, null, bundle);
                    }
                    dgdt.a.compareAndSet(false, true);
                }
                int a2 = dgegVar.a();
                dgecVar.h(a2 != 1 ? a2 != 2 ? a2 != 3 ? 7 : 5 : 4 : 3);
                GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
                int a3 = dgegVar.b() ? 3 : dgegVar.a();
                dhri dhriVar2 = dhri.this;
                getApiAvailabilityResponse.a = a3;
                dhriVar2.b(getApiAvailabilityResponse);
            }
        });
        a.t(new dhqv() { // from class: dgds
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                int i2 = dgdt.b;
                dgec.this.h(3);
                GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
                getApiAvailabilityResponse.a = 1;
                dhriVar.b(getApiAvailabilityResponse);
            }
        });
        return dhriVar.a;
    }
}
