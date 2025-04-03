package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdjq implements cdiw {
    public static final cskc a = cskc.g("BugleCms", "SyncCmsKeyStep");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/keysync/SyncCmsKeyStep");
    static final cfup c = cfvl.e(cfvl.b, "cms_sync_cms_key_step_max_retry", 22);
    public final ccjf d;
    public final errl e;
    public final errl f;
    private final axkm g;
    private final crty h;

    public cdjq(Map map, ccjc ccjcVar, axkm axkmVar, crty crtyVar, errl errlVar, errl errlVar2) {
        this.g = axkmVar;
        this.h = crtyVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.d = (ccjf) Map.EL.getOrDefault(map, 7, ccjcVar);
    }

    public final elfl a(final bqvj bqvjVar, int i, final int i2) {
        elfl a2;
        boolean isEmpty = TextUtils.isEmpty(bqvjVar.o());
        Boolean valueOf = Boolean.valueOf(isEmpty);
        if (csgj.a()) {
            cskc cskcVar = a;
            cskcVar.m("isCmsBackupAndRestoreEnabled flag on");
            if (i != 2) {
                csjb c2 = cskcVar.c();
                c2.y("keyType", i);
                c2.A("cmsIdEmpty", valueOf);
                Objects.toString(valueOf);
                c2.I("Should process key: ".concat(valueOf.toString()));
                c2.r();
                a2 = elfo.e(valueOf);
            } else {
                valueOf.getClass();
                if (isEmpty) {
                    cskcVar.p("Should process key: true, for BACKUP_KEY with empty CMS ID.");
                    a2 = elfo.e(true);
                } else {
                    final String o = bqvjVar.o();
                    o.getClass();
                    axkm axkmVar = this.g;
                    crty crtyVar = this.h;
                    final elfl h = axkmVar.h();
                    final elfl q = crtyVar.q(o);
                    a2 = elfo.m(h, q).a(new Callable() { // from class: cdjg
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cskc cskcVar2 = cdjq.a;
                            axes axesVar = (axes) erqt.q(elfl.this);
                            eszz eszzVar = (eszz) erqt.q(q);
                            boolean z = true;
                            if ((!axesVar.equals(axes.ENCRYPTION_STATUS_ENCRYPTED) || !eszzVar.h.contains("backup_key")) && (axesVar.equals(axes.ENCRYPTION_STATUS_ENCRYPTED) || !eszzVar.h.contains("encrypted_backup_key"))) {
                                z = false;
                            }
                            String str = o;
                            csjb c3 = cdjq.a.c();
                            c3.A("CmsId", str);
                            c3.A("localEncryptionStatus", axesVar.name());
                            c3.A("cmsKeyObjectLabels", eszzVar.h);
                            c3.B("shouldProcessKey", z);
                            c3.I("Checking if the BACKUP_KEY with cms ID should be updated.");
                            c3.r();
                            return Boolean.valueOf(z);
                        }
                    }, this.f);
                }
            }
        } else {
            csjb c3 = a.c();
            c3.y("keyType", i);
            c3.A("cmsIdEmpty", valueOf);
            Objects.toString(valueOf);
            c3.I("Should process key: ".concat(valueOf.toString()));
            c3.r();
            a2 = elfo.e(valueOf);
        }
        return a2.i(new eroh() { // from class: cdji
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(true);
                }
                int i3 = i2;
                bqvj bqvjVar2 = bqvjVar;
                cdjq cdjqVar = cdjq.this;
                return cdjqVar.d.d("workItemId", String.valueOf(bqvjVar2.k()), i3);
            }
        }, this.e);
    }
}
