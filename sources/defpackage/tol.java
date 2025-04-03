package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tol implements cfzm {
    public final errl a;
    public final asju b;
    public final asjv c;
    public final axmm d;
    public final ashq e;
    public final asiu f;
    public final ffbr g;
    private final axkm h;
    private final cenb i;
    private final cenq j;
    private final errl k;

    public tol(axkm axkmVar, errl errlVar, errl errlVar2, cenb cenbVar, cenq cenqVar, asju asjuVar, asjv asjvVar, ashq ashqVar, asiu asiuVar, axmm axmmVar, ffbr ffbrVar) {
        this.h = axkmVar;
        this.a = errlVar;
        this.k = errlVar2;
        this.i = cenbVar;
        this.j = cenqVar;
        this.c = asjvVar;
        this.b = asjuVar;
        this.e = ashqVar;
        this.f = asiuVar;
        this.d = axmmVar;
        this.g = ffbrVar;
    }

    public final elfl a(boolean z) {
        elfl c;
        final StringWriter stringWriter = new StringWriter();
        if (z) {
            cenh cenhVar = (cenh) this.i;
            c = axol.c(cenhVar.f, ffhe.a, ffsm.a, new cene(cenhVar, new PrintWriter(stringWriter), null));
        } else {
            cenv cenvVar = (cenv) this.j;
            c = axol.c(cenvVar.e, ffhe.a, ffsm.a, new cent(cenvVar, new PrintWriter(stringWriter), null));
        }
        return c.h(new emwl() { // from class: toe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return stringWriter.toString();
            }
        }, this.a);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.h(new erog() { // from class: tof
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(csgj.l);
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    emyl emylVar = (emyl) arrayList2.get(i);
                    Object e = ((cfup) emylVar.get()).e();
                    sb.append(String.format("%c%s: %s\n", Character.valueOf(true != Objects.equals(e, ((cfup) emylVar.get()).f()) ? '*' : ' '), ((cfup) emylVar.get()).j(), e));
                }
                final tol tolVar = tol.this;
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "CmsPhenotype"));
                elfl e2 = elfo.e(arrayList);
                if (tolVar.b.a()) {
                    e2 = e2.i(new eroh() { // from class: toj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            tol tolVar2 = tol.this;
                            final List list = (List) obj;
                            return tolVar2.a(true).h(new emwl() { // from class: tog
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    String str = (String) obj2;
                                    boolean isEmpty = str.isEmpty();
                                    List list2 = list;
                                    if (!isEmpty) {
                                        list2.add(new FileTeleporter(str.getBytes(), "CmsBackupTimingStats"));
                                    }
                                    return list2;
                                }
                            }, tolVar2.a);
                        }
                    }, tolVar.a);
                }
                return tolVar.c.a() ? e2.i(new eroh() { // from class: tok
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        tol tolVar2 = tol.this;
                        final List list = (List) obj;
                        return tolVar2.a(false).h(new emwl() { // from class: toi
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                String str = (String) obj2;
                                boolean isEmpty = str.isEmpty();
                                List list2 = list;
                                if (!isEmpty) {
                                    list2.add(new FileTeleporter(str.getBytes(), "CmsRestoreTimingStats"));
                                }
                                return list2;
                            }
                        }, tolVar2.a);
                    }
                }, tolVar.a) : e2;
            }
        }, this.k);
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return this.h.k().h(new emwl() { // from class: toc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                tol tolVar = tol.this;
                axez axezVar = (axez) obj;
                String b = tolVar.d.b(axezVar);
                enhd enhdVar = new enhd();
                axeu b2 = axeu.b(axezVar.l);
                if (b2 == null) {
                    b2 = axeu.UNSPECIFIED_STATUS;
                }
                enhdVar.k("CmsMultiDeviceFeatureEnableStatus", b2.name());
                enhdVar.k("CmsIsMultiDeviceEnabled", String.valueOf(axezVar.e));
                enhdVar.k("CmsIsBnrEnabled", String.valueOf(axezVar.q));
                enhdVar.k("CmsInitialSyncStatus", b);
                if (((ersq) ((aric) tolVar.e).a.b()).a("bugle.enable_add_cms_session_id_in_psd")) {
                    enhdVar.k("cms_session_id", axezVar.j);
                }
                if (((ersq) ((arkb) tolVar.f).a.b()).a("bugle.log_five_previous_session_ids_in_psd")) {
                    eygr eygrVar = axezVar.L;
                    StringBuilder sb = new StringBuilder();
                    Iterator<E> it = eygrVar.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) ",");
                        }
                    }
                    enhdVar.k("cms_previous_session_ids", sb.toString());
                }
                return enhdVar.c();
            }
        }, this.a).i(new eroh() { // from class: tod
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c;
                tol tolVar = tol.this;
                final enhk enhkVar = (enhk) obj;
                cqiy cqiyVar = (cqiy) tolVar.g.b();
                c = axol.c(cqiyVar.f, ffhe.a, ffsm.a, new cqio(cqiyVar, null));
                return c.h(new emwl() { // from class: tob
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enhd enhdVar = new enhd();
                        enhdVar.g(enhk.this);
                        enhdVar.k("CmsTelephonyForwardSyncIsPaused", String.valueOf((Boolean) obj2));
                        return enhdVar.c();
                    }
                }, tolVar.a);
            }
        }, this.a).h(new emwl() { // from class: toh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cfzj.a((Map) obj);
            }
        }, this.a);
    }
}
