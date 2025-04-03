package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvui extends ea {
    public static final entd a = entd.c("GnpSdk");
    public evsn ag = evsn.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
    private adg ah;
    public ffbr b;
    public dvcp c;
    public dvpf d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final void g(Context context) {
        final dvdp dvdpVar;
        Object parcelable;
        super.g(context);
        try {
            Object obj = eajj.a(context).fM().get(dvui.class);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object b = ((ffbr) obj).b();
            b.getClass();
            ((dvbo) b).a(this);
            if (kqq.b()) {
                parcelable = C().getParcelable("promo_context", dvdp.class);
                dvdpVar = (dvdp) parcelable;
            } else {
                dvdpVar = (dvdp) C().getParcelable("promo_context");
            }
            if (dvdpVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            evzd evzdVar = dvdpVar.c().f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            if (evzdVar.c == 6) {
                evzd evzdVar2 = dvdpVar.c().f;
                if (evzdVar2 == null) {
                    evzdVar2 = evzd.a;
                }
                evyu evyuVar = evzdVar2.c == 6 ? (evyu) evzdVar2.d : evyu.a;
                evyuVar.getClass();
                evys evysVar = evyuVar.e;
                if (evysVar == null) {
                    evysVar = evys.b;
                }
                evsn evsnVar = (evsn) new eygk(evysVar.c, evys.a).get(0);
                this.ag = evsnVar;
                this.e = dvdm.a(evsnVar);
                this.ah = O(new aek(), new adf() { // from class: dvuf
                    @Override // defpackage.adf
                    public final void a(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.getClass();
                        boolean booleanValue = bool.booleanValue();
                        dvui dvuiVar = dvui.this;
                        final String str = dvuiVar.e;
                        if (str == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        dvui.a.o().E("%s permission request user response is %s", str, booleanValue);
                        dvpf dvpfVar = dvuiVar.d;
                        dvcp dvcpVar = null;
                        if (dvpfVar == null) {
                            ffkj.c("permissionRequestsStateDataService");
                            dvpfVar = null;
                        }
                        effy effyVar = dvpfVar.a;
                        final ffji ffjiVar = new ffji() { // from class: dvpb
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                dvpa dvpaVar = (dvpa) obj3;
                                dvpaVar.getClass();
                                dvoy dvoyVar = (dvoy) dvpaVar.toBuilder();
                                dvoyVar.getClass();
                                dvpg.a(dvoyVar);
                                eyjy a2 = dvpg.a(dvoyVar);
                                String str2 = str;
                                Integer num = (Integer) a2.get(str2);
                                int intValue = num != null ? num.intValue() : 0;
                                dvoyVar.copyOnWrite();
                                dvpa dvpaVar2 = (dvpa) dvoyVar.instance;
                                eyhm eyhmVar = dvpaVar2.b;
                                if (!eyhmVar.b) {
                                    dvpaVar2.b = eyhmVar.a();
                                }
                                dvpaVar2.b.put(str2, Integer.valueOf(intValue + 1));
                                eyfy build = dvoyVar.build();
                                build.getClass();
                                return (dvpa) build;
                            }
                        };
                        eakf.a(effyVar.b(new emwl() { // from class: dvpc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return ffji.this.invoke(obj3);
                            }
                        }, erpp.a), null, new emxs() { // from class: dvug
                            @Override // defpackage.emxs
                            public final void a(Object obj3) {
                                ((ensz) dvui.a.i()).t("Failed to increase permission request count", (Throwable) obj3);
                            }
                        });
                        ffbr ffbrVar = dvuiVar.b;
                        if (ffbrVar == null) {
                            ffkj.c("callbacksManagerProvider");
                            ffbrVar = null;
                        }
                        dvcp dvcpVar2 = dvuiVar.c;
                        if (dvcpVar2 == null) {
                            ffkj.c("clearcutLogger");
                        } else {
                            dvcpVar = dvcpVar2;
                        }
                        dvcpVar.a(dvdpVar, booleanValue, dvuiVar.ag);
                        if (dvuiVar.G() != null) {
                            eg G = dvuiVar.G();
                            if (G == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (G.isFinishing() || !dvuiVar.aF() || dvuiVar.s) {
                                return;
                            }
                            cg cgVar = new cg(dvuiVar.J());
                            cgVar.n(dvuiVar);
                            cgVar.k();
                        }
                    }
                });
            }
        } catch (RuntimeException e) {
            ((ensz) ((ensz) a.j()).g(e)).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void l() {
        adg adgVar;
        super.l();
        String str = this.e;
        if (str == null || (adgVar = this.ah) == null) {
            return;
        }
        adgVar.c(str);
    }
}
