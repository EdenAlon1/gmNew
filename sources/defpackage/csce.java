package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csce implements csbz {
    public static final cskc a = cskc.g("BugleCms", "CmsParticipantFactoryImpl");
    public final etah b;
    private final cryl d;
    private final ffbr f;
    public boolean c = false;
    private final Supplier e = new cscc(this);

    public csce(etah etahVar, cryl crylVar, ffbr ffbrVar) {
        this.b = etahVar;
        this.d = crylVar;
        this.f = ffbrVar;
    }

    private final eska d(esij esijVar) {
        try {
            return (eska) this.d.a(esijVar, eska.a);
        } catch (cryh e) {
            csjb e2 = a.e();
            e2.I("Participant MetaData decryption succeeded. Original exception is logged below.");
            e2.A("cms_id", this.b.c);
            e2.s(e);
            this.c = true;
            return (eska) e.a;
        }
    }

    @Override // defpackage.csbz
    public final btnb a() {
        eska d = d(((cscc) this.e).get());
        String[] strArr = btob.a;
        btne btneVar = new btne();
        btneVar.b(d.p);
        return btneVar.a();
    }

    @Override // defpackage.csbz
    public final ParticipantsTable.BindData b() {
        esij esijVar = ((cscc) this.e).get();
        String[] strArr = ParticipantsTable.a;
        bvpp bvppVar = new bvpp();
        eska d = d(esijVar);
        if (TextUtils.isEmpty(d.c)) {
            aolr aolrVar = (aolr) this.f.b();
            etam etamVar = this.b.d;
            if (etamVar == null) {
                etamVar = etam.a;
            }
            eszs eszsVar = etamVar.c;
            if (eszsVar == null) {
                eszsVar = eszs.a;
            }
            aoku k = ((aolr) this.f.b()).k(aolrVar.c(eszsVar.b, new emyl() { // from class: cscb
                @Override // defpackage.emyl
                public final Object get() {
                    return Optional.empty();
                }
            }));
            cfva cfvaVar = aoqm.a;
            bvppVar.I(k.m(((Boolean) new aoqd().get()).booleanValue()));
        } else {
            bvppVar.I(d.c);
        }
        String str = d.d;
        if (!TextUtils.isEmpty(str)) {
            bvppVar.R(str);
        }
        String str2 = d.e;
        if (!TextUtils.isEmpty(str2)) {
            bvppVar.q(str2);
        }
        String str3 = d.f;
        if (!TextUtils.isEmpty(str3)) {
            bvppVar.t(str3);
        }
        String str4 = d.g;
        if (!TextUtils.isEmpty(str4)) {
            bvppVar.u(str4);
        }
        bvppVar.T(true != d.j ? -2 : -1);
        bvppVar.e(d.l);
        int i = d.m;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        bvppVar.J(i2 + (-2) != 2 ? 0 : 1);
        bvppVar.f(this.b.c);
        bvppVar.y(d.n);
        bvppVar.z(d.o);
        bvppVar.L(d.h);
        bvppVar.M(d.i.I());
        bvppVar.g(csgg.RESTORED_FROM_CMS);
        return bvppVar.a();
    }

    @Override // defpackage.csbz
    public final boolean c() {
        return this.c;
    }
}
