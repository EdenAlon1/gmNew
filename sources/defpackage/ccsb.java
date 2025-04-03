package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsb {
    private static final cskc a = cskc.g("BugleCms", "CmsRestoreMsisdnResolver");
    private final colj b;
    private final aolr c;

    public ccsb(colj coljVar, aolr aolrVar) {
        coljVar.getClass();
        aolrVar.getClass();
        this.b = coljVar;
        this.c = aolrVar;
    }

    private final String b() {
        String r;
        bvvn e = ParticipantsTable.e();
        e.z("getMsisdnFromParticipants");
        e.h(new Function() { // from class: ccsa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.getClass();
                bvvwVar.w(-1);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = e.b().o();
        try {
            bvti bvtiVar = (bvti) o;
            String o2 = (!bvtiVar.moveToFirst() || (r = bvtiVar.r()) == null) ? null : ((aoks) this.c.u(r, -1)).o();
            ffig.a(o, null);
            return o2;
        } finally {
        }
    }

    public final String a(bseh bsehVar, String str) {
        String str2;
        bsehVar.getClass();
        if (csgj.a() && ((Boolean) ((cfup) csfu.e.get()).e()).booleanValue() && !TextUtils.isEmpty(bsehVar.ae())) {
            return bsehVar.ae();
        }
        if (!this.b.h().isConnected()) {
            return b();
        }
        try {
            str2 = this.b.h().getMsisdn();
        } catch (ehxg e) {
            csjb e2 = a.e();
            e2.A("Conversation cms id", str);
            e2.I("Can not get msisdn from RCS service");
            e2.s(e);
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        a.r("Failed to get Rcs Msisdn from RcsProfileService");
        return b();
    }
}
