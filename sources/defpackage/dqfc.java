package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfc extends dqfi {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen");
    public Optional aA;
    public dqdc aB;
    public ffbr aC;
    private final dszr aD;
    private final ffbz aE;
    private final ffbz aF;
    private final ffbz aX;
    private boolean aY;
    private final ffbz aZ;
    public ContentResolver ag;
    public dpgc ah;
    public dqef ai;
    public boolean aj;
    public boolean ak;
    public final ffbz al;
    public dqlu am;
    public dpfu an;
    public dqli ao;
    public dqft ap;
    public Optional aq;
    public dqga ar;
    public dtav as;
    public dqgj at;
    public Activity au;
    public Optional av;
    public Optional aw;
    public drpd ax;
    public dpaa ay;
    public ffsk az;
    public RecyclerView b;
    private dqfw ba;
    private final ffbz bb;
    private dqfm bc;
    private dqgd bd;
    private dqfz be;
    private final ffbz bf;
    private final ffbz bg;
    public View c;
    public FloatingActionButton d;
    public FloatingActionButton e;

    public dqfc() {
        super(Integer.valueOf(R.layout.camera_gallery_screen_layout), new dqdf((dqgf) null, (dpnj) null, (ffbz) null, false, false, false, false, 1023));
        this.aD = dszr.a;
        this.aE = ffca.a(new ffix() { // from class: dqdy
            @Override // defpackage.ffix
            public final Object invoke() {
                dqlf dqlfVar = dqlf.a;
                List list = (List) ((dqdf) dqfc.this.bA()).f.a();
                list.getClass();
                if (Build.VERSION.SDK_INT <= 32) {
                    return ffdx.b(dqlf.c);
                }
                fffs fffsVar = new fffs((byte[]) null);
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ffkj.e(((drka) it.next()).b(), drlr.a)) {
                            fffsVar.add(dqlf.d);
                            break;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (ffkj.e(((drka) it2.next()).b(), drlu.a)) {
                            fffsVar.add(dqlf.e);
                            break;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (ffkj.e(((drka) it3.next()).b(), drlv.a)) {
                            fffsVar.add(dqlf.f);
                            break;
                        }
                    }
                }
                return ffdx.a(fffsVar);
            }
        });
        this.aF = ffca.a(new ffix() { // from class: dqdz
            @Override // defpackage.ffix
            public final Object invoke() {
                Slide slide = new Slide(80);
                dqfc dqfcVar = dqfc.this;
                slide.setDuration(dqfcVar.N().getContext().getResources().getInteger(R.integer.camera_gallery_fab_transition_duration));
                View view = dqfcVar.c;
                if (view == null) {
                    ffkj.c("fabsContainer");
                    view = null;
                }
                slide.addTarget(view);
                return slide;
            }
        });
        this.aX = ffca.a(new ffix() { // from class: dqea
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dszy(dqfc.this.N());
            }
        });
        this.ai = dqef.a;
        ffix ffixVar = new ffix() { // from class: dqeb
            @Override // defpackage.ffix
            public final Object invoke() {
                dpfz dpfzVar = (dpfz) dqfc.this.al.a();
                dpfzVar.getClass();
                return new dqfh(dpfzVar);
            }
        };
        int i = fflc.a;
        this.aZ = new lmn(new ffkb(dqfg.class), new dqfa(this), ffixVar, new dqfb(this));
        this.al = ffca.a(new ffix() { // from class: dqec
            @Override // defpackage.ffix
            public final Object invoke() {
                dqfc dqfcVar = dqfc.this;
                dpfu dpfuVar = dqfcVar.an;
                if (dpfuVar == null) {
                    ffkj.c("galleryLoaderFactory");
                    dpfuVar = null;
                }
                return dpfuVar.a((dqdf) dqfcVar.bA());
            }
        });
        ffca.a(new ffix() { // from class: dqed
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbr ffbrVar = dqfc.this.aC;
                if (ffbrVar == null) {
                    ffkj.c("_attachmentResolverConfiguration");
                    ffbrVar = null;
                }
                Object b = ffbrVar.b();
                b.getClass();
                Optional optional = (Optional) b;
                return (dozj) (optional.isPresent() ? optional.get() : new dozj(null));
            }
        });
        this.bb = ffca.a(new ffix() { // from class: dqee
            @Override // defpackage.ffix
            public final Object invoke() {
                dqfc dqfcVar = dqfc.this;
                dqdc dqdcVar = dqfcVar.aB;
                if (dqdcVar == null) {
                    ffkj.c("gridStateControllerFactory");
                    dqdcVar = null;
                }
                dqcp a2 = dqfcVar.a();
                dqdf dqdfVar = (dqdf) dqfcVar.bA();
                Context context = (Context) dqdcVar.a.b();
                context.getClass();
                dtdg dtdgVar = (dtdg) dqdcVar.b.b();
                dqdfVar.getClass();
                return new dqdb(context, dtdgVar, a2, dqdfVar);
            }
        });
        this.bf = ffca.a(new ffix() { // from class: dqdh
            @Override // defpackage.ffix
            public final Object invoke() {
                dpnj dpnjVar = ((dqdf) dqfc.this.bA()).e;
                dpni dpniVar = dpnjVar != null ? dpnjVar.a : null;
                dpnf dpnfVar = dpniVar instanceof dpnf ? (dpnf) dpniVar : null;
                if (dpnfVar != null) {
                    return new dqcp(dpnfVar);
                }
                return null;
            }
        });
        this.bg = ffca.a(new ffix() { // from class: dqdi
            @Override // defpackage.ffix
            public final Object invoke() {
                final dqfc dqfcVar = dqfc.this;
                dtav dtavVar = dqfcVar.as;
                if (dtavVar == null) {
                    ffkj.c("selectionFactory");
                    dtavVar = null;
                }
                return new dtau((ea) ((fbbb) dtavVar.a).a, ((dqdf) dqfcVar.bA()).k, new ffix() { // from class: dqds
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return dqfc.this.aY();
                    }
                });
            }
        });
    }

    private final dszy bl() {
        return (dszy) this.aX.a();
    }

    private final void bm(List list) {
        ffqy.d(bF(), null, null, new dqei(list, this, null), 3);
    }

    public final dqcp a() {
        return (dqcp) this.bf.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aT(java.util.List r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dqeg
            if (r0 == 0) goto L13
            r0 = r8
            dqeg r0 = (defpackage.dqeg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dqeg r0 = new dqeg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = r0.a
            dqfc r0 = r0.f
            defpackage.ffci.b(r8)
            r8 = r7
            r7 = r1
            goto L5c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.ffci.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            ffsk r2 = r6.aV()
            ffhd r2 = r2.hT()
            dqeh r4 = new dqeh
            r5 = 0
            r4.<init>(r7, r6, r8, r5)
            r0.f = r6
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = defpackage.ffra.a(r2, r4, r0)
            if (r0 == r1) goto La6
            r0 = r6
        L5c:
            int r1 = r7.size()
            int r2 = r8.size()
            int r1 = r1 - r2
            if (r1 <= 0) goto La0
            int r7 = r7.size()
            android.content.Context r2 = r0.A()
            android.content.res.Resources r2 = r2.getResources()
            if (r1 != r3) goto L7f
            if (r7 != r3) goto L7f
            r7 = 2132084324(0x7f150664, float:1.9808815E38)
            java.lang.String r7 = r2.getString(r7)
            goto L8f
        L7f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r7 = 2131951651(0x7f130023, float:1.9539723E38)
            java.lang.String r7 = r2.getQuantityString(r7, r1, r3)
        L8f:
            r7.getClass()
            eg r1 = r0.fe()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            defpackage.dskt.a(r7, r1)
        La0:
            r0.bm(r8)
            ffcu r7 = defpackage.ffcu.a
            return r7
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqfc.aT(java.util.List, ffgu):java.lang.Object");
    }

    public final List aU() {
        return (List) this.aE.a();
    }

    public final ffsk aV() {
        ffsk ffskVar = this.az;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("localIoScope");
        return null;
    }

    public final fgdj aY() {
        dqlu dqluVar = null;
        if (((dqdf) bA()).i) {
            dqlx dqlxVar = ((dqls) bE().invoke()).b;
            dqmi dqmiVar = dqlxVar instanceof dqmi ? (dqmi) dqlxVar : null;
            if (dqmiVar != null) {
                return dqmiVar.h();
            }
        }
        dqlu dqluVar2 = this.am;
        if (dqluVar2 == null) {
            ffkj.c("attachmentsViewModel");
        } else {
            dqluVar = dqluVar2;
        }
        return dqluVar.b;
    }

    @Override // defpackage.dtaa
    protected final void aZ(final dsjz dsjzVar) {
        ((enrr) a.e().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "applyHugoColors", 279, "CameraGalleryScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        dqgd dqgdVar = this.bd;
        if (dqgdVar != null) {
            dqgdVar.d = new ffji() { // from class: dqdw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    MaterialButton materialButton = (MaterialButton) obj;
                    enru enruVar = dqfc.a;
                    materialButton.getClass();
                    int b = iby.b(dsjz.this.a.a);
                    ColorStateList valueOf = ColorStateList.valueOf(b);
                    valueOf.getClass();
                    materialButton.setTextColor(b);
                    if (materialButton.c != valueOf) {
                        materialButton.c = valueOf;
                        materialButton.j(false);
                    }
                    materialButton.g(valueOf);
                    return ffcu.a;
                }
            };
            dqgdVar.p();
        }
        bl().b(dsjzVar.h, dsjzVar.i);
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        dqef e = e();
        if (!bI() || e == dqef.a || e == this.ai) {
            return;
        }
        ((enrr) a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "checkIfMediaPermissionsAreUpgraded", 333, "CameraGalleryScreen.kt")).D("Image/video permission changed from %s to %s, refreshing camera gallery screen.", this.ai, e);
        dqef dqefVar = this.ai;
        if (dqefVar == dqef.a) {
            bc();
        } else if (dqefVar == dqef.b) {
            dqcp a2 = a();
            if (a2 != null) {
                a2.a(false, false);
            }
            dqfz dqfzVar = this.be;
            if (dqfzVar != null) {
                dqfzVar.y(0);
            }
            dpgc dpgcVar = this.ah;
            if (dpgcVar == null) {
                ffkj.c("galleryMediaObserver");
                dpgcVar = null;
            }
            dpgcVar.onChange(true);
        }
        this.ai = e;
    }

    @Override // defpackage.ea
    public final void ap(final View view, Bundle bundle) {
        view.getClass();
        by().g("CameraGalleryScreen#onViewCreated", new ffix() { // from class: dqdx
            @Override // defpackage.ffix
            public final Object invoke() {
                View view2 = view;
                ContentResolver contentResolver = view2.getContext().getContentResolver();
                final dqfc dqfcVar = dqfc.this;
                dqfcVar.ag = contentResolver;
                dqfcVar.b = (RecyclerView) view2.findViewById(R.id.camera_gallery_recycler_view);
                dqfcVar.c = view2.findViewById(R.id.camera_gallery_fabs_container);
                FloatingActionButton floatingActionButton = (FloatingActionButton) view2.findViewById(R.id.camera_gallery_system_gallery_picker_button);
                floatingActionButton.getClass();
                floatingActionButton.setVisibility(true != ((dqdf) dqfcVar.bA()).d.c ? 8 : 0);
                Optional optional = dqfcVar.av;
                if (optional == null) {
                    ffkj.c("systemPickerFabCreateListener");
                    optional = null;
                }
                final ffji ffjiVar = new ffji() { // from class: dqdk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqgl dqglVar = (dqgl) obj;
                        enru enruVar = dqfc.a;
                        dqglVar.getClass();
                        dqglVar.a();
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: dqdl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = dqfc.a;
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                floatingActionButton.setOnClickListener(dqfcVar.by().b("CameraGalleryScreen.SystemPickerFab#onClick", new View.OnClickListener() { // from class: dqdm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(final View view3) {
                        dqfc dqfcVar2 = dqfc.this;
                        Optional optional2 = dqfcVar2.aw;
                        if (optional2 == null) {
                            ffkj.c("systemPickerFabClickListener");
                            optional2 = null;
                        }
                        final ffji ffjiVar2 = new ffji() { // from class: dqdt
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                dqgk dqgkVar = (dqgk) obj;
                                enru enruVar = dqfc.a;
                                dqgkVar.getClass();
                                view3.getClass();
                                dqgkVar.a();
                                return ffcu.a;
                            }
                        };
                        optional2.ifPresent(new Consumer() { // from class: dqdu
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                enru enruVar = dqfc.a;
                                ffji.this.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        dqfcVar2.bf();
                    }
                }));
                dqfcVar.e = floatingActionButton;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) view2.findViewById(R.id.camera_gallery_fullscreen_camera_button);
                floatingActionButton2.getClass();
                floatingActionButton2.setVisibility(((dqdf) dqfcVar.bA()).e != null ? 0 : 8);
                if (floatingActionButton2.getVisibility() == 0) {
                    floatingActionButton2.setOnClickListener(dqfcVar.by().b("CameraGalleryScreen.CameraFab#onClick", new View.OnClickListener() { // from class: dqdn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            dpnj dpnjVar = ((dqdf) dqfc.this.bA()).e;
                            if (dpnjVar == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            view3.getClass();
                            dpnjVar.c.a(view3);
                        }
                    }));
                }
                dqfcVar.d = floatingActionButton2;
                ffqy.d(dqfcVar.bF(), null, null, new dqey(dqfcVar, null), 3);
                dqfcVar.ai = dqfcVar.e();
                dqfcVar.bJ();
                return ffcu.a;
            }
        });
    }

    public final dqdb b() {
        return (dqdb) this.bb.a();
    }

    public final void ba(drnn drnnVar) {
        bm(ffdx.b(drnnVar));
    }

    public final void bb() {
        bl().a();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            ffkj.c("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        bi();
    }

    public final void bc() {
        dqfw dqfwVar;
        dqgd dqgdVar;
        RecyclerView recyclerView;
        dqga dqgaVar = this.ar;
        dpgc dpgcVar = null;
        if (dqgaVar == null) {
            ffkj.c("selectMediaPermissionRequestAdapterFactory");
            dqgaVar = null;
        }
        dqek dqekVar = new dqek(this);
        dqli dqliVar = (dqli) dqgaVar.a.b();
        dqliVar.getClass();
        this.be = new dqfz(dqliVar, dqekVar);
        bg(false);
        Optional optional = this.aA;
        if (optional == null) {
            ffkj.c("headerControllerOptional");
            optional = null;
        }
        uij uijVar = (uij) fflm.b(optional);
        if (uijVar != null) {
            dqfwVar = new dqfw();
            ffqy.d(lks.a(this), null, null, new dqen(dqfwVar, uijVar, this, null), 3);
        } else {
            dqfwVar = null;
        }
        this.ba = dqfwVar;
        Optional optional2 = this.aq;
        if (optional2 == null) {
            ffkj.c("cameraAdapterFactory");
            optional2 = null;
        }
        final ffji ffjiVar = new ffji() { // from class: dqdg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqfn dqfnVar = (dqfn) obj;
                dqfnVar.getClass();
                dqfc dqfcVar = dqfc.this;
                dqdb b = dqfcVar.b();
                b.getClass();
                dslw bA = dqfcVar.bA();
                bA.getClass();
                dqeo dqeoVar = new dqeo(dqfcVar);
                dqep dqepVar = new dqep(dqfcVar);
                dpnj dpnjVar = ((dqdf) bA).e;
                if (dpnjVar != null) {
                    return new dqfm(dqfnVar.a, dqfnVar.b, dqfnVar.c, b, dpnjVar, dqeoVar, dqepVar);
                }
                return null;
            }
        };
        Optional map = optional2.map(new Function() { // from class: dqdr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = dqfc.a;
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        this.bc = (dqfm) fflm.b(map);
        if (((dqdf) bA()).d.d) {
            dqdb b = b();
            b.getClass();
            dqgdVar = new dqgd(b, new dqes(this), new dqet(this));
        } else {
            dqgdVar = null;
        }
        this.bd = dqgdVar;
        dqft dqftVar = this.ap;
        if (dqftVar == null) {
            ffkj.c("galleryMediaAdapterFactory");
            dqftVar = null;
        }
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null) {
            ffkj.c("recyclerView");
            recyclerView2 = null;
        }
        dpga dpgaVar = new dpga(recyclerView2);
        ffix ffixVar = new ffix() { // from class: dqdq
            @Override // defpackage.ffix
            public final Object invoke() {
                return dqfc.this.aY();
            }
        };
        dqej dqejVar = new dqej(this);
        dqdb b2 = b();
        drpr drprVar = (drpr) dqftVar.a.b();
        b2.getClass();
        final dqfs dqfsVar = new dqfs(drprVar, dpgaVar, ffixVar, dqejVar, b2);
        RecyclerView recyclerView3 = this.b;
        if (recyclerView3 == null) {
            ffkj.c("recyclerView");
            recyclerView = null;
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.an(new dtao());
        sj sjVar = new sj();
        sjVar.b();
        sk a2 = sjVar.a();
        vk[] vkVarArr = (vk[]) ffdo.J(new vk[]{this.ba, this.be, this.bc, this.bd, dqfsVar}).toArray(new vk[0]);
        recyclerView.am(new sl(a2, (vk[]) Arrays.copyOf(vkVarArr, vkVarArr.length)));
        dtau dtauVar = (dtau) this.bg.a();
        recyclerView.getClass();
        if (!(recyclerView.E instanceof dtao)) {
            throw new IllegalArgumentException("Expected RecyclerView to have an ItemAnimator that implements SelectionItemAnimator, consider using NoChangeAnimationDefaultItemAnimator.");
        }
        ffqy.d(lks.a(dtauVar.a.Q()), null, null, new dtat(dtauVar, recyclerView, new ffix() { // from class: dtap
            @Override // defpackage.ffix
            public final Object invoke() {
                oco ocoVar = ((oji) vk.this).a;
                oko okoVar = (oko) ocoVar.f.get();
                if (okoVar == null) {
                    return ocoVar.g.b();
                }
                int a3 = okoVar.a() - 1;
                ArrayList arrayList = new ArrayList();
                if (a3 >= 0) {
                    int i = 0;
                    while (true) {
                        arrayList.add(okoVar.i(i));
                        if (i == a3) {
                            break;
                        }
                        i++;
                    }
                }
                return new off(okoVar.e(), okoVar.d(), arrayList);
            }
        }, dqfsVar, null), 3);
        ffqy.d(lks.a(Q()), null, null, new dqer(recyclerView, this, null), 3);
        bb();
        ffqy.d(lks.a(this), null, null, new dqev(this, dqfsVar, null), 3);
        dqfsVar.F(new ffji() { // from class: dqdv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                odk odkVar = (odk) obj;
                odkVar.getClass();
                final dqfc dqfcVar = dqfc.this;
                RecyclerView recyclerView4 = dqfcVar.b;
                if (recyclerView4 == null) {
                    ffkj.c("recyclerView");
                    recyclerView4 = null;
                }
                vk vkVar = recyclerView4.n;
                vkVar.getClass();
                ofx ofxVar = odkVar.a;
                if (ofxVar instanceof ofw) {
                    if (vkVar.a() == 0) {
                        ((enrr) dqfc.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 607, "CameraGalleryScreen.kt")).q("No media or camera found, showing error screen");
                        dqfcVar.bh(R.string.no_media_description, Integer.valueOf(R.string.no_media_caption), R.string.no_media_button, dqfcVar.by().b("CameraGalleryScreen.NoMediaSystemPickerButton#onClick", new View.OnClickListener() { // from class: dqdp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                dqfc.this.bf();
                            }
                        }));
                    } else {
                        ((enrr) dqfc.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 618, "CameraGalleryScreen.kt")).q("Media or camera found, hiding error and showing media");
                        dqfcVar.bb();
                    }
                } else if (ofxVar instanceof ofu) {
                    ((enrr) ((enrr) dqfc.a.i()).g(((ofu) ofxVar).a).h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 623, "CameraGalleryScreen.kt")).q("Load state switched to error");
                } else {
                    ((enrr) dqfc.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 624, "CameraGalleryScreen.kt")).t("Load state updated to: %s", ofxVar);
                }
                return ffcu.a;
            }
        });
        Handler handler = new Handler(Looper.getMainLooper());
        dpge a3 = f().a();
        RecyclerView recyclerView4 = this.b;
        if (recyclerView4 == null) {
            ffkj.c("recyclerView");
            recyclerView4 = null;
        }
        this.ah = new dpgc(handler, a3, dqfsVar, recyclerView4);
        ContentResolver contentResolver = this.ag;
        if (contentResolver == null) {
            ffkj.c("contentResolver");
            contentResolver = null;
        }
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        dpgc dpgcVar2 = this.ah;
        if (dpgcVar2 == null) {
            ffkj.c("galleryMediaObserver");
            dpgcVar2 = null;
        }
        contentResolver.registerContentObserver(uri, true, dpgcVar2);
        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        dpgc dpgcVar3 = this.ah;
        if (dpgcVar3 == null) {
            ffkj.c("galleryMediaObserver");
        } else {
            dpgcVar = dpgcVar3;
        }
        contentResolver.registerContentObserver(uri2, true, dpgcVar);
        this.aY = true;
        bQ();
    }

    @Override // defpackage.dtaa
    public final void bd() {
        dqfm dqfmVar = this.bc;
        if (dqfmVar != null) {
            ffqy.d(dqfmVar.a, null, null, new dqfk(dqfmVar, null), 3);
            if (dqfmVar.e.d) {
                dqfmVar.d.P().d(dqfmVar);
            }
        }
    }

    @Override // defpackage.dtaa
    public final void be() {
        dqfm dqfmVar = this.bc;
        if (dqfmVar != null) {
            dpnn dpnnVar = dqfmVar.f;
            if (dpnnVar != null) {
                dqfmVar.m(dpnnVar);
            }
            if (dqfmVar.e.d) {
                dqfmVar.d.P().c(dqfmVar);
            }
        }
    }

    public final void bf() {
        p().a();
    }

    public final void bg(boolean z) {
        dqcp a2 = a();
        if (a2 != null) {
            dqfz dqfzVar = this.be;
            a2.a(z, dqfzVar != null ? dqfzVar.m() : false);
        }
        if (z && ((dqdf) bA()).g) {
            bN().b(true);
        }
    }

    public final void bh(int i, Integer num, int i2, View.OnClickListener onClickListener) {
        dszy.c(bl(), null, Integer.valueOf(i), num, Integer.valueOf(i2), onClickListener, 1);
        RecyclerView recyclerView = this.b;
        View view = null;
        if (recyclerView == null) {
            ffkj.c("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view2 = this.c;
        if (view2 == null) {
            ffkj.c("fabsContainer");
        } else {
            view = view2;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bi() {
        /*
            r7 = this;
            boolean r0 = r7.aj
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L19
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.e
            if (r0 != 0) goto L11
            java.lang.String r0 = "systemGalleryPickerFab"
            defpackage.ffkj.c(r0)
            r0 = r1
        L11:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r3
        L1a:
            boolean r4 = r7.ak
            if (r4 != 0) goto L30
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r7.d
            if (r4 != 0) goto L28
            java.lang.String r4 = "cameraFab"
            defpackage.ffkj.c(r4)
            r4 = r1
        L28:
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L30
            r4 = r2
            goto L31
        L30:
            r4 = r3
        L31:
            if (r0 != 0) goto L38
            if (r4 == 0) goto L36
            goto L38
        L36:
            r0 = r3
            goto L39
        L38:
            r0 = r2
        L39:
            android.view.View r4 = r7.c
            java.lang.String r5 = "fabsContainer"
            if (r4 != 0) goto L43
            defpackage.ffkj.c(r5)
            r4 = r1
        L43:
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = r2
        L4c:
            if (r4 != r0) goto L4f
            return
        L4f:
            android.view.View r4 = r7.N()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            ffbz r6 = r7.aF
            java.lang.Object r6 = r6.a()
            android.transition.Slide r6 = (android.transition.Slide) r6
            android.transition.TransitionManager.beginDelayedTransition(r4, r6)
            android.view.View r4 = r7.c
            if (r4 != 0) goto L68
            defpackage.ffkj.c(r5)
            goto L69
        L68:
            r1 = r4
        L69:
            if (r2 == r0) goto L6d
            r3 = 8
        L6d:
            r1.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqfc.bi():void");
    }

    public final dqef e() {
        return q().c(ffdx.g(dqlf.i, dqlf.j)) ? dqef.c : q().d(dqlf.h) ? dqef.b : dqef.a;
    }

    public final dqfg f() {
        return (dqfg) this.aZ.a();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        dpnj dpnjVar = ((dqdf) bA()).e;
        if (dpnjVar != null) {
            dpnjVar.c.b(new dqew(this));
        }
        dqgj p = p();
        Activity activity = this.au;
        if (activity == null) {
            ffkj.c("activity");
            activity = null;
        }
        dqgj.c(p, activity, ((dqdf) bA()).d, new adf() { // from class: dqdj
            @Override // defpackage.adf
            public final void a(Object obj) {
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    ((enrr) dqfc.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onCreate$lambda$13", 227, "CameraGalleryScreen.kt")).q("No gallery media was selected");
                } else {
                    dqfc dqfcVar = dqfc.this;
                    ffqy.d(dqfcVar.bF(), null, null, new dqex(dqfcVar, list, null), 3);
                }
            }
        });
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        if (this.aY) {
            ContentResolver contentResolver = this.ag;
            dpgc dpgcVar = null;
            if (contentResolver == null) {
                ffkj.c("contentResolver");
                contentResolver = null;
            }
            dpgc dpgcVar2 = this.ah;
            if (dpgcVar2 == null) {
                ffkj.c("galleryMediaObserver");
            } else {
                dpgcVar = dpgcVar2;
            }
            contentResolver.unregisterContentObserver(dpgcVar);
            this.aY = false;
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        dpnj dpnjVar = ((dqdf) bA()).e;
    }

    public final dqgj p() {
        dqgj dqgjVar = this.at;
        if (dqgjVar != null) {
            return dqgjVar;
        }
        ffkj.c("systemContentPickerLauncher");
        return null;
    }

    public final dqli q() {
        dqli dqliVar = this.ao;
        if (dqliVar != null) {
            return dqliVar;
        }
        ffkj.c("permissionsManager");
        return null;
    }

    public final drpd r() {
        drpd drpdVar = this.ax;
        if (drpdVar != null) {
            return drpdVar;
        }
        ffkj.c("localMediaResolver");
        return null;
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.camera_gallery_recycler_view)) == null) {
            return null;
        }
        return dsyh.a(recyclerView);
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.aD;
    }
}
