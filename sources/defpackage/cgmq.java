package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgmq implements erqj {
    final /* synthetic */ cgmr a;

    public cgmq(cgmr cgmrVar) {
        this.a = cgmrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgmr.a.p("Scheduled MDD periodic tasks.");
        final cgmr cgmrVar = this.a;
        try {
            dwpt dwptVar = (dwpt) eyfy.parseFrom(dwpt.a, (byte[]) ctjd.U.e());
            csjb a = cgmr.a.a();
            a.I("Found MDD download config with");
            a.G(dwptVar.b.size());
            a.I("files.");
            a.r();
            for (final dwpj dwpjVar : dwptVar.b) {
                dwub dwubVar = (dwub) cgmrVar.b.b();
                dwob dwobVar = new dwob();
                dwobVar.c(dwpjVar);
                axnw.h(elfl.g(dwubVar.a(dwobVar.a())).h(new emwl() { // from class: cgmm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        dwpj dwpjVar2 = dwpj.this;
                        if (!booleanValue) {
                            csjb e = cgmr.a.e();
                            e.I("Problem adding group");
                            e.A("group name", dwpjVar2.c);
                            e.r();
                            return null;
                        }
                        csjb a2 = cgmr.a.a();
                        a2.I("Successfully added group:");
                        a2.A("group", dwpjVar2.c);
                        a2.y(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, dwpjVar2.e);
                        a2.r();
                        return null;
                    }
                }, cgmrVar.d).e(IOException.class, new emwl() { // from class: cgmn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        csjb e = cgmr.a.e();
                        e.I("IOException adding group");
                        e.A("group", dwpj.this.c);
                        e.s((IOException) obj2);
                        return null;
                    }
                }, cgmrVar.d).f(Throwable.class, new eroh() { // from class: cgmo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        csjb b = cgmr.a.b();
                        b.I("Error adding group");
                        b.A("group name", dwpjVar.c);
                        b.r();
                        return ((cfyt) cgmr.this.e.b()).b((Throwable) obj2);
                    }
                }, cgmrVar.d));
            }
            ((cgns) cgmrVar.c.b()).c(4, 2, "", 0L);
        } catch (eygu unused) {
            cgmr.a.r("Could not parse MDD download config. Data downloads will not happen for groups specified through mdd_download_config flag.");
            ((cgns) cgmrVar.c.b()).b(4, 3);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        csjb b = cgmr.a.b();
        b.I("Failed to schedule MDD periodic tasks");
        b.s(th);
    }
}
